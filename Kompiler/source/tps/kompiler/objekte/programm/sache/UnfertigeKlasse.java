package tps.kompiler.objekte.programm.sache;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeSet;

import tps.hilfen.Hilfen;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Datentyp;
import tps.kompiler.objekte.programm.FertigeMethode;
import tps.kompiler.objekte.programm.UnfertigeMethode;
import tps.kompiler.objekte.programm.Variable;

public class UnfertigeKlasse extends Sache implements UnfertigeSacheInterface {
	
	private NavigableSet <Variable> variablen;
	private NavigableSet <FertigeMethode> fertigeMethoden;
	private NavigableSet <UnfertigeMethode> unfertigeMethoden;
	
	public UnfertigeKlasse(Datentyp name, Sichtbarkeit sicht, boolean konstant) {
		super(name, sicht, konstant);
		unfertigeMethoden = new TreeSet <UnfertigeMethode>(Hilfen.vergleicherKeineNull());
		fertigeMethoden = new TreeSet <FertigeMethode>(Hilfen.vergleicherKeineNull());
		variablen = new TreeSet <Variable>(Hilfen.vergleicherKeineNull());
	}
	
	
	
	@Override
	public int compareTo(Sache mit) {
		if (mit instanceof UnfertigeKlasse) {
			return super.compareTo(mit);
		} else {
			return 1;
		}
	}
	
	
	
	@Override
	public boolean neueVariable(Variable neu) {
		Objects.requireNonNull(neu, "Ich weigere mich eine null-Methode hinzuzufügen!");
		return variablen.add(neu);
	}
	
	
	
	@Override
	public NavigableSet <Variable> variablen() {
		return Collections.unmodifiableNavigableSet(variablen);
	}
	
	@Override
	public boolean neueFertigeMethode(FertigeMethode neu) {
		Objects.requireNonNull(neu, "Ich weigere mich eine null-Methode hinzuzufügen!");
		return fertigeMethoden.add(neu);
	}
	
	
	
	@Override
	public NavigableSet <FertigeMethode> fertigeMethoden() {
		return Collections.unmodifiableNavigableSet(fertigeMethoden);
	}
	
	@Override
	public boolean neueUnfertigeMethode(UnfertigeMethode neu) {
		Objects.requireNonNull(neu, "Ich weigere mich eine null-Methode hinzuzufügen!");
		return unfertigeMethoden.add(neu);
	}
	
	
	
	@Override
	public NavigableSet <UnfertigeMethode> unfertigeMethoden() {
		return Collections.unmodifiableNavigableSet(unfertigeMethoden);
	}
	
}
