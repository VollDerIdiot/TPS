package de.hechler.patrick.tps.objects.satzinter.fs;

import java.io.PrintStream;
import java.util.Scanner;

import de.hechler.patrick.tps.antlr.anotatins.Version;
import de.hechler.patrick.tps.antlr.objects.Satz;

@Version(7)
public class TollerSIFS extends SätzeInterpretierenderFehlerSucher {
	
	public TollerSIFS(Scanner eingabe, PrintStream ausgabe, int registerAnzahl, int stapelMaxGröße) {
		super(eingabe, ausgabe, registerAnzahl, stapelMaxGröße);
	}
	
	@Override
	protected Ergebnis mache(Satz machen, long stelle) {
		switch (machen.art) {
		default:
			return super.mache(machen, stelle);
		}
	}
	
}
