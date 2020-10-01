package tps.kompiler.objekte.kompilieren.kompiler;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import tps.kompiler.objekte.code.Datei;
import tps.kompiler.objekte.code.Datentyp;
import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.fehler.NochNichtGemachtFehler;
import tps.kompiler.objekte.kompilieren.BekannteSourcenLader;
import tps.kompiler.objekte.kompilieren.sourcenladen.TpsSourceLader;

public class Kompiler {
	
//	private static final String KOMPILIERTE_DATEI_ENDUNG; // Umlagern oder entfernen 
	
	
	
	static {
//		KOMPILIERTE_DATEI_ENDUNG = ".tkp"; // Tolles-Kompiliertes-Programm
	}
	
	
	
	private Set <Datei> dateien;
	
	
	
	public Kompiler() {
		dateien = new TreeSet <Datei>(Datei.COMPERATOR);
	}
	
	
	
	public void ladeUndKompiliere(File[] dateien, OutputStream schreiber) throws KompilierungsFehler, IOException {
		ladeUndKompiliere(dateien, new Charset[dateien.length], schreiber);
	}
	
	public void ladeUndKompiliere(File[] dateien, Charset[] zeichensätze, OutputStream schreiber) throws KompilierungsFehler, IOException {
		int durchlauf;
		if (zeichensätze.length < dateien.length) {
			ladeUndKompiliere(dateien, Arrays.copyOf(zeichensätze, dateien.length), schreiber);
		}
		for (durchlauf = 0; durchlauf < dateien.length; durchlauf ++ ) {
			TpsSourceLader sourceLader;
			Datei geladen;
			sourceLader = BekannteSourcenLader.erhalte(dateien[durchlauf]);
			geladen = sourceLader.lade(dateien[durchlauf], zeichensätze[durchlauf]);
			this.dateien.add(geladen);
		}
		for (Datei datentypenTesten : this.dateien) {
			Set <String> braucht;
			Set <Datentyp> kennt;
			braucht = datentypenTesten.braucht();
			kennt = new TreeSet <Datentyp>(Datentyp.COMPERATOR);
			durchlauf = 0;
			for (Datei testen : this.dateien) {
				if (datentypenTesten.ort.equals(testen.ort)) {
					kennt.addAll(testen.sachenDatentypen());
				} else if (braucht.contains(testen.ort + "/" + testen.name)) {
					durchlauf ++ ;
					kennt.addAll(testen.sachenDatentypen());
				}
			}
			if (durchlauf != braucht.size()) {
				throw new FalscheSourcenFehler("Ich habe nicht genau soviele Dateien gefunden, wie benötigt werden (gefunden: " + durchlauf + " braucht: " + braucht.size()
						+ " in Datei " + datentypenTesten + ")!");
			}
			datentypenTesten.testeDatentypen(kennt);
		}
		
		
		
		// TODO machen
		
		
		
		throw new NochNichtGemachtFehler();
	}
	
}
