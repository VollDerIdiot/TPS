package de.hechler.patrick.tps.objects.satzinter.fs;

import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import de.hechler.patrick.tps.antlr.anotatins.Version;
import de.hechler.patrick.tps.antlr.objects.Satz;
import de.hechler.patrick.tps.interpreter.SätzeInterpretierenderFehlerSucherVorlage;

@Version(6)
public class SätzeInterpretierenderFehlerSucher extends SätzeInterpretierenderFehlerSucherVorlage {
	
	public SätzeInterpretierenderFehlerSucher(Scanner eingabe, PrintStream ausgabe, int registerAnzahl, int stapelMaxGröße) {
		super(eingabe, ausgabe, registerAnzahl, stapelMaxGröße);
	}
	
	@Override
	public int version() {
		try {
			return super.version();
		} catch (UnsupportedOperationException e) {
			return 7;
		}
	}
	
	@Override
	protected Ergebnis mache(Satz machen, long stelle) {
		Ergebnis erg;
		try {
			switch (machen.art) {
			case addiere:
				ergebnis = zahl(machen.param(0)) + zahl(machen.param(1));
				erg = Ergebnis.nichtsBesonderes;
				break;
			case ausgabe:
				ausgabe.print(machen.param(0));
				erg = Ergebnis.nichtsBesonderes;
				break;
			case dividiere: {
				long a = zahl(machen.param(0)), b = zahl(machen.param(1));
				if (b == 0) {
					fehler(FEHLER_TEILEN_DURCH_NULL, stelle);
					erg = Ergebnis.fehler;
				} else {
					ergebnis = a / b;
					zwischen = a % b;
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			}
			case geheZurück:
				if (stapelZeiger == 0) {
					fehler(FEHLER_LEERER_STAPEL, stelle);
					erg = Ergebnis.fehler;
				} else {
					long ziel = stapel[ -- stapelZeiger];
					if (ziel < 0) {
						stapelZeiger ++ ;
						fehler(FEHLER_ZU_KLEINE_SATZANGABE, stelle);
						erg = Ergebnis.fehler;
					} else if (ziel >= sätze.length) {
						stapelZeiger ++ ;
						fehler(FEHLER_ZU_GROẞE_SATZANGABE, stelle);
						erg = Ergebnis.fehler;
					} else {
						satzZeiger = (int) ziel;
						erg = Ergebnis.nichtsBesonderes;
					}
				}
				break;
			case ladeInRegister: {
				long reg = zahl(machen.param(0));
				long wert = zahl(machen.param(1));
				if (reg < 0) {
					fehler(FEHLER_ZU_KLEINE_REGISTERANGABE, stelle);
					erg = Ergebnis.fehler;
				} else if (reg >= register.length) {
					fehler(FEHLER_ZU_GROẞE_REGISTERANGABE, stelle);
					erg = Ergebnis.fehler;
				} else {
					register[(int) reg] = wert;
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			}
			case ladeRegisterAnzahlErg:
				ergebnis = (long) register.length;
				erg = Ergebnis.nichtsBesonderes;
				break;
			case ladeRegisterAnzahlZw:
				zwischen = (long) register.length;
				erg = Ergebnis.nichtsBesonderes;
				break;
			case ladeVomRegisterErg: {
				long reg = zahl(machen.param(0));
				if (testRegister(reg, stelle)) {
					ergebnis = register[(int) reg];
					erg = Ergebnis.nichtsBesonderes;
				} else {
					erg = Ergebnis.fehler;
				}
				break;
			}
			case ladeVomRegisterZw: {
				long reg = zahl(machen.param(0));
				if (testRegister(reg, stelle)) {
					zwischen = register[(int) reg];
					erg = Ergebnis.nichtsBesonderes;
				} else {
					erg = Ergebnis.fehler;
				}
				break;
			}
			case leerzeichen:
				ausgabe.print(' ');
				erg = Ergebnis.nichtsBesonderes;
				break;
			case leerzeile:
				ausgabe.println();
				erg = Ergebnis.nichtsBesonderes;
				break;
			case leseZahlEinErg:
				try {
					ergebnis = eingabe.nextLong();
					erg = Ergebnis.nichtsBesonderes;
				} catch (InputMismatchException e) {
					fehler(FEHLER_EINGABE_KEINE_ZAHL, stelle);
					erg = Ergebnis.fehler;
				} catch (NoSuchElementException e) {
					fehler(FEHLER_EINGABE_ZUENDE, stelle);
					erg = Ergebnis.fehler;
				}
				break;
			case leseZahlEinZwischen:
				try {
					zwischen = eingabe.nextLong();
					erg = Ergebnis.nichtsBesonderes;
				} catch (InputMismatchException e) {
					fehler(FEHLER_EINGABE_KEINE_ZAHL, stelle);
					erg = Ergebnis.nichtsBesonderes;
				} catch (NoSuchElementException e) {
					fehler(FEHLER_EINGABE_ZUENDE, stelle);
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			case letzterFehler:
				ergebnis = lfArt;
				zwischen = lfStelle;
				erg = Ergebnis.nichtsBesonderes;
				break;
			case multipliziere:
				ergebnis = zahl(machen.param(0)) * zahl(machen.param(1));
				erg = Ergebnis.nichtsBesonderes;
				break;
			case registerWortEinlesen: {
				long reg = zahl(machen.param(0));
				if (testRegister(reg, stelle)) {
					try {
						char[] chars = eingabe.next().toCharArray();
						register[(int) reg] = (long) chars.length;
						long len = chars.length;
						if (chars.length + reg >= register.length) {
							len = register.length - reg - 1;
						}
						System.arraycopy(chars, 0, register, (int) (reg + 1), (int) len);
						erg = Ergebnis.nichtsBesonderes;
					} catch (NoSuchElementException e) {
						fehler(FEHLER_EINGABE_ZUENDE, stelle);
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.fehler;
				}
				break;
			}
			case registerZeichenEinlesen: {
				long reg = zahl(machen.param(0));
				long anzahl = zahl(machen.param(1));
				if (reg + anzahl >= register.length) {
					fehler(FEHLER_ZU_GROẞE_REGISTERANGABE, stelle);
					erg = Ergebnis.fehler;
				} else if (anzahl < 0) {
					fehler(FEHLER_NEGATIVE_ZAHL, stelle);
					erg = Ergebnis.fehler;
				} else if (testRegister(reg, stelle)) {
					try {
						char[] chars = eingabe.next("^(\\w{" + anzahl + "," + anzahl + "})$").toCharArray();
						long len = chars.length;
						if (chars.length + reg > register.length) {
							len = register.length - reg;
						}
						System.arraycopy(chars, 0, register, (int) reg, (int) len);
						erg = Ergebnis.nichtsBesonderes;
					} catch (NoSuchElementException e) {
						fehler(FEHLER_EINGABE_ZUENDE, stelle);
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.fehler;
				}
				break;
			}
			case registerausgabe: {
				long reg = zahl(machen.param(0));
				long regB = zahl(machen.param(1));
				if (testRegister(reg, stelle) && testRegister(regB, stelle)) {
					char[] chars;
					if (regB < reg) {
						chars = new char[(int) (reg - regB)];
						for (int i = (int) reg, ii = 0; i <= regB; i -- , ii ++ ) {
							chars[ii] = (char) register[i];
						}
					} else {
						chars = new char[(int) (regB - reg)];
						for (int i = (int) reg, ii = 0; i <= regB; i ++ , ii ++ ) {
							chars[ii] = (char) register[i];
						}
					}
					ausgabe.print(new String(chars));
					erg = Ergebnis.nichtsBesonderes;
				} else {
					erg = Ergebnis.fehler;
				}
				break;
			}
			case rufeAuf: {
				Integer ziel = stellen.get(machen.param(0).zeichenKette());
				if (ziel == null) {
					fehler(FEHLER_UNBEKANNT, stelle);
					erg = Ergebnis.fehler;
				} else if (testStapel(true, stelle)) {
					stapel[stapelZeiger ++ ] = (stelle == -1) ? ( -1) : (stelle + 1);
					satzZeiger = ziel;
					erg = Ergebnis.geheInBef;
				} else {
					erg = Ergebnis.fehler;
				}
				break;
			}
			case rufeAufDirekt: {
				long ziel = zahl(machen.param(0));
				if (testSatz(ziel, stelle) && testStapel(true, stelle)) {
					stapel[stapelZeiger ++ ] = (stelle == -1) ? ( -1) : (stelle + 1);
					satzZeiger = (int) ziel;
					erg = Ergebnis.geheInBef;
				} else {
					erg = Ergebnis.fehler;
				}
				break;
			}
			
			case rufeAufGrößer: {
				if ( (status & (STATUS_GRÖẞER)) != 0) {
					Integer ziel = stellen.get(machen.param(0).zeichenKette());
					if (ziel == null) {
						fehler(FEHLER_UNBEKANNT, stelle);
						erg = Ergebnis.fehler;
					} else if (testStapel(true, stelle)) {
						stapel[stapelZeiger ++ ] = (stelle == -1) ? ( -1) : (stelle + 1);
						satzZeiger = ziel;
						erg = Ergebnis.geheInBef;
					} else {
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			}
			case rufeAufGrößerGleich: {
				if ( (status & (STATUS_GRÖẞER | STATUS_GLECIH)) != 0) {
					Integer ziel = stellen.get(machen.param(0).zeichenKette());
					if (ziel == null) {
						fehler(FEHLER_UNBEKANNT, stelle);
						erg = Ergebnis.fehler;
					} else if (testStapel(true, stelle)) {
						stapel[stapelZeiger ++ ] = (stelle == -1) ? ( -1) : (stelle + 1);
						satzZeiger = ziel;
						erg = Ergebnis.geheInBef;
					} else {
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			}
			case rufeAufKleinerGleich: {
				if ( (status & (STATUS_KLEINER | STATUS_GLECIH)) != 0) {
					Integer ziel = stellen.get(machen.param(0).zeichenKette());
					if (ziel == null) {
						fehler(FEHLER_UNBEKANNT, stelle);
						erg = Ergebnis.fehler;
					} else if (testStapel(true, stelle)) {
						stapel[stapelZeiger ++ ] = (stelle == -1) ? ( -1) : (stelle + 1);
						satzZeiger = ziel;
						erg = Ergebnis.geheInBef;
					} else {
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			}
			case rufeAufWennFalsch: {
				if ( (status & (STATUS_FEHLER)) != 0) {
					Integer ziel = stellen.get(machen.param(0).zeichenKette());
					if (ziel == null) {
						fehler(FEHLER_UNBEKANNT, stelle);
						erg = Ergebnis.fehler;
					} else if (testStapel(true, stelle)) {
						stapel[stapelZeiger ++ ] = (stelle == -1) ? ( -1) : (stelle + 1);
						satzZeiger = ziel;
						erg = Ergebnis.geheInBef;
					} else {
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			}
			case rufeAufWennGleich: {
				if ( (status & (STATUS_GLECIH)) != 0) {
					Integer ziel = stellen.get(machen.param(0).zeichenKette());
					if (ziel == null) {
						fehler(FEHLER_UNBEKANNT, stelle);
						erg = Ergebnis.fehler;
					} else if (testStapel(true, stelle)) {
						stapel[stapelZeiger ++ ] = (stelle == -1) ? ( -1) : (stelle + 1);
						satzZeiger = ziel;
						erg = Ergebnis.geheInBef;
					} else {
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			}
			case rufeAufWennKleiner: {
				if ( (status & (STATUS_KLEINER)) != 0) {
					Integer ziel = stellen.get(machen.param(0).zeichenKette());
					if (ziel == null) {
						fehler(FEHLER_UNBEKANNT, stelle);
						erg = Ergebnis.fehler;
					} else if (testStapel(true, stelle)) {
						stapel[stapelZeiger ++ ] = (stelle == -1) ? ( -1) : (stelle + 1);
						satzZeiger = ziel;
						erg = Ergebnis.geheInBef;
					} else {
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			}
			case rufeAufWennNichtGleich: {
				if ( (status & (STATUS_GLECIH)) == 0) {
					Integer ziel = stellen.get(machen.param(0).zeichenKette());
					if (ziel == null) {
						fehler(FEHLER_UNBEKANNT, stelle);
						erg = Ergebnis.fehler;
					} else if (testStapel(true, stelle)) {
						stapel[stapelZeiger ++ ] = (stelle == -1) ? ( -1) : (stelle + 1);
						satzZeiger = ziel;
						erg = Ergebnis.geheInBef;
					} else {
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			}
			case springe: {
				Integer ziel = stellen.get(machen.param(0).zeichenKette());
				if (ziel == null) {
					fehler(FEHLER_UNBEKANNT, stelle);
					erg = Ergebnis.fehler;
				} else if (testStapel(true, stelle)) {
					satzZeiger = ziel;
					erg = Ergebnis.sprungBef;
				} else {
					erg = Ergebnis.fehler;
				}
				break;
			}
			case springeWennFalsch:
				if ( (status & (STATUS_FEHLER)) != 0) {
					Integer ziel = stellen.get(machen.param(0).zeichenKette());
					if (ziel == null) {
						fehler(FEHLER_UNBEKANNT, stelle);
						erg = Ergebnis.fehler;
					} else if (testStapel(true, stelle)) {
						satzZeiger = ziel;
						erg = Ergebnis.sprungBef;
					} else {
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			case springeWennGleich:
				if ( (status & (STATUS_GLECIH)) != 0) {
					Integer ziel = stellen.get(machen.param(0).zeichenKette());
					if (ziel == null) {
						fehler(FEHLER_UNBEKANNT, stelle);
						erg = Ergebnis.fehler;
					} else if (testStapel(true, stelle)) {
						satzZeiger = ziel;
						erg = Ergebnis.sprungBef;
					} else {
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			case springeWennGrößer:
				if ( (status & (STATUS_GRÖẞER)) != 0) {
					Integer ziel = stellen.get(machen.param(0).zeichenKette());
					if (ziel == null) {
						fehler(FEHLER_UNBEKANNT, stelle);
						erg = Ergebnis.fehler;
					} else if (testStapel(true, stelle)) {
						satzZeiger = ziel;
						erg = Ergebnis.sprungBef;
					} else {
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			case springeWennGrößerGleich:
				if ( (status & (STATUS_GRÖẞER | STATUS_GLECIH)) != 0) {
					Integer ziel = stellen.get(machen.param(0).zeichenKette());
					if (ziel == null) {
						fehler(FEHLER_UNBEKANNT, stelle);
						erg = Ergebnis.fehler;
					} else if (testStapel(true, stelle)) {
						satzZeiger = ziel;
						erg = Ergebnis.sprungBef;
					} else {
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			case springeWennKleiner:
				if ( (status & (STATUS_KLEINER)) != 0) {
					Integer ziel = stellen.get(machen.param(0).zeichenKette());
					if (ziel == null) {
						fehler(FEHLER_UNBEKANNT, stelle);
						erg = Ergebnis.fehler;
					} else if (testStapel(true, stelle)) {
						satzZeiger = ziel;
						erg = Ergebnis.sprungBef;
					} else {
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			case springeWennKleinerGleich:
				if ( (status & (STATUS_KLEINER | STATUS_GLECIH)) != 0) {
					Integer ziel = stellen.get(machen.param(0).zeichenKette());
					if (ziel == null) {
						fehler(FEHLER_UNBEKANNT, stelle);
						erg = Ergebnis.fehler;
					} else if (testStapel(true, stelle)) {
						satzZeiger = ziel;
						erg = Ergebnis.sprungBef;
					} else {
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			case springeWennNichtGleich:
				if ( (status & (STATUS_GLECIH)) == 0) {
					Integer ziel = stellen.get(machen.param(0).zeichenKette());
					if (ziel == null) {
						fehler(FEHLER_UNBEKANNT, stelle);
						erg = Ergebnis.fehler;
					} else if (testStapel(true, stelle)) {
						satzZeiger = ziel;
						erg = Ergebnis.sprungBef;
					} else {
						erg = Ergebnis.fehler;
					}
				} else {
					erg = Ergebnis.nichtsBesonderes;
				}
				break;
			case springeZuDirekt: {
				long ziel = zahl(machen.param(0));
				if (testSatz(ziel, stelle) && testStapel(true, stelle)) {
					satzZeiger = (int) ziel;
					erg = Ergebnis.sprungBef;
				} else {
					erg = Ergebnis.fehler;
				}
				break;
			}
			case stapelGrößeErg:
				ergebnis = stapelZeiger;
				erg = Ergebnis.nichtsBesonderes;
				break;
			case stapelGrößeReg: {
				long reg = zahl(machen.param(0));
				if (testRegister(reg, stelle)) {
					register[(int) reg] = stapelZeiger;
					erg = Ergebnis.nichtsBesonderes;
				} else {
					erg = Ergebnis.fehler;
				}
				break;
			}
			case stapelGrößeZw:
				zwischen = stapelZeiger;
				erg = Ergebnis.nichtsBesonderes;
				break;
			case stapelLesenErg:
				if (testStapel(false, stelle)) {
					ergebnis = stapel[ -- stapelZeiger];
					erg = Ergebnis.nichtsBesonderes;
				} else {
					erg = Ergebnis.fehler;
				}
				break;
			case stapelLesenReg: {
				long reg = zahl(machen.param(0));
				if (testRegister(reg, stelle) && testStapel(false, stelle)) {
					register[(int) reg] = stapel[ -- stapelZeiger];
					erg = Ergebnis.nichtsBesonderes;
				} else {
					erg = Ergebnis.fehler;
				}
				break;
			}
			case stapelLesenZw:
				if (testStapel(false, stelle)) {
					zwischen = stapel[ -- stapelZeiger];
					erg = Ergebnis.nichtsBesonderes;
				} else {
					erg = Ergebnis.fehler;
				}
				break;
			case stapelMaxGrößeErg:
				ergebnis = stapel.length;
				erg = Ergebnis.nichtsBesonderes;
				break;
			case stapelMaxGrößeReg: {
				long reg = zahl(machen.param(0));
				if (testRegister(reg, stelle)) {
					register[(int) reg] = stapel.length;
					erg = Ergebnis.nichtsBesonderes;
				} else {
					erg = Ergebnis.fehler;
				}
				break;
			}
			case stapelMaxGrößeZw:
				zwischen = stapel.length;
				erg = Ergebnis.nichtsBesonderes;
				break;
			case stapelSchreiben:
				if (testStapel(true, stelle)) {
					long drauf = zahl(machen.param(0));
					stapel[stapelZeiger ++ ] = drauf;
					erg = Ergebnis.nichtsBesonderes;
				} else {
					erg = Ergebnis.fehler;
				}
				break;
			case stelle:
				erg = Ergebnis.nichtsBesonderes;
				break;
			case subtrahiere:
				ergebnis = zahl(machen.param(0)) - zahl(machen.param(1));
				erg = Ergebnis.nichtsBesonderes;
				break;
			case vergleiche: {
				long a = zahl(machen.param(0)), b = zahl(machen.param(1));
				status &= ~ (STATUS_GRÖẞER | STATUS_GLECIH | STATUS_KLEINER);
				if (a < b) {
					status |= STATUS_KLEINER;
				} else if (a == b) {
					status |= STATUS_GLECIH;
				} else {
					status |= STATUS_GRÖẞER;
				}
				erg = Ergebnis.nichtsBesonderes;
				break;
			}
			case vergleicheRegister: {
				long regAa = zahl(machen.param(0));
				long regAb = zahl(machen.param(1));
				long regBa = zahl(machen.param(2));
				long regBb = zahl(machen.param(3));
				if (testRegister(regAa, stelle) && testRegister(regAb, stelle) && testRegister(regBa, stelle) && testRegister(regBb, stelle)) {
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
							status &= ~STATUS_GLECIH;
							status |= STATUS_KLEINER;
							break;
						}
						if (a > b) {
							status &= ~STATUS_GLECIH;
							status |= STATUS_GRÖẞER;
							break;
						}
					}
				}
				erg = Ergebnis.nichtsBesonderes;
				break;
			}
			case vergleicheRegisterText: {
				long regA = zahl(machen.param(0));
				long regB = zahl(machen.param(1));
				char[] chars = machen.param(2).toString().toCharArray();
				if (testRegister(regA, stelle) && testRegister(regB, stelle)) {
					status &= ~ (STATUS_GRÖẞER | STATUS_KLEINER);
					status |= STATUS_GLECIH;
					boolean regAgr = regB > regA;
					long regKl = regAgr ? regA : regB;
					long regGr = regAgr ? regB : regA;
					for (int i = 0; i + regKl <= regGr && i < chars.length; i ++ ) {
						long a, b;
						if (regAgr) {
							a = register[(int) (regKl + i)];
						} else {
							a = register[(int) (regGr - i)];
						}
						b = (long) chars[i];
						if (a < b) {
							status &= ~STATUS_GLECIH;
							status |= STATUS_KLEINER;
							break;
						}
						if (a > b) {
							status &= ~STATUS_GLECIH;
							status |= STATUS_GRÖẞER;
							break;
						}
					}
				}
				erg = Ergebnis.nichtsBesonderes;
				break;
			}
			case versionErg:
				ergebnis = version();
				erg = Ergebnis.nichtsBesonderes;
				break;
			case versionReg: {
				long reg = zahl(machen.param(0));
				if (testRegister(reg, stelle)) {
					register[(int) reg] = version();
				}
				erg = Ergebnis.nichtsBesonderes;
				break;
			}
			case versionZw:
				zwischen = version();
				erg = Ergebnis.nichtsBesonderes;
				break;
			case zahlenausgabe:
				ausgabe.print(zahl(machen.param(0)));
				erg = Ergebnis.nichtsBesonderes;
				break;
			case zwischenspeicher:
				zwischen = ergebnis;
				erg = Ergebnis.nichtsBesonderes;
				break;
			default:
				throw new RuntimeException("unbekannte SatzArt: sa=" + machen.art + " satz=" + machen);
			}
		} catch (Exception e) {
			fehler(FEHLER_UNBEKANNT, stelle);
			erg = Ergebnis.fehler;
		}
		return erg;
	}
	
}
