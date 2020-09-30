package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.io.FileNotFoundException;
import java.nio.charset.Charset;

import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.fehler.NochNichtGemachtFehler;

public class TpskLader extends TpsSourceLader {
	
	public TpskLader(Charset zeichensatz) {
		super(zeichensatz);
	}
	
	public TpskLader() throws FileNotFoundException {
		super();
	}
	
	
	
	@Override
	protected void ladeImplementierung() throws KompilierungsFehler {
		// TODO Auto-generated method stub
		
		throw new NochNichtGemachtFehler();
	}
	
}
