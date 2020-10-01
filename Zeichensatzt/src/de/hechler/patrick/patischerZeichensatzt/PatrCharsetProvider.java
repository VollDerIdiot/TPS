package de.hechler.patrick.patischerZeichensatzt;

import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import de.hechler.patrick.pzs8b.Pzs8bCharset;

public class PatrCharsetProvider extends CharsetProvider {
	
	private PatrCharset[] charsets = {new Pzs8bCharset() };
	
	@Override
	public Iterator <Charset> charsets() {
		List <Charset> rückgabe = new ArrayList <Charset>();
		for (PatrCharset pCharset : charsets) {
			rückgabe.add(pCharset);
		}
		return rückgabe.iterator();
	}
	
	@Override
	public Charset charsetForName(String charsetName) {
		for (PatrCharset pCharset : charsets) {
			if (pCharset.isNameOrAlias(charsetName)) {
				return pCharset;
			}
		}
		return null;
	}
	
}
