package de.hechler.patrick.tps.sourcelader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;

import de.hechler.patrick.tps.objects.fehler.Fehler;
import de.hechler.patrick.tps.objekte.Datei;
import de.hechler.patrick.tps.objekte.fehler.FalscheSourcenFehler;
import de.hechler.patrick.tps.objekte.fehler.KompilierungsFehler;
import de.hechler.patrick.tps.objekte.sache.Sache;
import de.hechler.patrick.tps.sourcelader.tools.SourceLeser;

public abstract class SourceLader {
	
	/**
	 * Die Dateiendung des {@link SourceLader}s
	 */
	public final String endung;
	/**
	 * Wird benutzt, um die Sourcen einzulesen.
	 */
	protected SourceLeser leser;
	/**
	 * Die {@link Datei}, welche aktuell geladen wird. <br>
	 * Dies ist auch der Rückgabewert von {@link #lade()}
	 */
	protected Datei datei;
	/**
	 * Die {@link Sache}, welche noch gebaut wird, bevor sie zu {@link #datei} hinzugefügt wird.
	 */
	protected Sache sache;
	
	
	/**
	 * Erstellt einen neuen {@link SourceLader} mit der {@link #endung} {@code dateiEndung}
	 * 
	 * @param dateiEndung
	 *            die {@link #endung} des {@link SourceLader}s
	 */
	public SourceLader(String dateiEndung) {
		this.endung = SourceLaderFabrik.dateiendung(dateiEndung);
	}
	
	
	/**
	 * Lädt die Datei, welche beim Vorbereiten übergeben wurde. Diese wurde im {@link #leser} gespeichert
	 * 
	 * @return Die geladene Datei, welche in {@link #datei} gespeichert wurde
	 * @throws IOException
	 *             Wenn es einen Fehler beim laden der Datei gibt.
	 * @throws KompilierungsFehler
	 *             Wenn es einen fehler beim Kompilieren gibt meistens in Form eines {@link FalscheSourcenFehler}
	 * @see #datei
	 * @see #vorbereiten(Charset, File)
	 */
	public Datei lade() throws IOException, KompilierungsFehler {
		this.datei = new Datei();
		leser.neustart();
		ladeDatei();
		return datei;
	}
	
	/**
	 * Lädt die datei, welche beim {@link #vorbereiten(Charset, File)} übergeben wurde und im {@link #leser} gespeichert wurde.
	 * 
	 * @throws IOException
	 * @throws KompilierungsFehler
	 */
	protected abstract void ladeDatei() throws IOException, KompilierungsFehler;
	
	/**
	 * Bereitet den {@link SourceLader} darauf vor die {@link File} {@code datei} mit dem {@link Charset} {@code charset} zu laden.
	 * 
	 * @param charset
	 *            der {@link Charset} der {@code datei}
	 * @param datei
	 *            die zu ladende Datei
	 * @throws FileNotFoundException
	 *             falls die {@code datei} auf keine existierende Datei verweist
	 */
	public void vorbereiten(Charset charset, File datei) throws FileNotFoundException {
		this.leser = new SourceLeser(charset, datei);
	}
	
	
	protected <F extends Throwable> void erwarte(F fehler, String... erwartungen) throws F, NoSuchElementException, IOException {
		for (String erwarten : erwartungen) {
			String erhalten = leser.nächstes();
			if ( !erhalten.equals(erwarten)) {
				StackTraceElement[] zw = new Throwable().getStackTrace();
				fehler.setStackTrace(zw);
				if (fehler instanceof Fehler) {
					String msg = fehler.getMessage() == null ? "" : fehler.getMessage();
					msg += "erwartet: '" + erwarten + "' erhalten: '" + erhalten + "'";
					((Fehler) fehler).setMessage(msg);
				} else {
					System.err.println("erwartet: '" + erwarten + "' erhalten: '" + erhalten + "'");
				}
				throw fehler;
			}
		}
	}
	
}
