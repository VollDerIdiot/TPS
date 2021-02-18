package de.hechler.patrick.tps.interpreter.hilfen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import de.hechler.patrick.tps.hilfen.objects.fehler.NochNichtGemachtFehler;
import de.hechler.patrick.tps.interpreter.Interpreter;
import de.hechler.patrick.tps.interpreter.Version;
import de.hechler.patrick.tps.interpreter.Änderung;

public enum BefehlEnum {
	
	@Version(1) addiere("addiere", "[ZAHL]", "mit", "[ZAHL]"), @Version(1) subtrahiere("subtrahiere", "[ZAHL]", "mit", "[ZAHL]"),
	
	@Version(1) multipliziere("multipliziere", "[ZAHL]", "mit", "[ZAHL]"), @Änderung(4)@Version(1) dividiere("dividiere", "[ZAHL]", "mit", "[ZAHL]"),
	
	
	@Version(1) ergebnisausgebe("gebe", "das", "ergebnis", "aus"), @Version(1) zwischenisausgebe("gebe", "den", "zwischenspeicher", "aus"),
	
	@Version(1) leerzeichen("gebe", "ein", "leerzeichen", "aus"), @Version(1) leerzeile("mache", "einen", "zeilenumbruch"), @Version(1) ausgabe("gebe", "folgendes", "aus:", "[...]"),
	@Version(1) zwischenspeicher("speichere", "das", "ergebnis", "im", "zwischenspeicher"),
	
	
	
	@Version(2) vergleiche("vergleiche", "[ZAHL]", "mit", "[ZAHL]"),
	
	
	@Version(2) springe("springe", "zur", "stelle:", "[STELLE]"),
	
	@Version(2) geheWennNichtGleich("wenn", "es", "nicht", "gleich", "ist", "springe", "zur", "stelle:", "[STELLE]"),
	@Version(2) geheWennGleich("wenn", "es", "gleich", "ist", "springe", "zur", "stelle:", "[STELLE]"),
	@Version(2) geheWennKleiner("wenn", "es", "kleiner", "ist", "springe", "zur", "stelle:", "[STELLE]"),
	@Version(2) geheWennGrößer("wenn", "es", "größer", "ist", "springe", "zur", "stelle:", "[STELLE]"),
	@Version(2) geheWennKleinerGleich("wenn", "es", "kleiner", "oder", "gleich", "ist", "springe", "zur", "stelle:", "[STELLE]"),
	@Version(2) geheWennGrößerGleich("wenn", "es", "größer", "oder", "gleich", "ist", "springe", "zur", "stelle:", "[STELLE]"),
	
	@Version(2) stelle("hier", "ist", "die", "stelle:", "[STELLE]"),
	
	
	
	@Änderung(4) @Version(3) leseZahlEinErg("lese", "eine", "zahl", "ein"), @Änderung(4) @Version(3) leseZahlEinZwischen("lese", "eine", "zahl", "in", "den", "zwischenspeicher", "ein"),
	
	
	
	@Version(4) ladeInRegister("lade", "die", "[ZAHL]", "in", "das", "register", "[ZAHL]"),
	
	@Version(4) ladeVomRegisterErg("lade", "die", "zahl", "aus", "dem", "register", "[ZAHL]"),
	@Version(4) ladeVomRegisterZw("lade", "die", "zahl", "aus", "dem", "register", "[ZAHL]", "in", "den", "zwischenspeicher"),
	
	@Version(4) ladeRegisterAnzahlErg("lade", "die", "anzahl", "der", "register", "in", "den", "ergebnisspeicher"),
	@Version(4) ladeRegisterAnzahlZw("lade", "die", "anzahl", "der", "register", "in", "den", "zwischenspeicher"),
	
	
	@Version(4) registerausgabe("gebe", "die", "register", "von", "[ZAHL]", "bis", "[ZAHL]", "aus"),
	
	@Version(4) registerWortEinlesen("lese", "das", "nächste", "wort", "des", "benutzers", "in", "die", "register", "ab", "[ZAHL]", "ein"),
	@Version(4) registerZeichenEinlesen("lese", "die", "nächsten", "[ZAHL]", "zeichen", "des", "benutzers", "in", "die", "register", "ab", "[ZAHL]", "ein"),
	
	@Version(4) geheWennFalsch("wenn", "es", "einen", "fehler", "gab", "springe", "zur", "stelle:", "[STELLE]"),
	@Version(4) geheWennMehrfachAn("wenn", "es", "noch", "mehr", "befehlsgeber", "gibt", "springe", "zur", "stelle:", "[STELLE]"),
	
	
	
	@Version(5) versionErg("schreibe", "die", "version", "in", "den", "ergebnisspeicher"), 
	@Version(5) versionZw("schreibe", "die", "version", "in", "den", "zwischenspeicher"),
	@Version(5) versionReg("schreibe", "die", "version", "in", "das", "register", "[ZAHL]"),
	
	@Version(5) stapelMaxGrößeErg("schreibe", "die", "maximale", "größe", "des", "Stapels", "im", "ergebnisspeicher"),
	@Version(5) stapelMaxGrößeZw("schreibe", "die", "maximale", "größe", "des", "Stapels", "im", "zwischenspeicher"),
	@Version(5) stapelMaxGrößeReg("schreibe", "die", "maximale", "größe", "des", "Stapels", "in", "das", "register", "[ZAHL]"),
	
	@Version(5) stapelGrößeErg("schreibe", "die", "aktuelle", "größe", "des", "Stapels", "im", "ergebnisspeicher"),
	@Version(5) stapelGrößeZw("schreibe", "die", "aktuelle", "größe", "des", "Stapels", "im", "zwischenspeicher"),
	@Version(5) stapelGrößeReg("schreibe", "die", "aktuelle", "größe", "des", "Stapels", "in", "das", "register", "[ZAHL]"),
	
