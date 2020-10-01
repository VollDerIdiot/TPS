package de.hechler.patrick.patischerZeichensatzt.zeichen.exeption;

import de.hechler.patrick.patischerZeichensatzt.exeption.PatrZeichenSatztExeption;

public class FalscheAnzahlBytesUmEinZeichenZuGenerieren extends Exception implements PatrZeichenSatztExeption {
	
	private static final long serialVersionUID = 7134848679773446894L;
	
	private static final String STANDARD_NACHRICHT_TEILA = "Beim generieren eines Zeichen wurden ";
	private static final String STANDARD_NACHRICHT_TEILB = " bytes übergeben.";
	
	
	
	public FalscheAnzahlBytesUmEinZeichenZuGenerieren(int zuViele) {
		super(STANDARD_NACHRICHT_TEILA + zuViele + " zu viele" + STANDARD_NACHRICHT_TEILB);
	}
	
	
	
	public FalscheAnzahlBytesUmEinZeichenZuGenerieren(String nachricht) {
		super(nachricht);
	}
	
	@Override
	public String getStandardNachricht() {
		return STANDARD_NACHRICHT_TEILA + "zu viele/wenige" + STANDARD_NACHRICHT_TEILB;
	}
	
}
