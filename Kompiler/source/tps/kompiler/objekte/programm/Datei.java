package tps.kompiler.objekte.programm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import tps.hilfen.Hilfen;
import tps.hilfen.Regeln;
import tps.kompiler.objekte.fehler.KompilierungsLaufzeitFehler;

public class Datei implements Comparable <Datei> {
	
	public final String ort;
	public final String name;
	private final String[] braucht;
	
	
	
	private Datei(String ort, String name, String[] braucht) {
		this.ort = ort;
		this.name = name;
		this.braucht = braucht;
	}
	
	public Datei erschaffe(String ort, String name, Collection <String> braucht) {
		String[] brauchtArray;
		Objects.requireNonNull(name, "Ich weigere mich jetzt null zu heißen");
		Objects.requireNonNull(ort, "Der ort kann nicht null sein!");
		Regeln.testePfad(ort, new KompilierungsLaufzeitFehler("Das ist kein gültiger ort! (eigentlich darf das hier nicht mehr passieren!"));
		brauchtArray = (braucht == null) ? new String[0] : braucht.toArray(new String[braucht.size()]);
		Arrays.sort(this.braucht, Hilfen.vergleicherKeineNull());
		return new Datei(ort, name, brauchtArray);
	}
	
	
	
	public String[] braucht() {
		return braucht.clone();
	}
	
	public boolean braucht(String testen) {
		return -1 != Arrays.binarySearch(braucht, testen, Hilfen.vergleicherKeineNull());
	}
	
	@Override
	public int compareTo(Datei mit) {
		int ergebnis;
		ergebnis = this.ort.compareTo(mit.ort);
		ergebnis = ergebnis == 0 ? (int) Math.signum(this.braucht.length - mit.braucht.length) : ergebnis;
		ergebnis = ergebnis == 0 ? this.name.compareTo(mit.name) : ergebnis;
		return ergebnis;
	}
	
}
