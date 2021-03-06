package de.hechler.patrick.tps.antlr.objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.hechler.patrick.tps.antlr.enums.SatzArt;

public class Satz implements Serializable {
	
	/** UID */
	private static final long serialVersionUID = -900170451527422969L;
	
	public final SatzArt          art;
	public final List <Parameter> params;
	
	
	public Satz(SatzArt art, List <? extends Parameter> params) {
		this.art = art;
		this.params = Collections.unmodifiableList(new ArrayList <>(params));
	}
	
	
	
	public SatzArt art() {
		return art;
	}
	
	public Parameter param(int index) {
		return params.get(index);
	}
	
}
