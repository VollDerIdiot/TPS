package de.hechler.patrick.tps.interpreter.hilfen;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import de.hechler.patrick.tps.fehler.InterpretierungsFehler;


public interface AnordnungInterface {
	
	void befehl(BefehlEnum neu);
	
	BefehlEnum befehl();
	
	Param param(int index);
	
	void fülleParam(List <String> satz, Collection <String> benötigteStellen, Map <String, Integer> stellen, int index) throws InterpretierungsFehler;
	
}