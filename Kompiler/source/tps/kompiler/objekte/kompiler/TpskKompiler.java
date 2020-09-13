package tps.kompiler.objekte.kompiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.nio.charset.Charset;

import tps.kompiler.objekte.fehler.NochNichtGemachtFehler;

public class TpskKompiler extends Kompiler {
	
	public TpskKompiler(OutputStream out, Charset zeichensatz) {
		super(out, zeichensatz);
	}
	
	public TpskKompiler(OutputStream out) {
		super(out);
	}
	
	public TpskKompiler(File datei, Charset zeichensatz) throws FileNotFoundException {
		super(datei, zeichensatz);
	}
	
	public TpskKompiler(File datei) throws FileNotFoundException {
		super(datei);
	}
	
	
	
	@Override
	protected void kompilierungsImplementation(String dateiName, Charset zeichensatz) {
		// TODO Auto-generated method stub
		
		throw new NochNichtGemachtFehler();
	}
	
}
