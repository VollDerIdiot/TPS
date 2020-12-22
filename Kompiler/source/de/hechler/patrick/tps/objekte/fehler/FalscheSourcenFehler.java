package de.hechler.patrick.tps.objekte.fehler;

import de.hechler.patrick.tps.objects.fehler.Fehler;

public class FalscheSourcenFehler extends Fehler {
	
	private static final long serialVersionUID = -7732422878728177745L;
	
	
	public FalscheSourcenFehler() {
		super("Da war wohl etwas Falsch!");
	}
	
	public FalscheSourcenFehler(String nachricht) {
		super(nachricht);
	}
	
}
