package de.hechler.patrick.tps.objekte.sache;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

import de.hechler.patrick.tps.objekte.methode.MethodenKopf;

/**
 * Ein {@link DingPlan} kann noch nicht Instanziiert werden, da er nur der Plan dafür ist und noch nichts Implementiert wurde.
 * 
 * @author Patrick
 */
public class DingPlan extends Ding implements SachenPlan, Iterable <MethodenKopf> {
	
	private Set <MethodenKopf> methoden;
	
	public DingPlan(String name) {
		super(name);
		this.methoden = new HashSet <>();
	}
	
	
	
	public void neu(MethodenKopf neuer) {
		methoden.add(Objects.requireNonNull(neuer, "neuer null MethodenKopf"));
	}
	
	@Override
	public Iterator <MethodenKopf> iterator() {
		return methoden.iterator();
	}
	
	public boolean istLeer() {
		return methoden.isEmpty();
	}
	
}
