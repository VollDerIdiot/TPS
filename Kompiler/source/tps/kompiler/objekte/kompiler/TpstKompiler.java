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
		Datentyp name;
		Sichtbarkeit sicht;
		Implementierungstiefe impl;
		Datentyp bessert;
		List <Datentyp> macht;
		name = leseDatentyp();
		teste("ist");
		zwischen = sourceLeser.nächstes();
		switch (zwischen) {
		case "ein":
			
			break;
		case "eine":
			
			break;
		default:
			break;
		}
		
		
		throw new NochNichtGemachtFehler();
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
