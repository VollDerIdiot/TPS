package de.hechler.patrick.tps.kompiler;

import java.io.OutputStream;
import java.io.PrintStream;

import de.hechler.patrick.tps.antlr.anotatins.Version;
import de.hechler.patrick.tps.antlr.objects.Parameter;
import de.hechler.patrick.tps.antlr.objects.Satz;


@Version( -1)
public class TPSZuCKompiler {
	
	private Satz[]        sätze;
	private Einstellungen props;
	private int           zeile;
	private boolean       regVergleich;
	private boolean       regTextVergleich;
	private boolean       ausgebenRegs;
	
	public void lade(Satz[] sätze) {
		this.sätze = sätze;
	}
	
	
	public synchronized void kompiliere(OutputStream ausgang) {
		PrintStream out = new PrintStream(ausgang);
		zeile = 0;
		kopf(out);
		haupt(out);
		hilfsmethoden(out);
	}
	
	private void hilfsmethoden(PrintStream out) {
		if (regVergleich) {
			println(out, "void regVergleich(ZAHL regAa, ZAHL regAb, ZAHL regBa, ZAHL regBb, int line){");
			println(out, "    wahr agrA = regAa > regAb;");
			println(out, "    ZAHL grA = aGrA==ja ? regAa : regAb;");
			println(out, "    ZAHL klA = aAGr==ja ? regAb : regAa;");
			println(out, "    wahr bgrA = regBa > regBb;");
			println(out, "    ZAHL grB = bgrA==ja ? regBa : regBb;");
			println(out, "    ZAHL klB = bGrA==ja ? regBb : regBa;");
			println(out, "    if (grA >= registerAnzahl){fehler(line,FZuWenigeRegs) return;}");
			println(out, "    if (grA < 0){fehler(line,FKeineNegativenRegs) return;}");
			println(out, "    v = gl;");
			println(out, "    for (ZAHL index = 0;index + klA <= grA && index + klB <= grB; index++){");
			println(out, "        ZAHL a = aGrA==ja ? regs[klA+index] : regs[grA-index];");
			println(out, "        ZAHL b = bGrA==ja ? regs[klB+index] : regs[grB-index];");
			println(out, "        if(a>b){v=gr;return;}");
			println(out, "        else if (a<b){v=kl;return;}");
			println(out, "    }");
			println(out, "}");
		}
		if (regTextVergleich) {
			println(out, "void regTextVergleich(ZAHL regA, ZAHL regB, ZAHL len, ZAHL* zk){");
			println(out, "    wahr agrA = regAa > regAb;");
			println(out, "    ZAHL grA = aGrA==ja ? regAa : regAb;");
			println(out, "    ZAHL klA = aAGr==ja ? regAb : regAa;");
			println(out, "    if (grA >= registerAnzahl){fehler(line,FZuWenigeRegs) return;}");
			println(out, "    if (grA < 0){fehler(line,FKeineNegativenRegs) return;}");
			println(out, "    v = gl;");
			println(out, "    for (ZAHL index = 0;index + klA <= grA && index < len; index++){");
			println(out, "        ZAHL a = aGrA==ja ? regs[klA+index] : regs[grA-index];");
			println(out, "        ZAHL b = zk[index];");
			println(out, "        if(a>b){v=gr;return;}");
			println(out, "        else if (a<b){v=kl;return;}");
			println(out, "    }");
			println(out, "}");
		}
		if (ausgebenRegs) {
			println(out, "void ausgebenRegs(ZAHL regA, ZAHL regB, int line){");
			println(out, "    wahr agr = regA > regB;");
			println(out, "    ZAHL gr = agr==ja ? regA : regB;");
			println(out, "    ZAHL kl = agr==ja ? regB : regA;");
			println(out, "    ZAHL len = gr - kl;");
			println(out, "    if (kl < 0){fehler(line,FKeineNegativenRegister) return;}");
			println(out, "    if (gr >= registerAnzahl){fehler(line,FZuWenigeRegister) return;}");
			println(out, "    newArray(char, print) if (agr==ja) {");
			println(out, "        for (int i = regB, ii = 0; i <= regA; i -- , ii ++ ) {");
			println(out, "            char[ii] = regs[i];");
			println(out, "        }");
			println(out, "    } else {");
			println(out, "        for (int i = regA, ii = 0; i <= regB; i ++ , ii ++ ) {");
			println(out, "            char[ii] = regs[i];");
			println(out, "        }");
			println(out, "    }}");
			println(out, "}");
		}
	}
	
