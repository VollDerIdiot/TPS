package de.hechler.patrick.tps.antlr.objects;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.hechler.patrick.tps.antlr.enums.SatzArt;
import de.hechler.patrick.tps.antlr.fehler.WrongInputException;
import de.hechler.patrick.tps.antlr.objects.satz.Ausgabeoperation;
import de.hechler.patrick.tps.antlr.objects.satz.EinzelZahlenoperation;
import de.hechler.patrick.tps.antlr.objects.satz.RegRegTextOperation;
import de.hechler.patrick.tps.antlr.objects.satz.RegisterUndZahlOperation;
import de.hechler.patrick.tps.antlr.objects.satz.Stellenoperation;
import de.hechler.patrick.tps.antlr.objects.satz.VierRegisterOperation;
import de.hechler.patrick.tps.antlr.objects.satz.Zahlenoperation;
import de.hechler.patrick.tps.antlr.objects.satz.ZweiRegisterOperation;

public class Satz implements Serializable {
	
	/** UID */
	private static final long serialVersionUID = -900170451527422969L;
	
	public final SatzArt          art;
	public final List <Parameter> params;
	
	
	public Satz(SatzArt art, List <? extends Parameter> params) {
		this.art = art;
		this.params = Collections.unmodifiableList(new ArrayList <>(params));
	}
	
	
	
	public SatzArt art() {
		return art;
	}
	
	public Parameter param(int index) {
		return params.get(index);
	}
	
	public final void speichern(OutputStream out) throws IOException {
		writeInt(out, art.ordinal());
		writeInt(out, params.size());
		for (Parameter dieser : params) {
			Parameter.speichern(out, dieser);
		}
	}
	
	private void writeInt(OutputStream out, int write) throws IOException {
		out.write(write & 0xFF);
		out.write( (write >>> 8) & 0xFF);
		out.write( (write >>> 16) & 0xFF);
		out.write( (write >>> 24) & 0xFF);
	}
	
