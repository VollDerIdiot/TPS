package de.hechler.patrick.patischerZeichensatzt.zeichen;

import de.hechler.patrick.patischerZeichensatzt.zeichen.exeption.FalscheAnzahlBytesUmEinZeichenZuGenerieren;

public interface ZeichenInterface extends Cloneable {
	
	public char getZeichen();
	
	public int getNummer();
	
	public int benötigteBytesZumWissenWieVieleWeitereBenötigWerdenUmZuGenerieren();
	
	public int benötigteWeitereBytesZumGenerieren(byte[] bytes);
	
	public ZeichenInterface generiereVonBytes(byte[] bytes) throws FalscheAnzahlBytesUmEinZeichenZuGenerieren;
	
	public ZeichenInterface zuGroßbuchstaben();
	
	public ZeichenInterface zuKleinbuchstaben();
	
	public boolean istBuchstabe();
	
	public boolean istGroßbuchstaben();
	
	public boolean istKleinbuchstaben();
	
	public boolean istZahl();
	
	public ZeichenInterface clone();
	
}
