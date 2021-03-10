package de.hechler.patrick.tps.kompiler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import de.hechler.patrick.tps.antlr.objects.Satz;

public interface TPSKompilerInterface {
	
	void lade(Satz[] sätze);
	
	default void lade(List <Satz> sätze) {
		lade(sätze.toArray(new Satz[sätze.size()]));
	}
	
	void kompiliere(OutputStream ausgang) throws IOException;
	
}
