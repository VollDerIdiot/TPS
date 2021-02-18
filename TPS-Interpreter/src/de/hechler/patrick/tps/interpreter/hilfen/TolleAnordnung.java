package de.hechler.patrick.tps.interpreter.hilfen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import de.hechler.patrick.tps.fehler.InterpretierungsFehler;
import de.hechler.patrick.tps.fehler.NegativerRegisterIndexFehler;
import de.hechler.patrick.tps.interpreter.Interpreter;
import de.hechler.patrick.tps.interpreter.Stelle;

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
					
				} else {
					stel = zw;
				}
				break;
			case Interpreter.WORTFOLGE:
				StringBuilder str = new StringBuilder(zw);
				iter.forEachRemaining(s -> str.append(s));
				par.add(new Param(str.toString()));
				break;
			}
		}
		parameter = par.toArray(new Param[par.size()]);
		try {
			Stelle stelle = BefehlEnum.class.getField(bef.name()).getAnnotation(Stelle.class);
			if (stelle != null) {
				if (stelle.brauchtStelle()) {
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
	
	private Param paramPosZahl(String param) throws NegativerRegisterIndexFehler {
		switch (param) {
		case "ergebnis":
			return new Param(true);
		case "zwischen":
			return new Param(false);
		default:
			int teste = Integer.parseInt(param);
			if (teste < 0) throw new NegativerRegisterIndexFehler(teste);
			return new Param(teste);
		}
	}
	
}
