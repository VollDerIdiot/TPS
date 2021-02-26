grammar TPS_ANTLR;

@header {
package genearatedsources.antlr;
}

datei
:
	(
		satz
		(
			WS
		)?
	)+
;

satz
:
	satzWert
	(
		WS
	)? PUNKT
;

satzWert
:
	addiere
	| subtrahiere
	| multipliziere
	| dividiere
	| zahlenausgabe
	| leerzeichen
	| leerzeile
	| ausgabe
	| zwischenspeicher
	| vergleiche
	| springe
	| springeWennNichtGleich
	| springeWennGleich
	| springeWennKleiner
	| springeWennGrößer
	| springeWennKleinerGleich
	| springeWennGrößerGleich
	| springeZuDirekt
	| stelle
	| leseZahlEinErg
	| leseZahlEinZwischen
	| ladeInRegister
	| ladeVomRegisterErg
	| ladeVomRegisterZw
	| ladeRegisterAnzahlErg
	| ladeRegisterAnzahlZw
	| registerausgabe
	| registerWortEinlesen
	| registerZeichenEinlesen
	| springeWennFalsch
	| versionErg
	| versionZw
	| versionReg
	| stapelMaxGrößeErg
	| stapelMaxGrößeZw
	| stapelMaxGrößeReg
	| stapelGrößeErg
	| stapelGrößeZw
	| stapelGrößeReg
	| vergleicheRegister
	| vergleicheRegisterText
	| rufeAuf
	| rufeAufWennGleich
	| rufeAufWennNichtGleich
	| rufeAufWennKleiner
	| rufeAufGrößer
	| rufeAufKleinerGleich
	| rufeAufGrößerGleich
	| geheZurück
	| rufeAufDirekt
	| stapelSchreiben
	| stapelLesenErg
	| stapelLesenZw
	| stapelLesenReg
	| rufeAufWennFalsch
	| letzterFehler
;

///////////////
///SATZWERTE///
///////////////

letzterFehler
:
	nehmeST WS letztenFehlerST
;

rufeAufWennFalsch
:
	wennST WS fehlerST WS gabST WS aufrufST WS zuST WS stelleST
;

stapelLesenReg
:
	nehmeST WS vonST WS stapelST WS zuST WS registerST
;

stapelLesenZw
:
	nehmeST WS vonST WS stapelST WS zuST WS zwischenST
;

stapelLesenErg
:
	nehmeST WS vonST WS stapelST WS zuST WS ergebnisST
;

stapelSchreiben
:
	speichereST WS zahlST WS zuST WS stapelST
;

rufeAufDirekt
:
	aufrufST WS zuST WS posZahlST
;

geheZurück
:
	zurückgehenST
;

rufeAufGrößerGleich
:
	wennST WS größerGleichST WS aufrufST WS zuST WS stelleST
;

rufeAufKleinerGleich
:
	wennST WS kleinerGleichST WS aufrufST WS zuST WS stelleST
;

rufeAufGrößer
:
	wennST WS größerST WS aufrufST WS zuST WS stelleST
;

rufeAufWennKleiner
:
	wennST WS kleinerST WS aufrufST WS zuST WS stelleST
;

rufeAufWennNichtGleich
:
	wennST WS ungleichST WS aufrufST WS zuST WS stelleST
;

rufeAufWennGleich
:
	wennST WS gleichST WS aufrufST WS zuST WS stelleST
;

rufeAuf
:
	aufrufST WS zuST WS stelleST
;

vergleicheRegisterText
:
	vergleichST WS bereichST WS mitST WS derST WS wortfolgeST
;

vergleicheRegister
:
	vergleichST WS bereichST WS mitST WS bereichST
;

stapelGrößeZw
:
	speichereST WS stapelGrST WS zuST WS zwischenST
;

stapelGrößeReg
:
	speichereST WS stapelGrST WS zuST WS registerST
;

stapelGrößeErg
:
	speichereST WS stapelGrST WS zuST WS ergebnisST
;

stapelMaxGrößeReg
:
	speichereST WS stapelMaxGrST WS zuST WS registerST
;

stapelMaxGrößeZw
:
	speichereST WS stapelMaxGrST WS zuST WS zwischenST
;

stapelMaxGrößeErg
:
	speichereST WS stapelMaxGrST WS zuST WS ergebnisST
;

versionZw
:
	speichereST WS versionST WS zuST WS zwischenST
;

versionReg
:
	speichereST WS versionST WS zuST WS registerST
;

versionErg
:
	speichereST WS versionST WS zuST WS ergebnisST
;

springeWennFalsch
:
	wennST WS fehlerST WS gabST WS springeST WS zuST WS stelleST
;

registerZeichenEinlesen
:
	einlesenST WS posZahlST WS zeichenST WS zuST WS registerST
;

registerWortEinlesen
:
	einlesenST WS wortST WS zuST WS registerST
;

registerausgabe
:
	ausgebenST WS bereichST
;

ladeRegisterAnzahlZw
:
	speichereST WS anzahlST WS registerST_ WS zwischenST
;

ladeRegisterAnzahlErg
:
	speichereST WS anzahlST WS registerST_ WS ergebnisST
;

ladeVomRegisterZw
:
	speichereST WS registerST WS zuST WS zwischenST
;

ladeVomRegisterErg
:
	speichereST WS registerST WS zuST WS ergebnisST
;

ladeInRegister
:
	speichereST WS zahlST WS zuST WS registerST
;

leseZahlEinZwischen
:
	einlesenST WS zahlST_ WS zwischenST
