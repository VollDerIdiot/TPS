package de.hechler.patrick.tps.interpreter.hilfen.befehl;

import de.hechler.patrick.tps.hilfen.objects.fehler.NochNichtGemachtFehler;

public enum KlugerBefehlEnum {
	
	addiere(BefehlsTeil.addiere, BefehlsTeil.zahl, BefehlsTeil.mit, BefehlsTeil.zahl), subtrahiere(BefehlsTeil.subtrahiere, BefehlsTeil.zahl, BefehlsTeil.mit, BefehlsTeil.zahl),
	multipliziere(BefehlsTeil.multipliziere, BefehlsTeil.zahl, BefehlsTeil.mit, BefehlsTeil.zahl), dividiere(BefehlsTeil.dividiere, BefehlsTeil.zahl, BefehlsTeil.mit, BefehlsTeil.zahl),
	
	zahlenausgabe(BefehlsTeil.ausgeben, BefehlsTeil.zahl),
	
	leerzeichen(BefehlsTeil.ausgeben, BefehlsTeil.leerzeichen), leerzeile(BefehlsTeil.ausgeben, BefehlsTeil.leerzeile),
	
	ausgabe(BefehlsTeil.ausgeben, BefehlsTeil.folgendes, BefehlsTeil.wortfolge),
	
	zwischenspeicher(BefehlsTeil.speichere, BefehlsTeil.ergebnis, BefehlsTeil.zu, BefehlsTeil.zwischen),
	
	vergleiche(BefehlsTeil.vergleich, BefehlsTeil.zahl, BefehlsTeil.mit, BefehlsTeil.zahl),
	
	springe(BefehlsTeil.springe, BefehlsTeil.zu, BefehlsTeil.stelle), springeWennNichtGleich(BefehlsTeil.wenn, BefehlsTeil.ungleich, BefehlsTeil.springe, BefehlsTeil.zu, BefehlsTeil.stelle),
	springeWennGleich(BefehlsTeil.wenn, BefehlsTeil.gleich, BefehlsTeil.springe, BefehlsTeil.zu, BefehlsTeil.stelle),
	springeWennKleiner(BefehlsTeil.wenn, BefehlsTeil.kleiner, BefehlsTeil.springe, BefehlsTeil.zu, BefehlsTeil.stelle),
	springeWennGrößer(BefehlsTeil.wenn, BefehlsTeil.größer, BefehlsTeil.springe, BefehlsTeil.zu, BefehlsTeil.stelle),
	springeWennKleinerGleich(BefehlsTeil.wenn, BefehlsTeil.kleinerGleich, BefehlsTeil.springe, BefehlsTeil.zu, BefehlsTeil.stelle),
	springeWennGrößerGleich(BefehlsTeil.wenn, BefehlsTeil.größerGleich, BefehlsTeil.springe, BefehlsTeil.zu, BefehlsTeil.stelle),
	springeZuDirekt(BefehlsTeil.springe, BefehlsTeil.zu, BefehlsTeil.posZahl),
	
	stelle(BefehlsTeil.hier, BefehlsTeil.ist, BefehlsTeil.stelle),
	
	leseZahlEinErg(BefehlsTeil.einlesen, BefehlsTeil.zahl_, BefehlsTeil.ergebnis), leseZahlEinZwischen(BefehlsTeil.einlesen, BefehlsTeil.zahl_, BefehlsTeil.zwischen),
	
	ladeInRegister(BefehlsTeil.speichere, BefehlsTeil.zahl, BefehlsTeil.zu, BefehlsTeil.register),
	
	ladeVomRegisterErg(BefehlsTeil.speichere, BefehlsTeil.register, BefehlsTeil.zu, BefehlsTeil.ergebnis),
	ladeVomRegisterZw(BefehlsTeil.speichere, BefehlsTeil.register, BefehlsTeil.zu, BefehlsTeil.zwischen),
	
	ladeRegisterAnzahlErg(BefehlsTeil.speichere, BefehlsTeil.anzahl, BefehlsTeil.register_, BefehlsTeil.zu, BefehlsTeil.ergebnis),
	ladeRegisterAnzahlZw(BefehlsTeil.speichere, BefehlsTeil.anzahl, BefehlsTeil.register_, BefehlsTeil.zu, BefehlsTeil.zwischen),
	
	registerausgabe(BefehlsTeil.ausgeben, BefehlsTeil.bereich),
	
	registerWortEinlesen(BefehlsTeil.einlesen, BefehlsTeil.wort, BefehlsTeil.zu, BefehlsTeil.register),
	registerZeichenEinlesen(BefehlsTeil.einlesen, BefehlsTeil.posZahl, BefehlsTeil.zeichen, BefehlsTeil.zu, BefehlsTeil.register),
	
	springeWennFalsch(BefehlsTeil.wenn, BefehlsTeil.fehler, BefehlsTeil.gab, BefehlsTeil.springe, BefehlsTeil.zu, BefehlsTeil.stelle),
	
	versionErg(BefehlsTeil.speichere, BefehlsTeil.version, BefehlsTeil.zu, BefehlsTeil.ergebnis), versionZw(BefehlsTeil.speichere, BefehlsTeil.version, BefehlsTeil.zu, BefehlsTeil.zwischen),
	versionReg(BefehlsTeil.speichere, BefehlsTeil.version, BefehlsTeil.zu, BefehlsTeil.register),
	
