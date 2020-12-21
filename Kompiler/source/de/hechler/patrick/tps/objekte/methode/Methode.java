package de.hechler.patrick.tps.objekte.methode;

import java.util.Objects;

import de.hechler.patrick.tps.objekte.BefehlsBox;

public class Methode implements Comparable <Methode> {
	
	public final MethodenKopf kopf;
	public final BefehlsBox befehle;
	
	
	
	public Methode(MethodenKopf kopf, BefehlsBox befehle) {
		this.kopf = Objects.requireNonNull(kopf, "kopf der Methode");
		this.befehle = befehle == null ? new BefehlsBox() : befehle;
	}
	
	public Methode(MethodenKopf kopf) {
		this(kopf, null);
	}
	
	
	
	@Override
	public int compareTo(Methode o) {
		return kopf.compareTo(o.kopf);
	}
	
}
