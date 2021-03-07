package de.hechler.patrick.tps.interpreter;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

import de.hechler.patrick.tps.antlr.anotatins.Version;
import de.hechler.patrick.tps.antlr.enums.SatzArt;
import de.hechler.patrick.tps.antlr.objects.Parameter;
import de.hechler.patrick.tps.antlr.objects.Satz;
import de.hechler.patrick.tps.antlr.objects.Zahl;

public abstract class SätzeInterpretierenderFehlerSucherVorlage implements SatzFehlerSucherInter {
	
	private final Object innerBlock = new Object();
	
	protected volatile boolean stoppen;
	
	protected volatile boolean fehlerStopp;
	protected volatile boolean sprungStopp;
	protected volatile boolean zurückStopp;
	protected volatile boolean geheInStopp;
	protected volatile boolean punkteStopp;
	
	protected volatile Set <Integer> punkte;
	
	
	
	protected volatile boolean automatischeFehlerSprünge;
	
	protected volatile Map <String, Integer> stellen;
	
	protected volatile long lfStelle;
	protected volatile long lfArt;
	protected volatile long status;
	
	protected final Scanner     eingabe;
	protected final PrintStream ausgabe;
	
	protected volatile long ergebnis;
	protected volatile long zwischen;
	
	protected final long[] register;
	protected final long[] stapel;
	protected volatile int stapelZeiger;
	
	protected volatile Satz[] sätze;
	protected volatile int    satzZeiger;
	
	
	
	public SätzeInterpretierenderFehlerSucherVorlage(Scanner eingabe, PrintStream ausgabe, int registerAnzahl, int stapelMaxGröße) {
		this.eingabe = eingabe;
		this.ausgabe = ausgabe;
		this.register = new long[registerAnzahl];
		this.stapel = new long[stapelMaxGröße];
		this.stapelZeiger = 0;
		this.satzZeiger = 0;
	}
	
	@Override
	public void lade(Satz[] sätze) {
		synchronized (this) {
			this.sätze = sätze.clone();
			this.stellen = new HashMap <String, Integer>();
			for (int i = 0; i < this.sätze.length; i ++ ) {
				if (this.sätze[i].art == SatzArt.stelle) {
					this.stellen.put(this.sätze[i].param(0).zeichenKette(), i);
				}
			}
		}
	}
	
	@Override
	public boolean leereStapel() {
		return stapelZeiger == 0;
	}
	
	@Override
	public long zahl(Parameter zahl) {
		if (zahl.istKonstante()) return zahl.zahl();
		else if (zahl.ergebniszahl()) return ergebnis;
		else if (zahl.zwischenzahl()) return zwischen;
		else throw new IllegalArgumentException("Kein Zahlenparameter: " + zahl);
	}
	
	@Override
	public long zahl(Zahl zahl) {
		if (zahl.erg != null) return zahl.erg ? ergebnis : zwischen;
		else return zahl.zahl;
	}
	
	@Override
	public long status() {
		return status;
	}
	
	@Override
	public long ergebnis() {
		return ergebnis;
	}
	
	@Override
	public long zwischen() {
		return zwischen;
	}
	
	@Override
	public long register(long index) throws IndexOutOfBoundsException {
		if (index < 0 || register.length <= index) {
			throw new IndexOutOfBoundsException("len=" + register.length + "  i=" + index);
		}
		return register[(int) index];
	}
	
	@Override
	public long registerAnzahl() {
		return register.length;
	}
	
	@Override
	public long stapelGröße() {
		return stapelZeiger;
	}
	
	@Override
	public long stapelMaxGröße() {
		return stapel.length;
	}
	
	@Override
	public long letzterFehlerArt() {
		return lfArt;
	}
	
	@Override
	public long letzterFehlerStelle() {
		return lfStelle;
	}
	
	@Override
	public int version() throws UnsupportedOperationException {
		Version version = this.getClass().getAnnotation(Version.class);
		if (version != null) {
			return version.value();
		} else throw new UnsupportedOperationException("unknown version");
	}
	
