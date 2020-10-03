package de.hechler.patrick.patischerZeichensatzt.zeichenKette;


public abstract class UnfertigeZeichenKette implements ZeichenKetteInterface {
	
	@Override
	public int length() {
		return größe();
	}
	
	@Override
	public char charAt(int index) {
		return getZeichen(index).getZeichen();
	}
	
	@Override
	public CharSequence subSequence(int start, int ende) {
		return unterKette(start, ende);
	}
	
	@Override
	public abstract UnfertigeZeichenKette clone();
	
}
