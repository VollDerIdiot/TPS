package tps.kompiler.objekte.kompilieren.kompiler;

import java.util.Set;
import java.util.TreeSet;

import tps.kompiler.objekte.code.Datei;
import tps.kompiler.objekte.fehler.NochNichtGemachtFehler;
import tps.kompiler.objekte.kompilieren.sourcenladen.TpsSourceLader;

public class Kompiler {
	
	private static final String KOMPILIERTE_DATEI_ENDUNG;
	
	
	
	static {
		KOMPILIERTE_DATEI_ENDUNG = ".tkp"; // Tolles-Kompiliertes-Programm
	}
	
	
	
	private TpsSourceLader sourcenLader;
	private Set <Datei> dateien;
	
	
	
	public Kompiler() {
		dateien = new TreeSet <Datei>((Datei vergleiche, Datei mit) -> {
			throw new NochNichtGemachtFehler();
		});
	}
	
}
