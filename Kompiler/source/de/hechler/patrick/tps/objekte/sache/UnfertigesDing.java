package de.hechler.patrick.tps.objekte.sache;

/**
 * Ein {@link UnfertigesDing} ist nicht direkt Instantiierbar, kann aber bereits starke Spezifizierungen hinsichtlich der Implementierung haben.
 * 
 * @author Patrick
 */
public class UnfertigesDing extends Ding implements UnfertigeSache {
	
	public UnfertigesDing(String name) {
		super(name);
	}
	
}
