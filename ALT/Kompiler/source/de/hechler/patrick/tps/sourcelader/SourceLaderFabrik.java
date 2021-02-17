package de.hechler.patrick.tps.sourcelader;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SourceLaderFabrik {
	
	/**
	 * speichert alle bekannten {@link SourceLader} in einer {@link Map}. Der key ist dabei {@link SourceLader#endung}
	 */
	private static Map <String, SourceLader> lader;
	
	
	
	static {
		lader = new HashMap <String, SourceLader>();
		lader.put("tpst", new TPSTSL());
	}
	
	
	
	/**
	 * Gibt zurück, ob es einen {@link SourceLader} mit der {@link SourceLader#endung} {@code dateiendung} gibt oder nicht.
	 * 
	 * @param dateiendung
	 *            die Dateiendung (alles was nach dem Punkt ('.') kommt, aber ohne den Punkt selbst)
	 * @return <code>true</code> wenn es einen {@link SourceLader} gibt, welcher Dateien mit dieser Endung laden kann.
	 */
	public boolean bekannteEndung(String dateiendung) {
		return lader.containsKey(dateiendung);
	}
	
	/**
	 * fügt den {@link SourceLader} {@code neuerLader} zu den {@link #lader}n hinzu, sofern noch kein {@link SourceLader} mit gleicher {@link SourceLader#endung} vorhanden ist.
	 * 
	 * @param neuerLader
	 *            Der hinzuzufügende {@link SourceLader}
	 * @return <code>true</code>, wenn der {@link SourceLader} erfolgreich hinzugefügt wurde <br>
	 *         <code>false</code> wenn es bereits einen {@link SourceLader} mit gleicher {@link SourceLader#endung} gibt.
	 */
	public static boolean neu(SourceLader neuerLader) {
		Objects.requireNonNull(neuerLader, "SourceLader neuerLader");
		if (lader.containsKey(neuerLader.endung)) {
			return false;
		}
		lader.put(neuerLader.endung, neuerLader);
		return true;
	}
	
	/**
	 * Fügt den {@link SourceLader} {@code überschreibe} hinzu und entfernt den alten {@link SourceLader} mit der gleichen Endung. Dieser wird dann zurückgegeben (oder
	 * <code>null</code> wenn es keinen gab).
	 * 
	 * @param überschreibe
	 *            Der neue {@link SourceLader}
	 * @return den alten {@link SourceLader} mit der gleichen {@link SourceLader#endung} wie die von {@code überschreibe}
	 */
	public SourceLader definitfesNeu(SourceLader überschreibe) {
		Objects.requireNonNull(überschreibe, "SourceLader neuerLader");
		return lader.put(überschreibe.endung, überschreibe);
	}
	
	/**
	 * Gibt einen {@link SourceLader} mit der Endung der Datei zurück oder wirft eine {@link NoSuchElementException} wenn es keinen {@link SourceLader} für diese Dateiendung gibt.
	 * <br>
	 * Dieser {@link SourceLader} wurde bereits vorbereitet. ({@link SourceLader#vorbereiten(Charset, File)})
	 * 
	 * @param charset
	 *            Der Zeichensatz, in welchem die Datei geschrieben wurde
	 * @param datei
	 *            Die Datei die der {@link SourceLader} später laden soll
	 * @return Den {@link SourceLader}, der diese Datei laden kann
	 * @throws NoSuchElementException
	 *             Wenn es keinen {@link SourceLader} gibt, der die {@code datei} laden kann. <br>
	 *             Wenn die {@code datei} nicht existiert und kein {@link SourceLader} für den Dateinamen gefunden werden kann wird eine {@link NoSuchElementException} geworfen.
	 * @throws FileNotFoundException
	 *             Wenn die {@code datei} auf keine existierende Datei verweist
	 */
	public static SourceLader lader(Charset charset, File datei) throws NoSuchElementException, FileNotFoundException {
		Objects.requireNonNull(datei, "datei");
		String endung = dateiendung(datei);
		if ( !lader.containsKey(endung)) {
			throw new NoSuchElementException();
		}
		SourceLader erg = lader.get(endung);
		erg.vorbereiten(charset, datei);
		return erg;
	}
	
	/**
	 * Gibt die Dateiendung für diese Datei zurück (dies ist alles hinter dem letztem '.')
	 * 
	 * @param datei
	 *            Die Datei für die die Endung gefunden werden soll.
	 * @return Die Dateiendung der {@code datei}
	 * @implSpec {@code datei.getName().substring(datei.getName().lastIndexOf('.') + 1)}
	 */
	public static String dateiendung(File datei) {
		String zw = datei.getName();
		return zw.substring(zw.lastIndexOf('.') + 1);
	}
	
	/**
	 * Gibt die Dateiendung für eine Datei mit diesem Namen zurück (dies ist alles hinter dem letztem '.')
	 * 
	 * @param dateiName
	 *            Der Name der Datei
	 * @return Die Dateiendung für Dateien mit dem Namen {@code dateiName}
	 * @see #dateiendung(File)
	 */
	public static String dateiendung(String dateiName) {
		return dateiName.substring(dateiName.lastIndexOf('.') + 1);
	}
	
}
