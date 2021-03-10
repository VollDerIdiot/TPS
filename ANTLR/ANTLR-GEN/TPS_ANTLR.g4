grammar TPS_ANTLR;

@header {
package genearatedsources.antlr;

import de.hechler.patrick.tps.antlr.enums.*;
import de.hechler.patrick.tps.antlr.objects.*;
import de.hechler.patrick.tps.antlr.objects.satz.*;

import java.util.*;
}

@parser::members {
public int line(){ return _ctx.start.getLine();}
}

datei returns [List<Satz> inhalt] @init {$inhalt = new ArrayList<>();}
:
	(
		satz WS?
		{$inhalt.add($satz.inhalt);}

	)+ EOF
;

satz returns [int zeile, Satz inhalt]
:
	{$zeile = line();}

	satzWert WS? PUNKT
	{$inhalt = $satzWert.inhalt;}

;

satzWert returns [Satz inhalt]
:
	(
		addiere
		{$inhalt = new Zahlenoperation(SatzArt.addiere, $addiere.a, $addiere.b);}

	)
	|
	(
		subtrahiere
		{$inhalt = new Zahlenoperation(SatzArt.subtrahiere, $subtrahiere.a, $subtrahiere.b);}

	)
	|
	(
		multipliziere
		{$inhalt = new Zahlenoperation(SatzArt.multipliziere, $multipliziere.a, $multipliziere.b);}

	)
	|
	(
		dividiere
		{$inhalt = new Zahlenoperation(SatzArt.dividiere, $dividiere.a, $dividiere.b);}

	)
	|
	(
		zahlenausgabe
		{$inhalt = new Ausgabeoperation(SatzArt.zahlenausgabe, $zahlenausgabe.ausgeben);}

	)
	|
	(
		leerzeichen
		{$inhalt = new Ausgabeoperation(SatzArt.leerzeichen, ZeichenKette.LEERZEICHEN);}

	)
	|
	(
		leerzeile
		{$inhalt = new Ausgabeoperation(SatzArt.leerzeichen, ZeichenKette.LEERZEILE);}

	)
	|
	(
		ausgabe
		{$inhalt = new Ausgabeoperation(SatzArt.leerzeichen, $ausgabe.wortfolge);}

	)
	|
	(
		zwischenspeicher
		{$inhalt = new Satz(SatzArt.zwischenspeicher, Collections.emptyList());}

	)
	|
	(
		vergleiche
		{$inhalt = new Zahlenoperation(SatzArt.vergleiche, $vergleiche.a, $vergleiche.b);}

	)
	|
	(
		springe
		{$inhalt = new Stellenoperation(SatzArt.springe, $springe.ziel);}

	)
	|
	(
		springeWennNichtGleich
		{$inhalt = new Stellenoperation(SatzArt.springeWennNichtGleich, $springeWennNichtGleich.ziel);}

	)
	|
	(
		springeWennGleich
		{$inhalt = new Stellenoperation(SatzArt.springeWennGleich, $springeWennGleich.ziel);}

	)
	|
	(
		springeWennKleiner
		{$inhalt = new Stellenoperation(SatzArt.springeWennKleiner, $springeWennKleiner.ziel);}

	)
	|
	(
		springeWennGr
		{$inhalt = new Stellenoperation(SatzArt.springeWennGrößer, $springeWennGr.ziel);}

	)
	|
	(
		springeWennKleinerGleich
		{$inhalt = new Stellenoperation(SatzArt.springeWennKleinerGleich, $springeWennKleinerGleich.ziel);}

	)
	|
	(
		springeWennGrGleich
		{$inhalt = new Stellenoperation(SatzArt.springeWennGrößerGleich, $springeWennGrGleich.ziel);}

	)
	|
	(
		springeZuDirekt
		{$inhalt = new EinzelZahlenoperation(SatzArt.springeZuDirekt, $springeZuDirekt.ziel);}

	)
	|
	(
		stelle
		{$inhalt = new ZeichenKettenoperation(SatzArt.stelle, $stelle.name);}

	)
	|
	(
		leseZahlEinErg
		{$inhalt = new Satz(SatzArt.leseZahlEinErg, Collections.emptyList());}

	)
	|
	(
		leseZahlEinZwischen
		{$inhalt = new Satz(SatzArt.leseZahlEinZwischen, Collections.emptyList());}

	)
	|
	(
		ladeInRegister
		{$inhalt = new RegisterUndZahlOperation(SatzArt.ladeInRegister, $ladeInRegister.reg, $ladeInRegister.wert);}

	)
	|
	(
		ladeVomRegisterErg
		{$inhalt = new EinzelZahlenoperation(SatzArt.ladeVomRegisterErg, $ladeVomRegisterErg.reg);}

	)
	|
	(
		ladeVomRegisterZw
		{$inhalt = new EinzelZahlenoperation(SatzArt.ladeVomRegisterZw, $ladeVomRegisterZw.reg);}

	)
	|
	(
		ladeRegisterAnzahlErg
		{$inhalt = new Satz(SatzArt.ladeRegisterAnzahlErg, Collections.emptyList());}

	)
	|
	(
		ladeRegisterAnzahlZw
		{$inhalt = new Satz(SatzArt.ladeRegisterAnzahlZw, Collections.emptyList());}

	)
	|
	(
		registerausgabe
		{$inhalt = new ZweiRegisterOperation(SatzArt.registerausgabe, $registerausgabe.anfang, $registerausgabe.ende);}

	)
	|
	(
		registerWortEinlesen
		{$inhalt = new EinzelZahlenoperation(SatzArt.registerWortEinlesen, $registerWortEinlesen.reg);}

	)
	|
	(
		registerZeichenEinlesen
		{$inhalt = new RegisterUndZahlOperation(SatzArt.registerZeichenEinlesen, $registerZeichenEinlesen.reg, $registerZeichenEinlesen.anzahl);}

	)
	|
	(
		springeWennFalsch
		{$inhalt = new Stellenoperation(SatzArt.springeWennFalsch, $springeWennFalsch.ziel);}

	)
	|
	(
		versionErg
		{$inhalt = new Satz(SatzArt.versionErg, Collections.emptyList());}

	)
	|
	(
		versionZw
		{$inhalt = new Satz(SatzArt.versionZw, Collections.emptyList());}

	)
	|
	(
		versionReg
		{$inhalt = new EinzelZahlenoperation(SatzArt.versionReg, $versionReg.reg);}

	)
	|
	(
		stapelMaxGrErg
		{$inhalt = new Satz(SatzArt.stapelMaxGrößeErg, Collections.emptyList());}

	)
	|
	(
		stapelMaxGrZw
		{$inhalt = new Satz(SatzArt.stapelMaxGrößeZw, Collections.emptyList());}

	)
	|
	(
		stapelMaxGrReg
		{$inhalt = new EinzelZahlenoperation(SatzArt.stapelMaxGrößeReg, $stapelMaxGrReg.reg);}

	)
	|
	(
		stapelGrErg
		{$inhalt = new Satz(SatzArt.stapelGrößeErg, Collections.emptyList());}

	)
	|
	(
		stapelGrZw
		{$inhalt = new Satz(SatzArt.stapelGrößeZw, Collections.emptyList());}

	)
	|
	(
		stapelGrReg
		{$inhalt = new EinzelZahlenoperation(SatzArt.stapelGrößeReg, $stapelGrReg.reg);}

	)
	|
	(
		vergleicheRegister
		{$inhalt = new VierRegisterOperation(SatzArt.vergleicheRegister, $vergleicheRegister.regA, $vergleicheRegister.regB, $vergleicheRegister.regC, $vergleicheRegister.regD);}

	)
	|
	(
		vergleicheRegisterText
		{$inhalt = new RegRegTextOperation(SatzArt.vergleicheRegisterText, $vergleicheRegisterText.anfang, $vergleicheRegisterText.ende, $vergleicheRegisterText.wortfolge);}

	)
	|
	(
		rufeAuf
		{$inhalt = new Stellenoperation(SatzArt.rufeAuf, $rufeAuf.ziel);}

	)
	|
	(
		rufeAufWennGleich
		{$inhalt = new Stellenoperation(SatzArt.rufeAufWennGleich, $rufeAufWennGleich.ziel);}

	)
	|
	(
		rufeAufWennNichtGleich
		{$inhalt = new Stellenoperation(SatzArt.rufeAufWennNichtGleich, $rufeAufWennNichtGleich.ziel);}

	)
	|
	(
		rufeAufWennKleiner
		{$inhalt = new Stellenoperation(SatzArt.rufeAufWennKleiner, $rufeAufWennKleiner.ziel);}

	)
	|
	(
		rufeAufGr
		{$inhalt = new Stellenoperation(SatzArt.rufeAufGrößer, $rufeAufGr.ziel);}

	)
	|
	(
		rufeAufKleinerGleich
		{$inhalt = new Stellenoperation(SatzArt.rufeAufKleinerGleich, $rufeAufKleinerGleich.ziel);}

	)
	|
	(
		rufeAufGrGleich
		{$inhalt = new Stellenoperation(SatzArt.rufeAufGrößerGleich, $rufeAufGrGleich.ziel);}

	)
	|
	(
		geheZur
		{$inhalt = new Satz(SatzArt.geheZurück, Collections.emptyList());}

	)
	|
	(
		rufeAufDirekt
		{$inhalt = new EinzelZahlenoperation(SatzArt.rufeAufDirekt, $rufeAufDirekt.ziel);}

	)
	|
	(
		stapelSchreiben
		{$inhalt = new EinzelZahlenoperation(SatzArt.stapelSchreiben, $stapelSchreiben.legen);}

	)
	|
	(
		stapelLesenErg
		{$inhalt = new Satz(SatzArt.stapelLesenErg, Collections.emptyList());}

	)
	|
	(
		stapelLesenZw
		{$inhalt = new Satz(SatzArt.stapelLesenZw, Collections.emptyList());}

	)
	|
	(
		stapelLesenReg
		{$inhalt = new EinzelZahlenoperation(SatzArt.stapelLesenReg, $stapelLesenReg.reg);}

	)
	|
	(
		rufeAufWennFalsch
		{$inhalt = new Stellenoperation(SatzArt.rufeAufWennFalsch, $rufeAufWennFalsch.ziel);}

	)
	|
	(
		letzterFehler
		{$inhalt = new Satz(SatzArt.letzterFehler, Collections.emptyList());}

	)
