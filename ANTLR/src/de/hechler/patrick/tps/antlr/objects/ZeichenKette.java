package de.hechler.patrick.tps.antlr.objects;

public class ZeichenKette implements Parameter {
	
	/** UID */
	private static final long serialVersionUID = 6011897096044249326L;
	
	
	
	public static transient final ZeichenKette LEERZEICHEN = new ZeichenKette(" ");
	public static transient final ZeichenKette LEERZEILE   = new ZeichenKette("\r\n");
	
	
	
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
	public String toString() {
		return wert;
	}
	
	@Override
	public String zeichenKette() {
		return wert;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ( (wert == null) ? 0 : wert.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		ZeichenKette other = (ZeichenKette) obj;
		if (wert == null) {
			if (other.wert != null) return false;
		} else if ( !wert.equals(other.wert)) return false;
		return true;
	}
	
}
