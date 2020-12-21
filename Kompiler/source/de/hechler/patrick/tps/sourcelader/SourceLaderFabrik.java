package de.hechler.patrick.tps.sourcelader;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

public class SourceLaderFabrik {
	
	private static Map <String, SourceLader> lader;
	
	
	
	static {
		lader = new HashMap <String, SourceLader>();
		// TODO put default SouorceLader in Map
	}
	
	
	public static boolean neu(SourceLader neuerLader) {
		Objects.requireNonNull(neuerLader, "SourceLader neuerLader");
		if (lader.containsKey(neuerLader.endung)) {
			return false;
		}
		lader.put(neuerLader.endung, neuerLader);
		return true;
	}
	
	public static SourceLader lader(String endung, Charset charset, File datei) throws NoSuchElementException, FileNotFoundException {
		Objects.requireNonNull(endung, "endung");
		if (!lader.containsKey(endung)) {
			throw new NoSuchElementException();
		}
		SourceLader erg = lader.get(endung);
		erg.prepare(charset, datei);
		return erg;
	}
	
}
