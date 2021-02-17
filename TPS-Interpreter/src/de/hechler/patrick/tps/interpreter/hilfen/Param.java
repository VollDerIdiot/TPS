package de.hechler.patrick.tps.interpreter.hilfen;

import de.hechler.patrick.tps.interpreter.Interpreter;

public class Param {
	
	private final boolean istzahl;
	private final Boolean ergeb;
	private final int zahl;
	private final String wert;
	
	
	public boolean istZahl() {
		return istzahl;
	}
	
	public boolean istKonstante() {
		return istzahl && ergeb == null;
	}
	
	public boolean istString() {
		return wert != null;
	}
	
	public int zahl(Interpreter inter) {
		if ( !istzahl) throw new IllegalStateException("keine Zahl");
		else if (ergeb == null) return zahl;
		else if (ergeb) return inter.ergebnis();
		else return inter.zwischenspeicher();
	}
	
	public int zahl() {
		if ( !istzahl) throw new IllegalStateException("keine Zahl");
		else if (ergeb == null) return zahl;
		else throw new IllegalStateException("keine Konstante");
	}
	
	public String string() {
		if (wert == null) throw new IllegalStateException("keine Zahl");
		else return wert;
	}
	
	public Param(boolean ergebnisZahl) {
		this.istzahl = true;
		this.ergeb = ergebnisZahl;
		this.wert = null;
		this.zahl = 0;
	}
	
	public Param(int zahl) {
		this.istzahl = true;
		this.ergeb = null;
		this.zahl = zahl;
		this.wert = null;
	}
	
	public Param(String wert) {
		this.istzahl = false;
		this.ergeb = null;
		this.zahl = 0;
		this.wert = wert;
	}
	
	@Override
	public String toString() {
		if (istzahl) {
			if (ergeb == null) return String.valueOf(zahl);
			else return ergeb ? "ergebnis" : "zwischen";
		} else return wert;
	}
	public String toString(Interpreter inter) {
		if (istzahl) {
			if (ergeb == null) return String.valueOf(zahl);
			else return String.valueOf(ergeb ? inter.ergebnis() : inter.zwischenspeicher());
		} else return wert;
	}
	
}

