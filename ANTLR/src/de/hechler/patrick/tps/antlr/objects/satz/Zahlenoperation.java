package de.hechler.patrick.tps.antlr.objects.satz;

import java.util.ArrayList;
import java.util.List;

import de.hechler.patrick.tps.antlr.enums.SatzArt;
import de.hechler.patrick.tps.antlr.objects.Parameter;
import de.hechler.patrick.tps.antlr.objects.Satz;
import de.hechler.patrick.tps.antlr.objects.Zahl;

public class Zahlenoperation extends Satz {
	
	public final Zahl b;
	public final Zahl a;
	
	
	
	public Zahlenoperation(SatzArt art, Zahl a, Zahl b) {
		super(art, list(a, b));
		this.a = a;
		this.b = b;
	}
	
	private static final List <? extends Parameter> list(Zahl a, Zahl b) {
		List <Parameter> erg = new ArrayList <Parameter>(2);
		erg.add(a);
		erg.add(b);
		return erg;
	}
	
	@Override
	public Parameter param(int index) {
		switch (index) {
		case 0:
			return a;
		case 1:
			return b;
		default:
			throw new IndexOutOfBoundsException("index out of bounds: " + index + " possible: 0,1");
		}
	}
	
	
	
}
