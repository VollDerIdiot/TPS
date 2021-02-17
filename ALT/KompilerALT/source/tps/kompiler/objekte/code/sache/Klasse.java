package tps.kompiler.objekte.code.sache;

import java.util.Collection;

import tps.kompiler.objekte.code.Datentyp;
import tps.kompiler.objekte.konstanten.Implementierungstiefe;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;

public class Klasse extends Sache {
	
	public Klasse(Datentyp name, Implementierungstiefe impl, Sichtbarkeit sichtbarkeit, Datentyp bessert, Collection <Datentyp> macht) {
		super(name, impl, sichtbarkeit, bessert, macht);
	}
	
}
