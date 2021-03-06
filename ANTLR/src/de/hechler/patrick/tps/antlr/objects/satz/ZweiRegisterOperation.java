package de.hechler.patrick.tps.antlr.objects.satz;

import java.util.ArrayList;
import java.util.List;

import de.hechler.patrick.tps.antlr.enums.SatzArt;
import de.hechler.patrick.tps.antlr.objects.Parameter;
import de.hechler.patrick.tps.antlr.objects.Satz;
import de.hechler.patrick.tps.antlr.objects.Zahl;


public class ZweiRegisterOperation extends Satz {
	
	public final Zahl regA;
	public final Zahl regB;

	public ZweiRegisterOperation(SatzArt art, Zahl regA, Zahl regB) {
		super(art, list(regA, regB));
		this.regA = regA;
		this.regB = regB;
	}
	
	private final static List <? extends Parameter> list(Zahl regA, Zahl regB) {
		List <Zahl> erg = new ArrayList <Zahl>();
		erg.add(regA);
		erg.add(regB);
		return erg;
	}
	
	
	
	@Override
	public Parameter param(int index) {
		switch (index) {
		case 0 :
			return regA;
		case 1 :
			return regB;
		default:
			throw new IndexOutOfBoundsException("len=2 i=" + index);
		}
	}
	
}
