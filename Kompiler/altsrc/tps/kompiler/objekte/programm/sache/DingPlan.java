package tps.kompiler.objekte.programm.sache;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeSet;

import de.hechler.patrick.tps.hilfen.Hilfen;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Datentyp;
import tps.kompiler.objekte.programm.UnfertigeMethode;

public class DingPlan extends Sache implements PlanInterface {
	
	private NavigableSet <UnfertigeMethode> methoden;
	
	
	
	public DingPlan(Datentyp name, Sichtbarkeit sicht, boolean konstant) {
		super(name, sicht, konstant);
		methoden = new TreeSet <UnfertigeMethode>(Hilfen.vergleicherKeineNull());
	}
	
	
	
	@Override
	public boolean neueUnfertigeMethode(UnfertigeMethode neu) {
		Objects.requireNonNull(neu, "Ich werde keine neue null methode hinzufügen!");
		return methoden.add(neu);
	}
	
	
	
	@Override
	public NavigableSet <UnfertigeMethode> unfertigeMethoden() {
		return Collections.unmodifiableNavigableSet(methoden);
	}
	
	@Override
	public int compareTo(Sache mit) {
		if (mit instanceof Ding) {
			return 1;
		} else if (mit instanceof DingPlan) {
			return super.compareTo(mit);
		} else {
			return -1;
		}
	}
	
}