	@Version(5) vergleicheRegister("vergleiche", "die", "register", "von", "[ZAHL]", "bis", "[ZAHL]", "mit", "den", "registern", "von", "[ZAHL]", "bis", "[ZAHL]"),
	@Version(5) vergleicheRegisterText("vergleiche", "die", "register", "von", "[ZAHL]", "bis", "[ZAHL]", "mit", "dem", "text:", "[...]"),
	
	@Version(5) rufeAuf("mache", "einen", "stellenaufruf", "bei", "der", "stelle:", "[STELLE]"),
	@Version(5) rufeAufWennGle("wenn", "es", "gleich", "ist", "mache", "einen", "stellenaufruf", "bei", "der", "stelle:", "[STELLE]"),
	@Version(5) rufeAufWennNichtGleich("wenn", "es", "nicht", "gleich", "ist", "mache", "einen", "stellenaufruf", "bei", "der", "stelle:", "[STELLE]"),
	@Version(5) rufeAufWennKleiner("wenn", "es", "kleiner", "ist", "mache", "einen", "stellenaufruf", "bei", "der", "stelle:", "[STELLE]"),
	@Version(5) rufeAufGrößer("wenn", "es", "größer", "ist", "mache", "einen", "stellenaufruf", "bei", "der", "stelle:", "[STELLE]"),
	@Version(5) rufeAufKleinerGleich("wenn", "es", "kleiner", "oder", "gleich", "ist", "mache", "einen", "stellenaufruf", "bei", "der", "stelle:", "[STELLE]"),
	@Version(5) rufeAufGrößerGleich("wenn", "es", "größer", "oder", "gleich", "ist", "wenn", "es", "gleich", "ist", "mache", "einen", "stellenaufruf", "bei", "der", "stelle:", "[STELLE]"),
	@Version(5) geheZurück("gehe", "zurück"), 
	
	@Version(5) stapelSchreiben("lege", "die", "[ZAHL]", "auf", "den", "stapel"),
	@Version(5) stapelLesenErg("nehme", "die", "oberste", "zahl", "vom", "stapel", "herunter", "und", "speichere", "sie", "im", "ergebnisspeicher"),
	@Version(5) stapelLesenZw("nehme", "die", "oberste", "zahl", "vom", "stapel", "herunter", "und", "speichere", "sie", "im", "zwischenspeicher"),
	@Version(5) stapelLesenReg("nehme", "die", "oberste", "zahl", "vom", "stapel", "herunter", "und", "speichere", "sie", "im", "register", "[ZAHL]"),
	
	@Version(5) addiereRegReg("addiere", "das", "register", "[ZAHL]", "mit", "dem", "register", "[ZAHL]"), 
	@Version(5) addiereRegZ("addiere", "das", "register", "[ZAHL]", "mit", "[ZAHL]"),
	@Version(5) addiereZReg("addiere", "[ZAHL]", "mit", "dem", "register", "[ZAHL]"), 
	
	@Version(5) subtrahiereRegReg("subtrahiere", "das", "register", "[ZAHL]", "mit", "dem", "register", "[ZAHL]"),
	@Version(5) subtrahiereRegZ("subtrahiere", "das", "register", "[ZAHL]", "mit", "[ZAHL]"), 
	@Version(5) subtrahiereZReg("subtrahiere", "[ZAHL]", "mit", "dem", "register", "[ZAHL]"),
	
	@Version(5) multipliziereRegReg("multipliziere", "das", "register", "[ZAHL]", "mit", "dem", "register", "[ZAHL]"),
	@Version(5) multipliziereRegZ("multipliziere", "das", "register", "[ZAHL]", "mit", "[ZAHL]"), 
	@Version(5) multipliziereZReg("multipliziere", "[ZAHL]", "mit", "dem", "register", "[ZAHL]"),
	
	@Version(5) dividiereRegReg("dividiere", "das", "register", "[ZAHL]", "mit", "dem", "register", "[ZAHL]"), 
	@Version(5) dividiereRegZ("dividiere", "das", "register", "[ZAHL]", "mit", "[ZAHL]"),
	@Version(5) dividiereZReg("dividiere", "[ZAHL]", "mit", "dem", "register", "[ZAHL]")
	
	
	
	;
	
	private final String[] folge;
	
	BefehlEnum(String... folge) {
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
			case "[STELLE]":
				throw new NochNichtGemachtFehler();
			default:
				if ( !teste.equals(anderes)) {
					return false;
				}
			}
		}
		return !iter.hasNext();
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
	
	public static Param zahl(String konvertiere) {
		switch (konvertiere) {
		case "zwischen":
			return new Param(false);
		case "ergebnis":
			return new Param(true);
		default:
			return new Param(Integer.parseInt(konvertiere));
		}
	}
	
	public static Set <BefehlEnum> get(String first) {
		Set <BefehlEnum> erg = new HashSet <>();
		for (BefehlEnum teste : values()) {
			if (teste.folge[0].equals(first)) {
				erg.add(teste);
			}
		}
		return erg;
	}
	
	public static void teste(String befehlsteil, int index, Collection <BefehlEnum> frei) {
		List <BefehlEnum> rem = new ArrayList <>();
		for (BefehlEnum check : frei) {
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
		case "[STELLE]":
			return !befehlsteil.isEmpty() && befehlsteil != befehlsteil.replaceFirst("^[A-Z]+$", "");
		default:
			throw new RuntimeException("unbekannte folge!");
		}
	}
	
}
