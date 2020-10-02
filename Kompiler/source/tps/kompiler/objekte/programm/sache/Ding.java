package tps.kompiler.objekte.programm.sache;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

import tps.hilfen.Hilfen;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Datentyp;
import tps.kompiler.objekte.programm.FertigeMethode;
import tps.kompiler.objekte.programm.Variable;

public class Ding extends Sache implements FertigeSacheInterface {
	
	private NavigableSet <FertigeMethode> methoden;
	private NavigableMap <Variable, Sichtbarkeit> variablen;
	
	public Ding(Datentyp name, Sichtbarkeit sicht, boolean konstant) {
		super(name, sicht, konstant);
		methoden = new TreeSet <FertigeMethode>(Hilfen.vergleicherKeineNull());
		variablen = new TreeMap <Variable, Sichtbarkeit>(Hilfen.vergleicherKeineNull());
	}
	
	
	
	@Override
	public int compareTo(Sache mit) {
		if (mit instanceof Ding) {
			return super.compareTo(mit);
		} else {
			return -1;
		}
	}
	
	
	
	@Override
	public boolean neueVariable(Variable neu, Sichtbarkeit sicht) {
		Objects.requireNonNull(neu, "Ich weigere mich eine null-Variable hinzuzufügen!");
		return variablen.put(neu, sicht) == null;
	}
	
	
	
	@Override
	public NavigableMap <Variable, Sichtbarkeit> variablen() {
		return Collections.unmodifiableNavigableMap(variablen);
	}
	
	@Override
	public boolean neueFertigeMethode(FertigeMethode neu) {
		Objects.requireNonNull(neu, "Ich weigere mich eine null-Methode hinzuzufügen!");
		return methoden.add(neu);
	}
	
	
	
	@Override
	public NavigableSet <FertigeMethode> fertigeMethoden() {
		return Collections.unmodifiableNavigableSet(methoden);
	}
	
}
