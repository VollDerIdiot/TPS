package de.hechler.patrick.tps.antlr.objects;

import de.hechler.patrick.tps.antlr.InterpreterInterface;
import de.hechler.patrick.tps.interpreter.Interpreter;

public class Zahl implements Parameter {
	
	/** UID */
	private static final long serialVersionUID = -4057592204332834660L;
	
	public final long    zahl;
	public final Boolean erg;
	
	
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
	public long zahl(InterpreterInterface interpret) {
		if (erg != null) {
			if (erg) {
				return interpret.ergebnis();
			}
			return interpret.zwischen();
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( (erg == null) ? 0 : erg.hashCode());
		result = prime * result + (int) (zahl ^ (zahl >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Zahl other = (Zahl) obj;
		if (erg == null) {
			if (other.erg != null) return false;
		} else if ( !erg.equals(other.erg)) return false;
		if (zahl != other.zahl) return false;
		return true;
	}
	
}
