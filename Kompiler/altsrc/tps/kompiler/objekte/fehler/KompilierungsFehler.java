package tps.kompiler.objekte.fehler;


public class KompilierungsFehler extends Exception {
	
	private static final long serialVersionUID = -8444339609372650418L;
	
	
	
	public KompilierungsFehler() {
		super();
	}
	
	public KompilierungsFehler(String nachricht) {
		super(nachricht);
	}
	
}
