package tps.kompiler.objekte.kompilieren;

import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.ServiceLoader;

import tps.kompiler.objekte.kompilieren.sourcenladen.TpsSourceLader;

public class BekannteSourcenLader {
	
	private static TpsSourceLader[] bekannte;
	
	
	
	static {
		TpsSourceLader[] standards;
		TpsSourceLader[] andere;
		standards = new TpsSourceLader[0];
		andere = lade();
		bekannte = new TpsSourceLader[standards.length + andere.length];
		System.arraycopy(standards, 0, bekannte, 0, standards.length);
		System.arraycopy(andere, 0, bekannte, standards.length, andere.length);
	}
	
	
	
	/**
	 * Ein Konstruktor den niemals aufgerufen werden wird.
	 */
	private BekannteSourcenLader() {
	}
	
	
	
	private static TpsSourceLader[] lade() {
		List <TpsSourceLader> ergebnis;
		Iterator <TpsSourceLader> iterator;
		iterator = ServiceLoader.load(TpsSourceLader.class).iterator();
		ergebnis = new ArrayList <TpsSourceLader>();
		while (iterator.hasNext()) {
			try {
				ergebnis.add(Objects.requireNonNull(iterator.next(), "Ich weigere mich dies zu akzeptieren!"));
			} catch (Error e) {
				e.printStackTrace();
			}
		}
		return ergebnis.toArray(new TpsSourceLader[ergebnis.size()]);
	}
	
	/**
	 * Iteriert durch alle bekannten <code>TpsSourceLader</code>. <br>
	 * Es wird der erste passende <code>TpsSourceLader</code>, welcher gefunden wurde zurückgegeben.
	 * 
	 * @param dateiname
	 *            Der name der zu ladenden Datei oder <code>null</code> wenn keiner mit passender Dateiendung gefunden wurde
	 * @return den gefunden <code>TpsSourceLader</code> oder <code>null</code>
	 */
	public static TpsSourceLader erhalte(File datei, Charset zeichensatz) {
		return erhalte(datei.getName(), zeichensatz);
	}
	
	/**
	 * Iteriert durch alle bekannten <code>TpsSourceLader</code>. <br>
	 * Es wird der erste passende <code>TpsSourceLader</code>, welcher gefunden wurde zurückgegeben.
	 * 
	 * @param dateiname
	 *            Der name der zu ladenden Datei oder <code>null</code> wenn keiner mit passender Dateiendung gefunden wurde
	 * @return den gefunden <code>TpsSourceLader</code> oder <code>null</code>
	 */
	public static TpsSourceLader erhalte(String dateiname, Charset zeichensatz) {
		Objects.requireNonNull(dateiname, "Ich kann das nicht mit null machen!");
		dateiname = dateiname.substring(dateiname.lastIndexOf('.'));
		for (TpsSourceLader testen : bekannte) {
			if (dateiname.equals(testen.endung())) {
				testen.zeichensatz(zeichensatz);
				return testen;
			}
		}
		return null;
	}
	
	/**
	 * Iteriert durch alle bekannten <code>TpsSourceLader</code>. <br>
	 * Es wird der erste passende <code>TpsSourceLader</code>, welcher gefunden wurde zurückgegeben.
	 * 
	 * @param dateiname
	 *            Der name der zu ladenden Datei oder <code>null</code> wenn keiner mit passender Dateiendung gefunden wurde
	 * @return den gefunden <code>TpsSourceLader</code> oder <code>null</code>
	 */
	public static TpsSourceLader erhalte(File datei) {
		return erhalte(datei.getName());
	}
	
	/**
	 * Iteriert durch alle bekannten <code>TpsSourceLader</code>. <br>
	 * Es wird der erste passende <code>TpsSourceLader</code>, welcher gefunden wurde zurückgegeben.
	 * 
	 * @param dateiname
	 *            Der name der zu ladenden Datei oder <code>null</code> wenn keiner mit passender Dateiendung gefunden wurde
	 * @return den gefunden <code>TpsSourceLader</code> oder <code>null</code>
	 */
	public static TpsSourceLader erhalte(String dateiname) {
		Objects.requireNonNull(dateiname, "Ich kann das nicht mit null machen!");
		dateiname = dateiname.substring(dateiname.lastIndexOf('.'));
		for (TpsSourceLader testen : bekannte) {
			if (dateiname.equals(testen.endung())) {
				return testen;
			}
		}
		return null;
	}
	
	/**
	 * Fügt den <code>TpsSourceLader neu</code> zu den bekannten <code>TpsSourceLader</code>n hinzu, sofern dieser nicht schon vorher bekannt ist.
	 * 
	 * @param neu
	 *            der <code>TpsSourceLader</code>, welcher hinzugefügt werden soll.
	 * @return <code>true</code>, wenn der <code>TpsSourceLader</code> davor unbekannt war. Wenn nicht wird <code>false</code> zurückgegeben.
	 */
	public static boolean neuerLader(TpsSourceLader neu) {
		Objects.requireNonNull(neu, "Ich weigere mich den neuen null TpsSourceLader zu akzeptieren!");
		for (TpsSourceLader dieser : bekannte) {
			if (dieser.equals(neu)) {
				return false;
			}
		}
		bekannte = Arrays.copyOf(bekannte, bekannte.length + 1);
		bekannte[bekannte.length - 1] = neu;
		return true;
	}
	
}
