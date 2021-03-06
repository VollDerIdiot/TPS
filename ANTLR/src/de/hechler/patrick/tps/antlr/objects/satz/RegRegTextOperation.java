package de.hechler.patrick.tps.antlr.objects.satz;

import java.util.ArrayList;
import java.util.List;

import de.hechler.patrick.tps.antlr.enums.SatzArt;
import de.hechler.patrick.tps.antlr.objects.Parameter;
import de.hechler.patrick.tps.antlr.objects.Satz;
import de.hechler.patrick.tps.antlr.objects.Zahl;
import de.hechler.patrick.tps.antlr.objects.ZeichenKette;


public class RegRegTextOperation extends Satz {
	
	/** UID */
	private static final long serialVersionUID = 3514634431886310440L;
	
	public final Zahl         regA;
	public final Zahl         regB;
	public final ZeichenKette text;
	
	public RegRegTextOperation(SatzArt art, Zahl regA, Zahl regB, ZeichenKette text) {
		super(art, list(regA, regB, text));
		this.regA = regA;
		this.regB = regB;
		this.text = text;
	}
	
	private final static List <? extends Parameter> list(Zahl regA, Zahl regB, ZeichenKette text) {
		List <Parameter> erg = new ArrayList <Parameter>();
		erg.add(regA);
		erg.add(regB);
		erg.add(text);
		return erg;
	}
	
	
	@Override
	public Parameter param(int index) {
		switch (index) {
		case 0:
			return regA;
		case 1:
			return regB;
		case 2:
			return text;
		default:
			throw new IndexOutOfBoundsException("len=3 i=" + index);
		}
	}
	
}
