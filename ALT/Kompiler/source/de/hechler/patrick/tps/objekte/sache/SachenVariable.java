package de.hechler.patrick.tps.objekte.sache;

import de.hechler.patrick.tps.konstanten.Sichtbarkeit;
import de.hechler.patrick.tps.objekte.Variable;

public class SachenVariable extends Variable {
	
	public final Sichtbarkeit sicht;
	public final boolean konstant;
	
	public SachenVariable(Sichtbarkeit sicht, boolean konstante, String art, String name) {
		super(art, name);
		this.sicht = sicht == null ? Sichtbarkeit.eigen : sicht;
		this.konstant = konstante;
	}
	
}
