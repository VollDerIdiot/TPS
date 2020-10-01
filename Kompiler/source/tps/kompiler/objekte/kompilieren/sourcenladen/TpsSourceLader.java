package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.nio.charset.Charset;

public abstract class TpsSourceLader {
	
	/**
	 * Gibt die Dateiendung des Sourcecodes zurück. <br>
	 * Dies entspricht allem, was nach dem letztem '.' kommt (ohne den '.' selbst!).
	 * 
	 * @return Die Endung der nicht kompilierten Datei
	 */
	public abstract String endung();
	
	/**
	 * Gibt den Zeichensatz des Sourcecodes zurück.
	 * 
	 * @return Den Zeichensatz, welcher zum decodieren des gelesenen verwendet wird
	 */
	public abstract Charset zeichensatz();
	
}
