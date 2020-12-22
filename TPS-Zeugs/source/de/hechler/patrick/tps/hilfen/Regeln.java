package de.hechler.patrick.tps.hilfen;

import java.util.Objects;
import java.util.Set;

import de.hechler.patrick.pzs8b.zeichen.Pzs8bZeichen;
import de.hechler.patrick.pzs8b.zeichenKette.Pzs8bZeichenKette;

public class Regeln {
	
	public static final String PFAD_TEILER;
	
	
	
	static {
		PFAD_TEILER = "/";
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
	public static <F extends Exception, S extends CharSequence> S testeName(S name, F fehler, Set <String> besetzteNamen) throws F {
		Pzs8bZeichen[] zeichen;
		Objects.requireNonNull(name, "Ich kann nicht auf null prüfen!");
		Objects.requireNonNull(fehler, "Ich kann null nuicht werfen!");
		if (name instanceof Pzs8bZeichenKette) {
			zeichen = ((Pzs8bZeichenKette) name).getZeichen();
		}
		zeichen = new Pzs8bZeichenKette(name.toString()).getZeichen();
		if (zeichen.length < 2) {
			fehler.setStackTrace(new Throwable().getStackTrace());
			throw fehler;
		}
		for (Pzs8bZeichen dieses : zeichen) {
			if ( !dieses.istBuchstabe()) {
				fehler.setStackTrace(new Throwable().getStackTrace());
				throw fehler;
			}
		}
		if (besetzteNamen != null && besetzteNamen.contains(name)) {
			fehler.setStackTrace(new Throwable().getStackTrace());
			throw fehler;
		}
		return name;
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
		Objects.requireNonNull(testePfad, "Ich kann nicht auf null prüfen!");
		Objects.requireNonNull(fehler, "Ich kann null nicht werfen!");
		if (testePfad.indexOf((int) ':') != -1 || testePfad.indexOf((int) '*') != -1 || testePfad.indexOf((int) '?') != -1 || testePfad.indexOf((int) '"') != -1
				|| testePfad.indexOf((int) '<') != -1 || testePfad.indexOf((int) '>') != -1 || testePfad.indexOf((int) '|') != -1) {
			fehler.setStackTrace(new Throwable().getStackTrace());
			throw fehler;
		}
		return testePfad;
	}
	
}
