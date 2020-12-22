package de.hechler.patrick.tps.objekte.sache;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UnfertigeKlasse extends Klasse implements UnfertigeSache {
	
	private String bessert;
	private Set <String> macht;
	
	
	
	public UnfertigeKlasse(String name) {
		super(name);
		this.macht = new HashSet <>();
	}
	
	
	
	@Override
	public void bessert(String name) {
		this.bessert = name;
	}
	
	@Override
	public void dazuMacht(String name) {
		this.macht.add(Objects.requireNonNull(name, "neuer macht name"));
	}
	
}
