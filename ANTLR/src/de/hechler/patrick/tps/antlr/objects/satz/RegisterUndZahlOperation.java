package de.hechler.patrick.tps.antlr.objects.satz;

import java.util.ArrayList;
import java.util.List;

import de.hechler.patrick.tps.antlr.enums.SatzArt;
import de.hechler.patrick.tps.antlr.objects.Parameter;
import de.hechler.patrick.tps.antlr.objects.Satz;
import de.hechler.patrick.tps.antlr.objects.Zahl;

public class RegisterUndZahlOperation extends Satz {
	
	public final Zahl register;
	public final Zahl zahl;
	
	public RegisterUndZahlOperation(SatzArt art, Zahl register, Zahl zahl) {
		super(art, list(register, zahl));
		this.register = register;
		this.zahl = zahl;
	}
	
	private static List <? extends Parameter> list(Zahl register, Zahl zahl) {
		List <Zahl> erg = new ArrayList <>();
		erg.add(register);
		erg.add(zahl);
		return erg;
	}
	
	@Override
	public Zahl param(int index) {
		switch (index) {
		case 0:
			return register;
		case 1:
			return zahl;
		default:
			throw new IndexOutOfBoundsException("len=2 i=" + index);
		}
	}
	
}
