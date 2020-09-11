package tps.objects.archiv;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipInputStream;

import de.hechler.patrick.pzs8b.Pzs8bCharset;

public class TPSArchivLeser extends ZipInputStream {
	
	public TPSArchivLeser(InputStream in) {
		super(in, new Pzs8bCharset());
	}
	
	public TPSArchivLeser(InputStream in, Charset zeichensatz) {
		super(in, zeichensatz);
	}
	
	public TPSArchivLeser(File datei) throws FileNotFoundException {
		super(new FileInputStream(datei), new Pzs8bCharset());
	}
	
	public TPSArchivLeser(File datei, Charset zeichensatz) throws FileNotFoundException {
		super(new FileInputStream(datei), zeichensatz);
	}
	
}
