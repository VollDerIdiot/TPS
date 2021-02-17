package de.hechler.patrick.tps.interpreter.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

import de.hechler.patrick.tps.fehler.InterpretierungsFehler;
import de.hechler.patrick.tps.interpreter.Interpreter;

public class VerbesserterTpsInterpreterImpl implements Interpreter{

	private int ergebnis;
	private int zwischen;
	private PrintStream aus;
	
	
	public VerbesserterTpsInterpreterImpl(PrintStream ausgang) {
		aus = ausgang;
	}
	
	
	@Override
	public void interpretiere(InputStream eingang, Charset zeichensatz) throws IOException, InterpretierungsFehler {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int ergebnis() {
		return ergebnis;
	}

	@Override
	public int zwischenspeicher() {
		return zwischen;
	}

	@Override
	public void ergebnis(int neu) {
		ergebnis = neu;
	}

	@Override
	public void zwischenspeicher(int neu) {
		zwischen = neu;
	}

	@Override
	public void ausgeben(Object ausgeben) {
		aus.print(ausgeben);
	}

	@Override
	public void zeilenumbruch() {
		aus.println();
	}
	
}
