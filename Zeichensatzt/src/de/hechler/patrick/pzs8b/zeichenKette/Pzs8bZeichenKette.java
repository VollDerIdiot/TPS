package de.hechler.patrick.pzs8b.zeichenKette;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import de.hechler.patrick.patischerZeichensatzt.zeichen.ZeichenInterface;
import de.hechler.patrick.patischerZeichensatzt.zeichenKette.UnfertigeZeichenKette;
import de.hechler.patrick.pzs8b.zeichen.Pzs8bZeichen;

public class Pzs8bZeichenKette extends UnfertigeZeichenKette {
	
	private final Pzs8bZeichen[] pzs8bZeichen;
	
	public Pzs8bZeichenKette(InputStream leser) throws Exception {
		List <Pzs8bZeichen> zeichen;
		zeichen = new ArrayList <Pzs8bZeichen>();
		while (true) {
			int speichern = leser.read();
			if (speichern == -1) {
				break;
			}
			zeichen.add(new Pzs8bZeichen(speichern));
		}
		pzs8bZeichen = zeichen.toArray(new Pzs8bZeichen[zeichen.size()]);
	}
	
	public Pzs8bZeichenKette(char[] zeichen) {
		this.pzs8bZeichen = new Pzs8bZeichen[zeichen.length];
		int runde;
		for (runde = 0; runde < zeichen.length; runde ++ ) {
			this.pzs8bZeichen[runde] = new Pzs8bZeichen(zeichen[runde]);
		}
	}
	
	public Pzs8bZeichenKette(String zeichen) {
		this.pzs8bZeichen = new Pzs8bZeichen[zeichen.length()];
		int runde;
		for (runde = 0; runde < this.pzs8bZeichen.length; runde ++ ) {
			this.pzs8bZeichen[runde] = new Pzs8bZeichen(zeichen.charAt(runde));
		}
	}
	
