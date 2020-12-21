package tps.kompiler.objekte.programm;

public class Variable implements Comparable <Variable> {
	
	public final String name;
	public final Datentyp datentyp;
	
	
	
	public Variable(String name, Datentyp datentyp) {
		this.name = name;
		this.datentyp = datentyp;
	}
	
	
	
	@Override
	public int compareTo(Variable mit) {
		int ergebnis;
		ergebnis = name.compareTo(mit.name);
		return ergebnis == 0 ? datentyp.compareTo(mit.datentyp) : ergebnis;
	}
	
}
