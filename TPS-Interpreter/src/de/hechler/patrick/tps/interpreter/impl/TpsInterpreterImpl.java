package de.hechler.patrick.tps.interpreter.impl;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

import de.hechler.patrick.tps.fehler.InterpretierungsFehler;
import de.hechler.patrick.tps.interpreter.Befehl;
import de.hechler.patrick.tps.interpreter.Interpreter;
import de.hechler.patrick.tps.interpreter.Version;

@Version(version = 1)
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
				Set <Befehl> befehle = Befehl.get(befehlsteil);
				int index = 1;
				List <String> befehl = new ArrayList <String>();
				Befehl bef = null;
				befehl.add(befehlsteil);
				while (leser.hasNext() && !befehle.isEmpty()) {
					befehlsteil = leser.next();
					befehl.add(befehlsteil);
					Befehl.teste(befehlsteil, index ++ , befehle);
					if (befehle.size() == 1) {
						Befehl zw = befehle.iterator().next();
						if (zw.kann(befehl) && leser.satzende) {
							bef = zw;
							break;
						}
					}
				}
				if (bef == null) {
					System.err.println(befehl);
					throw new InterpretierungsFehler(befehl.toString());
				}
				leser.satztende();
				bef.run(befehl, this);
			}
		}
	}
	
	private class SatzLeser implements Iterator <String>, Closeable {
		
		private Scanner scanner;
		private boolean satzende;
		
		public SatzLeser(Scanner src) {
			this.scanner = src;
		}
		
		public void satztende() {
			if (satzende) {
				satzende = false;
			} else {
				throw new RuntimeException("kein satzende!");
			}
		}
		
		@Override
		public boolean hasNext() {
			if (satzende) return false;
			else return scanner.hasNext();
		}
		
		
		@Override
		public String next() {
			if (satzende) throw new NoSuchElementException();
			String erg = scanner.next();
			if (erg.endsWith(".")) {
				satzende = true;
				erg = erg.substring(0, erg.length() - 1);
			}
			return erg;
		}
		
		@Override
		public void close() throws IOException {
			scanner.close();
			scanner = null;
		}
		
	}
	
}
