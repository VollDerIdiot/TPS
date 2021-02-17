package tps.kompiler.objekte.code;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import tps.hilfen.Hilfen;
import tps.hilfen.Regeln;
import tps.kompiler.objekte.code.sache.Sache;
import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.FalscherNameFehler;
import tps.konstanten.KompiliertKonstanten;

public class DateiALT {
	
	private final String[] braucht;
	private Map <String, Sache> sachen;
	private Set <Datentyp> bekannteDatentypen;
	public static final Set <String> standardDatentypen;
	
	static {
		Set <String> zwischen;
		zwischen = new TreeSet <String>();
		zwischen.add("ZeichenKette");
		zwischen.add("Zahl");
		zwischen.add("Z1B");
		zwischen.add("Z8B");
		zwischen.add("Z16B");
		zwischen.add("Z32B");
		zwischen.add("Z64B");
		zwischen.add("SuperZahl");
		zwischen.add("DezimalZahl");
		zwischen.add("Feld");
		zwischen.add("Ding");
		zwischen.add("Folge");
		zwischen.add("EingangsFolge");
		zwischen.add("AusgangsFolge");
		zwischen.add("DateiLeser");
		zwischen.add("DateiSchreiber");
		zwischen.add("Leser");
		zwischen.add("JaNö");
		standardDatentypen = Collections.unmodifiableSet(zwischen);
	}
	
	private Datei(String[] braucht) throws FalscheSourcenFehler {
		for (String testen : braucht) {
			Regeln.testePfad(testen, new FalscheSourcenFehler("dies ist ein ungültiger Pfad: '" + testen + "'"));
		}
		this.braucht = braucht;
		this.sachen = new TreeMap <>();
		this.bekannteDatentypen = new TreeSet <Datentyp>();
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
		if ( !bekannteDatentypen.contains(datantyp) && !standardDatentypen.contains(datantyp)) {
			throw new FalscherNameFehler(datantyp);
		}
	}
	
}
