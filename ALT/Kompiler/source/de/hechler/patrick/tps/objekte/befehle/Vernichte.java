package de.hechler.patrick.tps.objekte.befehle;

import de.hechler.patrick.tps.objekte.sache.Sache;

/**
 * Vernichtet das Ding welches diesen Befehl aufruft und wirft einen TodesFehler <br>
 * Kann nur von einem Ding ausgeführt werden
 * 
 * @author Patrick
 */
public class Vernichte extends Befehl {
	
	public final Sache ziel;
	
	
	
	public Vernichte(Sache sache) {
		this.ziel = sache;
	}
	
}
