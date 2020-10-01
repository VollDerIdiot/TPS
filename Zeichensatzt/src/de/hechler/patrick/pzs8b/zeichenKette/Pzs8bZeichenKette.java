package de.hechler.patrick.pzs8b.zeichenKette;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import de.hechler.patrick.patischerZeichensatzt.zeichen.ZeichenZeugs;
import de.hechler.patrick.patischerZeichensatzt.zeichenKette.ZeichenKetteInterface;
import de.hechler.patrick.pzs8b.zeichen.Pzs8bZeichen;

public class Pzs8bZeichenKette implements ZeichenKetteInterface {
	
	private Pzs8bZeichen[] pzs8bZeichen;
	
	public Pzs8bZeichenKette(InputStream leser) throws Exception {
		List <Pzs8bZeichen> zeichen;
		zeichen = new ArrayList <Pzs8bZeichen>();
		while (true) {
			int speichern = leser.read();
			if (speichern == -1) {
				break;
			}
			zeichen.add(new Pzs8bZeichen(speichern));
		}
		pzs8bZeichen = zeichen.toArray(new Pzs8bZeichen[zeichen.size()]);
	}
	
	public Pzs8bZeichenKette(char[] zeichen) {
		this.pzs8bZeichen = new Pzs8bZeichen[zeichen.length];
		int runde;
		for (runde = 0; runde < zeichen.length; runde ++ ) {
			this.pzs8bZeichen[runde] = new Pzs8bZeichen(zeichen[runde]);
		}
	}
	
	public Pzs8bZeichenKette(String zeichen) {
		this.pzs8bZeichen = new Pzs8bZeichen[zeichen.length()];
		int runde;
		for (runde = 0; runde < this.pzs8bZeichen.length; runde ++ ) {
			this.pzs8bZeichen[runde] = new Pzs8bZeichen(zeichen.charAt(runde));
		}
	}
	
	public Pzs8bZeichenKette(int[] zeichenNummern) {
		this.pzs8bZeichen = new Pzs8bZeichen[zeichenNummern.length];
		int runde;
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			this.pzs8bZeichen[runde] = new Pzs8bZeichen(zeichenNummern[runde]);
		}
	}
	
	public Pzs8bZeichenKette(Pzs8bZeichen[] zeichen) {
		this.pzs8bZeichen = zeichen;
	}
	
	
	
	@Override
	public int[] getBytes() {
		int[] rückgabe = new int[pzs8bZeichen.length];
		int runde;
		for (runde = 0; runde < rückgabe.length; runde ++ ) {
			rückgabe[runde] = pzs8bZeichen[runde].getNummer();
		}
		return rückgabe;
	}
	
	@Override
	public Pzs8bZeichen[] getZeichen() {
		return pzs8bZeichen;
	}
	
	@Override
	public boolean contains(ZeichenZeugs prüfen) {
		if (prüfen instanceof Pzs8bZeichen) {
			for (Pzs8bZeichen prüfer : pzs8bZeichen) {
				if (prüfer.equals(prüfen)) {
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public boolean contains(char prüfen) {
		for (Pzs8bZeichen prüfer : pzs8bZeichen) {
			if (prüfen == prüfer.getZeichen()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean contains(int prüfNummer) {
		for (Pzs8bZeichen prüfer : pzs8bZeichen) {
			if (prüfNummer == prüfer.getNummer()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int getIndex(ZeichenZeugs prüfen) {
		int runde;
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			if (prüfen.equals(pzs8bZeichen[runde])) {
				return runde;
			}
		}
		return -1;
	}
	
	
	@Override
	public int getIndex(char prüfen) {
		int runde;
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			if (prüfen == pzs8bZeichen[runde].getZeichen()) {
				return runde;
			}
		}
		return -1;
	}
	
	@Override
	public int getIndex(int prüfNummer) {
		int runde;
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			if (prüfNummer == pzs8bZeichen[runde].getNummer()) {
				return runde;
			}
		}
		return -1;
	}
	
	@Override
	public int getLetztenIndex(ZeichenZeugs prüfen) {
		int runde;
		for (runde = pzs8bZeichen.length - 1; runde > 0; runde -- ) {
			if (prüfen.equals(pzs8bZeichen[runde])) {
				return runde;
			}
		}
		return -1;
	}
	
	@Override
	public int getLetztenIndex(char prüfen) {
		int runde;
		for (runde = pzs8bZeichen.length - 1; runde > 0; runde -- ) {
			if (prüfen == pzs8bZeichen[runde].getZeichen()) {
				return runde;
			}
		}
		return -1;
	}
	
	@Override
	public int getLetztenIndex(int prüfNummer) {
		int runde;
		for (runde = pzs8bZeichen.length - 1; runde > 0; runde -- ) {
			if (prüfNummer == pzs8bZeichen[runde].getNummer()) {
				return runde;
			}
		}
		return -1;
	}
	
	private int[] getIntArray(List <Integer> umwandeln) {
		Object[] zwischen = umwandeln.toArray();
		int[] rückgabe = new int[zwischen.length];
		int runde;
		
		for (runde = 0; runde < zwischen.length; runde ++ ) {
			rückgabe[runde] = (Integer) zwischen[runde];
		}
		return rückgabe;
	}
	
	@Override
	public int[] getAlleIndexe(ZeichenZeugs prüfen) {
		ArrayList <Integer> indexe = new ArrayList <Integer>();
		int runde;
		
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			if (prüfen.equals(pzs8bZeichen[runde])) {
				indexe.add(runde);
			}
		}
		
		return getIntArray(indexe);
	}
	
	@Override
	public int[] getAlleIndexe(char prüfen) {
		ArrayList <Integer> indexe = new ArrayList <Integer>();
		int runde;
		
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			if (prüfen == pzs8bZeichen[runde].getZeichen()) {
				indexe.add(runde);
			}
		}
		
		return getIntArray(indexe);
	}
	
	@Override
	public int[] getAlleIndexe(int prüfNummer) {
		ArrayList <Integer> indexe = new ArrayList <Integer>();
		int runde;
		
		for (runde = 0; runde < pzs8bZeichen.length; runde ++ ) {
			if (prüfNummer == pzs8bZeichen[runde].getNummer()) {
				indexe.add(runde);
			}
		}
		
		return getIntArray(indexe);
	}
	
	@Override
	public void speichere(OutputStream schreiber) throws Exception {
		for (Pzs8bZeichen schreiben : pzs8bZeichen) {
			schreiber.write(schreiben.getNummer());
		}
		schreiber.close();
	}
	
}