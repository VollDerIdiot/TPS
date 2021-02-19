package de.hechler.patrick.tps.interpreter.hilfen;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import de.hechler.patrick.tps.fehler.InterpretierungsFehler;

public class Helfer {
	
	private Helfer() {}
	
	public static AnordnungInterface[] lade(InputStream eingang, Charset zeichensatz, Map <String, Integer> stellen, Set <String> benötigteStellen) throws InterpretierungsFehler {
		List <AnordnungInterface> erg = new ArrayList <AnordnungInterface>();
		try (Scanner ein = new Scanner(eingang, zeichensatz)) {
			while (ein.hasNext()) {
				String zw = ein.next();
				Set <BefehlEnum> befs = BefehlEnum.get(zw);
				List <String> satz = new ArrayList <String>();
				int index = 1;
				satz.add(zw);
				while (ein.hasNext()) {
					zw = ein.next();
					if (zw.endsWith(".")) {
						zw = zw.substring(0, zw.length() - 1);
						BefehlEnum.teste(zw, index ++ , befs);
						satz.add(zw);
						break;
					}
					BefehlEnum.teste(zw, index ++ , befs);
					satz.add(zw);
				}
				if (befs.size() != 1) throw new InterpretierungsFehler("befs.size != 1 befs=" + befs + " satz=" + satz);
				AnordnungInterface neu = new TolleAnordnung();
				neu.befehl(befs.iterator().next());
				neu.fülleParam(satz, benötigteStellen, stellen, index);
			}
		}
		return erg.toArray(new AnordnungInterface[erg.size()]);
	}
	
}
