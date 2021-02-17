package de.hechler.patrick.tps.objekte;

import java.util.Iterator;
import java.util.List;

public class Variable implements Comparable <Variable> {
	
	public final String art;
	public final String name;
	
	
	
	public Variable(String art, String name) {
		this.art = art;
		this.name = name;
	}
	
	
	
	@Override
	public int compareTo(Variable o) {
		return art.compareTo(o.art);
	}
	
	public static int compare(List <Variable> variablen, List <Variable> andereVars) {
		int erg = Integer.compare(variablen.size(), andereVars.size());
		if (erg != 0) return erg;
		Iterator <Variable> iter = variablen.iterator();
		Iterator <Variable> iter2 = andereVars.iterator();
		while (iter.hasNext() && erg == 0) {
			erg = iter.next().compareTo(iter2.next());
		}
		return erg;
	}
	
}
