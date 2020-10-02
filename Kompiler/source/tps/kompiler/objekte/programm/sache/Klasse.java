package tps.kompiler.objekte.programm.sache;

import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Datentyp;

public class Klasse extends Sache implements FertigeSacheInterface {
	
	public Klasse(Datentyp name, Sichtbarkeit sicht, boolean konstant) {
		super(name, sicht, konstant);
	}
	
	
	
	@Override
	public int compareTo(Sache mit) {
		if (mit instanceof Klasse) {
			return super.compareTo(mit);
		} else if (mit instanceof KlassenPlan || mit instanceof UnfertigeKlasse) {
			return -1;
		} else {
			return 1;
		}
	}
	
}
