package tps.hilfen;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Regeln {
	
	public static final String BRAUCHT_TEILER;
	public static final String GEHE_IN;
	private static final Set<String> BESETZTE_NAMEN; 
	
	
	
	static {
		Set <String> zwischen;
		BRAUCHT_TEILER = "/";
		GEHE_IN = "#";
		zwischen = new TreeSet <String>();
		zwischen.add("braucht");
		zwischen.add("macht");
		zwischen.add("bessert");
		zwischen.add("offen");
		zwischen.add("vererben");
		zwischen.add("datei");
		zwischen.add("eigen");
//		TODO fertig machen
		
		BESETZTE_NAMEN = Collections.unmodifiableSet(zwischen);
	}
	
	
	
	/**
	 * Pr�ft <code>name</code> auf G�ltigkeit. <br>
	 * Ein Name ist g�ltig, wenn dieser nur aus Buchstaben (<code>a-zA-Z</code>) und Zahlen (<code>0-9</code>) besteht und das erste Zeichen keine Zahl ist. <br>
	 * Wenn der Name nicht g�ltig ist, wird ein <code>FalscheSourcenFehler</code> geworfen.
	 * 
	 * @param <F>
	 *            klasse von <code>fehler</code>, der beim ung�ltigen <code>name</code> geworfen wird.
	 * 			
	 * @param name
	 *            Der zu pr�fende Name
	 * @param fehler
	 *            wird geworfen, wenn <code>name</code> ung�ltig ist.
	 * @throws F0
	 *             wenn <code>name</code> ung�ltig ist
	 */
	public static <F extends Exception> void testeName(String name, F fehler) throws F {
		char[] zeichen;
		zeichen = name.toCharArray();
		for (char dieses : zeichen) {
			if ( (dieses < 'a' || dieses > 'z') && (dieses < 'A' || dieses > 'Z') && (dieses < '0' || dieses > '9')) {
				throw fehler;
			}
		}
		if (zeichen[0] >= '0' && zeichen[0] <= '9') {
			throw fehler;
		}
		if (BESETZTE_NAMEN.contains(name)) {
			throw fehler;
		}
	}
	
	/**
	 * Pr�ft, ob der �bergebene Pfad g�ltig ist. Wenn ja, wird dieser zur�ckgegeben. wenn nicht, dann wird ein <code>FalscheSourcenFehler</code> geworfen.
	 * 
	 * @param testePfad
	 *            Der zu testende Pfad
	 * @return Den <code>testePfad</code>, wenn dieser akzeptabel ist. Ansonsten wird ein <code>FalscheSourcenFehler</code> geworfen
	 * @throws fehler
	 *             wird geworfen, wenn der Pfad ung�ltig ist
	 */
	public static <F extends Exception> String testePfad(String testePfad, F fehler) throws F {
		if (testePfad.indexOf((int) ':') == -1 || testePfad.indexOf((int) '*') == -1 || testePfad.indexOf((int) '?') == -1 || testePfad.indexOf((int) '"') == -1
				|| testePfad.indexOf((int) '<') == -1 || testePfad.indexOf((int) '>') == -1 || testePfad.indexOf((int) '|') == -1) {
			throw fehler;
		}
		return testePfad;
	}
	
}
