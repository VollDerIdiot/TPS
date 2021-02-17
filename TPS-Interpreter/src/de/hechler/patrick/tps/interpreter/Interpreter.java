package de.hechler.patrick.tps.interpreter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import de.hechler.patrick.tps.fehler.InterpretierungsFehler;

public interface Interpreter {
	
	default void interpretiere(File datei, Charset zeichensatz) throws IOException, InterpretierungsFehler {
		interpretiere(new FileInputStream(datei), zeichensatz);
	}
	
	void interpretiere(InputStream eingang, Charset zeichensatz) throws IOException, InterpretierungsFehler;
	
	int ergebnis();
	
	int zwischenspeicher();
	
	void ergebnis(int neu);
	
	void zwischenspeicher(int neu);
	
	void ausgeben(Object ausgeben);
	
	void zeilenumbruch();
	
}
