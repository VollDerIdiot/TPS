package tps.kompiler.objekte.code;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeSet;

public class Datentyp implements Comparable <Datentyp> {
	
	public static final Datentyp DING_STANDARD = new Datentyp("DingStandard");
	public static final Datentyp KLASSE_STANDARD = new Datentyp("KlasseStandard");
	public static final Comparator <? super Datentyp> COMPERATOR = (Datentyp vergleiche, Datentyp mit) -> {
		Objects.requireNonNull(vergleiche, "Ich kann nicht mit null vergleichen");
		Objects.requireNonNull(mit, "Ich kann nicht mit null vergleichen");
		return vergleiche.compareTo(mit);
	};
	
	
	
	public final String name;
	/**
	 * Dies ist ein unveränderbares navigierbares Set in dem die zusätzlichen Sachen gespeichert werden
	 */
	public final NavigableSet <Datentyp> zusatzSachen;
	
	
	
	public Datentyp(String name) {
		this(name, null);
	}
	
	public Datentyp(String name, Collection <Datentyp> zusatzSachen) {
		Objects.requireNonNull(name, "Der Name kann nicht null sein!");
		this.name = name;
		this.zusatzSachen = Collections.unmodifiableNavigableSet( (zusatzSachen == null) ? Collections.emptyNavigableSet() : new TreeSet <Datentyp>(zusatzSachen));
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj.getClass().equals(getClass())) {
			return ((Datentyp) obj).name.equals(name) && ((Datentyp) obj).zusatzSachen.equals(zusatzSachen);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public String toString() {
		int runde;
		StringBuilder ergebnis;
		Iterator <Datentyp> iterator;
		ergebnis = new StringBuilder(name);
		iterator = zusatzSachen.iterator();
		ergebnis.append(" [");
		for (runde = 0; runde < zusatzSachen.size(); runde ++ ) {
			ergebnis.append(iterator.next());
			if (runde == zusatzSachen.size() - 1) {
				ergebnis.append(" + ");
			}
		}
		return ergebnis.append("]").toString();
	}
	
	@Override
	public int compareTo(Datentyp mit) {
		int zwischen;
		zwischen = name.compareTo(mit.name);
		if (zwischen == 0) {
			zwischen = zusatzSachen.containsAll(mit.zusatzSachen) ? mit.zusatzSachen.containsAll(zusatzSachen) ? 0 : -1 : 1;
		}
		return zwischen;
	}
	
}
