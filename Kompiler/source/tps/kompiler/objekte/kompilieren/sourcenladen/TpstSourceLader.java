package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.fehler.NochNichtGemachtFehler;
import tps.kompiler.objekte.programm.Datei;

public class TpstSourceLader extends TpsSourceLader {
	
	public TpstSourceLader() {
		super();
	}
	
	@Override
	public String endung() {
		return "tpst";
	}
	
	@Override
	protected void lade(String name) throws KompilierungsFehler {
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
		case "benötigt:": {
			boolean stopp = false;
			braucht = new ArrayList <String>();
			braucht.add(lesePfad());
			while ( !stopp) {
				zwischen = sourceLeser.nächstes();
				switch (zwischen) {
				case "und":
					braucht.add(lesePfad());
					break;
				case "Dieser":
				case "Dieses":
				case "Diese":
					sourceLeser.zurück();
					stopp = true;
					break;
				default:
					throw new FalscheSourcenFehler("und', 'Dieser', 'Dieses' oder 'Diese", zwischen);
				}
			}
			break;
		}
		case "kommt":
			teste("alleine", "super", "zurecht!");
			braucht = Collections.emptyList();
			break;
		default:
			throw new FalscheSourcenFehler("benötigt:' oder 'kommt", zwischen);
		}
		datei = Datei.erschaffe(ort, name, braucht);
		 while (leseSache()) {
		}
	}

	private boolean leseSache() {
		leseSachenKopf();
		
		
		
		throw new NochNichtGemachtFehler();
	}

	private void leseSachenKopf() {
		
		
		
		
		
		
		throw new NochNichtGemachtFehler();
	}
	
}
