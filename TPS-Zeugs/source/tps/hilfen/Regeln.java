package tps.hilfen;

public class Regeln {
	
	public static final String BRAUCHT_TEILER = "/";
	public static final String GEHE_IN = "#";
	
	/**
	 * Prüft <code>name</code> auf Gültigkeit. <br>
	 * Ein Name ist gültig, wenn dieser nur aus Buchstaben (<code>a-zA-Z</code>) und Zahlen (<code>0-9</code>) besteht und das erste Zeichen keine Zahl ist. <br>
	 * Wenn der Name nicht gültig ist, wird ein <code>FalscheSourcenFehler</code> geworfen.
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
		zeichen = name.toCharArray();
		for (char dieses : zeichen) {
			if ( (dieses < 'a' || dieses > 'z') && (dieses < 'A' || dieses > 'Z') && (dieses < '0' || dieses > '9')) {
				throw fehler;
			}
		}
		if (zeichen[0] >= '0' && zeichen[0] <= '9') {
			throw fehler;
		}
	}
	
	/**
	 * Prüft, ob der Übergebene Pfad gültig ist. Wenn ja, wird dieser zurückgegeben. wenn nicht, dann wird ein <code>FalscheSourcenFehler</code> geworfen.
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
			throw fehler;
		}
		return testePfad;
	}
	
}
