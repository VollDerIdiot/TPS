package de.hechler.patrick.tps.interpreter.hilfen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import de.hechler.patrick.tps.antlr.anotatins.Stelle;
import de.hechler.patrick.tps.fehler.InterpretierungsFehler;
import de.hechler.patrick.tps.fehler.NegativeZahlFehler;
import de.hechler.patrick.tps.interpreter.FehlersuchenInterpreter;
import de.hechler.patrick.tps.interpreter.Interpreter;
import de.hechler.patrick.tps.interpreter.hilfen.befehl.BefehlEnum;

public class TolleAnordnung implements AnordnungInterface {
	
	private BefehlEnum bef;
	private Param[]    parameter;
	
	public TolleAnordnung() {
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
		return parameter[index];
	}
	
	@Override
	public void fülleParam(List <String> satz, Collection <String> benötigteStellen, Map <String, Integer> stellen, int index) throws InterpretierungsFehler {
		String[] befehl = bef.folge();
		List <Param> par = new ArrayList <Param>();
		Iterator <String> iter = satz.iterator();
		String stel = null;
		for (int i = 0; i < befehl.length; i ++ ) {
			String zw = iter.next();
			switch (befehl[i]) {
			case Interpreter.ZAHL:
				par.add(paramZahl(zw));
				break;
			case Interpreter.POS_ZAHL:
				par.add(paramPosZahl(zw));
				break;
			case Interpreter.STELLE:
				par.add(paramStelle(zw));
				if (stel != null) {
					throw new IllegalStateException("ich kann keine zwei stellen haben");
				} else {
					stel = zw;
				}
				break;
			case Interpreter.WORTFOLGE:
				StringBuilder str = new StringBuilder(zw);
				while (iter.hasNext()) {
					str.append(' ').append(iter.next());
				}
				par.add(new Param(str.toString()));
				break;
			}
		}
		parameter = par.toArray(new Param[par.size()]);
		try {
			Stelle stelle = BefehlEnum.class.getField(bef.name()).getAnnotation(Stelle.class);
			if (stelle != null) {
				if (stelle.braucht()) {
					benötigteStellen.add(stel);
				} else {
					stellen.put(stel, index);
				}
			}
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}
	
	private Param paramStelle(String stelle) throws InterpretierungsFehler {
		char[] chars = stelle.toCharArray();
		for (char test : chars) {
			if (test < 'A' || test > 'Z' && test != '_') throw new InterpretierungsFehler(stelle + " ist keine gültige stelle! (" + test + ")");
		}
		return new Param(stelle);
	}
	
	private Param paramZahl(String param) {
		switch (param) {
		case "ergebnis":
			return new Param(true);
		case "zwischen":
			return new Param(false);
		
		case "UNBBEKANNT":
			return new Param(FehlersuchenInterpreter.UNBBEKANNT);
		case "GETEILT_DURCH_NULL":
			return new Param(FehlersuchenInterpreter.GETEILT_DURCH_NULL);
		case "FALSCHE_BENUTZER_EINGABE":
			return new Param(FehlersuchenInterpreter.FALSCHE_BENUTZER_EINGABE);
		case "NEGATIVE_REGISTER_ANSPRACHE":
			return new Param(FehlersuchenInterpreter.NEGATIVE_REGISTER_ANSPRACHE);
		case "NEGATIVE_BEFEHL_ANSPRACHE":
			return new Param(FehlersuchenInterpreter.NEGATIVE_BEFEHL_ANSPRACHE);
		case "ZU_WENIGE_REGISTER":
			return new Param(FehlersuchenInterpreter.ZU_WENIGE_REGISTER);
		case "ZU_KLEINES_REGISTER":
			return new Param(FehlersuchenInterpreter.ZU_KLEINES_REGISTER);
		case "LEERER_STAPEL_SPRUNG":
			return new Param(FehlersuchenInterpreter.LEERER_STAPEL_SPRUNG);
		case "ZU_GROẞER_STAPEL":
			return new Param(FehlersuchenInterpreter.ZU_GROẞER_STAPEL);
		case "BEREICHSENDE_KLEINER_BEREICHSSTART":
			return new Param(FehlersuchenInterpreter.BEREICHSENDE_KLEINER_BEREICHSSTART);
		case "KEIN_FEHLER":
			return new Param(FehlersuchenInterpreter.KEIN_FEHLER);
		
		default:
			return new Param(Integer.parseInt(param));
		}
	}
	
	private Param paramPosZahl(String param) throws NegativeZahlFehler {
		switch (param) {
		case "ergebnis":
			return new Param(true);
		case "zwischen":
			return new Param(false);
		
		case "UNBBEKANNT":
			return new Param(FehlersuchenInterpreter.UNBBEKANNT);
		case "GETEILT_DURCH_NULL":
			return new Param(FehlersuchenInterpreter.GETEILT_DURCH_NULL);
		case "FALSCHE_BENUTZER_EINGABE":
			return new Param(FehlersuchenInterpreter.FALSCHE_BENUTZER_EINGABE);
		case "NEGATIVE_REGISTER_ANSPRACHE":
			return new Param(FehlersuchenInterpreter.NEGATIVE_REGISTER_ANSPRACHE);
		case "NEGATIVE_BEFEHL_ANSPRACHE":
			return new Param(FehlersuchenInterpreter.NEGATIVE_BEFEHL_ANSPRACHE);
		case "ZU_WENIGE_REGISTER":
			return new Param(FehlersuchenInterpreter.ZU_WENIGE_REGISTER);
		case "ZU_KLEINES_REGISTER":
			return new Param(FehlersuchenInterpreter.ZU_KLEINES_REGISTER);
		case "LEERER_STAPEL_SPRUNG":
			return new Param(FehlersuchenInterpreter.LEERER_STAPEL_SPRUNG);
		case "ZU_GROẞER_STAPEL":
			return new Param(FehlersuchenInterpreter.ZU_GROẞER_STAPEL);
		case "BEREICHSENDE_KLEINER_BEREICHSSTART":
			return new Param(FehlersuchenInterpreter.BEREICHSENDE_KLEINER_BEREICHSSTART);
		case "KEIN_FEHLER":
			return new Param(FehlersuchenInterpreter.KEIN_FEHLER);
		
		default:
			int teste = Integer.parseInt(param);
			if (teste < 0) throw new NegativeZahlFehler(teste);
			return new Param(teste);
		}
	}
	
	@Override
	public String toString() {
		StringBuilder erg = new StringBuilder().append('[').append(bef.name()).append("]:{");
		int i;
		for (i = 0; i < parameter.length - 1; i ++ ) {
			erg.append(parameter[i]).append(", ");
		}
		return erg.append(i < parameter.length ? parameter[i] : "").append('}').toString();
	}
	
}
