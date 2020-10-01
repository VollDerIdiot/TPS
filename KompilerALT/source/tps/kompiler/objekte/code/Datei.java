package tps.kompiler.objekte.code;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import tps.kompiler.objekte.code.sache.Sache;
import tps.kompiler.objekte.fehler.KompilierungsFehler;

public class Datei implements Comparable <Datei> {
	
	public static final Set <Datentyp> STANDARD_DATENTYPEN;
	public static final Comparator <? super Datei> COMPERATOR = (Datei vergleiche, Datei mit) -> {
		Objects.requireNonNull(vergleiche, "Ich kann nicht mit null vergleichen!");
		Objects.requireNonNull(mit, "Ich kann nicht mit null vergleichen!");
		return vergleiche.compareTo(mit);
	};
	
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
		STANDARD_DATENTYPEN = Collections.unmodifiableSet(zwischen);
	}
	
	
	
	public final String name;
	public final String ort;
	private Map <String, String> braucht;
	private Map <String, Sache> sachen;
	private Map <String, Datentyp> datentypen;
	
	
	
	public Datei(String ort, String name, Set <String> braucht) {
		Objects.requireNonNull(ort, "Der ort darf nicht null sein!");
		Objects.requireNonNull(name, "Der name darf nicht null sein!");
		this.name = name;
		this.ort = ort;
		this.braucht = new TreeMap <String, String>();
		for (String neuer : braucht) {
			String[] gespalten = neuer.split("[\\/]+");
			this.braucht.put(gespalten[gespalten.length - 1], neuer);
		}
		this.sachen = new TreeMap <String, Sache>();
		this.datentypen = new TreeMap <String, Datentyp>();
	}
	
	public static Datei erschaffe(String ort, String name) {
		return erschaffe(ort, name, null);
	}
	
	public static Datei erschaffe(String ort, String name, Collection <String> braucht) {
		return new Datei(ort, name, (braucht == null) ? Collections.emptySet() : new TreeSet <String>(braucht));
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
		braucht = Collections.unmodifiableMap(braucht);
		sachen = Collections.unmodifiableMap(sachen);
		datentypen = Collections.unmodifiableMap(datentypen);
	}
	
	@Override
	public int compareTo(Datei mit) {
		int zwischen;
		Objects.requireNonNull(mit, "Ich kann nicht mit null vergleichen!");
		zwischen = ort.compareTo(mit.ort);
		return (zwischen == 0) ? name.compareTo(mit.name) : zwischen;
	}
	
	public Map <String, Datentyp> benötigteDatentypen() {
		return Collections.unmodifiableMap(datentypen);
	}
	
	public Set <String> braucht() {
		return Collections.unmodifiableSet(new TreeSet <String>(braucht.values()));
	}
	
	@Override
	public String toString() {
		StringBuilder ergebnis;
		ergebnis = new StringBuilder();
		ergebnis = ergebnis.append(ort).append('/').append(name);
		for (Sache dazuMachen : sachen.values()) {
			ergebnis = ergebnis.append(dazuMachen.datentyp);
		}
		return ergebnis.toString();
	}
	
	public Set <? extends Datentyp> sachenDatentypen() {
		Set <Datentyp> ergebnis;
		ergebnis = new TreeSet <Datentyp>(Datentyp.COMPERATOR);
		for (Sache sache : sachen.values()) {
			ergebnis.add(sache.datentyp);
		}
		return ergebnis;
	}
	
}
