package de.hechler.patrick.tps.objekte.sache;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import de.hechler.patrick.tps.hilfen.Regeln;
import de.hechler.patrick.tps.konstanten.Sichtbarkeit;

/**
 * Eine Sache kann quasi alles sein
 * 
 * @author Patrick
 */
public abstract class Sache implements Comparable <Sache> {
	
	public final String name;
	private Sichtbarkeit sicht;
	private Set <String> bessert;
	
	
	public Sache(String name) {
		this.name = Objects.requireNonNull(name, "name");
		bessert = new HashSet <String>();
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		return compareTo((Sache) obj) == 0;
	}
	
	
	/**
	 * Vergleicht nur die Sachenart <br>
	 * Es ist stark empfohlen diese Methode zu überladen und als erstes {@code super.compareTo(o)} aufzurufen, wenn dies 0 ist dann ist gesichert, dass entweder beide eine
	 * Unbekannte Sachenart sind oder beider die gleiche Sachenart. <br>
	 * 
	 * Bekannte Sachenarten sind: <code> Klasse, Ding, KlassenPlan, UnfertigeKlasse, FertigeKlasse, DingPlan, UnfertigesDing, FertigesDing </code>
	 */
	@Override
	public int compareTo(Sache o) {
		int i = -1;
		if (this instanceof Klasse) {
			i = 0;
			if (this instanceof KlassenPlan) i = 1;
			else if (this instanceof UnfertigeKlasse) i = 2;
			else if (this instanceof FertigeKlasse) i = 3;
		}
		if (this instanceof Ding) {
			i = 4;
			if (this instanceof DingPlan) i = 5;
			else if (this instanceof UnfertigesDing) i = 6;
			else if (this instanceof FertigesDing) i = 7;
		}
		int a = -1;
		if (o instanceof Klasse) {
			a = 0;
			if (o instanceof KlassenPlan) a = 1;
			else if (o instanceof UnfertigeKlasse) a = 2;
			else if (o instanceof FertigeKlasse) a = 3;
		}
		if (o instanceof Ding) {
			a = 4;
			if (o instanceof DingPlan) a = 5;
			else if (o instanceof UnfertigesDing) a = 6;
			else if (o instanceof FertigesDing) a = 7;
		}
		return Integer.compare(i, a);
	}
	
	public void sichtbarkeit(Sichtbarkeit sicht) {
		this.sicht = Objects.requireNonNull(sicht, "sicht");
	}
	
	public void dazuBessert(String name) {
		bessert.add(Regeln.testeName(name, new RuntimeException("darf hier eigentlich nicht mehr passieren!"), Collections.emptySet()));
	}
	
}
