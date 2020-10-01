package de.hechler.patrick.patischerZeichensatzt.zeichen;

import de.hechler.patrick.patischerZeichensatzt.zeichen.exeption.FalscheAnzahlBytesUmEinZeichenZuGenerieren;

public abstract class ZeichenZeugs implements ZeichenInterface {
	
	public abstract int benötigteBytesZumWissenWieVieleWeitereBenötigWerdenUmZuGenerieren();
	
	public abstract int benötigteWeitereBytesZumGenerieren(byte[] bytes);
	
	public abstract ZeichenZeugs generiereVonBytes(byte[] bytes) throws FalscheAnzahlBytesUmEinZeichenZuGenerieren;
	
}