	stapelMaxGrößeErg(BefehlsTeil.speichere, BefehlsTeil.stapelMaxGr, BefehlsTeil.zu, BefehlsTeil.ergebnis),
	stapelMaxGrößeZw(BefehlsTeil.speichere, BefehlsTeil.stapelMaxGr, BefehlsTeil.zu, BefehlsTeil.zwischen),
	stapelMaxGrößeReg(BefehlsTeil.speichere, BefehlsTeil.stapelMaxGr, BefehlsTeil.zu, BefehlsTeil.register),
	
	stapelGrößeErg(BefehlsTeil.speichere, BefehlsTeil.stapelGr, BefehlsTeil.zu, BefehlsTeil.ergebnis), stapelGrößeZw(BefehlsTeil.speichere, BefehlsTeil.stapelGr, BefehlsTeil.zu, BefehlsTeil.zwischen),
	stapelGrößeReg(BefehlsTeil.speichere, BefehlsTeil.stapelGr, BefehlsTeil.zu, BefehlsTeil.register),
	
	vergleicheRegister(BefehlsTeil.vergleich, BefehlsTeil.bereich, BefehlsTeil.mit, BefehlsTeil.bereich),
	vergleicheRegisterText(BefehlsTeil.vergleich, BefehlsTeil.bereich, BefehlsTeil.mit, BefehlsTeil.wortfolge),
	
	rufeAuf(BefehlsTeil.aufruf, BefehlsTeil.zu, BefehlsTeil.stelle), rufeAufWennGleich(BefehlsTeil.wenn, BefehlsTeil.gleich, BefehlsTeil.aufruf, BefehlsTeil.zu, BefehlsTeil.stelle),
	rufeAufWennNichtGleich(BefehlsTeil.wenn, BefehlsTeil.ungleich, BefehlsTeil.aufruf, BefehlsTeil.zu, BefehlsTeil.stelle),
	rufeAufWennKleiner(BefehlsTeil.wenn, BefehlsTeil.kleiner, BefehlsTeil.aufruf, BefehlsTeil.zu, BefehlsTeil.stelle),
	rufeAufGrößer(BefehlsTeil.wenn, BefehlsTeil.größer, BefehlsTeil.aufruf, BefehlsTeil.zu, BefehlsTeil.stelle),
	rufeAufKleinerGleich(BefehlsTeil.wenn, BefehlsTeil.kleinerGleich, BefehlsTeil.aufruf, BefehlsTeil.zu, BefehlsTeil.stelle),
	rufeAufGrößerGleich(BefehlsTeil.wenn, BefehlsTeil.größerGleich, BefehlsTeil.aufruf, BefehlsTeil.zu, BefehlsTeil.stelle),
	
	geheZurück(BefehlsTeil.zurückgehen),
	
	rufeAufDirekt(BefehlsTeil.aufruf, BefehlsTeil.zu, BefehlsTeil.posZahl),
	
	stapelSchreiben(BefehlsTeil.speichere, BefehlsTeil.zahl, BefehlsTeil.zu, BefehlsTeil.stapel),
	
	stapelLesenErg(BefehlsTeil.nehme, BefehlsTeil.von, BefehlsTeil.stapel, BefehlsTeil.zu, BefehlsTeil.ergebnis),
	stapelLesenZw(BefehlsTeil.nehme, BefehlsTeil.von, BefehlsTeil.stapel, BefehlsTeil.zu, BefehlsTeil.zwischen),
	stapelLesenReg(BefehlsTeil.nehme, BefehlsTeil.von, BefehlsTeil.stapel, BefehlsTeil.zu, BefehlsTeil.register),
	
	rufeAufWennFalsch(BefehlsTeil.wenn, BefehlsTeil.fehler, BefehlsTeil.gab, BefehlsTeil.aufruf, BefehlsTeil.zu, BefehlsTeil.stelle),
	
	letzterFehler(BefehlsTeil.nehme, BefehlsTeil.letztenFehler),
	
	;
	
	private KlugerBefehlEnum(BefehlsTeil... teile) {
	}
	
	
	public static KlugerBefehlEnum erhalte() {
		throw new NochNichtGemachtFehler();
	}
	
	private enum BefehlsTeil {
		mit,
		
		ist,
		
		hier,
		
		gab,
		
		zu,
		
		von,
		
		folgendes,
		
		ausgeben,
		
		leerzeichen, leerzeile,
		
		addiere, subtrahiere, multipliziere, dividiere,
		
		vergleich,
		
		springe,
		
		stelle,
		
		aufruf,
		
		zurückgehen,
		
		speichere,
		
		zwischen, ergebnis, register,
		
		bereich,
		
		stapel,
		
		nehme,
		
		zahl, posZahl,
		
		fehler,
		
		version,
		
		stapelMaxGr, stapelGr,
		
		wortfolge,
		
		wenn, ungleich, gleich, größer, kleiner, größerGleich, kleinerGleich,
		
		einlesen,
		
		zahl_,
		
		register_,
		
		anzahl,
		
		wort, zeichen,
		
		letztenFehler,
	
	}
	
}

