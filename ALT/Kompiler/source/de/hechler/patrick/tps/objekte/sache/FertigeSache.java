package de.hechler.patrick.tps.objekte.sache;

import java.util.Set;

/**
 * Eine {@link FertigeSache} ist voll einsatzfähig
 * 
 * @author Patrick
 */
public interface FertigeSache {
	
	boolean konstant();
	
	void bessert(String name);

	void dazuMacht(String name);

	Set <SachenVariable> variablen();
	
}
