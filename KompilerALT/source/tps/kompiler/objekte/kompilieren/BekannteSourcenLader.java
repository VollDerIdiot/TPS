package tps.kompiler.objekte.kompilieren;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import de.hechler.patrick.pzs8b.Pzs8bCharset;
import tps.kompiler.objekte.kompilieren.sourcenladen.TpsSourceLader;
import tps.kompiler.objekte.kompilieren.sourcenladen.TpskLader;
import tps.kompiler.objekte.kompilieren.sourcenladen.TpstLader;

public class BekannteSourcenLader {
	
	private static TpsSourceLader[] bekannte;
	
	
	
	static {
		Pzs8bCharset pzs8b;
		pzs8b = new Pzs8bCharset();
		bekannte = new TpsSourceLader[6];
		bekannte[0] = new TpstLader();
		bekannte[1] = new TpstLader(pzs8b);
		bekannte[2] = new TpstLader(StandardCharsets.UTF_8);
		bekannte[3] = new TpskLader();
		bekannte[4] = new TpskLader(pzs8b);
		bekannte[5] = new TpskLader(StandardCharsets.UTF_8);
	}
	
	
	
	/**
	 * Ein Konstruktor den niemals aufgerufen werden wird.
	 */
	private BekannteSourcenLader() {
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
			if (dateiname.equals(testen.endung()) && zeichensatz.equals(testen.zeichensatz())) {
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
	
	/**
	 * Fügt alle neuen <code>TpsSourceLader</code> hinzu.
	 * 
	 * @param neue
	 *            die ab jetzt bekannten <code>TpsSourceLader</code>
	 * @return Die Anzahl an neuen <code>TpsSourceLader</code>n
	 * @implSpec Es wird in ein <code>TpsSourceLader[]</code> umgewandelt und dann mit der {@link #neueLader(TpsSourceLader[])} Methode hinzugefügt
	 */
	public static int neueLader(Collection <TpsSourceLader> neue) {
		return neueLader(neue.toArray(new TpsSourceLader[neue.size()]));
	}
	
	/**
	 * Fügt alle neuen <code>TpsSourceLader</code> hinzu.
	 * 
	 * @param neue
	 *            die ab jetzt bekannten <code>TpsSourceLader</code>
	 * @return Die Anzahl an neuen <code>TpsSourceLader</code>n
	 */
	public static int neueLader(TpsSourceLader[] neue) {
		int ergebnis = 0;
		for (TpsSourceLader neu : neue) {
			ergebnis += neuerLader(neu) ? 1 : 0;
		}
		return ergebnis;
	}
	
}
