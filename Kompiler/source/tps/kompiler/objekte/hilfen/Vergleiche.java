package tps.kompiler.objekte.hilfen;

import java.util.Comparator;
import java.util.Objects;

import tps.kompiler.objekte.programm.Datei;

public class Vergleiche {
	
	public static final Comparator <Datei> DATEI;
	public static final Comparator <String> STRING;
	
	
	
	static {
		DATEI = (Datei vergleiche, Datei mit) -> {
			return vergleiche.compareTo(mit);
		};
		STRING = (String vergleiche, String mit) -> {
			return Objects.requireNonNull(vergleiche, "Dies ist nicht vergleichbar!").compareTo(Objects.requireNonNull(mit, "Dies ist nicht vergleichbar!"));
		};
	}
	
}
