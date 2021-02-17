package de.hechler.patrick.tps.objekte;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import de.hechler.patrick.tps.objekte.befehle.Befehl;

public class BefehlsBox {
	
	private List <Befehl> befehle;
	private Map <String, Variable> vars;
	
	public BefehlsBox() {
		befehle = new ArrayList <>();
	}
	
	
	
	public void neu(Variable var) {
		Objects.requireNonNull(var, "neuer null Befehl");
		vars.put(var.name, var);
	}
	
	public void neu(Befehl befehl) {
		Objects.requireNonNull(befehl, "neuer null Befehl");
		befehle.add(befehl);
	}
	
	public Befehl von(int index) {
		return befehle.get(index);
	}
	
	public int anzahlVars() {
		return vars.size();
	}
	
	public boolean harKeineVariablen() {
		return vars.isEmpty();
	}
	
	public int anzahlBedehle() {
		return befehle.size();
	}
	
	public boolean harKeineBefehler() {
		return befehle.isEmpty();
	}
	
	
	
	public boolean hatVariable(String name) {
		return vars.containsKey(Objects.requireNonNull(name, "null search"));
	}
	
}