;

leseZahlEinErg
:
	einlesenST WS zahlST_ WS ergebnisST
;

stelle
:
	hierST WS istST WS stelleST
;

springeZuDirekt
:
	springeST WS zuST WS posZahlST
;

springeWennGrößerGleich
:
	wennST WS größerST WS springeST WS zuST WS stelleST
;

springeWennKleinerGleich
:
	wennST WS kleinerGleichST WS springeST WS zuST WS stelleST
;

springeWennGrößer
:
	wennST WS größerST WS springeST WS zuST WS stelleST
;

springeWennKleiner
:
	wennST WS kleinerST WS springeST WS zuST WS stelleST
;

springeWennNichtGleich
:
	wennST WS ungleichST WS springeST WS zuST WS stelleST
;

springeWennGleich
:
	wennST WS gleichST WS springeST WS zuST WS stelleST
;

springe
:
	springeST WS zuST WS stelleST
;

vergleiche
:
	vergleichST WS zahlST WS mitST WS zahlST
;

zwischenspeicher
:
	speichereST WS ergebnisST WS zuST WS zwischenST
;

ausgabe
:
	ausgebenST WS folgendesST WS wortfolgeST
;

leerzeile
:
	ausgebenST WS leerzeileST
;

leerzeichen
:
	ausgebenST WS leerzeichenST
;

zahlenausgabe
:
	ausgebenST WS zahlST
;

multipliziere
:
	multipliziereST WS zahlST WS mitST WS zahlST
;

dividiere
:
	dividiereST WS zahlST WS mitST WS zahlST
;

subtrahiere
:
	subtrahiereST WS zahlST WS mitST WS zahlST
;

addiere
:
	addiereST WS zahlST WS mitST WS zahlST
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
;

vonST
:
	VON
;

folgendesST
:
	FOLGENDES
;

ausgebenST
:
	(
		GEBE WS AUS
	)
	| AUSGEBEN
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

stelleST
:
	STELLE_WORT
	(
		WS
	)?
	(
		DP
	)? WS STELLE
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

registerST returns [int reg]
:
	REGISTER WS
	(
		VON WS
	)? POS_ZAHL
	{$reg = Integer.parseInt($POS_ZAHL.getText());}
;

bereichST returns [int regA, int regB]
:
	VON WS
	(
		registerST
		{$regA = $registerST.reg;}

	) WS BIS WS
	(
		registerST
		{$regB = $registerST.reg;}

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

zahlST returns [long zahl] @init {boolean negieren = false;}
:
	(
		NAGATION
		{negieren = true;}

	)? POS_ZAHL
	{ $zahl = (negieren ? ( - Long.parseLong($POS_ZAHL.getText()) ): ( Long.parseLong($POS_ZAHL.getText()) ) ) ;  }

;

posZahlST returns [long zahl]
:
	POS_ZAHL
	{$zahl = Long.parseLong($POS_ZAHL.getText());}

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
		MAXIMALE WS STAPEL WS GRÖẞE
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

wortfolgeST
:
	(
		WORTFOLGE_WORT
		| WORTKETTE_WORT
		| WORTREIHE_WORT
	)
	(
		WS
		(
			STELLE_WORT
			| DER
			| WORTREIHE_WORT
			| WORTKETTE_WORT
			| WORTFOLGE_WORT
			| LETZTEN
			| ZEICHEN
			| ZEICHENFOLGE
			| ZEICHENKETTE
			| WORT_WORT
			| MENGE
			| ANZAHL
			| ZAHL_WORT
			| EINESEN
			| EIN
			| LESE
			| ODER
			| KLEINER
			| GRÖẞER
			| UNGLEICH
			| NICHT
			| GLEICH
			| FALLS
			| WENN
			| DES
			| STAPELS
			| VOM
			| MAXIMALE
			| GRÖẞE
			| MAXIMUM
			| VERSION
			| FEHLER
			| FALSCH
			| NAGATION
			| NEHME
			| STAPEL
			| POS_ZAHL
			| REGISTER
			| BIS
			| ERGEBNISSPEICHER
			| ERGEBNIS
			| ZWISCHEN
			| ZWISCHENSPEICHER
			| SPEICHERE
			| GEHE
			| ZURÜCKGEHEN
			| ZURÜCK
			| AUF
			| AUFRUF
			| MACHE
			| RUFE
			| DP
			| SPRINGE
			| VERGLEICHE
			| DIVIDIERE
			| MULTIPLIZIERE
			| SUBTRAHIERE
			| ADDIERE
			| ZEILENUMBRUCH
			| LEERZEILE
			| LEERTASTE
			| LEERZEICHEN
			| AUS
			| AUSGEBEN
			| GEBE
			| FOLGENDES
			| VON
			| ZU
			| GAB
			| WAR
			| MIT
			| IST
			| HIER
			| PUNKT
			| STELLE
			| REST
			| REST_2
		)*
	)+
;

wennST
:
	WENN
	| FALLS
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

WS
:
	[ \t\r\n]+
;

STELLE_WORT
:
	'stelle'
;

DER
:
	'der'
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
	'von'
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

SPEICHERE
:
	'speichere'
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

DP
:
	':'
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

ZU
:
	'zu'
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

PUNKT
:
	[.]
;

STELLE
:
	[A-z_ÜÄÖẞ]
;

REST
:
	[^.]+
;

REST_2
:
	[a-z()\\/\[\]}{\^+#'*~\-=!"²³\§\%\&?ßüäö´`<>|,;°]+
;

