package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import tps.hilfen.Regeln;
import tps.kompiler.objekte.code.Datei;
import tps.kompiler.objekte.code.Datentyp;
import tps.kompiler.objekte.code.SacheVariable;
import tps.kompiler.objekte.code.Variable;
import tps.kompiler.objekte.code.sache.Ding;
import tps.kompiler.objekte.code.sache.Klasse;
import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.fehler.NochNichtGemachtFehler;
import tps.kompiler.objekte.konstanten.Implementierungstiefe;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;


public class TpstLader extends TpsSourceLader {
	
	public TpstLader(Charset zeichensatz) {
		super(zeichensatz);
	}
	
	public TpstLader() {
		super();
	}
	
	
	
	@Override
	protected void ladeImplementierung(String name) throws KompilierungsFehler {
		ladeKopf(name);
		while (sourceLeser.hatNächstes()) {
			ladeSache();
		}
	}
	
	private void ladeSache() throws KompilierungsFehler {
		ladeSachenKopf();
		if (sache.impl != Implementierungstiefe.plan) {
			ladeSachenVariablen();
			ladeStartMethoden();
			ladeSachenMethoden();
		} else {
			ladePlanMethoden();
		}
	}
	
	private void ladePlanMethoden() {
		// TODO Auto-generated method stub
		
		
		
		throw new NochNichtGemachtFehler();
	}
	
	private void ladeSachenMethoden() {
		// TODO Auto-generated method stub
		
		
		
		throw new NochNichtGemachtFehler();
	}
	
	private void ladeStartMethoden() throws KompilierungsFehler {
		if (sache.impl == Implementierungstiefe.plan) {
			return;
		}
		if (sache instanceof Ding) {
			Sichtbarkeit sicht;
			String zwischen;
			teste("Dieses", "erschaffe", "ist");
			sicht = Sichtbarkeit.erhalteVomNamen(sourceLeser.nächstes());
			teste("und", "braucht");
			zwischen = sourceLeser.nächstes();
			switch (zwischen) {
			case "keine":
				teste("Parameter!");
				// TODO machen
				
				
				
				break;
			case "folgende":
				teste("Parameter:");
				// TODO machen
				
				
				
				break;
			default:
				throw new FalscheSourcenFehler("ist' oder 'braucht", zwischen);
			}
			
			
		} else if (sache instanceof Klasse) {
			// TODO machen
			
			
			
		} else {
			throw new KompilierungsFehler("Die Sachenart '" + sache.getClass().getName() + "' ist unbekannt!");
		}
		throw new NochNichtGemachtFehler();
	}
	
	private void ladeSachenVariablen() throws KompilierungsFehler {
		String zwischen;
		teste("Diese", "Sache", "hat");
		zwischen = sourceLeser.nächstes();
		switch (zwischen) {
		case "keine":
			teste("Variablen!");
			return;
		case "folgende": {
			// - [Sichtbarkeit] [Datentyp] als [Name] ( - [Sichtbarkeit] [Datentyp] als [Name])*
			Sichtbarkeit sicht;
			teste("Variablen:", "-");
			sicht = Sichtbarkeit.erhalteVomNamen(sourceLeser.nächstes());
			sache.neueVariable(new SacheVariable(sicht, leseVariable()));
			while (true) {
				if ("-".equals(sourceLeser.nächstes())) {
					sache.neueVariable(new SacheVariable(sicht, leseVariable()));
				} else {
					sourceLeser.zurück();
					break;
				}
			}
			return;
		}
		default:
			throw new FalscheSourcenFehler("keine' oder 'folgende", zwischen);
		}
	}
	
	/**
	 * liest eine Variable ein, die folgendermaßen aufgebaut is: <br>
	 * [Datentyp] als [Name]
	 * 
	 * @return die eingelesene Variable
	 * @throws FalscheSourcenFehler
	 *             wenn der name ung�ltig ist.
	 */
	private Variable leseVariable() throws FalscheSourcenFehler {
		Datentyp datentyp;
		String name;
		datentyp = leseDatentyp();
		teste("als");
		name = sourceLeser.nächstes();
		Regeln.testeName(name, new FalscheSourcenFehler("'" + name + "' ist kein Akzeptabler name!"));
		return new Variable(name, datentyp);
	}
	
