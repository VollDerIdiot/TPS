package de.hechler.patrick.tps.fehler;


public class NegativeZahlFehler extends FalscheRegisterZahlFehler {
	
	/** UID */
	private static final long serialVersionUID = -2371126859890292639L;
	
	public NegativeZahlFehler(int index) {
		super("negativer register index: " + index);
	}
	
	public NegativeZahlFehler(String nachricht) {
		super(nachricht);
	}
	
}
