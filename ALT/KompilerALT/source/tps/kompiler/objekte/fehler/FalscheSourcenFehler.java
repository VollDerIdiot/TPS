package tps.kompiler.objekte.fehler;


public class FalscheSourcenFehler extends KompilierungsFehler {
	
	private static final long serialVersionUID = -2531451069425880654L;
	
	
	public FalscheSourcenFehler() {
		super();
	}
	
	public FalscheSourcenFehler(String nachricht) {
		super(nachricht);
	}
	
	public FalscheSourcenFehler(String erwartet, String erhalten) {
		super("habe '" + erwartet + "' erwartet und '" + erhalten + "' erhalten!");
	}
	
}
