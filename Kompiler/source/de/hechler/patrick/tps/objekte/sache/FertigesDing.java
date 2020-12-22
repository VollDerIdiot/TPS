package de.hechler.patrick.tps.objekte.sache;

/**
 * Von einem Fertigem Ding können benutzbare Instanzen erzeugt werden.
 * 
 * @author Patrick
 */
public class FertigesDing extends Ding implements FertigeSache {
	
	private boolean konst;
	
	public FertigesDing(String name, boolean konstant) {
		super(name);
		this.konst = konstant;
	}
	
	@Override
	public boolean konstant() {
		return konst;
	}
	
}
