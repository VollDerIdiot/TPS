package de.hechler.patrick.tps.fehler;


public class NegativerRegisterIndexFehler extends FalscheRegisterZahlFehler {
	
	/** UID */
	private static final long serialVersionUID = -2371126859890292639L;
	
	public NegativerRegisterIndexFehler(int index) {
		super("negativer register index: " + index);
	}
	
	public NegativerRegisterIndexFehler(String nachricht) {
		super(nachricht);
	}
	
}
