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

import de.hechler.patrick.tps.fehler.InterpretierungsFehler;
import de.hechler.patrick.tps.fehler.UnbekannteStellenFehler;
import de.hechler.patrick.tps.fehler.UnbekannterBefehlFehler;
import de.hechler.patrick.tps.interpreter.Interpreter;
import de.hechler.patrick.tps.interpreter.Version;
import de.hechler.patrick.tps.interpreter.hilfen.Anordnung;
import de.hechler.patrick.tps.interpreter.hilfen.BefehlEnum;

@Version(3)
public class BenutzerfreundlicheTpsInterpreterImpl implements Interpreter {
	
	private int status;
	private int ergebnis;
	private int zwischen;
	private PrintStream aus;
	private Scanner ein;
	
	private Map <String, Integer> stellen;
	private Anordnung[] sätzte;
	
	public BenutzerfreundlicheTpsInterpreterImpl(PrintStream ausgang, InputStream eingang) {
		aus = ausgang;
		ein = new Scanner(eingang);
		stellen = new HashMap <String, Integer>();
	}
	
	@Override
	public void interpretiere(InputStream eingang, Charset zeichensatz) throws IOException, InterpretierungsFehler {
		List <List <String>> sätze = lese(eingang, zeichensatz);
		baue(sätze);
		ausführen();
	}
	
	public void ausführen() throws UnbekannterBefehlFehler {
		int satz;
		boolean minDrei = false;
		if ( (status & STATUS_LÄUFT) != 0) {
			if ( (status & STATUS_LÄUFT_MEHRFACH) != 0) {
				minDrei = true;
			} else {
				status |= STATUS_LÄUFT_MEHRFACH;
			}
		} else {
			status |= STATUS_LÄUFT;
		}
		for (satz = 0; satz < sätzte.length; satz ++ ) {
			Anordnung anord = sätzte[satz];
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
				ergebnis = anord.param(0).zahl(this) / anord.param(1).zahl(this);
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
				ergebnis = anord.param(0).zahl(this) * anord.param(1).zahl(this);
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
			}
		}
		if ( (status & STATUS_LÄUFT_MEHRFACH) != 0) {
			if ( !minDrei) {
				status &= ~STATUS_LÄUFT_MEHRFACH;
			}
		} else {
			status ^= status;
		}
	}
	
	public void baue(List <List <String>> sätze) throws InterpretierungsFehler {
		Set <String> benötigteStellen = new HashSet <String>();
		sätzte = new Anordnung[sätze.size()];
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
			Anordnung anord = new Anordnung();
			anord.befehl(bef);
			anord.fülleParam(satz, benötigteStellen, stellen, init);
			sätzte[init ++ ] = anord;
		}
		if ( !stellen.keySet().containsAll(benötigteStellen)) {
			throw new UnbekannteStellenFehler(stellen , benötigteStellen);
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
