package de.hechler.patrick.patischerZeichensatzt.zeichen;

public interface ZeichenInterface extends Cloneable {
	
	public char getZeichen();
	
	public byte[] getNummer();
	
	public ZeichenInterface zuGroßbuchstaben();
	
	public ZeichenInterface zuKleinbuchstaben();
	
	public boolean istBuchstabe();
	
	public boolean istGroßbuchstaben();
	
	public boolean istKleinbuchstaben();
	
	public boolean istZahl();
	
	public ZeichenInterface clone();
	
}
