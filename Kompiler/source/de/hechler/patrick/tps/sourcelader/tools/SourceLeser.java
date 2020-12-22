package de.hechler.patrick.tps.sourcelader.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import de.hechler.patrick.tps.hilfen.Stapel;

public class SourceLeser {
	
	/**
	 * Der {@link Charset} in dem die Datei geschrieben wurde
	 */
	private final Charset charset;
	/**
	 * Speichert wichtige Daten für die {@link #zurück()} Operationen
	 */
	private Stapel <Element> log;
	/**
	 * Liest die Datei ein
	 */
	private RandomAccessFile input;
	/**
	 * Speichert den aktuellen Stand des Lesers ({@link #input})
	 * 
	 * @see RandomAccessFile#getFilePointer()
	 */
	private long index;
	
	
	/**
	 * Erstellt einen neuen {@link SourceLeser} mit für die übergebene {@link File} {@code datei} mit dem {@link Charset} {@code charset}
	 * 
	 * @param charset
	 *            Der {@link Charset} der Datei
	 * @param datei
	 *            Die zu lesende Datei
	 * @throws FileNotFoundException
	 *             Falls die {@link File} {@code datei} auf keine existierende Datei verweist
	 */
	public SourceLeser(Charset charset, File datei) throws FileNotFoundException {
		this.charset = charset;
		this.log = new Stapel <>(new Element[0]);
		this.input = new RandomAccessFile(datei, "r");
	}
	
	
	
	/**
	 * Geht {@code anzahl} Schritte zurück
	 * 
	 * @param anzahl
	 *            Die Anzahl an Schritten die zurück gegangen werden soll.
	 * @throws IOException
	 *             falls {@link #input} während dieser Operation einen Fehler wirft
	 * @throws IllegalArgumentException
	 *             falls {@code anzahl} größer ist als {@link Stapel#anzahl()} von {@link #log}
	 */
	public void zurück(int anzahl) throws IOException, IllegalArgumentException {
		if (anzahl > log.anzahl()) {
			throw new IllegalArgumentException("Soll zurück: " + anzahl + " bei " + log.anzahl() + " gegangenen Schritten!");
		}
		for (; anzahl > 0; anzahl -- ) {
			Element weg = log.runter();
			index = weg.startIndex;
		}
		input.seek(index);
	}
	
	/**
	 * Geht einen Schritt zurück
	 * 
	 * @param anzahl
	 *            Die Anzahl an Schritten die zurück gegangen werden soll.
	 * @throws IOException
	 *             falls {@link #input} während dieser Operation einen Fehler wirft
	 * @throws IllegalArgumentException
	 *             falls {@code anzahl} größer ist als {@link Stapel#anzahl()} von {@link #log}
	 */
	public void zurück() throws IOException, IllegalArgumentException {
		if (log.istLeer()) {
			throw new IllegalArgumentException("Soll zurück bin aber noch keinen Schritt gegangenen!");
		}
		Element weg = log.runter();
		index = weg.startIndex;
		input.seek(index);
	}
	
	/**
	 * prüft, ob es eine Nächste Zeile gibt.
	 * 
	 * @return <code>true</code>, wenn es eine Nächste Zeile gibt.
	 * @throws IOException
	 */
	public boolean hatNächsteZeile() throws IOException {
		long i = index;
		try {
			nächsteZeile();
		} catch (NoSuchElementException e) {
			return false;
		}
		input.seek(i);
		return true;
	}
	
	/**
	 * prüft, ob es ein Nächstes gibt.
	 * 
	 * @return <code>true</code>, wenn es ein Nächstes gibt.
	 * @throws IOException
	 */
	public boolean hatNächstes() throws IOException {
		long i = index;
		try {
			nächstes();
		} catch (NoSuchElementException e) {
			return false;
		}
		input.seek(i);
		return true;
	}
	
