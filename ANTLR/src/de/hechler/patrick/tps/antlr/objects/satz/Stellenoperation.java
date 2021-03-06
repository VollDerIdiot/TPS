package de.hechler.patrick.tps.antlr.objects.satz;

import java.util.ArrayList;
import java.util.List;

import de.hechler.patrick.tps.antlr.enums.SatzArt;
import de.hechler.patrick.tps.antlr.objects.Parameter;
import de.hechler.patrick.tps.antlr.objects.Satz;
import de.hechler.patrick.tps.antlr.objects.ZeichenKette;


public class Stellenoperation extends Satz {
	
	/** UID */
	private static final long serialVersionUID = 7975664368639373693L;
	
	public final ZeichenKette stelle;
	
	public Stellenoperation(SatzArt art, ZeichenKette stelle) {
		super(art, liste(stelle));
		this.stelle = stelle;
	}
	
	private final static List <? extends Parameter> liste(ZeichenKette stelle) {
		List <Parameter> erg = new ArrayList <>();
		erg.add(stelle);
		return erg;
	}
	
}
