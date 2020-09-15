package tps.kompiler.objekte.kompiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import jdk.internal.jshell.tool.resources.l10n;
import tps.kompiler.objekte.code.Datei;
import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.fehler.NochNichtGemachtFehler;


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
		
		
		
		throw new NochNichtGemachtFehler();
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
			
//			TODO machen
			
			break;
		}
		case "keine":
			bauen = Datei.erschaffe();
			break;
		default:
			break;
		}
		
		
	}
	
	private String lesePfad() {
		String ergebnis;
		sourceLeser.überspringe(WHITESPACE_BELIBIGE);
		ergebnis = sourceLeser.nächsteZeile();
		return (ergebnis.isBlank()) ? lesePfad() : ergebnis;
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
