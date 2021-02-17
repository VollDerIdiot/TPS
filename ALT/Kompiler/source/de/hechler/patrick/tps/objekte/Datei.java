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
public class Datei implements Iterable <Sache> {
	
	private String ort;
	private Set <String> braucht;
	private Set <Sache> sachen;
	
	
	
	public Datei() {
		sachen = new HashSet <>();
		braucht = new HashSet <>();
	}
	
	
	
	public void neueAbhängigkeit(String braucht) {
		this.braucht.add(Objects.requireNonNull(braucht, "neues braucht"));
	}
	
	public String ort() {
		return this.ort;
	}
	
	public void ort(String ort) {
		this.ort = Objects.requireNonNull(ort, "ort");
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
