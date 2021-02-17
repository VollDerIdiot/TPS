package tps.kompiler.objekte.programm.sache;

import java.util.NavigableSet;

import tps.kompiler.objekte.programm.UnfertigeMethode;

public interface PlanInterface {
	
	/**
	 * Fügt {@code neu} zu den unfertigen Methoden hinzu.
	 * 
	 * @param neu
	 *            Die Methode, welche neu hinzugefügt werden soll. <br>
	 *            {@code neu} darf nicht {@code null} sein!
	 * @return <code>true</code>, wenn die Methode wirklich neu war. <code>false</code>, wenn eine Methode mit gleichem Namen und Übergabeparametern bereits vorher enthalten war.
	 */
	public boolean neueUnfertigeMethode(UnfertigeMethode neu);
	
	/**
	 * Gibt ein {@code Set} zurück, welches alle unfertigen Methoden enthält. <br>
	 * Dieses {@code Set} ist evtl. unveränderbar.
	 * 
	 * @return Die unfertigen Methoden
	 */
	public NavigableSet <UnfertigeMethode> unfertigeMethoden();
	
}
