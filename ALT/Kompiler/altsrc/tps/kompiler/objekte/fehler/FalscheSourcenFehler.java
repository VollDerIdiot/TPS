package tps.kompiler.objekte.fehler;


public class FalscheSourcenFehler extends KompilierungsFehler {
	
	private static final long serialVersionUID = -2531451069425880654L;
	
	
	public FalscheSourcenFehler() {
		super();
	}
	
	public FalscheSourcenFehler(String nachricht) {
		super(nachricht);
	}
	
	/**
	 * Wenn man etwas erwartet und etwas anderes erhalten hat kann man diesen Fehler werfen.
	 * 
	 * @implSpec <code>super("habe '" + erwartet + "' erwartet und '" + erhalten + "' erhalten!");</code>
	 * @param erwartet
	 *            Das was man erwartet hat.
	 * @param erhalten
	 *            Das was statt dem erwarteten gekommen ist.
	 */
	public FalscheSourcenFehler(String erwartet, String erhalten) {
		super("habe '" + erwartet + "' erwartet und '" + erhalten + "' erhalten!");
	}
	
}
