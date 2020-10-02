package tps.kompiler.objekte.hilfen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tps.kompiler.objekte.fehler.KompilierungsLaufzeitFehler;

public class Leser {
	
	private static final int NÄCHSTES = 1;
	private static final int NÄCHSTE_ZEILE = 2;
	private static final int NEUE_ZEILE = 3;
	private Scanner scnner;
	private List <String> zeilen;
	private int index;
	private List <Integer> log;
	
	
	
	public Leser(Scanner scanner) {
		this.zeilen = new ArrayList <>();
		while (scanner.hasNextLine()) {
			this.zeilen.add(scanner.nextLine());
		}
		this.scnner = new Scanner(this.zeilen.get(0));
		this.log = new ArrayList <Integer>();
	}
	
	
	
	/**
	 * Geht einen Schritt zurück. Dies bedeutet, dass man genau den stand hat, den man vor dem letzten veränderndem Befehl hatte ({@link #nächstes()} oder {@link #nächsteZeile()}).
	 * 
	 * @throws IndexOutOfBoundsException,
	 *             wenn man sich bereits am Anfang der Datei befindet.
	 */
	public void zurück() throws IndexOutOfBoundsException {
		zurück(1);
	}
	
	/**
	 * Geht {@code anzahl} Schritte zurück. Dies bedeutet, dass man genau den stand hat, den man vor den {@code anzahl} letzten verändernden Befehlen hatte ({@link #nächstes()}
	 * oder {@link #nächsteZeile()}).
	 * 
	 * @throws IndexOutOfBoundsException,
	 *             wenn man sich bereits am Anfang der Datei befindet.
	 */
	public void zurück(int anzahl) throws IndexOutOfBoundsException {
		List <Integer> zwischen;
		if (log.size() == 0) {
			throw new IndexOutOfBoundsException("Ich bin schon am anfang, es geht nicht noch weiter zurück!");
		}
		synchronized (this) {
			for (; anzahl > 0; anzahl -- ) {
				log.remove(log.size() - 1);
			}
			zwischen = log;
			laufeNach(zwischen);
		}
	}
	
	
	
	/**
	 * Es wird alles zurückgesetzt, was den aktuellen status speichert ({@link #log}, {@link #index} und {@link #scnner}), bevor dem <code>nachlaufen</code> nachgelaufen wird. <br>
	 * Macht alles, was in der nachlaufen liste steht. <br>
	 * Danach wird der {@link #log} genauso sein, wie <code>nachlaufen</code> <br>
	 * 
	 * @param nachlaufen
	 *            Es wird nach dem <code>nachlaufen</code>-log alles gemacht. der {@link #log} wird entsprechend geändert.
	 */
	private void laufeNach(List <Integer> nachlaufen) {
		log = new ArrayList <Integer>();
		index = 0;
		scnner = new Scanner(zeilen.get(0));
		for (Integer aktion : nachlaufen) {
			switch (aktion) {
			case NÄCHSTES:
				nächstes();
				break;
			case NÄCHSTE_ZEILE:
				nächsteZeile();
				break;
			case NEUE_ZEILE:
				break;
			default:
				throw new KompilierungsLaufzeitFehler("Der log war falsch!");
			}
		}
		if ( !log.equals(nachlaufen)) {
			throw new KompilierungsLaufzeitFehler("Da ist etwas mit dem log falschgelaufen!");
		}
	}
	
	public boolean hatNächstes() {
		return hatNächstes(scnner, index + 1);
	}
	
	private boolean hatNächstes(Scanner scnner, int index) {
		if (scnner.hasNext()) {
			return true;
		} else {
			Scanner zwischen;
			if (zeilen.size() > index) {
				zwischen = new Scanner(zeilen.get(index));
				if (zwischen.hasNext()) {
					return true;
				} else {
					return hatNächstes(zwischen, index + 1);
				}
			} else {
				return false;
			}
		}
	}
	
	public String nächstes() {
		synchronized (this) {
			if (scnner.hasNext()) {
				log.add(NÄCHSTES);
				return scnner.next();
			} else {
				if (index + 1 >= zeilen.size()) {
					scnner = new Scanner(zeilen.get( ++ index));
					log.add(NEUE_ZEILE);
					return nächstes();
				} else {
					return null;
				}
			}
		}
	}
	
	public boolean hatNächsteZeile() {
		return index < (zeilen.size() - 1) || scnner.hasNextLine();
	}
	
	public String nächsteZeile() {
		synchronized (this) {
			if (scnner.hasNextLine()) {
				log.add(NÄCHSTE_ZEILE);
				return scnner.nextLine();
			} else {
				if (index + 1 >= zeilen.size()) {
					scnner = new Scanner(zeilen.get( ++ index));
					log.add(NEUE_ZEILE);
					return nächsteZeile();
				} else {
					return null;
				}
			}
		}
	}
	
	public int anfangsTabsulatoren() {
		synchronized (this) {
			int tabs;
			char[] zeile;
			zeile = zeilen.get(index).toCharArray();
			for (tabs = 0; tabs < zeile.length; tabs ++ ) {
				if ('\t' != zeile[tabs]) {
					break;
				}
			}
			return tabs;
		}
	}
	
	/**
	 * lässt den internen Scanner mit <code>skip(String)</code> überspringen. Allerdings wird damit maximal bis zum Zeilenende gesprungen.
	 * 
	 * @param überspringen
	 */
	public void überspringe(String überspringen) {
		scnner.skip(überspringen);
	}
	
}
