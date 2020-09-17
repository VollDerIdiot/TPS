package tps.kompiler.objekte.code.sache;

import tps.kompiler.objekte.code.Datentyp;
import tps.kompiler.objekte.konstanten.Implementierungstiefe;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;

public class Ding extends Sache {
	
	public Ding(Datentyp name, Implementierungstiefe impl, Sichtbarkeit sichtbarkeit) {
		super(name, impl, sichtbarkeit);
	}
	
}
