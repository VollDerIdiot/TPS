package de.hechler.patrick.tps.objekte.sache;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Von einem Fertigem Ding können benutzbare Instanzen erzeugt werden.
 * 
 * @author Patrick
 */
public class FertigesDing extends Ding implements FertigeSache {
	
	private boolean konst;
	private String bessert;
	private Set <String> macht;
	private Set <SachenVariable> vars;
	
	public FertigesDing(String name, boolean konstant) {
		super(name);
		this.konst = konstant;
		this.macht = new HashSet <>();
		this.vars = new HashSet <>();
	}
	
	@Override
	public boolean konstant() {
		return konst;
	}
	
	@Override
	public void bessert(String name) {
		bessert = name;
	}
	
	@Override
	public void dazuMacht(String name) {
		macht.add(Objects.requireNonNull(name, "neuer macht name"));
	}
	
	@Override
	public Set <SachenVariable> variablen() {
		return vars;
	}
	
}