	public Pzs8bZeichenKette(int[] zeichenNummern) {
		this.pzs8bZeichen = new Pzs8bZeichen[zeichenNummern.length];
		int runde;
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			this.pzs8bZeichen[runde] = new Pzs8bZeichen(zeichenNummern[runde]);
		}
	}
	
	public Pzs8bZeichenKette(byte[] zeichenNummern) {
		this.pzs8bZeichen = new Pzs8bZeichen[zeichenNummern.length];
		int runde;
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			this.pzs8bZeichen[runde] = new Pzs8bZeichen(zeichenNummern[runde]);
		}
	}
	
	public Pzs8bZeichenKette(Pzs8bZeichen[] zeichen) {
		Objects.requireNonNull(zeichen, "Ich kann nicht meine zeichen in null speihern!");
		this.pzs8bZeichen = zeichen.clone();
	}
	
	private Pzs8bZeichenKette(Pzs8bZeichen[] zeichen, Void nichts) {
		this.pzs8bZeichen = zeichen;
	}
	
	
	
	@Override
	public Pzs8bZeichen getZeichen(int index) {
		return pzs8bZeichen[index];
	}
	
	@Override
	public int größe() {
		return pzs8bZeichen.length;
	}
	
	@Override
	public byte[] getBytes() {
		byte[] rückgabe = new byte[pzs8bZeichen.length];
		int runde;
		for (runde = 0; runde < rückgabe.length; runde ++ ) {
			rückgabe[runde] = (byte) getNummer(runde);
		}
		return rückgabe;
	}
	
	@Override
	public Pzs8bZeichen[] getZeichen() {
		return pzs8bZeichen.clone();
	}
	
	@Override
	public boolean contains(ZeichenInterface prüfen) {
		if (prüfen instanceof Pzs8bZeichen) {
			for (Pzs8bZeichen prüfer : pzs8bZeichen) {
				if (prüfer.equals(prüfen)) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public boolean contains(char prüfen) {
		for (Pzs8bZeichen prüfer : pzs8bZeichen) {
			if (prüfen == prüfer.getZeichen()) {
				return true;
			}
		}
		return false;
	}
	
	public boolean contains(int prüfNummer) {
		int runde;
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			if (prüfNummer == getNummer(runde)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int getIndex(ZeichenInterface prüfen) {
		int runde;
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			if (prüfen.equals(pzs8bZeichen[runde])) {
				return runde;
			}
		}
		return -1;
	}
	
	
	@Override
	public int getIndex(char prüfen) {
		int runde;
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			if (prüfen == pzs8bZeichen[runde].getZeichen()) {
				return runde;
			}
		}
		return -1;
	}
	
	public int getIndex(byte[] prüfNummer) {
		int runde;
		int prüfen = ((int) prüfNummer[0]) & 0xFF;
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			if (prüfen == getNummer(runde)) {
				return runde;
			}
		}
		return -1;
	}
	
	@Override
	public int getLetztenIndex(ZeichenInterface prüfen) {
		int runde;
		for (runde = pzs8bZeichen.length - 1; runde > 0; runde -- ) {
			if (prüfen.equals(pzs8bZeichen[runde])) {
				return runde;
			}
		}
		return -1;
	}
	
	@Override
	public int getLetztenIndex(char prüfen) {
		int runde;
		for (runde = pzs8bZeichen.length - 1; runde > 0; runde -- ) {
			if (prüfen == pzs8bZeichen[runde].getZeichen()) {
				return runde;
			}
		}
		return -1;
	}
	
	public int getLetztenIndex(int prüfNummer) {
		int runde;
		for (runde = pzs8bZeichen.length - 1; runde > 0; runde -- ) {
			if (prüfNummer == getNummer(runde)) {
				return runde;
			}
		}
		return -1;
	}
	
	private int[] getIntArray(List <Integer> umwandeln) {
		Object[] zwischen = umwandeln.toArray();
		int[] rückgabe = new int[zwischen.length];
		int runde;
		
		for (runde = 0; runde < zwischen.length; runde ++ ) {
			rückgabe[runde] = (Integer) zwischen[runde];
		}
		return rückgabe;
	}
	
	@Override
	public int[] getAlleIndexe(ZeichenInterface prüfen) {
		ArrayList <Integer> indexe = new ArrayList <Integer>();
		int runde;
		
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			if (prüfen.equals(pzs8bZeichen[runde])) {
				indexe.add(runde);
			}
		}
		
		return getIntArray(indexe);
	}
	
	@Override
	public int[] getAlleIndexe(char prüfen) {
		ArrayList <Integer> indexe = new ArrayList <Integer>();
		int runde;
		
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			if (prüfen == pzs8bZeichen[runde].getZeichen()) {
				indexe.add(runde);
			}
		}
		
		return getIntArray(indexe);
	}
	
	public int[] getAlleIndexe(int prüfNummer) {
		ArrayList <Integer> indexe = new ArrayList <Integer>();
		int runde;
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			if (prüfNummer == getNummer(runde)) {
				indexe.add(runde);
			}
		}
		return getIntArray(indexe);
	}
	
	@Override
	public void speichere(OutputStream schreiber) throws IOException {
		for (Pzs8bZeichen schreiben : pzs8bZeichen) {
			schreiber.write(schreiben.getNummer());
		}
		schreiber.close();
	}
	
	@Override
	public Pzs8bZeichenKette zuGroßbuchstaben() {
		Pzs8bZeichen[] ergebnis;
		int runde;
		ergebnis = pzs8bZeichen.clone();
		for (runde = 0; runde < ergebnis.length; runde ++ ) {
			ergebnis[runde] = pzs8bZeichen[runde].zuGroßbuchstaben();
		}
		return new Pzs8bZeichenKette(ergebnis, null);
	}
	
	@Override
	public Pzs8bZeichenKette zuKleinbuchstaben() {
		Pzs8bZeichen[] ergebnis;
		int runde;
		ergebnis = pzs8bZeichen.clone();
		for (runde = 0; runde < ergebnis.length; runde ++ ) {
			ergebnis[runde] = pzs8bZeichen[runde].clone().zuKleinbuchstaben();
		}
		return new Pzs8bZeichenKette(ergebnis, null);
	}
	
	@Override
	public Pzs8bZeichenKette unterKette(int beginn, int ende) {
		Pzs8bZeichen[] ergebnis;
		ergebnis = Arrays.copyOfRange(pzs8bZeichen, beginn, ende);
		return new Pzs8bZeichenKette(ergebnis, null);
	}
	
	@Override
	public Pzs8bZeichenKette clone() {
		return new Pzs8bZeichenKette(pzs8bZeichen.clone(), null);
	}
	
	
	private int getNummer(int index) {
		return ((int) pzs8bZeichen[index].getNummer()[0]) & 0xFF;
	}
	
}