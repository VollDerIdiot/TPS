package de.hechler.patrick.patischerZeichensatzt;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import de.hechler.patrick.patischerZeichensatzt.zeichen.ZeichenInterface;
import de.hechler.patrick.patischerZeichensatzt.zeichenKette.UnfertigeZeichenKette;
import de.hechler.patrick.pzs8b.Pzs8bCharset;
import de.hechler.patrick.pzs8b.zeichen.Pzs8bZeichen;
import de.hechler.patrick.pzs8b.zeichenKette.Pzs8bZeichenKette;

public class TolleZeichenKette extends UnfertigeZeichenKette {
	
	private static final int PZS8B = 0;
	private static final int UTF16 = 1;
	
	
	
	private TolleZeichenKette() {
	}
	
	public TolleZeichenKette(String inhalt) {
		try {
			art = PZS8B;
			this.inhalt = inhalt.getBytes(new Pzs8bCharset());
		} catch (Exception e) {
			char[] zw;
			int runde;
			art = UTF16;
			zw = inhalt.toCharArray();
			this.inhalt = new byte[zw.length * 2];
			for (runde = 0; runde < zw.length; runde ++ ) {
				System.arraycopy(new UTF16Zeichen(zw[runde]).getNummer(), 0, this.inhalt, runde * 2, 2);
			}
		}
	}
	
	
	
	private int art;
	private byte[] inhalt;
	
	
	public static TolleZeichenKette lade(InputStream input) throws IOException {
		TolleZeichenKette ergebnis;
		ergebnis = new TolleZeichenKette();
		ergebnis.art = input.read();
		ergebnis.inhalt = input.readNBytes(input.read());
		return ergebnis;
	}
	
	@Override
	public int größe() {
		return inhalt.length >> art;
	}
	
	@Override
	public byte[] getBytes() {
		return inhalt.clone();
	}
	
	@Override
	public ZeichenInterface getZeichen(int index) {
		switch (art) {
		case PZS8B:
			return new Pzs8bZeichen( ((int) inhalt[index]) & 0xFF);
		case UTF16:
			return new UTF16Zeichen(inhalt, index * 2);
		default:
			throw new RuntimeException("Ich habe eine unbekannte art!");
		}
	}
	
	@Override
	public ZeichenInterface[] getZeichen() {
		switch (art) {
		case PZS8B:
			return new Pzs8bZeichenKette(inhalt).getZeichen();
		case UTF16: {
			UTF16Zeichen[] ergebnis;
			int runde;
			ergebnis = new UTF16Zeichen[größe()];
			for (runde = 0; runde < ergebnis.length; runde ++ ) {
				ergebnis[runde] = new UTF16Zeichen(inhalt, runde * 2);
			}
			return ergebnis;
		}
		default:
			throw new RuntimeException("Ich habe eine unbekannte art!");
		}
	}
	
	@Override
	public boolean contains(ZeichenInterface prüfen) {
		switch (art) {
		case PZS8B: {
			byte testen;
			int runde;
			if ( !Pzs8bZeichen.isZeichen(prüfen.getZeichen())) {
				return false;
			}
			testen = new Pzs8bZeichen(prüfen.getZeichen()).getNummer()[0];
			for (runde = 0; runde < inhalt.length; runde ++ ) {
				if (testen == inhalt[runde]) {
					return true;
				}
			}
			return false;
		}
		case UTF16: {
			byte[] testen;
			int runde;
			testen = new UTF16Zeichen(prüfen.getZeichen()).getNummer();
			for (runde = 0; runde + 1 < inhalt.length; runde += 2) {
				if (inhalt[runde] == testen[0] && inhalt[runde + 1] == testen[1]) {
					return true;
				}
			}
			return false;
		}
		default:
			throw new RuntimeException("Ich habe eine unbekannte art!");
		}
	}
	
