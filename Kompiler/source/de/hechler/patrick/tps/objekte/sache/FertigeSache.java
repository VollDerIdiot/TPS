package de.hechler.patrick.tps.objekte.sache;

/**
 * Eine {@link FertigeSache} ist voll einsatzfähig
 * 
 * @author Patrick
 */
public interface FertigeSache {
	
	boolean konstant();
	
	void bessert(String name);

	void dazuMacht(String name);
	
}
