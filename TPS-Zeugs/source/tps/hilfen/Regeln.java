package tps.hilfen;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import de.hechler.patrick.pzs8b.zeichen.Pzs8bZeichen;

public class Regeln {
	
	public static final String Pfad_TEILER;
	public static final String GEHE_IN;
	public static final Set <String> BESETZTE_NAMEN;
	
	
	
	static {
		Set <String> zwischen;
		Pfad_TEILER = "/";
		GEHE_IN = "#";
		zwischen = new TreeSet <String>();
		zwischen.add("braucht");
		zwischen.add("macht");
		zwischen.add("bessert");
		zwischen.add("offen");
		zwischen.add("vererben");
		zwischen.add("datei");
		zwischen.add("eigen");
		// TODO fertig machen
		
		
		
		BESETZTE_NAMEN = Collections.unmodifiableSet(zwischen);
	}
	
	
	
	/**
	 * Prüft <code>name</code> auf Gültigkeit. <br>
	 * Ein name ist nur dann gültig, wenn er nur aus Buchstaben besteht. <br>
	 * Ein Buchstabe ist: a-z, A-Z, ö, ä, ü, ß, Ö, Ä, Ü, ẞ
	 * 
	 * @param <F>
	 *            klasse von <code>fehler</code>, der beim ungültigen <code>name</code> geworfen wird.
	 * 			
	 * @param name
	 *            Der zu prüfende Name
	 * @param fehler
	 *            wird geworfen, wenn <code>name</code> ungültig ist.
	 * @throws F
	 *             wenn <code>name</code> ungültig ist
	 */
	public static <F extends Exception> void testeName(String name, F fehler) throws F {
		char[] zeichen;
		int index;
		zeichen = name.toCharArray();
		for (index = 0; index < zeichen.length; index ++ ) {
			Pzs8bZeichen zwischen = new Pzs8bZeichen(zeichen[index]);
			if ( !zwischen.istBuchstabe()) {
				fehler.setStackTrace(new Throwable().getStackTrace());
				throw fehler;
			}
		}
		if (BESETZTE_NAMEN.contains(name)) {
			fehler.setStackTrace(new Throwable().getStackTrace());
			throw fehler;
		}
	}
	
	/**
	 * Prüft, ob der übergebene Pfad gültig ist. Wenn ja, wird dieser zurückgegeben. wenn nicht, dann wird ein <code>FalscheSourcenFehler</code> geworfen.
	 * 
	 * @param testePfad
	 *            Der zu testende Pfad
	 * @return Den <code>testePfad</code>, wenn dieser akzeptabel ist. Ansonsten wird ein <code>FalscheSourcenFehler</code> geworfen
	 * @throws fehler
	 *             wird geworfen, wenn der Pfad ungültig ist
	 */
	public static <F extends Exception> String testePfad(String testePfad, F fehler) throws F {
		if (testePfad.indexOf((int) ':') == -1 || testePfad.indexOf((int) '*') == -1 || testePfad.indexOf((int) '?') == -1 || testePfad.indexOf((int) '"') == -1
				|| testePfad.indexOf((int) '<') == -1 || testePfad.indexOf((int) '>') == -1 || testePfad.indexOf((int) '|') == -1) {
			fehler.setStackTrace(new Throwable().getStackTrace());
			throw fehler;
		}
		return testePfad;
	}
	
}
