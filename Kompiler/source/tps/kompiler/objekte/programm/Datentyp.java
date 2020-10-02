package tps.kompiler.objekte.programm;

import java.util.Collection;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

import tps.hilfen.Hilfen;

public class Datentyp implements Comparable <Datentyp> {
	
	public final String name;
	public final NavigableSet <Datentyp> zusatzsachen;
	
	
	
	public Datentyp(String name, Collection <Datentyp> zusatzsachen) {
		TreeSet <Datentyp> zusatz;
		this.name = name;
		zusatz = new TreeSet <>(Hilfen.vergleicherKeineNull());
		zusatz.addAll(zusatzsachen);
		this.zusatzsachen = Collections.unmodifiableNavigableSet(zusatz);
	}
	
	
	
	@Override
	public int compareTo(Datentyp mit) {
		int ergebnis;
		int runde;
		Datentyp eigener;
		Datentyp anderer;
		ergebnis = name.compareTo(mit.name);
		ergebnis = ergebnis == 0 ? (int) Math.signum(zusatzsachen.size() - mit.zusatzsachen.size()) : ergebnis;
		if (ergebnis != 0) {
			return ergebnis;
		}
		eigener = zusatzsachen.first();
		anderer = mit.zusatzsachen.first();
		for (runde = 0; runde < zusatzsachen.size(); runde ++ ) {
			ergebnis = eigener.compareTo(anderer);
			if (ergebnis != 0) {
				return ergebnis;
			}
			eigener = zusatzsachen.higher(eigener);
			anderer = mit.zusatzsachen.higher(anderer);
		}
		return 0;
	}
	
}
