package de.hechler.patrick.tps.objekte.befehle;

/**
 * Geht aus einer Konstanten anzahl an Boxen heraus. <br>
 * Es ist nicht möglich eine Zahl, die negativ ist, oder eine Zahl, die größer ist als die aktuelle verBoxung, zu wählen
 * 
 * @author Patrick
 */
public class GeheAusNBoxen extends Befehl {
	
	public final int anzahl;
	
	public GeheAusNBoxen(int anzahl) {
		this.anzahl = anzahl;
	}
	
}
