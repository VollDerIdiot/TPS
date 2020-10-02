package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import tps.hilfen.Regeln;
import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Datei;
import tps.kompiler.objekte.programm.Datentyp;
import tps.kompiler.objekte.programm.UnfertigeMethode;
import tps.kompiler.objekte.programm.Variable;
import tps.kompiler.objekte.programm.sache.Ding;
import tps.kompiler.objekte.programm.sache.DingPlan;
import tps.kompiler.objekte.programm.sache.FertigeSacheInterface;
import tps.kompiler.objekte.programm.sache.Klasse;
import tps.kompiler.objekte.programm.sache.KlassenPlan;
import tps.kompiler.objekte.programm.sache.PlanInterface;
import tps.kompiler.objekte.programm.sache.UnfertigeKlasse;
import tps.kompiler.objekte.programm.sache.UnfertigeSacheInterface;
import tps.kompiler.objekte.programm.sache.UnfertigesDing;
import tps.objects.fehler.NochNichtGemachtFehler;

public class TpstSourceLader extends TpsSourceLader {
	
	private static final Set <String> BESETZTE_NAMEN;
	
	
	
	static {
		Set <String> besetzteNamen;
		besetzteNamen = new TreeSet <String>();
		besetzteNamen.add("Ansonsten");
		besetzteNamen.add("Datei");
		besetzteNamen.add("Diese");
		besetzteNamen.add("Dieser");
		besetzteNamen.add("Ding");
		besetzteNamen.add("DingPlan");
		besetzteNamen.add("Es");
		besetzteNamen.add("Hier");
		besetzteNamen.add("Klasse");
		besetzteNamen.add("KlassenPlan");
		besetzteNamen.add("Mache");
		besetzteNamen.add("Methode");
		besetzteNamen.add("Rufe");
		besetzteNamen.add("Setzte");
		besetzteNamen.add("Wiederhohle");
		besetzteNamen.add("alleine");
		besetzteNamen.add("auf");
		besetzteNamen.add("aus");
		besetzteNamen.add("bessert");
		besetzteNamen.add("das");
		besetzteNamen.add("datei");
		besetzteNamen.add("die");
		besetzteNamen.add("eigen");
		besetzteNamen.add("ein");
		besetzteNamen.add("erbe");
		besetzteNamen.add("erfüllt");
		besetzteNamen.add("erhält");
		besetzteNamen.add("es");
		besetzteNamen.add("folgende");
		besetzteNamen.add("gibt");
		besetzteNamen.add("heißt");
		besetzteNamen.add("ich");
		besetzteNamen.add("ist");
		besetzteNamen.add("kommt");
		besetzteNamen.add("konstant");
		besetzteNamen.add("liegt");
		besetzteNamen.add("mache");
		besetzteNamen.add("macht");
		besetzteNamen.add("mit");
		besetzteNamen.add("nichts");
		besetzteNamen.add("offen");
		besetzteNamen.add("solange");
		besetzteNamen.add("super");
		besetzteNamen.add("tolle");
		besetzteNamen.add("und");
		besetzteNamen.add("unfertige");
		besetzteNamen.add("vererbe");
		besetzteNamen.add("von");
		besetzteNamen.add("wenn");
		BESETZTE_NAMEN = Collections.unmodifiableSet(besetzteNamen);
	}
	
	public static void main(String[] args) {
		for (String string : BESETZTE_NAMEN) {
			System.out.println(string);
		}
	}
	
	public TpstSourceLader() {
		super();
	}
	
	
	
	@Override
	public Set <String> besetzteNamen() {
		return BESETZTE_NAMEN;
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
		while (true) {
			ladeSache();
			datei.neueSache(sache);
		}
	}
	
	private void ladeSache() throws KompilierungsFehler {
		ladeSachenKopf();
		if (sache instanceof DingPlan || sache instanceof KlassenPlan) {
			ladePlan();
		} else if (sache instanceof UnfertigesDing || sache instanceof UnfertigeKlasse) {
			ladeUnfertigeSache();
		} else if (sache instanceof Ding || sache instanceof Klasse) {
			ladeFertigeSache();
		} else {
			throw new KompilierungsFehler("Diese Sachenart ist mir unbekannt: '" + sache.getClass().getName() + "'!");
		}
	}
	
	private void ladePlan() throws KompilierungsFehler {
		if ( ! (sache instanceof PlanInterface)) {
			throw new KompilierungsFehler("Ich kann so nicht arbeiten!");
		}
		ladeUnfertigeMethoden();
	}
	
	private void ladeUnfertigeSache() throws KompilierungsFehler {
		if ( ! (sache instanceof UnfertigeSacheInterface)) {
			throw new KompilierungsFehler("Ich kann so nicht arbeiten!");
		}
		ladeSachenVariablen();
		ladeAnfangsMethoden();
		ladeFertigeMethoden();
		ladeUnfertigeMethoden();
	}
	