;

///////////////
///SATZWERTE///
///////////////

letzterFehler
:
	nehmeST WS letztenFehlerST
;

rufeAufWennFalsch returns [ZeichenKette ziel]
:
	wennST WS fehlerST WS gabST WS aufrufST WS zuST WS
	(
		direktPronomST WS
	)?
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

stapelLesenReg returns [Zahl reg]
:
	nehmeST WS vonST WS stapelST WS zuST WS
	(
		direktPronomST WS
	)?
	(
		direktPronomST WS
	)? registerST
	{$reg = $registerST.reg;}

;

stapelLesenZw
:
	nehmeST WS vonST WS stapelST WS zuST WS
	(
		direktPronomST WS
	)?
	(
		direktPronomST WS
	)? zwischenST
;

stapelLesenErg
:
	nehmeST WS vonST WS stapelST WS zuST WS
	(
		direktPronomST WS
	)?
	(
		direktPronomST WS
	)? ergebnisST
;

stapelSchreiben returns [Zahl legen]
:
	speichereST WS zahlST WS zuST WS
	(
		direktPronomST WS
	)? stapelST
	{$legen = $zahlST.zahl;}

;

rufeAufDirekt returns [Zahl ziel]
:
	aufrufST WS zuST WS
	(
		direktPronomST WS
	)?
	(
		direktPronomST WS
	)? posZahlST
	{$ziel = $posZahlST.zahl;}