	@Override
	public boolean hatAutomatischenFehlerSprung() {
		return automatischeFehlerSprünge;
	}
	
	@Override
	public void ergebnis(long neu) {
		synchronized (innerBlock) {
			ergebnis = neu;
		}
	}
	
	@Override
	public void zwischen(long neu) {
		synchronized (innerBlock) {
			zwischen = neu;
		}
	}
	
	@Override
	public void register(long index, long neuerWert) throws IndexOutOfBoundsException {
		if (index < 0 || index >= register.length) {
			throw new IndexOutOfBoundsException("len=" + register.length + "  i=" + index);
		}
		synchronized (innerBlock) {
			register[(int) index] = neuerWert;
		}
	}
	
	@Override
	public void status(long neu) {
		synchronized (innerBlock) {
			status = neu;
		}
	}
	
	@Override
	public void stoppeBeiFehler(boolean stoppendeFehler) {
		this.fehlerStopp = stoppendeFehler;
	}
	
	@Override
	public boolean stopptBeiFehlern() {
		return fehlerStopp;
	}
	
	@Override
	public void neuerStoppPunkt(long satz) throws IndexOutOfBoundsException {
		if (satz < 0 || satz >= sätze.length) {
			throw new IndexOutOfBoundsException("len=" + sätze.length + "  i=" + satz);
		}
		punkte.add((int) satz);
	}
	
	@Override
	public void entferneStoppPunkt(long keinStopper) throws IndexOutOfBoundsException, NoSuchElementException {
		if (keinStopper < 0 || keinStopper >= sätze.length) {
			throw new IndexOutOfBoundsException("len=" + sätze.length + "  i=" + keinStopper);
		}
		punkte.remove((int) keinStopper);
	}
	
	@Override
	public Set <Long> stoppPunkte() {
		Set <Long> erg = new HashSet <Long>();
		punkte.forEach(i -> erg.add((long) i));
		return erg;
	}
	
	@Override
	public boolean stopptBeiStoppPunkten() {
		return punkteStopp;
	}
	
	@Override
	public void stoppeBeiStoppPunkten(boolean stoppendePunkte) {
		punkteStopp = stoppendePunkte;
	}
	
	@Override
	public long anzahlSätze() {
		return (long) sätze.length;
	}
	
	@Override
	public Map <String, Long> stellen() {
		Map <String, Long> erg = new HashMap <String, Long>();
		stellen.forEach((s, i) -> erg.put(s, (long) i));
		return erg;
	}
	
	@Override
	public boolean stopptBeiZurückgehen() {
		return zurückStopp;
	}
	
	@Override
	public void stoppeBeiGeheZurück(boolean stoppendesZurückgehen) {
		zurückStopp = stoppendesZurückgehen;
	}
	
	@Override
	public boolean stopptBeiReingehen() {
		return geheInStopp;
	}
	
	@Override
	public void stoppeBeiGeheZu(boolean stoppendesReingehen) {
		geheInStopp = stoppendesReingehen;
	}
	
	@Override
	public boolean stopptBeiSprüngen() {
		return sprungStopp;
	}
	
	@Override
	public void stoppeBeiSprüngen(boolean stoppendeSprünge) {
		sprungStopp = stoppendeSprünge;
	}
	
	@Override
	public Satz nächster() {
		if (satzZeiger >= sätze.length || satzZeiger < 0) return null;
		return sätze[satzZeiger];
	}
	
	@Override
	public boolean hatNächsten() {
		if (satzZeiger >= sätze.length || satzZeiger < 0) return false;
		return true;
	}
	
	@Override
	public void macheEinenSatz() {
		synchronized (this) {
			if (stoppen) {
				stoppen = false;
				return;
			}
			status = (status & ~STATUS_ANGEHALTEN) | STATUS_LÄUFT;
			synchronized (innerBlock) {
				satzZeiger ++ ;
				mache(sätze[satzZeiger - 1], satzZeiger - 1);
			}
			status = (status & ~STATUS_LÄUFT) | STATUS_ANGEHALTEN;
		}
	}
	
