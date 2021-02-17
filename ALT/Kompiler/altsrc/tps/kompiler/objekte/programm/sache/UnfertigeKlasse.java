package tps.kompiler.objekte.programm.sache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

import de.hechler.patrick.tps.hilfen.Hilfen;
import tps.kompiler.objekte.fehler.KompilierungsLaufzeitFehler;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Befehl;
import tps.kompiler.objekte.programm.Datentyp;
import tps.kompiler.objekte.programm.FertigeMethode;
import tps.kompiler.objekte.programm.UnfertigeMethode;
import tps.kompiler.objekte.programm.Variable;

public class UnfertigeKlasse extends Sache implements UnfertigeSacheInterface {
	
	private NavigableMap <Variable, Sichtbarkeit> variablen;
	private NavigableSet <FertigeMethode> fertigeMethoden;
	private NavigableSet <UnfertigeMethode> unfertigeMethoden;
	private List <Befehl> startMethode;
	
	public UnfertigeKlasse(Datentyp name, Sichtbarkeit sicht, boolean konstant) {
		super(name, sicht, konstant);
		unfertigeMethoden = new TreeSet <UnfertigeMethode>(Hilfen.vergleicherKeineNull());
		fertigeMethoden = new TreeSet <FertigeMethode>(Hilfen.vergleicherKeineNull());
		variablen = new TreeMap <Variable, Sichtbarkeit>(Hilfen.vergleicherKeineNull());
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
	public boolean neueVariable(Variable neu, Sichtbarkeit sicht) {
		Objects.requireNonNull(neu, "Ich weigere mich eine null-Methode hinzuzufügen!");
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
	
	/**
	 * Initialisiert die {@link #startMethode} mit den übergebenen {@code befehle}n.
	 * 
	 * @param befehle
	 *            Die {@link Befehl}e, welche in der Start Methode sind.
	 */
	public void startMethode(Collection <Befehl> befehle) {
		Objects.requireNonNull(befehle, "Ich weigere mich meine startMethode zu löschen");
		if (startMethode != null) {
			throw new KompilierungsLaufzeitFehler("Ich kann keine zwei start Methoden haben und ich habe mich entschieden, dass ich meine erste nicht wegwerfen will!");
		}
		startMethode = new ArrayList <Befehl>(befehle);
	}
	
	public List <Befehl> startMethode() {
		return Collections.unmodifiableList(startMethode);
	}
	
}
