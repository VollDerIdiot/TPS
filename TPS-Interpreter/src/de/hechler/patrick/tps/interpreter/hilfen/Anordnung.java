package de.hechler.patrick.tps.interpreter.hilfen;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import de.hechler.patrick.tps.fehler.InterpretierungsFehler;
import de.hechler.patrick.tps.fehler.NegativeZahlFehler;
import de.hechler.patrick.tps.interpreter.Version;

@Deprecated
@Version(4)
public class Anordnung implements AnordnungInterface {
	
	private BefehlEnum bef;
	private Param[] args;
	
	public Anordnung() {
	}
	
	@Override
	public void befehl(BefehlEnum neu) {
		bef = neu;
	}
	
	@Override
	public BefehlEnum befehl() {
		return bef;
	}
	
	@Override
	public Param param(int index) {
		return args[index];
	}
	
	@Override
	public void fülleParam(List <String> satz, Collection <String> benötigteStellen, Map <String, Integer> stellen, int index) throws InterpretierungsFehler {
		switch (bef) {
		default:
			throw new InterpretierungsFehler("unbekannter befehl " + bef);
		case addiere:
			args = new Param[2];
			args[0] = paramZahl(satz.get(1));
			args[1] = paramZahl(satz.get(3));
			break;
		case ausgabe:
			StringBuilder str = new StringBuilder();
			args = new Param[1];
			Iterator <String> iter = satz.listIterator(3);
			while (true) {
				str.append(iter.next());
				if (iter.hasNext()) str.append(' ');
				else break;
			}
			args[0] = new Param(str.toString());
			break;
		case dividiere:
			args = new Param[2];
			args[0] = paramZahl(satz.get(1));
			args[1] = paramZahl(satz.get(3));
			break;
		case ergebnisausgebe:
			args = new Param[0];
			break;
		case geheWennNichtGleich:
			args = new Param[1];
			String zw = satz.get(8);
			args[0] = paramStelle(zw);
			benötigteStellen.add(zw);
			break;
		case geheWennGleich:
			args = new Param[1];
			zw = satz.get(7);
			args[0] = paramStelle(zw);
			benötigteStellen.add(zw);
			break;
		case geheWennGrößer:
			args = new Param[1];
			zw = satz.get(7);
			args[0] = paramStelle(zw);
			benötigteStellen.add(zw);
			break;
		case geheWennGrößerGleich:
			args = new Param[1];
			zw = satz.get(9);
			args[0] = paramStelle(zw);
			benötigteStellen.add(zw);
			break;
		case geheWennKleiner:
			args = new Param[1];
			zw = satz.get(7);
			args[0] = paramStelle(zw);
			benötigteStellen.add(zw);
			break;
		case geheWennKleinerGleich:
			args = new Param[1];
			zw = satz.get(9);
			args[0] = paramStelle(zw);
			benötigteStellen.add(zw);
			break;
		case leerzeile:
			args = new Param[0];
			break;
		case multipliziere:
			args = new Param[2];
			args[0] = paramZahl(satz.get(1));
			args[1] = paramZahl(satz.get(3));
			break;
		case springe:
			args = new Param[1];
			zw = satz.get(3);
			args[0] = paramStelle(zw);
			benötigteStellen.add(zw);
			break;
		case stelle:
			args = new Param[1];
			zw = satz.get(4);
			args[0] = paramStelle(zw);
			Integer old = stellen.put(zw, index);
			if (old != null) throw new InterpretierungsFehler("doppelt besetzte stelle: " + zw + " Satz:" + old + "," + index);
			break;
		case subtrahiere:
			args = new Param[2];
			args[0] = paramZahl(satz.get(1));
			args[1] = paramZahl(satz.get(3));
			break;
		case vergleiche:
			args = new Param[2];
			args[0] = paramZahl(satz.get(1));
			args[1] = paramZahl(satz.get(3));
			break;
		case zwischenisausgebe:
			args = new Param[0];
			break;
		case zwischenspeicher:
			args = new Param[0];
			break;
		case ladeInRegister:
			args = new Param[2];
			args[0] = paramRegisterZahl(satz.get(2));
			args[1] = paramZahl(satz.get(6));
			break;
		case ladeVomRegisterErg:
			args = new Param[1];
			args[0] = paramRegisterZahl(satz.get(6));
			break;
		case ladeVomRegisterZw:
			args = new Param[1];
			args[0] = paramRegisterZahl(satz.get(6));
			break;
		case leerzeichen:
			args = new Param[0];
			break;
		case leseZahlEinErg:
			args = new Param[0];
			break;
		case leseZahlEinZwischen:
			args = new Param[0];
			break;
		case ladeRegisterAnzahlErg:
			args = new Param[0];
			break;
		case ladeRegisterAnzahlZw:
			args = new Param[0];
			break;
		case registerausgabe:
			args = new Param[2];
			args[0] = paramRegisterZahl(satz.get(4));
			args[1] = paramRegisterZahl(satz.get(6));
			break;
		case registerWortEinlesen:
			args = new Param[1];
			args[0] = paramRegisterZahl(satz.get(10));
			break;
		case registerZeichenEinlesen:
			args = new Param[2];
			args[0] = paramRegisterZahl(satz.get(3));
			args[1] = paramRegisterZahl(satz.get(11));
			break;
		case geheWennFalsch:
			args = new Param[1];
			args[0] = paramStelle(satz.get(8));
			break;
		case addiereRegReg:
			args = new Param[2];
			args[0] = paramRegisterZahl(satz.get(3));
			args[1] = paramRegisterZahl(satz.get(7));
			break;
		case addiereRegZ:
			args = new Param[2];
			args[0] = paramRegisterZahl(satz.get(3));
			args[1] = paramZahl(satz.get(5));
			break;
		case addiereZReg:
			args = new Param[2];
			args[0] = paramZahl(satz.get(1));
			args[1] = paramRegisterZahl(satz.get(5));
			break;
		case dividiereRegReg:
			args = new Param[2];
			args[0] = paramRegisterZahl(satz.get(3));
			args[1] = paramRegisterZahl(satz.get(7));
			break;
		case dividiereRegZ:
			args = new Param[2];
			args[0] = paramRegisterZahl(satz.get(3));
			args[1] = paramZahl(satz.get(5));
			break;
		case dividiereZReg:
			args = new Param[2];
			args[0] = paramZahl(satz.get(1));
			args[1] = paramRegisterZahl(satz.get(5));
			break;
		case multipliziereRegReg:
			args = new Param[2];
			args[0] = paramRegisterZahl(satz.get(3));
			args[1] = paramRegisterZahl(satz.get(7));
			break;
		case multipliziereRegZ:
			args = new Param[2];
			args[0] = paramRegisterZahl(satz.get(3));
			args[1] = paramZahl(satz.get(5));
			break;
		case multipliziereZReg:
			args = new Param[2];
			args[0] = paramZahl(satz.get(1));
			args[1] = paramRegisterZahl(satz.get(5));
			break;
		case rufeAuf:
			args = new Param[1];args[0] = paramStelle(satz.get(6));
			break;
		case rufeAufGrößer:
			args = new Param[1];args[0] = paramStelle(satz.get(10));
			break;
		case rufeAufGrößerGleich:
			args = new Param[1];args[0] = paramStelle(satz.get(12));
			break;
		case rufeAufKleinerGleich:
			args = new Param[1];args[0] = paramStelle(satz.get(12));
			break;
		case rufeAufWennGleich:
			args = new Param[1];args[0] = paramStelle(satz.get(10));
			break;
		case rufeAufWennKleiner:
			args = new Param[1];args[0] = paramStelle(satz.get(10));
			break;
		case rufeAufWennNichtGleich:
			args = new Param[1];args[0] = paramStelle(satz.get(11));
			break;
		case stapelGrößeErg:
			args = new Param[0];
			break;
		case stapelGrößeReg:
			args = new Param[1];args[0] = paramRegisterZahl(satz.get(9));
			break;
		case stapelGrößeZw:
			args = new Param[0];
			break;
		case stapelLesenErg:
			args = new Param[0];
			break;
		case stapelLesenReg:
			args = new Param[1];args[0] = paramRegisterZahl(satz.get(12));
			break;
		case stapelLesenZw:
			args = new Param[0];
			break;
		case stapelMaxGrößeErg:
			args = new Param[0];
			break;
		case stapelMaxGrößeReg:
			args = new Param[1]; args[0] = paramRegisterZahl(satz.get(9));
			break;
		case stapelMaxGrößeZw:
			args = new Param[0];
			break;
		case stapelSchreiben:
			args = new Param[1];args[0] = paramZahl(satz.get(2));
			break;
		case subtrahiereRegReg:
			args = new Param[2];
			args[0] = paramRegisterZahl(satz.get(3));
			args[0] = paramRegisterZahl(satz.get(7));
			break;
		case subtrahiereRegZ:
			args = new Param[2];
			args[0] = paramZahl(satz.get(5));
			break;
		case subtrahiereZReg:
			args = new Param[2];
			args[0] = paramZahl(satz.get(1));
			args[0] = paramRegisterZahl(satz.get(5));
			break;
		case vergleicheRegister:
			args = new Param[4];
			args[0] = paramRegisterZahl(satz.get(4));
			args[1] = paramRegisterZahl(satz.get(6));
			args[2] = paramRegisterZahl(satz.get(11));
			args[3] = paramRegisterZahl(satz.get(13));
			break;
		case vergleicheRegisterText:
			args = new Param[3];
			args[0] = paramRegisterZahl(satz.get(4));
			args[1] = paramRegisterZahl(satz.get(6));
			args[1] = new Param(satz.get(10));
			break;
		case versionErg:
			args = new Param[0];
			break;
		case versionReg:
			args = new Param[0];
			break;
		case versionZw:
			args = new Param[0];
			break;
		case geheZurück:
			args = new Param[0];
			break;
		}
	}
	
	private Param paramStelle(String stelle) throws InterpretierungsFehler {
		char[] chars = stelle.toCharArray();
		for (char test : chars) {
			if (test < 'A' || test > 'Z') throw new InterpretierungsFehler(stelle + " ist keine gültige stelle! (" + test + ")");
		}
		return new Param(stelle);
	}
	
	private Param paramZahl(String param) {
		switch (param) {
		case "ergebnis":
			return new Param(true);
		case "zwischen":
			return new Param(false);
		default:
			return new Param(Integer.parseInt(param));
		}
	}
	
	private Param paramRegisterZahl(String param) throws NegativeZahlFehler {
		switch (param) {
		case "ergebnis":
			return new Param(true);
		case "zwischen":
			return new Param(false);
		default:
			int teste = Integer.parseInt(param);
			if (teste < 0) throw new NegativeZahlFehler(teste);
			return new Param(teste);
		}
	}
	
}
