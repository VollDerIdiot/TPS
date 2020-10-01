package de.hechler.patrick.pzs8b;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

import de.hechler.patrick.pzs8b.zeichen.Pzs8bZeichen;

public class Pzs8bDecoder extends CharsetDecoder {
	
	public Pzs8bDecoder(Pzs8bCharset pzs8bZeichenSatzt) {
		super(pzs8bZeichenSatzt, 1.0f, 1.0f);
	}
	
	@Override
	protected CoderResult decodeLoop(ByteBuffer in, CharBuffer out) {
		try {
			while (true) {
				byte b = in.get();
				char c = Pzs8bZeichen.getChar( ((int) b) & 0xFF);
				out.put(c);
			}
		} catch (BufferUnderflowException e) {
			return CoderResult.UNDERFLOW;
		}
	}
	
}
