package tps.kompiler.objekte.kompiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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
import tps.objects.archiv.TPSArchivSchreiber;

public abstract class Kompiler extends Object {
	
	protected static final String WHITESPACE;
	protected static final String WHITESPACE_BELIBIGE;
	protected static final String WHITESPACE_MEHRERE;
	protected static final String TABULATOR;
	protected static final String ZEILENUMSPRUNG;
	private static final String KOMPILIERTE_DATEI_ENDUNG;
	
	
	
	static {
		WHITESPACE = "[ \t]";
		WHITESPACE_BELIBIGE = WHITESPACE + "*";
		WHITESPACE_MEHRERE = WHITESPACE + "+";
		TABULATOR = "\t";
		ZEILENUMSPRUNG = System.lineSeparator();
		KOMPILIERTE_DATEI_ENDUNG = ".tpk"; // Tolles-Kompiliertes-Programm
	}
	
	
	
	/**
	 * wird benutzt, um das TPSArchiv zu erstellen
	 */
	protected final TPSArchivSchreiber archivSchreiber;
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
	
	public Kompiler(OutputStream out, Charset zeichensatz) {
		archivSchreiber = new TPSArchivSchreiber(out, zeichensatz);
		this.zeichensatz = zeichensatz;
	}
	
	public Kompiler(OutputStream out) {
		this(out, new Pzs8bCharset());
	}
	
	public Kompiler(File datei, Charset zeichensatz) throws FileNotFoundException {
		this(new FileOutputStream(datei), zeichensatz);
	}
	
	public Kompiler(File datei) throws FileNotFoundException {
		this(new FileOutputStream(datei), new Pzs8bCharset());
	}
	
	
	public void lade(File source) throws IOException, KompilierungsFehler {
		lade(source, new Pzs8bCharset());
	}
	
	public void lade(File source, Charset zeichensatz) throws IOException, KompilierungsFehler {
		Objects.requireNonNull(source, "Ich kann nicht aus nichts lesen!");
		Objects.requireNonNull(zeichensatz, "Ich kann nichtmit null lesen!");
		bauen = null;
		sache = null;
		sourceLeser = new Leser(new Scanner(source, zeichensatz));
		ladeImplementierung(filtereNamenHeraus(source.getName()) + KOMPILIERTE_DATEI_ENDUNG);
		archivSchreiber.closeEntry();
	}
	
	/**
	 * Kompiliert die vorher geladenen Dateien und macht diese unveränderbar.
	 * 
	 * @throws KompilierungsFehler
	 * @throws IOException
	 */
	public void kompiliere() throws KompilierungsFehler, IOException {
		bereiteKompilierungVor();
		kompiliereImplementierung(zeichensatz);
	}
	
	private String filtereNamenHeraus(String kompletterName) {
		int index;
		index = kompletterName.lastIndexOf((int) '.');
		if (index == -1) {
			return kompletterName;
		}
		return kompletterName.substring(0, index);
	}
	
	/**
	 * Die Datei wurden bereits in {@link #sourceLeser} eingelesen, aber es wurde noch kein neuer Eintrag im {@link #archivSchreiber} gemacht, {@link #bauen} und {@link #sache}
	 * wurde auf null gesetzt wenn diese Methode aufgerufen wird. <br>
	 * Nachdem die Methode Aufgerufen wurde, wird der aktuelle Eintrag des {@link #archivSchreiber}s geschlossen.
	 * 
	 * @param dateiName
	 *            Der Dateiname ohne die Dateiendung
	 * @throws KompilierungsFehler
	 */
	protected abstract void ladeImplementierung(String dateiName) throws KompilierungsFehler;
	
	/**
	 * Wird direkt vor {@link #kompiliereImplementierung(Charset)} ausgeführt. <br>
	 * Dies ist um Zeugs zu machen, welches nicht wirklich zur Kompilierung gehört, aber trotzdem davor getan werden muss. <br>
	 * Hier werden unter anderem alle <code>Datei</code>en konstant gemacht.
	 */
	protected abstract void bereiteKompilierungVor() throws KompilierungsFehler;
	
	/**
	 * Davor wurde {@link #ladeImplementierung(String)} und {@link #bereiteKompilierungVor()} ausgeführt. <br>
	 * Hier wird alles eingelesene kompiliert und in dem {@link #archivSchreiber} gespeichert.
	 * 
	 * @param zeichensatz
	 *            Strings werden mit diesem Zeichensatz in bytes umgewandelt.
	 * @throws IOException
	 */
	protected abstract void kompiliereImplementierung(Charset zeichensatz) throws IOException;
	
	protected void teste(String... testen) throws FalscheSourcenFehler {
		for (String teste : testen) {
			if ( !teste.equals(sourceLeser.nächstes())) {
				throw new FalscheSourcenFehler(teste);
			}
		}
	}
	
	
	protected String testePfad(String testen) throws FalscheSourcenFehler {
		return Regeln.testePfad(testen, new FalscheSourcenFehler("'" + testen + "' ist kein gültiger Pfad!"));
	}
	
}
