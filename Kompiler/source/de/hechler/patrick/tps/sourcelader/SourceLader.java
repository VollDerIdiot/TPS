package de.hechler.patrick.tps.sourcelader;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;

import de.hechler.patrick.tps.sourcelader.tools.SourceLeser;

public abstract class SourceLader {
	
	public final String endung;
	private Charset charset;
	protected SourceLeser leser;
	
	
	
	public SourceLader(String dateiEndung) {
		this.endung = dateiEndung.contains(".") ? dateiEndung.substring(dateiEndung.lastIndexOf('.') + 1) : dateiEndung;
	}
	
	
	
	public void prepare(Charset charset, File datei) throws FileNotFoundException {
		this.charset = charset;
		leser = new SourceLeser(charset, datei);
	}
	
	
}