	private void ladeFertigeSache() throws KompilierungsFehler {
		if ( ! (sache instanceof FertigeSacheInterface)) {
			throw new KompilierungsFehler("Ich kann so nicht arbeiten!");
		}
		ladeSachenVariablen();
		ladeAnfangsMethoden();
		ladeFertigeMethoden();
	}
	
	private void ladeUnfertigeMethoden() throws KompilierungsFehler {
		if ( ! (sache instanceof PlanInterface || sache instanceof UnfertigeSacheInterface)) {
			throw new KompilierungsFehler("So kann ich nicht arbeiten!");
		}
		String zwischen;
		String varName;
		Datentyp varDat;
		boolean stopp = false;
		int anfangsTabsulatoren;
		Sichtbarkeit sicht = null;
		Datentyp name;
		Datentyp methodenErgebnis;
		List <Variable> parameter;
		while (true) {
			zwischen = sourceLeser.nächstes();
			anfangsTabsulatoren = sourceLeser.anfangsTabsulatoren();
			switch (zwischen) {
			case "Diese":
				zwischen = sourceLeser.nächstes();
				switch (zwischen) {
				case "unfertige":
					if (anfangsTabsulatoren != 1) {
						throw new FalscheSourcenFehler("Jede Methode muss genau einen AnfangsTabulator besitzen!");
					}
					teste("Methode", "ist");
					switch (zwischen) {
					case "offen":
						sicht = Sichtbarkeit.offen;
					case "vererbe":
						sicht = sicht != null ? sicht : Sichtbarkeit.erben;
					case "datei":
						sicht = sicht != null ? sicht : Sichtbarkeit.datei;
					case "eigen":
						sicht = sicht != null ? sicht : Sichtbarkeit.eigen;
						teste("und", "heißt");
						name = leseDatentyp();
						parameter = Collections.emptyList();
						break;
					
					case "offen,":
						sicht = Sichtbarkeit.offen;
					case "vererbe,":
						sicht = sicht != null ? sicht : Sichtbarkeit.erben;
					case "datei,":
						sicht = sicht != null ? sicht : Sichtbarkeit.datei;
					case "eigen,":
						sicht = sicht != null ? sicht : Sichtbarkeit.eigen;
						teste("heißt");
						name = leseDatentyp();
						teste("und", "erhält");
						parameter = new ArrayList <Variable>();
						varName = Regeln.testeName(sourceLeser.nächstes(), new FalscheSourcenFehler("Dies ist kein gültiger Übergabeparameter-Name"), BESETZTE_NAMEN);
						teste("ist", "ein");
						varDat = leseDatentyp();
						parameter.add(new Variable(varName, varDat));
						while ( !stopp) {
							zwischen = sourceLeser.nächstes();
							switch (zwischen) {
							case "+":
								varName = Regeln.testeName(sourceLeser.nächstes(), new FalscheSourcenFehler("Dies ist kein gültiger Übergabeparameter-Name"), BESETZTE_NAMEN);
								teste("ist", "ein");
								varDat = leseDatentyp();
								parameter.add(new Variable(varName, varDat));
								break;
							case "und":
								varName = Regeln.testeName(sourceLeser.nächstes(), new FalscheSourcenFehler("Dies ist kein gültiger Übergabeparameter-Name"), BESETZTE_NAMEN);
								teste("ist", "ein");
								varDat = leseDatentyp();
								parameter.add(new Variable(varName, varDat));
								stopp = true;
								break;
							default:
								throw new FalscheSourcenFehler("+' oder 'und", zwischen);
							}
						}
						break;
					default:
						throw new FalscheSourcenFehler("offen', 'vererbe', 'datei' oder 'eigen", zwischen);
					}
					teste("Hier", "gibt", "es");
					zwischen = sourceLeser.nächstes();
					switch (zwischen) {
					case "nichts":
						methodenErgebnis = null;
						break;
					default:
						methodenErgebnis = leseDatentyp();
						break;
					}
					teste("zurück!");
					if (sache instanceof PlanInterface) {
						if ( ! ((PlanInterface) sache).neueUnfertigeMethode(new UnfertigeMethode(name, parameter, methodenErgebnis))) {
							throw new FalscheSourcenFehler("Es darf keine zwei Methoden mit gleichem Namen und Übergabeparametern geben!");
						}
					} else if (sache instanceof UnfertigeSacheInterface) {
						if ( ! ((UnfertigeSacheInterface) sache).neueUnfertigeMethode(new UnfertigeMethode(name, parameter, methodenErgebnis))) {
							throw new FalscheSourcenFehler("Es darf keine zwei Methoden mit gleichem Namen und Übergabeparametern geben!");
						}
					}
					break;
				default:
					sourceLeser.zurück(2);
					return;
				}
				break;
			default:
				sourceLeser.zurück();
				return;
			}
		}
	}
	