	@Override
	public boolean contains(char prüfen) {
		switch (art) {
		case PZS8B: {
			byte testen;
			int runde;
			if ( !Pzs8bZeichen.isZeichen(prüfen)) {
				return false;
			}
			testen = new Pzs8bZeichen(prüfen).getNummer()[0];
			for (runde = 0; runde < inhalt.length; runde ++ ) {
				if (testen == inhalt[runde]) {
					return true;
				}
			}
			return false;
		}
		case UTF16: {
			byte[] testen;
			int runde;
			testen = new UTF16Zeichen(prüfen).getNummer();
			for (runde = 0; runde + 1 < inhalt.length; runde += 2) {
				if (inhalt[runde] == testen[0] && inhalt[runde + 1] == testen[1]) {
					return true;
				}
			}
			return false;
		}
		default:
			throw new RuntimeException("Ich habe eine unbekannte art!");
		}
	}
	
	@Override
	public int getIndex(ZeichenInterface prüfen) {
		switch (art) {
		case PZS8B: {
			byte testen;
			int runde;
			if ( !Pzs8bZeichen.isZeichen(prüfen.getZeichen())) {
				return -1;
			}
			testen = new Pzs8bZeichen(prüfen.getZeichen()).getNummer()[0];
			for (runde = 0; runde < inhalt.length; runde ++ ) {
				if (testen == inhalt[runde]) {
					return runde;
				}
			}
			return -1;
		}
		case UTF16: {
			byte[] testen;
			int runde;
			testen = new UTF16Zeichen(prüfen.getZeichen()).getNummer();
			for (runde = 0; runde + 1 < inhalt.length; runde += 2) {
				if (inhalt[runde] == testen[0] && inhalt[runde + 1] == testen[1]) {
					return runde / 2;
				}
			}
			return -1;
		}
		default:
			throw new RuntimeException("Ich habe eine unbekannte art!");
		}
	}
	
	@Override
	public int getIndex(char prüfen) {
		switch (art) {
		case PZS8B: {
			byte testen;
			int runde;
			if ( !Pzs8bZeichen.isZeichen(prüfen)) {
				return -1;
			}
			testen = new Pzs8bZeichen(prüfen).getNummer()[0];
			for (runde = 0; runde < inhalt.length; runde ++ ) {
				if (testen == inhalt[runde]) {
					return runde;
				}
			}
			return -1;
		}
		case UTF16: {
			byte[] testen;
			int runde;
			testen = new UTF16Zeichen(prüfen).getNummer();
			for (runde = 0; runde + 1 < größe(); runde += 2) {
				if (inhalt[runde] == testen[0] && inhalt[runde + 1] == testen[1]) {
					return runde / 2;
				}
			}
			return -1;
		}
		default:
			throw new RuntimeException("Ich habe eine unbekannte art!");
		}
	}
	
	@Override
	public int getLetztenIndex(ZeichenInterface prüfen) {
		switch (art) {
		case PZS8B: {
			byte testen;
			int runde;
			if ( !Pzs8bZeichen.isZeichen(prüfen.getZeichen())) {
				return -1;
			}
			testen = new Pzs8bZeichen(prüfen.getZeichen()).getNummer()[0];
			for (runde = inhalt.length - 1; runde >= 0; runde -- ) {
				if (testen == inhalt[runde]) {
					return runde;
				}
			}
			return -1;
		}
		case UTF16: {
			byte[] testen;
			int runde;
			testen = new UTF16Zeichen(prüfen.getZeichen()).getNummer();
			for (runde = inhalt.length - 1; runde > 0; runde -= 2) {
				if (inhalt[runde] == testen[0] && inhalt[runde + 1] == testen[1]) {
					return runde / 2;
				}
			}
			return -1;
		}
		default:
			throw new RuntimeException("Ich habe eine unbekannte art!");
		}
	}
	
