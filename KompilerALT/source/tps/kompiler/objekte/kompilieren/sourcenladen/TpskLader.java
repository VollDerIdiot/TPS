package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.nio.charset.Charset;

import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.fehler.NochNichtGemachtFehler;

public class TpskLader extends TpsSourceLader {
	
	public TpskLader(Charset zeichensatz) {
		super(zeichensatz);
	}
	
	public TpskLader() {
		super();
	}
	
	
	
	@Override
	protected void ladeImplementierung(String name) throws KompilierungsFehler {
		// TODO Auto-generated method stub
		
		throw new NochNichtGemachtFehler();
	}
	
	@Override
	public String endung() {
		return "tpsk";
	}
	
}
