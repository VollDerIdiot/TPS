package de.hechler.patrick.tps.objekte.sache;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import de.hechler.patrick.tps.objekte.BefehlsBox;

/**
 * Eine {@link FertigeKlasse} ist eine statische Bibliothek aus Methoden und Variablen.
 * 
 * @author Patrick
 */
public class FertigeKlasse extends Klasse implements FertigeSache {
	
	private boolean konst;
	private String bessert;
	private BefehlsBox zuerst;
	private Set <String> macht;
	private Set <SachenVariable> vars;
	
	
	
	public FertigeKlasse(String name, boolean konstant) {
		super(name);
		this.konst = konstant;
		this.macht = new HashSet <>();
		this.vars = new HashSet <>();
	}
	
	@Override
	public boolean konstant() {
		return konst;
	}
	
	public void bessert(String name) {
		this.bessert = name;
	}
	
	@Override
	public void dazuMacht(String name) {
		macht.add(Objects.requireNonNull(name, "neuer macht name"));
	}
	
	public void zuerst(BefehlsBox zuerst) {
		this.zuerst = zuerst;
	}
	
	@Override
	public Set <SachenVariable> variablen() {
		return vars;
	}
	
}
