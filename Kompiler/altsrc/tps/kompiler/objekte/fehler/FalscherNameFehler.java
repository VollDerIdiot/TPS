package tps.kompiler.objekte.fehler;


public class FalscherNameFehler extends FalscheSourcenFehler {
	
	private static final long serialVersionUID = 3377704514970274301L;
	
	
	public FalscherNameFehler(String name) {
		super("'" + "' ist kein gültger Name!");
	}
	
}
