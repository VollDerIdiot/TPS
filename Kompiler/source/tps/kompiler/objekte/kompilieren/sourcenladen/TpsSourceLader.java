package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.nio.charset.Charset;

public abstract class TpsSourceLader {
	
	/**
	 * Gibt die Dateiendung des <code>TpsSourceLader</code>s zurück. <br>
	 * Anhand dieser wird dann entschieden, ob dieser Kompiler für die Datei geeignet ist. Das Ergebnis der {@link #zeichensatz()} Methode wird auch dafür benutzt.
	 * 
	 * @return Die Dateiendung, welche Dateien haben, die von diesem <code>TpsSourceLader</code> geladen werden können. <br>
	 *         Die Dateiendung ist alles was nach dem letztem '.' Zeichen kommt (also ohne das '.' Zeichen selbst)
	 */
	public abstract String endung();
	
	/**
	 * Gibt den Zeichensatz des <code>TpsSpurceLader</code>s, welche benutzt wird, um
	 * @return
	 */
	public abstract Charset zeichensatz();
	
}
