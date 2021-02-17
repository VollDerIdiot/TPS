package de.hechler.patrick.tps.objekte.sache;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import de.hechler.patrick.tps.objekte.BefehlsBox;
import de.hechler.patrick.tps.objekte.Variable;

public class UnfertigeKlasse extends Klasse implements UnfertigeSache {
	
	private String bessert;
	private Set <String> macht;
	private BefehlsBox zuerst;
	private Set <SachenVariable> vars;
	
	
	
	public UnfertigeKlasse(String name) {
		super(name);
		this.macht = new HashSet <>();
		this.vars = new HashSet <>();
	}
	
	
	
	@Override
	public void bessert(String name) {
		this.bessert = name;
	}
	
	@Override
	public void dazuMacht(String name) {
		this.macht.add(Objects.requireNonNull(name, "neuer macht name"));
	}
	
	public void zuerst(BefehlsBox zuerst) {
		this.zuerst = zuerst;
	}
	
	@Override
	public Set <SachenVariable> variablen() {
		return vars;
	}
	
}
