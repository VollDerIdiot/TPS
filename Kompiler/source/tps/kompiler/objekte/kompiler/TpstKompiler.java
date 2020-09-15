package tps.kompiler.objekte.kompiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.fehler.NochNichtGemachtFehler;


public class TpstKompiler extends Kompiler {
	
	public TpstKompiler(OutputStream out, Charset zeichensatz) {
		super(out, zeichensatz);
	}
	
	public TpstKompiler(OutputStream out) {
		super(out);
	}
	
	public TpstKompiler(File datei, Charset zeichensatz) throws FileNotFoundException {
		super(datei, zeichensatz);
	}
	
	public TpstKompiler(File datei) throws FileNotFoundException {
		super(datei);
	}
	
	@Override
	protected void ladeImplementierung(String dateiName) throws KompilierungsFehler {
		// TODO Auto-generated method stub
		
		throw new NochNichtGemachtFehler();
	}
	
	@Override
	protected void bereiteKompilierungVor() throws KompilierungsFehler {
		// TODO Auto-generated method stub
		
		throw new NochNichtGemachtFehler();
	}
	
	@Override
	protected void kompiliereImplementierung(Charset zeichensatz) throws IOException {
		// TODO Auto-generated method stub
		
		throw new NochNichtGemachtFehler();
	}
	
}
