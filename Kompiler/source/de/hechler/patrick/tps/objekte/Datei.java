package de.hechler.patrick.tps.objekte;

import java.util.HashSet;
import java.util.Set;

import de.hechler.patrick.tps.objekte.sache.Sache;

/**
 * Eine Datei ist eine Ansammlung von mindestens einer Sache
 * 
 * @author Patrick
 */
public class Datei {
	
	private Set <Sache> sachen;
	
	
	
	public Datei() {
		sachen = new HashSet <>();
	}
	
}