	@Override
	public void macheBisGeheZurück() {
		synchronized (this) {
			status = (status & ~STATUS_ANGEHALTEN) | STATUS_LÄUFT;
			boolean stopp = stoppen;
			while ( !stopp && satzZeiger < sätze.length) {
				Ergebnis erg;
				synchronized (innerBlock) {
					satzZeiger ++ ;
					erg = mache(sätze[satzZeiger - 1], satzZeiger - 1);
				}
				switch (erg) {
				case fehler:
					stopp = fehlerStopp;
					break;
				case geheInBef:
					stopp = geheInStopp;
					break;
				case geheZurückBef:
					stopp = true;
					break;
				case sprungBef:
					stopp = sprungStopp;
					break;
				case nichtsBesonderes:
					break;
				}
				if (stoppen) break;
			}
			status = (status & ~STATUS_LÄUFT) | STATUS_ANGEHALTEN;
			stoppen = false;
		}
	}
	
	@Override
	public void macheBisGeheIn() {
		synchronized (this) {
			status = (status & ~STATUS_ANGEHALTEN) | STATUS_LÄUFT;
			boolean stopp = stoppen;
			while ( !stopp && satzZeiger < sätze.length) {
				Ergebnis erg;
				synchronized (innerBlock) {
					satzZeiger ++ ;
					erg = mache(sätze[satzZeiger - 1], satzZeiger - 1);
				}
				switch (erg) {
				case fehler:
					stopp = fehlerStopp;
					break;
				case geheInBef:
					stopp = true;
					break;
				case geheZurückBef:
					stopp = zurückStopp;
					break;
				case sprungBef:
					stopp = sprungStopp;
					break;
				case nichtsBesonderes:
					break;
				}
				if (stoppen) break;
			}
			status = (status & ~STATUS_LÄUFT) | STATUS_ANGEHALTEN;
			stoppen = false;
		}
	}
	
	@Override
	public void macheBisSprung() {
		synchronized (this) {
			status = (status & ~STATUS_ANGEHALTEN) | STATUS_LÄUFT;
			boolean stopp = stoppen;
			while ( !stopp && satzZeiger < sätze.length) {
				Ergebnis erg;
				synchronized (innerBlock) {
					satzZeiger ++ ;
					erg = mache(sätze[satzZeiger - 1], satzZeiger - 1);
				}
				switch (erg) {
				case fehler:
					stopp = fehlerStopp;
					break;
				case geheInBef:
					stopp = geheInStopp;
					break;
				case geheZurückBef:
					stopp = zurückStopp;
					break;
				case sprungBef:
					stopp = true;
					break;
				case nichtsBesonderes:
					break;
				}
				if (stoppen) break;
			}
			status = (status & ~STATUS_LÄUFT) | STATUS_ANGEHALTEN;
			stoppen = false;
		}
	}
	
	@Override
	public void run() {
		synchronized (this) {
			status = (status & ~STATUS_ANGEHALTEN) | STATUS_LÄUFT;
			boolean stopp = stoppen;
			while ( !stopp && satzZeiger < sätze.length) {
				Ergebnis erg;
				synchronized (innerBlock) {
					satzZeiger ++ ;
					erg = mache(sätze[satzZeiger - 1], satzZeiger - 1);
				}
				switch (erg) {
				case fehler:
					stopp = fehlerStopp;
					break;
				case geheInBef:
					stopp = geheInStopp;
					break;
				case geheZurückBef:
					stopp = zurückStopp;
					break;
				case sprungBef:
					stopp = sprungStopp;
					break;
				case nichtsBesonderes:
					break;
				}
				if (stoppen) break;
			}
			status = (status & ~STATUS_LÄUFT) | STATUS_ANGEHALTEN;
			stoppen = false;
		}
	}
	
	@Override
	public void einfachMalSo(Satz machen) {
		synchronized (this) {
			status = (status & ~STATUS_ANGEHALTEN) | STATUS_LÄUFT;
			synchronized (innerBlock) {
				mache(machen, -1);
			}
			status = (status & ~STATUS_LÄUFT) | STATUS_ANGEHALTEN;
		}
	}
	
