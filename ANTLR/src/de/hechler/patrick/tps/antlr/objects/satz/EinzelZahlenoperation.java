package de.hechler.patrick.tps.antlr.objects.satz;

import java.util.ArrayList;
import java.util.List;

import de.hechler.patrick.tps.antlr.enums.SatzArt;
import de.hechler.patrick.tps.antlr.objects.Parameter;
import de.hechler.patrick.tps.antlr.objects.Satz;
import de.hechler.patrick.tps.antlr.objects.Zahl;


public class EinzelZahlenoperation extends Satz {
	
	/** UID */
	private static final long serialVersionUID = -5884012498384168679L;
	
	public final Zahl zahl;
	
	
	
	public EinzelZahlenoperation(SatzArt art, Zahl zahl) {
		super(art, list(zahl));
		this.zahl = zahl;
	}
	
	private static List <? extends Parameter> list(Zahl zahl) {
		List <Zahl> erg = new ArrayList <Zahl>(1);
		erg.add(zahl);
		return erg;
	}
	
}
