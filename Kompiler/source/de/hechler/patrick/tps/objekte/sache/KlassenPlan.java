package de.hechler.patrick.tps.objekte.sache;

import java.util.HashSet;
import java.util.Set;

/**
 * Ein {@link KlassenPlan} ist eine Ansammlung aus statischen nicht-implementierten Methoden.
 * 
 * @author Patrick
 */
public class KlassenPlan extends Klasse implements SachenPlan {
	
	private Set <String> bessert;
	
	
	
	public KlassenPlan(String name) {
		super(name);
		this.bessert = new HashSet <>();
	}
	
	
	
	@Override
	public void dazuBessert(String name) {
		bessert.add(name);
	}
	
}