	private void ladeSachenKopf() throws KompilierungsFehler {
		String zwischen;
		int art;
		Datentyp name;
		Sichtbarkeit sicht;
		Datentyp bessert = null;
		List <Datentyp> macht;
		name = leseDatentyp();
		teste("ist");
		zwischen = sourceLeser.nächstes();
		sicht = Sichtbarkeit.erhalteVomNamen(sourceLeser.nächstes());
		switch (zwischen) {
		case "ein":
			zwischen = sourceLeser.nächstes();
			switch (zwischen) {
			case "Ding":
				art = 0;
				break;
			case "unfertiges":
				teste("Ding");
				art = 1;
				break;
			case "Dingplan":
				art = 2;
				break;
			case "Klassenplan":
				art = 5;
				break;
			default:
				throw new FalscheSourcenFehler("Ding', 'Dingplan', ('unfertiges' und dann 'Ding') oder 'Klassenplan", zwischen);
			}
			break;
		case "eine":
			switch (zwischen) {
			case "Klasse":
				art = 3;
				break;
			case "unfertige":
				teste("Klasse");
				art = 4;
				break;
			default:
				throw new FalscheSourcenFehler("Klasse' oder 'unfertige", zwischen);
			}
			break;
		default:
			throw new FalscheSourcenFehler("ein' oder 'eine", zwischen);
		}
		macht = new ArrayList <Datentyp>();
		if ("und".equals(sourceLeser.nächstes())) {
			zwischen = sourceLeser.nächstes();
			switch (zwischen) {
			case "bessert":
				bessert = leseDatentyp();
				if ( !"und".equals(sourceLeser.nächstes())) {
					sourceLeser.zurück();
					break;
				}
			case "macht":
				macht.add(leseDatentyp());
				while (true) {
					zwischen = sourceLeser.nächstes();
					if ("und".equals(zwischen)) {
						macht.add(leseDatentyp());
					} else {
						sourceLeser.zurück();
						break;
					}
				}
				break;
			}
		} else {
			sourceLeser.zurück();
		}
		switch (art) {
		case 0:
			macht.add(Datentyp.DING_STANDARD);
			sache = new Ding(name, Implementierungstiefe.fertig, sicht, bessert, macht);
			return;
		case 1:
			macht.add(Datentyp.DING_STANDARD);
			sache = new Ding(name, Implementierungstiefe.unfertig, sicht, bessert, macht);
			return;
		case 2:
			macht.add(Datentyp.DING_STANDARD);
			sache = new Ding(name, Implementierungstiefe.plan, sicht, bessert, macht);
			return;
		case 3:
			macht.add(Datentyp.KLASSE_STANDARD);
			sache = new Klasse(name, Implementierungstiefe.fertig, sicht, bessert, macht);
			return;
		case 4:
			macht.add(Datentyp.KLASSE_STANDARD);
			sache = new Klasse(name, Implementierungstiefe.unfertig, sicht, bessert, macht);
			return;
		case 5:
			macht.add(Datentyp.KLASSE_STANDARD);
			sache = new Klasse(name, Implementierungstiefe.plan, sicht, bessert, macht);
			return;
		default:
			throw new KompilierungsFehler("Diese art ist mir nicht bekannt! (" + art + ")");
		}
	}
	
	private Datentyp leseDatentyp() throws FalscheSourcenFehler {
		String name;
		List <Datentyp> zusatz;
		name = sourceLeser.nächstes();
		if ("[".equals(sourceLeser.nächstes())) {
			zusatz = new ArrayList <Datentyp>();
			while (true) {
				String zwischen;
				zwischen = sourceLeser.nächstes();
				switch (zwischen) {
				case "+":
					zusatz.add(leseDatentyp());
					break;
				case "]":
					return new Datentyp(name, zusatz);
				default:
					throw new FalscheSourcenFehler("habe '+' oder ']' erwartet und '" + zwischen + "' erhalten!");
				}
			}
		} else {
			sourceLeser.zurück();
			return new Datentyp(name);
		}
		
	}
	
	private void ladeKopf(String name) throws FalscheSourcenFehler {
		String ort;
		String zwischen;
		teste("Diese", "tolle", "Datei", "liegt", "in:");
		ort = lesePfad();
		teste("und", "braucht");
		zwischen = sourceLeser.nächstes();
		switch (zwischen) {
		case "die": {
			List <String> braucht;
			braucht = new ArrayList <String>();
			teste("folgenden", "Dateien:", "-");
			braucht.add(lesePfad());
			while (true) {
				zwischen = sourceLeser.nächstes();
				switch (zwischen) {
				case "-":
					braucht.add(lesePfad());
					break;
				case "um":
					teste("um", "zu", "funktionieren.");
					bauen = Datei.erschaffe(ort, name, braucht);
					return;
				default:
					throw new FalscheSourcenFehler("Da war etwas FALSCH: " + zwischen);
				}
				
			}
		}
		case "keine":
			bauen = Datei.erschaffe(ort, name);
			return;
		default:
			throw new FalscheSourcenFehler("Da war etwas FALSCH: " + zwischen);
		}
		
		
	}
	
	@Override
	public String endung() {
		return "tpst";
	}
	
}
