package tps.kompiler.objekte.code;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import tps.kompiler.objekte.code.sache.Sache;
import tps.kompiler.objekte.fehler.KompilierungsFehler;

public class Datei {
	
	public static final Set <Datentyp> STANDARD_DATENTYPEN;
	
	static {
		Set <Datentyp> zwischen;
		zwischen = new TreeSet <>();
		zwischen.add(new Datentyp("ZeichenKette"));
		zwischen.add(new Datentyp("Zahl"));
		zwischen.add(new Datentyp("Z1B"));
		zwischen.add(new Datentyp("Z8B"));
		zwischen.add(new Datentyp("Z16B"));
		zwischen.add(new Datentyp("Z32B"));
		zwischen.add(new Datentyp("Z64B"));
		zwischen.add(new Datentyp("SuperZahl"));
		zwischen.add(new Datentyp("DezimalZahl"));
		zwischen.add(new Datentyp("Feld"));
		zwischen.add(new Datentyp("Ding"));
		zwischen.add(new Datentyp("Folge"));
		zwischen.add(new Datentyp("EingangsFolge"));
		zwischen.add(new Datentyp("AusgangsFolge"));
		zwischen.add(new Datentyp("DateiLeser"));
		zwischen.add(new Datentyp("DateiSchreiber"));
		zwischen.add(new Datentyp("Leser"));
		zwischen.add(new Datentyp("JaNö"));
		STANDARD_DATENTYPEN = zwischen;
	}
	
	
	
	public final String ort;
	private Set <String> braucht;
	private Map <String, Sache> sachen;
	private Map <String, Datentyp> datentypen;
	
	
	
	public Datei(String ort, Set <String> braucht) {
		Objects.requireNonNull(ort, "Der ort darf nicht null sein!");
		this.ort = ort;
		this.braucht = braucht;
		this.sachen = new TreeMap <String, Sache>();
		this.datentypen = new TreeMap <String, Datentyp>();
	}
	
	public static Datei erschaffe(String ort) {
		return erschaffe(ort, null);
	}
	
	public static Datei erschaffe(String ort, Collection <String> braucht) {
		return new Datei(ort, (braucht == null) ? Collections.emptySet() : new TreeSet <String>(braucht));
	}
	
	public void neueSache(Sache dazu) {
		sachen.put(dazu.datentyp.name, dazu);
	}
	
	public void neuerDatentyp(Datentyp dazu) {
		datentypen.put(dazu.name, dazu);
	}
	
	/**
	 * Prüft, ob alle {@link #datentypen} in <code>bekannteDatentypen</code> enthalten sind. <br>
	 * Wenn alle bekannt sind passiert nichts. <br>
	 * Wenn nicht, wird ein <code>KompilierungsFehler</code> geworfen.
	 * 
	 * @param bekannteDatentypen
	 *            Es dürfen nur diese Datentypen benötigt werden.
	 * @throws KompilierungsFehler
	 *             Wird geworfen, wenn es mindestens einen Datentyp gibt, welcher nicht in <code>bekannteDatentypen</code> enthalten ist.
	 */
	public void testeDatentypen(Set <Datentyp> bekannteDatentypen) throws KompilierungsFehler {
		for (Datentyp testen : datentypen.values()) {
			if ( !bekannteDatentypen.contains(testen)) {
				throw new KompilierungsFehler("Der Datentyp '" + testen + "' ist unbekannt!");
			}
		}
	}
	
	public void macheKonstant() {
		braucht = Collections.unmodifiableSet(braucht);
		sachen = Collections.unmodifiableMap(sachen);
		datentypen = Collections.unmodifiableMap(datentypen);
	}
	
}
