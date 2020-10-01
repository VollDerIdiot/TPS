package tps.hilfen;

public class Hilfen {
	
	/**
	 * Ein Konstruktor der Niemals aufgerufen werden wird.
	 */
	private Hilfen() {
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
