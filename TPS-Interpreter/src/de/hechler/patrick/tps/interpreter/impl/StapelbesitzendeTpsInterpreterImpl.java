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

import de.hechler.patrick.tps.fehler.FalscheRegisterZahlFehler;
import de.hechler.patrick.tps.fehler.InterpretierungsFehler;
import de.hechler.patrick.tps.fehler.UnbekannteStellenFehler;
import de.hechler.patrick.tps.fehler.UnbekannterBefehlFehler;
import de.hechler.patrick.tps.interpreter.Interpreter;
import de.hechler.patrick.tps.interpreter.Version;
import de.hechler.patrick.tps.interpreter.hilfen.AnordnungInterface;
import de.hechler.patrick.tps.interpreter.hilfen.BefehlEnum;
import de.hechler.patrick.tps.interpreter.hilfen.TolleAnordnung;

@Version(5)
public class StapelbesitzendeTpsInterpreterImpl implements Interpreter {
	
	private int status;
	private int ergebnis;
	private int zwischen;
	private int[] register;
	private int[] stapel;
	private int stapelZeiger;
	private PrintStream aus;
	private Scanner ein;
	
	private Map <String, Integer> stellen;
	private AnordnungInterface[] sätzte;
	
	public StapelbesitzendeTpsInterpreterImpl(PrintStream ausgang, Scanner eingang, int registerAnzahl, int stapelMaxGräße) {
		aus = ausgang;
		ein = eingang;
		stellen = new HashMap <String, Integer>();
		register = new int[registerAnzahl];
		stapel = new int[stapelMaxGräße];
	}
	
