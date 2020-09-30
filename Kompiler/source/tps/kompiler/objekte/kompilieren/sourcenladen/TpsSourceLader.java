package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.Scanner;

import de.hechler.patrick.pzs8b.Pzs8bCharset;
import tps.hilfen.Regeln;
import tps.kompiler.objekte.code.Datei;
import tps.kompiler.objekte.code.sache.Sache;
import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.hilfen.Leser;

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
	protected Datei bauen;
	/**
	 * Die Sache, die gerade gebaut wird, um diese dann der Datei hinzuzufügen.
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
	
	
	
	public Datei lade(File source) throws IOException, KompilierungsFehler {
		return lade(source, null);
	}
	
	public Datei lade(File source, Charset zeichensatz) throws IOException, KompilierungsFehler {
		Objects.requireNonNull(source, "Ich kann nicht aus nichts lesen!");
		bauen = null;
		sache = null;
		sourceLeser = new Leser(new Scanner(source, zeichensatz == null ? this.zeichensatz : zeichensatz));
		ladeImplementierung();
		return bauen;
	}
	
	/**
	 * Die Datei wurden bereits in {@link #sourceLeser} eingelesen, aber es wurde noch kein neuer Eintrag im {@link #archivSchreiber} gemacht, {@link #bauen} und {@link #sache}
	 * wurde auf null gesetzt wenn diese Methode aufgerufen wird. <br>
	 * Nachdem die Methode Aufgerufen wurde, muss die dort geladene Datei in der variable {@link #bauen} sein!
	 * 
	 * @param dateiName
	 *            Der Dateiname ohne die Dateiendung
	 * @throws KompilierungsFehler
	 */
	protected abstract void ladeImplementierung() throws KompilierungsFehler;
	
	/**
	 * @implSpec lässt den {@link #bereiteKompilierungVor()} whitespace skippen und liest die nächsteZeile ein: <br>
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
		return Regeln.testePfad(testen, new FalscheSourcenFehler("'" + testen + "' ist kein gültiger Pfad!"));
	}
	
}
