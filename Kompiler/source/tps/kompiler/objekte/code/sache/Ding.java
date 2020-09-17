package tps.kompiler.objekte.code.sache;

import java.util.Collection;
import java.util.List;

import tps.kompiler.objekte.code.Datentyp;
import tps.kompiler.objekte.konstanten.Implementierungstiefe;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;

public class Ding extends Sache {
	
	public Ding(Datentyp name, Implementierungstiefe impl, Sichtbarkeit sichtbarkeit, Datentyp bessert, Collection<Datentyp> macht) {
		super(name, impl, sichtbarkeit, bessert, macht);
	}
	
}
