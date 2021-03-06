package de.hechler.patrick.tps.antlr.enums;

import java.io.Serializable;

public enum SatzArt implements Serializable {
	addiere, subtrahiere, multipliziere, dividiere,
	
	zahlenausgabe, leerzeichen, leerzeile, ausgabe,
	
	zwischenspeicher,
	
	vergleiche,
	
	springe, springeWennNichtGleich, springeWennGleich, springeWennKleiner, springeWennGrößer, springeWennKleinerGleich, springeWennGrößerGleich, springeZuDirekt,
	
	stelle,
	
	leseZahlEinErg, leseZahlEinZwischen,
	
	ladeInRegister, ladeVomRegisterErg, ladeVomRegisterZw, ladeRegisterAnzahlErg, ladeRegisterAnzahlZw,
	
	registerausgabe,
	
	registerWortEinlesen, registerZeichenEinlesen,
	
	springeWennFalsch,
	
	versionErg, versionZw, versionReg,
	
	stapelMaxGrößeErg, stapelMaxGrößeZw, stapelMaxGrößeReg,
	
	stapelGrößeErg, stapelGrößeZw, stapelGrößeReg,
	
	vergleicheRegister, vergleicheRegisterText,
	
	rufeAuf, rufeAufWennGleich, rufeAufWennNichtGleich, rufeAufWennKleiner, rufeAufGrößer, rufeAufKleinerGleich, rufeAufGrößerGleich, geheZurück, rufeAufDirekt, stapelSchreiben, stapelLesenErg,
	stapelLesenZw, stapelLesenReg, rufeAufWennFalsch,
	
	letzterFehler

}
