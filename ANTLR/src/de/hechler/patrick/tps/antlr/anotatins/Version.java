package de.hechler.patrick.tps.antlr.anotatins;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
	
	int value();
	
}
