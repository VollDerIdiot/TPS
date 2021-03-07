package de.hechler.patrick.tps.interpreter;

import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import de.hechler.patrick.tps.antlr.objects.Satz;

public interface SatzFehlerSucherInter extends SatzInterpreter {
	
	void ergebnis(long neu);
	
	void zwischen(long neu);
	
	void register(long index, long neuerWert) throws IndexOutOfBoundsException;
	
	void status(long neu);
	
	void stoppeBeiFehler(boolean stoppendeFehler);
	
	boolean stopptBeiFehlern();
	
	void neuerStoppPunkt(long satz) throws IndexOutOfBoundsException;
	
	void entferneStoppPunkt(long keinStopper) throws IndexOutOfBoundsException, NoSuchElementException;
	
	Set <Long> stoppPunkte();
	
	boolean stopptBeiStoppPunkten();
	
	void stoppeBeiStoppPunkten(boolean stoppendePunkte);
	
	long anzahlSätze();
	
	Map <String, Long> stellen();
	
	boolean stopptBeiZurückgehen();
	
	void stoppeBeiGeheZurück(boolean stoppendesZurückgehen);
	
	boolean stopptBeiReingehen();
	
	void stoppeBeiGeheZu(boolean stoppendesReingehen);
	
	boolean stopptBeiSprüngen();
	
	void stoppeBeiSprüngen(boolean stoppendeSprünge);
	
	Satz nächster();
	
	boolean hatNächsten();
	
	void macheEinenSatz();
	
	void macheBisGeheZurück();
	
	void macheBisGeheIn();
	
	void macheBisSprung();
	
	void einfachMalSo(Satz machen);
	
	void springe(String stelle) throws NoSuchElementException;
	
	void springe(long satz) throws IndexOutOfBoundsException;
	
	void geheZu(String stelle) throws NoSuchElementException, IllegalStateException;
	
	void geheZu(long satz) throws IndexOutOfBoundsException, IllegalStateException;
	
	void geheZurück() throws IllegalStateException, IndexOutOfBoundsException;
	
	void halteAn();
	
	boolean hältAn();
	
}
