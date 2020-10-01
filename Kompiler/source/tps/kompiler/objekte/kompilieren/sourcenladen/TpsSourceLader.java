package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.nio.charset.Charset;
import java.util.Objects;

import tps.kompiler.objekte.hilfen.Leser;
import tps.kompiler.objekte.programm.Datei;

public abstract class TpsSourceLader {
	
	/**
	 * speichert den Zeichensatz des <code>TpsSpurceLader</code>s, welche benutzt wird, um des gelesene zu in einen String umzuwandeln.
	 */
	private Charset zeichensatz;
	/**
	 * Liest den SourceCode ein.
	 */
	protected Leser sourceLeser;
	/**
	 * Die aktuell zu bauende Datei oder null. <br>
	 * Wird vor jedem {@link #lade()} auf null gesetzt.
	 */
	protected Datei datei;
	
	
	
	public TpsSourceLader(Charset zeichensatz) {
		this.zeichensatz = zeichensatz;
	}
	
	/**
	 * Gibt die Dateiendung des <code>TpsSourceLader</code>s zurück. <br>
	 * Anhand dieser wird dann entschieden, ob dieser Kompiler für die Datei geeignet ist. Das Ergebnis der {@link #zeichensatz()} Methode wird auch dafür benutzt.
	 * 
	 * @return Die Dateiendung, welche Dateien haben, die von diesem <code>TpsSourceLader</code> geladen werden können. <br>
	 *         Die Dateiendung ist alles was nach dem letztem '.' Zeichen kommt (also ohne das '.' Zeichen selbst)
	 */
	public abstract String endung();
	
	/**
	 * Lädt die aktuelle Datei
	 */
	protected abstract void lade();
	
	/**
	 * Setzt den aktuellen {@link #zeichensatz} auf den übergebenen <code>zeichensatz</code>
	 * 
	 * @param zeichensatz
	 *            der neue Zeichensatz, welcher benutzt werden wird, um sourcen einzulesen.
	 * @throws NullPointerException
	 *             Wenn der Übergabeparameter <code>zeichensatz</code> null ist.
	 */
	public void zeichensatz(Charset zeichensatz) throws NullPointerException {
		this.zeichensatz = Objects.requireNonNull(zeichensatz, "Ich werde den zeichensatz nicht auf null seten!");
	}
	
	/**
	 * Gibt den {@link #zeichensatz} zurück.
	 * 
	 * @return den {@link #zeichensatz}, des <code>TpsSourceLaders</code>
	 */
	public Charset zeichensatz() {
		return zeichensatz;
	}
	
}