	@Override
	public int getLetztenIndex(char prüfen) {
		switch (art) {
		case PZS8B: {
			byte testen;
			int runde;
			if ( !Pzs8bZeichen.isZeichen(prüfen)) {
				return -1;
			}
			testen = new Pzs8bZeichen(prüfen).getNummer()[0];
			for (runde = inhalt.length - 1; runde >= 0; runde -- ) {
				if (testen == inhalt[runde]) {
					return runde;
				}
			}
			return -1;
		}
		case UTF16: {
			byte[] testen;
			int runde;
			testen = new UTF16Zeichen(prüfen).getNummer();
			for (runde = inhalt.length - 1; runde > 0; runde -= 2) {
				if (inhalt[runde] == testen[0] && inhalt[runde + 1] == testen[1]) {
					return runde / 2;
				}
			}
			return -1;
		}
		default:
			throw new RuntimeException("Ich habe eine unbekannte art!");
		}
	}
	
	@Override
	public int[] getAlleIndexe(ZeichenInterface prüfen) {
		switch (art) {
		case PZS8B: {
			byte testen;
			int runde;
			int zähler;
			int[] ergebnis;
			if ( !Pzs8bZeichen.isZeichen(prüfen.getZeichen())) {
				return new int[0];
			}
			ergebnis = new int[inhalt.length];
			zähler = 0;
			testen = new Pzs8bZeichen(prüfen.getZeichen()).getNummer()[0];
			for (runde = inhalt.length - 1; runde >= 0; runde -- ) {
				if (testen == inhalt[runde]) {
					ergebnis[zähler ++ ] = runde;
				}
			}
			return Arrays.copyOf(ergebnis, zähler);
		}
		case UTF16: {
			byte[] testen;
			int runde;
			int zähler;
			int[] ergebnis;
			ergebnis = new int[inhalt.length];
			zähler = 0;
			testen = new UTF16Zeichen(prüfen.getZeichen()).getNummer();
			for (runde = 0; runde < inhalt.length - 1; runde += 2) {
				if (testen[0] == inhalt[runde] && testen[1] == inhalt[runde + 1]) {
					ergebnis[zähler ++ ] = runde / 2;
				}
			}
			return Arrays.copyOf(ergebnis, zähler);
		}
		default:
			throw new RuntimeException("Ich habe eine unbekannte art!");
		}
	}
	
	@Override
	public int[] getAlleIndexe(char prüfen) {
		switch (art) {
		case PZS8B: {
			byte testen;
			int runde;
			int zähler;
			int[] ergebnis;
			if ( !Pzs8bZeichen.isZeichen(prüfen)) {
				return new int[0];
			}
			ergebnis = new int[inhalt.length];
			zähler = 0;
			testen = new Pzs8bZeichen(prüfen).getNummer()[0];
			for (runde = inhalt.length - 1; runde >= 0; runde -- ) {
				if (testen == inhalt[runde]) {
					ergebnis[zähler ++ ] = runde;
				}
			}
			return Arrays.copyOf(ergebnis, zähler);
		}
		case UTF16: {
			byte[] testen;
			int runde;
			int zähler;
			int[] ergebnis;
			ergebnis = new int[inhalt.length];
			zähler = 0;
			testen = new UTF16Zeichen(prüfen).getNummer();
			for (runde = 0; runde < inhalt.length - 1; runde += 2) {
				if (testen[0] == inhalt[runde] && testen[1] == inhalt[runde + 1]) {
					ergebnis[zähler ++ ] = runde / 2;
				}
			}
			return Arrays.copyOf(ergebnis, zähler);
		}
		default:
			throw new RuntimeException("Ich habe eine unbekannte art!");
		}
	}
	
	@Override
	public void speichere(OutputStream schreiber) throws IOException {
		schreiber.write(art);
		schreiber.write(inhalt.length);
		schreiber.write(inhalt);
	}
	
	@Override
	public TolleZeichenKette zuGroßbuchstaben() {
		TolleZeichenKette ergebnis;
		int runde;
		ergebnis = new TolleZeichenKette();
		ergebnis.art = art;
		ergebnis.inhalt = inhalt.clone();
		switch (art) {
		case PZS8B:
			for (runde = 0; runde < inhalt.length; runde ++ ) {
				ergebnis.inhalt[runde] = new Pzs8bZeichen(inhalt[runde]).zuGroßbuchstaben().getNummer()[0];
			}
			break;
		case UTF16:
			for (runde = 0; runde < inhalt.length; runde += 2) {
				System.arraycopy(new UTF16Zeichen(inhalt, runde).zuGroßbuchstaben().getNummer(), 0, ergebnis.inhalt, runde, 2);
			}
			break;
		default:
			throw new RuntimeException("Ich habe eine unbekannte art!");
		}
		return ergebnis;
	}
	
