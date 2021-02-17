package de.hechler.patrick.tps.interpreter.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import de.hechler.patrick.tps.fehler.InterpretierungsFehler;
import de.hechler.patrick.tps.hilfen.objects.fehler.NochNichtGemachtFehler;
import de.hechler.patrick.tps.interpreter.Interpreter;
import de.hechler.patrick.tps.interpreter.hilfen.Anordnung;
import de.hechler.patrick.tps.interpreter.hilfen.BefehlEnum;

public class VerbesserterTpsInterpreterImpl implements Interpreter {
	
	private int ergebnis;
	private int zwischen;
	private PrintStream aus;
	
	
	public VerbesserterTpsInterpreterImpl(PrintStream ausgang) {
		aus = ausgang;
	}
	
	@Override
	public void interpretiere(InputStream eingang, Charset zeichensatz) throws IOException, InterpretierungsFehler {
		List <List <String>> sätze = lese(eingang, zeichensatz);
		baue(sätze);
		
		
		
		throw new NochNichtGemachtFehler();
	}
	
	private void baue(List <List <String>> sätze) {
		Anordnung[] anordnungen = new Anordnung[sätze.size()];
		int index = 0;
		for (List <String> satz : sätze) {
			anordnungen[index] = new Anordnung();
			Anordnung anordnung = anordnungen[index ++ ];
			
			Iterator <String> iter = satz.iterator();
			String zw = iter.next();
			Set <BefehlEnum> befs = BefehlEnum.get(zw);
			while (iter.hasNext()) {
				zw = iter.next();
				BefehlEnum.teste(zw, index, befs);
			}
//			TODO Befehl nehmen
//			TODO weitermachen
			
		}
		throw new NochNichtGemachtFehler();
	}
	
	private List <List <String>> lese(InputStream eingang, Charset zeichensatz) {
		try (Scanner leser = new Scanner(eingang, zeichensatz)) {
			List <List <String>> sätze;
			sätze = new ArrayList <List <String>>();
			List <String> zw = new ArrayList <String>();
			while (leser.hasNext()) {
				String neu = leser.next();
				if (neu.endsWith(".")) {
					neu = neu.substring(0, neu.length() - 1);
					zw.add(neu);
					sätze.add(zw);
					zw = new ArrayList <String>();
					continue;
				}
				zw.add(neu);
			}
			return sätze;
		}
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
