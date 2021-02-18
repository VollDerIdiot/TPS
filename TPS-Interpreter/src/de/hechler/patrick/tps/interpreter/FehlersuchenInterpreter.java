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
	
	AnordnungInterface aktuelles() throws NoSuchElementException;
	
	AnordnungInterface nächstes() throws NoSuchElementException;
	
	AnordnungInterface macheSchritt() throws IllegalStateException;
	
	AnordnungInterface macheBisRaus() throws IllegalStateException;
	
	AnordnungInterface macheBisStopper() throws IllegalStateException;
	
}
