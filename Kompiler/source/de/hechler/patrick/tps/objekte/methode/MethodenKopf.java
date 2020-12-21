package de.hechler.patrick.tps.objekte.methode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MethodenKopf implements Comparable <MethodenKopf> {
	/**
	 * Der name der Methode
	 */
	public final String name;
	/**
	 * Die Übergabeparameter der Methode
	 */
	public final List <Parameter> parameter;
	
	
	
	public MethodenKopf(String name, List <Parameter> parameter) {
		this.name = Objects.requireNonNull(name, "name");
		this.parameter = Collections.unmodifiableList(new ArrayList <>(Objects.requireNonNull(parameter, "parameter")));
	}
	
	@Override
	public int compareTo(MethodenKopf o) {
		int erg = name.compareTo(o.name);
		return erg == 0 ? Parameter.compare(parameter, o.parameter) : erg;
	}
	
	public int compareTo(Methode o) {
		return compareTo(o.kopf);
	}
	
}
