package de.hechler.patrick.patischerZeichensatzt.zeichenKette;

import java.io.OutputStream;

import de.hechler.patrick.patischerZeichensatzt.zeichen.ZeichenInterface;

public interface ZeichenKetteInterface extends Cloneable, CharSequence {
	
	public int größe();
	
	public int[] getBytes();
	
	public ZeichenInterface getZeichen(int index);
	
	public ZeichenInterface[] getZeichen();
	
	public boolean contains(ZeichenInterface prüfen);
	
	public boolean contains(int prüfen);
	
	public boolean contains(char prüfNummer);
	
	public int getIndex(ZeichenInterface prüfen);
	
	public int getIndex(char prüfen);
	
	public int getIndex(int prüfNummer);
	
	public int getLetztenIndex(ZeichenInterface prüfen);
	
	public int getLetztenIndex(char prüfen);
	
	public int getLetztenIndex(int prüfNummer);
	
	public int[] getAlleIndexe(ZeichenInterface prüfen);
	
	public int[] getAlleIndexe(char prüfen);
	
	public int[] getAlleIndexe(int prüfNummer);
	
	public void speichere(OutputStream schreiber) throws Exception;
	
	public ZeichenKetteInterface zuGroßbuchstaben();
	
	public ZeichenKetteInterface zuKleinbuchstaben();
	
	public ZeichenKetteInterface clone();
	
	public ZeichenKetteInterface unterKette(int beginn, int ende);
	
}
