package tps.kompiler.objekte.code.sache;

import tps.kompiler.objekte.konstanten.Implementierungstiefe;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;

public class Klasse extends Sache {
	
	public Klasse(String name, Implementierungstiefe impl, Sichtbarkeit sichtbarkeit) {
		super(name, impl, sichtbarkeit);
	}
	
}
