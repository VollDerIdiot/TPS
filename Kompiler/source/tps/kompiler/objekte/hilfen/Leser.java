package tps.kompiler.objekte.hilfen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tps.kompiler.objekte.fehler.KompilierungsLaufzeitFehler;

public class Leser {
	
	private static final int N�CHSTES = 1;
	private static final int N�CHSTE_ZEILE = 2;
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
	 * Geht einen Schritt zur�ck. Dies bedeutet, dass man genau den stand hat, den man vor dem letzten ver�nderndem Befehl hatte ({@link #n�chstes()} oder {@link #n�chsteZeile()}).
	 * 
	 * @throws KompilierungsLaufzeitFehler
	 *             wenn etwas mit dem log falsch war (Dies kann eigentlich nicht passieren!)
	 * @throws IndexOutOfBoundsException,
	 *             wenn man sich bereits am Anfang der Datei befindet.
	 */
	public void zur�ck() throws IndexOutOfBoundsException, KompilierungsLaufzeitFehler {
		List <Integer> zwischen;
		if (log.size() == 0) {
			throw new IndexOutOfBoundsException("Ich bin schon am anfang, es geht nicht noch weiter zur�ck!");
		}
		synchronized (this) {
			log.remove(log.size() - 1);
			zwischen = new ArrayList <Integer>(log);
			log = new ArrayList <Integer>();
			index = 0;
			scnner = new Scanner(zeilen.get(0));
			for (Integer aktion : zwischen) {
				switch (aktion) {
				case N�CHSTES:
					n�chstes();
					break;
				case N�CHSTE_ZEILE:
					n�chsteZeile();
					break;
				case NEUE_ZEILE:
					break;
				default:
					throw new KompilierungsLaufzeitFehler("Der log war falsch!");
				}
			}
			if ( !log.equals(zwischen)) {
				throw new KompilierungsLaufzeitFehler("Da ist etwas mit dem log falschgelaufen!");
			}
		}
	}
	
	public boolean hatN�chstes() {
		return hatN�chstes(scnner, index + 1);
	}
	
	private boolean hatN�chstes(Scanner scnner, int index) {
		if (scnner.hasNext()) {
			return true;
		} else {
			Scanner zwischen;
			if (zeilen.size() > index) {
				zwischen = new Scanner(zeilen.get(index));
				if (zwischen.hasNext()) {
					return true;
				} else {
					return hatN�chstes(zwischen, index + 1);
				}
			} else {
				return false;
			}
		}
	}
	
	
	
	public String n�chstes() {
		synchronized (this) {
			if (scnner.hasNext()) {
				log.add(N�CHSTES);
				return scnner.next();
			} else {
				scnner = new Scanner(zeilen.get( ++ index));
				log.add(NEUE_ZEILE);
				return n�chstes();
			}
		}
	}
	
	public boolean hatN�chsteZeile() {
		return index < (zeilen.size() - 1) || scnner.hasNextLine();
	}
	
	public String n�chsteZeile() {
		synchronized (this) {
			if (scnner.hasNextLine()) {
				log.add(N�CHSTE_ZEILE);
				return scnner.nextLine();
			} else {
				scnner = new Scanner(zeilen.get( ++ index));
				log.add(NEUE_ZEILE);
				return n�chsteZeile();
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
	
}
