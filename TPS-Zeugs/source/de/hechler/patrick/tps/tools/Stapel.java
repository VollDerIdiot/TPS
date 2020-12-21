package de.hechler.patrick.tps.tools;

import java.lang.reflect.Array;

public class Stapel <W> {
	
	private static final int STANDARD = 8;
	
	
	
	private W[] werte;
	private int wachsen;
	private int schrunpfen;
	private int schrunpfenAuf;
	private int anz;
	
	
	
	public Stapel(W[] egal) {
		this(egal, 0, 0, STANDARD, STANDARD, STANDARD >> 1);
	}
	
	public Stapel(W[] start, int von, int bis, int wachsen, int schrumpfen, int schrumpfenAuf) {
		this.wachsen = wachsen;
		this.schrunpfen = schrumpfen;
		this.schrunpfenAuf = schrumpfenAuf;
		this.anz = 0;
		this.werte = neuesFeld(start, von, bis, wachsen);
	}
	
	
	
	private final W[] neuesFeld(W[] ursprung, int von, int bis, int zusatz) {
		@SuppressWarnings("unchecked")
		W[] erg = (W[]) Array.newInstance(ursprung.getClass().componentType(), bis - von + zusatz);
		System.arraycopy(ursprung, von, erg, 0, bis - von);
		return erg;
	}
	
	
	
	public void push(W push) {
		if (anz == werte.length - 1) {
			werte = neuesFeld(werte, 0, werte.length, wachsen);
		}
		werte[anz ++ ] = push;
	}
	
	public W pop() {
		if (anz == werte.length - schrunpfen) {
			werte = neuesFeld(werte, 0, anz, schrunpfenAuf);
		}
		W erg = werte[ -- anz];
		werte[anz] = null;
		return erg;
	}
	
	public int anzahl() {
		return anz;
	}
	
	public boolean istLeer() {
		return anz == 0;
	}
	
	public void allesWeg() {
		werte = neuesFeld(werte, 0, 0, wachsen);
	}
	
}