;

geheZur
:
	zurückgehenST
;

rufeAufGrGleich returns [ZeichenKette ziel]
:
	wennST WS größerGleichST WS istST WS aufrufST WS zuST WS
	(
		direktPronomST WS
	)?
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

rufeAufKleinerGleich returns [ZeichenKette ziel]
:
	wennST WS kleinerGleichST WS istST WS aufrufST WS zuST WS
	(
		direktPronomST WS
	)?
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

rufeAufGr returns [ZeichenKette ziel]
:
	wennST WS größerST WS istST WS aufrufST WS zuST WS
	(
		direktPronomST WS
	)?
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

rufeAufWennKleiner returns [ZeichenKette ziel]
:
	wennST WS kleinerST WS istST WS aufrufST WS zuST WS
	(
		direktPronomST WS
	)?
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

rufeAufWennNichtGleich returns [ZeichenKette ziel]
:
	wennST WS ungleichST WS istST WS aufrufST WS zuST WS
	(
		direktPronomST WS
	)?
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

rufeAufWennGleich returns [ZeichenKette ziel]
:
	wennST WS gleichST WS istST WS aufrufST WS zuST WS
	(
		direktPronomST WS
	)?
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

rufeAuf returns [ZeichenKette ziel]
:
	aufrufST WS zuST WS
	(
		direktPronomST WS
	)?
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

