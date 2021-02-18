package de.hechler.patrick.tps.interpreter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import de.hechler.patrick.tps.fehler.InterpretierungsFehler;

public interface Interpreter {
	
	public static final String POS_ZAHL  = "[POSITIV]";
	public static final String ZAHL      = "[ZAHL]";
	public static final String WORTFOLGE = "[...]";
	public static final String STELLE    = "[STELLE]";
	
	public static final int STATUS_KLEINER    = 0b00000000000000000000000000000001;
	public static final int STATUS_GLEICH     = 0b00000000000000000000000000000010;
	public static final int STATUS_GRÖẞER     = 0b00000000000000000000000000000100;
	public static final int STATUS_LÄUFT      = 0b00000000000000000000000000001000;
	public static final int STATUS_ANGEHALTEN = 0b00000000000000000000000000010000;
	public static final int STATUS_FEHLER     = 0b00000000000000000000000000100000;
	
	
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
