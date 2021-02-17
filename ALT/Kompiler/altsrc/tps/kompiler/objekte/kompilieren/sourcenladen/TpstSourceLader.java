package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import de.hechler.patrick.tps.hilfen.Regeln;
import de.hechler.patrick.tps.objects.fehler.NochNichtGemachtFehler;
import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Befehl;
import tps.kompiler.objekte.programm.Datei;
import tps.kompiler.objekte.programm.Datentyp;
import tps.kompiler.objekte.programm.Erschaffe;
import tps.kompiler.objekte.programm.FertigeMethode;
import tps.kompiler.objekte.programm.UnfertigeMethode;
import tps.kompiler.objekte.programm.Variable;
import tps.kompiler.objekte.programm.Wert;
import tps.kompiler.objekte.programm.sache.Ding;
import tps.kompiler.objekte.programm.sache.DingPlan;
import tps.kompiler.objekte.programm.sache.FertigeSacheInterface;
import tps.kompiler.objekte.programm.sache.Klasse;
import tps.kompiler.objekte.programm.sache.KlassenPlan;
import tps.kompiler.objekte.programm.sache.PlanInterface;
import tps.kompiler.objekte.programm.sache.Sache;
import tps.kompiler.objekte.programm.sache.UnfertigeKlasse;
import tps.kompiler.objekte.programm.sache.UnfertigeSacheInterface;
import tps.kompiler.objekte.programm.sache.UnfertigesDing;

public class TpstSourceLader extends TpsSourceLader {
	
	/**
	 * {@link #BESETZTE_NAMEN} speichert alle name, die nicht benutzt werden dürfen, da diese in der TPST-Syntax verwendet werden.
	 */
	private static final Set <String> BESETZTE_NAMEN;
	
	
	