	private void haupt(PrintStream out) {
		println(out, "ANFANG");
		final int anfangszeile = zeile;
		for (Satz kompile : sätze) {
			switch (kompile.art) {
			case vergleiche:
				println(out, "    vergleiche(" + stringZahl(kompile.param(0)) + "," + stringZahl(kompile.param(1)) + ");");
				break;
			case vergleicheRegister:
				regVergleich = true;
				println(out, "    regVergleich(" + stringZahl(kompile.param(0)) + "," + stringZahl(kompile.param(1)) + "," + stringZahl(kompile.param(2)) + ",(ZAHL*)" + stringZahl(kompile.param(3)) + ");");
				break;
			case vergleicheRegisterText:
				regTextVergleich = true;
				println(out, "    regTextVergleich(" + stringZahl(kompile.param(0)) + "," + stringZahl(kompile.param(1)) + "," + kompile.param(2).zeichenKette().length() + ",\"" + kompile.param(2).zeichenKette() + "\")");
				break;
			case springe:
				println(out, "    goto " + kompile.param(0).zeichenKette() + ";");
				break;
			case springeWennNichtGleich:
				println(out, "    if (v!=gl){ goto " + kompile.param(0).zeichenKette() + ";}");
				break;
			case springeWennGleich:
				println(out, "    if (v==gl){ goto " + kompile.param(0).zeichenKette() + ";}");
				break;
			case springeWennGrößer:
				println(out, "    if (v==gr){ goto " + kompile.param(0).zeichenKette() + ";}");
				break;
			case springeWennGrößerGleich:
				println(out, "    if (v==gr||v==gl){ goto " + kompile.param(0).zeichenKette() + ";}");
				break;
			case springeWennKleiner:
				println(out, "    if (v==kl){ goto " + kompile.param(0).zeichenKette() + ";}");
				break;
			case springeWennKleinerGleich:
				println(out, "    if (v==kl||v==gl){ goto " + kompile.param(0).zeichenKette() + ";}");
				break;
			case rufeAuf:
				println(out, "    rufe(" + kompile.param(0).zeichenKette() + "," + (zeile - anfangszeile) + ")");
				break;
			case rufeAufWennNichtGleich:
				println(out, "    if (v!=gl){ rufe(" + kompile.param(0).zeichenKette() + "," + (zeile - anfangszeile) + ")}");
				break;
			case rufeAufWennGleich:
				println(out, "    if (v==gl){ rufe(" + kompile.param(0).zeichenKette() + "," + (zeile - anfangszeile) + ")}");
				break;
			case rufeAufGrößer:
				println(out, "    if (v==gr){ rufe(" + kompile.param(0).zeichenKette() + "," + (zeile - anfangszeile) + ")}");
				break;
			case rufeAufGrößerGleich:
				println(out, "    if (v==gr||v==gl){ rufe(" + kompile.param(0).zeichenKette() + "," + (zeile - anfangszeile) + ")}");
				break;
			case rufeAufWennKleiner:
				println(out, "    if (v==kl){ rufe(" + kompile.param(0).zeichenKette() + "," + (zeile - anfangszeile) + ")}");
				break;
			case rufeAufKleinerGleich:
				println(out, "    if (v==kl||v==gl){ rufe(" + kompile.param(0).zeichenKette() + "," + (zeile - anfangszeile) + ")}");
				break;
			case addiere:
				println(out, "    ergebnis = " + stringZahl(kompile.param(0)) + " + " + stringZahl(kompile.param(1)) + ";");
				break;
			case ausgabe:
				println(out, "    printf(\"%s\", \"" + kompile.param(0).zeichenKette() + "\");");
				break;
			case dividiere: {
				String a = stringZahl(kompile.param(0)), b = stringZahl(kompile.param(1));
				println(out, "    ergebnis = " + a + " / " + b + "; zwischen = " + a + " % " + b + ";");
				break;
			}
			case geheZurück:
				println(out, "    if (zeiger <= 0) {fehler(" + (zeile - anfangszeile) + ", FLeererStapel)} else {zeiger --; goto " + anfangszeile + " + stapel[zeiger];}");
				break;
			case ladeInRegister: {
				String reg = stringZahl(kompile.param(0));
				String wert = stringZahl(kompile.param(0));
				println(out, "if (" + reg + " >= registerAnzahl) {fehler(" + (zeile - anfangszeile) + ", FZuWenigeRegs)} else if (" + reg + " < 0) {fehler(" + (zeile - anfangszeile) + ", FKeineNegativeRegs)} else {regs["
						+ reg + "] = " + wert + ";}");
				break;
			}
			case ladeRegisterAnzahlErg:
				println(out, "    ergebnis = registerAnzahl;");
				break;
			case ladeRegisterAnzahlZw:
				println(out, "    zwischen = registerAnzahl;");
				break;
			case ladeVomRegisterErg: {
				String reg = stringZahl(kompile.param(0));
				println(out, "    if (" + reg + " >= registerAnzahl) {fehler(" + (zeile - anfangszeile) + ", FZuWenigeRegs)} else if (" + reg + " < 0) {fehler(" + (zeile - anfangszeile)
						+ ", FKeineNegativeRegs)} else {ergebnis = regs[" + reg + "];}");
				break;
			}
			case ladeVomRegisterZw: {
				String reg = stringZahl(kompile.param(0));
				println(out, "    if (" + reg + " >= registerAnzahl) {fehler(" + (zeile - anfangszeile) + ", FZuWenigeRegs)} else if (" + reg + " < 0) {fehler(" + (zeile - anfangszeile)
						+ ", FKeineNegativeRegs)} else {zwischen = regs[" + reg + "];}");
				break;
			}
			case leerzeichen:
				println(out, "    printf(\" \");");
				break;
			case leerzeile:
				println(out, "    printf(\"\\n\");");
				break;
			case leseZahlEinErg:
				println(out, "    newArray(zw) gets(zw); for(int i = 0;zw[i]!=\0;i ++){if (zw[i] < 0 || zw[i] > 9){fehler(" + (zeile - anfangszeile) + ",FFehlerhafteBenEingabe) } }  ergebnis = (ZAHL) atol(s); free(zw);}");
				break;
			case leseZahlEinZwischen:
				println(out, "    newArray(zw) gets(zw); for(int i = 0;zw[i]!=\0;i ++){if (zw[i] < 0 || zw[i] > 9){fehler(" + (zeile - anfangszeile) + ",FFehlerhafteBenEingabe) } }  zwischen = (ZAHL) atol(s); free(zw);}");
				break;
			case letzterFehler:
				println(out, "    ergebnis = lfArt; zwischen = lfStelle;");
				break;
			case multipliziere:
				println(out, "    ergebnis = " + stringZahl(kompile.param(0)) + " * " + stringZahl(kompile.param(1)) + ";");
				break;
			case registerWortEinlesen: {
				String reg = stringZahl(kompile.param(0));
				println(out, "    if(" + reg + "<0){fehler(FKeineNegativenRegs," + (zeile - anfangszeile) + ")} else if(" + reg + ">=registerAnzahl){fehler(FZuWenigeRegs," + (zeile - anfangszeile)
						+ ")} else newArray(zw) gets(zw); int len; for(len = 0; zw[len] != \0; len ++){ regs[" + reg + " + 1 + len] = zw[len];} regs[" + reg + "] = len; free(zw);}");
				break;
			}
			case registerZeichenEinlesen: {
				String reg = stringZahl(kompile.param(0));
				String anzahl = stringZahl(kompile.param(1));
				println(out, "    if(" + reg + "<0){fehler(FKeineNegativenRegs," + (zeile - anfangszeile) + ")} else if(" + reg + "+" + anzahl + ">=registerAnzahl){fehler(FZuWenigeRegs," + (zeile - anfangszeile)
						+ ")} else newArray(zw) for(int i = 0; i <= " + anzahl + "; len ++){ regs[" + reg + " + i] = getchar();} free(zw);}");
				break;
			}
			case registerausgabe:
				ausgebenRegs = true;
				println(out, "    ausgebenRegs(" + stringZahl(kompile.param(0)) + "," + stringZahl(kompile.param(1)) + ", " + (zeile - anfangszeile) + ");");
				break;
			case rufeAufDirekt://TODO hier weitermachen
				break;
			case rufeAufWennFalsch:
				break;
			case springeWennFalsch:
				break;
			case springeZuDirekt:
				break;
			case stapelGrößeErg:
				break;
			case stapelGrößeReg:
				break;
			case stapelGrößeZw:
				break;
			case stapelLesenErg:
				break;
			case stapelLesenReg:
				break;
			case stapelLesenZw:
				break;
			case stapelMaxGrößeErg:
				break;
			case stapelMaxGrößeReg:
				break;
			case stapelMaxGrößeZw:
				break;
			case stapelSchreiben:
				break;
			case stelle:
				break;
			case subtrahiere:
				break;
			case versionErg:
				break;
			case versionReg:
				break;
			case versionZw:
				break;
			case zahlenausgabe:
				break;
			case zwischenspeicher:
				break;
			default:
				break;
			}
		}
		println(out, "ENDE");
	}
	
