package de.hechler.patrick.pzs8b;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CoderResult;

import de.hechler.patrick.patischerZeichensatzt.PatrCharset;
import de.hechler.patrick.patischerZeichensatzt.PatrCharsetEncoder;
import de.hechler.patrick.pzs8b.zeichen.Pzs8bZeichen;

public class Pzs8bEncoder extends PatrCharsetEncoder {
	
	protected Pzs8bEncoder(PatrCharset cs) {
		super(cs, 1.0f, 1.0f);
	}
	
	@Override
	protected CoderResult encodeLoop(CharBuffer in, ByteBuffer out) {
		try {
			while (true) {
				char b = in.get();
				byte c = (byte) Pzs8bZeichen.getIndex(b);
				out.put(c);
			}
		} catch (BufferUnderflowException e) {
			return CoderResult.UNDERFLOW;
		}
	}
	
}
