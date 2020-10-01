package de.hechler.patrick.patischerZeichensatzt;

import java.nio.charset.CharsetEncoder;

public abstract class PatrCharsetEncoder extends CharsetEncoder {

	protected PatrCharsetEncoder(PatrCharset cs, float averageBytesPerChar, float maxBytesPerChar) {
		super(cs, averageBytesPerChar, maxBytesPerChar);
	}
	
}
