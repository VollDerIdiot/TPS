package de.hechler.patrick.tps.interpreter.impl;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import de.hechler.patrick.tps.fehler.InterpretierungsFehler;
import de.hechler.patrick.tps.interpreter.Interpreter;
import de.hechler.patrick.tps.interpreter.Version;
import de.hechler.patrick.tps.interpreter.hilfen.BefehlEnum;
import de.hechler.patrick.tps.interpreter.hilfen.SatzLeser;

@Version(value = 1)
public class TpsInterpreterImpl implements Interpreter {
	
	private static TpsInterpreterImpl instanz = new TpsInterpreterImpl();
	
	
	private int ergebnis;
	private int zwischen;
	
	private TpsInterpreterImpl() {
	}
	
	public static TpsInterpreterImpl instanz() {
		return instanz;
	}
	
	public static void reset() {
		instanz = new TpsInterpreterImpl();
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
		System.out.print(ausgeben);
	}
	
	@Override
	public void zeilenumbruch() {
		System.out.println();
	}
	
	@Override
	public void interpretiere(InputStream eingang, Charset zeichensatz) throws IOException, InterpretierungsFehler {
		try (SatzLeser leser = new SatzLeser(new Scanner(eingang, zeichensatz))) {
			while (leser.hasNext()) {
				String befehlsteil = leser.next();
				Set <BefehlEnum> befehle = BefehlEnum.get(befehlsteil);
				int index = 1;
				List <String> befehl = new ArrayList <String>();
				BefehlEnum bef = null;
				befehl.add(befehlsteil);
				while (leser.hasNext() && !befehle.isEmpty()) {
					befehlsteil = leser.next();
					befehl.add(befehlsteil);
					BefehlEnum.teste(befehlsteil, index ++ , befehle);
					if (befehle.size() == 1) {
						BefehlEnum zw = befehle.iterator().next();
						if (zw.kann(befehl) && leser.satzende()) {
							bef = zw;
							break;
						}
					}
				}
				if (bef == null) {
					System.err.println(befehl);
					throw new InterpretierungsFehler(befehl.toString());
				}
				leser.erwarteSatztende();
				run(befehl, bef);
			}
		}
	}
	
	public void run(List <String> befehl, BefehlEnum bef) {
		switch (bef) {
		case addiere:
			int a = BefehlEnum.zahl(befehl.get(1), this);
			int b = BefehlEnum.zahl(befehl.get(3), this);
			this.ergebnis(a + b);
			break;
		case ausgabe:
			Iterator <String> iter = befehl.listIterator(3);
			while (true) {
				System.out.print(iter.next());
				if (iter.hasNext()) System.out.print(' ');
				else break;
			}
			break;
		case dividiere:
			a = BefehlEnum.zahl(befehl.get(1), this);
			b = BefehlEnum.zahl(befehl.get(3), this);
			this.ergebnis(a / b);
			break;
		case ergebnisausgebe:
			this.ausgeben(this.ergebnis());
			break;
		case leerzeile:
			System.out.println();
			break;
		case leerzeichen:
			System.out.print(' ');
			break;
		case multipliziere:
			a = BefehlEnum.zahl(befehl.get(1), this);
			b = BefehlEnum.zahl(befehl.get(3), this);
			this.ergebnis(a * b);
			break;
		case subtrahiere:
			a = BefehlEnum.zahl(befehl.get(1), this);
			b = BefehlEnum.zahl(befehl.get(3), this);
			this.ergebnis(a - b);
			break;
		case zwischenisausgebe:
			this.ausgeben(this.zwischenspeicher());
			break;
		case zwischenspeicher:
			this.zwischenspeicher(this.ergebnis());
			break;
		default:
			
			break;
		}
	}
	
}
