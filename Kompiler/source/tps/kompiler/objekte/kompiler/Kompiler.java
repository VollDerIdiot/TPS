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
import tps.kompiler.objekte.code.Datei;
import tps.kompiler.objekte.code.sache.Sache;
import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.objects.archiv.TPSArchivSchreiber;

public abstract class Kompiler extends Object {
	
	protected static final String WHITESPACE = "[ \t]";
	protected static final String WHITESPACE_BELIBIGE = WHITESPACE + "*";
	protected static final String WHITESPACE_MEHRERE = WHITESPACE + "+";
	protected static final String TABULATOR = "\t";
	protected static final String ZEILENUMSPRUNG = System.lineSeparator();
	private static final String KOMPILIERTE_DATEI_ENDUNG = ".tkp"; // Tolles-Kompiliertes-Programm
	
	
	
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
	 * Liest den SourceCode ein
	 */
	protected Scanner sourceLeser;
	
	
	
	public Kompiler(OutputStream out, Charset zeichensatz) {
		archivSchreiber = new TPSArchivSchreiber(out, zeichensatz);
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
	
	
	
	public void kompiliere(File source) throws IOException, KompilierungsFehler {
		kompiliere(source, new Pzs8bCharset());
	}
	
	public void kompiliere(File source, Charset zeichensatz) throws IOException, KompilierungsFehler {
		Objects.requireNonNull(source, "Ich kann nicht aus nichts lesen!");
		Objects.requireNonNull(zeichensatz, "Ich kann nichtmit null lesen!");
		sourceLeser = new Scanner(source, zeichensatz);
		bauen = null;
		sache = null;
		kompilierungsImplementation(filtereNamenHeraus(source.getName()) + KOMPILIERTE_DATEI_ENDUNG);
		archivSchreiber.closeEntry();
		sourceLeser.close();
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
	 * Der {@link #sourceLeser} wurde bereits neu initialisiert, aber es wurde noch kein neuer Eintrag im {@link #archivSchreiber} gemacht, {@link #bauen} und {@link #sache} wurde
	 * auf null gesetzt wenn diese Methode aufgerufen wird. <br>
	 * Nachdem die Methode Aufgerufen wurde, wird der aktuelle Eintrag des {@link #archivSchreiber}s geschlossen.
	 * 
	 * @param dateiName
	 *            Der Dateiname ohne die Dateiendung
	 * @throws IOException
	 * @throws KompilierungsFehler
	 */
	protected abstract void kompilierungsImplementation(String dateiName) throws KompilierungsFehler, IOException;
	
	/**
	 * Prüft, ob der Übergebene Pfad gültig ist. Wenn ja, wird dieser zurückgegeben. wenn nicht, dann wird ein <code>FalscheSourcenFehler</code> geworfen.
	 * 
	 * @param testePfad
	 *            Der zu testende Pfad
	 * @return Den <code>testePfad</code>, wenn dieser akzeptabel ist. Ansonsten wird ein <code>FalscheSourcenFehler</code> geworfen
	 * @throws FalscheSourcenFehler
	 *             wird geworfen, wenn der Pfad ungültig ist
	 */
	protected String testePfad(String testePfad) throws FalscheSourcenFehler {
		if (testePfad.indexOf((int) ':') == -1 || testePfad.indexOf((int) '*') == -1 || testePfad.indexOf((int) '?') == -1 || testePfad.indexOf((int) '"') == -1
				|| testePfad.indexOf((int) '<') == -1 || testePfad.indexOf((int) '>') == -1 || testePfad.indexOf((int) '|') == -1) {
			throw new FalscheSourcenFehler("Ungültiger Name: '" + testePfad + "'");
		}
		return testePfad;
	}
	
	protected void testeZeilenende() {
		sourceLeser.skip(WHITESPACE_BELIBIGE);
		sourceLeser.skip(ZEILENUMSPRUNG);
	}
	
}
