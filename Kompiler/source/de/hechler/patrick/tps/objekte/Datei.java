package de.hechler.patrick.tps.objekte;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

import de.hechler.patrick.tps.objekte.sache.Sache;

/**
 * Eine Datei ist eine Ansammlung von mindestens einer Sache
 * 
 * @author Patrick
 */
public class Datei implements Iterable <Sache>{
	
	private Set <Sache> sachen;
	
	
	
	public Datei() {
		sachen = new HashSet <>();
	}
	
	
	public void neu(Sache neue) {
		sachen.add(Objects.requireNonNull(neue, "neue null Sache"));
	}
	
	@Override
	public Iterator <Sache> iterator() {
		return sachen.iterator();
	}
	
	public boolean istLeer() {
		return sachen.isEmpty();
	}
	
	public int anzahl() {
		return sachen.size();
	}
	
}
