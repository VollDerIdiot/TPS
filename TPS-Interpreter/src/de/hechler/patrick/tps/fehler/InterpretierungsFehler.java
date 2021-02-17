package de.hechler.patrick.tps.fehler;


public class InterpretierungsFehler extends Exception {
	
	/** UID */
	private static final long serialVersionUID = -6912486692989833271L;
	
	public InterpretierungsFehler(String nachricht) {
		super(nachricht);
	}
	
}
