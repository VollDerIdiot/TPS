package de.hechler.patrick.tps.antlr.objects.satz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.hechler.patrick.tps.antlr.enums.SatzArt;
import de.hechler.patrick.tps.antlr.objects.Parameter;
import de.hechler.patrick.tps.antlr.objects.Satz;
import de.hechler.patrick.tps.antlr.objects.ZeichenKette;

public class ZeichenKettenoperation extends Satz {
	
	/** UID */
	private static final long serialVersionUID = 3640909949422818296L;
	
	public final ZeichenKette zk;
	
	
	
	public ZeichenKettenoperation(SatzArt art, ZeichenKette zk) {
		super(art, list(zk));
		this.zk = zk;
	}
	
	private final static List <? extends Parameter> list(Parameter ausgeben) {
		if (ausgeben == null) return Collections.emptyList();
		List <Parameter> erg = new ArrayList <Parameter>(2);
		erg.add(ausgeben);
		return erg;
	}
	
	
	
	@Override
	public String toString() {
		return zk.toString();
	}
	
}