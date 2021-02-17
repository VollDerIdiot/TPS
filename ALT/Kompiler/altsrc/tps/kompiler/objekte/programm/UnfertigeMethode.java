package tps.kompiler.objekte.programm;

import java.util.Collection;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeSet;

import de.hechler.patrick.tps.hilfen.Hilfen;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;

public class UnfertigeMethode implements Comparable <UnfertigeMethode> {
	
	public final Sichtbarkeit sicht;
	public final Datentyp name;
	public final NavigableSet <Variable> parameter;
	public final Datentyp rückgabeTyp;
	
	
	
	public UnfertigeMethode(Sichtbarkeit sicht, Datentyp name, Collection <Variable> parameter, Datentyp rückgabeTyp) {
		Objects.requireNonNull(name, "ich weigere mich keinen namen zu haben!");
		TreeSet <Variable> par;
		this.name = name;
		par = new TreeSet <>(Hilfen.vergleicherKeineNull());
		par.addAll(parameter);
		this.parameter = parameter == null ? Collections.emptyNavigableSet() : Collections.unmodifiableNavigableSet(par);
		this.rückgabeTyp = rückgabeTyp;
		this.sicht = sicht == null ? Sichtbarkeit.offen : sicht;
	}
	
	
	
	@Override
	public int compareTo(UnfertigeMethode mit) {
		int ergebnis;
		int runde;
		Variable eigene;
		Variable andere;
		ergebnis = name.compareTo(mit.name);
		ergebnis = ergebnis == 0 ? (int) Math.signum(parameter.size() - mit.parameter.size()) : ergebnis;
		if (ergebnis != 0) {
			return ergebnis;
		}
		if (parameter.size() == 0) {
			return 0;
		}
		eigene = parameter.first();
		andere = mit.parameter.first();
		for (runde = 1; runde < parameter.size(); runde ++ ) {
			ergebnis = eigene.compareTo(andere);
			if (ergebnis != 0) {
				return ergebnis;
			}
			eigene = parameter.higher(eigene);
			andere = mit.parameter.higher(andere);
		}
		return 0;
	}
	
}
