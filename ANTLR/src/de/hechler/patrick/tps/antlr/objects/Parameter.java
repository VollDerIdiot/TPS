package de.hechler.patrick.tps.antlr.objects;

import de.hechler.patrick.tps.interpreter.Interpreter;


public interface Parameter {
	
	boolean istZeichenKette();
	
	boolean istKonstante();
	
	boolean ergebniszahl();
	
	boolean zwischenzahl();
	
	Long zahl();
	
	long zahl(Interpreter interpret);
	
	String toString();
	
	String toString(Interpreter interpret);
	
}