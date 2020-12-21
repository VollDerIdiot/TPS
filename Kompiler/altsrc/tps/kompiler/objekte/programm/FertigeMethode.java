package tps.kompiler.objekte.programm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class FertigeMethode implements Comparable <FertigeMethode> {
	
	public final UnfertigeMethode methodenKopf;
	public final List <Befehl> inhalt;
	public final boolean konstant;
	
	public FertigeMethode(UnfertigeMethode methodenKopf, boolean konstant, List <Befehl> inhalt) {
		Objects.requireNonNull(inhalt, "Jede fertige methode hat eine BOX und jede BOX hat mindestens einen Befehl! Was soll das: null ist kein befehl!");
		this.methodenKopf = Objects.requireNonNull(methodenKopf, "Mein kopf kann nicht null sein!");
		this.konstant = konstant;
		this.inhalt = Collections.unmodifiableList(new ArrayList <>(inhalt));
	}
	
	
	
	public int compareTo(FertigeMethode mit) {
		return methodenKopf.compareTo(mit.methodenKopf);
	}
	
}