	@Override
	public TolleZeichenKette zuKleinbuchstaben() {
		TolleZeichenKette ergebnis;
		int runde;
		ergebnis = new TolleZeichenKette();
		ergebnis.art = art;
		ergebnis.inhalt = inhalt.clone();
		switch (art) {
		case PZS8B:
			for (runde = 0; runde < inhalt.length; runde ++ ) {
				ergebnis.inhalt[runde] = new Pzs8bZeichen(inhalt[runde]).zuKleinbuchstaben().getNummer()[0];
			}
			break;
		case UTF16:
			for (runde = 0; runde < inhalt.length; runde += 2) {
				System.arraycopy(new UTF16Zeichen(inhalt, runde).zuKleinbuchstaben().getNummer(), 0, ergebnis.inhalt, runde, 2);
			}
			break;
		default:
			throw new RuntimeException("Ich habe eine unbekannte art!");
		}
		return ergebnis;
	}
	
	@Override
	public TolleZeichenKette unterKette(int beginn, int ende) {
		TolleZeichenKette ergebnis;
		ergebnis = new TolleZeichenKette();
		ergebnis.art = art;
		switch (art) {
		case PZS8B:
			ergebnis.inhalt = Arrays.copyOfRange(inhalt, beginn, ende);
			return ergebnis;
		case UTF16:
			ergebnis.inhalt = Arrays.copyOfRange(inhalt, beginn * 2, ende * 2 + 1);
			return ergebnis;
		default:
			throw new RuntimeException("Ich habe eine unbekannte art!");
		}
	}
	
	@Override
	public TolleZeichenKette clone() {
		TolleZeichenKette ergebnis;
		ergebnis = new TolleZeichenKette();
		ergebnis.art = art;
		ergebnis.inhalt = inhalt.clone();
		return ergebnis;
	}
	
	public class UTF16Zeichen implements ZeichenInterface {
		
		private final char zeichen;
		
		
		
		public UTF16Zeichen(byte[] bytes, int index) {
			zeichen = (char) ( ( ((int) bytes[index]) & 0xFF) << 8 | ((int) bytes[index + 1]) & 0xFF);
		}
		
		public UTF16Zeichen(char zeichen) {
			this.zeichen = zeichen;
		}
		
		
		
		@Override
		public char getZeichen() {
			return zeichen;
		}
		
		@Override
		public byte[] getNummer() {
			return new byte[] {(byte) ( ((int) zeichen) >> 8), (byte) zeichen };
		}
		
		@Override
		public ZeichenInterface zuGroßbuchstaben() {
			return new UTF16Zeichen(Character.toUpperCase(zeichen));
		}
		
		@Override
		public ZeichenInterface zuKleinbuchstaben() {
			return new UTF16Zeichen(Character.toUpperCase(zeichen));
		}
		
		@Override
		public boolean istBuchstabe() {
			return Character.toUpperCase(zeichen) != Character.toLowerCase(zeichen);
		}
		
		@Override
		public boolean istGroßbuchstaben() {
			return Character.toLowerCase(zeichen) != zeichen;
		}
		
		@Override
		public boolean istKleinbuchstaben() {
			return Character.toUpperCase(zeichen) != zeichen;
		}
		
		@Override
		public boolean istZahl() {
			return zeichen <= '9' && zeichen >= '0' || zeichen <= '⁹' && zeichen >= '⁰' || zeichen <= '₉' && zeichen >= '₀';
		}
		
		@Override
		public ZeichenInterface clone() {
			return new UTF16Zeichen(zeichen);
		}
		
	}
	
}