vergleicheRegisterText returns [Zahl anfang, Zahl ende, ZeichenKette wortfolge]
:
	vergleichST WS bereichST WS mitST WS derST WS wortfolgeST
	{	$anfang = $bereichST.anfang;
		$ende = $bereichST.ende;
		$wortfolge = new ZeichenKette($wortfolgeST.wortfolge);}

;

vergleicheRegister returns [Zahl regA, Zahl regB, Zahl regC, Zahl regD]
:
	vergleichST WS
	(
		bereichST
		{	$regA = $bereichST.anfang;
			$regB = $bereichST.ende;}

	) WS mitST WS
	(
		bereichST
		{	$regC = $bereichST.anfang;
			$regD = $bereichST.ende;}

	)
;

stapelGrZw
:
	speichereST WS stapelGrST WS zuST WS
	(
		direktPronomST WS
	)?
	(
		direktPronomST WS
	)? zwischenST
;

stapelGrReg returns [Zahl reg]
:
	speichereST WS stapelGrST WS zuST WS
	(
		direktPronomST WS
	)?
	(
		direktPronomST WS
	)? registerST
	{$reg = $registerST.reg;}

;

stapelGrErg
:
	speichereST WS stapelGrST WS zuST
	(
		WS direktPronomST
	)? WS ergebnisST
;

stapelMaxGrReg returns [Zahl reg]
:
	speichereST WS direktPronomST WS stapelMaxGrST WS zuST
	(
		WS direktPronomST
	)? WS registerST
	{$reg = $registerST.reg;}

;

stapelMaxGrZw
:
	speichereST WS direktPronomST WS stapelMaxGrST WS zuST
	(
		WS direktPronomST
	)? WS zwischenST
;

stapelMaxGrErg
:
	speichereST WS direktPronomST WS stapelMaxGrST WS zuST
	(
		WS direktPronomST
	)? WS ergebnisST
;

versionZw
:
	speichereST WS direktPronomST WS versionST WS zuST WS
	(
		direktPronomST WS
	)? direktPronomST WS zwischenST
;

versionReg returns [Zahl reg]
:
	speichereST WS direktPronomST WS versionST WS zuST WS
	(
		direktPronomST WS
	)? registerST
	{$reg = $registerST.reg;}

;

versionErg
:
	speichereST WS direktPronomST WS versionST WS zuST WS
	(
		direktPronomST WS
	)? ergebnisST
;

springeWennFalsch returns [ZeichenKette ziel]
:
	wennST WS fehlerST WS gabST WS springeST WS zuST WS
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

registerZeichenEinlesen returns [Zahl anzahl, Zahl reg]
:
	einlesenST WS posZahlST WS zeichenST WS zuST WS
	(
		direktPronomST WS
	)? registerST
	{	$anzahl = $posZahlST.zahl;
		$reg = $registerST.reg;}

;

registerWortEinlesen returns [Zahl reg]
:
	einlesenST WS wortST WS zuST WS
	(
		direktPronomST WS
	)? registerST
	{$reg = $registerST.reg;}

;

registerausgabe returns [Zahl anfang, Zahl ende]
:
	ausgebenST WS bereichST
	{	$anfang = $bereichST.anfang;
		$ende = $bereichST.ende;}

;

ladeRegisterAnzahlZw
:
	speichereST WS direktPronomST WS anzahlST WS direktPronomST WS registerST_ WS
	zuST WS
	(
		direktPronomST WS
	)? direktPronomST WS zwischenST
;

