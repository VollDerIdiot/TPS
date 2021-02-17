package tps.kompiler.objekte.code;

import tps.kompiler.objekte.fehler.NochNichtGemachtFehler;
import tps.kompiler.objekte.hilfen.Leser;

public class Befehl {
	
	private Art art;
	private Zusatz zusatz;
	
	
	public Befehl erschaffe(Leser leser) {
		// TODO machen
		
		
		
		throw new NochNichtGemachtFehler();
	}
	
	
	
	private enum Art {
		
		stirb, verschwinde, geheAusXBoxen, setzeAuf, schleife, erbe, ich, istNichts, istVon,
		
		MethodenaufrufOhneParameter, MethodenaufrufMitParameter, werfe, fange, versuche
	
	}
	
	private class Zusatz {
		
		private int zahl;
		
		
		private Zusatz() {
			zahl = -1;
		}
		
		private Zusatz(int zusatz) {
			zahl = zusatz;
		}
		
	}
	
}
