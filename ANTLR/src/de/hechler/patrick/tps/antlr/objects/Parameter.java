package de.hechler.patrick.tps.antlr.objects;

import java.io.Serializable;

import de.hechler.patrick.tps.interpreter.Interpreter;


public interface Parameter extends Serializable {
	
	boolean istZeichenKette();
	
	boolean istKonstante();
	
	boolean ergebniszahl();
	
	boolean zwischenzahl();
	
	Long zahl();
	
	long zahl(Interpreter interpret);
	
	String toString();
	
	String toString(Interpreter interpret);
	
}