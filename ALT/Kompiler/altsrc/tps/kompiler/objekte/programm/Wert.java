package tps.kompiler.objekte.programm;

import java.math.BigInteger;

public class Wert {
	
	private DirekterWert dir;
	private String varRohName;
	private String[] wertPfad;
	
	
	
	public Wert(long zahl) {
		dir = new DirekterWert(zahl);
	}
	
	public Wert(BigInteger zahl) {
		dir = new DirekterWert(zahl);
	}
	
	
	
	public boolean istZahl() {
		return dir != null && dir.zeichenKette == null;
	}
	
	public boolean istKleineZahl() {
		return dir != null && dir.zeichenKette == null && dir.großeZahl == null;
	}
	
	public long kleineZahl() {
		return dir.zahl;
	}
	
	public BigInteger großeZahl() {
		return dir.großeZahl;
	}
	
	public CharSequence zeichenKette() {
		return dir.zeichenKette;
	}
	
	private class DirekterWert {
		
		private long zahl;
		private BigInteger großeZahl;
		private CharSequence zeichenKette;
		
		private DirekterWert(CharSequence zeichenKette) {
			this.zeichenKette = zeichenKette;
		}
		
		private DirekterWert(long zahl) {
			this.zahl = zahl;
		}
		
		private DirekterWert(BigInteger zahl) {
			großeZahl = zahl;
		}
		
	}
	
}
