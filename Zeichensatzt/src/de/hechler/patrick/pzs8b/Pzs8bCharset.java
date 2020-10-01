package de.hechler.patrick.pzs8b;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

import de.hechler.patrick.patischerZeichensatzt.PatrCharset;

public class Pzs8bCharset extends PatrCharset {
	
	private static final String NAME = "PZS8B";
	private static final String[] ALIAS = new String[] {"PZS-8B", "PZB8", "PZS-8" };
	
	public Pzs8bCharset() {
		super(NAME, ALIAS, null);
	}
	
	@Override
	public CharsetDecoder newDecoder() {
		return new Pzs8bDecoder(this);
	}
	
	@Override
	public CharsetEncoder newEncoder() {
		return new Pzs8bEncoder(this);
	}
	
	public static String getStaticName() {
		return NAME;
	}
	
	public static String[] getStaticAlias() {
		return ALIAS.clone();
	}
	
}
