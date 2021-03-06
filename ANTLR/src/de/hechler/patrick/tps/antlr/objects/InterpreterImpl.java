package de.hechler.patrick.tps.antlr.objects;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

import de.hechler.patrick.tps.antlr.InterpreterInterface;
import de.hechler.patrick.tps.antlr.enums.SatzArt;
import de.hechler.patrick.tps.interpreter.Version;


@Version(6)
public class InterpreterImpl implements InterpreterInterface {
	
	private volatile Map <String, Integer> stellen;
	
	private volatile long lfStelle;
	private volatile long lfArt;
	private volatile long status;
	
	private final Scanner     eingabe;
	private final PrintStream ausgabe;
	
	private volatile long ergebnis;
	private volatile long zwischen;
	
	private final long[] register;
	private final long[] stapel;
	private volatile int stapelZeiger;
	
	private volatile Satz[] sätze;
	private volatile int    satzZeiger;
	
	
	
	public InterpreterImpl(int registerAnzahl, int maxStapelGr, PrintStream out, Scanner in) {
		this.register = new long[registerAnzahl];
		this.stapel = new long[maxStapelGr];
		this.eingabe = in;
		this.ausgabe = out;
	}
	
	
	@Override
	public void run() {
		while (satzZeiger < sätze.length) {
			synchronized (this) {
				Satz mache = sätze[(int) satzZeiger ++ ];
				switch (mache.art) {
				case addiere:
					ergebnis = mache.param(0).zahl(this) + mache.param(1).zahl(this);
					break;
				case ausgabe:
					ausgabe.print(mache.param(0));
					break;
				case dividiere: {
					long a = mache.param(0).zahl(this);
					long b = mache.param(1).zahl(this);
					if (b == 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_TEILEN_DURCH_NULL;
						lfStelle = satzZeiger - 1;
					} else {
						ergebnis = a / b;
						zwischen = a % b;
					}
					break;
				}
				case geheZurück:
					if (stapelZeiger == 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_LEERER_STAPEL;
						lfStelle = satzZeiger - 1;
					} else {
						long ziel = stapel[(int) -- stapelZeiger];
						if (ziel < 0) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_ZU_KLEINE_SATZANGABE;
							lfStelle = satzZeiger - 1;
						} else if (ziel >= sätze.length) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_ZU_GROẞE_SATZANGABE;
							lfStelle = satzZeiger - 1;
						} else {
							satzZeiger = (int) ziel;
						}
					}
					break;
				case ladeInRegister: {
					long reg = mache.param(0).zahl(this);
					long wert = mache.param(1).zahl(this);
					if (reg < 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_KLEINE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else if (reg >= register.length) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_GROẞE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else {
						register[(int) reg] = wert;
					}
					break;
				}
				case ladeRegisterAnzahlErg:
					ergebnis = (long) register.length;
					break;
				case ladeRegisterAnzahlZw:
					zwischen = (long) register.length;
					break;
				case ladeVomRegisterErg: {
					long reg = mache.param(0).zahl(this);
					if (reg < 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_KLEINE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else if (reg >= register.length) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_GROẞE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else {
						ergebnis = register[(int) reg];
					}
					break;
				}
				case ladeVomRegisterZw: {
					long reg = mache.param(0).zahl(this);
					if (reg < 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_KLEINE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else if (reg >= register.length) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_GROẞE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else {
						zwischen = register[(int) reg];
					}
					break;
				}
				case leerzeichen:
					ausgabe.print(' ');
					break;
				case leerzeile:
					ausgabe.println();
					break;
				case leseZahlEinErg:
					try {
						ergebnis = eingabe.nextLong();
					} catch (InputMismatchException e) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_EINGABE_KEINE_ZAHL;
						lfStelle = satzZeiger - 1;
					}
					break;
				case leseZahlEinZwischen:
					try {
						zwischen = eingabe.nextLong();
					} catch (InputMismatchException e) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_EINGABE_KEINE_ZAHL;
						lfStelle = satzZeiger - 1;
					} catch (NoSuchElementException e) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_EINGABE_ZUENDE;
						lfStelle = satzZeiger - 1;
					}
					break;
				case letzterFehler:
					ergebnis = lfArt;
					zwischen = lfStelle;
					break;
				case multipliziere: {
					long a = mache.param(0).zahl(this);
					long b = mache.param(1).zahl(this);
					ergebnis = a * b;
					break;
				}
				case registerWortEinlesen: {
					long reg = mache.param(0).zahl(this);
					if (reg < 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_KLEINE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else if (reg >= register.length) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_GROẞE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else {
						try {
							char[] chars = eingabe.next().toCharArray();
							register[(int) reg] = (long) chars.length;
							long len = chars.length;
							if (chars.length + reg >= register.length) {
								len = register.length - reg - 1;
							}
							System.arraycopy(chars, 0, register, (int) (reg + 1), (int) len);
						} catch (NoSuchElementException e) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_EINGABE_ZUENDE;
							lfStelle = satzZeiger - 1;
						}
					}
					break;
				}
				case registerZeichenEinlesen: {
					long reg = mache.param(0).zahl(this);
					long anzahl = mache.param(1).zahl(this);
					if (anzahl < 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_NEGATIVE_ZAHL;
						lfStelle = satzZeiger - 1;
					}
					if (reg < 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_KLEINE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else if (reg >= register.length) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_GROẞE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else {
						try {
							char[] chars = eingabe.next("\\w(" + anzahl + "," + anzahl + ")").toCharArray();
							long len = chars.length;
							if (chars.length + reg > register.length) {
								len = register.length - reg;
							}
							System.arraycopy(chars, 0, register, (int) reg, (int) len);
						} catch (NoSuchElementException e) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_EINGABE_ZUENDE;
							lfStelle = satzZeiger - 1;
						}
					}
					break;
				}
				case registerausgabe: {
					long reg = mache.param(0).zahl(this);
					long regB = mache.param(1).zahl(this);
					if (reg < 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_KLEINE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else if (reg >= register.length) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_GROẞE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else if (regB < 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_KLEINE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else if (regB >= register.length) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_GROẞE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else {
						char[] chars;
						if (regB < reg) {
							chars = new char[(int) (regB - reg)];
							for (int i = (int) reg, ii = 0; i <= regB; i ++ , ii ++ ) {
								register[i] = chars[ii];
							}
						} else {
							chars = new char[(int) (reg - regB)];
							for (int i = (int) reg, ii = 0; i <= regB; i -- , ii ++ ) {
								register[i] = chars[ii];
							}
						}
						ausgabe.print(new String(chars));
					}
					break;
				}
				case rufeAuf: {
					String ziel = mache.param(0).toString();
					Integer index = stellen.get(ziel);
					if (index == null) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_UNBEKANNT;
						lfStelle = satzZeiger - 1;
					} else if (stapelZeiger >= stapel.length) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_STAPEL_ÜBERFÜLT;
						lfStelle = satzZeiger - 1;
					} else {
						stapel[(int) stapelZeiger ++ ] = (long) satzZeiger;
						satzZeiger = (int) index;
					}
					break;
				}
				case rufeAufDirekt: {
					long ziel = mache.param(0).zahl(this);
					if (ziel < 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_KLEINE_SATZANGABE;
						lfStelle = satzZeiger - 1;
					} else if (ziel >= sätze.length) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_GROẞE_SATZANGABE;
						lfStelle = satzZeiger - 1;
					} else if (stapelZeiger >= stapel.length) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_STAPEL_ÜBERFÜLT;
						lfStelle = satzZeiger - 1;
					} else {
						stapel[(int) stapelZeiger ++ ] = (long) satzZeiger;
						satzZeiger = (int) ziel;
					}
					break;
				}
				case rufeAufGrößer: {
					if ( (status & STATUS_GRÖẞER) != 0) {
						String ziel = mache.param(0).toString();
						Integer index = stellen.get(ziel);
						if (index == null) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_UNBEKANNT;
							lfStelle = satzZeiger - 1;
						} else if (stapelZeiger >= stapel.length) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_STAPEL_ÜBERFÜLT;
							lfStelle = satzZeiger - 1;
						} else {
							stapel[(int) stapelZeiger ++ ] = (long) satzZeiger;
							satzZeiger = (int) index;
						}
					}
					break;
				}
				case rufeAufGrößerGleich: {
					if ( (status & (STATUS_GRÖẞER | STATUS_GLECIH)) != 0) {
						String ziel = mache.param(0).toString();
						Integer index = stellen.get(ziel);
						if (index == null) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_UNBEKANNT;
							lfStelle = satzZeiger - 1;
						} else if (stapelZeiger >= stapel.length) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_STAPEL_ÜBERFÜLT;
							lfStelle = satzZeiger - 1;
						} else {
							stapel[(int) stapelZeiger ++ ] = (long) satzZeiger;
							satzZeiger = (int) index;
						}
					}
					break;
				}
				case rufeAufKleinerGleich: {
					if ( (status & (STATUS_KLEINER | STATUS_GLECIH)) != 0) {
						String ziel = mache.param(0).toString();
						Integer index = stellen.get(ziel);
						if (index == null) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_UNBEKANNT;
							lfStelle = satzZeiger - 1;
						} else if (stapelZeiger >= stapel.length) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_STAPEL_ÜBERFÜLT;
							lfStelle = satzZeiger - 1;
						} else {
							stapel[(int) stapelZeiger ++ ] = (long) satzZeiger;
							satzZeiger = (int) index;
						}
					}
					break;
				}
				case rufeAufWennFalsch: {
					if ( (status & STATUS_FEHLER) != 0) {
						String ziel = mache.param(0).toString();
						Integer index = stellen.get(ziel);
						if (index == null) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_UNBEKANNT;
							lfStelle = satzZeiger - 1;
						} else if (stapelZeiger >= stapel.length) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_STAPEL_ÜBERFÜLT;
							lfStelle = satzZeiger - 1;
						} else {
							stapel[(int) stapelZeiger ++ ] = (long) satzZeiger;
							satzZeiger = (int) index;
						}
					}
					break;
				}
				case rufeAufWennGleich: {
					if ( (status & STATUS_GLECIH) != 0) {
						String ziel = mache.param(0).toString();
						Integer index = stellen.get(ziel);
						if (index == null) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_UNBEKANNT;
							lfStelle = satzZeiger - 1;
						} else if (stapelZeiger >= stapel.length) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_STAPEL_ÜBERFÜLT;
							lfStelle = satzZeiger - 1;
						} else {
							stapel[(int) stapelZeiger ++ ] = (long) satzZeiger;
							satzZeiger = (int) index;
						}
					}
					break;
				}
				case rufeAufWennKleiner: {
					if ( (status & STATUS_KLEINER) != 0) {
						String ziel = mache.param(0).toString();
						Integer index = stellen.get(ziel);
						if (index == null) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_UNBEKANNT;
							lfStelle = satzZeiger - 1;
						} else if (stapelZeiger >= stapel.length) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_STAPEL_ÜBERFÜLT;
							lfStelle = satzZeiger - 1;
						} else {
							stapel[(int) stapelZeiger ++ ] = (long) satzZeiger;
							satzZeiger = (int) index;
						}
					}
					break;
				}
				case rufeAufWennNichtGleich: {
					if ( (status & STATUS_GLECIH) == 0) {
						String ziel = mache.param(0).toString();
						Integer index = stellen.get(ziel);
						if (index == null) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_UNBEKANNT;
							lfStelle = satzZeiger - 1;
						} else if (stapelZeiger >= stapel.length) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_STAPEL_ÜBERFÜLT;
							lfStelle = satzZeiger - 1;
						} else {
							stapel[(int) stapelZeiger ++ ] = (long) satzZeiger;
							satzZeiger = (int) index;
						}
					}
					break;
				}
				case springe: {
					String ziel = mache.param(0).toString();
					Integer index = stellen.get(ziel);
					if (index == null) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_UNBEKANNT;
						lfStelle = satzZeiger - 1;
					} else {
						satzZeiger = (int) index;
					}
					break;
				}
				case springeWennFalsch: {
					if ( (status & STATUS_FEHLER) != 0) {
						String ziel = mache.param(0).toString();
						Integer index = stellen.get(ziel);
						if (index == null) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_UNBEKANNT;
							lfStelle = satzZeiger - 1;
						} else {
							satzZeiger = (int) index;
						}
					}
					break;
				}
				case springeWennGleich: {
					if ( (status & STATUS_GLECIH) != 0) {
						String ziel = mache.param(0).toString();
						Integer index = stellen.get(ziel);
						if (index == null) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_UNBEKANNT;
							lfStelle = satzZeiger - 1;
						} else {
							satzZeiger = (int) index;
						}
					}
					break;
				}
				case springeWennGrößer: {
					if ( (status & STATUS_GRÖẞER) != 0) {
						String ziel = mache.param(0).toString();
						Integer index = stellen.get(ziel);
						if (index == null) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_UNBEKANNT;
							lfStelle = satzZeiger - 1;
						} else {
							satzZeiger = (int) index;
						}
					}
					break;
				}
				case springeWennGrößerGleich: {
					if ( (status & (STATUS_GRÖẞER | STATUS_GLECIH)) != 0) {
						String ziel = mache.param(0).toString();
						Integer index = stellen.get(ziel);
						if (index == null) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_UNBEKANNT;
							lfStelle = satzZeiger - 1;
						} else {
							satzZeiger = (int) index;
						}
					}
					break;
				}
				case springeWennKleiner: {
					if ( (status & STATUS_KLEINER) != 0) {
						String ziel = mache.param(0).toString();
						Integer index = stellen.get(ziel);
						if (index == null) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_UNBEKANNT;
							lfStelle = satzZeiger - 1;
						} else {
							satzZeiger = (int) index;
						}
					}
					break;
				}
				case springeWennKleinerGleich: {
					if ( (status & (STATUS_KLEINER | STATUS_GLECIH)) != 0) {
						String ziel = mache.param(0).toString();
						Integer index = stellen.get(ziel);
						if (index == null) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_UNBEKANNT;
							lfStelle = satzZeiger - 1;
						} else {
							satzZeiger = (int) index;
						}
					}
					break;
				}
				case springeWennNichtGleich: {
					if ( (status & STATUS_GLECIH) == 0) {
						String ziel = mache.param(0).toString();
						Integer index = stellen.get(ziel);
						if (index == null) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_UNBEKANNT;
							lfStelle = satzZeiger - 1;
						} else {
							satzZeiger = (int) index;
						}
					}
					break;
				}
				case springeZuDirekt: {
					if ( (status & STATUS_FEHLER) != 0) {
						long ziel = mache.param(0).zahl(this);
						if (ziel < 0) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_ZU_KLEINE_SATZANGABE;
							lfStelle = satzZeiger - 1;
						} else if (ziel >= sätze.length) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_ZU_GROẞE_SATZANGABE;
							lfStelle = satzZeiger - 1;
						} else {
							satzZeiger = (int) ziel;
						}
					}
					break;
				}
				case stapelGrößeErg:
					ergebnis = stapelZeiger;
					break;
				case stapelGrößeReg: {
					long reg = mache.param(0).zahl(this);
					if (reg < 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_KLEINE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else if (reg >= register.length) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_GROẞE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else {
						register[(int) reg] = stapelZeiger;
					}
					break;
				}
				case stapelGrößeZw:
					zwischen = stapelZeiger;
					break;
				case stapelLesenErg:
					if (stapelZeiger == 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_LEERER_STAPEL;
						lfStelle = satzZeiger - 1;
					} else {
						ergebnis = stapel[ -- stapelZeiger];
					}
					break;
				case stapelLesenReg:
					if (stapelZeiger == 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_LEERER_STAPEL;
						lfStelle = satzZeiger - 1;
					} else {
						long reg = mache.param(0).zahl(this);
						if (reg < 0) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_ZU_KLEINE_REGISTERANGABE;
							lfStelle = satzZeiger - 1;
						} else if (reg >= register.length) {
							status |= STATUS_FEHLER;
							lfArt = FEHLER_ZU_GROẞE_REGISTERANGABE;
							lfStelle = satzZeiger - 1;
						} else {
							register[(int) reg] = stapel[ -- stapelZeiger];
						}
					}
					break;
				case stapelLesenZw:
					if (stapelZeiger == 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_LEERER_STAPEL;
						lfStelle = satzZeiger - 1;
					} else {
						zwischen = stapel[ -- stapelZeiger];
					}
					break;
				case stapelMaxGrößeErg:
					ergebnis = (long) stapel.length;
					break;
				case stapelMaxGrößeReg: {
					long reg = mache.param(0).zahl(this);
					if (reg < 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_KLEINE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else if (reg >= register.length) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_GROẞE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else {
						register[(int) reg] = stapel.length;
					}
					break;
				}
				case stapelMaxGrößeZw:
					zwischen = (long) stapel.length;
					break;
				case stapelSchreiben:
					if (stapel.length <= stapelZeiger) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_STAPEL_ÜBERFÜLT;
						lfStelle = satzZeiger - 1;
					} else {
						long legen = mache.param(0).zahl(this);
						stapel[stapelZeiger ++ ] = legen;
					}
					break;
				case stelle:
					break;
				case subtrahiere:
					ergebnis = mache.param(0).zahl(this) - mache.param(1).zahl(this);
					break;
				case vergleiche: {
					long a = mache.param(0).zahl(this);
					long b = mache.param(1).zahl(this);
					status &= ~ (STATUS_KLEINER | STATUS_GLECIH | STATUS_GRÖẞER);
					if (a < b) {
						status |= STATUS_KLEINER;
					} else if (a == b) {
						status |= STATUS_GLECIH;
					} else {
						status |= STATUS_GRÖẞER;
					}
					break;
				}
				case vergleicheRegister: {
					long regAa = mache.param(0).zahl(this);
					long regAb = mache.param(1).zahl(this);
					long regBa = mache.param(2).zahl(this);
					long regBb = mache.param(3).zahl(this);
					if (regAa < 0 || regAb < 0 || regBa < 0 || regBb < 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_KLEINE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else if (regAa >= register.length || regAb >= register.length || regBa >= register.length || regBb >= register.length) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_GROẞE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else {
						status &= ~ (STATUS_GRÖẞER | STATUS_KLEINER);
						status |= STATUS_GLECIH;
						boolean regAagr = regAb > regAa;
						long regAkl = regAagr ? regAa : regAb;
						long regAgr = regAagr ? regAb : regAa;
						boolean regBagr = regBb > regBa;
						long regBkl = regBagr ? regBa : regBb;
						long regBgr = regBagr ? regBb : regBa;
						for (int i = 0; i + regAkl <= regAgr && i + regBkl <= regBgr; i ++ ) {
							long a, b;
							if (regAagr) {
								a = register[(int) (regAkl + i)];
							} else {
								a = register[(int) (regAgr - i)];
							}
							if (regBagr) {
								b = register[(int) (regBkl + i)];
							} else {
								b = register[(int) (regBgr - i)];
							}
							if (a < b) {
								status |= STATUS_KLEINER;
								break;
							}
							if (a > b) {
								status |= STATUS_GRÖẞER;
								break;
							}
						}
					}
					break;
				}
				case vergleicheRegisterText: {
					long regAa = mache.param(0).zahl(this);
					long regAb = mache.param(1).zahl(this);
					char[] chars = mache.param(2).toString().toCharArray();
					if (regAa < 0 || regAb < 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_KLEINE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else if (regAa >= register.length || regAb >= register.length) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_GROẞE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else {
						status &= ~ (STATUS_GRÖẞER | STATUS_KLEINER);
						status |= STATUS_GLECIH;
						boolean regAagr = regAb > regAa;
						long regAkl = regAagr ? regAa : regAb;
						long regAgr = regAagr ? regAb : regAa;
						for (int i = 0; i + regAkl <= regAgr && i < chars.length; i ++ ) {
							long a, b;
							if (regAagr) {
								a = register[(int) (regAkl + i)];
							} else {
								a = register[(int) (regAgr - i)];
							}
							b = (long) chars[i];
							if (a < b) {
								status |= STATUS_KLEINER;
								break;
							}
							if (a > b) {
								status |= STATUS_GRÖẞER;
								break;
							}
						}
					}
					break;
				}
				case versionErg:
					ergebnis = version();
					break;
				case versionReg: {
					long reg = mache.param(0).zahl(this);
					if (reg < 0) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_KLEINE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else if (reg >= register.length) {
						status |= STATUS_FEHLER;
						lfArt = FEHLER_ZU_GROẞE_REGISTERANGABE;
						lfStelle = satzZeiger - 1;
					} else {
						register[(int) reg] = version();
					}
					break;
				}
				case versionZw:
					zwischen = version();
					break;
				case zahlenausgabe:
					ausgabe.print(mache.param(0).zahl(this));
					break;
				case zwischenspeicher:
					zwischen = ergebnis;
					break;
				default:
					status |= STATUS_FEHLER;
					lfArt = FEHLER_UNBEKANNT;
					lfStelle = satzZeiger - 1;
				}
			}
		}
	}
	
	@Override
	public int version() {
		Version version = this.getClass().getAnnotation(Version.class);
		if (version != null) {
			return version.value();
		} else return 6;
	}
	
	@Override
	public void lade(Satz[] sätze) {
		synchronized (this) {
			this.sätze = sätze;
			this.stellen = new HashMap <String, Integer>();
			for (int i = 0; i < sätze.length; i ++ ) {
				if (sätze[i].art == SatzArt.stelle) {
					this.stellen.put(sätze[i].param(0).toString(), i);
				}
			}
		}
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
		if (register.length <= index) throw new IndexOutOfBoundsException("len=" + register.length + " i=" + index);
		return register[(int) index];
	}
	
	@Override
	public long registerAnzahl() {
		return (long) register.length;
	}
	
	@Override
	public long StapelGröße() {
		return (long) stapelZeiger;
	}
	
	@Override
	public long StapelMaxGröße() {
		return (long) stapel.length;
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
	public boolean hatAutomatischenFehlerSprung() {
		return false;
	}
	
}
