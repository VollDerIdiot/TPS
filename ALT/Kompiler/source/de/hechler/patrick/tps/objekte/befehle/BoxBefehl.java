package de.hechler.patrick.tps.objekte.befehle;

import de.hechler.patrick.tps.objekte.BefehlsBox;

/**
 * Ein Befehl, welcher eine innere Box aus weiteren Befehlen enthält
 * 
 * @author Patrick
 */
public class BoxBefehl extends Befehl {
	
	private BefehlsBox box;
	
	
	
	public BoxBefehl() {
		box = new BefehlsBox();
	}
	
	
	
	public void neuerBefehl(Befehl befehl) {
		box.neu(befehl);
	}
	
	public Befehl befehlVon(int index) {
		return box.von(index);
	}
	
	public int befehlsanzahl() {
		return box.anzahlBedehle();
	}
	
	public boolean hatKeineBefehle() {
		return box.harKeineBefehler();
	}
	
}
