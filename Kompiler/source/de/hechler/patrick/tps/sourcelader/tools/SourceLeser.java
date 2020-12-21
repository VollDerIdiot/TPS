package de.hechler.patrick.tps.sourcelader.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import de.hechler.patrick.tps.tools.Stapel;

public class SourceLeser {
	
	private final Charset charset;
	private Stapel <Element> log;
	private RandomAccessFile input;
	private long index;
	
	
	
	public SourceLeser(Charset charset, File datei) throws FileNotFoundException {
		this.charset = charset;
		this.log = new Stapel <>(new Element[0]);
		this.input = new RandomAccessFile(datei, "r");
	}
	
	
	
	public void zurück(int anzahl) throws IOException {
		for (; anzahl > 0; anzahl -- ) {
			Element weg = log.pop();
			index = weg.startIndex;
		}
		input.seek(index);
	}
	
	public void zurück() throws IOException {
		Element weg = log.pop();
		index = weg.startIndex;
		input.seek(index);
	}
	
	public boolean hatNächsteZeile() throws IOException {
		long i = index;
		try {
			nächsteZeile();
		} catch (NoSuchElementException e) {
			return false;
		}
		input.seek(i);
		return true;
	}
	
	public boolean hatNächstes() throws IOException {
		long i = index;
		try {
			nächstes();
		} catch (NoSuchElementException e) {
			return false;
		}
		input.seek(i);
		return true;
	}
	
	public String nächstes() throws IOException, NoSuchElementException {
		byte[] bytes = new byte[64];
		int index = -1;
		int i;
		int anz = input.read(bytes);
		List <char[]> alle = new ArrayList <>();
		char[] chars = new String(bytes, 0, anz, charset).toCharArray();
		alle.add(chars);
		for (i = 0; i < chars.length; i ++ ) {
			if (chars[i] > ' ') {
				break;
			}
		}
		for (; i < chars.length; i ++ ) {
			if (chars[i] <= ' ') {
				index = i;
				if (i != chars.length - 1) {
					alle.remove(0);
					alle.add(Arrays.copyOf(chars, i + 1));
				}
				break;
			}
		}
		while (index == -1) {
			if (anz == 0) {
				input.seek(this.index);
				throw new NoSuchElementException();
			}
			anz = input.read(bytes);
			char[] neue = new String(bytes, 0, anz, charset).toCharArray();
			alle.add(neue);
			for (i = 0; i < neue.length; i ++ ) {
				if (neue[i] <= ' ') {
					index = i;
					if (i != chars.length - 1) {
						alle.remove(alle.size() - 1);
						alle.add(Arrays.copyOf(chars, i + 1));
					}
					break;
				}
			}
		}
		StringBuilder bau = new StringBuilder();
		alle.forEach(add -> bau.append(add));
		String erg = bau.toString();
		Element neu = new Element(erg, this.index);
		log.push(neu);
		input.seek(neu.bis());
		return erg.trim();
	}
	
	public String nächsteZeile() throws IOException, NoSuchElementException {
		byte[] bytes = new byte[64];
		int index = -1;
		int i;
		int anz = input.read(bytes);
		List <char[]> alle = new ArrayList <>();
		char[] chars = new String(bytes, 0, anz, charset).toCharArray();
		alle.add(chars);
		for (i = 0; i < chars.length; i ++ ) {
			if (chars[i] != '\r' && chars[i] != '\n') {
				break;
			}
		}
		for (; i < chars.length; i ++ ) {
			if (chars[i] == '\r' || chars[i] == '\n') {
				index = i;
				if (i != chars.length - 1) {
					alle.remove(0);
					alle.add(Arrays.copyOf(chars, i + 1));
				}
				break;
			}
		}
		while (index == -1) {
			if (anz == 0) {
				input.seek(this.index);
				throw new NoSuchElementException();
			}
			anz = input.read(bytes);
			chars = new String(bytes, 0, anz, charset).toCharArray();
			alle.add(chars);
			for (i = 0; i < chars.length; i ++ ) {
				if (chars[i] == '\r' || chars[i] == '\n') {
					index = i;
					if (i != chars.length - 1) {
						alle.remove(alle.size() - 1);
						alle.add(Arrays.copyOf(chars, i + 1));
					}
					break;
				}
			}
		}
		StringBuilder bau = new StringBuilder();
		alle.forEach(add -> bau.append(add));
		String erg = bau.toString();
		Element neu = new Element(erg, this.index);
		log.push(neu);
		input.seek(neu.bis());
		return erg.trim();
	}
	
	private class Element {
		
//		private String wert;
		private long startIndex;
		private int len;
		
		
		
		private Element() {
			this(null, 0);
		}
		
		private Element(String wert) {
			this(wert, 0);
		}
		
		private Element(long start) {
			this(null, start);
		}
		
		private Element(String wert, long start) {
//			this.wert = wert.trim();
			this.startIndex = start;
			this.len = wert.getBytes(charset).length;
		}
		
		
		
		private long bis() {
			return startIndex + len;
		}
		
	}
	
}