ladeRegisterAnzahlErg
:
	speichereST WS direktPronomST WS anzahlST WS direktPronomST WS registerST_ WS
	zuST WS
	(
		direktPronomST WS
	)? direktPronomST WS ergebnisST
;

direktPronomST
:
	DIE
	| DER
	| DAS
	| DEM
	| DEN
;

ladeVomRegisterZw returns [Zahl reg]
:
	speichereST WS registerST WS zuST WS
	(
		direktPronomST WS
	)? zwischenST
	{$reg = $registerST.reg;}

;

ladeVomRegisterErg returns [Zahl reg]
:
	speichereST WS registerST WS zuST WS
	(
		direktPronomST WS
	)? ergebnisST
	{$reg = $registerST.reg;}

;

ladeInRegister returns [Zahl wert, Zahl reg]
:
	speichereST WS zahlST WS zuST WS
	(
		direktPronomST WS
	)? registerST
	{	$reg = $registerST.reg;
		$wert = $zahlST.zahl;}

;

leseZahlEinZwischen
:
	einlesenST WS zahlST_ WS zuST WS
	(
		direktPronomST WS
	)? zwischenST
;

leseZahlEinErg
:
	einlesenST WS zahlST_ WS zuST WS
	(
		direktPronomST WS
	)? ergebnisST
;

stelle returns [ZeichenKette name]
:
	hierST WS istST WS stelleST
	{$name = new ZeichenKette($stelleST.name);}

;

springeZuDirekt returns [Zahl ziel]
:
	springeST WS zuST WS
	(
		direktPronomST WS
	)? posZahlST
	{$ziel = $posZahlST.zahl;}

;

springeWennGrGleich returns [ZeichenKette ziel]
:
	wennST WS größerST WS istST WS springeST WS zuST WS
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

springeWennKleinerGleich returns [ZeichenKette ziel]
:
	wennST WS kleinerGleichST WS istST WS springeST WS zuST WS
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

springeWennGr returns [ZeichenKette ziel]
:
	wennST WS größerST WS istST WS springeST WS zuST WS
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

springeWennKleiner returns [ZeichenKette ziel]
:
	wennST WS kleinerST WS istST WS springeST WS zuST WS
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

springeWennNichtGleich returns [ZeichenKette ziel]
:
	wennST WS ungleichST WS istST WS springeST WS zuST WS
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

springeWennGleich returns [ZeichenKette ziel]
:
	wennST WS gleichST WS istST WS springeST WS zuST WS
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

springe returns [ZeichenKette ziel]
:
	springeST WS zuST WS
	(
		direktPronomST WS
	)? stelleST
	{$ziel = new ZeichenKette($stelleST.name);}

;

vergleiche returns [Zahl a, Zahl b]
:
	vergleichST WS
	(
		zahlST
		{$a = $zahlST.zahl;}

	) WS mitST WS
	(
		zahlST
		{$b = $zahlST.zahl;}

	)
;

zwischenspeicher
:
	speichereST WS ergebnisST
	(
		WS zuST
		(
			direktPronomST WS
		)?
	)? WS zwischenST
;

ausgabe returns [ZeichenKette wortfolge]
:
	ausgebenST WS folgendesST WS ausDPST WS wortfolgeST
	{$wortfolge = new ZeichenKette($wortfolgeST.wortfolge);}

;

leerzeile
:
	macheST WS einST WS leerzeileST
;

einST
:
	EIN
	| EINE
	| EINEN
;

macheST
:
	MACHE
;

leerzeichen
:
	ausgebenST WS leerzeichenST
;

zahlenausgabe returns [Zahl ausgeben]
:
	ausgebenST WS zahlST
	{$ausgeben = $zahlST.zahl;}

;

multipliziere returns [Zahl a, Zahl b]
:
	multipliziereST WS
	(
		zahlST
		{$a = $zahlST.zahl;}

	) WS mitST WS
	(
		zahlST
		{$b = $zahlST.zahl;}

	)
;

dividiere returns [Zahl a, Zahl b]
:
	dividiereST WS
	(
		zahlST
		{$a = $zahlST.zahl;}

	) WS mitST WS
	(
		zahlST
		{$b = $zahlST.zahl;}

	)
