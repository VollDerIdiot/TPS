package tps.kompiler.objekte.programm.sache;

import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Datentyp;

public class UnfertigeKlasse extends Sache {
	
	public UnfertigeKlasse(Datentyp name, Sichtbarkeit sicht, boolean konstant) {
		super(name, sicht, konstant);
	}
	
	
	
	@Override
	public int compareTo(Sache mit) {
		if (mit instanceof UnfertigeKlasse) {
			return super.compareTo(mit);
		} else {
			return 1;
		}
	}
	
}
