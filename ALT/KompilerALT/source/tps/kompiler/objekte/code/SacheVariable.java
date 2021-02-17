package tps.kompiler.objekte.code;

import tps.kompiler.objekte.konstanten.Sichtbarkeit;

public class SacheVariable extends Variable {
	
	private Sichtbarkeit sicht;
	
	public SacheVariable(Sichtbarkeit sicht, String name, Datentyp datentyp) {
		super(name, datentyp);
		this.sicht = sicht == null ? Sichtbarkeit.eigen : sicht;
	}
	
	public SacheVariable(Sichtbarkeit sicht, Variable variable) {
		super(variable.getName(), variable.getDatentyp());
		this.sicht = sicht == null ? Sichtbarkeit.eigen : sicht;
	}
	
	
	
	public Sichtbarkeit getSicht() {
		return sicht;
	}
	
}
