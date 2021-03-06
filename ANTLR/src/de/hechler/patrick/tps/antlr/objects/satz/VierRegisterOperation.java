package de.hechler.patrick.tps.antlr.objects.satz;

import java.util.ArrayList;
import java.util.List;

import de.hechler.patrick.tps.antlr.enums.SatzArt;
import de.hechler.patrick.tps.antlr.objects.Parameter;
import de.hechler.patrick.tps.antlr.objects.Satz;
import de.hechler.patrick.tps.antlr.objects.Zahl;


public class VierRegisterOperation extends Satz {
	
	/** UID */
	private static final long serialVersionUID = 5543158484257006703L;
	
	public final Zahl regA;
	public final Zahl regB;
	public final Zahl regC;
	public final Zahl regD;
	
	public VierRegisterOperation(SatzArt art, Zahl regA, Zahl regB, Zahl regC, Zahl regD) {
		super(art, list(regA, regB, regC, regD));
		this.regA = regA;
		this.regB = regB;
		this.regC = regC;
		this.regD = regD;
	}
	
	private static List <? extends Parameter> list(Zahl regA, Zahl regB, Zahl regC, Zahl regD) {
		List <Zahl> erg = new ArrayList <Zahl>();
		erg.add(regA);
		erg.add(regB);
		erg.add(regC);
		erg.add(regD);
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
			return regC;
		case 3:
			return regD;
		default:
			throw new IndexOutOfBoundsException("len=4 i=" + index);
		}
	}
	
}