	private void kopf(PrintStream out) {
		println(out, "#define TPS_KLOMPILER_VERSION " + version());
		println(out, "#define ZAHL " + props.zahlStr);
		println(out, "#define newArray(art, name) {art* name = (ZAHL*) malloc(" + props.zwArraySize + ");");
		println(out, "#define newArray(name) newArray(ZAHL, name)");
		println(out, "#define vergleiche(a,b) if(a > b) {v = gr;} else if (a < b) {v = kl;} else {v = gl;}");
		println(out, "#define rufe(ziel, stelle) if(zeiger>=maxStapelGr){fehler(FStepelVoll)}else{stapel[zeiger]=stelle;zeiger++;goto ziel;}");
		println(out, "#define fehler(stelle, art) lfArt = art; lfStelle = stelle; fehler = ja;");
		println(out, "#define registerAnzahl " + props.registerAnz);
		println(out, "#define maxStapelGr " + props.stapelMaxGr);
		println(out, "#define ANFANG void main(){regs = (ZAHL*) malloc(registerAnzahl); stapel = (ZAHL*) malloc(maxStapelGr);");
		println(out, "#define ENDE free(regs); free(stapel);}");
		println(out);
		println(out, "ZAHL ergebnis;");
		println(out, "ZAHL zwischen;");
		println(out, "ZAHL* regs;");
		println(out, "ZAHL* stapel;");
		println(out, "ZAHL zeiger;");
		println(out, "int lfStelle");
		println(out, "ZAHL lfArt");
		println(out, "enum fehlerArt {FSatpelVoll,FZuWenigeRegs,FKeineNegativenRegs,FLeererStapel,FFehlerhafteBenEingabe};");
		println(out, "enum whar {ja=1,ne=0};");
		println(out, "wahr fehler;");
		println(out, "enum vergleich {gr=1, gl=0, kl=-1};");
		println(out, "vergleich v;");
		println(out);
	}
	
