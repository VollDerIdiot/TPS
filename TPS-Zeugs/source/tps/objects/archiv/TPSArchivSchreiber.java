package tps.objects.archiv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipOutputStream;

import de.hechler.patrick.pzs8b.Pzs8bCharset;


public class TPSArchivSchreiber extends ZipOutputStream {
	
	public TPSArchivSchreiber(OutputStream out) {
		this(out, new Pzs8bCharset());
	}
	
	public TPSArchivSchreiber(OutputStream out, Charset zeichensatz) {
		super(out, zeichensatz);
		super.setLevel(0);
	}
	
	public TPSArchivSchreiber(File file) throws FileNotFoundException {
		this(new FileOutputStream(file), new Pzs8bCharset());
	}
	
	public TPSArchivSchreiber(File file, Charset zeichensatz) throws FileNotFoundException {
		this(new FileOutputStream(file), zeichensatz);
	}
	
}
