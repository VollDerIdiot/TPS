package de.hechler.patrick.tps.interpreter.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import de.hechler.patrick.tps.antlr.anotatins.Version;
import de.hechler.patrick.tps.fehler.FalscheRegisterZahlFehler;
import de.hechler.patrick.tps.fehler.InterpretierungsFehler;
import de.hechler.patrick.tps.fehler.UnbekannteStellenFehler;
import de.hechler.patrick.tps.fehler.UnbekannterBefehlFehler;
import de.hechler.patrick.tps.interpreter.Interpreter;
import de.hechler.patrick.tps.interpreter.hilfen.Anordnung;
import de.hechler.patrick.tps.interpreter.hilfen.AnordnungInterface;
import de.hechler.patrick.tps.interpreter.hilfen.befehl.BefehlEnum;

@Deprecated
@Version(4)
public class RegisterfähigesTpsInterpreterImpl implements Interpreter {
	
	private int status;
	private int ergebnis;
	private int zwischen;
	private int[] register;
	private PrintStream aus;
	private Scanner ein;
	
	private Map <String, Integer> stellen;
	private AnordnungInterface[] sätzte;
	
	public RegisterfähigesTpsInterpreterImpl(PrintStream ausgang, Scanner eingang, int registerAnzahl) {
		aus = ausgang;
		ein = eingang;
		stellen = new HashMap <String, Integer>();
		register = new int[registerAnzahl];
	}
	
	public RegisterfähigesTpsInterpreterImpl(PrintStream ausgang, InputStream eingang, Charset zeichensatz, int registerAnzahl) {
		aus = ausgang;
		ein = new Scanner(eingang, zeichensatz);
		stellen = new HashMap <String, Integer>();
		register = new int[registerAnzahl];
	}
	
	@Override
	public void interpretiere(InputStream eingang, Charset zeichensatz) throws IOException, InterpretierungsFehler {
		List <List <String>> sätze = lese(eingang, zeichensatz);
		baue(sätze);
		ausführen();
	}
	
