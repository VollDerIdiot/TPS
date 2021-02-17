package de.hechler.patrick.tps.fehler;


public class KeinSatzendeFehler extends RuntimeException {

	private static final long serialVersionUID = 1337735065980405342L;
	
	
	public KeinSatzendeFehler() {
		super("kein Satzende!");
	}
	
}
