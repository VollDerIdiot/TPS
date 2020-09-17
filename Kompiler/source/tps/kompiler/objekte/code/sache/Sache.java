package tps.kompiler.objekte.code.sache;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeSet;

import tps.kompiler.objekte.code.Datentyp;
import tps.kompiler.objekte.code.Methode;
import tps.kompiler.objekte.code.Variable;
import tps.kompiler.objekte.konstanten.Implementierungstiefe;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;

public abstract class Sache {
	
	public final Datentyp datentyp;
	public final Implementierungstiefe impl;
	public final Sichtbarkeit sichtbarkeit;
	public final Datentyp bessert;
	public final NavigableSet <Datentyp> macht;
	protected List <Variable> variablen;
	protected List <Methode> methoden;
	
	
	
	public Sache(Datentyp name, Implementierungstiefe impl, Sichtbarkeit sichtbarkeit, Datentyp bessert, Collection <Datentyp> macht) {
		Objects.requireNonNull(name, "Der Name darf nicht null sein!");
		Objects.requireNonNull(impl, "Die implementierungstiefe darf nicht null sein!");
		Objects.requireNonNull(sichtbarkeit, "Die sichtbarkeit darf nicht null sein!");
		Objects.requireNonNull(bessert, "bessert darf nicht null sein!");
		Objects.requireNonNull(macht, "macht darf nicht null sein!");
		this.datentyp = name;
		this.impl = impl;
		this.sichtbarkeit = sichtbarkeit;
		variablen = new ArrayList <Variable>();
		methoden = new ArrayList <Methode>();
		this.bessert = bessert;
		this.macht = Collections.unmodifiableNavigableSet(new TreeSet <Datentyp>(macht));
	}
	
	
	
	public void addVariable(Variable variable) {
		variablen.add(variable);
	}
	
	public void addMethode(Methode methode) {
		methoden.add(methode);
	}
	
	public List <Variable> getVariablen() {
		return Collections.unmodifiableList(new ArrayList <Variable>(variablen));
	}
	
	public List <Methode> getMethoden() {
		return Collections.unmodifiableList(new ArrayList <Methode>(methoden));
	}
	
}
