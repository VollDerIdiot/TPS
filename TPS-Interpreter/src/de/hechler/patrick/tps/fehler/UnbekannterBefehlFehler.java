package de.hechler.patrick.tps.fehler;

import de.hechler.patrick.tps.interpreter.hilfen.BefehlEnum;

public class UnbekannterBefehlFehler extends InterpretierungsFehler {
	
	/** UID */
	private static final long serialVersionUID = 779127634296114025L;
	
	public UnbekannterBefehlFehler(BefehlEnum bef) {
		super(bef + " ist kein bekannter befehl!");
	}
	
	public UnbekannterBefehlFehler(String nachricht) {
		super(nachricht);
	}
	
}
