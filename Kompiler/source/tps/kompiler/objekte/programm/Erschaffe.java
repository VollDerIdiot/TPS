package tps.kompiler.objekte.programm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import tps.kompiler.objekte.konstanten.Sichtbarkeit;

public class Erschaffe implements Comparable <Erschaffe> {
	
	public final Sichtbarkeit sicht;
	/**
	 * Eine unveränderbare Liste, welche die Übergabeparameter speichert
	 */
	public final List <Variable> parameter;
	/**
	 * Eine unveränderbare Liste, welche die befehle speichert
	 */
	public final List <Befehl> box;
	
	public Erschaffe(List <Variable> parameter, Sichtbarkeit sicht, List <Befehl> box) {
		Objects.requireNonNull(box, "Ich kann nicht keine Befehle haben!");
		this.parameter = Collections.unmodifiableList(parameter == null ? Collections.emptyList() : new ArrayList <>(parameter));
		this.sicht = sicht == null ? Sichtbarkeit.offen : sicht;
		this.box = Collections.unmodifiableList(new ArrayList <>(box));
	}
	
	@Override
	public int compareTo(Erschaffe mit) {
		int ergebnis;
		int runde;
		ergebnis = (int) Math.signum(parameter.size() - mit.parameter.size());
		if (ergebnis != 0) {
			return ergebnis;
		}
		for (runde = 0; runde < parameter.size(); runde ++ ) {
			ergebnis = parameter.get(runde).compareTo(mit.parameter.get(runde));
			if (ergebnis != 0) {
				return ergebnis;
			}
		}
		return 0;
	}
	
}