;

subtrahiere returns [Zahl a, Zahl b]
:
	subtrahiereST WS
	(
		zahlST
		{$a = $zahlST.zahl;}

	) WS mitST WS
	(
		zahlST
		{$b = $zahlST.zahl;}

	)
;

addiere returns [Zahl a, Zahl b]
:
	addiereST WS
	(
		zahlST
		{$a = $zahlST.zahl;}

	) WS mitST WS
	(
		zahlST
		{$b = $zahlST.zahl;}

	)
;

///////////////
///SATZTEILE///
///////////////

mitST
:
	MIT
;

istST
:
	IST
;

hierST
:
	HIER
;

gabST
:
	GAB
	| WAR
;

zuST
:
	ZU
	| AUF
	| IN
	| ZUR
;

vonST
:
	VON
	| VOM
;

folgendesST
:
	FOLGENDES
;

ausgebenST
:
	GEBE
	| AUSGEBEN
;

ausDPST
:
	AUS_DP
	|
	(
		AUS WS? DP
	)
;

ausST
:
	AUS
;

leerzeichenST
:
	LEERZEICHEN
	| LEERTASTE
;

leerzeileST
:
	LEERZEILE
	| ZEILENUMBRUCH
;

addiereST
:
	ADDIERE
	| ADDIERE
;

subtrahiereST
:
	SUBTRAHIERE
	| SUBTRAHIERE
;

multipliziereST
:
	MULTIPLIZIERE
	| MULTIPLIZIERE
;

dividiereST
:
	DIVIDIERE
	| DIVIDIERE
;

vergleichST
:
	VERGLEICHE
;

springeST
:
	SPRINGE
	|
	(
		GEBE WS ZU
	)
;

stelleST returns [String name]
:
	stelleVorTextST WS STELLE
	{$name = $STELLE.getText();}

;

stelleVorTextST
:
	STELLE_WORT_DP
	|
	(
		STELLE_WORT WS? DP?
	)
;

aufrufST
:
	(
		RUFE WS AUF
	)
	|
	(
		MACHE WS AUFRUF
	)
;

zurückgehenST
:
	(
		GEHE WS ZURÜCK
	)
	| ZURÜCKGEHEN
;

speichereST
:
	SPEICHERE
	| LADE
	| SCHREIBE
;

zwischenST
:
	ZWISCHEN
	| ZWISCHENSPEICHER
;

ergebnisST
:
	ERGEBNIS
	| ERGEBNISSPEICHER
;

registerST returns [Zahl reg]
:
	REGISTER WS
	(
		VON WS
	)? posZahlST
	{$reg = $posZahlST.zahl;}

;

bereichST returns [Zahl anfang, Zahl ende]
:
	VON WS
	(
		registerST
		{$anfang = $registerST.reg;}

	) WS BIS WS
	(
		registerST
		{$ende = $registerST.reg;}

	)
;

stapelST
:
	STAPEL
;

nehmeST
:
	NEHME
;

zahlST returns [Zahl zahl] @init {boolean negieren = false;}
:
	(
		(
			NAGATION
			{negieren = true;}

		)? POS_ZAHL
		{$zahl = new Zahl(- Long.parseLong($POS_ZAHL.getText()));}

	)
	|
	(
		posZahlST
		{$zahl = $posZahlST.zahl;}

	)
;

posZahlST returns [Zahl zahl]
:
	(
		POS_ZAHL
		{$zahl = new Zahl(Long.parseLong($POS_ZAHL.getText()));}

	)
	|
	(
		ergebnisST
		{$zahl = new Zahl(true);}

	)
	|
	(
		zwischenST
		{$zahl = new Zahl(false);}

	)
;

fehlerST
:
	FEHLER
	| FALSCH
;

versionST
:
	VERSION
;

stapelMaxGrST
:
	(
		MAXIMALE WS
		(
			(
				STAPEL WS GRÖẞE
			)
			|
			(
				GRÖẞE WS
				(
					(
						VOM WS STAPEL
					)
					|
					(
						DES WS STAPELS
					)
				)
			)
		)
	)
	|
	(
		STAPEL WS MAXIMUM WS GRÖẞE
	)
;

