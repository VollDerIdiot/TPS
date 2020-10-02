package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.nio.charset.Charset;
import java.util.Objects;

import tps.hilfen.Regeln;
import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.hilfen.Leser;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Datei;
import tps.kompiler.objekte.programm.Datentyp;
import tps.objects.fehler.NochNichtGemachtFehler;

public abstract class TpsSourceLader {
	
	private static final String PFAD_ANFANG;
	private static final String PFAD_ENDE;
	
	
	
	static {
		PFAD_ANFANG = "|:";
		PFAD_ENDE = ":>";
	}
	
	
	
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
	
	
	
	public TpsSourceLader() {
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
	 * 
	 * @param name
	 *            Der name der Datei. Wird benötigt, wenn die {@link #datei} initialisiert wird, um ihren name zu setzen.
	 * @throws KompilierungsFehler
	 *             Wenn etwas schief gelaufen ist oder, z.B. wenn es fehlerhafte Sourcen gibt.
	 */
	protected abstract void lade(String name) throws KompilierungsFehler;
	
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
	
	protected void teste(String... testen) throws FalscheSourcenFehler {
		String zwischen;
		for (String dieser : testen) {
			zwischen = sourceLeser.nächstes();
			if ( !zwischen.equals(dieser)) {
				throw new FalscheSourcenFehler(dieser, zwischen);
			}
		}
	}
	
	/**
	 * Gibt alles von {@link #PFAD_ANFANG} bis zu {@link #PFAD_ENDE} in der gleichen Zeile zurück. <br>
	 * Wenn dies nicht möglich ist wird ein <code>FalscheSourcenFehler</code> geworfen.
	 * 
	 * @return den nächsten Pfad
	 * @throws FalscheSourcenFehler
	 *             wenn in der nächsten Zeile des {@link #sourceLeser}s kein Pfad enthalten ist!
	 */
	protected String lesePfad() throws FalscheSourcenFehler {
		String ergebnis;
		int anfang;
		int ende;
		ergebnis = sourceLeser.nächsteZeile();
		anfang = ergebnis.indexOf(PFAD_ANFANG);
		if (anfang == -1) {
			if ( !ergebnis.isBlank()) {
				throw new FalscheSourcenFehler("'" + ergebnis + "' ist kein Pfad! (ein Pfad beginnt mit '" + PFAD_ANFANG + "' und höhrt mit '" + PFAD_ENDE + "' auf!");
			}
			return lesePfad();
		}
		ende = ergebnis.lastIndexOf(PFAD_ENDE);
		ergebnis = ergebnis.substring(anfang, ende);
		return Regeln.testePfad(ergebnis, new FalscheSourcenFehler("'" + ergebnis + "' ist kein Pfad! Ein Pfad darf keine ungüligen Zeichen enthalten!"));
	}
	
	/**
	 * List einen {@code Datentyp} nach der jeweiligen TpsSprache ein und gibt diesen dann zurück.<br>
	 * Eigentlich nur eine Hilfe um es einzuteilen. <br>
	 * Die Unterklasse wird nicht gezwungen diese Methode zu Implementieren und/oder zu verwenden.
	 * 
	 * @return Den eingelesenes {@code Datentyp}
	 * @throws KompilierungsFehler
	 *             Wenn etwas schiefgelaufen ist
	 */
	protected abstract Datentyp lesedatentyp() throws KompilierungsFehler;
	
	/**
	 * List eine {@code Sichtbarkeit} nach der jeweiligen TpsSprache ein und gibt dann die dazugehörige Konstante zurück.<br>
	 * Eigentlich nur eine Hilfe um es einzuteilen. <br>
	 * Die Unterklasse wird nicht gezwungen diese Methode zu Implementieren und/oder zu verwenden.
	 * 
	 * @return Die eingelesene Sichtbarkeit
	 * @throws KompilierungsFehler
	 *             Wenn etwas schiefgelaufen ist
	 */
	protected abstract Sichtbarkeit leseSichtbarkeit() throws KompilierungsFehler;
	
}
