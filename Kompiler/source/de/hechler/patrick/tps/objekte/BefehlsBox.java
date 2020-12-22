package de.hechler.patrick.tps.objekte;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import de.hechler.patrick.tps.objekte.befehle.Befehl;

public class BefehlsBox {
	
	private List <Befehl> befehle;
	
	
	public BefehlsBox() {
		befehle = new ArrayList <>();
	}
	
	
	
	public void neu(Befehl befehl) {
		Objects.requireNonNull(befehl, "neuer null Befehl");
		befehle.add(befehl);
	}
	
	public Befehl von(int index) {
		return befehle.get(index);
	}
	
	public int anzahl() {
		return befehle.size();
	}
	
	public boolean istLeer() {
		return befehle.isEmpty();
	}
	
}
