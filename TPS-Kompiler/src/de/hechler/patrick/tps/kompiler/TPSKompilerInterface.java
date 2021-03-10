package de.hechler.patrick.tps.kompiler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import de.hechler.patrick.tps.antlr.objects.Satz;

public interface TPSKompilerInterface {
	
	void lade(Satz[] s�tze);
	
	default void lade(List <Satz> s�tze) {
		lade(s�tze.toArray(new Satz[s�tze.size()]));
	}
	
	void kompiliere(OutputStream ausgang) throws IOException;
	
}
