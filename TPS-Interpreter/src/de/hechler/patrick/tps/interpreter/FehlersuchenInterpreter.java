package de.hechler.patrick.tps.interpreter;

import java.util.NoSuchElementException;

import de.hechler.patrick.tps.interpreter.hilfen.AnordnungInterface;

public interface FehlersuchenInterpreter extends Interpreter {
	
	boolean ignoriertStoppPunkte();
	
	void ignoriereStoppPunkte(boolean ignoriereStopper);
	
	int[] stoppPunkte();
	
	void stoppPunkt(int neuerStopper);
	
	boolean machtFehlerStoppung();
	
	void fehlerStoppen(boolean stoppendeFehler);
	
	int version();
	
	int stapelGröße();
	
	int registerAnzahl();
	
	void schreibeRegister(int register, int wert);
	
	int leseRegister(int register);
	
	int anzahlAnordnungen();
	
	void springeZu(int ziel);
	
	void rufeAuf(int ziel);
	
	/**
	 * führt sofort einen geheZurück Befehl aus und gibt die {@link AnordnungInterface} zurück, zu welcher zurückgesprungen wurde.
	 * 
	 * @return die Anordnung zu welcher zu zurückgesprungen wurde.
	 */
	AnordnungInterface erzwingeZurückgehen();
	
	/**
	 * gibt die Anordnung, welche als nächstes ausgeführt wird zurück.
	 * 
	 * @return die Anordnung, welche als nächstes ausgeführt wird.
	 * @throws NoSuchElementException
	 *             wenn bereits alles ausgeführt wurde.
	 */
	AnordnungInterface nächstes() throws NoSuchElementException;
	
	/**
	 * führt eine Anordnung aus und gibt die {@link #nächstes()} Anordnung zurück.
	 * 
	 * @return die Anordnung, welche als nächstes ausgeführt wird
	 * @throws IllegalStateException
	 *             wenn bereits alles ausgeführt wurde.
	 */
	AnordnungInterface macheSchritt() throws IllegalStateException;
	
	/**
	 * führt so lange alle Anordnungen durch, bis ein gehe zurück durchgeführt wird oder ein Stopper aktiviert wird. Dann wird getoppt und die {@link #nächstes()} Anordnung wird zurückgegeben.
	 * 
	 * @return die Anordnung, welche als nächstes ausgeführt wird
	 * @throws IllegalStateException
	 *             wenn bereits alles ausgeführt wurde.
	 */
	AnordnungInterface macheBisRaus() throws IllegalStateException;
	
	/**
	 * führt so lange alle Anordnungen durch, bis ein Stopper aktiviert wird. Dann wird getoppt und die {@link #nächstes()} Anordnung wird zurückgegeben.
	 * 
	 * @return die Anordnung, welche als nächstes ausgeführt wird
	 * @throws IllegalStateException
	 *             wenn bereits alles ausgeführt wurde.
	 */
	AnordnungInterface macheBisStopper() throws IllegalStateException;
	
}
