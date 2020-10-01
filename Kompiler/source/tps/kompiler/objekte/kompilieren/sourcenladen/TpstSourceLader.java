package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.util.List;

import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.fehler.NochNichtGemachtFehler;

public class TpstSourceLader extends TpsSourceLader {
	
	public TpstSourceLader() {
		super();
	}
	
	@Override
	public String endung() {
		return "tpst";
	}
	
	@Override
	protected void lade() throws KompilierungsFehler {
		String zwischen;
		String ort;
		List <String> braucht;
		teste("Diese", "tolle", "Datei", "liegt");
		zwischen = sourceLeser.nächstes();
		switch (zwischen) {
		case "in:":
			ort = lesePfad();
			break;
		default:
			throw new FalscheSourcenFehler("in:", zwischen);
		}
		teste("Diese", "tolle", "Datei");
		zwischen = sourceLeser.nächstes();
		switch (zwischen) {
		case "braucht":
			
			break;
		case "kommt":
			teste("alleine", "super", "zurecht!");
			break;
		default:
			break;
		}
		
		throw new NochNichtGemachtFehler();
	}
	
}
