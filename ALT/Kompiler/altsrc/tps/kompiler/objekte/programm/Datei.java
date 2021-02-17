package tps.kompiler.objekte.programm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeSet;

import de.hechler.patrick.tps.hilfen.Hilfen;
import de.hechler.patrick.tps.hilfen.Regeln;
import tps.kompiler.objekte.fehler.KompilierungsLaufzeitFehler;
import tps.kompiler.objekte.programm.sache.Sache;

public class Datei implements Comparable <Datei> {
	
	public final String ort;
	public final String name;
	private final String[] braucht;
	private NavigableSet <Sache> sachen;
	
	
	
	public static Datei erschaffe(String ort, String name, Collection <String> braucht) {
		String[] brauchtArray;
		Objects.requireNonNull(name, "Ich weigere mich jetzt null zu heißen");
		Objects.requireNonNull(ort, "Der ort kann nicht null sein!");
		Regeln.testePfad(ort, new KompilierungsLaufzeitFehler("Das ist kein gültiger ort! (eigentlich darf das hier nicht mehr passieren!"));
		brauchtArray = (braucht == null) ? new String[0] : braucht.toArray(new String[braucht.size()]);
		Arrays.sort(brauchtArray, Hilfen.vergleicherKeineNull());
		return new Datei(ort, name, brauchtArray);
	}
	
	private Datei(String ort, String name, String[] braucht) {
		this.ort = ort;
		this.name = name;
		this.braucht = braucht;
		this.sachen = new TreeSet <Sache>(Hilfen.vergleicherKeineNull());
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
		return ergebnis == 0 ? this.name.compareTo(mit.name) : ergebnis;
	}
	
	public void neueSache(Sache sache) {
		Objects.requireNonNull(sache, "Ich werde keine null-Sache hinzufügen!");
		sachen.add(sache);
	}
	
	public NavigableSet <Sache> sachen() {
		return Collections.unmodifiableNavigableSet(sachen);
	}
	
}
