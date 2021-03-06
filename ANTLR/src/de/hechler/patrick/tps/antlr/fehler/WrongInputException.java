package de.hechler.patrick.tps.antlr.fehler;


public class WrongInputException extends Exception {
	
	/** UID */
	private static final long serialVersionUID = -368710833373506001L;
	
	public WrongInputException(String message) {
		super(message);
	}
	
	public WrongInputException(Throwable cause) {
		super(cause);
	}
	
}
