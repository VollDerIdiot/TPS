package de.hechler.patrick.tps.antlr.objects;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;

import de.hechler.patrick.tps.antlr.InterpreterInterface;
import de.hechler.patrick.tps.antlr.fehler.WrongInputException;
import de.hechler.patrick.tps.interpreter.Interpreter;


public interface Parameter extends Serializable {
	
	boolean istZeichenKette();
	
	boolean istKonstante();
	
	boolean ergebniszahl();
	
	boolean zwischenzahl();
	
	Long zahl();
	
	long zahl(InterpreterInterface interpret);
	
	String toString();
	
	String toString(Interpreter interpret);
	
	public static Parameter lade(InputStream in) throws IOException, WrongInputException {
		int art = in.read();
		switch (art) {
		case 1:
			return ladeZahl(in);
		case 2:
			return ladeZeichenKette(in);
		case 0:
			try {
				return ladeMitObjectStream(new ObjectInputStream(in));
			} catch (ClassNotFoundException e) {
			}
		default:
			throw new WrongInputException("art!=(1,2,0)   art=" + art);
		}
	}
	
	private static Parameter ladeMitObjectStream(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		return (Parameter) ois.readObject();
	}
	
	private static Parameter ladeZeichenKette(InputStream in) throws IOException, WrongInputException {
		int len = in.read();
		len |= in.read() << 8;
		len |= in.read() << 16;
		len |= in.read() << 24;
		byte[] bytes = new byte[len];
		len = in.read(bytes);
		if (len != bytes.length) throw new WrongInputException("estimated len=" + bytes.length + " but len=" + len);
		String str = new String(bytes, StandardCharsets.UTF_8);
		return new ZeichenKette(str);
	}
	
	private static Parameter ladeZahl(InputStream in) throws IOException, WrongInputException {
		int art = in.read();
		switch (art) {
		case 1: {
			long z = in.read();
			z |= in.read() << 8;
			z |= in.read() << 16;
			z |= in.read() << 24;
			z |= in.read() << 32;
			z |= in.read() << 40;
			z |= in.read() << 48;
			int letztes = in.read();
			if (letztes == -1) throw new IOException("reached EOF to early!");
			z |= letztes << 56;
			return new Zahl(z);
		}
		case 2:
			return new Zahl(true);
		case 3:
			return new Zahl(false);
		default:
			throw new WrongInputException("ladeZahl(): art!=(1,2,3)   art=" + art);
		}
	}
	
	public static void speichern(OutputStream out, Parameter save) throws IOException {
		if (save instanceof Zahl) {
			out.write(1);
			speichernZahl(out, (Zahl) save);
		} else if (save instanceof ZeichenKette) {
			out.write(2);
			speichernZeichenKette(out, (ZeichenKette) save);
		} else {
			out.write(0);
			speicherMitObjectSteam(new ObjectOutputStream(out), save);
		}
	}
	
	private static void speicherMitObjectSteam(ObjectOutputStream oos, Parameter save) throws IOException {
		oos.writeObject(save);
	}
	
	private static void speichernZeichenKette(OutputStream out, ZeichenKette zk) throws IOException {
		int len = zk.wert.length();
		out.write(len & 0xFF);
		out.write( (len >>> 8) & 0xFF);
		out.write( (len >>> 16) & 0xFF);
		out.write( (len >>> 24) & 0xFF);
		out.write(zk.wert.getBytes(StandardCharsets.UTF_8));
	}
	
	private static void speichernZahl(OutputStream out, Zahl z) throws IOException {
		int art = z.erg == null ? 1 : (z.erg ? 2 : 3);
		out.write(art);
		if (z.erg != null) return;
		out.write((int) (z.zahl & 0xFF));
		out.write((int) ( (z.zahl >>> 8) & 0xFF));
		out.write((int) ( (z.zahl >>> 16) & 0xFF));
		out.write((int) ( (z.zahl >>> 24) & 0xFF));
		out.write((int) ( (z.zahl >>> 32) & 0xFF));
		out.write((int) ( (z.zahl >>> 40) & 0xFF));
		out.write((int) ( (z.zahl >>> 48) & 0xFF));
		out.write((int) ( (z.zahl >>> 56) & 0xFF));
	}
	
}