package tps.kompiler.objekte.code;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import tps.kompiler.objekte.code.sache.Sache;
import tps.regeln.Regeln;

public class Datei {
	
	private final String[] braucht;
	private Map <String, Sache> sachen;
	private Set <String> unbekannteDatentypen;
	private Set <String> bekannteDatentypen;
	
	/**
	 * Legt eine neue Datei ohne irgendwelche Abhängigkeiten bei anderen Dateien an.
	 */
	public Datei() {
		this(new String[0]);
	}
	
	/**
	 * Legt eine neue Datei mit den gegebenen Abhängigkeiten an.
	 */
	public Datei(Collection <String> braucht) {
		this(braucht.toArray(new String[braucht.size()]));
	}
	
	/**
	 * Legt eine neue Datei mit den gegebenen Abhängigkeiten an.
	 */
	private Datei(String[] braucht) {
		for (String testen : braucht) {
			Objects.requireNonNull(testen, "Kann nicht von null abhängig sein!");
		}
		this.braucht = braucht;
		this.sachen = new TreeMap <>();
		this.unbekannteDatentypen = new TreeSet <String>();
		this.bekannteDatentypen = new TreeSet <String>();
		teste();
	}
	
	private final void teste() {
		for (String dieser : braucht) {
			String[] feld;
			feld = dieser.split(Regeln.BRAUCHT_TEILER);
			for (String teste : feld) {
				
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
