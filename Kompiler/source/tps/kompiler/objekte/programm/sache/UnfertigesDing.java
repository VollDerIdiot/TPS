package tps.kompiler.objekte.programm.sache;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import tps.hilfen.Hilfen;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Datentyp;
import tps.kompiler.objekte.programm.Erschaffe;
import tps.kompiler.objekte.programm.FertigeMethode;
import tps.kompiler.objekte.programm.UnfertigeMethode;
import tps.kompiler.objekte.programm.Variable;

public class UnfertigesDing extends Sache implements UnfertigeSacheInterface {
	
	private NavigableMap <Variable, Sichtbarkeit> variablen;
	private NavigableSet <FertigeMethode> fertigeMethoden;
	private NavigableSet <UnfertigeMethode> unfertigeMethoden;
	private Set <Erschaffe> erschaffe;
	
	public UnfertigesDing(Datentyp name, Sichtbarkeit sicht, boolean konstant) {
		super(name, sicht, konstant);
		unfertigeMethoden = new TreeSet <UnfertigeMethode>(Hilfen.vergleicherKeineNull());
		fertigeMethoden = new TreeSet <FertigeMethode>(Hilfen.vergleicherKeineNull());
		variablen = new TreeMap <Variable, Sichtbarkeit>(Hilfen.vergleicherKeineNull());
		erschaffe = new TreeSet <Erschaffe>(Hilfen.vergleicherKeineNull());
	}
	
	
	
	@Override
	public int compareTo(Sache mit) {
		if (mit instanceof Ding || mit instanceof DingPlan) {
			return 1;
		} else if (mit instanceof UnfertigesDing) {
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
	
	
	
	public boolean neueErschaffe(Erschaffe neu) {
		Objects.requireNonNull(neu, "Ich weigere mich eine null-Methode hinzuzufügen!");
		return erschaffe.add(neu);
	}
	
}