	private void println(PrintStream out) {
		zeile ++ ;
		out.println();
	}
	
	private void println(PrintStream out, String printThis) {
		zeile ++ ;
		out.println(printThis);
	}
	
	public int version() {
		Version version = this.getClass().getAnnotation(Version.class);
		if (version != null) {
			return version.value();
		} else return 6;
	}
	
	private String stringZahl(Parameter param) {
		return param.istKonstante() ? param.zahl().toString() : (param.ergebniszahl() ? "ergebnis" : "zwischen");
	}
	
	public static class Einstellungen {
		
		private String zahlStr;
		private long   zwArraySize;
		private long   registerAnz;
		private long   stapelMaxGr;
		
		
		public void setZwArraySize(long zwArraySize) {
			this.zwArraySize = zwArraySize;
		}
		
		public long getZwArraySize() {
			return zwArraySize;
		}
		
		public void setRegisterAnz(long registerAnz) {
			this.registerAnz = registerAnz;
		}
		
		public long getRegisterAnz() {
			return registerAnz;
		}
		
		public void setStapelMaxGr(long stapelMaxGr) {
			this.stapelMaxGr = stapelMaxGr;
		}
		
		public long getStapelMaxGr() {
			return stapelMaxGr;
		}
		
		public void setLongLongZahl() {
			zahlStr = "long long";
		}
		
		public void setLongZahl() {
			zahlStr = "long";
		}
		
		public void setIntZahl() {
			zahlStr = "int";
		}
		
		public void setOtherZahl(String zahlStr) {
			this.zahlStr = zahlStr;
		}
		
		public String getZahlStr() {
			return zahlStr;
		}
		
	}
	
}
