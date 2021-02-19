package de.hechler.patrick.tps.interpreter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import java.util.Set;

import de.hechler.patrick.tps.fehler.InterpretierungsFehler;
import de.hechler.patrick.tps.interpreter.hilfen.AnordnungInterface;

public interface FehlersuchenInterpreter extends Interpreter {
	
	public static final int UNBBEKANNT                         = 0b00000000000000000000000000000001;
	public static final int GETEILT_DURCH_NULL                 = 0b00000000000000000000000000000010;
	public static final int FALSCHE_BENUTZER_EINGABE           = 0b00000000000000000000000000000100;
	public static final int NEGATIVE_REGISTER_ANSPRACHE        = 0b00000000000000000000000000001000;
	public static final int NEGATIVE_BEFEHL_ANSPRACHE          = 0b00000000000000000000000000010000;
	public static final int Zu_WENIGE_BEFEHLE                  = 0b00000000000000000000000000100000;
	public static final int ZU_WENIGE_REGISTER                 = 0b00000000000000000000000001000000;
	public static final int ZU_KLEINES_REGISTER                = 0b00000000000000000000000010000000;
	public static final int LEERER_STAPEL_SPRUNG               = 0b00000000000000000000000100000000;
	public static final int ZU_GROẞER_STAPEL                   = 0b00000000000000000000001000000000;
	public static final int BEREICHSENDE_KLEINER_BEREICHSSTART = 0b00000000000000000000010000000000;
	public static final int KEIN_FEHLER                        = 0b10000000000000000000000000000000;
	
	
	
	boolean ignoriertStoppPunkte();
	
	void ignoriereStoppPunkte(boolean ignoriereStopper);
	
	int[] stoppPunkte();
	
	Set <Integer> stoppPunkteSet();
	
	void stoppPunkt(int neuerStopper) throws IllegalArgumentException;
	
	boolean machtFehlerStoppung();
	
	void fehlerStoppen(boolean stoppendeFehler);
	
	int version();
	
	int stapelGröße();
	
	int stapelMaxGröße();
	
	int registerAnzahl();
	
	void schreibeRegister(int register, int wert) throws IllegalArgumentException;
	
	int leseRegister(int register) throws IllegalArgumentException;
	
	int anzahlAnordnungen();
	
	AnordnungInterface anordnungVon(int satz) throws IllegalArgumentException;
	
	void springeZu(int ziel) throws IllegalArgumentException;
	
	void rufeAuf(int ziel) throws IllegalArgumentException;
	
	int status();
	
	void status(int neu);
	
	int letzterFehlerArt();
	
	int letzterFehlerBefehl();
	
	int letzterFehlerZusatzInfo();
	
	void stoppe();
	
	boolean gestoppt();
	
	/**
	 * führt einfach mal so die übergebene Anordnung durch. danach geht es wie gewohnt weiter. <br>
	 * Es kann sein, dass die Rückgabe der {@link #nächstes()} Methode nicht stimmt, da ein geheZurück oder springeZu oder rufeAuf ausgeführt wurde.
	 * 
	 * @param einfachMalSo
	 *            wird einfach mal so ausgeführt
	 */
	void zwischendurch(AnordnungInterface einfachMalSo);
	
	/**
	 * führt sofort einen geheZurück Befehl aus und gibt die {@link AnordnungInterface} zurück, zu welcher zurückgesprungen wurde.
	 * 
	 * @return die Anordnung zu welcher zu zurückgesprungen wurde.
	 */
	AnordnungInterface erzwingeZurückgehen();
	
	/**
	 * gibt die Anordnung, welche als nächstes ausgeführt wird zurück.
	 * 
	 * @return die Anordnung, welche als nächstes ausgeführt wird.
	 * @throws NoSuchElementException
	 *             wenn bereits alles ausgeführt wurde.
	 */
	AnordnungInterface nächstes() throws NoSuchElementException;
	
	/**
	 * führt eine Anordnung aus und gibt die {@link #nächstes()} Anordnung zurück.
	 * 
	 * @return die Anordnung, welche als nächstes ausgeführt wird
	 * @throws IllegalStateException
	 *             wenn bereits alles ausgeführt wurde.
	 */
	AnordnungInterface macheSchritt() throws IllegalStateException;
	
	/**
	 * führt so lange alle Anordnungen durch, bis ein gehe zurück durchgeführt wird oder ein Stopper aktiviert wird. Dann wird getoppt und die {@link #nächstes()} Anordnung wird zurückgegeben.
	 * 
	 * @return die Anordnung, welche als nächstes ausgeführt wird
	 * @throws IllegalStateException
	 *             wenn bereits alles ausgeführt wurde.
	 */
	AnordnungInterface macheBisRaus() throws IllegalStateException;
	
	/**
	 * führt so lange alle Anordnungen durch, bis ein Stopper aktiviert wird. Dann wird getoppt und die {@link #nächstes()} Anordnung wird zurückgegeben.
	 * 
	 * @return die Anordnung, welche als nächstes ausgeführt wird
	 * @throws IllegalStateException
	 *             wenn bereits alles ausgeführt wurde.
	 */
	AnordnungInterface macheBisStopper() throws IllegalStateException;
	
	/**
	 * bereitet sich darauf vor den Eingang zu interpretieren
	 * 
	 * @param eingang
	 * @param zeichensatz
	 * @throws IOException
	 * @throws InterpretierungsFehler
	 */
	void lade(InputStream eingang, Charset zeichensatz) throws IOException, InterpretierungsFehler;
	
	/**
	 * @see #lade(InputStream, Charset)
	 * @param datei
	 * @param zeichensatz
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws InterpretierungsFehler
	 */
	default void lade(File datei, Charset zeichensatz) throws FileNotFoundException, IOException, InterpretierungsFehler {
		lade(new FileInputStream(datei), zeichensatz);
	}
	
}
