package tps.kompiler.objekte.fehler;


public class KompilierungsLaufzeitFehler extends RuntimeException {
	
	private static final long serialVersionUID = -2667241610772305216L;
	
	
	
	public KompilierungsLaufzeitFehler() {
		super();
	}
	
	public KompilierungsLaufzeitFehler(String message) {
		super(message);
	}
	
}
