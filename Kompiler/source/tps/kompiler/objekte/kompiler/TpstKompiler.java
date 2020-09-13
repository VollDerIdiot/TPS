package tps.kompiler.objekte.kompiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;

import tps.kompiler.objekte.code.Datei;
import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.KompilierungsFehler;


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
	protected void kompilierungsImplementation(String dateiName, Charset zeichensatz) throws KompilierungsFehler, IOException {
		ladeKopf(dateiName);
		while (ladeSache()) {
		}
		bauen.kompiliere(archivSchreiber, zeichensatz);
	}
	
	private boolean ladeSache() {
		// TODO Auto-generated method stub
		return false;
	}

	private void ladeKopf(String dateiName) throws FalscheSourcenFehler, IOException {
		String zwischen;
		ZipEntry eintrag;
		teste("Diese", "tolle", "Datei", "liegt", "in:");
		zwischen = sourceLeser.nächsteZeile() + "/" + dateiName;
		testePfad(zwischen);
		eintrag = new ZipEntry(zwischen);
		this.archivSchreiber.putNextEntry(eintrag);
		teste("und", "braucht");
		zwischen = sourceLeser.nächstes();
		switch (zwischen) {
		case "die": {
			List <String> braucht;
			boolean weitermachen;
			teste("folgenden", "Dateien:", "-");
			zwischen = sourceLeser.nächsteZeile();
			testePfad(zwischen);
			braucht = new ArrayList <String>();
			braucht.add(zwischen);
			weitermachen = true;
			while (weitermachen) {
				zwischen = sourceLeser.nächstes();
				switch (zwischen) {
				case "-":
					break;
				case "um":
					teste("zu", "funktionieren:");
					weitermachen = false;
					break;
				default:
					throw new FalscheSourcenFehler("Habe einen Pfadstarter ('-') oder das schlüsselwort zum afhöhren ('um') erwartet aber '" + zwischen + "' erhalten!");
				}
				zwischen = sourceLeser.nächsteZeile();
				testePfad(zwischen);
				braucht.add(zwischen);
			}
			bauen = Datei.erschaffe(braucht);
			return;
		}
		case "keine":
			teste("anderen", "Dateien!");
			bauen = Datei.erschaffe();
			return;
		default:
			throw new FalscheSourcenFehler("Habe 'die', 'folgenden', ... oder 'keine', 'anderen', ... erwartet und '" + zwischen + "' erhalten!");
		}
	}
	
}
