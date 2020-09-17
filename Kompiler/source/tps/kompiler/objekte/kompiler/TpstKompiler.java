package tps.kompiler.objekte.kompiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import tps.kompiler.objekte.code.Datei;
import tps.kompiler.objekte.code.Datentyp;
import tps.kompiler.objekte.code.sache.Ding;
import tps.kompiler.objekte.code.sache.Klasse;
import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.fehler.NochNichtGemachtFehler;
import tps.kompiler.objekte.konstanten.Implementierungstiefe;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;


public class TpstKompiler extends Kompiler {
	
	public TpstKompiler(OutputStream out, Charset zeichensatz) {
		super(out, zeichensatz);
	}
	
	public TpstKompiler(OutputStream out) {
		super(out);
	}
	
	public TpstKompiler(File datei, Charset zeichensatz) throws FileNotFoundException {
		super(datei, zeichensatz);
	}
	
	public TpstKompiler(File datei) throws FileNotFoundException {
		super(datei);
	}
	
	
	
	@Override
	protected void ladeImplementierung(String dateiName) throws KompilierungsFehler {
		ladeKopf(dateiName);
		while (ladeSache()) {
		}
	}
	
	private boolean ladeSache() throws KompilierungsFehler {
		ladeSachenKopf();
		ladeSachenVariablen();
		return ladeSachenMethoden();
	}
	
	private boolean ladeSachenMethoden() {
		// TODO Auto-generated method stub
		
		
		
		throw new NochNichtGemachtFehler();
	}
	
	private void ladeSachenVariablen() {
		// TODO Auto-generated method stub
		
		
		
		throw new NochNichtGemachtFehler();
	}
	
	private void ladeSachenKopf() throws KompilierungsFehler {
		String zwischen;
		int art;
		Datentyp name;
		Sichtbarkeit sicht;
		Datentyp bessert;
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
				macht = new ArrayList <Datentyp>();
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
			macht = new ArrayList <Datentyp>(1);
			if (art < 3) {
				macht.add(Datentyp.DING_STANDARD);
			} else {
				macht.add(Datentyp.KLASSE_STANDARD);
			}
			sourceLeser.zurück();
		}
		switch (art) {
		case 0:
			sache = new Ding(name, Implementierungstiefe.fertig, sicht);
			return;
		case 1:
			sache = new Ding(name, Implementierungstiefe.unfertig, sicht);
			return;
		case 2:
			sache = new Ding(name, Implementierungstiefe.plan, sicht);
			return;
		case 3:
			sache = new Klasse(name, Implementierungstiefe.fertig, sicht);
			return;
		case 4:
			sache = new Klasse(name, Implementierungstiefe.unfertig, sicht);
			return;
		case 5:
			sache = new Klasse(name, Implementierungstiefe.plan, sicht);
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
	
	private void ladeKopf(String dateiName) throws FalscheSourcenFehler {
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
					bauen = Datei.erschaffe(ort, braucht);
					return;
				default:
					throw new FalscheSourcenFehler("Da war etwas FALSCH: " + zwischen);
				}
				
			}
		}
		case "keine":
			bauen = Datei.erschaffe(ort);
			return;
		default:
			throw new FalscheSourcenFehler("Da war etwas FALSCH: " + zwischen);
		}
		
		
	}
	
	@Override
	protected void bereiteKompilierungVor() throws KompilierungsFehler {
		// TODO Auto-generated method stub
		
		throw new NochNichtGemachtFehler();
	}
	
	@Override
	protected void kompiliereImplementierung(Charset zeichensatz) throws IOException {
		// TODO Auto-generated method stub
		
		throw new NochNichtGemachtFehler();
	}
	
}
