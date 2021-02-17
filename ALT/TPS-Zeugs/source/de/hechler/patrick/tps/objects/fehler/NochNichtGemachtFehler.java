package de.hechler.patrick.tps.objects.fehler;

public class NochNichtGemachtFehler extends RuntimeException {
	
	private static final long serialVersionUID = -5545477388619106764L;
	
	
	public NochNichtGemachtFehler() {
		super(Thread.currentThread().getStackTrace()[2].getMethodName() + " aus " + Thread.currentThread().getStackTrace()[2].getClassName() + " wurde wohl noch nicht gemacht!");
	}
	
	public NochNichtGemachtFehler(String nachricht) {
		super(nachricht);
	}
	
}