	public StapelbesitzendeTpsInterpreterImpl(PrintStream ausgang, InputStream eingang, Charset zeichensatz, int registerAnzahl, int stapelMaxGräße) {
		this(ausgang, new Scanner(eingang, zeichensatz), registerAnzahl, stapelMaxGräße);
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
				case vergleiche: {
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
				}
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
				case ladeInRegister: {
					int neuRegWert = anord.param(0).zahl(this);
					int i = anord.param(1).zahl(this);
					register[i] = neuRegWert;
					break;
				}
				case ladeVomRegisterErg: {
					int i = anord.param(0).zahl(this);
					ergebnis = register[i];
					break;
				}
				case ladeVomRegisterZw: {
					int i = anord.param(0).zahl(this);
					zwischen = register[i];
					break;
				}
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
				case addiereRegReg: {
					int a = anord.param(0).zahl(this);
					int b = anord.param(0).zahl(this);
					ergebnis = register[a] + register[b];
					break;
				}
				case addiereRegZ: {
					int a = anord.param(0).zahl(this);
					int b = anord.param(0).zahl(this);
					ergebnis = register[a] + b;
					break;
				}
				case addiereZReg: {
					int a = anord.param(0).zahl(this);
					int b = anord.param(0).zahl(this);
					ergebnis = a + register[b];
					break;
				}
				case dividiereRegReg: {
					int a = anord.param(0).zahl(this);
					int b = anord.param(0).zahl(this);
					ergebnis = register[a] / register[b];
					zwischen = register[a] % register[b];
					break;
				}
				case dividiereRegZ: {
					int a = anord.param(0).zahl(this);
					int b = anord.param(0).zahl(this);
					ergebnis = register[a] / b;
					zwischen = register[a] % b;
					break;
				}
				case dividiereZReg: {
					int a = anord.param(0).zahl(this);
					int b = anord.param(0).zahl(this);
					ergebnis = a / register[b];
					zwischen = a % register[b];
					break;
				}
				case geheZurück:
					if (stapelZeiger == 0) {
						status |= STATUS_FEHLER;
					} else {
						satz = stapel[ -- stapelZeiger];
					}
					break;
				case multipliziereRegReg: {
					int a = anord.param(0).zahl(this);
					int b = anord.param(0).zahl(this);
					ergebnis = register[a] * register[b];
					break;
				}
				case multipliziereRegZ: {
					int a = anord.param(0).zahl(this);
					int b = anord.param(0).zahl(this);
					ergebnis = register[a] * b;
					break;
				}
				case multipliziereZReg: {
					int a = anord.param(0).zahl(this);
					int b = anord.param(0).zahl(this);
					ergebnis = a * register[b];
					break;
				}
				case rufeAuf:
					if (stapelZeiger == stapel.length) {
						status |= STATUS_FEHLER;
					} else {
						stapel[stapelZeiger ++ ] = satz;
						String zw = anord.param(0).string();
						satz = stellen.get(zw);
					}
					break;
				case rufeAufGrößer:
					if (stapelZeiger == stapel.length) {
						status |= STATUS_FEHLER;
					} else if ( (status & STATUS_GRÖẞER) != 0) {
						stapel[stapelZeiger ++ ] = satz;
						String zw = anord.param(0).string();
						satz = stellen.get(zw);
					}
					break;
				case rufeAufGrößerGleich:
					if (stapelZeiger == stapel.length) {
						status |= STATUS_FEHLER;
					} else if ( (status & (STATUS_GRÖẞER | STATUS_GLEICH)) != 0) {
						stapel[stapelZeiger ++ ] = satz;
						String zw = anord.param(0).string();
						satz = stellen.get(zw);
					}
					break;
				case rufeAufKleinerGleich:
					if (stapelZeiger == stapel.length) {
						status |= STATUS_FEHLER;
					} else if ( (status & (STATUS_KLEINER | STATUS_GLEICH)) != 0) {
						stapel[stapelZeiger ++ ] = satz;
						String zw = anord.param(0).string();
						satz = stellen.get(zw);
					}
					break;
				case rufeAufWennGleich:
					if (stapelZeiger == stapel.length) {
						status |= STATUS_FEHLER;
					} else if ( (status & STATUS_GLEICH) != 0) {
						stapel[stapelZeiger ++ ] = satz;
						String zw = anord.param(0).string();
						satz = stellen.get(zw);
					}
					break;
				case rufeAufWennKleiner:
					if (stapelZeiger == stapel.length) {
						status |= STATUS_FEHLER;
					} else if ( (status & STATUS_KLEINER) != 0) {
						stapel[stapelZeiger ++ ] = satz;
						String zw = anord.param(0).string();
						satz = stellen.get(zw);
					}
					break;
				case rufeAufWennNichtGleich:
					if (stapelZeiger == stapel.length) {
						status |= STATUS_FEHLER;
					} else if ( (status & STATUS_GLEICH) == 0) {
						stapel[stapelZeiger ++ ] = satz;
						String zw = anord.param(0).string();
						satz = stellen.get(zw);
					}
					break;
				case stapelGrößeErg:
					ergebnis = stapelZeiger;
					break;
				case stapelGrößeReg: {
					int reg = anord.param(0).zahl(this);
					register[reg] = stapelZeiger;
				}
					break;
				case stapelGrößeZw:
					zwischen = stapelZeiger;
					break;
				case stapelLesenErg:
					ergebnis = stapel[ -- stapelZeiger];
					break;
				case stapelLesenReg: {
					int reg = anord.param(0).zahl(this);
					register[reg] = stapel[ -- stapelZeiger];
				}
					break;
				case stapelLesenZw:
					zwischen = stapel[ -- stapelZeiger];
					break;
				case stapelMaxGrößeErg:
					ergebnis = stapel.length;
					break;
				case stapelMaxGrößeReg: {
					int reg = anord.param(0).zahl(this);
					register[reg] = stapel.length;
				}
					break;
				case stapelMaxGrößeZw:
					zwischen = stapel.length;
					break;
				case stapelSchreiben:
					if (stapelZeiger == stapel.length) {
						status |= STATUS_FEHLER;
					} else {
						int leg = anord.param(0).zahl(this);
						stapel[stapelZeiger ++ ] = leg;
					}
					break;
				case subtrahiereRegReg: {
					int a = anord.param(0).zahl(this);
					int b = anord.param(1).zahl(this);
					ergebnis = register[a] - register[b];
				}
					break;
				case subtrahiereRegZ: {
					int a = anord.param(0).zahl(this);
					int b = anord.param(1).zahl(this);
					ergebnis = register[a] - b;
				}
					break;
				case subtrahiereZReg: {
					int a = anord.param(0).zahl(this);
					int b = anord.param(1).zahl(this);
					ergebnis = a - register[b];
				}
					break;
				case vergleicheRegister:
					break;
				case vergleicheRegisterText:
					break;
				case versionErg: {
					Version version = this.getClass().getAnnotation(Version.class);
					if (version == null) {
						ergebnis = 5;
					} else {
						ergebnis = version.value();
					}
					break;
				}
				case versionReg: {
					Version version = this.getClass().getAnnotation(Version.class);
					int reg = anord.param(0).zahl(this);
					if (version == null) {
						register[reg] = 5;
					} else {
						register[reg] = version.value();
					}
					break;
				}
				case versionZw: {
					Version version = this.getClass().getAnnotation(Version.class);
					if (version == null) {
						zwischen = 5;
					} else {
						zwischen = version.value();
					}
				}
					break;
				default:
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
			AnordnungInterface anord = new TolleAnordnung();
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
