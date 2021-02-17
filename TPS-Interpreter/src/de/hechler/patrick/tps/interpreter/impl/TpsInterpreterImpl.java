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
import de.hechler.patrick.tps.interpreter.Interpreter;

public class TpsInterpreterImpl implements Interpreter {
	
	private static TpsInterpreterImpl instanz = new TpsInterpreterImpl();
	
	
	
	private static int ergebnis;
	private static int zwischen;
	
	private TpsInterpreterImpl() {
	}
	
	public static TpsInterpreterImpl instanz() {
		return instanz;
	}
	
	public static void reset() {
		ergebnis = 0;
		zwischen = 0;
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
				bef.run(befehl);
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
	
	private enum Befehl {
		
		addiere("addiere", "[ZAHL]", "mit", "[ZAHL]"), subtrahiere("subtrahiere", "[ZAHL]", "von", "[ZAHL]"), multipliziere("multipliziere", "[ZAHL]", "mit", "[ZAHL]"),
		dividiere("dividiere", "[ZAHL]", "mit", "[ZAHL]"),
		
		ergebnisausgebe("gebe", "das", "ergebnis", "aus"), zwischenisausgebe("gebe", "den", "zwischenspeicher", "aus"), leerzeile("mache", "einen", "zeilenumbruch"),
		ausgabe("gebe", "folgendes", "aus:", "[...]"), zwischenspeicher("speichere", "das", "ergebnis", "im", "zwischenspeicher"),
		
		
		;
		
		private String[] folge;
		
		Befehl(String... folge) {
			this.folge = folge;
		}
		
		boolean kann(List <String> befehl) {
			Iterator <String> iter = befehl.iterator();
			for (String teste : folge) {
				if ( !iter.hasNext()) return false;
				String anderes = iter.next();
				switch (teste) {
				case "[ZAHL]":
					if ("zwischen".equals(anderes) || "ergebnis".equals(anderes)) {
						break;
					} else {
						try {
							Integer.parseInt(anderes);
							break;
						} catch (NumberFormatException e) {
							return false;
						}
					}
				case "[...]":
					return true;
				default:
					if ( !teste.equals(anderes)) {
						return false;
					}
				}
			}
			return !iter.hasNext();
		}
		
		void run(List <String> befehl) {
			switch (this) {
			case addiere:
				int a = zahl(befehl.get(1));
				int b = zahl(befehl.get(3));
				ergebnis = a + b;
				break;
			case ausgabe:
				Iterator <String> iter = befehl.listIterator(3);
				while (iter.hasNext()) {
					System.out.print(iter.next());
					System.out.print(' ');
				}
				break;
			case dividiere:
				a = zahl(befehl.get(1));
				b = zahl(befehl.get(3));
				ergebnis = a / b;
				break;
			case ergebnisausgebe:
				System.out.print(ergebnis);
				break;
			case leerzeile:
				System.out.println();
				break;
			case multipliziere:
				a = zahl(befehl.get(1));
				b = zahl(befehl.get(3));
				ergebnis = a * b;
				break;
			case subtrahiere:
				a = zahl(befehl.get(1));
				b = zahl(befehl.get(3));
				ergebnis = a - b;
				break;
			case zwischenisausgebe:
				System.out.print(zwischen);
				break;
			case zwischenspeicher:
				zwischen = ergebnis;
				break;
			default:
				break;
			}
		}
		
		int zahl(String konvertiere) {
			switch (konvertiere) {
			case "zwischen":
				return zwischen;
			case "ergebnis":
				return ergebnis;
			default:
				return Integer.parseInt(konvertiere);
			}
		}
		
		static Set <Befehl> get(String first) {
			Set <Befehl> erg = new HashSet <>();
			for (Befehl teste : values()) {
				if (teste.folge[0].equals(first)) {
					erg.add(teste);
				}
			}
			return erg;
		}
		
		static void teste(String befehlsteil, int index, Collection <Befehl> frei) {
			List <Befehl> rem = new ArrayList <>();
			for (Befehl check : frei) {
				if (index >= check.folge.length -1 && "[...]".equals(check.folge[check.folge.length - 1])) {
					continue;
				}
				if (check.folge.length <= index || !check.passt(befehlsteil, index)) {
					rem.add(check);
				}
			}
			frei.removeAll(rem);
		}
		
		boolean passt(String befehlsteil, int index) {
			if (this.folge[index].indexOf('[') == -1) {
				return this.folge[index].equals(befehlsteil);
			}
			switch (this.folge[index]) {
			case "[ZAHL]":
				if ("zwischen".equals(befehlsteil) || "ergebnis".equals(befehlsteil)) {
					return true;
				} else {
					try {
						Integer.parseInt(befehlsteil);
						return true;
					} catch (NumberFormatException e) {
						return false;
					}
				}
			case "[...]":
				return true;
			default:
				throw new RuntimeException("unbekannte folge!");
			}
		}
		
	}
	
}
