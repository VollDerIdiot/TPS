package tps.kompiler.objekte.programm.sache;

import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Datentyp;

public abstract class Sache {
	
	public final Datentyp name;
	public final Sichtbarkeit sicht;
	public final boolean konstant;
	
	
	public Sache(Datentyp name, Sichtbarkeit sicht, boolean konstant) {
		this.name = name;
		this.sicht = sicht;
		this.konstant = konstant;
	}
	
	
	
}
