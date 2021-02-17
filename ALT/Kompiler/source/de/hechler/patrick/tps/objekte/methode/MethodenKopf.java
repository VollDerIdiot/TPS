package de.hechler.patrick.tps.objekte.methode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import de.hechler.patrick.tps.objekte.Variable;

public class MethodenKopf implements Comparable <MethodenKopf> {
	
	/**
	 * Der name der Methode
	 */
	public final String name;
	/**
	 * Die Übergabeparameter der Methode
	 */
	public final List <Variable> parameter;
	
	
	
	public MethodenKopf(String name, List <Variable> parameter) {
		this.name = Objects.requireNonNull(name, "name");
		this.parameter = Collections.unmodifiableList(new ArrayList <>(Objects.requireNonNull(parameter, "parameter")));
	}
	
	
	
	@Override
	public int compareTo(MethodenKopf o) {
		int erg = name.compareTo(o.name);
		return erg == 0 ? Variable.compare(parameter, o.parameter) : erg;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( ! (obj instanceof MethodenKopf)) return false;
		return compareTo((MethodenKopf) obj) == 0;
	}
	
}
