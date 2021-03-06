package de.hechler.patrick.tps.antlr.objects.satz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.hechler.patrick.tps.antlr.enums.SatzArt;
import de.hechler.patrick.tps.antlr.objects.Parameter;
import de.hechler.patrick.tps.antlr.objects.Satz;


public class Ausgabeoperation extends Satz {
	
	/** UID */
	private static final long serialVersionUID = 8956700752030940097L;
	
	public final Parameter ausgeben;
	
	
	
	public Ausgabeoperation(SatzArt art, Parameter ausgeben) {
		super(art, list(ausgeben));
		this.ausgeben = ausgeben;
	}
	
	private final static List <? extends Parameter> list(Parameter ausgeben) {
		if (ausgeben == null) return Collections.emptyList();
		List <Parameter> erg = new ArrayList <Parameter>(2);
		erg.add(ausgeben);
		return erg;
	}
	
	
	
	@Override
	public String toString() {
		return "AUSG:" + ausgeben.toString();
	}
	
}
