package de.hechler.patrick.tps.antlr.objects;

import de.hechler.patrick.tps.interpreter.Interpreter;

public class ZeichenKette implements Parameter {
	
	public static final ZeichenKette LEERZEICHEN = new ZeichenKette(" ");
	public static final ZeichenKette LEERZEILE   = new ZeichenKette("\r\n");
	
	
	
	public final String wert;
	
	
	
	public ZeichenKette(String wert) {
		this.wert = wert;
	}
	
	
	
	@Override
	public boolean istZeichenKette() {
		return true;
	}
	
	@Override
	public boolean istKonstante() {
		return false;
	}
	
	@Override
	public boolean ergebniszahl() {
		return false;
	}
	
	@Override
	public boolean zwischenzahl() {
		return false;
	}
	
	@Override
	public Long zahl() {
		return null;
	}
	
	@Override
	public long zahl(Interpreter interpret) {
		throw new UnsupportedOperationException("Dies ist eine ZeichenKette und keine Zahl!");
	}
	
	@Override
	public String toString() {
		return wert;
	}
	
	
	
	@Override
	public String toString(Interpreter interpret) {
		return wert;
	}
	
}
