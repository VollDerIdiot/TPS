package de.hechler.patrick.tps.interpreter.fehlersucherimpl;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

import de.hechler.patrick.tps.fehler.InterpretierungsFehler;
import de.hechler.patrick.tps.interpreter.FehlersuchenInterpreter;
import de.hechler.patrick.tps.interpreter.Version;
import de.hechler.patrick.tps.interpreter.hilfen.AnordnungInterface;
import de.hechler.patrick.tps.interpreter.hilfen.Helfer;

@Version(6)
public class FehlersuchenderTpsInterpreter implements FehlersuchenInterpreter {
	
	private volatile int letzterFehlerZusatzInfo;
	private volatile int letzterFehlerBefehl;
	private volatile int letzterFehlerArt;
	private volatile int status;
	private volatile int ergebnis;
	private volatile int zwischen;
	private volatile int stapelZeiger;
	
	private final int[] stapel;
	private final int[] register;
	
	private volatile int         nächste;
	private AnordnungInterface[] anordnungen;
	
	private PrintStream           aus;
	private Scanner               ein;
	private Map <String, Integer> stellen;
	private HashSet <String>      benötigteStellen;
	
	private volatile boolean stoppe;
	private boolean          stopperBeiGeheRaus;
	private boolean          ignoriereStopper;
	private Set <Integer>    stopper;
	private boolean          fehlerStoppen;
	
	
	
	public FehlersuchenderTpsInterpreter(PrintStream ausgang, Scanner eingabe, int registerAnzahl, int maximaleStapelGröße) {
		ein = eingabe;
		aus = ausgang;
		register = new int[registerAnzahl];
		stapel = new int[maximaleStapelGröße];
		letzterFehlerArt = KEIN_FEHLER;
		letzterFehlerBefehl = -1;
		letzterFehlerZusatzInfo = 0;
		stellen = new HashMap <>();
		benötigteStellen = new HashSet <>();
	}
	
	@Override
	public void lade(InputStream eingang, Charset zeichensatz) throws IOException, InterpretierungsFehler {
		anordnungen = Helfer.lade(eingang, zeichensatz, stellen, benötigteStellen);
	}
	
