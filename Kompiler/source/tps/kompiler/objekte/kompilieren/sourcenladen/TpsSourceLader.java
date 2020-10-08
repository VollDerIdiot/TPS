package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.Set;

import tps.hilfen.Regeln;
import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.hilfen.Leser;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Datei;
import tps.kompiler.objekte.programm.Datentyp;
import tps.kompiler.objekte.programm.sache.Sache;

/**
 * Eine Abstrakte Klasse, welche jeweils einen TPS-Code in einen einheitlichen Zwischencode Dateiweise umwandelt, diese Dateien wurden allerdings noch nicht auf Zeugs geprüft,
 * welches Wissen aus anderen Dateien erfordert.
 * 
 * @author Patrick
 *
 */
public abstract class TpsSourceLader {
	
	private static final String ZEICHENKETTE_START;
	private static final String ZEICHENKETTE_ENDE;
	private static final String ZEICHENKETTE_ENDE_ESCAPER;
	private static final Object ZEICHENKETTE_ENDE_SPRING;
	private static final String ZEICHEN_START;
	private static final String ZEICHEN_ENDE;
	private static final String NEGATIVE_ZAHL_START;
	private static final String HEXADEZIMAL_ZAHL_START;
	private static final String DEZIMAL_ZAHL_START;
	private static final String BINÄR_ZAHL_START;
	/**
	 * Das Startsymbol für einen Pfad
	 */
	private static final String PFAD_ANFANG;
	/**
	 * Das Endsymbol für einen Pfad
	 */
	private static final String PFAD_ENDE;
	
	
	
