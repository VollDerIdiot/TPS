package de.hechler.patrick.patischerZeichensatzt.zeichenKette;

import java.io.OutputStream;

import de.hechler.patrick.patischerZeichensatzt.zeichen.ZeichenZeugs;

public interface ZeichenKetteInterface {
	
	public int[] getBytes();
	
	public ZeichenZeugs[] getZeichen();
	
	public boolean contains(ZeichenZeugs prüfen);
	
	public boolean contains(int prüfen);
	
	public boolean contains(char prüfNummer);
	
	public int getIndex(ZeichenZeugs prüfen);
	
	public int getIndex(char prüfen);
	
	public int getIndex(int prüfNummer);
	
	public int getLetztenIndex(ZeichenZeugs prüfen);
	
	public int getLetztenIndex(char prüfen);
	
	public int getLetztenIndex(int prüfNummer);
	
	public int[] getAlleIndexe(ZeichenZeugs prüfen);
	
	public int[] getAlleIndexe(char prüfen);
	
	public int[] getAlleIndexe(int prüfNummer);
	
	public void speichere(OutputStream schreiber) throws Exception;
	
}
