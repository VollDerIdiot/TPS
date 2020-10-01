package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.Scanner;

import de.hechler.patrick.pzs8b.Pzs8bCharset;
import tps.hilfen.Regeln;
import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.hilfen.Leser;
import tps.kompiler.objekte.programm.Datei;
import tps.kompiler.objekte.programm.sache.Sache;

public abstract class TpsSourceLader {
	
	protected static final String WHITESPACE;
	protected static final String WHITESPACE_BELIBIGE;
	protected static final String WHITESPACE_MEHRERE;
	protected static final String TABULATOR;
	protected static final String ZEILENUMSPRUNG;
	
	
	
	static {
		WHITESPACE = "[ \t]";
		WHITESPACE_BELIBIGE = WHITESPACE + "*";
		WHITESPACE_MEHRERE = WHITESPACE + "+";
		TABULATOR = "\t";
		ZEILENUMSPRUNG = System.lineSeparator();
	}
	
	
	
	/**
	 * Die aktuell zu bauende Datei
	 */
	protected Datei datei;
	/**
	 * Die Sache, die gerade gebaut wird, um diese dann der Datei hinzuzuf�gen.
	 */
	protected Sache sache;
	/**
	 * Die Sourcen in einer <code>List<Zeile></code> <br>
	 * Standardweise nicht initialisiert. rufe {@link #ladeZeilen()} zum initialisieren auf. <br>
	 * Danach ist allerdings {@link #scanner} am Dateiende angelangt. <br>
	 * Wenn {@link #scanner} vorher nicht am Dateianfang war, wird ein teil nicht in der {@link #sourceLeser} liste sein.
	 */
	protected Leser sourceLeser;
	/**
	 * Der Zeichensatz des {@link #archivSchreiber}s
	 */
	private Charset zeichensatz;
	
	public TpsSourceLader(Charset zeichensatz) {
		this.zeichensatz = zeichensatz;
	}
	
	public TpsSourceLader() {
		this(new Pzs8bCharset());
	}
	
	
	
	public Datei lade(File source) throws KompilierungsFehler {
		return lade(source, null);
	}
	
	public Datei lade(File source, Charset zeichensatz) throws KompilierungsFehler {
		Objects.requireNonNull(source, "Ich kann nicht aus nichts lesen!");
		datei = null;
		sache = null;
		try {
			sourceLeser = new Leser(new Scanner(source, zeichensatz == null ? this.zeichensatz : zeichensatz));
		} catch (IOException e) {
			throw new KompilierungsFehler("Der sourceLeser wollte sich nicht initialisieren lassen: " + e);
		}
		ladeImplementierung(filtereNamenHeraus(source));
		return datei;
	}
	
	/**
	 * Die Datei wurden bereits in {@link #sourceLeser} eingelesen, aber es wurde noch kein neuer Eintrag im {@link #archivSchreiber} gemacht, {@link #datei} und {@link #sache}
	 * wurde auf null gesetzt wenn diese Methode aufgerufen wird. <br>
	 * Nachdem die Methode Aufgerufen wurde, muss die dort geladene Datei in der variable {@link #datei} sein!
	 * 
	 * @param dateiName
	 *            Der Dateiname ohne die Dateiendung
	 * @throws KompilierungsFehler
	 */
	protected abstract void ladeImplementierung(String name) throws KompilierungsFehler;
	
	/**
	 * @implSpec l�sst den {@link #bereiteKompilierungVor()} whitespace skippen und liest die nächsteZeile ein: <br>
	 *           Wenn diese leer ist, dann ruft die Methdoe sich selbst auf. <br>
	 *           Wenn nicht, dann wird diese zurückgegeben.
	 * @return
	 */
	protected String lesePfad() {
		String ergebnis;
		sourceLeser.überspringe(WHITESPACE_BELIBIGE);
		ergebnis = sourceLeser.nächsteZeile();
		return (ergebnis.isBlank()) ? lesePfad() : ergebnis;
	}
	
	protected void teste(String... testen) throws FalscheSourcenFehler {
		for (String teste : testen) {
			String zwischen;
			zwischen = sourceLeser.nächstes();
			if ( !teste.equals(zwischen)) {
				throw new FalscheSourcenFehler(teste, zwischen);
			}
		}
	}
	
	protected String testePfad(String testen) throws FalscheSourcenFehler {
		return Regeln.testePfad(testen, new FalscheSourcenFehler("'" + testen + "' ist kein g�ltiger Pfad!"));
	}
	
	private String filtereNamenHeraus(File source) {
		String ergebnis;
		ergebnis = source.getName();
		if (ergebnis.endsWith(endung())) {
			return ergebnis.substring(0, ergebnis.length() - (endung().length() + 1));
		} else {
			return ergebnis;
		}
	}
	
	/**
	 * Gibt die Dateiendung des Sourcecodes zurück. <br>
	 * Dies entspricht allem, was nach dem letztem '.' kommt (ohne den '.' selbst!).
	 * 
	 * @return Die Endung der nicht kompilierten Datei
	 */
	public abstract String endung();
	
	public Charset zeichensatz() {
		return zeichensatz;
	}
	
}
