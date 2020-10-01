package de.hechler.patrick.patischerZeichensatzt.zeichen.exeption;

import de.hechler.patrick.patischerZeichensatzt.exeption.PatrZeichenSatztExeption;

public class UnbekanntesZeichen extends RuntimeException implements PatrZeichenSatztExeption {
	
	private static final long serialVersionUID = -9191685373236852142L;
	
	public UnbekanntesZeichen(String message) {
		super(message);
	}
	
	@Override
	public String getStandardNachricht() {
		return "Dies ist ein unbekanntes Zeichen!";
	}
	
}