	static {
		ZEICHENKETTE_START = "ZK:";
		ZEICHENKETTE_ENDE = ">E>";
		ZEICHENKETTE_ENDE_ESCAPER = "\\>E>";
		ZEICHENKETTE_ENDE_SPRING = ".*\\\\>E>";
		ZEICHEN_START = "Z:";
		ZEICHEN_ENDE = ">E>";
		NEGATIVE_ZAHL_START = "NEG:";
		HEXADEZIMAL_ZAHL_START = "HEX:";
		DEZIMAL_ZAHL_START = "DEC:";
		BINÄR_ZAHL_START = "BIN:";
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
	/**
	 * Die aktuell zu bauende Sache in der {@link #datei} oder {@code null}. <br>
	 * Wird vor jedem {@link #lade()} auf {@code null} gesetzt.
	 */
	protected Sache sache;
	
	
	
	/**
	 * Erstellt einen neuen {@link TpsSourceLader}
	 */
	public TpsSourceLader() {
	}
	
	
	
	public Datei ladeDatei(File datei) throws FileNotFoundException, KompilierungsFehler {
		Objects.requireNonNull(datei, "Ich kann keine null Datei laden!");
		return ladeDatei(new FileInputStream(datei), datei.getName());
	}
	
	private Datei ladeDatei(InputStream eingag, String dateiName) throws KompilierungsFehler {
		Objects.requireNonNull(eingag, "Ich kann keine Datei aus einem null-Stream laden!");
		sourceLeser = new Leser(eingag, zeichensatz);
		datei = null;
		sache = null;
		lade(dateiName);
		return datei;
	}
	
	
	
	/**
	 * Gibt alle Namen die in dieser TPS-Sprache nicht verwendet werden dürfen zurück
	 * 
	 * @return Die Namen, die man nicht benutzen darf.
	 */
	public abstract Set <String> besetzteNamen();
	
	
	/**
	 * Gibt die Dateiendung des <code>TpsSourceLader</code>s zurück. <br>
	 * Anhand dieser wird dann entschieden, ob dieser Kompiler für die Datei geeignet ist. Das Ergebnis der {@link #zeichensatz()} Methode wird auch dafür benutzt.
	 * 
	 * @return Die Dateiendung, welche Dateien haben, die von diesem <code>TpsSourceLader</code> geladen werden können. <br>
	 *         Die Dateiendung ist alles was nach dem letztem '.' Zeichen kommt (also ohne das '.' Zeichen selbst)
	 */
	public abstract String endung();
	
	/**
	 * Lädt die aktuelle Datei aus dem {@link #sourceLeser} ein. <br>
	 * {@link #datei} und {@link #sache} sind auf {@code null} gesetzt, wenn diese Methode aufgerufen wird.
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
	
	/**
	 * Testet, ob das was in {@code testen} steht auch in der gleichen Reihenfolge übergeben wird wenn man immer wieder im {@link #sourceLeser} die {@link Leser#nächstes()} Methode
	 * aufruft. Nachdem die Methode aufgerufen wurde, wurde der stand des {@link #sourceLeser}s um entsprechend viel nach vorne verschoben.
	 * 
	 * @param testen
	 *            Die zu testende {@link String}s
	 * @throws FalscheSourcenFehler
	 *             Wenn nicht alle {@link String}s aus {@code testen} in genau so in der Reihenfolge kamen wird ein
	 *             {@link FalscheSourcenFehler#FalscheSourcenFehler(String, String)} geworfen.
	 */
	protected void teste(String... testen) throws FalscheSourcenFehler {
		String zwischen;
		for (String dieser : testen) {
			zwischen = sourceLeser.nächstes();
			if ( !dieser.equals(zwischen)) {
				throw new FalscheSourcenFehler(dieser, zwischen);
			}
		}
	}
	
	protected String leseZeichenKette() throws FalscheSourcenFehler {
		String ergebnis;
		StringBuilder spring;
		int anzahlEscapes = 0;
		int start;
		int ende;
		int index;
		ergebnis = sourceLeser.nächsteZeile();
		if (ergebnis == null) {
			throw new FalscheSourcenFehler("Ich habe eine Zeichenkette erwartet, aber nichts erhalten, da der sourceLeser fertig gelesen hat.");
		}
		start = ergebnis.indexOf(ZEICHENKETTE_START) + ZEICHEN_START.length();
		index = ergebnis.indexOf(ZEICHENKETTE_ENDE_ESCAPER);
		if ( -1 != index) {
			String zwischen = ergebnis.substring(index + ZEICHENKETTE_ENDE_ESCAPER.length());
			ende = 0;
			anzahlEscapes ++ ;
			index = zwischen.indexOf(ZEICHENKETTE_ENDE_ESCAPER);
			while ( -1 != index) {
				anzahlEscapes ++ ;
				ende += index + ZEICHENKETTE_ENDE_ESCAPER.length();
				zwischen = ergebnis.substring(index + ZEICHENKETTE_ENDE_ESCAPER.length());
				index = zwischen.indexOf(ZEICHENKETTE_ENDE_ESCAPER);
			}
			ende += zwischen.indexOf(ZEICHENKETTE_ENDE_ESCAPER);
		} else {
			ende = ergebnis.indexOf(ZEICHENKETTE_ENDE);
		}
		ergebnis = ergebnis.substring(start, ende);
		spring = new StringBuilder();
		for (; anzahlEscapes > 0; anzahlEscapes -- ) {
			spring.append(ZEICHENKETTE_ENDE_SPRING);
		}
		sourceLeser.zurück();
		sourceLeser.überspringe(spring.append(ZEICHENKETTE_ENDE).toString());
		return ergebnis;
	}
	
	/**
	 * Gibt alles von {@link #PFAD_ANFANG} bis zu {@link #PFAD_ENDE} in der gleichen Zeile zurück. <br>
	 * Wenn dies nicht möglich ist oder vor dem {@link #PFAD_ANFANG} etwas steht, wird ein <code>FalscheSourcenFehler</code> geworfen.
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
		if (ende == -1) {
			throw new FalscheSourcenFehler("Ein Pfad muss das EndZeichen'" + PFAD_ENDE + "' enthalten!");
		}
		if ( !ergebnis.substring(0, anfang).isBlank()) {
			throw new FalscheSourcenFehler("Vor dem Pfad sollte nichts mehr stehen, wenn diese Methode aufgerufen wird! ('" + ergebnis.substring(0, anfang)
					+ "' steht vor dem StartZeichen'" + PFAD_ANFANG + "')");
		}
		if (ergebnis.length() > ende + 1 && !ergebnis.substring(ende + 2).isBlank()) {
			sourceLeser.zurück();
			sourceLeser.überspringe(".*" + PFAD_ENDE);
		}
		ergebnis = ergebnis.substring(anfang + 2, ende);
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
	protected abstract Datentyp leseDatentyp() throws KompilierungsFehler;
	
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
