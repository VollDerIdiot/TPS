package tps.hilfen;

import java.util.Comparator;
import java.util.Objects;

public class Hilfen {
	
	/**
	 * Ein Konstruktor der Niemals aufgerufen werden wird.
	 */
	private Hilfen() {
	}
	
	
	
	public static <V extends Comparable <V>> Comparator <V> vergleicherAkzeptiertNull() {
		return (V vergleiche, V mit) -> {
			if (vergleiche == null) {
				return mit == null ? 0 : 1;
			}
			if (mit == null) {
				return -1;
			}
			return vergleiche.compareTo(mit);
		};
	}
	
	public static <V extends Comparable <V>> Comparator <V> vergleicherKeineNull() {
		return (V vergleiche, V mit) -> {
			Objects.requireNonNull(vergleiche, "Ich vergleiche nicht mit null!");
			Objects.requireNonNull(mit, "Ich vergleiche nicht mit null!");
			return vergleiche.compareTo(mit);
		};
	}
	
	public static byte[] zuFeld(int umwandeln) {
		byte[] ergebnis;
		ergebnis = new byte[4];
		ergebnis[0] = (byte) (umwandeln >> 24);
		ergebnis[1] = (byte) (umwandeln >> 16);
		ergebnis[2] = (byte) (umwandeln >> 8);
		ergebnis[3] = (byte) (umwandeln);
		return ergebnis;
	}
	
	
	public static int zuInt(byte[] umwandeln) {
		int ergebnis = 0;
		ergebnis += (umwandeln[0] & 0xFF) << 24;
		ergebnis += (umwandeln[1] & 0xFF) << 16;
		ergebnis += (umwandeln[2] & 0xFF) << 8;
		ergebnis += (umwandeln[3] & 0xFF);
		return ergebnis;
	}
	
}
