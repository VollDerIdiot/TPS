package de.hechler.patrick.tps.objekte.sache;

import java.util.Set;

/**
 * Eine {@link UnfertigeSache} ist zwar noch nicht Fertig, kann dafür allerdings viele Spezifikationen hinsichtlich der Implementierung haben.
 * 
 * @author Patrick
 */
public interface UnfertigeSache {
	
	void bessert(String name);

	void dazuMacht(String name);

	Set <SachenVariable> variablen();
	
}
