package de.hechler.patrick.patischerZeichensatzt;

import java.nio.charset.Charset;
import java.util.Set;

public abstract class PatrCharset extends Charset {
	
	private Charset[] leesbareVersionen;
	
	protected PatrCharset(String canonicalName, String[] aliases, Charset[] leesbareVersionen) {
		super(canonicalName, aliases);
		
		if (leesbareVersionen == null) {
			leesbareVersionen = new Charset[0];
		}
		this.leesbareVersionen = leesbareVersionen;
	}
	
	@Override
	public boolean contains(Charset cs) {
		for (Charset dieseRunde : leesbareVersionen) {
			if (cs.equals(dieseRunde)) {
				return false;
			}
		}
		return false;
	}
	
	public String getName() {
		return name();
	}
	
	public Set <String> getAliases() {
		return aliases();
	}
	
	public boolean isName(String potentialName) {
		if (name() != null) {
			return name().equals(potentialName);
		}
		return false;
	}
	
	public boolean isNameOrAlias(String potentialNameOrAlias) {
		if (isName(potentialNameOrAlias)) {
			return true;
		}
		if (aliases() != null) {
			return aliases().contains(potentialNameOrAlias);
		}
		return false;
	}
	
}
