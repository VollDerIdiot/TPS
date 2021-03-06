package de.hechler.patrick.tps.antlr.objects;

import de.hechler.patrick.tps.interpreter.Interpreter;

public class Zahl implements Parameter {
	
	/** UID */
	private static final long serialVersionUID = -4057592204332834660L;
	
	private final long    zahl;
	private final Boolean erg;
	
	
	public Zahl(long wert) {
		this(wert, null);
	}
	
	public Zahl(boolean ergebnis) {
		this(0, ergebnis);
	}
	
	private Zahl(long wert, Boolean erg) {
		this.zahl = wert;
		this.erg = erg;
	}
	
	
	
	@Override
	public boolean istZeichenKette() {
		return false;
	}
	
	@Override
	public boolean istKonstante() {
		return erg == null;
	}
	
	@Override
	public boolean ergebniszahl() {
		return erg == true;
	}
	
	@Override
	public boolean zwischenzahl() {
		return erg == false;
	}
	
	@Override
	public Long zahl() {
		if (erg != null) return null;
		return zahl;
	}
	
	@Override
	public long zahl(Interpreter interpret) {
		if (erg != null) {
			if (erg) {
				return interpret.ergebnis();
			}
			return interpret.zwischenspeicher();
		}
		return zahl;
	}
	
	@Override
	public String toString() {
		if (erg != null) {
			return erg ? "[ERG]" : "[ZW]";
		} else {
			return '[' + String.valueOf(zahl) + ']';
		}
	}
	
	@Override
	public String toString(Interpreter interpret) {
		if (erg != null) {
			return String.valueOf(erg ? interpret.ergebnis() : interpret.zwischenspeicher());
		} else {
			return String.valueOf(zahl);
		}
	}
	
}
