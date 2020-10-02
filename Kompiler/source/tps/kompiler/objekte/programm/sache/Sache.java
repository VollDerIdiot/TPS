package tps.kompiler.objekte.programm.sache;

import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Datentyp;

public abstract class Sache {
	
	public final Datentyp name;
	public final Sichtbarkeit sicht;
	
	
	
	public Sache(Datentyp name, Sichtbarkeit sicht) {
		this.name = name;
		this.sicht = sicht;
	}
	
	
	
}
