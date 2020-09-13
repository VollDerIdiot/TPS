package tps.kompiler.objekte.code;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import tps.kompiler.objekte.code.sache.Sache;
import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.FalscherNameFehler;
import tps.regeln.Regeln;

public class Datei {
	
	private final String[] braucht;
	private Map <String, Sache> sachen;
	private Set <String> bekannteDatentypen;
	
	
	
	private Datei(String[] braucht) {
		for (String testen : braucht) {
			Objects.requireNonNull(testen, "Kann nicht von null abhängig sein!");
		}
		this.braucht = braucht;
		this.sachen = new TreeMap <>();
		this.bekannteDatentypen = new TreeSet <String>();
	}
	
	/**
	 * Legt eine neue Datei ohne Abhängigkeiten an.
	 */
	public static Datei erschaffe() throws FalscheSourcenFehler {
		return erschaffe(new String[0]);
	}
	
	/**
	 * Legt eine neue Datei mit den gegebenen Abhängigkeiten an.
	 */
	public static Datei erschaffe(Collection <String> braucht) throws FalscheSourcenFehler {
		return erschaffe(braucht.toArray(new String[braucht.size()]));
	}
	
	/**
	 * Legt eine neue Datei mit den gegebenen Abhängigkeiten an.
	 */
	public static Datei erschaffe(String[] braucht) throws FalscheSourcenFehler {
		Datei ergebnis;
		ergebnis = new Datei(braucht.clone());
		ergebnis.teste();
		return ergebnis;
	}
	
	private void teste() throws FalscherNameFehler {
		for (String dieser : braucht) {
			String[] feld;
			feld = dieser.split(Regeln.BRAUCHT_TEILER);
			for (String teste : feld) {
				Regeln.testeName(teste, new FalscherNameFehler(teste));
			}
			bekannteDatentypen.add(feld[feld.length - 1]);
		}
	}
	
	public boolean add(Sache kommtDazu) {
		if (sachen.containsKey(kommtDazu.name)) {
			return false;
		}
		sachen.put(kommtDazu.name, kommtDazu);
		return true;
	}
	
	
	public String brauchtVon(int index) {
		return braucht[index];
	}
	
	public int brauchtAnzahl() {
		return braucht.length;
	}
	
	public void istBekannt(String datantyp) throws FalscherNameFehler {
		if ( !bekannteDatentypen.contains(datantyp)) {
			throw new FalscherNameFehler(datantyp);
		}
	}
	
	/**
	 * kompiliert diese Datei in den <code>schreiber</code>. Zeichenketten werden mit dem <code>zeichensatz</code> umgewandelt.
	 * 
	 * @param schreiber
	 *            Muss bereit zum schreiben sein.
	 */
	public void kompiliere(OutputStream schreiber, Charset zeichensatz) {
		
		
		
	}
	
}
