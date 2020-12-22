package de.hechler.patrick.tps.objekte.sache;

/**
 * Eine {@link FertigeKlasse} ist eine statische Bibliothek aus Methoden und Variablen.
 * 
 * @author Patrick
 */
public class FertigeKlasse extends Klasse implements FertigeSache {
	
	private boolean konst;
	
	public FertigeKlasse(String name, boolean konstant) {
		super(name);
		this.konst = konstant;
	}
	
	@Override
	public boolean konstant() {
		return konst;
	}
	
}