	public void ausführen() throws UnbekannterBefehlFehler, FalscheRegisterZahlFehler {
		int satz;
		if ( (status & STATUS_LÄUFT) != 0) {
			return;
		} else {
			status = STATUS_LÄUFT; // zurücksetzten
		}
		for (satz = 0; satz < sätzte.length; satz ++ ) {
			AnordnungInterface anord = sätzte[satz];
			try {
				switch (anord.befehl()) {
				default: 
					throw new UnbekannterBefehlFehler(anord.befehl());
				case addiere:
					ergebnis = anord.param(0).zahl(this) + anord.param(1).zahl(this);
					break;
				case ausgabe:
					aus.print(anord.param(0).string());
					break;
				case dividiere:
					int basis = anord.param(1).zahl(this);
					if (basis != 0) {
						int oben = anord.param(0).zahl(this);
						ergebnis = oben / basis;
						zwischen = oben % basis;
					} else {
						status |= STATUS_FEHLER;
					}
					break;
				case ergebnisausgebe:
					aus.print(ergebnis);
					break;
				case geheWennGleich:
					if ( (status & STATUS_GLEICH) != 0) {
						satz = stellen.get(anord.param(0).string());
					}
					break;
				case geheWennNichtGleich:
					if ( (status & STATUS_GLEICH) == 0) {
						satz = stellen.get(anord.param(0).string());
					}
					break;
				case geheWennGrößer:
					if ( (status & STATUS_GRÖẞER) != 0) {
						satz = stellen.get(anord.param(0).string());
					}
					break;
				case geheWennGrößerGleich:
					if ( (status & (STATUS_GRÖẞER | STATUS_GLEICH)) != 0) {
						satz = stellen.get(anord.param(0).string());
					}
					break;
				case geheWennKleiner:
					if ( (status & STATUS_KLEINER) != 0) {
						satz = stellen.get(anord.param(0).string());
					}
					break;
				case geheWennKleinerGleich:
					if ( (status & (STATUS_KLEINER | STATUS_GLEICH)) != 0) {
						satz = stellen.get(anord.param(0).string());
					}
					break;
				case leerzeile:
					aus.println();
					break;
				case leerzeichen:
					aus.print(' ');
					break;
				case multipliziere:
					ergebnis = anord.param(0).zahl(this) * anord.param(1).zahl(this);
					break;
				case springe:
					satz = stellen.get(anord.param(0).string());
					break;
				case stelle:
					// nothing to do
					break;
				case subtrahiere:
					ergebnis = anord.param(0).zahl(this) - anord.param(1).zahl(this);
					break;
				case vergleiche:
					int a = anord.param(0).zahl(this);
					int b = anord.param(1).zahl(this);
					if (a == b) {
						status &= ~ (STATUS_GRÖẞER | STATUS_KLEINER);
						status |= STATUS_GLEICH;
					} else if (a > b) {
						status &= ~ (STATUS_GLEICH | STATUS_KLEINER);
						status |= STATUS_GRÖẞER;
					} else {
						status &= ~ (STATUS_GLEICH | STATUS_GRÖẞER);
						status |= STATUS_KLEINER;
					}
					break;
				case zwischenisausgebe:
					aus.print(zwischen);
					break;
				case zwischenspeicher:
					zwischen = ergebnis;
					break;
				case leseZahlEinErg:
					ergebnis = ein.nextInt();
					break;
				case leseZahlEinZwischen:
					zwischen = ein.nextInt();
					break;
				case ladeInRegister:
					int neuRegWert = anord.param(0).zahl(this);
					int i = anord.param(1).zahl(this);
					register[i] = neuRegWert;
					break;
				case ladeVomRegisterErg:
					i = anord.param(0).zahl(this);
					ergebnis = register[i];
					break;
				case ladeVomRegisterZw:
					i = anord.param(0).zahl(this);
					zwischen = register[i];
					break;
				case ladeRegisterAnzahlErg:
					ergebnis = register.length;
					break;
				case ladeRegisterAnzahlZw:
					zwischen = register.length;
					break;
				case registerausgabe: {
					int index = anord.param(0).zahl(this);
					int ende = anord.param(1).zahl(this);
					if (ende < index || ende > register.length || index < 0) {
						throw new FalscheRegisterZahlFehler("ende < start oder ende > registerAnzahl oder index < 0 ende=" + ende + ", start=" + index + ", registerAnzahl=" + register.length);
					}
					StringBuilder str = new StringBuilder();
					for (; index < ende; index ++ ) {
						str.append((char) register[index]);
					}
					aus.print(str.toString());
					break;
				}
				case registerWortEinlesen: {
					int start = anord.param(0).zahl(this);
					char[] chars = ein.next().toCharArray();
					register[start] = chars.length;
					int len = chars.length;
					if (len + start + 1 >= register.length) {
						len = register.length - start - 1;
					}
					for (int zusatz = 0; zusatz < len; zusatz ++ ) {
						register[start + zusatz + 1] = chars[zusatz];
					}
					break;
				}
				case registerZeichenEinlesen: {
					int start = anord.param(0).zahl(this);
					int anzahl = anord.param(1).zahl(this);
					char[] chars = ein.next("(\\w{" + anzahl + "," + anzahl + "})").toCharArray();
					register[start] = chars.length;
					for (int zusatz = 0; zusatz < chars.length; zusatz ++ ) {
						register[start + zusatz + 1] = chars[zusatz];
					}
					break;
				}
				case geheWennFalsch:
					if ( (status & STATUS_FEHLER) != 0) {
						status &= ~STATUS_FEHLER;
						satz = stellen.get(anord.param(0).string());
					}
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
				status |= STATUS_FEHLER;
			}
		}
		status &= ~STATUS_LÄUFT;
	}
	
	public void baue(List <List <String>> sätze) throws InterpretierungsFehler {
		Set <String> benötigteStellen = new HashSet <String>();
		sätzte = new AnordnungInterface[sätze.size()];
		int init = 0;
		for (List <String> satz : sätze) {
			Iterator <String> iter = satz.iterator();
			String zw = iter.next();
			Set <BefehlEnum> befs = BefehlEnum.get(zw);
			int index = 1;
			while (iter.hasNext()) {
				zw = iter.next();
				BefehlEnum.teste(zw, index ++ , befs);
			}
			if (befs.size() != 1) {
				throw new InterpretierungsFehler("satz: " + satz + " befehle: " + befs);
			}
			BefehlEnum bef = befs.iterator().next();
			AnordnungInterface anord = new Anordnung();
			anord.befehl(bef);
			anord.fülleParam(satz, benötigteStellen, stellen, init);
			sätzte[init ++ ] = anord;
		}
		if ( !stellen.keySet().containsAll(benötigteStellen)) {
			throw new UnbekannteStellenFehler(stellen, benötigteStellen);
		}
	}
	
	public List <List <String>> lese(InputStream eingang, Charset zeichensatz) {
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
