package de.hechler.patrick.tps.interpreter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public enum Befehl {
	
	@Version(version = 1) addiere("addiere", "[ZAHL]", "mit", "[ZAHL]"), @Version(version = 1) subtrahiere("subtrahiere", "[ZAHL]", "von", "[ZAHL]"),
	
	@Version(version = 1) multipliziere("multipliziere", "[ZAHL]", "mit", "[ZAHL]"), @Version(version = 1) dividiere("dividiere", "[ZAHL]", "mit", "[ZAHL]"),
	
	
	@Version(version = 1) ergebnisausgebe("gebe", "das", "ergebnis", "aus"), @Version(version = 1) zwischenisausgebe("gebe", "den", "zwischenspeicher", "aus"),
	
	@Version(version = 1) leerzeile("mache", "einen", "zeilenumbruch"), @Version(version = 1) ausgabe("gebe", "folgendes", "aus:", "[...]"),
	@Version(version = 1) zwischenspeicher("speichere", "das", "ergebnis", "im", "zwischenspeicher"),
	
	
	;
	
	private final String[] folge;
	
	Befehl(String... folge) {
		this.folge = folge;
	}
	
	public boolean kann(List <String> befehl) {
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
	
	public void run(List <String> befehl, Interpreter interpreter) {
		switch (this) {
		case addiere:
			int a = zahl(befehl.get(1), interpreter);
			int b = zahl(befehl.get(3), interpreter);
			interpreter.ergebnis(a + b);
			break;
		case ausgabe:
			Iterator <String> iter = befehl.listIterator(3);
			while (iter.hasNext()) {
				System.out.print(iter.next());
				System.out.print(' ');
			}
			break;
		case dividiere:
			a = zahl(befehl.get(1), interpreter);
			b = zahl(befehl.get(3), interpreter);
			interpreter.ergebnis(a / b);
			break;
		case ergebnisausgebe:
			interpreter.zeilenumbruch();
			break;
		case leerzeile:
			System.out.println();
			break;
		case multipliziere:
			a = zahl(befehl.get(1), interpreter);
			b = zahl(befehl.get(3), interpreter);
			interpreter.ergebnis(a * b);
			break;
		case subtrahiere:
			a = zahl(befehl.get(1), interpreter);
			b = zahl(befehl.get(3), interpreter);
			interpreter.ergebnis(a - b);
			break;
		case zwischenisausgebe:
			interpreter.ausgeben(interpreter.zwischenspeicher());
			break;
		case zwischenspeicher:
			interpreter.zwischenspeicher(interpreter.ergebnis());
			break;
		default:
			break;
		}
	}
	
	public static int zahl(String konvertiere, Interpreter inter) {
		switch (konvertiere) {
		case "zwischen":
			return inter.zwischenspeicher();
		case "ergebnis":
			return inter.ergebnis();
		default:
			return Integer.parseInt(konvertiere);
		}
	}
	
	public static Set <Befehl> get(String first) {
		Set <Befehl> erg = new HashSet <>();
		for (Befehl teste : values()) {
			if (teste.folge[0].equals(first)) {
				erg.add(teste);
			}
		}
		return erg;
	}
	
	public static void teste(String befehlsteil, int index, Collection <Befehl> frei) {
		List <Befehl> rem = new ArrayList <>();
		for (Befehl check : frei) {
			if (index >= check.folge.length - 1 && "[...]".equals(check.folge[check.folge.length - 1])) {
				continue;
			}
			if (check.folge.length <= index || !check.passt(befehlsteil, index)) {
				rem.add(check);
			}
		}
		frei.removeAll(rem);
	}
	
	public boolean passt(String befehlsteil, int index) {
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
