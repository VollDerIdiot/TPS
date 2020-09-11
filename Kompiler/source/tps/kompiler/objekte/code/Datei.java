package tps.kompiler.objekte.code;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import tps.kompiler.objekte.code.sache.Sache;

public class Datei {
	
	private final String[] braucht;
	private Map <String, Sache> sachen;
	private Set <String> unbekannteDatentypen;
	private Set <String> bekannteDatentypen;
	
	
	/**
	 * Legt eine neue Datei ohne irgendwelche Abhängigkeiten bei anderen Dateien an.
	 */
	public Datei() {
		braucht = new String[0];
		sachen = new TreeMap <>();
		unbekannteDatentypen = new TreeSet <String>();
		bekannteDatentypen = new TreeSet <String>();
	}
	
	public Datei(List <String> braucht) {
		this.braucht = braucht.toArray(new String[braucht.size()]);
		sachen = new TreeMap <>();
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
	
}
