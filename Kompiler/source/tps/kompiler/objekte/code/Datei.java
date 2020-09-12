package tps.kompiler.objekte.code;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import tps.kompiler.objekte.code.sache.Sache;
import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.regeln.Regeln;

public class Datei {
	
	private final String[] braucht;
	private Map <String, Sache> sachen;
	private Set <String> unbekannteDatentypen;
	private Set <String> bekannteDatentypen;
	
	
	
	private Datei(String[] braucht) {
		for (String testen : braucht) {
			Objects.requireNonNull(testen, "Kann nicht von null abhängig sein!");
		}
		this.braucht = braucht;
		this.sachen = new TreeMap <>();
		this.unbekannteDatentypen = new TreeSet <String>();
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
	
	private void teste() throws FalscheSourcenFehler {
		for (String dieser : braucht) {
			String[] feld;
			feld = dieser.split(Regeln.BRAUCHT_TEILER);
			for (String teste : feld) {
				Regeln.testeName(teste, new FalscheSourcenFehler("'" + teste + "' ist ein ungültiger name!"));
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
	
	public int unbekannteAnzahlAnDatentypen() {
		return unbekannteDatentypen.size();
	}
	
	public void datentyp(String name) {
		if (bekannteDatentypen.contains(name)) {
			return;
		}
		unbekannteDatentypen.add(name);
	}
	
	public void bekannterDatentyp(String name) {
		unbekannteDatentypen.remove(name);
		bekannteDatentypen.add(name);
	}
	
}