	private void ladeSachenVariablen() {
		// TODO Auto-generated method stub
		
		
		
		throw new NochNichtGemachtFehler();
	}
	
	private void ladeFertigeMethoden() {
		// TODO Auto-generated method stub
		
		
		
		throw new NochNichtGemachtFehler();
	}
	
	private void ladeAnfangsMethoden() {
		// TODO Auto-generated method stub
		
		
		
		throw new NochNichtGemachtFehler();
	}
	
	private void ladeSachenKopf() throws KompilierungsFehler {
		String zwischen;
		Datentyp name;
		Sichtbarkeit sicht;
		boolean konstant = false;
		zwischen = sourceLeser.nächstes();
		teste("tolle");
		switch (zwischen) {
		case "Dieser":
			zwischen = sourceLeser.nächstes();
			if (zwischen.equals("konstante")) {
				konstant = true;
				zwischen = sourceLeser.nächstes();
			}
			teste("heißt");
			switch (zwischen) {
			case "DingPlan":
				name = leseDatentyp();
				teste("und", "ist");
				sicht = leseSichtbarkeit();
				sache = new DingPlan(name, sicht, konstant);
				return;
			case "KlassenPlan":
				name = leseDatentyp();
				teste("und", "ist");
				sicht = leseSichtbarkeit();
				sache = new KlassenPlan(name, sicht, konstant);
				return;
			default:
				throw new FalscheSourcenFehler("DinPlan' oder 'KlassenPlan", zwischen);
			}
		case "Dieses":
			zwischen = sourceLeser.nächstes();
			if (zwischen.equals("konstante")) {
				konstant = true;
				zwischen = sourceLeser.nächstes();
			}
			switch (zwischen) {
			case "unfertige":
				teste("Ding", "heißt");
				name = leseDatentyp();
				teste("und", "ist");
				sicht = leseSichtbarkeit();
				sache = new UnfertigesDing(name, sicht, konstant);
				return;
			case "Ding":
				teste("heißt");
				name = leseDatentyp();
				teste("und", "ist");
				sicht = leseSichtbarkeit();
				sache = new Ding(name, sicht, konstant);
				return;
			default:
				throw new FalscheSourcenFehler("unfertige' pder 'Ding", zwischen);
			}
		case "Diese":
			zwischen = sourceLeser.nächstes();
			if (zwischen.equals("konstante")) {
				konstant = true;
				zwischen = sourceLeser.nächstes();
			}
			switch (zwischen) {
			case "unfertige":
				teste("Klasse", "heißt");
				name = leseDatentyp();
				teste("und", "ist");
				sicht = leseSichtbarkeit();
				sache = new UnfertigeKlasse(name, sicht, konstant);
				return;
			case "Klasse":
				teste("Klasse", "heißt");
				name = leseDatentyp();
				teste("und", "ist");
				sicht = leseSichtbarkeit();
				sache = new Klasse(name, sicht, konstant);
				return;
			default:
				throw new FalscheSourcenFehler("unfertige' oder 'Klasse", zwischen);
			}
		default:
			throw new FalscheSourcenFehler("Dieser', 'Dieses' oder 'Diese", zwischen);
		}
	}
	
	@Override
	protected Datentyp leseDatentyp() throws KompilierungsFehler {
		String name;
		String zwischen;
		List <Datentyp> zusatz;
		name = Regeln.testeName(sourceLeser.nächstes(), new FalscheSourcenFehler("Dies ist kein gültiger Name!"), BESETZTE_NAMEN);
		zwischen = sourceLeser.nächstes();
		switch (zwischen) {
		case "von":
			zusatz = new ArrayList <>();
			zusatz.add(leseDatentyp());
			while (true) {
				zwischen = sourceLeser.nächstes();
				switch (zwischen) {
				case "+":
					zusatz.add(leseDatentyp());
					break;
				case "und":
					zusatz.add(leseDatentyp());
					return new Datentyp(name, zusatz);
				default:
					throw new FalscheSourcenFehler("+' oder 'und", zwischen);
				}
			}
		default:
			sourceLeser.zurück();
			return new Datentyp(name, Collections.emptyList());
		}
	}
	
	@Override
	protected Sichtbarkeit leseSichtbarkeit() throws FalscheSourcenFehler {
		String zwischen;
		zwischen = sourceLeser.nächstes();
		switch (zwischen) {
		case "offen":
			return Sichtbarkeit.offen;
		case "vererbe":
			return Sichtbarkeit.erben;
		case "datei":
			return Sichtbarkeit.datei;
		case "eigen":
			return Sichtbarkeit.eigen;
		default:
			throw new FalscheSourcenFehler("offen', 'vererbe', 'datei' oder 'eigen", zwischen);
		}
	}
	
}
