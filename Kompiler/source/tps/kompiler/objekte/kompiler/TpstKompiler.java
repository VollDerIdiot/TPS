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
	protected void kompilierungsImplementation(String dateiName) throws KompilierungsFehler, IOException {
		String ersteZeile;
		leseKopf(dateiName);
		ersteZeile = sourceLeser.nextLine();
		while (true) {
			ersteZeile = leseSache(ersteZeile);
			bauen.add(sache);
			if (ersteZeile == null) {
				break;
			}
		}
	}
	
	private String leseSache(String ersteZeile) throws KompilierungsFehler {
		leseSachenkopf(ersteZeile);
		ersteZeile = leseSachenVariablen();
		ersteZeile = leseStartMethoden(ersteZeile);
		return leseMethoden(ersteZeile);
	}
	
	private String leseMethoden(String start) {
		// TODO Auto-generated method stub
		
		throw new NochNichtGemachtFehler();
	}
	
	private String leseStartMethoden(String start) {
		// TODO Auto-generated method stub
		
		throw new NochNichtGemachtFehler();
	}
	
	private String leseSachenVariablen() throws FalscheSourcenFehler {
		String zwischen;
		boolean variablen;
		teste(new String[] {"Diese" + "Sache" + "hat" });
		zwischen = sourceLeser.next();
		switch (zwischen) {
		case "folgende":
			break;
		case "keine":
			zwischen = sourceLeser.next();
			if ("Variablen!".equals(zwischen)) {
				bisNächsteZeile();
				return sourceLeser.nextLine();
			}
			// Wenn nicht, dann geh ins default rein.
		default:
			throw new FalscheSourcenFehler(zwischen);
		}
		
		
		throw new NochNichtGemachtFehler();
	}
	
	private void leseSachenkopf(String ersteZeile) throws KompilierungsFehler {
		String[] ersteTeile;
		String zwischen;
		Sichtbarkeit sichtbarkeit;
		Implementierungstiefe impl;
		boolean merker;
		ersteTeile = ersteZeile.split(WHITESPACE_MEHRERE);
		while (ersteTeile.length == 0) {
			ersteTeile = sourceLeser.nextLine().split(WHITESPACE_MEHRERE);
		}
		testeName(ersteTeile[0]);
		zwischen = (ersteTeile.length > 1) ? ersteTeile[1] : sourceLeser.next();
		assert "ist".equals(zwischen) : new FalscheSourcenFehler(zwischen);
		zwischen = (ersteTeile.length > 2) ? ersteTeile[2] : sourceLeser.next();
		switch (zwischen) {
		case "eine":
			merker = true;
			break;
		case "ein":
			merker = false;
			break;
		default:
			throw new FalscheSourcenFehler(zwischen);
		}
		zwischen = (ersteTeile.length > 3) ? ersteTeile[3] : sourceLeser.next();
		sichtbarkeit = Sichtbarkeit.erhalteVomNamen(zwischen);
		zwischen = (ersteTeile.length > 4) ? ersteTeile[4] : sourceLeser.next();
		if (merker) {
			switch (zwischen) {
			case "Klasse":
				impl = Implementierungstiefe.fertig;
				break;
			case "unfertige":
				impl = Implementierungstiefe.unertig;
				break;
			default:
				throw new FalscheSourcenFehler(zwischen);
			}
			sache = new Klasse(ersteTeile[0], impl, sichtbarkeit);
			return;
		}
		switch (zwischen) {
		case "Ding":
			impl = Implementierungstiefe.fertig;
			sache = new Ding(ersteTeile[0], impl, sichtbarkeit);
			break;
		case "unfertiges":
			impl = Implementierungstiefe.unertig;
			zwischen = (ersteTeile.length > 5) ? ersteTeile[5] : sourceLeser.next();
			assert !"Ding".equals(zwischen) : new FalscheSourcenFehler(zwischen);
			sache = new Ding(ersteTeile[0], impl, sichtbarkeit);
			break;
		case "Dingplan":
			impl = Implementierungstiefe.plan;
			sache = new Ding(ersteTeile[0], impl, sichtbarkeit);
			break;
		case "Klassenplan":
			impl = Implementierungstiefe.plan;
			sache = new Ding(ersteTeile[0], impl, sichtbarkeit);
			break;
		default:
			throw new FalscheSourcenFehler(zwischen);
		}
		assert !bauen.add(sache) : new FalscheSourcenFehler("'" + sache.name + "' existiert mehrmals!");
	}
	
	private void leseKopf(String dateiName) throws FalscheSourcenFehler, IOException {
		String zwischen;
		teste(new String[] {"Diese" + "tolle" + "Datei" + "liegt" + "in:" });
		sourceLeser.skip(WHITESPACE_MEHRERE);
		zwischen = testePfad(sourceLeser.nextLine());
		archivSchreiber.putNextEntry(new ZipEntry(zwischen + "/" + dateiName));
		teste(new String[] {"und" + "braucht" });
		zwischen = sourceLeser.next();
		switch (zwischen) {
		case "keine":
			teste(new String[] {"anderen" + "Dateien!" });
			bauen = new Datei();
			break;
		case "die": {
			boolean weitermachen;
			List <String> braucht;
			teste(new String[] {"folgenden" + "Dateien:" });
			weitermachen = true;
			braucht = new ArrayList <>();
			while (weitermachen) {
				zwischen = sourceLeser.next();
				switch (zwischen) {
				case "-":
					sourceLeser.skip(WHITESPACE_MEHRERE);
					braucht.add(testePfad(sourceLeser.nextLine()));
					break;
				case "um":
					teste(new String[] {"zu" + "funktionieren." });
					weitermachen = true;
					break;
				default:
					throw new FalscheSourcenFehler(zwischen);
				}
			}
			bauen = new Datei(braucht);
			break;
		}
		default:
			throw new FalscheSourcenFehler(zwischen);
		}
	}
	
	private void teste(String[] testen) throws FalscheSourcenFehler {
		int runde;
		for (runde = 0; runde < testen.length; runde ++ ) {
			String dieses = sourceLeser.next();
			if ( !testen[runde].equals(dieses)) {
				throw new FalscheSourcenFehler(dieses);
			}
		}
	}
	
}