stapelGrST
:
	(
		STAPEL WS GRÖẞE
	)
	|
	(
		GRÖẞE WS DES WS STAPELS
	)
	|
	(
		GRÖẞE WS VOM WS STAPEL
	)
;

derST
:
	DER
;

wft returns [String teil]
:
	(
		tok = STELLE_WORT
		| tok = DER
		| tok = WORTREIHE_WORT
		| tok = WORTKETTE_WORT
		| tok = WORTFOLGE_WORT
		| tok = LETZTEN
		| tok = ZEICHEN
		| tok = ZEICHENFOLGE
		| tok = ZEICHENKETTE
		| tok = WORT_WORT
		| tok = MENGE
		| tok = ANZAHL
		| tok = ZAHL_WORT
		| tok = EINESEN
		| tok = EINEN
		| tok = EINE
		| tok = EIN
		| tok = LESE
		| tok = ODER
		| tok = KLEINER
		| tok = GRÖẞER
		| tok = UNGLEICH
		| tok = NICHT
		| tok = GLEICH
		| tok = FALLS
		| tok = WENN
		| tok = DES
		| tok = STAPELS
		| tok = VOM
		| tok = MAXIMALE
		| tok = GRÖẞE
		| tok = MAXIMUM
		| tok = VERSION
		| tok = FEHLER
		| tok = FALSCH
		| tok = NAGATION
		| tok = NEHME
		| tok = STAPEL
		| tok = POS_ZAHL
		| tok = REGISTER
		| tok = BIS
		| tok = ERGEBNISSPEICHER
		| tok = ERGEBNIS
		| tok = ZWISCHEN
		| tok = ZWISCHENSPEICHER
		| tok = SPEICHERE
		| tok = GEHE
		| tok = ZURÜCKGEHEN
		| tok = ZURÜCK
		| tok = AUF
		| tok = AUFRUF
		| tok = MACHE
		| tok = RUFE
		| tok = DP
		| tok = SPRINGE
		| tok = VERGLEICHE
		| tok = DIVIDIERE
		| tok = MULTIPLIZIERE
		| tok = SUBTRAHIERE
		| tok = ADDIERE
		| tok = ZEILENUMBRUCH
		| tok = LEERZEILE
		| tok = LEERTASTE
		| tok = LEERZEICHEN
		| tok = AUS
		| tok = AUSGEBEN
		| tok = GEBE
		| tok = FOLGENDES
		| tok = VON
		| tok = ZU
		| tok = GAB
		| tok = WAR
		| tok = MIT
		| tok = IST
		| tok = HIER
		| tok = STELLE
		| tok = REST
		| tok = REST_2
	)
	{$teil = $tok.getText();}

;

wortfolgeST returns [String wortfolge]
@init {StringBuilder wf = new StringBuilder();}
:
	wft
	{wf.append($wft.teil);}

	(
		(
			wft
			{wf.append($wft.teil);}

		)+ WS
		{wf.append(' ');}

	)*
	{$wortfolge = wf.toString();}

;

wennST
:
	(
		WENN
		| FALLS
	) WS ES
;

ungleichST
:
	UNGLEICH
	|
	(
		NICHT WS GLEICH
	)
;

gleichST
:
	GLEICH
;

größerST
:
	GRÖẞER
;

kleinerST
:
	KLEINER
;

größerGleichST
:
	(
		GRÖẞER WS ODER WS GLEICH
	)
	|
	(
		GLEICH WS ODER WS GRÖẞER
	)
;

kleinerGleichST
:
	(
		KLEINER WS ODER WS GLEICH
	)
	|
	(
		GLEICH WS ODER WS KLEINER
	)
;

einlesenST
:
	(
		LESE WS EIN
	)
	| EINESEN
;

zahlST_
:
	ZAHL_WORT
;

registerST_
:
	REGISTER
;

anzahlST
:
	ANZAHL
	| MENGE
;

wortST
:
	WORT_WORT
	| ZEICHENKETTE
	| ZEICHENFOLGE
;

zeichenST
:
	ZEICHEN
;

letztenFehlerST
:
	LETZTEN WS FEHLER
;

PUNKT
:
	'.'
;

WS
:
	[ \t\r\n]+
;

STELLE_WORT_DP
:
	'stelle:'
