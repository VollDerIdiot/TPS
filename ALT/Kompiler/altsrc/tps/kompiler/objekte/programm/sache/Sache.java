package tps.kompiler.objekte.programm.sache;

import java.util.Objects;

import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Datentyp;

public abstract class Sache implements Comparable <Sache> {
	
	public final Datentyp name;
	public final Sichtbarkeit sicht;
	public final boolean konstant;
	
	
	public Sache(Datentyp name, Sichtbarkeit sicht, boolean konstant) {
		this.name = Objects.requireNonNull(name, "Ich weigere mich null zu heißen!");
		this.sicht = sicht == null ? Sichtbarkeit.offen : sicht;
		this.konstant = konstant;
	}
	
	
	
	@Override
	public int compareTo(Sache mit) {
		return name.name.compareTo(mit.name.name);
	}
	
}