	@Override
	public void interpretiere(InputStream eingang, Charset zeichensatz) throws IOException, InterpretierungsFehler {
		lade(eingang, zeichensatz);
		status |= STATUS_LÄUFT;
		mache();
		status &= ~STATUS_ANGEHALTEN;
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
	
	@Override
	public boolean ignoriertStoppPunkte() {
		return ignoriereStopper;
	}
	
	@Override
	public void ignoriereStoppPunkte(boolean ignoriereStopper) {
		this.ignoriereStopper = ignoriereStopper;
	}
	
	@Override
	public int[] stoppPunkte() {
		Integer[] zw = stopper.toArray(new Integer[stopper.size()]);
		int[] erg = new int[zw.length];
		System.arraycopy(zw, 0, erg, 0, zw.length);
		return erg;
	}
	
	@Override
	public Set <Integer> stoppPunkteSet() {
		return stopper;
	}
	
	@Override
	public AnordnungInterface anordnungVon(int satz) {
		return anordnungen[satz];
	}
	
	@Override
	public void stoppPunkt(int neuerStopper) {
		stopper.add(neuerStopper);
	}
	
	@Override
	public boolean machtFehlerStoppung() {
		return fehlerStoppen;
	}
	
	@Override
	public void fehlerStoppen(boolean stoppendeFehler) {
		fehlerStoppen = stoppendeFehler;
	}
	
	@Override
	public int version() {
		Version version = this.getClass().getAnnotation(Version.class);
		if (version != null) {
			return version.value();
		} else return 6;
	}
	
	@Override
	public int stapelGröße() {
		return stapelZeiger;
	}
	
	@Override
	public int stapelMaxGröße() {
		return stapel.length;
	}
	
	@Override
	public int registerAnzahl() {
		return register.length;
	}
	
	@Override
	public void schreibeRegister(int register, int wert) {
		this.register[register] = wert;
	}
	
	@Override
	public int leseRegister(int register) {
		return this.register[register];
	}
	
	@Override
	public int anzahlAnordnungen() {
		return anordnungen.length;
	}
	
	@Override
	public void springeZu(int ziel) {
		if (ziel < 0 || ziel >= anordnungen.length) throw new IllegalArgumentException("außerhalb der grenzen: ziel=" + ziel + " größe=" + anordnungen.length);
		nächste = ziel;
	}
	
	@Override
	public void rufeAuf(int ziel) {
		if (ziel < 0 || ziel >= anordnungen.length) throw new IllegalArgumentException("außerhalb der grenzen: ziel=" + ziel + " größe=" + anordnungen.length);
		stapel[stapelZeiger ++ ] = nächste;
		nächste = ziel;
	}
	
	@Override
	public int status() {
		return status;
	}
	
	@Override
	public void status(int neu) {
		status = neu;
	}
	
	@Override
	public int letzterFehlerArt() {
		return letzterFehlerArt;
	}
	
	@Override
	public int letzterFehlerBefehl() {
		return letzterFehlerBefehl;
	}
	
	@Override
	public int letzterFehlerZusatzInfo() {
		return letzterFehlerZusatzInfo;
	}
	
	@Override
	public void zwischendurch(AnordnungInterface einfachMalSo) {
	}
	
	@Override
	public AnordnungInterface erzwingeZurückgehen() throws IllegalStateException {
		if (stapelZeiger <= 0) throw new IllegalStateException("leerer stapel");
		nächste = stapel[ -- stapelZeiger];
		return anordnungen[nächste];
	}
	
	@Override
	public AnordnungInterface nächstes() throws NoSuchElementException {
		if (nächste >= anordnungen.length) throw new NoSuchElementException();
		return anordnungen[nächste];
	}
	
	@Override
	public AnordnungInterface macheSchritt() throws IllegalStateException {
		status |= STATUS_LÄUFT;
		mache(anordnungen[nächste], nächste);
		status &= ~STATUS_ANGEHALTEN;
		return nächstes();
	}
	
	@Override
	public AnordnungInterface macheBisRaus() throws IllegalStateException {
		boolean old = stopperBeiGeheRaus;
		stopperBeiGeheRaus = true;
		status |= STATUS_LÄUFT;
		mache();
		status &= ~STATUS_ANGEHALTEN;
		stopperBeiGeheRaus = old;
		return nächstes();
	}
	
	@Override
	public AnordnungInterface macheBisStopper() throws IllegalStateException {
		boolean old = ignoriereStopper;
		ignoriereStopper = false;
		status |= STATUS_LÄUFT;
		mache();
		status &= ~STATUS_ANGEHALTEN;
		ignoriereStopper = old;
		return nächstes();
	}
	
	private synchronized void mache(AnordnungInterface mache, int befehl) {
		try {
			if (befehl == nächste) nächste ++ ;
			switch (mache.befehl()) {
			case addiere:
				ergebnis = mache.param(0).zahl(this) + mache.param(1).zahl(this);
				break;
			case addiereRegReg: {
				int regA, regB;
				regA = mache.param(0).zahl(this);
				regB = mache.param(1).zahl(this);
				ergebnis = register[regA] + register[regB];
				break;
			}
			case addiereRegZ: {
				int regA, b;
				regA = mache.param(0).zahl(this);
				b = mache.param(1).zahl(this);
				ergebnis = register[regA] + b;
				break;
			}
			case addiereZReg: {
				int a, regB;
				a = mache.param(0).zahl(this);
				regB = mache.param(1).zahl(this);
				ergebnis = a + register[regB];
				break;
			}
			case ausgabe:
				aus.print(mache.param(0).string());
				break;
			case dividiere: {
				int a, b;
				a = mache.param(0).zahl(this);
				b = mache.param(1).zahl(this);
				ergebnis = a / b;
				zwischen = a % b;
				break;
			}
			case dividiereRegReg: {
				int regA, regB;
				regA = mache.param(0).zahl(this);
				regB = mache.param(1).zahl(this);
				if (prüfeRegister(befehl, regA) && prüfeRegister(befehl, regB)) {
					ergebnis = register[regA] / register[regB];
					zwischen = register[regA] % register[regB];
				}
				break;
			}
			case dividiereRegZ: {
				int regA, b;
				regA = mache.param(0).zahl(this);
				if (prüfeRegister(befehl, regA)) {
					b = mache.param(1).zahl(this);
					ergebnis = register[regA] / b;
					zwischen = register[regA] % b;
				}
				break;
			}
			case dividiereZReg: {
				int a, regB;
				a = mache.param(0).zahl(this);
				regB = mache.param(1).zahl(this);
				if (prüfeRegister(befehl, regB)) {
					ergebnis = a / register[regB];
					zwischen = a % register[regB];
				}
				break;
			}
			case ergebnisausgebe:
				aus.print(ergebnis);
				break;
			case geheWennFalsch:
				if ( (status & STATUS_FEHLER) != 0) {
					status &= ~STATUS_FEHLER;
					nächste = stellen.get(mache.param(0).string());
				}
				break;
			case geheWennGleich:
				if ( (status & STATUS_GLEICH) != 0) {
					nächste = stellen.get(mache.param(0).string());
				}
				break;
			case geheWennGrößer:
				if ( (status & STATUS_GLEICH) != 0) {
					nächste = stellen.get(mache.param(0).string());
				}
				break;
			case geheWennGrößerGleich:
				if ( (status & (STATUS_GLEICH | STATUS_GRÖẞER)) != 0) {
					nächste = stellen.get(mache.param(0).string());
				}
				break;
			case geheWennKleiner:
				if ( (status & STATUS_KLEINER) != 0) {
					nächste = stellen.get(mache.param(0).string());
				}
				break;
			case geheWennKleinerGleich:
				if ( (status & (STATUS_GLEICH | STATUS_KLEINER)) != 0) {
					nächste = stellen.get(mache.param(0).string());
				}
				break;
			case geheWennNichtGleich:
				if ( (status & STATUS_GLEICH) == 0) {
					nächste = stellen.get(mache.param(0).string());
				}
				break;
			case geheZuDirekt: {
				int ziel = mache.param(0).zahl(this);
				prüfeRegister(befehl, ziel);
				nächste = ziel;
				break;
			}
			case geheZurück:
				if (stapelZeiger <= 0) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = LEERER_STAPEL_SPRUNG;
					letzterFehlerBefehl = befehl;
				} else {
					int ziel = stapel[ -- stapelZeiger];
					if (ziel < 0) {
						if (fehlerStoppen) stoppe = true;
						status |= STATUS_FEHLER;
						letzterFehlerArt = NEGATIVE_BEFEHL_ANSPRACHE;
						letzterFehlerBefehl = befehl;
						letzterFehlerZusatzInfo = ziel;
					} else if (ziel >= anordnungen.length) {
						if (fehlerStoppen) stoppe = true;
						status |= STATUS_FEHLER;
						letzterFehlerArt = Zu_WENIGE_BEFEHLE;
						letzterFehlerBefehl = befehl;
						letzterFehlerZusatzInfo = ziel;
					} else {
						nächste = ziel;
					}
				}
				break;
			case ladeInRegister: {
				int zahl = mache.param(0).zahl(this);
				int reg = mache.param(1).zahl(this);
				if (prüfeRegister(befehl, reg)) {
					register[reg] = zahl;
				}
				break;
			}
			case ladeRegisterAnzahlErg:
				ergebnis = register.length;
				break;
			case ladeRegisterAnzahlZw:
				zwischen = register.length;
				break;
			case ladeVomRegisterErg: {
				int reg = mache.param(0).zahl(this);
				if (prüfeRegister(befehl, reg)) {
					ergebnis = register[reg];
				}
			}
				break;
			case ladeVomRegisterZw: {
				int reg = mache.param(0).zahl(this);
				if (prüfeRegister(befehl, reg)) {
					zwischen = register[reg];
				}
				break;
			}
			case leerzeichen:
				aus.print(' ');
				break;
			case leerzeile:
				aus.println();
				break;
			case leseZahlEinErg:
				try {
					ergebnis = ein.nextInt();
				} catch (InputMismatchException imme) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = FALSCHE_BENUTZER_EINGABE;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = 1;
				}
				break;
			case leseZahlEinZwischen:
				try {
					zwischen = ein.nextInt();
				} catch (InputMismatchException imme) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = FALSCHE_BENUTZER_EINGABE;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = 1;
				}
				break;
			case letzterFehler:
				ergebnis = letzterFehlerBefehl;
				zwischen = letzterFehlerArt;
				break;
			case multipliziere: {
				int a, b;
				a = mache.param(0).zahl(this);
				b = mache.param(1).zahl(this);
				ergebnis = a * b;
				break;
			}
			case multipliziereRegReg: {
				int regA, regB;
				regA = mache.param(0).zahl(this);
				regB = mache.param(1).zahl(this);
				ergebnis = register[regA] * register[regB];
			}
				break;
			case multipliziereRegZ: {
				int regA, b;
				regA = mache.param(0).zahl(this);
				b = mache.param(1).zahl(this);
				ergebnis = register[regA] * b;
			}
				break;
			case multipliziereZReg: {
				int a, regB;
				a = mache.param(0).zahl(this);
				regB = mache.param(1).zahl(this);
				ergebnis = a * register[regB];
			}
				break;
			case registerWortEinlesen: {
				int reg = mache.param(0).zahl(this);
				if (prüfeRegister(befehl, reg)) {
					char[] wort = ein.next().toCharArray();
					register[reg] = wort.length;
					for (int i = 0; reg + i + 1 < wort.length; i ++ ) {
						register[reg + i + 1] = wort[i];
					}
				}
				break;
			}
			case registerZeichenEinlesen: {
				int anz = mache.param(0).zahl(this);
				int reg = mache.param(1).zahl(this);
				if (prüfeRegister(befehl, reg)) {
					char[] wort = ein.next("\\w(" + anz + "," + anz + ")").toCharArray();
					register[reg] = wort.length;
					for (int i = 0; reg + i + 1 < wort.length; i ++ ) {
						register[reg + i + 1] = wort[i];
					}
				}
				break;
			}
			case registerausgabe: {
				int regA = mache.param(0).zahl(this);
				int regB = mache.param(1).zahl(this);
				if (regA > regB) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = BEREICHSENDE_KLEINER_BEREICHSSTART;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = regB - regA;
				} else if (prüfeRegister(befehl, regA) && prüfeRegister(befehl, regB)) {
					StringBuilder bau = new StringBuilder(regB - regA);
					for (; regA < regB; regA ++ ) {
						bau.append((char) register[regA]);
					}
					aus.print(bau);
				}
				break;
			}
			case rufeAuf:
				if (stapelZeiger >= stapel.length) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = ZU_GROẞER_STAPEL;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = stellen.get(mache.param(0).string());
				} else {
					stapel[stapelZeiger ++ ] = nächste;
					nächste = stellen.get(mache.param(0).string());
				}
				break;
			case rufeAufDirekt: {
				int ziel = mache.param(0).zahl(this);
				if (ziel < 0) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = NEGATIVE_BEFEHL_ANSPRACHE;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = ziel;
				} else if (ziel >= anordnungen.length) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = Zu_WENIGE_BEFEHLE;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = ziel;
				} else if (stapelZeiger >= stapel.length) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = ZU_GROẞER_STAPEL;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = ziel;
				}
			}
				break;
			case rufeAufGrößer:
				if ( (status & STATUS_GRÖẞER) == 0) break;
				if (stapelZeiger >= stapel.length) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = ZU_GROẞER_STAPEL;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = stellen.get(mache.param(0).string());
				} else {
					stapel[stapelZeiger ++ ] = nächste;
					nächste = stellen.get(mache.param(0).string());
				}
				break;
			case rufeAufGrößerGleich:
				if ( (status & (STATUS_GRÖẞER | STATUS_GLEICH)) == 0) break;
				if (stapelZeiger >= stapel.length) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = ZU_GROẞER_STAPEL;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = stellen.get(mache.param(0).string());
				} else {
					stapel[stapelZeiger ++ ] = nächste;
					nächste = stellen.get(mache.param(0).string());
				}
				break;
			case rufeAufKleinerGleich:
				if ( (status & (STATUS_GLEICH | STATUS_KLEINER)) == 0) break;
				if (stapelZeiger >= stapel.length) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = ZU_GROẞER_STAPEL;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = stellen.get(mache.param(0).string());
				} else {
					stapel[stapelZeiger ++ ] = nächste;
					nächste = stellen.get(mache.param(0).string());
				}
				break;
			case rufeAufWennFalsch:
				if ( (status & STATUS_FEHLER) == 0) break;
				if (stapelZeiger >= stapel.length) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = ZU_GROẞER_STAPEL;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = stellen.get(mache.param(0).string());
				} else {
					stapel[stapelZeiger ++ ] = nächste;
					nächste = stellen.get(mache.param(0).string());
				}
				break;
			case rufeAufWennGleich:
				if ( (status & STATUS_GLEICH) == 0) break;
				if (stapelZeiger >= stapel.length) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = ZU_GROẞER_STAPEL;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = stellen.get(mache.param(0).string());
				} else {
					stapel[stapelZeiger ++ ] = nächste;
					nächste = stellen.get(mache.param(0).string());
				}
				break;
			case rufeAufWennKleiner:
				if ( (status & STATUS_KLEINER) == 0) break;
				if (stapelZeiger >= stapel.length) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = ZU_GROẞER_STAPEL;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = stellen.get(mache.param(0).string());
				} else {
					stapel[stapelZeiger ++ ] = nächste;
					nächste = stellen.get(mache.param(0).string());
				}
				break;
			case rufeAufWennNichtGleich:
				if ( (status & STATUS_GLEICH) != 0) break;
				if (stapelZeiger >= stapel.length) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = ZU_GROẞER_STAPEL;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = stellen.get(mache.param(0).string());
				} else {
					stapel[stapelZeiger ++ ] = nächste;
					nächste = stellen.get(mache.param(0).string());
				}
				break;
			case springe:
				nächste = stellen.get(mache.param(0).string());
				break;
			case stapelGrößeErg:
				ergebnis = stapelZeiger;
				break;
			case stapelGrößeReg: {
				int reg = mache.param(0).zahl(this);
				if (prüfeRegister(befehl, reg)) {
					register[reg] = stapelZeiger;
				}
				break;
			}
			case stapelGrößeZw:
				zwischen = stapelZeiger;
				break;
			case stapelLesenErg: {
				if (stapelZeiger <= 0) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = LEERER_STAPEL_SPRUNG;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = 0;
				} else {
					ergebnis = stapel[ -- stapelZeiger];
				}
				break;
			}
			case stapelLesenReg: {
				int reg = mache.param(0).zahl(this);
				if (stapelZeiger <= 0) {
					status |= STATUS_FEHLER;
					letzterFehlerArt = LEERER_STAPEL_SPRUNG;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = reg;
				} else {
					if (prüfeRegister(befehl, reg)) {
						register[reg] = stapel[ -- stapelZeiger];
					}
				}
				break;
			}
			case stapelLesenZw: {
				int reg = mache.param(0).zahl(this);
				if (stapelZeiger <= 0) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = LEERER_STAPEL_SPRUNG;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = 0;
				} else {
					if (prüfeRegister(befehl, reg)) {
						zwischen = stapel[ -- stapelZeiger];
					}
				}
				break;
			}
			case stapelMaxGrößeErg:
				ergebnis = stapel.length;
				break;
			case stapelMaxGrößeReg: {
				int reg = mache.param(0).zahl(this);
				if (prüfeRegister(befehl, reg)) {
					register[reg] = stapel.length;
				}
				break;
			}
			case stapelMaxGrößeZw:
				zwischen = stapel.length;
				break;
			case stapelSchreiben: {
				int legen = mache.param(0).zahl(this);
				if (stapel.length <= stapelZeiger) {
					if (fehlerStoppen) stoppe = true;
					status |= STATUS_FEHLER;
					letzterFehlerArt = ZU_GROẞER_STAPEL;
					letzterFehlerBefehl = befehl;
					letzterFehlerZusatzInfo = legen;
				} else {
					stapel[stapelZeiger ++ ] = legen;
				}
				break;
			}
			case stelle:
				// nichts zu tun
				break;
			case subtrahiere: {
				int a, b;
				a = mache.param(0).zahl(this);
				b = mache.param(1).zahl(this);
				ergebnis = a - b;
				break;
			}
			case subtrahiereRegReg: {
				int regA, regB;
				regA = mache.param(0).zahl(this);
				regB = mache.param(1).zahl(this);
				ergebnis = register[regA] - register[regB];
				break;
			}
			case subtrahiereRegZ: {
				int regA, b;
				regA = mache.param(0).zahl(this);
				b = mache.param(1).zahl(this);
				ergebnis = register[regA] - b;
				break;
			}
			case subtrahiereZReg: {
				int a, regB;
				a = mache.param(0).zahl(this);
				regB = mache.param(1).zahl(this);
				ergebnis = a - register[regB];
				break;
			}
			case vergleiche: {
				int a = mache.param(0).zahl(this);
				int b = mache.param(0).zahl(this);
				if (a == b) {
					status &= STATUS_GRÖẞER | STATUS_KLEINER;
					status |= STATUS_GLEICH;
				} else if (a > b) {
					status &= STATUS_GLEICH | STATUS_KLEINER;
					status |= STATUS_GRÖẞER;
				} else {
					status &= STATUS_GLEICH | STATUS_GRÖẞER;
					status |= STATUS_KLEINER;
				}
				break;
			}
			case vergleicheRegister: {
				int as = mache.param(0).zahl(this);
				int ae = mache.param(1).zahl(this);
				int bs = mache.param(2).zahl(this);
				int be = mache.param(3).zahl(this);
				if (prüfeRegister(befehl, as) && prüfeRegister(befehl, ae) && prüfeRegister(befehl, bs) && prüfeRegister(befehl, be)) {
					if (ae >= as) {
						if (fehlerStoppen) stoppe = true;
						status |= STATUS_FEHLER;
						letzterFehlerArt = BEREICHSENDE_KLEINER_BEREICHSSTART;
						letzterFehlerBefehl = befehl;
						letzterFehlerZusatzInfo = 1;
					} else if (be >= bs) {
						status |= STATUS_FEHLER;
						letzterFehlerArt = BEREICHSENDE_KLEINER_BEREICHSSTART;
						letzterFehlerBefehl = befehl;
						letzterFehlerZusatzInfo = 2;
					} else {
						ae -= as;
						be -= bs;
						status &= STATUS_GRÖẞER | STATUS_KLEINER;
						status |= STATUS_GLEICH;
						for (int i = 0; i < ae && i < be; i ++ ) {
							if (register[as + i] != register[bs + i]) {
								if (register[as + i] > register[bs + i]) {
									status &= STATUS_GLEICH;
									status |= STATUS_GRÖẞER;
									break;
								} else {
									status &= STATUS_GLEICH;
									status |= STATUS_KLEINER;
									break;
								}
							}
						}
					}
				}
				break;
			}
			case vergleicheRegisterText: {
				int as = mache.param(0).zahl(this);
				int ae = mache.param(1).zahl(this);
				char[] text = mache.param(3).string().toCharArray();
				if (prüfeRegister(befehl, as) && prüfeRegister(befehl, ae)) {
					if (ae >= as) {
						if (fehlerStoppen) stoppe = true;
						status |= STATUS_FEHLER;
						letzterFehlerArt = BEREICHSENDE_KLEINER_BEREICHSSTART;
						letzterFehlerBefehl = befehl;
						letzterFehlerZusatzInfo = 1;
					} else {
						ae -= as;
						status &= STATUS_GRÖẞER | STATUS_KLEINER;
						status |= STATUS_GLEICH;
						for (int i = 0; i < ae && i < text.length; i ++ ) {
							if (register[as + i] != (int) text[i]) {
								if (register[as + i] > (int) text[i]) {
									status &= STATUS_GLEICH;
									status |= STATUS_GRÖẞER;
									break;
								} else {
									status &= STATUS_GLEICH;
									status |= STATUS_KLEINER;
									break;
								}
							}
						}
					}
				}
				break;
			}
			case versionErg:
				ergebnis = version();
				break;
			case versionReg: {
				int reg = mache.param(0).zahl(this);
				if (prüfeRegister(befehl, reg)) {
					register[reg] = version();
				}
				break;
			}
			case versionZw:
				zwischen = version();
				break;
			case zwischenisausgebe:
				aus.print(zwischen);
				break;
			case zwischenspeicher:
				zwischen = ergebnis;
				break;
			}
		} catch (Exception e) {
			if (fehlerStoppen) stoppe = true;
			status |= STATUS_FEHLER;
			letzterFehlerArt = UNBBEKANNT;
			letzterFehlerBefehl = befehl;
			letzterFehlerZusatzInfo = e.hashCode();
		}
	}
	
	private boolean prüfeRegister(int befehl, int reg) {
		if (reg < 0) {
			if (fehlerStoppen) stoppe = true;
			status |= STATUS_FEHLER;
			letzterFehlerArt = ZU_KLEINES_REGISTER;
			letzterFehlerBefehl = befehl;
			letzterFehlerZusatzInfo = reg;
			return false;
		} else if (reg >= register.length) {
			if (fehlerStoppen) stoppe = true;
			status |= STATUS_FEHLER;
			letzterFehlerArt = ZU_WENIGE_REGISTER;
			letzterFehlerBefehl = befehl;
			letzterFehlerZusatzInfo = reg;
			return false;
		}
		return true;
	}
	
	private void mache() {
		status |= STATUS_LÄUFT;
		status &= ~STATUS_ANGEHALTEN;
		while ( !stoppe && nächste >= anordnungen.length) {
			mache(anordnungen[nächste], nächste);
			nächste ++ ;
		}
		status &= ~STATUS_LÄUFT;
		status |= STATUS_ANGEHALTEN;
	}
	
	@Override
	public void stoppe() {
		stoppe = true;
	}
	
	@Override
	public boolean gestoppt() {
		return (status & STATUS_ANGEHALTEN) != 0;
	}
	
}
