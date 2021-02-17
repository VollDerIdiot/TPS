package de.hechler.patrick.tps.fehler;

import java.util.Collection;
import java.util.Map;

public class UnbekannteStellenFehler extends InterpretierungsFehler {
	
	/** UID */
	private static final long serialVersionUID = 737262361977012549L;
	
	public UnbekannteStellenFehler(Map <String, Integer> bekannt, Collection <String> benötigt) {
		super("Es gibt unbekannte Stellen: bekannt=" + bekannt + " und benötigt=" + benötigt);
	}
	
	public UnbekannteStellenFehler(String nachricht) {
		super(nachricht);
	}
	
}
