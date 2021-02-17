package tps.kompiler.objekte.code;


public class Methode {
	
	private static final Variable[] KEINE_VARS = new Variable[0];
	private static final Box KEINE_BOX = new Box();
	
	
	
	private Variable[] variablen;
	private Box box;
	
	
	
	public Methode(Variable[] variablen, Box box) {
		this.variablen = variablen == null ? KEINE_VARS : variablen.clone();
		this.box = box == null ? KEINE_BOX : box;
	}
	
	
	public Variable getVariable(int index) {
		return variablen[index];
	}
	
	public Box getBox() {
		return box;
	}
	
}
