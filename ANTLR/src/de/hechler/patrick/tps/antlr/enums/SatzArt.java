package de.hechler.patrick.tps.antlr.enums;

import java.io.Serializable;

import de.hechler.patrick.tps.antlr.anotatins.Stelle;
import de.hechler.patrick.tps.antlr.anotatins.Version;
import de.hechler.patrick.tps.antlr.anotatins.Änderung;

public enum SatzArt implements Serializable {
	@Version(1) @Änderung(7) addiere, @Version(1) @Änderung(7) subtrahiere, @Version(1) @Änderung(7) multipliziere, @Version(1) @Änderung({4, 7 }) dividiere,
	
	@Version(1) @Änderung(7) zahlenausgabe, @Version(1) leerzeichen, @Version(1) leerzeile, @Version(1) ausgabe,
	
	@Version(1) zwischenspeicher,
	
	@Version(2) vergleiche,
	
	@Version(2) @Stelle(braucht = true) springe, @Version(2) @Stelle(braucht = true) springeWennNichtGleich, @Version(2) @Stelle(braucht = true) springeWennGleich,
	@Version(2) @Stelle(braucht = true) springeWennKleiner, @Version(2) @Stelle(braucht = true) springeWennGrößer, @Version(2) @Stelle(braucht = true) springeWennKleinerGleich,
	@Version(2) @Stelle(braucht = true) springeWennGrößerGleich,
	
	@Version(2) @Stelle(braucht = false) stelle,
	
	@Version(3) @Änderung(4) leseZahlEinErg, @Version(3) @Änderung(4) leseZahlEinZwischen,
	
	@Version(4) ladeInRegister, @Version(4) ladeVomRegisterErg, @Version(4) ladeVomRegisterZw, @Version(4) ladeRegisterAnzahlErg, @Version(4) ladeRegisterAnzahlZw,
	
	@Version(4) registerausgabe,
	
	@Version(4) registerWortEinlesen, registerZeichenEinlesen,
	
	@Version(4) @Stelle(braucht = true) springeWennFalsch,
	
	@Version(5) versionErg, @Version(5) versionZw, @Version(5) versionReg,
	
	@Version(5) stapelMaxGrößeErg, @Version(5) stapelMaxGrößeZw, @Version(5) stapelMaxGrößeReg,
	
	@Version(5) stapelGrößeErg, @Version(5) stapelGrößeZw, @Version(5) stapelGrößeReg,
	
	@Version(5) vergleicheRegister, @Version(5) vergleicheRegisterText,
	
	@Version(5) @Stelle(braucht = true) rufeAuf, @Version(5) @Stelle(braucht = true) rufeAufWennGleich, @Version(5) @Stelle(braucht = true) rufeAufWennNichtGleich,
	@Version(5) @Stelle(braucht = true) rufeAufWennKleiner, @Version(5) @Stelle(braucht = true) rufeAufGrößer, @Version(5) @Stelle(braucht = true) rufeAufKleinerGleich,
	@Version(5) @Stelle(braucht = true) rufeAufGrößerGleich, @Version(5) geheZurück, @Version(5) stapelSchreiben, @Version(5) stapelLesenErg, @Version(5) stapelLesenZw, @Version(5) stapelLesenReg,
	
	@Version(6) springeZuDirekt, @Version(6) rufeAufDirekt, @Version(6) @Stelle(braucht = true) rufeAufWennFalsch,
	
	@Version(6) letzterFehler

}