	static {
		Set <String> besetzteNamen;
		besetzteNamen = new TreeSet <String>();
		besetzteNamen.add("Ansonsten");
		besetzteNamen.add("Datei");
		besetzteNamen.add("Diese");
		besetzteNamen.add("Dieser");
		besetzteNamen.add("Dieses");
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
		besetzteNamen.add("erschaffe");
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
	
	
	
	/**
	 * Erstellt einen neuen {@link TpstSourceLader}, welcher den {@link TpsSourceLader} fertig implementiert.
	 */
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
		teste("Diese", "tolle", "Datei", "liegt", "in:");
		ort = lesePfad();
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
			if (!sourceLeser.hatNächstes()) {
				return;
			}
		}
	}
	
	/**
	 * Lädt eine neue {@link Sache} in {@link TpsSourceLader#sache}. <br>
	 * 
	 * @implNote Dafür wird zuerst {@link #ladeSachenKopf()} aufgerufen. Dort wird {@link TpsSourceLader#sache} Initialisiert. <br>
	 *           Dann wird je nach Initialisierung weiter verfahren: <br>
	 *           - Wenn es ein {@link PlanInterface} ist: {@link #ladePlan()} <br>
	 *           - Wenn es eine {@link UnfertigeSacheInterface} ist: {@link #ladeUnfertigeSache()} <br>
	 *           - Wenn es eine {@link FertigeSacheInterface} ist: {@link #ladeFertigeSache()} <br>
	 *           - Wenn es nicht davon ist, wird ein {@link KompilierungsFehler} geworfen.
	 * 			
	 * @throws KompilierungsFehler
	 *             Wenn es eine unbekannte {@link Sache} ist oder wenn in den aufgerufenen Methoden einer geworfen wird.
	 */
	private void ladeSache() throws KompilierungsFehler {
		ladeSachenKopf();
		if (sache instanceof PlanInterface) {
			ladePlan();
		} else if (sache instanceof UnfertigeSacheInterface) {
			ladeUnfertigeSache();
		} else if (sache instanceof FertigeSacheInterface) {
			ladeFertigeSache();
		} else {
			throw new KompilierungsFehler("Diese Sachenart ist mir unbekannt: '" + sache.getClass().getName() + "'!");
		}
	}
	
	/**
	 * Lädt einen {@link PlanInterface} indem alle unfertigenMethoden mit dem {@link TpsSourceLader#sourceLeser} eingelesen werden und dann in {@link TpsSourceLader#sache}
	 * gespeichert werden.
	 * 
	 * @throws KompilierungsFehler
	 *             Wenn {@link TpsSourceLader#sache} kein {@link PlanInterface} ist oder wenn in {@link #ladeUnfertigeMethoden()} etwas schief läuft.
	 */
	private void ladePlan() throws KompilierungsFehler {
		if ( ! (sache instanceof PlanInterface)) {
			throw new KompilierungsFehler("Ich kann so nicht arbeiten: sache muss ein Plan sein, damit ich einen Plan laden kann!");
		}
		ladeUnfertigeMethoden();
	}
	
	/**
	 * Liest eine {@link UnfertigeSacheInterface} mit dem {@link TpsSourceLader#sourceLeser} ein. Dies ist entweder eine {@link UnfertigeKlasse} oder ein {@link UnfertigesDing}.
	 * <br>
	 * Dafür werden zuerst die {@link Variable}n eingelesen <br>
	 * Danach werden die Anfangs Methoden eingelesen <br>
	 * Dann kommen die fertig implementierten Methoden. <br>
	 * Und als letztes werden die {@link UnfertigeMethode}n eingelesen. <br>
	 * 
	 * Wenn diese Reihenfolge nicht eingehalten wurde wird ein Fehler geworfen.
	 * 
	 * @throws KompilierungsFehler
	 *             Wenn sache nicht von {@link UnfertigeSacheInterface} ist oder wenn etwas beim laden der {@link Sache} schiefgeht.
	 */
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
		String zwischen;
		int anfangsTabsulatoren;
		Sichtbarkeit sicht = null;
		Datentyp name;
		Datentyp methodenErgebnis;
		List <Variable> parameter;
		if ( ! (sache instanceof PlanInterface || sache instanceof UnfertigeSacheInterface)) {
			throw new KompilierungsFehler("So kann ich nicht arbeiten!");
		}
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
						parameter = leseÜbergabeparameter();
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
						if ( ! ((PlanInterface) sache).neueUnfertigeMethode(new UnfertigeMethode(sicht, name, parameter, methodenErgebnis))) {
							throw new FalscheSourcenFehler("Es darf keine zwei Methoden mit gleichem Namen und Übergabeparametern geben!");
						}
					} else if (sache instanceof UnfertigeSacheInterface) {
						if ( ! ((UnfertigeSacheInterface) sache).neueUnfertigeMethode(new UnfertigeMethode(sicht, name, parameter, methodenErgebnis))) {
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
	
	private List <Variable> leseÜbergabeparameter() throws FalscheSourcenFehler {
		String zwischen;
		String varName;
		Datentyp varDat;
		List <Variable> parameter;
		boolean stopp = false;
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
		return parameter;
	}
	
	/**
	 * Liest die Variablen aus der aktuellen Sache mit dem {@link TpsSourceLader#sourceLeser} ein und speichert dies dann in {@link TpsSourceLader#sache}
	 * 
	 * 
	 * @throws KompilierungsFehler
	 *             Wenn {@link TpsSourceLader#sache} kein {@link UnfertigeSacheInterface} und kein {@link FertigeSacheInterface} ist
	 * @throws FalscheSourcenFehler
	 *             Wenn das eingelesene nicht TPST-Syntaktisch korrekt ist.
	 */
	private void ladeSachenVariablen() throws KompilierungsFehler {
		String name;
		Sichtbarkeit sicht;
		Datentyp datentyp;
		if ( ! (sache instanceof UnfertigeSacheInterface || sache instanceof FertigeSacheInterface)) {
			throw new KompilierungsFehler("Ich kann so nicht arbeiten! ");
		}
		while (true) {
			name = sourceLeser.nächstes();
			try {
				Regeln.testeName(name, new KompilierungsFehler("stoppe"), BESETZTE_NAMEN);
			} catch (KompilierungsFehler stoppe) {
				sourceLeser.zurück();
				return;
			}
			teste("ist");
			sicht = leseSichtbarkeit();
			teste("und", "von");
			datentyp = leseDatentyp();
			if (sache instanceof FertigeSacheInterface) {
				((FertigeSacheInterface) sache).neueVariable(new Variable(name, datentyp), sicht);
			} else {
				((UnfertigeSacheInterface) sache).neueVariable(new Variable(name, datentyp), sicht);
			}
		}
	}
	
	private void ladeFertigeMethoden() throws KompilierungsFehler {
		String zwischen;
		int anfangsTabsulatoren;
		boolean konstant;
		Sichtbarkeit sicht;
		Datentyp name;
		Datentyp methodenErgebnis;
		List <Variable> parameter;
		List <Befehl> box;
		FertigeMethode neu;
		if ( ! (sache instanceof FertigeSacheInterface || sache instanceof UnfertigeSacheInterface)) {
			throw new KompilierungsFehler("Wenn du mich aufrufst, dann solltest du vorher sichherstellen, dass sache fertigeMethoden haben darf! ('" + sache + "')");
		}
		while (true) {
			zwischen = sourceLeser.nächstes();
			anfangsTabsulatoren = sourceLeser.anfangsTabsulatoren();
			switch (zwischen) {
			case "Diese":
				zwischen = sourceLeser.nächstes();
				switch (zwischen) {
				case "tolle":
					zwischen = sourceLeser.nächstes();
					konstant = false;
					switch (zwischen) {
					case "konstant":
						konstant = true;
						zwischen = sourceLeser.nächstes();
						if ( !"Methode".equals(zwischen)) {
							throw new FalscheSourcenFehler("Methode", zwischen);
						}
					case "Methode":
						teste("heißt");
						if (anfangsTabsulatoren != 1) {
							throw new FalscheSourcenFehler("Jede Methode muss genau einen Anfangs Tabulator besitzen!");
						}
						name = leseDatentyp();
						teste("ist");
						sicht = leseSichtbarkeit();
						zwischen = sourceLeser.nächstes();
						parameter = Collections.emptyList();
						switch (zwischen) {
						case "erhält":
							parameter = leseÜbergabeparameter();
							teste("und");
						case "und":
							teste("gibt");
							zwischen = sourceLeser.nächstes();
							switch (zwischen) {
							case "nichts":
								methodenErgebnis = null;
								break;
							default:
								sourceLeser.zurück();
								methodenErgebnis = leseDatentyp();
							}
							teste("zurück!");
							box = leseBox(2);
							neu = new FertigeMethode(new UnfertigeMethode(sicht, name, parameter, methodenErgebnis), konstant, box);
							if (sache instanceof FertigeSacheInterface) {
								((FertigeSacheInterface) sache).neueFertigeMethode(neu);
							} else {
								((UnfertigeSacheInterface) sache).neueFertigeMethode(neu);
							}
							break;
						default:
							throw new FalscheSourcenFehler("erhält' oder 'und", zwischen);
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
	
	private void ladeAnfangsMethoden() throws KompilierungsFehler {
		boolean fertig;
		String zwischen;
		Sichtbarkeit sicht;
		List <Befehl> box;
		List <Variable> parameter;
		fertig = sache instanceof Klasse || sache instanceof Ding;
		if (sache instanceof Klasse || sache instanceof UnfertigeKlasse) {
			zwischen = sourceLeser.nächstes();
			switch (zwischen) {
			case "Zuerst:":
				box = leseBox(2);
				if (fertig) {
					((Klasse) sache).startMethode(box);
				} else {
					((UnfertigeKlasse) sache).startMethode(box);
				}
				return;
			default:
				sourceLeser.zurück();
				return;
			}
		} else if (sache instanceof Ding || sache instanceof UnfertigesDing) {
			while (true) {
				zwischen = sourceLeser.nächstes();
				if ( !"Dieses".equals(zwischen)) {
					sourceLeser.zurück();
					return;
				}
				zwischen = sourceLeser.nächstes();
				switch (zwischen) {
				case "erschaffe":
					teste("ist");
					sicht = leseSichtbarkeit();
					teste("und", "braucht");
					zwischen = sourceLeser.nächstes();
					switch (zwischen) {
					case "nichts":
						parameter = Collections.emptyList();
						break;
					default:
						sourceLeser.zurück();
						parameter = leseÜbergabeparameter();
					}
					box = leseBox(2);
					if (fertig) {
						((Ding) sache).neueErschaffe(new Erschaffe(parameter, sicht, box));
					} else {
						((UnfertigesDing) sache).neueErschaffe(new Erschaffe(parameter, sicht, box));
					}
				default:
					sourceLeser.zurück(2);
					return;
				}
			}
		} else {
			throw new KompilierungsFehler("sache muss von (Unfertige)Klasse/(Unfertiges)Ding sein, da nur diese Anfangs Methoden haben können!");
		}
	}
	
	private List <Befehl> leseBox(int anfangsTabs) throws FalscheSourcenFehler {
		String zwischen;
		List <Befehl> ergebnis;
		ergebnis = new ArrayList <Befehl>();
		
		zwischen = sourceLeser.nächstes();
		if (anfangsTabs != sourceLeser.anfangsTabsulatoren()) {
			throw new FalscheSourcenFehler("Ich habe " + anfangsTabs + " anfangsTabulatoren erwartet, aber es gab " + sourceLeser.anfangsTabsulatoren() + "!");
		}
		switch (zwischen) {
		case "Rufe": {
			String[] pfad;
			Datentyp name;
			Wert wert;
			teste("die", "tolle", "Methode");
			zwischen = sourceLeser.nächstes();
			if (zwischen.contains("#")) {
				if ( !zwischen.endsWith("#")) {
					throw new FalscheSourcenFehler("Ein Methodenfad endet mit '#'!('" + zwischen + "')");
				}
				pfad = zwischen.split("[#]+");
				zwischen = sourceLeser.nächstes();
			}
			name = leseDatentyp();
			teste("aus");
			
			
			
			break;
		}
		case "Wiederhohle":
			
			
			break;
		case "Mache":
			
			
			break;
		case "setzte":
			
			
			break;
		case "ist":
			
			
			break;
		case "sterbe":
			
			
			break;
		case "verschwinde":
			
			
			break;
		case "gehe":
			
			
			break;
		default:
			throw new FalscheSourcenFehler("Rufe', 'Wiederhohle', 'Mache', 'setzte' 'ist', 'sterbe', 'verschwinde' oder 'gehe", zwischen);
		}
		
		
		
		throw new NochNichtGemachtFehler();
	}
	
	/**
	 * Liest den Kopf einer {@link Sache} ein. <br>
	 * Wenn die Methode fertig ist, wird {@link TpsSourceLader#sache} neu Initialisiert sein. Dort wird dann die Art der Sache ({@code Ding}/{@code Klasse} und
	 * {@code Plan}/{@code Unfertig}/{@code Fertig}), der Name ({@link Datentyp}), die {@link Sichtbarkeit} und evtl. der Zusatz {@code konstant} gespeichert sein.
	 * 
	 * @throws KompilierungsFehler
	 */
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
	protected Datentyp leseDatentyp() throws FalscheSourcenFehler {
		String name;
		String zwischen;
		List <Datentyp> zusatz;
		name = Regeln.testeName(sourceLeser.nächstes(), new FalscheSourcenFehler("Dies ist kein gültiger Name!"), BESETZTE_NAMEN);
		zwischen = sourceLeser.nächstes();
		if (zwischen == null) {
			return new Datentyp(name, Collections.emptyList());
		}
		switch (zwischen) {
		case "von":
			zusatz = new ArrayList <>();
			zusatz.add(leseDatentyp());
			zwischen = sourceLeser.nächstes();
			if (zwischen == null || ! ("+".equals(zwischen) || "und".equals(zwischen))) {
				return new Datentyp(name, zusatz);
			} else {
				sourceLeser.zurück();
			}
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
