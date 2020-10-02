package tps.kompiler.objekte.programm.sache;

import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Datentyp;

public class UnfertigesDing extends Sache implements UnfertigeSacheInterface {
	
	public UnfertigesDing(Datentyp name, Sichtbarkeit sicht, boolean konstant) {
		super(name, sicht, konstant);
	}
	
	
	
	@Override
	public int compareTo(Sache mit) {
		if (mit instanceof Ding || mit instanceof DingPlan) {
			return 1;
		} else if (mit instanceof UnfertigesDing) {
			return super.compareTo(mit);
		} else {
			return -1;
		}
	}
	
}