	@Override
	public void springe(String stelle) throws NoSuchElementException {
		Integer ziel = stellen.get(stelle);
		if (ziel == null) {
			throw new NoSuchElementException("unbekannte stelle: '" + stelle + "' bekannte stellen: '" + stellen + "'");
		}
		synchronized (innerBlock) {
			satzZeiger = ziel;
		}
	}
	
	@Override
	public void springe(long satz) throws IndexOutOfBoundsException {
		if (satz < 0 || satz >= sätze.length) {
			throw new IndexOutOfBoundsException("len=" + sätze.length + "  i=" + satz);
		}
		synchronized (innerBlock) {
			satzZeiger = (int) satz;
		}
	}
	
	@Override
	public void geheZu(String stelle) throws NoSuchElementException {
		Integer ziel = stellen.get(stelle);
		if (ziel == null) {
			throw new NoSuchElementException("unbekannte stelle: '" + stelle + "' bekannte stellen: '" + stellen + "'");
		}
		if (stapelZeiger >= stapel.length) {
			throw new IllegalStateException("stapel voll: max=" + stapel.length + "  zeiger=" + stapelZeiger);
		}
		synchronized (innerBlock) {
			stapel[stapelZeiger ++ ] = satzZeiger;
			satzZeiger = ziel;
		}
	}
	
	@Override
	public void geheZu(long satz) throws IndexOutOfBoundsException {
		if (satz < 0 || satz >= sätze.length) {
			throw new IndexOutOfBoundsException("len=" + sätze.length + "  i=" + satz);
		}
		if (stapelZeiger >= stapel.length) {
			throw new IllegalStateException("stapel voll: max=" + stapel.length + "  zeiger=" + stapelZeiger);
		}
		synchronized (innerBlock) {
			stapel[stapelZeiger ++ ] = satzZeiger;
			satzZeiger = (int) satz;
		}
	}
	
	@Override
	public void geheZurück() throws IllegalStateException, IndexOutOfBoundsException {
		if (stapelZeiger <= 0) throw new IllegalStateException("leerer stapel!");
		synchronized (innerBlock) {
			long ziel = stapel[ -- stapelZeiger];
			if (ziel < 0 || ziel >= sätze.length) {
				stapelZeiger ++ ;
				throw new IndexOutOfBoundsException("len=" + sätze.length + "  i=" + ziel);
			}
			satzZeiger = (int) ziel;
		}
	}
	
	@Override
	public void halteAn() {
		stoppen = true;
	}
	
	@Override
	public boolean hältAn() {
		return stoppen;
	}
	
	protected abstract Ergebnis mache(Satz satz, long stelle);
	
	protected boolean testRegister(long reg, long stelle) {
		if (reg < 0) {
			fehler(FEHLER_ZU_KLEINE_REGISTERANGABE, stelle);
			return false;
		} else if (reg >= register.length) {
			fehler(FEHLER_ZU_GROẞE_REGISTERANGABE, stelle);
			return false;
		} else {
			return true;
		}
	}
	
	protected boolean testSatz(long satz, long stelle) {
		if (satz < 0) {
			fehler(FEHLER_ZU_KLEINE_SATZANGABE, stelle);
			return false;
		} else if (satz >= sätze.length) {
			fehler(FEHLER_ZU_GROẞE_SATZANGABE, stelle);
			return false;
		} else {
			return true;
		}
	}
	
	protected boolean testStapel(boolean legen, long stelle) {
		if (legen) {
			if (stapelZeiger >= stapel.length) {
				fehler(FEHLER_STAPEL_ÜBERFÜLT, stelle);
				return false;
			} else return true;
		} else {
			if (stapelZeiger <= 0) {
				fehler(FEHLER_LEERER_STAPEL, stelle);
				return false;
			} else return true;
		}
	}
	
	protected void fehler(long art, long stelle) {
		status |= STATUS_FEHLER;
		lfArt = art;
		lfStelle = stelle;
	}
	
	public enum Ergebnis {
		nichtsBesonderes,
		
		sprungBef, geheInBef, geheZurückBef,
		
		fehler,
	}
	
}
