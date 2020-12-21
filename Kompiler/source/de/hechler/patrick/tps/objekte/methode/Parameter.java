package de.hechler.patrick.tps.objekte.methode;

import java.util.Iterator;
import java.util.List;

import de.hechler.patrick.tps.objekte.sache.Sache;

public class Parameter implements Comparable <Parameter> {
	
	public final Sache art;
	public final String name;
	
	
	
	public Parameter(Sache art, String name) {
		this.art = art;
		this.name = name;
	}
	
	
	
	@Override
	public int compareTo(Parameter o) {
		return art.compareTo(o.art);
	}
	
	public static int compare(List <Parameter> parameter, List <Parameter> parameter2) {
		int erg = Integer.compare(parameter.size(), parameter2.size());
		if (erg != 0) return erg;
		Iterator <Parameter> iter = parameter.iterator();
		Iterator <Parameter> iter2 = parameter2.iterator();
		while (iter.hasNext() && erg == 0) {
			erg = iter.next().compareTo(iter2.next());
		}
		return erg;
	}
	
}
