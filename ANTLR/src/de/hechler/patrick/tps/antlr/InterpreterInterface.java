package de.hechler.patrick.tps.antlr;

import de.hechler.patrick.tps.antlr.objects.Satz;

public interface InterpreterInterface extends Runnable {
	
	public final static long FEHLER_UNBEKANNT                = -1l;
	public final static long FEHLER_EINGABE_KEINE_ZAHL       = 1l;
	public final static long FEHLER_TEILEN_DURCH_NULL        = 2l;
	public final static long FEHLER_STAPEL_ÜBERFÜLT          = 3l;
	public final static long FEHLER_LEERER_STAPEL            = 4l;
	public final static long FEHLER_ZU_KLEINE_REGISTERANGABE = 5l;
	public final static long FEHLER_ZU_GROẞE_REGISTERANGABE  = 6l;
	public final static long FEHLER_ZU_KLEINE_SATZANGABE     = 7l;
	public final static long FEHLER_ZU_GROẞE_SATZANGABE      = 8l;
	public final static long FEHLER_EINGABE_ZUENDE           = 9l;
	public static final long FEHLER_NEGATIVE_ZAHL            = 10l;
	
	public final static long STATUS_LEER       = 0b0000000000000000000000000000000000000000000000000000000000000000l;
	public final static long STATUS_KLEINER    = 0b0000000000000000000000000000000000000000000000000000000000000001l;
	public final static long STATUS_GLECIH     = 0b0000000000000000000000000000000000000000000000000000000000000010l;
	public final static long STATUS_GRÖẞER     = 0b0000000000000000000000000000000000000000000000000000000000000100l;
	public final static long STATUS_LÄUFT      = 0b0000000000000000000000000000000000000000000000000000000000001000l;
	public final static long STATUS_ANGEHALTEN = 0b0000000000000000000000000000000000000000000000000000000000010000l;
	public final static long STATUS_FEHLER     = 0b1000000000000000000000000000000000000000000000000000000000000000l;
	
	void lade(Satz[] sätze);
	
	long status();
	
	long ergebnis();
	
	long zwischen();
	
	long register(long index) throws IndexOutOfBoundsException;
	
	long registerAnzahl();
	
	long StapelGröße();
	
	long StapelMaxGröße();
	
	long letzterFehlerArt();
	
	long letzterFehlerStelle();
	
	boolean hatAutomatischenFehlerSprung();

	int version();
	
}
