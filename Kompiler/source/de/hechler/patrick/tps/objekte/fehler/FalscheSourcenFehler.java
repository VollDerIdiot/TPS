package de.hechler.patrick.tps.objekte.fehler;


public class FalscheSourcenFehler extends Exception {
	
	private static final long serialVersionUID = -7732422878728177745L;
	
	
	public FalscheSourcenFehler() {
		super("Da war wohl etwas Falsch!");
	}
	
	public FalscheSourcenFehler(String nachricht) {
		super(nachricht);
	}
	
}
