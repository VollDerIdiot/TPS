package de.hechler.patrick.tps.sourcelader;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
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
		// TODO put default SouorceLader in Map
	}
	
	
	
	/**
	 * fügt den {@link SourceLader} {@code neuerLader} zu den {@link #lader}n hinzu, sofern noch kein {@link SourceLader} mit gleicher {@link SourceLader#endung} vorhanden ist.
	 * 
	 * @param neuerLader
	 *            Der hinzuzufügende {@link SourceLader}
	 * @return <code>true</code>, wenn der lader erfolgreich hinzugefügt wurde <br>
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
	 * 
	 * @param charset
	 * @param datei
	 * @return
	 * @throws NoSuchElementException
	 * @throws FileNotFoundException
	 */
	public static SourceLader lader(Charset charset, File datei) throws NoSuchElementException, FileNotFoundException {
		Objects.requireNonNull(datei, "datei");
		String endung = datei.getName();
		endung = endung.substring(endung.lastIndexOf('.')+1);
		if ( !lader.containsKey(endung)) {
			throw new NoSuchElementException();
		}
		SourceLader erg = lader.get(endung);
		erg.vorbereiten(charset, datei);
		return erg;
	}
	
}