;

STELLE_WORT
:
	'stelle'
;

DIE
:
	'die'
;

DER
:
	'der'
;

DAS
:
	'das'
;

DEM
:
	'dem'
;

DEN
:
	'den'
;

WORTREIHE_WORT
:
	'wortreihe'
;

WORTKETTE_WORT
:
	'wortkette'
;

WORTFOLGE_WORT
:
	'wortfolge'
;

LETZTEN
:
	'letzten'
;

ZEICHEN
:
	'zeichen'
;

ZEICHENFOLGE
:
	'zeichenfolge'
;

ZEICHENKETTE
:
	'zeichenkette'
;

WORT_WORT
:
	'wort'
;

MENGE
:
	'menge'
;

ANZAHL
:
	'anzahl'
;

ZAHL_WORT
:
	'zahl'
;

EINESEN
:
	'einlesen'
;

EINEN
:
	'einen'
;

EINE
:
	'eine'
;

EIN
:
	'ein'
;

LESE
:
	'lese'
;

ODER
:
	'oder'
;

KLEINER
:
	'kleiner'
;

GRÖẞER
:
	'größer'
;

UNGLEICH
:
	'ungleich'
;

NICHT
:
	'nicht'
;

GLEICH
:
	'gleich'
;

FALLS
:
	'falls'
;

WENN
:
	'wenn'
;

ES
:
	'es'
;

DES
:
	'des'
;

STAPELS
:
	'stapels'
;

VOM
:
	'vom'
;

MAXIMALE
:
	'maximale'
;

GRÖẞE
:
	'größe'
;

MAXIMUM
:
	'maximum'
;

VERSION
:
	'version'
;

FEHLER
:
	'fehler'
;

FALSCH
:
	'falsch'
;

NAGATION
:
	'-'
;

NEHME
:
	'nehme'
;

STAPEL
:
	'stapel'
;

POS_ZAHL
:
	[0-9]+
;

REGISTER
:
	'register'
;

BIS
:
	'bis'
;

ERGEBNISSPEICHER
:
	'ergebnisspeicher'
;

ERGEBNIS
:
	'ergebnis'
;

ZWISCHEN
:
	'zwischen'
;

ZWISCHENSPEICHER
:
	'zwischenspeicher'
;

SCHREIBE
:
	'schreibe'
;

SPEICHERE
:
	'speichere'
;

LADE
:
	'lade'
;

GEHE
:
	'gehe'
;

ZURÜCKGEHEN
:
	'zurückgehen'
;

ZURÜCK
:
	'zurück'
;

AUF
:
	'auf'
;

AUFRUF
:
	'aufruf'
;

MACHE
:
	'mache'
;

RUFE
:
	'rufe'
;

SPRINGE
:
	'springe'
;

VERGLEICHE
:
	'vergleiche'
;

DIVIDIERE
:
	'dividiere'
;

MULTIPLIZIERE
:
	'multipliziere'
;

SUBTRAHIERE
:
	'subtrahiere'
;

ADDIERE
:
	'addiere'
;

ZEILENUMBRUCH
:
	'zeilenumbruch'
;

LEERZEILE
:
	'leerzeile'
;

LEERTASTE
:
	'leertaste'
;

LEERZEICHEN
:
	'leerzeichen'
;

AUS_DP
:
	'aus:'
;

DP
:
	':'
;

AUS
:
	'aus'
;

AUSGEBEN
:
	'ausgeben'
;

GEBE
:
	'gebe'
;

FOLGENDES
:
	'folgendes'
;

VON
:
	'von'
;

ZUR
:
	'zur'
;

ZU
:
	'zu'
;

IN
:
	'in'
;

GAB
:
	'gab'
;

WAR
:
	'war'
;

MIT
:
	'mit'
;

IST
:
	'ist'
;

HIER
:
	'hier'
;

STELLE
:
	[A-Z_ÜÄÖẞ]+
;

REST
:
	(
		~( '.' | ':' | ' ' | '\t' | '\r' | '\n' | [A-Z_ÜÄÖẞ] )
	)+
;

REST_2
:
	[a-z()\\/\[\]}{\^+#'*~\=!"²³\§\%\&?ßüäö´`<>|,;°]+
;
