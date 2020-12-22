package de.hechler.patrick.tps.sourcelader;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;

import de.hechler.patrick.tps.objekte.Datei;
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
	 * Die {@link Datei}, welche aktuell geladen wird
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
		this.endung = dateiEndung.contains(".") ? dateiEndung.substring(dateiEndung.lastIndexOf('.') + 1) : dateiEndung;
	}
	
	
	
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
	
	
}
