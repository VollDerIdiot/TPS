package de.hechler.patrick.patischerZeichensatzt;

import java.nio.charset.CharsetDecoder;

public abstract class PatrCharsetDecoder extends CharsetDecoder {
	
	public PatrCharsetDecoder(PatrCharset cs, float averageCharsPerByte, float maxCharsPerByte) {
		super(cs, averageCharsPerByte, maxCharsPerByte);
	}
	
}