	/**
	 * Liest den nächsten Abschnitt ein und gibt ebendiesen zurück
	 * 
	 * @return den nächsten abschnitt
	 * @throws IOException
	 * @throws NoSuchElementException
	 *             Falls es keinen weiteren Abschnitt gibt
	 */
	public String nächstes() throws IOException, NoSuchElementException {
		byte[] bytes = new byte[64];
		int index = -1;
		int i;
		int anz = input.read(bytes);
		if (anz == 0) {
			throw new NoSuchElementException();
		}
		List <char[]> alle = new ArrayList <>();
		char[] chars = new String(bytes, 0, anz, charset).toCharArray();
		alle.add(chars);
		for (i = 0; i < chars.length; i ++ ) {
			if (chars[i] > ' ') {
				break;
			}
		}
		for (; i < chars.length; i ++ ) {
			if (chars[i] <= ' ') {
				index = i;
				if (i != chars.length - 1) {
					alle.remove(0);
					alle.add(Arrays.copyOf(chars, i + 1));
				}
				break;
			}
		}
		while (index == -1 && anz != 0) {
			anz = input.read(bytes);
			char[] neue = new String(bytes, 0, anz, charset).toCharArray();
			alle.add(neue);
			for (i = 0; i < neue.length; i ++ ) {
				if (neue[i] <= ' ') {
					index = i;
					if (i != chars.length - 1) {
						alle.remove(alle.size() - 1);
						alle.add(Arrays.copyOf(chars, i + 1));
					}
					break;
				}
			}
		}
		StringBuilder bau = new StringBuilder();
		alle.forEach(add -> bau.append(add));
		String erg = bau.toString();
		Element neu = new Element(erg, this.index);
		log.drauf(neu);
		input.seek(neu.bis());
		this.index = neu.bis();
		return erg.trim();
	}
	
	/**
	 * Liest die nächste Zeile ein und gibt ebendiese zurück
	 * 
	 * @return die nächste Zeile
	 * @throws IOException
	 * @throws NoSuchElementException
	 *             Falls es keine weitere Zeile gibt
	 */
	public String nächsteZeile() throws IOException, NoSuchElementException {
		byte[] bytes = new byte[64];
		int index = -1;
		int i;
		int anz = input.read(bytes);
		if (anz == 0) {
			throw new NoSuchElementException();
		}
		List <char[]> alle = new ArrayList <>();
		char[] chars = new String(bytes, 0, anz, charset).toCharArray();
		alle.add(chars);
		for (i = 0; i < chars.length; i ++ ) {
			if (chars[i] != '\r' && chars[i] != '\n') {
				break;
			}
		}
		for (; i < chars.length; i ++ ) {
			if (chars[i] == '\r' || chars[i] == '\n') {
				index = i;
				if (i != chars.length - 1) {
					alle.remove(0);
					alle.add(Arrays.copyOf(chars, i + 1));
				}
				break;
			}
		}
		while (index == -1 && anz != 0) {
			anz = input.read(bytes);
			chars = new String(bytes, 0, anz, charset).toCharArray();
			alle.add(chars);
			for (i = 0; i < chars.length; i ++ ) {
				if (chars[i] == '\r' || chars[i] == '\n') {
					index = i;
					if (i != chars.length - 1) {
						alle.remove(alle.size() - 1);
						alle.add(Arrays.copyOf(chars, i + 1));
					}
					break;
				}
			}
		}
		StringBuilder bau = new StringBuilder();
		alle.forEach(add -> bau.append(add));
		String erg = bau.toString();
		Element neu = new Element(erg, this.index);
		log.drauf(neu);
		input.seek(neu.bis());
		return erg.trim();
	}
	
	/**
	 * Speicherklasse für die {@link SourceLeser#zurück()} und {@link SourceLeser#zurück(int)} Funktionen
	 */
	private class Element {
		
		/**
		 * Speichert den index von wo aus dieses {@link Element} startet
		 */
		private long startIndex;
		/**
		 * Speichert die anzahl an bytes die dieses {@link Element} belegt
		 */
		private int anz;
		
		
		/**
		 * Erzeugt ein neues {@link Element} mit dem {@link #startIndex} von {@code start} und einer Größe {@link #anz} von {@code wert} in bytes mit dem {@link Charset}
		 * {@link SourceLeser#charset}
		 * 
		 * @param wert
		 *            das was in dem {@link Element} steht
		 * @param start
		 *            Der Startpunkt des {@link Element}s
		 */
		private Element(String wert, long start) {
			this.startIndex = start;
			this.anz = wert.getBytes(charset).length;
		}
		
		
		
		/**
		 * Gibt den Endpunkt dieses {@link Element}s zurück.
		 * 
		 * @return Der Endpunkt des {@link Element}s
		 */
		private long bis() {
			return startIndex + anz;
		}
		
	}

	public void neustart() throws IOException {
		input.seek(0l);
		index = 0l;
		log.leeren();
	}
	
}
