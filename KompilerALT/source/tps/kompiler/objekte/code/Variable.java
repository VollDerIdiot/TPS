package tps.kompiler.objekte.code;


public class Variable {
	
	private Datentyp datentyp;
	private String name;
	
	public Variable(String name, Datentyp datentyp) {
		this.name = name;
		this.datentyp = datentyp;
	}
	
	
	
	public Datentyp getDatentyp() {
		return datentyp;
	}
	
	
	public String getName() {
		return name;
	}
	
}