	public static final Satz lade(InputStream in) throws IOException, WrongInputException {
		int zw = readInt(in);
		SatzArt art = SatzArt.values()[zw];
		zw = readInt(in);
		List <Parameter> params = new ArrayList <Parameter>(zw);
		for (int i = 0; i < zw; i ++ ) {
			Parameter p = Parameter.lade(in);
			params.add(p);
		}
		switch (art) {
		case addiere:
			if (params.size() != 2) throw new WrongInputException("params.size()!=2 & art=addiere params=" + params);
			try {
				return new Zahlenoperation(art, (Zahl) params.get(0), (Zahl) params.get(1));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case ausgabe:
			if (params.size() != 2) throw new WrongInputException("params.size()!=1 & art=ausgabe params=" + params);
			return new Ausgabeoperation(art, params.get(0));
		case dividiere:
			if (params.size() != 2) throw new WrongInputException("params.size()!=2 & art=" + art + " params=" + params);
			try {
				return new Zahlenoperation(art, (Zahl) params.get(0), (Zahl) params.get(1));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case geheZurück:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()!=true & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case ladeInRegister:
			if (params.size() != 2) throw new WrongInputException("params.size()!=2 & art=" + art + " params=" + params);
			try {
				return new RegisterUndZahlOperation(art, (Zahl) params.get(0), (Zahl) params.get(1));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case ladeRegisterAnzahlErg:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()!=true & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case ladeRegisterAnzahlZw:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()=false & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case ladeVomRegisterErg:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new EinzelZahlenoperation(art, (Zahl) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case ladeVomRegisterZw:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new EinzelZahlenoperation(art, (Zahl) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case leerzeichen:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()=false & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case leerzeile:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()=false & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case leseZahlEinErg:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()=false & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case leseZahlEinZwischen:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()=false & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case letzterFehler:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()=false & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case multipliziere:
			if (params.size() != 2) throw new WrongInputException("params.size()!=2 & art=" + art + " params=" + params);
			try {
				return new Zahlenoperation(art, (Zahl) params.get(0), (Zahl) params.get(1));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case registerWortEinlesen:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new EinzelZahlenoperation(art, (Zahl) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case registerZeichenEinlesen:
			if (params.size() != 2) throw new WrongInputException("params.size()!=2 & art=" + art + " params=" + params);
			try {
				return new RegisterUndZahlOperation(art, (Zahl) params.get(0), (Zahl) params.get(1));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case registerausgabe:
			if (params.size() != 2) throw new WrongInputException("params.size()!=2 & art=" + art + " params=" + params);
			try {
				return new ZweiRegisterOperation(art, (Zahl) params.get(0), (Zahl) params.get(1));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case rufeAuf:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case rufeAufDirekt:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new EinzelZahlenoperation(art, (Zahl) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case rufeAufGrößer:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case rufeAufGrößerGleich:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case rufeAufKleinerGleich:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case rufeAufWennFalsch:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case rufeAufWennGleich:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case rufeAufWennKleiner:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case rufeAufWennNichtGleich:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case springe:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case springeWennFalsch:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case springeWennGleich:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case springeWennGrößer:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case springeWennGrößerGleich:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case springeWennKleiner:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case springeWennKleinerGleich:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case springeWennNichtGleich:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case springeZuDirekt:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new EinzelZahlenoperation(art, (Zahl) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case stapelGrößeErg:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()!=true & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case stapelGrößeReg:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new EinzelZahlenoperation(art, (Zahl) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case stapelGrößeZw:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()!=true & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case stapelLesenErg:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()!=true & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case stapelLesenReg:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new EinzelZahlenoperation(art, (Zahl) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case stapelLesenZw:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()!=true & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case stapelMaxGrößeErg:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()!=true & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case stapelMaxGrößeReg:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new EinzelZahlenoperation(art, (Zahl) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case stapelMaxGrößeZw:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()!=true & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case stapelSchreiben:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new EinzelZahlenoperation(art, (Zahl) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case stelle:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new Stellenoperation(art, (ZeichenKette) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case subtrahiere:
			if (params.size() != 2) throw new WrongInputException("params.size()!=2 & art=" + art + " params=" + params);
			try {
				return new Zahlenoperation(art, (Zahl) params.get(0), (Zahl) params.get(1));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case vergleiche:
			if (params.size() != 2) throw new WrongInputException("params.size()!=2 & art=" + art + " params=" + params);
			try {
				return new Zahlenoperation(art, (Zahl) params.get(0), (Zahl) params.get(1));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case vergleicheRegister:
			if (params.size() != 4) throw new WrongInputException("params.size()!=4 & art=" + art + " params=" + params);
			try {
				return new VierRegisterOperation(art, (Zahl) params.get(0), (Zahl) params.get(1), (Zahl) params.get(2), (Zahl) params.get(3));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case vergleicheRegisterText:
			if (params.size() != 3) throw new WrongInputException("params.size()!=3 & art=" + art + " params=" + params);
			try {
				return new RegRegTextOperation(art, (Zahl) params.get(0), (Zahl) params.get(1), (ZeichenKette) params.get(2));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case versionErg:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()!=true & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case versionReg:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new EinzelZahlenoperation(art, (Zahl) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case versionZw:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()!=true & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		case zahlenausgabe:
			if (params.size() != 1) throw new WrongInputException("params.size()!=1 & art=" + art + " params=" + params);
			try {
				return new EinzelZahlenoperation(art, (Zahl) params.get(0));
			} catch (ClassCastException e) {
				throw new WrongInputException(e);
			}
		case zwischenspeicher:
			if ( !params.isEmpty()) throw new WrongInputException("params.isEmpty()!=true & art=" + art + " params=" + params);
			return new Satz(art, Collections.emptyList());
		default:
			throw new RuntimeException("unknown art: " + art);
		}
	}
	
	private static int readInt(InputStream in) throws IOException {
		int erg = in.read();
		erg |= in.read() << 8;
		erg |= in.read() << 16;
		int letztes = in.read();
		if (letztes == -1) throw new EOFException("reached <EOF> to early!");
		erg |= letztes << 24;
		return erg;
	}
	
}
