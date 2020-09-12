package tps.regeln;

public class Regeln {
	
	public static final String BRAUCHT_TEILER = "/";
	public static final String GEHE_IN = "#";
	
	/**
	 * Prüft <code>name</code> auf Gültigkeit. <br>
	 * Ein Name ist gültig, wenn dieser nur aus Buchstaben (<code>a-zA-Z</code>) und Zahlen (<code>0-9</code>) besteht und das erste Zeichen keine Zahl ist. <br>
	 * Wenn der Name nicht gültig ist, wird ein <code>FalscheSourcenFehler</code> geworfen.
	 * 
	 * @param <T>
	 *            klasse von <code>fehler</code>, der beim ungültigen <code>name</code> geworfen wird.
	 * 			
	 * @param name
	 *            Der zu prüfende Name
	 * @param fehler
	 *            wird geworfen, wenn <code>name</code> ungültig ist.
	 * @throws T
	 *             wenn <code>name</code> ungültig ist
	 */
	public static <T extends Exception> void testeName(String name, T fehler) throws T {
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
	
}
