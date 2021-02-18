package de.hechler.patrick.tps.interpreter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Stelle {
	
	boolean braucht();

}
