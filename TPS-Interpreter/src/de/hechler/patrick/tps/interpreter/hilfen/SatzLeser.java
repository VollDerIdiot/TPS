package de.hechler.patrick.tps.interpreter.hilfen;

import java.io.Closeable;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

import de.hechler.patrick.tps.fehler.KeinSatzendeFehler;

public class SatzLeser implements Iterator <String>, Closeable {
	
	private Scanner scanner;
	private boolean satzende;
	
	public SatzLeser(Scanner src) {
		this.scanner = src;
	}
	
	
	
	public boolean satzende() {
		return satzende;
	}
	
	/**
	 * Setzt die variable {@link #satzende} zurück (<code>false</code>). <br>
	 * Wenn {@link #satzende} allerdings bereits vorher <code>false</code> war wird ein {@link KeinSatzendeFehler} geworfen. 
	 * @throws KeinSatzendeFehler wenn {@link #satzende} bereits vor dem Methodenaufruf auf <code>false</code> ist.
	 */
	public void erwarteSatztende() throws KeinSatzendeFehler {
		if (satzende) {
			satzende = false;
		} else {
			throw new KeinSatzendeFehler();
		}
	}
	
	@Override
	public boolean hasNext() {
		if (satzende) return false;
		else return scanner.hasNext();
	}
	
	
	@Override
	public String next() {
		if (satzende) throw new NoSuchElementException();
		String erg = scanner.next();
		if (erg.endsWith(".")) {
			satzende = true;
			erg = erg.substring(0, erg.length() - 1);
		}
		return erg;
	}
	
	@Override
	public void close() throws IOException {
		scanner.close();
		scanner = null;
	}
	
}
