package tps.kompiler.objekte.programm.sache;

import java.util.NavigableMap;
import java.util.NavigableSet;

import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.FertigeMethode;
import tps.kompiler.objekte.programm.Variable;

public interface FertigeSacheInterface {
	
	/**
	 * Fügt {@code neu} zu den bestehenden {@code Variablen}hinzu.
	 * 
	 * @param neu
	 *            Die {@code Variable}, welche neu hinzugefügt werden soll. <br>
	 *            {@code neu} darf nicht {@code null} sein!
	 * @param sicht
	 *            Die Sichtbarkeit der neuen Variable
	 * @return <code>true</code>, wenn die {@code Variable} wirklich neu war. <code>false</code>, wenn eine {@code Variable} mit dem gleichen Namen bereits existiert hat.
	 */
	public boolean neueVariable(Variable neu, Sichtbarkeit sicht);
	
	/**
	 * Gibt ein {@code Set} zurück, welches alle fertigen Methoden enthält. <br>
	 * Dieses {@code Set} ist evtl. unveränderbar.
	 * 
	 * @return Die fertigen Methoden
	 */
	public NavigableMap <Variable, Sichtbarkeit> variablen();
	
	/**
	 * Fügt {@code neu} zu den fertigen Methoden hinzu.
	 * 
	 * @param neu
	 *            Die Methode, welche neu hinzugefügt werden soll. <br>
	 *            {@code neu} darf nicht {@code null} sein!
	 * @return <code>true</code>, wenn die Methode wirklich neu war. <code>false</code>, wenn eine Methode mit gleichem Namen und Übergabeparametern bereits vorher enthalten war.
	 */
	public boolean neueFertigeMethode(FertigeMethode neu);
	
	/**
	 * Gibt ein {@code Set} zurück, welches alle fertigen Methoden enthält. <br>
	 * Dieses {@code Set} ist evtl. unveränderbar.
	 * 
	 * @return Die fertigen Methoden
	 */
	public NavigableSet <FertigeMethode> fertigeMethoden();
	
}
