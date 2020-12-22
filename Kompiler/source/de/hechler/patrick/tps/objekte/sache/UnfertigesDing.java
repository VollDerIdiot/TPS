package de.hechler.patrick.tps.objekte.sache;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Ein {@link UnfertigesDing} ist nicht direkt Instantiierbar, kann aber bereits starke Spezifizierungen hinsichtlich der Implementierung haben.
 * 
 * @author Patrick
 */
public class UnfertigesDing extends Ding implements UnfertigeSache {
	
	private String bessert;
	private Set <String> macht;
	
	
	
	public UnfertigesDing(String name) {
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
