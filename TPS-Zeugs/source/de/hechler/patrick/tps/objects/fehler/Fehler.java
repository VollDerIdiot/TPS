package de.hechler.patrick.tps.objects.fehler;


public class Fehler extends Exception {
	
	private String message;
	
	private static final long serialVersionUID = -2436951703599637989L;
	
	
	public Fehler(String message) {
		super(message);
		this.message = message;
	}
	
	
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
}
