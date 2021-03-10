// Generated from TPS_ANTLR.g4 by ANTLR 4.4

package genearatedsources.antlr;

import de.hechler.patrick.tps.antlr.enums.*;
import de.hechler.patrick.tps.antlr.objects.*;
import de.hechler.patrick.tps.antlr.objects.satz.*;

import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TPS_ANTLRParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUNKT=1, WS=2, STELLE_WORT_DP=3, STELLE_WORT=4, DIE=5, DER=6, DAS=7, DEM=8, 
		DEN=9, WORTREIHE_WORT=10, WORTKETTE_WORT=11, WORTFOLGE_WORT=12, LETZTEN=13, 
		ZEICHEN=14, ZEICHENFOLGE=15, ZEICHENKETTE=16, WORT_WORT=17, MENGE=18, 
		ANZAHL=19, ZAHL_WORT=20, EINESEN=21, EINEN=22, EINE=23, EIN=24, LESE=25, 
		ODER=26, KLEINER=27, GRÖẞER=28, UNGLEICH=29, NICHT=30, GLEICH=31, FALLS=32, 
		WENN=33, ES=34, DES=35, STAPELS=36, VOM=37, MAXIMALE=38, GRÖẞE=39, MAXIMUM=40, 
		VERSION=41, FEHLER=42, FALSCH=43, NAGATION=44, NEHME=45, STAPEL=46, POS_ZAHL=47, 
		REGISTER=48, BIS=49, ERGEBNISSPEICHER=50, ERGEBNIS=51, ZWISCHEN=52, ZWISCHENSPEICHER=53, 
		SCHREIBE=54, SPEICHERE=55, LADE=56, GEHE=57, ZURÜCKGEHEN=58, ZURÜCK=59, 
		AUF=60, AUFRUF=61, MACHE=62, RUFE=63, SPRINGE=64, VERGLEICHE=65, DIVIDIERE=66, 
		MULTIPLIZIERE=67, SUBTRAHIERE=68, ADDIERE=69, ZEILENUMBRUCH=70, LEERZEILE=71, 
		LEERTASTE=72, LEERZEICHEN=73, AUS_DP=74, DP=75, AUS=76, AUSGEBEN=77, GEBE=78, 
		FOLGENDES=79, VON=80, ZUR=81, ZU=82, IN=83, GAB=84, WAR=85, MIT=86, IST=87, 
		HIER=88, STELLE=89, REST=90, REST_2=91;
	public static final String[] tokenNames = {
		"<INVALID>", "'.'", "WS", "'stelle:'", "'stelle'", "'die'", "'der'", "'das'", 
		"'dem'", "'den'", "'wortreihe'", "'wortkette'", "'wortfolge'", "'letzten'", 
		"'zeichen'", "'zeichenfolge'", "'zeichenkette'", "'wort'", "'menge'", 
		"'anzahl'", "'zahl'", "'einlesen'", "'einen'", "'eine'", "'ein'", "'lese'", 
		"'oder'", "'kleiner'", "'größer'", "'ungleich'", "'nicht'", "'gleich'", 
		"'falls'", "'wenn'", "'es'", "'des'", "'stapels'", "'vom'", "'maximale'", 
		"'größe'", "'maximum'", "'version'", "'fehler'", "'falsch'", "'-'", "'nehme'", 
		"'stapel'", "POS_ZAHL", "'register'", "'bis'", "'ergebnisspeicher'", "'ergebnis'", 
		"'zwischen'", "'zwischenspeicher'", "'schreibe'", "'speichere'", "'lade'", 
		"'gehe'", "'zurückgehen'", "'zurück'", "'auf'", "'aufruf'", "'mache'", 
		"'rufe'", "'springe'", "'vergleiche'", "'dividiere'", "'multipliziere'", 
		"'subtrahiere'", "'addiere'", "'zeilenumbruch'", "'leerzeile'", "'leertaste'", 
		"'leerzeichen'", "'aus:'", "':'", "'aus'", "'ausgeben'", "'gebe'", "'folgendes'", 
		"'von'", "'zur'", "'zu'", "'in'", "'gab'", "'war'", "'mit'", "'ist'", 
		"'hier'", "STELLE", "REST", "REST_2"
	};
	public static final int
		RULE_datei = 0, RULE_satz = 1, RULE_satzWert = 2, RULE_letzterFehler = 3, 
		RULE_rufeAufWennFalsch = 4, RULE_stapelLesenReg = 5, RULE_stapelLesenZw = 6, 
		RULE_stapelLesenErg = 7, RULE_stapelSchreiben = 8, RULE_rufeAufDirekt = 9, 
		RULE_geheZur = 10, RULE_rufeAufGrGleich = 11, RULE_rufeAufKleinerGleich = 12, 
		RULE_rufeAufGr = 13, RULE_rufeAufWennKleiner = 14, RULE_rufeAufWennNichtGleich = 15, 
		RULE_rufeAufWennGleich = 16, RULE_rufeAuf = 17, RULE_vergleicheRegisterText = 18, 
		RULE_vergleicheRegister = 19, RULE_stapelGrZw = 20, RULE_stapelGrReg = 21, 
		RULE_stapelGrErg = 22, RULE_stapelMaxGrReg = 23, RULE_stapelMaxGrZw = 24, 
		RULE_stapelMaxGrErg = 25, RULE_versionZw = 26, RULE_versionReg = 27, RULE_versionErg = 28, 
		RULE_springeWennFalsch = 29, RULE_registerZeichenEinlesen = 30, RULE_registerWortEinlesen = 31, 
		RULE_registerausgabe = 32, RULE_ladeRegisterAnzahlZw = 33, RULE_ladeRegisterAnzahlErg = 34, 
		RULE_direktPronomST = 35, RULE_ladeVomRegisterZw = 36, RULE_ladeVomRegisterErg = 37, 
		RULE_ladeInRegister = 38, RULE_leseZahlEinZwischen = 39, RULE_leseZahlEinErg = 40, 
		RULE_stelle = 41, RULE_springeZuDirekt = 42, RULE_springeWennGrGleich = 43, 
		RULE_springeWennKleinerGleich = 44, RULE_springeWennGr = 45, RULE_springeWennKleiner = 46, 
		RULE_springeWennNichtGleich = 47, RULE_springeWennGleich = 48, RULE_springe = 49, 
		RULE_vergleiche = 50, RULE_zwischenspeicher = 51, RULE_ausgabe = 52, RULE_leerzeile = 53, 
		RULE_einST = 54, RULE_macheST = 55, RULE_leerzeichen = 56, RULE_zahlenausgabe = 57, 
		RULE_multipliziere = 58, RULE_dividiere = 59, RULE_subtrahiere = 60, RULE_addiere = 61, 
		RULE_mitST = 62, RULE_istST = 63, RULE_hierST = 64, RULE_gabST = 65, RULE_zuST = 66, 
		RULE_vonST = 67, RULE_folgendesST = 68, RULE_ausgebenST = 69, RULE_ausDPST = 70, 
		RULE_ausST = 71, RULE_leerzeichenST = 72, RULE_leerzeileST = 73, RULE_addiereST = 74, 
		RULE_subtrahiereST = 75, RULE_multipliziereST = 76, RULE_dividiereST = 77, 
		RULE_vergleichST = 78, RULE_springeST = 79, RULE_stelleST = 80, RULE_stelleVorTextST = 81, 
		RULE_aufrufST = 82, RULE_zurückgehenST = 83, RULE_speichereST = 84, RULE_zwischenST = 85, 
		RULE_ergebnisST = 86, RULE_registerST = 87, RULE_bereichST = 88, RULE_stapelST = 89, 
		RULE_nehmeST = 90, RULE_zahlST = 91, RULE_posZahlST = 92, RULE_fehlerST = 93, 
		RULE_versionST = 94, RULE_stapelMaxGrST = 95, RULE_stapelGrST = 96, RULE_derST = 97, 
		RULE_wft = 98, RULE_wortfolgeST = 99, RULE_wennST = 100, RULE_ungleichST = 101, 
		RULE_gleichST = 102, RULE_größerST = 103, RULE_kleinerST = 104, RULE_größerGleichST = 105, 
		RULE_kleinerGleichST = 106, RULE_einlesenST = 107, RULE_zahlST_ = 108, 
		RULE_registerST_ = 109, RULE_anzahlST = 110, RULE_wortST = 111, RULE_zeichenST = 112, 
		RULE_letztenFehlerST = 113;
	public static final String[] ruleNames = {
		"datei", "satz", "satzWert", "letzterFehler", "rufeAufWennFalsch", "stapelLesenReg", 
		"stapelLesenZw", "stapelLesenErg", "stapelSchreiben", "rufeAufDirekt", 
		"geheZur", "rufeAufGrGleich", "rufeAufKleinerGleich", "rufeAufGr", "rufeAufWennKleiner", 
		"rufeAufWennNichtGleich", "rufeAufWennGleich", "rufeAuf", "vergleicheRegisterText", 
		"vergleicheRegister", "stapelGrZw", "stapelGrReg", "stapelGrErg", "stapelMaxGrReg", 
		"stapelMaxGrZw", "stapelMaxGrErg", "versionZw", "versionReg", "versionErg", 
		"springeWennFalsch", "registerZeichenEinlesen", "registerWortEinlesen", 
		"registerausgabe", "ladeRegisterAnzahlZw", "ladeRegisterAnzahlErg", "direktPronomST", 
		"ladeVomRegisterZw", "ladeVomRegisterErg", "ladeInRegister", "leseZahlEinZwischen", 
		"leseZahlEinErg", "stelle", "springeZuDirekt", "springeWennGrGleich", 
		"springeWennKleinerGleich", "springeWennGr", "springeWennKleiner", "springeWennNichtGleich", 
		"springeWennGleich", "springe", "vergleiche", "zwischenspeicher", "ausgabe", 
		"leerzeile", "einST", "macheST", "leerzeichen", "zahlenausgabe", "multipliziere", 
		"dividiere", "subtrahiere", "addiere", "mitST", "istST", "hierST", "gabST", 
		"zuST", "vonST", "folgendesST", "ausgebenST", "ausDPST", "ausST", "leerzeichenST", 
		"leerzeileST", "addiereST", "subtrahiereST", "multipliziereST", "dividiereST", 
		"vergleichST", "springeST", "stelleST", "stelleVorTextST", "aufrufST", 
		"zurückgehenST", "speichereST", "zwischenST", "ergebnisST", "registerST", 
		"bereichST", "stapelST", "nehmeST", "zahlST", "posZahlST", "fehlerST", 
		"versionST", "stapelMaxGrST", "stapelGrST", "derST", "wft", "wortfolgeST", 
		"wennST", "ungleichST", "gleichST", "größerST", "kleinerST", "größerGleichST", 
		"kleinerGleichST", "einlesenST", "zahlST_", "registerST_", "anzahlST", 
		"wortST", "zeichenST", "letztenFehlerST"
	};

	@Override
	public String getGrammarFileName() { return "TPS_ANTLR.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	public int line(){ return _ctx.start.getLine();}

	public TPS_ANTLRParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DateiContext extends ParserRuleContext {
		public List<Satz> inhalt;
		public SatzContext satz;
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public SatzContext satz(int i) {
			return getRuleContext(SatzContext.class,i);
		}
		public TerminalNode EOF() { return getToken(TPS_ANTLRParser.EOF, 0); }
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public List<SatzContext> satz() {
			return getRuleContexts(SatzContext.class);
		}
		public DateiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datei; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterDatei(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitDatei(this);
		}
	}

	public final DateiContext datei() throws RecognitionException {
		DateiContext _localctx = new DateiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_datei);
		((DateiContext)_localctx).inhalt =  new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(228); ((DateiContext)_localctx).satz = satz();
				setState(230);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(229); match(WS);
					}
				}

				_localctx.inhalt.add(((DateiContext)_localctx).satz.inhalt);
				}
				}
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EINESEN) | (1L << LESE) | (1L << FALLS) | (1L << WENN) | (1L << NEHME) | (1L << SCHREIBE) | (1L << SPEICHERE) | (1L << LADE) | (1L << GEHE) | (1L << ZURÜCKGEHEN) | (1L << MACHE) | (1L << RUFE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SPRINGE - 64)) | (1L << (VERGLEICHE - 64)) | (1L << (DIVIDIERE - 64)) | (1L << (MULTIPLIZIERE - 64)) | (1L << (SUBTRAHIERE - 64)) | (1L << (ADDIERE - 64)) | (1L << (AUSGEBEN - 64)) | (1L << (GEBE - 64)) | (1L << (HIER - 64)))) != 0) );
			setState(238); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SatzContext extends ParserRuleContext {
		public int zeile;
		public Satz inhalt;
		public SatzWertContext satzWert;
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public SatzWertContext satzWert() {
			return getRuleContext(SatzWertContext.class,0);
		}
		public TerminalNode PUNKT() { return getToken(TPS_ANTLRParser.PUNKT, 0); }
		public SatzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_satz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSatz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSatz(this);
		}
	}

	public final SatzContext satz() throws RecognitionException {
		SatzContext _localctx = new SatzContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_satz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((SatzContext)_localctx).zeile =  line();
			setState(241); ((SatzContext)_localctx).satzWert = satzWert();
			setState(243);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(242); match(WS);
				}
			}

			setState(245); match(PUNKT);
			((SatzContext)_localctx).inhalt =  ((SatzContext)_localctx).satzWert.inhalt;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SatzWertContext extends ParserRuleContext {
		public Satz inhalt;
		public AddiereContext addiere;
		public SubtrahiereContext subtrahiere;
		public MultipliziereContext multipliziere;
		public DividiereContext dividiere;
		public ZahlenausgabeContext zahlenausgabe;
		public AusgabeContext ausgabe;
		public VergleicheContext vergleiche;
		public SpringeContext springe;
		public SpringeWennNichtGleichContext springeWennNichtGleich;
		public SpringeWennGleichContext springeWennGleich;
		public SpringeWennKleinerContext springeWennKleiner;
		public SpringeWennGrContext springeWennGr;
		public SpringeWennKleinerGleichContext springeWennKleinerGleich;
		public SpringeWennGrGleichContext springeWennGrGleich;
		public SpringeZuDirektContext springeZuDirekt;
		public StelleContext stelle;
		public LadeInRegisterContext ladeInRegister;
		public LadeVomRegisterErgContext ladeVomRegisterErg;
		public LadeVomRegisterZwContext ladeVomRegisterZw;
		public RegisterausgabeContext registerausgabe;
		public RegisterWortEinlesenContext registerWortEinlesen;
		public RegisterZeichenEinlesenContext registerZeichenEinlesen;
		public SpringeWennFalschContext springeWennFalsch;
		public VersionRegContext versionReg;
		public StapelMaxGrRegContext stapelMaxGrReg;
		public StapelGrRegContext stapelGrReg;
		public VergleicheRegisterContext vergleicheRegister;
		public VergleicheRegisterTextContext vergleicheRegisterText;
		public RufeAufContext rufeAuf;
		public RufeAufWennGleichContext rufeAufWennGleich;
		public RufeAufWennNichtGleichContext rufeAufWennNichtGleich;
		public RufeAufWennKleinerContext rufeAufWennKleiner;
		public RufeAufGrContext rufeAufGr;
		public RufeAufKleinerGleichContext rufeAufKleinerGleich;
		public RufeAufGrGleichContext rufeAufGrGleich;
		public RufeAufDirektContext rufeAufDirekt;
		public StapelSchreibenContext stapelSchreiben;
		public StapelLesenRegContext stapelLesenReg;
		public RufeAufWennFalschContext rufeAufWennFalsch;
		public RufeAufWennNichtGleichContext rufeAufWennNichtGleich() {
			return getRuleContext(RufeAufWennNichtGleichContext.class,0);
		}
		public RegisterZeichenEinlesenContext registerZeichenEinlesen() {
			return getRuleContext(RegisterZeichenEinlesenContext.class,0);
		}
		public VergleicheRegisterContext vergleicheRegister() {
			return getRuleContext(VergleicheRegisterContext.class,0);
		}
		public SpringeWennNichtGleichContext springeWennNichtGleich() {
			return getRuleContext(SpringeWennNichtGleichContext.class,0);
		}
		public LadeVomRegisterErgContext ladeVomRegisterErg() {
			return getRuleContext(LadeVomRegisterErgContext.class,0);
		}
		public RegisterausgabeContext registerausgabe() {
			return getRuleContext(RegisterausgabeContext.class,0);
		}
		public VersionRegContext versionReg() {
			return getRuleContext(VersionRegContext.class,0);
		}
		public RegisterWortEinlesenContext registerWortEinlesen() {
			return getRuleContext(RegisterWortEinlesenContext.class,0);
		}
		public RufeAufGrContext rufeAufGr() {
			return getRuleContext(RufeAufGrContext.class,0);
		}
		public StapelMaxGrRegContext stapelMaxGrReg() {
			return getRuleContext(StapelMaxGrRegContext.class,0);
		}
		public StapelGrZwContext stapelGrZw() {
			return getRuleContext(StapelGrZwContext.class,0);
		}
		public StelleContext stelle() {
			return getRuleContext(StelleContext.class,0);
		}
		public StapelGrRegContext stapelGrReg() {
			return getRuleContext(StapelGrRegContext.class,0);
		}
		public MultipliziereContext multipliziere() {
			return getRuleContext(MultipliziereContext.class,0);
		}
		public StapelLesenRegContext stapelLesenReg() {
			return getRuleContext(StapelLesenRegContext.class,0);
		}
		public LeseZahlEinZwischenContext leseZahlEinZwischen() {
			return getRuleContext(LeseZahlEinZwischenContext.class,0);
		}
		public StapelGrErgContext stapelGrErg() {
			return getRuleContext(StapelGrErgContext.class,0);
		}
		public RufeAufContext rufeAuf() {
			return getRuleContext(RufeAufContext.class,0);
		}
		public VersionErgContext versionErg() {
			return getRuleContext(VersionErgContext.class,0);
		}
		public SpringeWennGrGleichContext springeWennGrGleich() {
			return getRuleContext(SpringeWennGrGleichContext.class,0);
		}
		public RufeAufWennFalschContext rufeAufWennFalsch() {
			return getRuleContext(RufeAufWennFalschContext.class,0);
		}
		public SpringeWennGrContext springeWennGr() {
			return getRuleContext(SpringeWennGrContext.class,0);
		}
		public SpringeWennKleinerGleichContext springeWennKleinerGleich() {
			return getRuleContext(SpringeWennKleinerGleichContext.class,0);
		}
		public DividiereContext dividiere() {
			return getRuleContext(DividiereContext.class,0);
		}
		public SubtrahiereContext subtrahiere() {
			return getRuleContext(SubtrahiereContext.class,0);
		}
		public LetzterFehlerContext letzterFehler() {
			return getRuleContext(LetzterFehlerContext.class,0);
		}
		public RufeAufKleinerGleichContext rufeAufKleinerGleich() {
			return getRuleContext(RufeAufKleinerGleichContext.class,0);
		}
		public ZahlenausgabeContext zahlenausgabe() {
			return getRuleContext(ZahlenausgabeContext.class,0);
		}
		public LeseZahlEinErgContext leseZahlEinErg() {
			return getRuleContext(LeseZahlEinErgContext.class,0);
		}
		public LeerzeichenContext leerzeichen() {
			return getRuleContext(LeerzeichenContext.class,0);
		}
		public RufeAufDirektContext rufeAufDirekt() {
			return getRuleContext(RufeAufDirektContext.class,0);
		}
		public LadeRegisterAnzahlZwContext ladeRegisterAnzahlZw() {
			return getRuleContext(LadeRegisterAnzahlZwContext.class,0);
		}
		public StapelMaxGrZwContext stapelMaxGrZw() {
			return getRuleContext(StapelMaxGrZwContext.class,0);
		}
		public StapelLesenZwContext stapelLesenZw() {
			return getRuleContext(StapelLesenZwContext.class,0);
		}
		public StapelLesenErgContext stapelLesenErg() {
			return getRuleContext(StapelLesenErgContext.class,0);
		}
		public VergleicheContext vergleiche() {
			return getRuleContext(VergleicheContext.class,0);
		}
		public StapelMaxGrErgContext stapelMaxGrErg() {
			return getRuleContext(StapelMaxGrErgContext.class,0);
		}
		public RufeAufWennKleinerContext rufeAufWennKleiner() {
			return getRuleContext(RufeAufWennKleinerContext.class,0);
		}
		public VersionZwContext versionZw() {
			return getRuleContext(VersionZwContext.class,0);
		}
		public LadeRegisterAnzahlErgContext ladeRegisterAnzahlErg() {
			return getRuleContext(LadeRegisterAnzahlErgContext.class,0);
		}
		public SpringeContext springe() {
			return getRuleContext(SpringeContext.class,0);
		}
		public LadeVomRegisterZwContext ladeVomRegisterZw() {
			return getRuleContext(LadeVomRegisterZwContext.class,0);
		}
		public RufeAufWennGleichContext rufeAufWennGleich() {
			return getRuleContext(RufeAufWennGleichContext.class,0);
		}
		public RufeAufGrGleichContext rufeAufGrGleich() {
			return getRuleContext(RufeAufGrGleichContext.class,0);
		}
		public VergleicheRegisterTextContext vergleicheRegisterText() {
			return getRuleContext(VergleicheRegisterTextContext.class,0);
		}
		public LeerzeileContext leerzeile() {
			return getRuleContext(LeerzeileContext.class,0);
		}
		public AusgabeContext ausgabe() {
			return getRuleContext(AusgabeContext.class,0);
		}
		public LadeInRegisterContext ladeInRegister() {
			return getRuleContext(LadeInRegisterContext.class,0);
		}
		public SpringeWennFalschContext springeWennFalsch() {
			return getRuleContext(SpringeWennFalschContext.class,0);
		}
		public StapelSchreibenContext stapelSchreiben() {
			return getRuleContext(StapelSchreibenContext.class,0);
		}
		public AddiereContext addiere() {
			return getRuleContext(AddiereContext.class,0);
		}
		public SpringeWennGleichContext springeWennGleich() {
			return getRuleContext(SpringeWennGleichContext.class,0);
		}
		public GeheZurContext geheZur() {
			return getRuleContext(GeheZurContext.class,0);
		}
		public SpringeZuDirektContext springeZuDirekt() {
			return getRuleContext(SpringeZuDirektContext.class,0);
		}
		public SpringeWennKleinerContext springeWennKleiner() {
			return getRuleContext(SpringeWennKleinerContext.class,0);
		}
		public ZwischenspeicherContext zwischenspeicher() {
			return getRuleContext(ZwischenspeicherContext.class,0);
		}
		public SatzWertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_satzWert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSatzWert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSatzWert(this);
		}
	}

	public final SatzWertContext satzWert() throws RecognitionException {
		SatzWertContext _localctx = new SatzWertContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_satzWert);
		try {
			setState(416);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(248); ((SatzWertContext)_localctx).addiere = addiere();
				((SatzWertContext)_localctx).inhalt =  new Zahlenoperation(SatzArt.addiere, ((SatzWertContext)_localctx).addiere.a, ((SatzWertContext)_localctx).addiere.b);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(251); ((SatzWertContext)_localctx).subtrahiere = subtrahiere();
				((SatzWertContext)_localctx).inhalt =  new Zahlenoperation(SatzArt.subtrahiere, ((SatzWertContext)_localctx).subtrahiere.a, ((SatzWertContext)_localctx).subtrahiere.b);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(254); ((SatzWertContext)_localctx).multipliziere = multipliziere();
				((SatzWertContext)_localctx).inhalt =  new Zahlenoperation(SatzArt.multipliziere, ((SatzWertContext)_localctx).multipliziere.a, ((SatzWertContext)_localctx).multipliziere.b);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(257); ((SatzWertContext)_localctx).dividiere = dividiere();
				((SatzWertContext)_localctx).inhalt =  new Zahlenoperation(SatzArt.dividiere, ((SatzWertContext)_localctx).dividiere.a, ((SatzWertContext)_localctx).dividiere.b);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(260); ((SatzWertContext)_localctx).zahlenausgabe = zahlenausgabe();
				((SatzWertContext)_localctx).inhalt =  new Ausgabeoperation(SatzArt.zahlenausgabe, ((SatzWertContext)_localctx).zahlenausgabe.ausgeben);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(263); leerzeichen();
				((SatzWertContext)_localctx).inhalt =  new Ausgabeoperation(SatzArt.leerzeichen, ZeichenKette.LEERZEICHEN);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(266); leerzeile();
				((SatzWertContext)_localctx).inhalt =  new Ausgabeoperation(SatzArt.leerzeichen, ZeichenKette.LEERZEILE);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(269); ((SatzWertContext)_localctx).ausgabe = ausgabe();
				((SatzWertContext)_localctx).inhalt =  new Ausgabeoperation(SatzArt.leerzeichen, ((SatzWertContext)_localctx).ausgabe.wortfolge);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(272); zwischenspeicher();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.zwischenspeicher, Collections.emptyList());
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(275); ((SatzWertContext)_localctx).vergleiche = vergleiche();
				((SatzWertContext)_localctx).inhalt =  new Zahlenoperation(SatzArt.vergleiche, ((SatzWertContext)_localctx).vergleiche.a, ((SatzWertContext)_localctx).vergleiche.b);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(278); ((SatzWertContext)_localctx).springe = springe();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.springe, ((SatzWertContext)_localctx).springe.ziel);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(281); ((SatzWertContext)_localctx).springeWennNichtGleich = springeWennNichtGleich();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.springeWennNichtGleich, ((SatzWertContext)_localctx).springeWennNichtGleich.ziel);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(284); ((SatzWertContext)_localctx).springeWennGleich = springeWennGleich();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.springeWennGleich, ((SatzWertContext)_localctx).springeWennGleich.ziel);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				{
				setState(287); ((SatzWertContext)_localctx).springeWennKleiner = springeWennKleiner();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.springeWennKleiner, ((SatzWertContext)_localctx).springeWennKleiner.ziel);
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				{
				setState(290); ((SatzWertContext)_localctx).springeWennGr = springeWennGr();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.springeWennGrößer, ((SatzWertContext)_localctx).springeWennGr.ziel);
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(293); ((SatzWertContext)_localctx).springeWennKleinerGleich = springeWennKleinerGleich();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.springeWennKleinerGleich, ((SatzWertContext)_localctx).springeWennKleinerGleich.ziel);
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(296); ((SatzWertContext)_localctx).springeWennGrGleich = springeWennGrGleich();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.springeWennGrößerGleich, ((SatzWertContext)_localctx).springeWennGrGleich.ziel);
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				{
				setState(299); ((SatzWertContext)_localctx).springeZuDirekt = springeZuDirekt();
				((SatzWertContext)_localctx).inhalt =  new EinzelZahlenoperation(SatzArt.springeZuDirekt, ((SatzWertContext)_localctx).springeZuDirekt.ziel);
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				{
				setState(302); ((SatzWertContext)_localctx).stelle = stelle();
				((SatzWertContext)_localctx).inhalt =  new ZeichenKettenoperation(SatzArt.stelle, ((SatzWertContext)_localctx).stelle.name);
				}
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				{
				setState(305); leseZahlEinErg();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.leseZahlEinErg, Collections.emptyList());
				}
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				{
				setState(308); leseZahlEinZwischen();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.leseZahlEinZwischen, Collections.emptyList());
				}
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				{
				setState(311); ((SatzWertContext)_localctx).ladeInRegister = ladeInRegister();
				((SatzWertContext)_localctx).inhalt =  new RegisterUndZahlOperation(SatzArt.ladeInRegister, ((SatzWertContext)_localctx).ladeInRegister.reg, ((SatzWertContext)_localctx).ladeInRegister.wert);
				}
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				{
				setState(314); ((SatzWertContext)_localctx).ladeVomRegisterErg = ladeVomRegisterErg();
				((SatzWertContext)_localctx).inhalt =  new EinzelZahlenoperation(SatzArt.ladeVomRegisterErg, ((SatzWertContext)_localctx).ladeVomRegisterErg.reg);
				}
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				{
				setState(317); ((SatzWertContext)_localctx).ladeVomRegisterZw = ladeVomRegisterZw();
				((SatzWertContext)_localctx).inhalt =  new EinzelZahlenoperation(SatzArt.ladeVomRegisterZw, ((SatzWertContext)_localctx).ladeVomRegisterZw.reg);
				}
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				{
				setState(320); ladeRegisterAnzahlErg();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.ladeRegisterAnzahlErg, Collections.emptyList());
				}
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				{
				setState(323); ladeRegisterAnzahlZw();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.ladeRegisterAnzahlZw, Collections.emptyList());
				}
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				{
				setState(326); ((SatzWertContext)_localctx).registerausgabe = registerausgabe();
				((SatzWertContext)_localctx).inhalt =  new ZweiRegisterOperation(SatzArt.registerausgabe, ((SatzWertContext)_localctx).registerausgabe.anfang, ((SatzWertContext)_localctx).registerausgabe.ende);
				}
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				{
				setState(329); ((SatzWertContext)_localctx).registerWortEinlesen = registerWortEinlesen();
				((SatzWertContext)_localctx).inhalt =  new EinzelZahlenoperation(SatzArt.registerWortEinlesen, ((SatzWertContext)_localctx).registerWortEinlesen.reg);
				}
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				{
				setState(332); ((SatzWertContext)_localctx).registerZeichenEinlesen = registerZeichenEinlesen();
				((SatzWertContext)_localctx).inhalt =  new RegisterUndZahlOperation(SatzArt.registerZeichenEinlesen, ((SatzWertContext)_localctx).registerZeichenEinlesen.reg, ((SatzWertContext)_localctx).registerZeichenEinlesen.anzahl);
				}
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				{
				setState(335); ((SatzWertContext)_localctx).springeWennFalsch = springeWennFalsch();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.springeWennFalsch, ((SatzWertContext)_localctx).springeWennFalsch.ziel);
				}
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				{
				setState(338); versionErg();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.versionErg, Collections.emptyList());
				}
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				{
				setState(341); versionZw();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.versionZw, Collections.emptyList());
				}
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				{
				setState(344); ((SatzWertContext)_localctx).versionReg = versionReg();
				((SatzWertContext)_localctx).inhalt =  new EinzelZahlenoperation(SatzArt.versionReg, ((SatzWertContext)_localctx).versionReg.reg);
				}
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				{
				setState(347); stapelMaxGrErg();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.stapelMaxGrößeErg, Collections.emptyList());
				}
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				{
				setState(350); stapelMaxGrZw();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.stapelMaxGrößeZw, Collections.emptyList());
				}
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				{
				setState(353); ((SatzWertContext)_localctx).stapelMaxGrReg = stapelMaxGrReg();
				((SatzWertContext)_localctx).inhalt =  new EinzelZahlenoperation(SatzArt.stapelMaxGrößeReg, ((SatzWertContext)_localctx).stapelMaxGrReg.reg);
				}
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				{
				setState(356); stapelGrErg();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.stapelGrößeErg, Collections.emptyList());
				}
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				{
				setState(359); stapelGrZw();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.stapelGrößeZw, Collections.emptyList());
				}
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				{
				setState(362); ((SatzWertContext)_localctx).stapelGrReg = stapelGrReg();
				((SatzWertContext)_localctx).inhalt =  new EinzelZahlenoperation(SatzArt.stapelGrößeReg, ((SatzWertContext)_localctx).stapelGrReg.reg);
				}
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				{
				setState(365); ((SatzWertContext)_localctx).vergleicheRegister = vergleicheRegister();
				((SatzWertContext)_localctx).inhalt =  new VierRegisterOperation(SatzArt.vergleicheRegister, ((SatzWertContext)_localctx).vergleicheRegister.regA, ((SatzWertContext)_localctx).vergleicheRegister.regB, ((SatzWertContext)_localctx).vergleicheRegister.regC, ((SatzWertContext)_localctx).vergleicheRegister.regD);
				}
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				{
				setState(368); ((SatzWertContext)_localctx).vergleicheRegisterText = vergleicheRegisterText();
				((SatzWertContext)_localctx).inhalt =  new RegRegTextOperation(SatzArt.vergleicheRegisterText, ((SatzWertContext)_localctx).vergleicheRegisterText.anfang, ((SatzWertContext)_localctx).vergleicheRegisterText.ende, ((SatzWertContext)_localctx).vergleicheRegisterText.wortfolge);
				}
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				{
				setState(371); ((SatzWertContext)_localctx).rufeAuf = rufeAuf();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.rufeAuf, ((SatzWertContext)_localctx).rufeAuf.ziel);
				}
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				{
				setState(374); ((SatzWertContext)_localctx).rufeAufWennGleich = rufeAufWennGleich();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.rufeAufWennGleich, ((SatzWertContext)_localctx).rufeAufWennGleich.ziel);
				}
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				{
				setState(377); ((SatzWertContext)_localctx).rufeAufWennNichtGleich = rufeAufWennNichtGleich();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.rufeAufWennNichtGleich, ((SatzWertContext)_localctx).rufeAufWennNichtGleich.ziel);
				}
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				{
				setState(380); ((SatzWertContext)_localctx).rufeAufWennKleiner = rufeAufWennKleiner();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.rufeAufWennKleiner, ((SatzWertContext)_localctx).rufeAufWennKleiner.ziel);
				}
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				{
				setState(383); ((SatzWertContext)_localctx).rufeAufGr = rufeAufGr();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.rufeAufGrößer, ((SatzWertContext)_localctx).rufeAufGr.ziel);
				}
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				{
				setState(386); ((SatzWertContext)_localctx).rufeAufKleinerGleich = rufeAufKleinerGleich();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.rufeAufKleinerGleich, ((SatzWertContext)_localctx).rufeAufKleinerGleich.ziel);
				}
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				{
				setState(389); ((SatzWertContext)_localctx).rufeAufGrGleich = rufeAufGrGleich();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.rufeAufGrößerGleich, ((SatzWertContext)_localctx).rufeAufGrGleich.ziel);
				}
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				{
				setState(392); geheZur();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.geheZurück, Collections.emptyList());
				}
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				{
				setState(395); ((SatzWertContext)_localctx).rufeAufDirekt = rufeAufDirekt();
				((SatzWertContext)_localctx).inhalt =  new EinzelZahlenoperation(SatzArt.rufeAufDirekt, ((SatzWertContext)_localctx).rufeAufDirekt.ziel);
				}
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				{
				setState(398); ((SatzWertContext)_localctx).stapelSchreiben = stapelSchreiben();
				((SatzWertContext)_localctx).inhalt =  new EinzelZahlenoperation(SatzArt.stapelSchreiben, ((SatzWertContext)_localctx).stapelSchreiben.legen);
				}
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				{
				setState(401); stapelLesenErg();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.stapelLesenErg, Collections.emptyList());
				}
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				{
				setState(404); stapelLesenZw();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.stapelLesenZw, Collections.emptyList());
				}
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				{
				setState(407); ((SatzWertContext)_localctx).stapelLesenReg = stapelLesenReg();
				((SatzWertContext)_localctx).inhalt =  new EinzelZahlenoperation(SatzArt.stapelLesenReg, ((SatzWertContext)_localctx).stapelLesenReg.reg);
				}
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				{
				setState(410); ((SatzWertContext)_localctx).rufeAufWennFalsch = rufeAufWennFalsch();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.rufeAufWennFalsch, ((SatzWertContext)_localctx).rufeAufWennFalsch.ziel);
				}
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				{
				setState(413); letzterFehler();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.letzterFehler, Collections.emptyList());
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetzterFehlerContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public NehmeSTContext nehmeST() {
			return getRuleContext(NehmeSTContext.class,0);
		}
		public LetztenFehlerSTContext letztenFehlerST() {
			return getRuleContext(LetztenFehlerSTContext.class,0);
		}
		public LetzterFehlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letzterFehler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterLetzterFehler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitLetzterFehler(this);
		}
	}

	public final LetzterFehlerContext letzterFehler() throws RecognitionException {
		LetzterFehlerContext _localctx = new LetzterFehlerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_letzterFehler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); nehmeST();
			setState(419); match(WS);
			setState(420); letztenFehlerST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RufeAufWennFalschContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public GabSTContext gabST() {
			return getRuleContext(GabSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public AufrufSTContext aufrufST() {
			return getRuleContext(AufrufSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public FehlerSTContext fehlerST() {
			return getRuleContext(FehlerSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public WennSTContext wennST() {
			return getRuleContext(WennSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public RufeAufWennFalschContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rufeAufWennFalsch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRufeAufWennFalsch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRufeAufWennFalsch(this);
		}
	}

	public final RufeAufWennFalschContext rufeAufWennFalsch() throws RecognitionException {
		RufeAufWennFalschContext _localctx = new RufeAufWennFalschContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rufeAufWennFalsch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); wennST();
			setState(423); match(WS);
			setState(424); fehlerST();
			setState(425); match(WS);
			setState(426); gabST();
			setState(427); match(WS);
			setState(428); aufrufST();
			setState(429); match(WS);
			setState(430); zuST();
			setState(431); match(WS);
			setState(435);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(432); direktPronomST();
				setState(433); match(WS);
				}
				break;
			}
			setState(440);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(437); direktPronomST();
				setState(438); match(WS);
				}
			}

			setState(442); ((RufeAufWennFalschContext)_localctx).stelleST = stelleST();
			((RufeAufWennFalschContext)_localctx).ziel =  new ZeichenKette(((RufeAufWennFalschContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StapelLesenRegContext extends ParserRuleContext {
		public Zahl reg;
		public RegisterSTContext registerST;
		public RegisterSTContext registerST() {
			return getRuleContext(RegisterSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public NehmeSTContext nehmeST() {
			return getRuleContext(NehmeSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public StapelSTContext stapelST() {
			return getRuleContext(StapelSTContext.class,0);
		}
		public VonSTContext vonST() {
			return getRuleContext(VonSTContext.class,0);
		}
		public StapelLesenRegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelLesenReg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelLesenReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelLesenReg(this);
		}
	}

	public final StapelLesenRegContext stapelLesenReg() throws RecognitionException {
		StapelLesenRegContext _localctx = new StapelLesenRegContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stapelLesenReg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); nehmeST();
			setState(446); match(WS);
			setState(447); vonST();
			setState(448); match(WS);
			setState(449); stapelST();
			setState(450); match(WS);
			setState(451); zuST();
			setState(452); match(WS);
			setState(456);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(453); direktPronomST();
				setState(454); match(WS);
				}
				break;
			}
			setState(461);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(458); direktPronomST();
				setState(459); match(WS);
				}
			}

			setState(463); ((StapelLesenRegContext)_localctx).registerST = registerST();
			((StapelLesenRegContext)_localctx).reg =  ((StapelLesenRegContext)_localctx).registerST.reg;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StapelLesenZwContext extends ParserRuleContext {
		public ZwischenSTContext zwischenST() {
			return getRuleContext(ZwischenSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public NehmeSTContext nehmeST() {
			return getRuleContext(NehmeSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public StapelSTContext stapelST() {
			return getRuleContext(StapelSTContext.class,0);
		}
		public VonSTContext vonST() {
			return getRuleContext(VonSTContext.class,0);
		}
		public StapelLesenZwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelLesenZw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelLesenZw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelLesenZw(this);
		}
	}

	public final StapelLesenZwContext stapelLesenZw() throws RecognitionException {
		StapelLesenZwContext _localctx = new StapelLesenZwContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stapelLesenZw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466); nehmeST();
			setState(467); match(WS);
			setState(468); vonST();
			setState(469); match(WS);
			setState(470); stapelST();
			setState(471); match(WS);
			setState(472); zuST();
			setState(473); match(WS);
			setState(477);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(474); direktPronomST();
				setState(475); match(WS);
				}
				break;
			}
			setState(482);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(479); direktPronomST();
				setState(480); match(WS);
				}
			}

			setState(484); zwischenST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StapelLesenErgContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public ErgebnisSTContext ergebnisST() {
			return getRuleContext(ErgebnisSTContext.class,0);
		}
		public NehmeSTContext nehmeST() {
			return getRuleContext(NehmeSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public StapelSTContext stapelST() {
			return getRuleContext(StapelSTContext.class,0);
		}
		public VonSTContext vonST() {
			return getRuleContext(VonSTContext.class,0);
		}
		public StapelLesenErgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelLesenErg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelLesenErg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelLesenErg(this);
		}
	}

	public final StapelLesenErgContext stapelLesenErg() throws RecognitionException {
		StapelLesenErgContext _localctx = new StapelLesenErgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stapelLesenErg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486); nehmeST();
			setState(487); match(WS);
			setState(488); vonST();
			setState(489); match(WS);
			setState(490); stapelST();
			setState(491); match(WS);
			setState(492); zuST();
			setState(493); match(WS);
			setState(497);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(494); direktPronomST();
				setState(495); match(WS);
				}
				break;
			}
			setState(502);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(499); direktPronomST();
				setState(500); match(WS);
				}
			}

			setState(504); ergebnisST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StapelSchreibenContext extends ParserRuleContext {
		public Zahl legen;
		public ZahlSTContext zahlST;
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public ZahlSTContext zahlST() {
			return getRuleContext(ZahlSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public StapelSTContext stapelST() {
			return getRuleContext(StapelSTContext.class,0);
		}
		public StapelSchreibenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelSchreiben; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelSchreiben(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelSchreiben(this);
		}
	}

	public final StapelSchreibenContext stapelSchreiben() throws RecognitionException {
		StapelSchreibenContext _localctx = new StapelSchreibenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stapelSchreiben);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506); speichereST();
			setState(507); match(WS);
			setState(508); ((StapelSchreibenContext)_localctx).zahlST = zahlST();
			setState(509); match(WS);
			setState(510); zuST();
			setState(511); match(WS);
			setState(515);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(512); direktPronomST();
				setState(513); match(WS);
				}
			}

			setState(517); stapelST();
			((StapelSchreibenContext)_localctx).legen =  ((StapelSchreibenContext)_localctx).zahlST.zahl;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RufeAufDirektContext extends ParserRuleContext {
		public Zahl ziel;
		public PosZahlSTContext posZahlST;
		public AufrufSTContext aufrufST() {
			return getRuleContext(AufrufSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public PosZahlSTContext posZahlST() {
			return getRuleContext(PosZahlSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public RufeAufDirektContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rufeAufDirekt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRufeAufDirekt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRufeAufDirekt(this);
		}
	}

	public final RufeAufDirektContext rufeAufDirekt() throws RecognitionException {
		RufeAufDirektContext _localctx = new RufeAufDirektContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rufeAufDirekt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520); aufrufST();
			setState(521); match(WS);
			setState(522); zuST();
			setState(523); match(WS);
			setState(527);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(524); direktPronomST();
				setState(525); match(WS);
				}
				break;
			}
			setState(532);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(529); direktPronomST();
				setState(530); match(WS);
				}
			}

			setState(534); ((RufeAufDirektContext)_localctx).posZahlST = posZahlST();
			((RufeAufDirektContext)_localctx).ziel =  ((RufeAufDirektContext)_localctx).posZahlST.zahl;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeheZurContext extends ParserRuleContext {
		public ZurückgehenSTContext zurückgehenST() {
			return getRuleContext(ZurückgehenSTContext.class,0);
		}
		public GeheZurContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geheZur; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterGeheZur(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitGeheZur(this);
		}
	}

	public final GeheZurContext geheZur() throws RecognitionException {
		GeheZurContext _localctx = new GeheZurContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_geheZur);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537); zurückgehenST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RufeAufGrGleichContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public IstSTContext istST() {
			return getRuleContext(IstSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public AufrufSTContext aufrufST() {
			return getRuleContext(AufrufSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public GrößerGleichSTContext größerGleichST() {
			return getRuleContext(GrößerGleichSTContext.class,0);
		}
		public WennSTContext wennST() {
			return getRuleContext(WennSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public RufeAufGrGleichContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rufeAufGrGleich; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRufeAufGrGleich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRufeAufGrGleich(this);
		}
	}

	public final RufeAufGrGleichContext rufeAufGrGleich() throws RecognitionException {
		RufeAufGrGleichContext _localctx = new RufeAufGrGleichContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rufeAufGrGleich);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539); wennST();
			setState(540); match(WS);
			setState(541); größerGleichST();
			setState(542); match(WS);
			setState(543); istST();
			setState(544); match(WS);
			setState(545); aufrufST();
			setState(546); match(WS);
			setState(547); zuST();
			setState(548); match(WS);
			setState(552);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(549); direktPronomST();
				setState(550); match(WS);
				}
				break;
			}
			setState(557);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(554); direktPronomST();
				setState(555); match(WS);
				}
			}

			setState(559); ((RufeAufGrGleichContext)_localctx).stelleST = stelleST();
			((RufeAufGrGleichContext)_localctx).ziel =  new ZeichenKette(((RufeAufGrGleichContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RufeAufKleinerGleichContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public IstSTContext istST() {
			return getRuleContext(IstSTContext.class,0);
		}
		public KleinerGleichSTContext kleinerGleichST() {
			return getRuleContext(KleinerGleichSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public AufrufSTContext aufrufST() {
			return getRuleContext(AufrufSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public WennSTContext wennST() {
			return getRuleContext(WennSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public RufeAufKleinerGleichContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rufeAufKleinerGleich; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRufeAufKleinerGleich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRufeAufKleinerGleich(this);
		}
	}

	public final RufeAufKleinerGleichContext rufeAufKleinerGleich() throws RecognitionException {
		RufeAufKleinerGleichContext _localctx = new RufeAufKleinerGleichContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_rufeAufKleinerGleich);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562); wennST();
			setState(563); match(WS);
			setState(564); kleinerGleichST();
			setState(565); match(WS);
			setState(566); istST();
			setState(567); match(WS);
			setState(568); aufrufST();
			setState(569); match(WS);
			setState(570); zuST();
			setState(571); match(WS);
			setState(575);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(572); direktPronomST();
				setState(573); match(WS);
				}
				break;
			}
			setState(580);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(577); direktPronomST();
				setState(578); match(WS);
				}
			}

			setState(582); ((RufeAufKleinerGleichContext)_localctx).stelleST = stelleST();
			((RufeAufKleinerGleichContext)_localctx).ziel =  new ZeichenKette(((RufeAufKleinerGleichContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RufeAufGrContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public GrößerSTContext größerST() {
			return getRuleContext(GrößerSTContext.class,0);
		}
		public IstSTContext istST() {
			return getRuleContext(IstSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public AufrufSTContext aufrufST() {
			return getRuleContext(AufrufSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public WennSTContext wennST() {
			return getRuleContext(WennSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public RufeAufGrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rufeAufGr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRufeAufGr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRufeAufGr(this);
		}
	}

	public final RufeAufGrContext rufeAufGr() throws RecognitionException {
		RufeAufGrContext _localctx = new RufeAufGrContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rufeAufGr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585); wennST();
			setState(586); match(WS);
			setState(587); größerST();
			setState(588); match(WS);
			setState(589); istST();
			setState(590); match(WS);
			setState(591); aufrufST();
			setState(592); match(WS);
			setState(593); zuST();
			setState(594); match(WS);
			setState(598);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(595); direktPronomST();
				setState(596); match(WS);
				}
				break;
			}
			setState(603);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(600); direktPronomST();
				setState(601); match(WS);
				}
			}

			setState(605); ((RufeAufGrContext)_localctx).stelleST = stelleST();
			((RufeAufGrContext)_localctx).ziel =  new ZeichenKette(((RufeAufGrContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RufeAufWennKleinerContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public IstSTContext istST() {
			return getRuleContext(IstSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public AufrufSTContext aufrufST() {
			return getRuleContext(AufrufSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public KleinerSTContext kleinerST() {
			return getRuleContext(KleinerSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public WennSTContext wennST() {
			return getRuleContext(WennSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public RufeAufWennKleinerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rufeAufWennKleiner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRufeAufWennKleiner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRufeAufWennKleiner(this);
		}
	}

	public final RufeAufWennKleinerContext rufeAufWennKleiner() throws RecognitionException {
		RufeAufWennKleinerContext _localctx = new RufeAufWennKleinerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rufeAufWennKleiner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608); wennST();
			setState(609); match(WS);
			setState(610); kleinerST();
			setState(611); match(WS);
			setState(612); istST();
			setState(613); match(WS);
			setState(614); aufrufST();
			setState(615); match(WS);
			setState(616); zuST();
			setState(617); match(WS);
			setState(621);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(618); direktPronomST();
				setState(619); match(WS);
				}
				break;
			}
			setState(626);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(623); direktPronomST();
				setState(624); match(WS);
				}
			}

			setState(628); ((RufeAufWennKleinerContext)_localctx).stelleST = stelleST();
			((RufeAufWennKleinerContext)_localctx).ziel =  new ZeichenKette(((RufeAufWennKleinerContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RufeAufWennNichtGleichContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public IstSTContext istST() {
			return getRuleContext(IstSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public AufrufSTContext aufrufST() {
			return getRuleContext(AufrufSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public UngleichSTContext ungleichST() {
			return getRuleContext(UngleichSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public WennSTContext wennST() {
			return getRuleContext(WennSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public RufeAufWennNichtGleichContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rufeAufWennNichtGleich; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRufeAufWennNichtGleich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRufeAufWennNichtGleich(this);
		}
	}

	public final RufeAufWennNichtGleichContext rufeAufWennNichtGleich() throws RecognitionException {
		RufeAufWennNichtGleichContext _localctx = new RufeAufWennNichtGleichContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rufeAufWennNichtGleich);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631); wennST();
			setState(632); match(WS);
			setState(633); ungleichST();
			setState(634); match(WS);
			setState(635); istST();
			setState(636); match(WS);
			setState(637); aufrufST();
			setState(638); match(WS);
			setState(639); zuST();
			setState(640); match(WS);
			setState(644);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(641); direktPronomST();
				setState(642); match(WS);
				}
				break;
			}
			setState(649);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(646); direktPronomST();
				setState(647); match(WS);
				}
			}

			setState(651); ((RufeAufWennNichtGleichContext)_localctx).stelleST = stelleST();
			((RufeAufWennNichtGleichContext)_localctx).ziel =  new ZeichenKette(((RufeAufWennNichtGleichContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RufeAufWennGleichContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public GleichSTContext gleichST() {
			return getRuleContext(GleichSTContext.class,0);
		}
		public IstSTContext istST() {
			return getRuleContext(IstSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public AufrufSTContext aufrufST() {
			return getRuleContext(AufrufSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public WennSTContext wennST() {
			return getRuleContext(WennSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public RufeAufWennGleichContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rufeAufWennGleich; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRufeAufWennGleich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRufeAufWennGleich(this);
		}
	}

	public final RufeAufWennGleichContext rufeAufWennGleich() throws RecognitionException {
		RufeAufWennGleichContext _localctx = new RufeAufWennGleichContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rufeAufWennGleich);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654); wennST();
			setState(655); match(WS);
			setState(656); gleichST();
			setState(657); match(WS);
			setState(658); istST();
			setState(659); match(WS);
			setState(660); aufrufST();
			setState(661); match(WS);
			setState(662); zuST();
			setState(663); match(WS);
			setState(667);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(664); direktPronomST();
				setState(665); match(WS);
				}
				break;
			}
			setState(672);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(669); direktPronomST();
				setState(670); match(WS);
				}
			}

			setState(674); ((RufeAufWennGleichContext)_localctx).stelleST = stelleST();
			((RufeAufWennGleichContext)_localctx).ziel =  new ZeichenKette(((RufeAufWennGleichContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RufeAufContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public AufrufSTContext aufrufST() {
			return getRuleContext(AufrufSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public RufeAufContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rufeAuf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRufeAuf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRufeAuf(this);
		}
	}

	public final RufeAufContext rufeAuf() throws RecognitionException {
		RufeAufContext _localctx = new RufeAufContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rufeAuf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677); aufrufST();
			setState(678); match(WS);
			setState(679); zuST();
			setState(680); match(WS);
			setState(684);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(681); direktPronomST();
				setState(682); match(WS);
				}
				break;
			}
			setState(689);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(686); direktPronomST();
				setState(687); match(WS);
				}
			}

			setState(691); ((RufeAufContext)_localctx).stelleST = stelleST();
			((RufeAufContext)_localctx).ziel =  new ZeichenKette(((RufeAufContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VergleicheRegisterTextContext extends ParserRuleContext {
		public Zahl anfang;
		public Zahl ende;
		public ZeichenKette wortfolge;
		public BereichSTContext bereichST;
		public WortfolgeSTContext wortfolgeST;
		public VergleichSTContext vergleichST() {
			return getRuleContext(VergleichSTContext.class,0);
		}
		public BereichSTContext bereichST() {
			return getRuleContext(BereichSTContext.class,0);
		}
		public DerSTContext derST() {
			return getRuleContext(DerSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public MitSTContext mitST() {
			return getRuleContext(MitSTContext.class,0);
		}
		public WortfolgeSTContext wortfolgeST() {
			return getRuleContext(WortfolgeSTContext.class,0);
		}
		public VergleicheRegisterTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vergleicheRegisterText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterVergleicheRegisterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitVergleicheRegisterText(this);
		}
	}

	public final VergleicheRegisterTextContext vergleicheRegisterText() throws RecognitionException {
		VergleicheRegisterTextContext _localctx = new VergleicheRegisterTextContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_vergleicheRegisterText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694); vergleichST();
			setState(695); match(WS);
			setState(696); ((VergleicheRegisterTextContext)_localctx).bereichST = bereichST();
			setState(697); match(WS);
			setState(698); mitST();
			setState(699); match(WS);
			setState(700); derST();
			setState(701); match(WS);
			setState(702); ((VergleicheRegisterTextContext)_localctx).wortfolgeST = wortfolgeST();
				((VergleicheRegisterTextContext)_localctx).anfang =  ((VergleicheRegisterTextContext)_localctx).bereichST.anfang;
					((VergleicheRegisterTextContext)_localctx).ende =  ((VergleicheRegisterTextContext)_localctx).bereichST.ende;
					((VergleicheRegisterTextContext)_localctx).wortfolge =  new ZeichenKette(((VergleicheRegisterTextContext)_localctx).wortfolgeST.wortfolge);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VergleicheRegisterContext extends ParserRuleContext {
		public Zahl regA;
		public Zahl regB;
		public Zahl regC;
		public Zahl regD;
		public BereichSTContext bereichST;
		public VergleichSTContext vergleichST() {
			return getRuleContext(VergleichSTContext.class,0);
		}
		public List<BereichSTContext> bereichST() {
			return getRuleContexts(BereichSTContext.class);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public MitSTContext mitST() {
			return getRuleContext(MitSTContext.class,0);
		}
		public BereichSTContext bereichST(int i) {
			return getRuleContext(BereichSTContext.class,i);
		}
		public VergleicheRegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vergleicheRegister; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterVergleicheRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitVergleicheRegister(this);
		}
	}

	public final VergleicheRegisterContext vergleicheRegister() throws RecognitionException {
		VergleicheRegisterContext _localctx = new VergleicheRegisterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_vergleicheRegister);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705); vergleichST();
			setState(706); match(WS);
			{
			setState(707); ((VergleicheRegisterContext)_localctx).bereichST = bereichST();
				((VergleicheRegisterContext)_localctx).regA =  ((VergleicheRegisterContext)_localctx).bereichST.anfang;
						((VergleicheRegisterContext)_localctx).regB =  ((VergleicheRegisterContext)_localctx).bereichST.ende;
			}
			setState(710); match(WS);
			setState(711); mitST();
			setState(712); match(WS);
			{
			setState(713); ((VergleicheRegisterContext)_localctx).bereichST = bereichST();
				((VergleicheRegisterContext)_localctx).regC =  ((VergleicheRegisterContext)_localctx).bereichST.anfang;
						((VergleicheRegisterContext)_localctx).regD =  ((VergleicheRegisterContext)_localctx).bereichST.ende;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StapelGrZwContext extends ParserRuleContext {
		public ZwischenSTContext zwischenST() {
			return getRuleContext(ZwischenSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public StapelGrSTContext stapelGrST() {
			return getRuleContext(StapelGrSTContext.class,0);
		}
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public StapelGrZwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelGrZw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelGrZw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelGrZw(this);
		}
	}

	public final StapelGrZwContext stapelGrZw() throws RecognitionException {
		StapelGrZwContext _localctx = new StapelGrZwContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stapelGrZw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716); speichereST();
			setState(717); match(WS);
			setState(718); stapelGrST();
			setState(719); match(WS);
			setState(720); zuST();
			setState(721); match(WS);
			setState(725);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(722); direktPronomST();
				setState(723); match(WS);
				}
				break;
			}
			setState(730);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(727); direktPronomST();
				setState(728); match(WS);
				}
			}

			setState(732); zwischenST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StapelGrRegContext extends ParserRuleContext {
		public Zahl reg;
		public RegisterSTContext registerST;
		public RegisterSTContext registerST() {
			return getRuleContext(RegisterSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public StapelGrSTContext stapelGrST() {
			return getRuleContext(StapelGrSTContext.class,0);
		}
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public StapelGrRegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelGrReg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelGrReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelGrReg(this);
		}
	}

	public final StapelGrRegContext stapelGrReg() throws RecognitionException {
		StapelGrRegContext _localctx = new StapelGrRegContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stapelGrReg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734); speichereST();
			setState(735); match(WS);
			setState(736); stapelGrST();
			setState(737); match(WS);
			setState(738); zuST();
			setState(739); match(WS);
			setState(743);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(740); direktPronomST();
				setState(741); match(WS);
				}
				break;
			}
			setState(748);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(745); direktPronomST();
				setState(746); match(WS);
				}
			}

			setState(750); ((StapelGrRegContext)_localctx).registerST = registerST();
			((StapelGrRegContext)_localctx).reg =  ((StapelGrRegContext)_localctx).registerST.reg;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StapelGrErgContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public StapelGrSTContext stapelGrST() {
			return getRuleContext(StapelGrSTContext.class,0);
		}
		public ErgebnisSTContext ergebnisST() {
			return getRuleContext(ErgebnisSTContext.class,0);
		}
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public StapelGrErgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelGrErg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelGrErg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelGrErg(this);
		}
	}

	public final StapelGrErgContext stapelGrErg() throws RecognitionException {
		StapelGrErgContext _localctx = new StapelGrErgContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stapelGrErg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753); speichereST();
			setState(754); match(WS);
			setState(755); stapelGrST();
			setState(756); match(WS);
			setState(757); zuST();
			setState(760);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(758); match(WS);
				setState(759); direktPronomST();
				}
				break;
			}
			setState(762); match(WS);
			setState(763); ergebnisST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StapelMaxGrRegContext extends ParserRuleContext {
		public Zahl reg;
		public RegisterSTContext registerST;
		public RegisterSTContext registerST() {
			return getRuleContext(RegisterSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public StapelMaxGrSTContext stapelMaxGrST() {
			return getRuleContext(StapelMaxGrSTContext.class,0);
		}
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public StapelMaxGrRegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelMaxGrReg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelMaxGrReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelMaxGrReg(this);
		}
	}

	public final StapelMaxGrRegContext stapelMaxGrReg() throws RecognitionException {
		StapelMaxGrRegContext _localctx = new StapelMaxGrRegContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_stapelMaxGrReg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765); speichereST();
			setState(766); match(WS);
			setState(767); direktPronomST();
			setState(768); match(WS);
			setState(769); stapelMaxGrST();
			setState(770); match(WS);
			setState(771); zuST();
			setState(774);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(772); match(WS);
				setState(773); direktPronomST();
				}
				break;
			}
			setState(776); match(WS);
			setState(777); ((StapelMaxGrRegContext)_localctx).registerST = registerST();
			((StapelMaxGrRegContext)_localctx).reg =  ((StapelMaxGrRegContext)_localctx).registerST.reg;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StapelMaxGrZwContext extends ParserRuleContext {
		public ZwischenSTContext zwischenST() {
			return getRuleContext(ZwischenSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public StapelMaxGrSTContext stapelMaxGrST() {
			return getRuleContext(StapelMaxGrSTContext.class,0);
		}
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public StapelMaxGrZwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelMaxGrZw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelMaxGrZw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelMaxGrZw(this);
		}
	}

	public final StapelMaxGrZwContext stapelMaxGrZw() throws RecognitionException {
		StapelMaxGrZwContext _localctx = new StapelMaxGrZwContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_stapelMaxGrZw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780); speichereST();
			setState(781); match(WS);
			setState(782); direktPronomST();
			setState(783); match(WS);
			setState(784); stapelMaxGrST();
			setState(785); match(WS);
			setState(786); zuST();
			setState(789);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(787); match(WS);
				setState(788); direktPronomST();
				}
				break;
			}
			setState(791); match(WS);
			setState(792); zwischenST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StapelMaxGrErgContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public ErgebnisSTContext ergebnisST() {
			return getRuleContext(ErgebnisSTContext.class,0);
		}
		public StapelMaxGrSTContext stapelMaxGrST() {
			return getRuleContext(StapelMaxGrSTContext.class,0);
		}
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public StapelMaxGrErgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelMaxGrErg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelMaxGrErg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelMaxGrErg(this);
		}
	}

	public final StapelMaxGrErgContext stapelMaxGrErg() throws RecognitionException {
		StapelMaxGrErgContext _localctx = new StapelMaxGrErgContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stapelMaxGrErg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794); speichereST();
			setState(795); match(WS);
			setState(796); direktPronomST();
			setState(797); match(WS);
			setState(798); stapelMaxGrST();
			setState(799); match(WS);
			setState(800); zuST();
			setState(803);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(801); match(WS);
				setState(802); direktPronomST();
				}
				break;
			}
			setState(805); match(WS);
			setState(806); ergebnisST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionZwContext extends ParserRuleContext {
		public ZwischenSTContext zwischenST() {
			return getRuleContext(ZwischenSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public VersionSTContext versionST() {
			return getRuleContext(VersionSTContext.class,0);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public VersionZwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionZw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterVersionZw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitVersionZw(this);
		}
	}

	public final VersionZwContext versionZw() throws RecognitionException {
		VersionZwContext _localctx = new VersionZwContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_versionZw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808); speichereST();
			setState(809); match(WS);
			setState(810); direktPronomST();
			setState(811); match(WS);
			setState(812); versionST();
			setState(813); match(WS);
			setState(814); zuST();
			setState(815); match(WS);
			setState(819);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(816); direktPronomST();
				setState(817); match(WS);
				}
				break;
			}
			setState(821); direktPronomST();
			setState(822); match(WS);
			setState(823); zwischenST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionRegContext extends ParserRuleContext {
		public Zahl reg;
		public RegisterSTContext registerST;
		public RegisterSTContext registerST() {
			return getRuleContext(RegisterSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public VersionSTContext versionST() {
			return getRuleContext(VersionSTContext.class,0);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public VersionRegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionReg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterVersionReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitVersionReg(this);
		}
	}

	public final VersionRegContext versionReg() throws RecognitionException {
		VersionRegContext _localctx = new VersionRegContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_versionReg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825); speichereST();
			setState(826); match(WS);
			setState(827); direktPronomST();
			setState(828); match(WS);
			setState(829); versionST();
			setState(830); match(WS);
			setState(831); zuST();
			setState(832); match(WS);
			setState(836);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(833); direktPronomST();
				setState(834); match(WS);
				}
			}

			setState(838); ((VersionRegContext)_localctx).registerST = registerST();
			((VersionRegContext)_localctx).reg =  ((VersionRegContext)_localctx).registerST.reg;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionErgContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public VersionSTContext versionST() {
			return getRuleContext(VersionSTContext.class,0);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public ErgebnisSTContext ergebnisST() {
			return getRuleContext(ErgebnisSTContext.class,0);
		}
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public VersionErgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionErg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterVersionErg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitVersionErg(this);
		}
	}

	public final VersionErgContext versionErg() throws RecognitionException {
		VersionErgContext _localctx = new VersionErgContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_versionErg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841); speichereST();
			setState(842); match(WS);
			setState(843); direktPronomST();
			setState(844); match(WS);
			setState(845); versionST();
			setState(846); match(WS);
			setState(847); zuST();
			setState(848); match(WS);
			setState(852);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(849); direktPronomST();
				setState(850); match(WS);
				}
			}

			setState(854); ergebnisST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpringeWennFalschContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public GabSTContext gabST() {
			return getRuleContext(GabSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public FehlerSTContext fehlerST() {
			return getRuleContext(FehlerSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public WennSTContext wennST() {
			return getRuleContext(WennSTContext.class,0);
		}
		public SpringeSTContext springeST() {
			return getRuleContext(SpringeSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public SpringeWennFalschContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springeWennFalsch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSpringeWennFalsch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSpringeWennFalsch(this);
		}
	}

	public final SpringeWennFalschContext springeWennFalsch() throws RecognitionException {
		SpringeWennFalschContext _localctx = new SpringeWennFalschContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_springeWennFalsch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856); wennST();
			setState(857); match(WS);
			setState(858); fehlerST();
			setState(859); match(WS);
			setState(860); gabST();
			setState(861); match(WS);
			setState(862); springeST();
			setState(863); match(WS);
			setState(864); zuST();
			setState(865); match(WS);
			setState(869);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(866); direktPronomST();
				setState(867); match(WS);
				}
			}

			setState(871); ((SpringeWennFalschContext)_localctx).stelleST = stelleST();
			((SpringeWennFalschContext)_localctx).ziel =  new ZeichenKette(((SpringeWennFalschContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegisterZeichenEinlesenContext extends ParserRuleContext {
		public Zahl anzahl;
		public Zahl reg;
		public PosZahlSTContext posZahlST;
		public RegisterSTContext registerST;
		public RegisterSTContext registerST() {
			return getRuleContext(RegisterSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public PosZahlSTContext posZahlST() {
			return getRuleContext(PosZahlSTContext.class,0);
		}
		public EinlesenSTContext einlesenST() {
			return getRuleContext(EinlesenSTContext.class,0);
		}
		public ZeichenSTContext zeichenST() {
			return getRuleContext(ZeichenSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public RegisterZeichenEinlesenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registerZeichenEinlesen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRegisterZeichenEinlesen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRegisterZeichenEinlesen(this);
		}
	}

	public final RegisterZeichenEinlesenContext registerZeichenEinlesen() throws RecognitionException {
		RegisterZeichenEinlesenContext _localctx = new RegisterZeichenEinlesenContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_registerZeichenEinlesen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874); einlesenST();
			setState(875); match(WS);
			setState(876); ((RegisterZeichenEinlesenContext)_localctx).posZahlST = posZahlST();
			setState(877); match(WS);
			setState(878); zeichenST();
			setState(879); match(WS);
			setState(880); zuST();
			setState(881); match(WS);
			setState(885);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(882); direktPronomST();
				setState(883); match(WS);
				}
			}

			setState(887); ((RegisterZeichenEinlesenContext)_localctx).registerST = registerST();
				((RegisterZeichenEinlesenContext)_localctx).anzahl =  ((RegisterZeichenEinlesenContext)_localctx).posZahlST.zahl;
					((RegisterZeichenEinlesenContext)_localctx).reg =  ((RegisterZeichenEinlesenContext)_localctx).registerST.reg;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegisterWortEinlesenContext extends ParserRuleContext {
		public Zahl reg;
		public RegisterSTContext registerST;
		public RegisterSTContext registerST() {
			return getRuleContext(RegisterSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public EinlesenSTContext einlesenST() {
			return getRuleContext(EinlesenSTContext.class,0);
		}
		public WortSTContext wortST() {
			return getRuleContext(WortSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public RegisterWortEinlesenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registerWortEinlesen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRegisterWortEinlesen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRegisterWortEinlesen(this);
		}
	}

	public final RegisterWortEinlesenContext registerWortEinlesen() throws RecognitionException {
		RegisterWortEinlesenContext _localctx = new RegisterWortEinlesenContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_registerWortEinlesen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890); einlesenST();
			setState(891); match(WS);
			setState(892); wortST();
			setState(893); match(WS);
			setState(894); zuST();
			setState(895); match(WS);
			setState(899);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(896); direktPronomST();
				setState(897); match(WS);
				}
			}

			setState(901); ((RegisterWortEinlesenContext)_localctx).registerST = registerST();
			((RegisterWortEinlesenContext)_localctx).reg =  ((RegisterWortEinlesenContext)_localctx).registerST.reg;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegisterausgabeContext extends ParserRuleContext {
		public Zahl anfang;
		public Zahl ende;
		public BereichSTContext bereichST;
		public BereichSTContext bereichST() {
			return getRuleContext(BereichSTContext.class,0);
		}
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public AusgebenSTContext ausgebenST() {
			return getRuleContext(AusgebenSTContext.class,0);
		}
		public RegisterausgabeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registerausgabe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRegisterausgabe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRegisterausgabe(this);
		}
	}

	public final RegisterausgabeContext registerausgabe() throws RecognitionException {
		RegisterausgabeContext _localctx = new RegisterausgabeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_registerausgabe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904); ausgebenST();
			setState(905); match(WS);
			setState(906); ((RegisterausgabeContext)_localctx).bereichST = bereichST();
				((RegisterausgabeContext)_localctx).anfang =  ((RegisterausgabeContext)_localctx).bereichST.anfang;
					((RegisterausgabeContext)_localctx).ende =  ((RegisterausgabeContext)_localctx).bereichST.ende;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LadeRegisterAnzahlZwContext extends ParserRuleContext {
		public ZwischenSTContext zwischenST() {
			return getRuleContext(ZwischenSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public RegisterST_Context registerST_() {
			return getRuleContext(RegisterST_Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public AnzahlSTContext anzahlST() {
			return getRuleContext(AnzahlSTContext.class,0);
		}
		public LadeRegisterAnzahlZwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ladeRegisterAnzahlZw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterLadeRegisterAnzahlZw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitLadeRegisterAnzahlZw(this);
		}
	}

	public final LadeRegisterAnzahlZwContext ladeRegisterAnzahlZw() throws RecognitionException {
		LadeRegisterAnzahlZwContext _localctx = new LadeRegisterAnzahlZwContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ladeRegisterAnzahlZw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909); speichereST();
			setState(910); match(WS);
			setState(911); direktPronomST();
			setState(912); match(WS);
			setState(913); anzahlST();
			setState(914); match(WS);
			setState(915); direktPronomST();
			setState(916); match(WS);
			setState(917); registerST_();
			setState(918); match(WS);
			setState(919); zuST();
			setState(920); match(WS);
			setState(924);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(921); direktPronomST();
				setState(922); match(WS);
				}
				break;
			}
			setState(926); direktPronomST();
			setState(927); match(WS);
			setState(928); zwischenST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LadeRegisterAnzahlErgContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public DirektPronomSTContext direktPronomST(int i) {
			return getRuleContext(DirektPronomSTContext.class,i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public RegisterST_Context registerST_() {
			return getRuleContext(RegisterST_Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public ErgebnisSTContext ergebnisST() {
			return getRuleContext(ErgebnisSTContext.class,0);
		}
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public List<DirektPronomSTContext> direktPronomST() {
			return getRuleContexts(DirektPronomSTContext.class);
		}
		public AnzahlSTContext anzahlST() {
			return getRuleContext(AnzahlSTContext.class,0);
		}
		public LadeRegisterAnzahlErgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ladeRegisterAnzahlErg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterLadeRegisterAnzahlErg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitLadeRegisterAnzahlErg(this);
		}
	}

	public final LadeRegisterAnzahlErgContext ladeRegisterAnzahlErg() throws RecognitionException {
		LadeRegisterAnzahlErgContext _localctx = new LadeRegisterAnzahlErgContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ladeRegisterAnzahlErg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930); speichereST();
			setState(931); match(WS);
			setState(932); direktPronomST();
			setState(933); match(WS);
			setState(934); anzahlST();
			setState(935); match(WS);
			setState(936); direktPronomST();
			setState(937); match(WS);
			setState(938); registerST_();
			setState(939); match(WS);
			setState(940); zuST();
			setState(941); match(WS);
			setState(945);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(942); direktPronomST();
				setState(943); match(WS);
				}
				break;
			}
			setState(947); direktPronomST();
			setState(948); match(WS);
			setState(949); ergebnisST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirektPronomSTContext extends ParserRuleContext {
		public TerminalNode DEN() { return getToken(TPS_ANTLRParser.DEN, 0); }
		public TerminalNode DER() { return getToken(TPS_ANTLRParser.DER, 0); }
		public TerminalNode DAS() { return getToken(TPS_ANTLRParser.DAS, 0); }
		public TerminalNode DEM() { return getToken(TPS_ANTLRParser.DEM, 0); }
		public TerminalNode DIE() { return getToken(TPS_ANTLRParser.DIE, 0); }
		public DirektPronomSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direktPronomST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterDirektPronomST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitDirektPronomST(this);
		}
	}

	public final DirektPronomSTContext direktPronomST() throws RecognitionException {
		DirektPronomSTContext _localctx = new DirektPronomSTContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_direktPronomST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LadeVomRegisterZwContext extends ParserRuleContext {
		public Zahl reg;
		public RegisterSTContext registerST;
		public ZwischenSTContext zwischenST() {
			return getRuleContext(ZwischenSTContext.class,0);
		}
		public RegisterSTContext registerST() {
			return getRuleContext(RegisterSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public LadeVomRegisterZwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ladeVomRegisterZw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterLadeVomRegisterZw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitLadeVomRegisterZw(this);
		}
	}

	public final LadeVomRegisterZwContext ladeVomRegisterZw() throws RecognitionException {
		LadeVomRegisterZwContext _localctx = new LadeVomRegisterZwContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ladeVomRegisterZw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(953); speichereST();
			setState(954); match(WS);
			setState(955); ((LadeVomRegisterZwContext)_localctx).registerST = registerST();
			setState(956); match(WS);
			setState(957); zuST();
			setState(958); match(WS);
			setState(962);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(959); direktPronomST();
				setState(960); match(WS);
				}
			}

			setState(964); zwischenST();
			((LadeVomRegisterZwContext)_localctx).reg =  ((LadeVomRegisterZwContext)_localctx).registerST.reg;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LadeVomRegisterErgContext extends ParserRuleContext {
		public Zahl reg;
		public RegisterSTContext registerST;
		public RegisterSTContext registerST() {
			return getRuleContext(RegisterSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public ErgebnisSTContext ergebnisST() {
			return getRuleContext(ErgebnisSTContext.class,0);
		}
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public LadeVomRegisterErgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ladeVomRegisterErg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterLadeVomRegisterErg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitLadeVomRegisterErg(this);
		}
	}

	public final LadeVomRegisterErgContext ladeVomRegisterErg() throws RecognitionException {
		LadeVomRegisterErgContext _localctx = new LadeVomRegisterErgContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ladeVomRegisterErg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967); speichereST();
			setState(968); match(WS);
			setState(969); ((LadeVomRegisterErgContext)_localctx).registerST = registerST();
			setState(970); match(WS);
			setState(971); zuST();
			setState(972); match(WS);
			setState(976);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(973); direktPronomST();
				setState(974); match(WS);
				}
			}

			setState(978); ergebnisST();
			((LadeVomRegisterErgContext)_localctx).reg =  ((LadeVomRegisterErgContext)_localctx).registerST.reg;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LadeInRegisterContext extends ParserRuleContext {
		public Zahl wert;
		public Zahl reg;
		public ZahlSTContext zahlST;
		public RegisterSTContext registerST;
		public RegisterSTContext registerST() {
			return getRuleContext(RegisterSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public ZahlSTContext zahlST() {
			return getRuleContext(ZahlSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public LadeInRegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ladeInRegister; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterLadeInRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitLadeInRegister(this);
		}
	}

	public final LadeInRegisterContext ladeInRegister() throws RecognitionException {
		LadeInRegisterContext _localctx = new LadeInRegisterContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ladeInRegister);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981); speichereST();
			setState(982); match(WS);
			setState(983); ((LadeInRegisterContext)_localctx).zahlST = zahlST();
			setState(984); match(WS);
			setState(985); zuST();
			setState(986); match(WS);
			setState(990);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(987); direktPronomST();
				setState(988); match(WS);
				}
			}

			setState(992); ((LadeInRegisterContext)_localctx).registerST = registerST();
				((LadeInRegisterContext)_localctx).reg =  ((LadeInRegisterContext)_localctx).registerST.reg;
					((LadeInRegisterContext)_localctx).wert =  ((LadeInRegisterContext)_localctx).zahlST.zahl;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeseZahlEinZwischenContext extends ParserRuleContext {
		public ZahlST_Context zahlST_() {
			return getRuleContext(ZahlST_Context.class,0);
		}
		public ZwischenSTContext zwischenST() {
			return getRuleContext(ZwischenSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public EinlesenSTContext einlesenST() {
			return getRuleContext(EinlesenSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public LeseZahlEinZwischenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leseZahlEinZwischen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterLeseZahlEinZwischen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitLeseZahlEinZwischen(this);
		}
	}

	public final LeseZahlEinZwischenContext leseZahlEinZwischen() throws RecognitionException {
		LeseZahlEinZwischenContext _localctx = new LeseZahlEinZwischenContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_leseZahlEinZwischen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995); einlesenST();
			setState(996); match(WS);
			setState(997); zahlST_();
			setState(998); match(WS);
			setState(999); zuST();
			setState(1000); match(WS);
			setState(1004);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(1001); direktPronomST();
				setState(1002); match(WS);
				}
			}

			setState(1006); zwischenST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeseZahlEinErgContext extends ParserRuleContext {
		public ZahlST_Context zahlST_() {
			return getRuleContext(ZahlST_Context.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public ErgebnisSTContext ergebnisST() {
			return getRuleContext(ErgebnisSTContext.class,0);
		}
		public EinlesenSTContext einlesenST() {
			return getRuleContext(EinlesenSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public LeseZahlEinErgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leseZahlEinErg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterLeseZahlEinErg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitLeseZahlEinErg(this);
		}
	}

	public final LeseZahlEinErgContext leseZahlEinErg() throws RecognitionException {
		LeseZahlEinErgContext _localctx = new LeseZahlEinErgContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_leseZahlEinErg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008); einlesenST();
			setState(1009); match(WS);
			setState(1010); zahlST_();
			setState(1011); match(WS);
			setState(1012); zuST();
			setState(1013); match(WS);
			setState(1017);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(1014); direktPronomST();
				setState(1015); match(WS);
				}
			}

			setState(1019); ergebnisST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StelleContext extends ParserRuleContext {
		public ZeichenKette name;
		public StelleSTContext stelleST;
		public IstSTContext istST() {
			return getRuleContext(IstSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public HierSTContext hierST() {
			return getRuleContext(HierSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public StelleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stelle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStelle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStelle(this);
		}
	}

	public final StelleContext stelle() throws RecognitionException {
		StelleContext _localctx = new StelleContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_stelle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021); hierST();
			setState(1022); match(WS);
			setState(1023); istST();
			setState(1024); match(WS);
			setState(1025); ((StelleContext)_localctx).stelleST = stelleST();
			((StelleContext)_localctx).name =  new ZeichenKette(((StelleContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpringeZuDirektContext extends ParserRuleContext {
		public Zahl ziel;
		public PosZahlSTContext posZahlST;
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public PosZahlSTContext posZahlST() {
			return getRuleContext(PosZahlSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public SpringeSTContext springeST() {
			return getRuleContext(SpringeSTContext.class,0);
		}
		public SpringeZuDirektContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springeZuDirekt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSpringeZuDirekt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSpringeZuDirekt(this);
		}
	}

	public final SpringeZuDirektContext springeZuDirekt() throws RecognitionException {
		SpringeZuDirektContext _localctx = new SpringeZuDirektContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_springeZuDirekt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028); springeST();
			setState(1029); match(WS);
			setState(1030); zuST();
			setState(1031); match(WS);
			setState(1035);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(1032); direktPronomST();
				setState(1033); match(WS);
				}
			}

			setState(1037); ((SpringeZuDirektContext)_localctx).posZahlST = posZahlST();
			((SpringeZuDirektContext)_localctx).ziel =  ((SpringeZuDirektContext)_localctx).posZahlST.zahl;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpringeWennGrGleichContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public GrößerSTContext größerST() {
			return getRuleContext(GrößerSTContext.class,0);
		}
		public IstSTContext istST() {
			return getRuleContext(IstSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public WennSTContext wennST() {
			return getRuleContext(WennSTContext.class,0);
		}
		public SpringeSTContext springeST() {
			return getRuleContext(SpringeSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public SpringeWennGrGleichContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springeWennGrGleich; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSpringeWennGrGleich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSpringeWennGrGleich(this);
		}
	}

	public final SpringeWennGrGleichContext springeWennGrGleich() throws RecognitionException {
		SpringeWennGrGleichContext _localctx = new SpringeWennGrGleichContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_springeWennGrGleich);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040); wennST();
			setState(1041); match(WS);
			setState(1042); größerST();
			setState(1043); match(WS);
			setState(1044); istST();
			setState(1045); match(WS);
			setState(1046); springeST();
			setState(1047); match(WS);
			setState(1048); zuST();
			setState(1049); match(WS);
			setState(1053);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(1050); direktPronomST();
				setState(1051); match(WS);
				}
			}

			setState(1055); ((SpringeWennGrGleichContext)_localctx).stelleST = stelleST();
			((SpringeWennGrGleichContext)_localctx).ziel =  new ZeichenKette(((SpringeWennGrGleichContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpringeWennKleinerGleichContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public IstSTContext istST() {
			return getRuleContext(IstSTContext.class,0);
		}
		public KleinerGleichSTContext kleinerGleichST() {
			return getRuleContext(KleinerGleichSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public WennSTContext wennST() {
			return getRuleContext(WennSTContext.class,0);
		}
		public SpringeSTContext springeST() {
			return getRuleContext(SpringeSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public SpringeWennKleinerGleichContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springeWennKleinerGleich; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSpringeWennKleinerGleich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSpringeWennKleinerGleich(this);
		}
	}

	public final SpringeWennKleinerGleichContext springeWennKleinerGleich() throws RecognitionException {
		SpringeWennKleinerGleichContext _localctx = new SpringeWennKleinerGleichContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_springeWennKleinerGleich);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058); wennST();
			setState(1059); match(WS);
			setState(1060); kleinerGleichST();
			setState(1061); match(WS);
			setState(1062); istST();
			setState(1063); match(WS);
			setState(1064); springeST();
			setState(1065); match(WS);
			setState(1066); zuST();
			setState(1067); match(WS);
			setState(1071);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(1068); direktPronomST();
				setState(1069); match(WS);
				}
			}

			setState(1073); ((SpringeWennKleinerGleichContext)_localctx).stelleST = stelleST();
			((SpringeWennKleinerGleichContext)_localctx).ziel =  new ZeichenKette(((SpringeWennKleinerGleichContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpringeWennGrContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public GrößerSTContext größerST() {
			return getRuleContext(GrößerSTContext.class,0);
		}
		public IstSTContext istST() {
			return getRuleContext(IstSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public WennSTContext wennST() {
			return getRuleContext(WennSTContext.class,0);
		}
		public SpringeSTContext springeST() {
			return getRuleContext(SpringeSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public SpringeWennGrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springeWennGr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSpringeWennGr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSpringeWennGr(this);
		}
	}

	public final SpringeWennGrContext springeWennGr() throws RecognitionException {
		SpringeWennGrContext _localctx = new SpringeWennGrContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_springeWennGr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076); wennST();
			setState(1077); match(WS);
			setState(1078); größerST();
			setState(1079); match(WS);
			setState(1080); istST();
			setState(1081); match(WS);
			setState(1082); springeST();
			setState(1083); match(WS);
			setState(1084); zuST();
			setState(1085); match(WS);
			setState(1089);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(1086); direktPronomST();
				setState(1087); match(WS);
				}
			}

			setState(1091); ((SpringeWennGrContext)_localctx).stelleST = stelleST();
			((SpringeWennGrContext)_localctx).ziel =  new ZeichenKette(((SpringeWennGrContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpringeWennKleinerContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public IstSTContext istST() {
			return getRuleContext(IstSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public KleinerSTContext kleinerST() {
			return getRuleContext(KleinerSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public WennSTContext wennST() {
			return getRuleContext(WennSTContext.class,0);
		}
		public SpringeSTContext springeST() {
			return getRuleContext(SpringeSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public SpringeWennKleinerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springeWennKleiner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSpringeWennKleiner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSpringeWennKleiner(this);
		}
	}

	public final SpringeWennKleinerContext springeWennKleiner() throws RecognitionException {
		SpringeWennKleinerContext _localctx = new SpringeWennKleinerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_springeWennKleiner);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094); wennST();
			setState(1095); match(WS);
			setState(1096); kleinerST();
			setState(1097); match(WS);
			setState(1098); istST();
			setState(1099); match(WS);
			setState(1100); springeST();
			setState(1101); match(WS);
			setState(1102); zuST();
			setState(1103); match(WS);
			setState(1107);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(1104); direktPronomST();
				setState(1105); match(WS);
				}
			}

			setState(1109); ((SpringeWennKleinerContext)_localctx).stelleST = stelleST();
			((SpringeWennKleinerContext)_localctx).ziel =  new ZeichenKette(((SpringeWennKleinerContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpringeWennNichtGleichContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public IstSTContext istST() {
			return getRuleContext(IstSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public UngleichSTContext ungleichST() {
			return getRuleContext(UngleichSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public WennSTContext wennST() {
			return getRuleContext(WennSTContext.class,0);
		}
		public SpringeSTContext springeST() {
			return getRuleContext(SpringeSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public SpringeWennNichtGleichContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springeWennNichtGleich; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSpringeWennNichtGleich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSpringeWennNichtGleich(this);
		}
	}

	public final SpringeWennNichtGleichContext springeWennNichtGleich() throws RecognitionException {
		SpringeWennNichtGleichContext _localctx = new SpringeWennNichtGleichContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_springeWennNichtGleich);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112); wennST();
			setState(1113); match(WS);
			setState(1114); ungleichST();
			setState(1115); match(WS);
			setState(1116); istST();
			setState(1117); match(WS);
			setState(1118); springeST();
			setState(1119); match(WS);
			setState(1120); zuST();
			setState(1121); match(WS);
			setState(1125);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(1122); direktPronomST();
				setState(1123); match(WS);
				}
			}

			setState(1127); ((SpringeWennNichtGleichContext)_localctx).stelleST = stelleST();
			((SpringeWennNichtGleichContext)_localctx).ziel =  new ZeichenKette(((SpringeWennNichtGleichContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpringeWennGleichContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public GleichSTContext gleichST() {
			return getRuleContext(GleichSTContext.class,0);
		}
		public IstSTContext istST() {
			return getRuleContext(IstSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public WennSTContext wennST() {
			return getRuleContext(WennSTContext.class,0);
		}
		public SpringeSTContext springeST() {
			return getRuleContext(SpringeSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public SpringeWennGleichContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springeWennGleich; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSpringeWennGleich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSpringeWennGleich(this);
		}
	}

	public final SpringeWennGleichContext springeWennGleich() throws RecognitionException {
		SpringeWennGleichContext _localctx = new SpringeWennGleichContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_springeWennGleich);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130); wennST();
			setState(1131); match(WS);
			setState(1132); gleichST();
			setState(1133); match(WS);
			setState(1134); istST();
			setState(1135); match(WS);
			setState(1136); springeST();
			setState(1137); match(WS);
			setState(1138); zuST();
			setState(1139); match(WS);
			setState(1143);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(1140); direktPronomST();
				setState(1141); match(WS);
				}
			}

			setState(1145); ((SpringeWennGleichContext)_localctx).stelleST = stelleST();
			((SpringeWennGleichContext)_localctx).ziel =  new ZeichenKette(((SpringeWennGleichContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpringeContext extends ParserRuleContext {
		public ZeichenKette ziel;
		public StelleSTContext stelleST;
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public SpringeSTContext springeST() {
			return getRuleContext(SpringeSTContext.class,0);
		}
		public StelleSTContext stelleST() {
			return getRuleContext(StelleSTContext.class,0);
		}
		public SpringeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSpringe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSpringe(this);
		}
	}

	public final SpringeContext springe() throws RecognitionException {
		SpringeContext _localctx = new SpringeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_springe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148); springeST();
			setState(1149); match(WS);
			setState(1150); zuST();
			setState(1151); match(WS);
			setState(1155);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
				{
				setState(1152); direktPronomST();
				setState(1153); match(WS);
				}
			}

			setState(1157); ((SpringeContext)_localctx).stelleST = stelleST();
			((SpringeContext)_localctx).ziel =  new ZeichenKette(((SpringeContext)_localctx).stelleST.name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VergleicheContext extends ParserRuleContext {
		public Zahl a;
		public Zahl b;
		public ZahlSTContext zahlST;
		public VergleichSTContext vergleichST() {
			return getRuleContext(VergleichSTContext.class,0);
		}
		public ZahlSTContext zahlST(int i) {
			return getRuleContext(ZahlSTContext.class,i);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public MitSTContext mitST() {
			return getRuleContext(MitSTContext.class,0);
		}
		public List<ZahlSTContext> zahlST() {
			return getRuleContexts(ZahlSTContext.class);
		}
		public VergleicheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vergleiche; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterVergleiche(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitVergleiche(this);
		}
	}

	public final VergleicheContext vergleiche() throws RecognitionException {
		VergleicheContext _localctx = new VergleicheContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_vergleiche);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160); vergleichST();
			setState(1161); match(WS);
			{
			setState(1162); ((VergleicheContext)_localctx).zahlST = zahlST();
			((VergleicheContext)_localctx).a =  ((VergleicheContext)_localctx).zahlST.zahl;
			}
			setState(1165); match(WS);
			setState(1166); mitST();
			setState(1167); match(WS);
			{
			setState(1168); ((VergleicheContext)_localctx).zahlST = zahlST();
			((VergleicheContext)_localctx).b =  ((VergleicheContext)_localctx).zahlST.zahl;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZwischenspeicherContext extends ParserRuleContext {
		public ZwischenSTContext zwischenST() {
			return getRuleContext(ZwischenSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public ErgebnisSTContext ergebnisST() {
			return getRuleContext(ErgebnisSTContext.class,0);
		}
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public DirektPronomSTContext direktPronomST() {
			return getRuleContext(DirektPronomSTContext.class,0);
		}
		public ZwischenspeicherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zwischenspeicher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterZwischenspeicher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitZwischenspeicher(this);
		}
	}

	public final ZwischenspeicherContext zwischenspeicher() throws RecognitionException {
		ZwischenspeicherContext _localctx = new ZwischenspeicherContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_zwischenspeicher);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171); speichereST();
			setState(1172); match(WS);
			setState(1173); ergebnisST();
			setState(1181);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(1174); match(WS);
				setState(1175); zuST();
				setState(1179);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIE) | (1L << DER) | (1L << DAS) | (1L << DEM) | (1L << DEN))) != 0)) {
					{
					setState(1176); direktPronomST();
					setState(1177); match(WS);
					}
				}

				}
				break;
			}
			setState(1183); match(WS);
			setState(1184); zwischenST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AusgabeContext extends ParserRuleContext {
		public ZeichenKette wortfolge;
		public WortfolgeSTContext wortfolgeST;
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public AusgebenSTContext ausgebenST() {
			return getRuleContext(AusgebenSTContext.class,0);
		}
		public AusDPSTContext ausDPST() {
			return getRuleContext(AusDPSTContext.class,0);
		}
		public FolgendesSTContext folgendesST() {
			return getRuleContext(FolgendesSTContext.class,0);
		}
		public WortfolgeSTContext wortfolgeST() {
			return getRuleContext(WortfolgeSTContext.class,0);
		}
		public AusgabeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ausgabe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterAusgabe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitAusgabe(this);
		}
	}

	public final AusgabeContext ausgabe() throws RecognitionException {
		AusgabeContext _localctx = new AusgabeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ausgabe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186); ausgebenST();
			setState(1187); match(WS);
			setState(1188); folgendesST();
			setState(1189); match(WS);
			setState(1190); ausDPST();
			setState(1191); match(WS);
			setState(1192); ((AusgabeContext)_localctx).wortfolgeST = wortfolgeST();
			((AusgabeContext)_localctx).wortfolge =  new ZeichenKette(((AusgabeContext)_localctx).wortfolgeST.wortfolge);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeerzeileContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public EinSTContext einST() {
			return getRuleContext(EinSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public MacheSTContext macheST() {
			return getRuleContext(MacheSTContext.class,0);
		}
		public LeerzeileSTContext leerzeileST() {
			return getRuleContext(LeerzeileSTContext.class,0);
		}
		public LeerzeileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leerzeile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterLeerzeile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitLeerzeile(this);
		}
	}

	public final LeerzeileContext leerzeile() throws RecognitionException {
		LeerzeileContext _localctx = new LeerzeileContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_leerzeile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195); macheST();
			setState(1196); match(WS);
			setState(1197); einST();
			setState(1198); match(WS);
			setState(1199); leerzeileST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EinSTContext extends ParserRuleContext {
		public TerminalNode EINEN() { return getToken(TPS_ANTLRParser.EINEN, 0); }
		public TerminalNode EINE() { return getToken(TPS_ANTLRParser.EINE, 0); }
		public TerminalNode EIN() { return getToken(TPS_ANTLRParser.EIN, 0); }
		public EinSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_einST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterEinST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitEinST(this);
		}
	}

	public final EinSTContext einST() throws RecognitionException {
		EinSTContext _localctx = new EinSTContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_einST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EINEN) | (1L << EINE) | (1L << EIN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacheSTContext extends ParserRuleContext {
		public TerminalNode MACHE() { return getToken(TPS_ANTLRParser.MACHE, 0); }
		public MacheSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macheST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterMacheST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitMacheST(this);
		}
	}

	public final MacheSTContext macheST() throws RecognitionException {
		MacheSTContext _localctx = new MacheSTContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_macheST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203); match(MACHE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeerzeichenContext extends ParserRuleContext {
		public LeerzeichenSTContext leerzeichenST() {
			return getRuleContext(LeerzeichenSTContext.class,0);
		}
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public AusgebenSTContext ausgebenST() {
			return getRuleContext(AusgebenSTContext.class,0);
		}
		public LeerzeichenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leerzeichen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterLeerzeichen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitLeerzeichen(this);
		}
	}

	public final LeerzeichenContext leerzeichen() throws RecognitionException {
		LeerzeichenContext _localctx = new LeerzeichenContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_leerzeichen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1205); ausgebenST();
			setState(1206); match(WS);
			setState(1207); leerzeichenST();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZahlenausgabeContext extends ParserRuleContext {
		public Zahl ausgeben;
		public ZahlSTContext zahlST;
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public AusgebenSTContext ausgebenST() {
			return getRuleContext(AusgebenSTContext.class,0);
		}
		public ZahlSTContext zahlST() {
			return getRuleContext(ZahlSTContext.class,0);
		}
		public ZahlenausgabeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zahlenausgabe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterZahlenausgabe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitZahlenausgabe(this);
		}
	}

	public final ZahlenausgabeContext zahlenausgabe() throws RecognitionException {
		ZahlenausgabeContext _localctx = new ZahlenausgabeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_zahlenausgabe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209); ausgebenST();
			setState(1210); match(WS);
			setState(1211); ((ZahlenausgabeContext)_localctx).zahlST = zahlST();
			((ZahlenausgabeContext)_localctx).ausgeben =  ((ZahlenausgabeContext)_localctx).zahlST.zahl;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipliziereContext extends ParserRuleContext {
		public Zahl a;
		public Zahl b;
		public ZahlSTContext zahlST;
		public MultipliziereSTContext multipliziereST() {
			return getRuleContext(MultipliziereSTContext.class,0);
		}
		public ZahlSTContext zahlST(int i) {
			return getRuleContext(ZahlSTContext.class,i);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public MitSTContext mitST() {
			return getRuleContext(MitSTContext.class,0);
		}
		public List<ZahlSTContext> zahlST() {
			return getRuleContexts(ZahlSTContext.class);
		}
		public MultipliziereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipliziere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterMultipliziere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitMultipliziere(this);
		}
	}

	public final MultipliziereContext multipliziere() throws RecognitionException {
		MultipliziereContext _localctx = new MultipliziereContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_multipliziere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214); multipliziereST();
			setState(1215); match(WS);
			{
			setState(1216); ((MultipliziereContext)_localctx).zahlST = zahlST();
			((MultipliziereContext)_localctx).a =  ((MultipliziereContext)_localctx).zahlST.zahl;
			}
			setState(1219); match(WS);
			setState(1220); mitST();
			setState(1221); match(WS);
			{
			setState(1222); ((MultipliziereContext)_localctx).zahlST = zahlST();
			((MultipliziereContext)_localctx).b =  ((MultipliziereContext)_localctx).zahlST.zahl;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DividiereContext extends ParserRuleContext {
		public Zahl a;
		public Zahl b;
		public ZahlSTContext zahlST;
		public ZahlSTContext zahlST(int i) {
			return getRuleContext(ZahlSTContext.class,i);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public MitSTContext mitST() {
			return getRuleContext(MitSTContext.class,0);
		}
		public List<ZahlSTContext> zahlST() {
			return getRuleContexts(ZahlSTContext.class);
		}
		public DividiereSTContext dividiereST() {
			return getRuleContext(DividiereSTContext.class,0);
		}
		public DividiereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dividiere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterDividiere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitDividiere(this);
		}
	}

	public final DividiereContext dividiere() throws RecognitionException {
		DividiereContext _localctx = new DividiereContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_dividiere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1225); dividiereST();
			setState(1226); match(WS);
			{
			setState(1227); ((DividiereContext)_localctx).zahlST = zahlST();
			((DividiereContext)_localctx).a =  ((DividiereContext)_localctx).zahlST.zahl;
			}
			setState(1230); match(WS);
			setState(1231); mitST();
			setState(1232); match(WS);
			{
			setState(1233); ((DividiereContext)_localctx).zahlST = zahlST();
			((DividiereContext)_localctx).b =  ((DividiereContext)_localctx).zahlST.zahl;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubtrahiereContext extends ParserRuleContext {
		public Zahl a;
		public Zahl b;
		public ZahlSTContext zahlST;
		public ZahlSTContext zahlST(int i) {
			return getRuleContext(ZahlSTContext.class,i);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public MitSTContext mitST() {
			return getRuleContext(MitSTContext.class,0);
		}
		public List<ZahlSTContext> zahlST() {
			return getRuleContexts(ZahlSTContext.class);
		}
		public SubtrahiereSTContext subtrahiereST() {
			return getRuleContext(SubtrahiereSTContext.class,0);
		}
		public SubtrahiereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtrahiere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSubtrahiere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSubtrahiere(this);
		}
	}

	public final SubtrahiereContext subtrahiere() throws RecognitionException {
		SubtrahiereContext _localctx = new SubtrahiereContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_subtrahiere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1236); subtrahiereST();
			setState(1237); match(WS);
			{
			setState(1238); ((SubtrahiereContext)_localctx).zahlST = zahlST();
			((SubtrahiereContext)_localctx).a =  ((SubtrahiereContext)_localctx).zahlST.zahl;
			}
			setState(1241); match(WS);
			setState(1242); mitST();
			setState(1243); match(WS);
			{
			setState(1244); ((SubtrahiereContext)_localctx).zahlST = zahlST();
			((SubtrahiereContext)_localctx).b =  ((SubtrahiereContext)_localctx).zahlST.zahl;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddiereContext extends ParserRuleContext {
		public Zahl a;
		public Zahl b;
		public ZahlSTContext zahlST;
		public ZahlSTContext zahlST(int i) {
			return getRuleContext(ZahlSTContext.class,i);
		}
		public AddiereSTContext addiereST() {
			return getRuleContext(AddiereSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public MitSTContext mitST() {
			return getRuleContext(MitSTContext.class,0);
		}
		public List<ZahlSTContext> zahlST() {
			return getRuleContexts(ZahlSTContext.class);
		}
		public AddiereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addiere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterAddiere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitAddiere(this);
		}
	}

	public final AddiereContext addiere() throws RecognitionException {
		AddiereContext _localctx = new AddiereContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_addiere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247); addiereST();
			setState(1248); match(WS);
			{
			setState(1249); ((AddiereContext)_localctx).zahlST = zahlST();
			((AddiereContext)_localctx).a =  ((AddiereContext)_localctx).zahlST.zahl;
			}
			setState(1252); match(WS);
			setState(1253); mitST();
			setState(1254); match(WS);
			{
			setState(1255); ((AddiereContext)_localctx).zahlST = zahlST();
			((AddiereContext)_localctx).b =  ((AddiereContext)_localctx).zahlST.zahl;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MitSTContext extends ParserRuleContext {
		public TerminalNode MIT() { return getToken(TPS_ANTLRParser.MIT, 0); }
		public MitSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mitST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterMitST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitMitST(this);
		}
	}

	public final MitSTContext mitST() throws RecognitionException {
		MitSTContext _localctx = new MitSTContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_mitST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258); match(MIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IstSTContext extends ParserRuleContext {
		public TerminalNode IST() { return getToken(TPS_ANTLRParser.IST, 0); }
		public IstSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_istST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterIstST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitIstST(this);
		}
	}

	public final IstSTContext istST() throws RecognitionException {
		IstSTContext _localctx = new IstSTContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_istST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260); match(IST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HierSTContext extends ParserRuleContext {
		public TerminalNode HIER() { return getToken(TPS_ANTLRParser.HIER, 0); }
		public HierSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hierST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterHierST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitHierST(this);
		}
	}

	public final HierSTContext hierST() throws RecognitionException {
		HierSTContext _localctx = new HierSTContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_hierST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262); match(HIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GabSTContext extends ParserRuleContext {
		public TerminalNode WAR() { return getToken(TPS_ANTLRParser.WAR, 0); }
		public TerminalNode GAB() { return getToken(TPS_ANTLRParser.GAB, 0); }
		public GabSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gabST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterGabST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitGabST(this);
		}
	}

	public final GabSTContext gabST() throws RecognitionException {
		GabSTContext _localctx = new GabSTContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_gabST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			_la = _input.LA(1);
			if ( !(_la==GAB || _la==WAR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZuSTContext extends ParserRuleContext {
		public TerminalNode AUF() { return getToken(TPS_ANTLRParser.AUF, 0); }
		public TerminalNode ZUR() { return getToken(TPS_ANTLRParser.ZUR, 0); }
		public TerminalNode ZU() { return getToken(TPS_ANTLRParser.ZU, 0); }
		public TerminalNode IN() { return getToken(TPS_ANTLRParser.IN, 0); }
		public ZuSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zuST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterZuST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitZuST(this);
		}
	}

	public final ZuSTContext zuST() throws RecognitionException {
		ZuSTContext _localctx = new ZuSTContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_zuST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1266);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (AUF - 60)) | (1L << (ZUR - 60)) | (1L << (ZU - 60)) | (1L << (IN - 60)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VonSTContext extends ParserRuleContext {
		public TerminalNode VOM() { return getToken(TPS_ANTLRParser.VOM, 0); }
		public TerminalNode VON() { return getToken(TPS_ANTLRParser.VON, 0); }
		public VonSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vonST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterVonST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitVonST(this);
		}
	}

	public final VonSTContext vonST() throws RecognitionException {
		VonSTContext _localctx = new VonSTContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_vonST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			_la = _input.LA(1);
			if ( !(_la==VOM || _la==VON) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FolgendesSTContext extends ParserRuleContext {
		public TerminalNode FOLGENDES() { return getToken(TPS_ANTLRParser.FOLGENDES, 0); }
		public FolgendesSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_folgendesST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterFolgendesST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitFolgendesST(this);
		}
	}

	public final FolgendesSTContext folgendesST() throws RecognitionException {
		FolgendesSTContext _localctx = new FolgendesSTContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_folgendesST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1270); match(FOLGENDES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AusgebenSTContext extends ParserRuleContext {
		public TerminalNode AUSGEBEN() { return getToken(TPS_ANTLRParser.AUSGEBEN, 0); }
		public TerminalNode GEBE() { return getToken(TPS_ANTLRParser.GEBE, 0); }
		public AusgebenSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ausgebenST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterAusgebenST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitAusgebenST(this);
		}
	}

	public final AusgebenSTContext ausgebenST() throws RecognitionException {
		AusgebenSTContext _localctx = new AusgebenSTContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_ausgebenST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			_la = _input.LA(1);
			if ( !(_la==AUSGEBEN || _la==GEBE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AusDPSTContext extends ParserRuleContext {
		public TerminalNode DP() { return getToken(TPS_ANTLRParser.DP, 0); }
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public TerminalNode AUS_DP() { return getToken(TPS_ANTLRParser.AUS_DP, 0); }
		public TerminalNode AUS() { return getToken(TPS_ANTLRParser.AUS, 0); }
		public AusDPSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ausDPST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterAusDPST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitAusDPST(this);
		}
	}

	public final AusDPSTContext ausDPST() throws RecognitionException {
		AusDPSTContext _localctx = new AusDPSTContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_ausDPST);
		int _la;
		try {
			setState(1280);
			switch (_input.LA(1)) {
			case AUS_DP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1274); match(AUS_DP);
				}
				break;
			case AUS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1275); match(AUS);
				setState(1277);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(1276); match(WS);
					}
				}

				setState(1279); match(DP);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AusSTContext extends ParserRuleContext {
		public TerminalNode AUS() { return getToken(TPS_ANTLRParser.AUS, 0); }
		public AusSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ausST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterAusST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitAusST(this);
		}
	}

	public final AusSTContext ausST() throws RecognitionException {
		AusSTContext _localctx = new AusSTContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_ausST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282); match(AUS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeerzeichenSTContext extends ParserRuleContext {
		public TerminalNode LEERTASTE() { return getToken(TPS_ANTLRParser.LEERTASTE, 0); }
		public TerminalNode LEERZEICHEN() { return getToken(TPS_ANTLRParser.LEERZEICHEN, 0); }
		public LeerzeichenSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leerzeichenST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterLeerzeichenST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitLeerzeichenST(this);
		}
	}

	public final LeerzeichenSTContext leerzeichenST() throws RecognitionException {
		LeerzeichenSTContext _localctx = new LeerzeichenSTContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_leerzeichenST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			_la = _input.LA(1);
			if ( !(_la==LEERTASTE || _la==LEERZEICHEN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeerzeileSTContext extends ParserRuleContext {
		public TerminalNode LEERZEILE() { return getToken(TPS_ANTLRParser.LEERZEILE, 0); }
		public TerminalNode ZEILENUMBRUCH() { return getToken(TPS_ANTLRParser.ZEILENUMBRUCH, 0); }
		public LeerzeileSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leerzeileST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterLeerzeileST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitLeerzeileST(this);
		}
	}

	public final LeerzeileSTContext leerzeileST() throws RecognitionException {
		LeerzeileSTContext _localctx = new LeerzeileSTContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_leerzeileST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			_la = _input.LA(1);
			if ( !(_la==ZEILENUMBRUCH || _la==LEERZEILE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddiereSTContext extends ParserRuleContext {
		public List<TerminalNode> ADDIERE() { return getTokens(TPS_ANTLRParser.ADDIERE); }
		public TerminalNode ADDIERE(int i) {
			return getToken(TPS_ANTLRParser.ADDIERE, i);
		}
		public AddiereSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addiereST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterAddiereST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitAddiereST(this);
		}
	}

	public final AddiereSTContext addiereST() throws RecognitionException {
		AddiereSTContext _localctx = new AddiereSTContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_addiereST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			_la = _input.LA(1);
			if ( !(_la==ADDIERE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubtrahiereSTContext extends ParserRuleContext {
		public TerminalNode SUBTRAHIERE(int i) {
			return getToken(TPS_ANTLRParser.SUBTRAHIERE, i);
		}
		public List<TerminalNode> SUBTRAHIERE() { return getTokens(TPS_ANTLRParser.SUBTRAHIERE); }
		public SubtrahiereSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtrahiereST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSubtrahiereST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSubtrahiereST(this);
		}
	}

	public final SubtrahiereSTContext subtrahiereST() throws RecognitionException {
		SubtrahiereSTContext _localctx = new SubtrahiereSTContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_subtrahiereST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			_la = _input.LA(1);
			if ( !(_la==SUBTRAHIERE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipliziereSTContext extends ParserRuleContext {
		public TerminalNode MULTIPLIZIERE(int i) {
			return getToken(TPS_ANTLRParser.MULTIPLIZIERE, i);
		}
		public List<TerminalNode> MULTIPLIZIERE() { return getTokens(TPS_ANTLRParser.MULTIPLIZIERE); }
		public MultipliziereSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipliziereST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterMultipliziereST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitMultipliziereST(this);
		}
	}

	public final MultipliziereSTContext multipliziereST() throws RecognitionException {
		MultipliziereSTContext _localctx = new MultipliziereSTContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_multipliziereST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLIZIERE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DividiereSTContext extends ParserRuleContext {
		public TerminalNode DIVIDIERE(int i) {
			return getToken(TPS_ANTLRParser.DIVIDIERE, i);
		}
		public List<TerminalNode> DIVIDIERE() { return getTokens(TPS_ANTLRParser.DIVIDIERE); }
		public DividiereSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dividiereST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterDividiereST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitDividiereST(this);
		}
	}

	public final DividiereSTContext dividiereST() throws RecognitionException {
		DividiereSTContext _localctx = new DividiereSTContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_dividiereST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			_la = _input.LA(1);
			if ( !(_la==DIVIDIERE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VergleichSTContext extends ParserRuleContext {
		public TerminalNode VERGLEICHE() { return getToken(TPS_ANTLRParser.VERGLEICHE, 0); }
		public VergleichSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vergleichST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterVergleichST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitVergleichST(this);
		}
	}

	public final VergleichSTContext vergleichST() throws RecognitionException {
		VergleichSTContext _localctx = new VergleichSTContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_vergleichST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1296); match(VERGLEICHE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpringeSTContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public TerminalNode SPRINGE() { return getToken(TPS_ANTLRParser.SPRINGE, 0); }
		public TerminalNode ZU() { return getToken(TPS_ANTLRParser.ZU, 0); }
		public TerminalNode GEBE() { return getToken(TPS_ANTLRParser.GEBE, 0); }
		public SpringeSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springeST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSpringeST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSpringeST(this);
		}
	}

	public final SpringeSTContext springeST() throws RecognitionException {
		SpringeSTContext _localctx = new SpringeSTContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_springeST);
		try {
			setState(1302);
			switch (_input.LA(1)) {
			case SPRINGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1298); match(SPRINGE);
				}
				break;
			case GEBE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1299); match(GEBE);
				setState(1300); match(WS);
				setState(1301); match(ZU);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StelleSTContext extends ParserRuleContext {
		public String name;
		public Token STELLE;
		public StelleVorTextSTContext stelleVorTextST() {
			return getRuleContext(StelleVorTextSTContext.class,0);
		}
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public TerminalNode STELLE() { return getToken(TPS_ANTLRParser.STELLE, 0); }
		public StelleSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stelleST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStelleST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStelleST(this);
		}
	}

	public final StelleSTContext stelleST() throws RecognitionException {
		StelleSTContext _localctx = new StelleSTContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_stelleST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304); stelleVorTextST();
			setState(1305); match(WS);
			setState(1306); ((StelleSTContext)_localctx).STELLE = match(STELLE);
			((StelleSTContext)_localctx).name =  ((StelleSTContext)_localctx).STELLE.getText();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StelleVorTextSTContext extends ParserRuleContext {
		public TerminalNode STELLE_WORT_DP() { return getToken(TPS_ANTLRParser.STELLE_WORT_DP, 0); }
		public TerminalNode DP() { return getToken(TPS_ANTLRParser.DP, 0); }
		public TerminalNode STELLE_WORT() { return getToken(TPS_ANTLRParser.STELLE_WORT, 0); }
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public StelleVorTextSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stelleVorTextST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStelleVorTextST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStelleVorTextST(this);
		}
	}

	public final StelleVorTextSTContext stelleVorTextST() throws RecognitionException {
		StelleVorTextSTContext _localctx = new StelleVorTextSTContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_stelleVorTextST);
		int _la;
		try {
			setState(1317);
			switch (_input.LA(1)) {
			case STELLE_WORT_DP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1309); match(STELLE_WORT_DP);
				}
				break;
			case STELLE_WORT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1310); match(STELLE_WORT);
				setState(1312);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(1311); match(WS);
					}
					break;
				}
				setState(1315);
				_la = _input.LA(1);
				if (_la==DP) {
					{
					setState(1314); match(DP);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AufrufSTContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public TerminalNode AUF() { return getToken(TPS_ANTLRParser.AUF, 0); }
		public TerminalNode AUFRUF() { return getToken(TPS_ANTLRParser.AUFRUF, 0); }
		public TerminalNode RUFE() { return getToken(TPS_ANTLRParser.RUFE, 0); }
		public TerminalNode MACHE() { return getToken(TPS_ANTLRParser.MACHE, 0); }
		public AufrufSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aufrufST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterAufrufST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitAufrufST(this);
		}
	}

	public final AufrufSTContext aufrufST() throws RecognitionException {
		AufrufSTContext _localctx = new AufrufSTContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_aufrufST);
		try {
			setState(1325);
			switch (_input.LA(1)) {
			case RUFE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1319); match(RUFE);
				setState(1320); match(WS);
				setState(1321); match(AUF);
				}
				}
				break;
			case MACHE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1322); match(MACHE);
				setState(1323); match(WS);
				setState(1324); match(AUFRUF);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZurückgehenSTContext extends ParserRuleContext {
		public TerminalNode ZURÜCK() { return getToken(TPS_ANTLRParser.ZURÜCK, 0); }
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public TerminalNode ZURÜCKGEHEN() { return getToken(TPS_ANTLRParser.ZURÜCKGEHEN, 0); }
		public TerminalNode GEHE() { return getToken(TPS_ANTLRParser.GEHE, 0); }
		public ZurückgehenSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zurückgehenST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterZurückgehenST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitZurückgehenST(this);
		}
	}

	public final ZurückgehenSTContext zurückgehenST() throws RecognitionException {
		ZurückgehenSTContext _localctx = new ZurückgehenSTContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_zurückgehenST);
		try {
			setState(1331);
			switch (_input.LA(1)) {
			case GEHE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1327); match(GEHE);
				setState(1328); match(WS);
				setState(1329); match(ZURÜCK);
				}
				}
				break;
			case ZURÜCKGEHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1330); match(ZURÜCKGEHEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpeichereSTContext extends ParserRuleContext {
		public TerminalNode SCHREIBE() { return getToken(TPS_ANTLRParser.SCHREIBE, 0); }
		public TerminalNode LADE() { return getToken(TPS_ANTLRParser.LADE, 0); }
		public TerminalNode SPEICHERE() { return getToken(TPS_ANTLRParser.SPEICHERE, 0); }
		public SpeichereSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speichereST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSpeichereST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSpeichereST(this);
		}
	}

	public final SpeichereSTContext speichereST() throws RecognitionException {
		SpeichereSTContext _localctx = new SpeichereSTContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_speichereST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCHREIBE) | (1L << SPEICHERE) | (1L << LADE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZwischenSTContext extends ParserRuleContext {
		public TerminalNode ZWISCHENSPEICHER() { return getToken(TPS_ANTLRParser.ZWISCHENSPEICHER, 0); }
		public TerminalNode ZWISCHEN() { return getToken(TPS_ANTLRParser.ZWISCHEN, 0); }
		public ZwischenSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zwischenST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterZwischenST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitZwischenST(this);
		}
	}

	public final ZwischenSTContext zwischenST() throws RecognitionException {
		ZwischenSTContext _localctx = new ZwischenSTContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_zwischenST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			_la = _input.LA(1);
			if ( !(_la==ZWISCHEN || _la==ZWISCHENSPEICHER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErgebnisSTContext extends ParserRuleContext {
		public TerminalNode ERGEBNISSPEICHER() { return getToken(TPS_ANTLRParser.ERGEBNISSPEICHER, 0); }
		public TerminalNode ERGEBNIS() { return getToken(TPS_ANTLRParser.ERGEBNIS, 0); }
		public ErgebnisSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ergebnisST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterErgebnisST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitErgebnisST(this);
		}
	}

	public final ErgebnisSTContext ergebnisST() throws RecognitionException {
		ErgebnisSTContext _localctx = new ErgebnisSTContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_ergebnisST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			_la = _input.LA(1);
			if ( !(_la==ERGEBNISSPEICHER || _la==ERGEBNIS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegisterSTContext extends ParserRuleContext {
		public Zahl reg;
		public PosZahlSTContext posZahlST;
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public PosZahlSTContext posZahlST() {
			return getRuleContext(PosZahlSTContext.class,0);
		}
		public TerminalNode REGISTER() { return getToken(TPS_ANTLRParser.REGISTER, 0); }
		public TerminalNode VON() { return getToken(TPS_ANTLRParser.VON, 0); }
		public RegisterSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registerST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRegisterST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRegisterST(this);
		}
	}

	public final RegisterSTContext registerST() throws RecognitionException {
		RegisterSTContext _localctx = new RegisterSTContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_registerST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339); match(REGISTER);
			setState(1340); match(WS);
			setState(1343);
			_la = _input.LA(1);
			if (_la==VON) {
				{
				setState(1341); match(VON);
				setState(1342); match(WS);
				}
			}

			setState(1345); ((RegisterSTContext)_localctx).posZahlST = posZahlST();
			((RegisterSTContext)_localctx).reg =  ((RegisterSTContext)_localctx).posZahlST.zahl;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BereichSTContext extends ParserRuleContext {
		public Zahl anfang;
		public Zahl ende;
		public RegisterSTContext registerST;
		public List<RegisterSTContext> registerST() {
			return getRuleContexts(RegisterSTContext.class);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public TerminalNode BIS() { return getToken(TPS_ANTLRParser.BIS, 0); }
		public RegisterSTContext registerST(int i) {
			return getRuleContext(RegisterSTContext.class,i);
		}
		public TerminalNode VON() { return getToken(TPS_ANTLRParser.VON, 0); }
		public BereichSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bereichST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterBereichST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitBereichST(this);
		}
	}

	public final BereichSTContext bereichST() throws RecognitionException {
		BereichSTContext _localctx = new BereichSTContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_bereichST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348); match(VON);
			setState(1349); match(WS);
			{
			setState(1350); ((BereichSTContext)_localctx).registerST = registerST();
			((BereichSTContext)_localctx).anfang =  ((BereichSTContext)_localctx).registerST.reg;
			}
			setState(1353); match(WS);
			setState(1354); match(BIS);
			setState(1355); match(WS);
			{
			setState(1356); ((BereichSTContext)_localctx).registerST = registerST();
			((BereichSTContext)_localctx).ende =  ((BereichSTContext)_localctx).registerST.reg;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StapelSTContext extends ParserRuleContext {
		public TerminalNode STAPEL() { return getToken(TPS_ANTLRParser.STAPEL, 0); }
		public StapelSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelST(this);
		}
	}

	public final StapelSTContext stapelST() throws RecognitionException {
		StapelSTContext _localctx = new StapelSTContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_stapelST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359); match(STAPEL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NehmeSTContext extends ParserRuleContext {
		public TerminalNode NEHME() { return getToken(TPS_ANTLRParser.NEHME, 0); }
		public NehmeSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nehmeST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterNehmeST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitNehmeST(this);
		}
	}

	public final NehmeSTContext nehmeST() throws RecognitionException {
		NehmeSTContext _localctx = new NehmeSTContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_nehmeST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361); match(NEHME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZahlSTContext extends ParserRuleContext {
		public Zahl zahl;
		public Token POS_ZAHL;
		public PosZahlSTContext posZahlST;
		public PosZahlSTContext posZahlST() {
			return getRuleContext(PosZahlSTContext.class,0);
		}
		public TerminalNode POS_ZAHL() { return getToken(TPS_ANTLRParser.POS_ZAHL, 0); }
		public TerminalNode NAGATION() { return getToken(TPS_ANTLRParser.NAGATION, 0); }
		public ZahlSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zahlST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterZahlST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitZahlST(this);
		}
	}

	public final ZahlSTContext zahlST() throws RecognitionException {
		ZahlSTContext _localctx = new ZahlSTContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_zahlST);
		boolean negieren = false;
		int _la;
		try {
			setState(1372);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1365);
				_la = _input.LA(1);
				if (_la==NAGATION) {
					{
					setState(1363); match(NAGATION);
					negieren = true;
					}
				}

				setState(1367); ((ZahlSTContext)_localctx).POS_ZAHL = match(POS_ZAHL);
				((ZahlSTContext)_localctx).zahl =  new Zahl(- Long.parseLong(((ZahlSTContext)_localctx).POS_ZAHL.getText()));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1369); ((ZahlSTContext)_localctx).posZahlST = posZahlST();
				((ZahlSTContext)_localctx).zahl =  ((ZahlSTContext)_localctx).posZahlST.zahl;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PosZahlSTContext extends ParserRuleContext {
		public Zahl zahl;
		public Token POS_ZAHL;
		public ZwischenSTContext zwischenST() {
			return getRuleContext(ZwischenSTContext.class,0);
		}
		public ErgebnisSTContext ergebnisST() {
			return getRuleContext(ErgebnisSTContext.class,0);
		}
		public TerminalNode POS_ZAHL() { return getToken(TPS_ANTLRParser.POS_ZAHL, 0); }
		public PosZahlSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posZahlST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterPosZahlST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitPosZahlST(this);
		}
	}

	public final PosZahlSTContext posZahlST() throws RecognitionException {
		PosZahlSTContext _localctx = new PosZahlSTContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_posZahlST);
		try {
			setState(1382);
			switch (_input.LA(1)) {
			case POS_ZAHL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1374); ((PosZahlSTContext)_localctx).POS_ZAHL = match(POS_ZAHL);
				((PosZahlSTContext)_localctx).zahl =  new Zahl(Long.parseLong(((PosZahlSTContext)_localctx).POS_ZAHL.getText()));
				}
				}
				break;
			case ERGEBNISSPEICHER:
			case ERGEBNIS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1376); ergebnisST();
				((PosZahlSTContext)_localctx).zahl =  new Zahl(true);
				}
				}
				break;
			case ZWISCHEN:
			case ZWISCHENSPEICHER:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1379); zwischenST();
				((PosZahlSTContext)_localctx).zahl =  new Zahl(false);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FehlerSTContext extends ParserRuleContext {
		public TerminalNode FEHLER() { return getToken(TPS_ANTLRParser.FEHLER, 0); }
		public TerminalNode FALSCH() { return getToken(TPS_ANTLRParser.FALSCH, 0); }
		public FehlerSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fehlerST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterFehlerST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitFehlerST(this);
		}
	}

	public final FehlerSTContext fehlerST() throws RecognitionException {
		FehlerSTContext _localctx = new FehlerSTContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_fehlerST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			_la = _input.LA(1);
			if ( !(_la==FEHLER || _la==FALSCH) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionSTContext extends ParserRuleContext {
		public TerminalNode VERSION() { return getToken(TPS_ANTLRParser.VERSION, 0); }
		public VersionSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterVersionST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitVersionST(this);
		}
	}

	public final VersionSTContext versionST() throws RecognitionException {
		VersionSTContext _localctx = new VersionSTContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_versionST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386); match(VERSION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StapelMaxGrSTContext extends ParserRuleContext {
		public TerminalNode STAPEL() { return getToken(TPS_ANTLRParser.STAPEL, 0); }
		public TerminalNode DES() { return getToken(TPS_ANTLRParser.DES, 0); }
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public TerminalNode GRÖẞE() { return getToken(TPS_ANTLRParser.GRÖẞE, 0); }
		public TerminalNode STAPELS() { return getToken(TPS_ANTLRParser.STAPELS, 0); }
		public TerminalNode VOM() { return getToken(TPS_ANTLRParser.VOM, 0); }
		public TerminalNode MAXIMALE() { return getToken(TPS_ANTLRParser.MAXIMALE, 0); }
		public TerminalNode MAXIMUM() { return getToken(TPS_ANTLRParser.MAXIMUM, 0); }
		public StapelMaxGrSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelMaxGrST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelMaxGrST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelMaxGrST(this);
		}
	}

	public final StapelMaxGrSTContext stapelMaxGrST() throws RecognitionException {
		StapelMaxGrSTContext _localctx = new StapelMaxGrSTContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_stapelMaxGrST);
		try {
			setState(1410);
			switch (_input.LA(1)) {
			case MAXIMALE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1388); match(MAXIMALE);
				setState(1389); match(WS);
				setState(1403);
				switch (_input.LA(1)) {
				case STAPEL:
					{
					{
					setState(1390); match(STAPEL);
					setState(1391); match(WS);
					setState(1392); match(GRÖẞE);
					}
					}
					break;
				case GRÖẞE:
					{
					{
					setState(1393); match(GRÖẞE);
					setState(1394); match(WS);
					setState(1401);
					switch (_input.LA(1)) {
					case VOM:
						{
						{
						setState(1395); match(VOM);
						setState(1396); match(WS);
						setState(1397); match(STAPEL);
						}
						}
						break;
					case DES:
						{
						{
						setState(1398); match(DES);
						setState(1399); match(WS);
						setState(1400); match(STAPELS);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case STAPEL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1405); match(STAPEL);
				setState(1406); match(WS);
				setState(1407); match(MAXIMUM);
				setState(1408); match(WS);
				setState(1409); match(GRÖẞE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StapelGrSTContext extends ParserRuleContext {
		public TerminalNode STAPEL() { return getToken(TPS_ANTLRParser.STAPEL, 0); }
		public TerminalNode DES() { return getToken(TPS_ANTLRParser.DES, 0); }
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public TerminalNode GRÖẞE() { return getToken(TPS_ANTLRParser.GRÖẞE, 0); }
		public TerminalNode STAPELS() { return getToken(TPS_ANTLRParser.STAPELS, 0); }
		public TerminalNode VOM() { return getToken(TPS_ANTLRParser.VOM, 0); }
		public StapelGrSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelGrST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelGrST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelGrST(this);
		}
	}

	public final StapelGrSTContext stapelGrST() throws RecognitionException {
		StapelGrSTContext _localctx = new StapelGrSTContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_stapelGrST);
		try {
			setState(1425);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1412); match(STAPEL);
				setState(1413); match(WS);
				setState(1414); match(GRÖẞE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1415); match(GRÖẞE);
				setState(1416); match(WS);
				setState(1417); match(DES);
				setState(1418); match(WS);
				setState(1419); match(STAPELS);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1420); match(GRÖẞE);
				setState(1421); match(WS);
				setState(1422); match(VOM);
				setState(1423); match(WS);
				setState(1424); match(STAPEL);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DerSTContext extends ParserRuleContext {
		public TerminalNode DER() { return getToken(TPS_ANTLRParser.DER, 0); }
		public DerSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterDerST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitDerST(this);
		}
	}

	public final DerSTContext derST() throws RecognitionException {
		DerSTContext _localctx = new DerSTContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_derST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427); match(DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WftContext extends ParserRuleContext {
		public String teil;
		public Token tok;
		public TerminalNode EINEN() { return getToken(TPS_ANTLRParser.EINEN, 0); }
		public TerminalNode ODER() { return getToken(TPS_ANTLRParser.ODER, 0); }
		public TerminalNode MENGE() { return getToken(TPS_ANTLRParser.MENGE, 0); }
		public TerminalNode AUSGEBEN() { return getToken(TPS_ANTLRParser.AUSGEBEN, 0); }
		public TerminalNode ZAHL_WORT() { return getToken(TPS_ANTLRParser.ZAHL_WORT, 0); }
		public TerminalNode ERGEBNISSPEICHER() { return getToken(TPS_ANTLRParser.ERGEBNISSPEICHER, 0); }
		public TerminalNode FOLGENDES() { return getToken(TPS_ANTLRParser.FOLGENDES, 0); }
		public TerminalNode NAGATION() { return getToken(TPS_ANTLRParser.NAGATION, 0); }
		public TerminalNode POS_ZAHL() { return getToken(TPS_ANTLRParser.POS_ZAHL, 0); }
		public TerminalNode WORT_WORT() { return getToken(TPS_ANTLRParser.WORT_WORT, 0); }
		public TerminalNode NICHT() { return getToken(TPS_ANTLRParser.NICHT, 0); }
		public TerminalNode REST_2() { return getToken(TPS_ANTLRParser.REST_2, 0); }
		public TerminalNode ZEICHENKETTE() { return getToken(TPS_ANTLRParser.ZEICHENKETTE, 0); }
		public TerminalNode GRÖẞER() { return getToken(TPS_ANTLRParser.GRÖẞER, 0); }
		public TerminalNode MACHE() { return getToken(TPS_ANTLRParser.MACHE, 0); }
		public TerminalNode FEHLER() { return getToken(TPS_ANTLRParser.FEHLER, 0); }
		public TerminalNode GEHE() { return getToken(TPS_ANTLRParser.GEHE, 0); }
		public TerminalNode ZWISCHENSPEICHER() { return getToken(TPS_ANTLRParser.ZWISCHENSPEICHER, 0); }
		public TerminalNode DP() { return getToken(TPS_ANTLRParser.DP, 0); }
		public TerminalNode REGISTER() { return getToken(TPS_ANTLRParser.REGISTER, 0); }
		public TerminalNode ZURÜCKGEHEN() { return getToken(TPS_ANTLRParser.ZURÜCKGEHEN, 0); }
		public TerminalNode SPRINGE() { return getToken(TPS_ANTLRParser.SPRINGE, 0); }
		public TerminalNode LEERZEILE() { return getToken(TPS_ANTLRParser.LEERZEILE, 0); }
		public TerminalNode DIVIDIERE() { return getToken(TPS_ANTLRParser.DIVIDIERE, 0); }
		public TerminalNode MIT() { return getToken(TPS_ANTLRParser.MIT, 0); }
		public TerminalNode SUBTRAHIERE() { return getToken(TPS_ANTLRParser.SUBTRAHIERE, 0); }
		public TerminalNode MAXIMUM() { return getToken(TPS_ANTLRParser.MAXIMUM, 0); }
		public TerminalNode FALSCH() { return getToken(TPS_ANTLRParser.FALSCH, 0); }
		public TerminalNode WENN() { return getToken(TPS_ANTLRParser.WENN, 0); }
		public TerminalNode IST() { return getToken(TPS_ANTLRParser.IST, 0); }
		public TerminalNode DER() { return getToken(TPS_ANTLRParser.DER, 0); }
		public TerminalNode AUFRUF() { return getToken(TPS_ANTLRParser.AUFRUF, 0); }
		public TerminalNode EINESEN() { return getToken(TPS_ANTLRParser.EINESEN, 0); }
		public TerminalNode MULTIPLIZIERE() { return getToken(TPS_ANTLRParser.MULTIPLIZIERE, 0); }
		public TerminalNode ZU() { return getToken(TPS_ANTLRParser.ZU, 0); }
		public TerminalNode UNGLEICH() { return getToken(TPS_ANTLRParser.UNGLEICH, 0); }
		public TerminalNode AUS() { return getToken(TPS_ANTLRParser.AUS, 0); }
		public TerminalNode NEHME() { return getToken(TPS_ANTLRParser.NEHME, 0); }
		public TerminalNode WAR() { return getToken(TPS_ANTLRParser.WAR, 0); }
		public TerminalNode AUF() { return getToken(TPS_ANTLRParser.AUF, 0); }
		public TerminalNode ZEICHEN() { return getToken(TPS_ANTLRParser.ZEICHEN, 0); }
		public TerminalNode KLEINER() { return getToken(TPS_ANTLRParser.KLEINER, 0); }
		public TerminalNode ADDIERE() { return getToken(TPS_ANTLRParser.ADDIERE, 0); }
		public TerminalNode ERGEBNIS() { return getToken(TPS_ANTLRParser.ERGEBNIS, 0); }
		public TerminalNode GAB() { return getToken(TPS_ANTLRParser.GAB, 0); }
		public TerminalNode ZWISCHEN() { return getToken(TPS_ANTLRParser.ZWISCHEN, 0); }
		public TerminalNode WORTFOLGE_WORT() { return getToken(TPS_ANTLRParser.WORTFOLGE_WORT, 0); }
		public TerminalNode DES() { return getToken(TPS_ANTLRParser.DES, 0); }
		public TerminalNode STAPEL() { return getToken(TPS_ANTLRParser.STAPEL, 0); }
		public TerminalNode LETZTEN() { return getToken(TPS_ANTLRParser.LETZTEN, 0); }
		public TerminalNode STELLE_WORT() { return getToken(TPS_ANTLRParser.STELLE_WORT, 0); }
		public TerminalNode REST() { return getToken(TPS_ANTLRParser.REST, 0); }
		public TerminalNode ZEICHENFOLGE() { return getToken(TPS_ANTLRParser.ZEICHENFOLGE, 0); }
		public TerminalNode ANZAHL() { return getToken(TPS_ANTLRParser.ANZAHL, 0); }
		public TerminalNode STELLE() { return getToken(TPS_ANTLRParser.STELLE, 0); }
		public TerminalNode EINE() { return getToken(TPS_ANTLRParser.EINE, 0); }
		public TerminalNode BIS() { return getToken(TPS_ANTLRParser.BIS, 0); }
		public TerminalNode WORTREIHE_WORT() { return getToken(TPS_ANTLRParser.WORTREIHE_WORT, 0); }
		public TerminalNode EIN() { return getToken(TPS_ANTLRParser.EIN, 0); }
		public TerminalNode GEBE() { return getToken(TPS_ANTLRParser.GEBE, 0); }
		public TerminalNode VERSION() { return getToken(TPS_ANTLRParser.VERSION, 0); }
		public TerminalNode ZURÜCK() { return getToken(TPS_ANTLRParser.ZURÜCK, 0); }
		public TerminalNode WORTKETTE_WORT() { return getToken(TPS_ANTLRParser.WORTKETTE_WORT, 0); }
		public TerminalNode RUFE() { return getToken(TPS_ANTLRParser.RUFE, 0); }
		public TerminalNode SPEICHERE() { return getToken(TPS_ANTLRParser.SPEICHERE, 0); }
		public TerminalNode GLEICH() { return getToken(TPS_ANTLRParser.GLEICH, 0); }
		public TerminalNode LESE() { return getToken(TPS_ANTLRParser.LESE, 0); }
		public TerminalNode LEERZEICHEN() { return getToken(TPS_ANTLRParser.LEERZEICHEN, 0); }
		public TerminalNode GRÖẞE() { return getToken(TPS_ANTLRParser.GRÖẞE, 0); }
		public TerminalNode VERGLEICHE() { return getToken(TPS_ANTLRParser.VERGLEICHE, 0); }
		public TerminalNode STAPELS() { return getToken(TPS_ANTLRParser.STAPELS, 0); }
		public TerminalNode LEERTASTE() { return getToken(TPS_ANTLRParser.LEERTASTE, 0); }
		public TerminalNode FALLS() { return getToken(TPS_ANTLRParser.FALLS, 0); }
		public TerminalNode VOM() { return getToken(TPS_ANTLRParser.VOM, 0); }
		public TerminalNode HIER() { return getToken(TPS_ANTLRParser.HIER, 0); }
		public TerminalNode ZEILENUMBRUCH() { return getToken(TPS_ANTLRParser.ZEILENUMBRUCH, 0); }
		public TerminalNode MAXIMALE() { return getToken(TPS_ANTLRParser.MAXIMALE, 0); }
		public TerminalNode VON() { return getToken(TPS_ANTLRParser.VON, 0); }
		public WftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterWft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitWft(this);
		}
	}

	public final WftContext wft() throws RecognitionException {
		WftContext _localctx = new WftContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_wft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			switch (_input.LA(1)) {
			case STELLE_WORT:
				{
				setState(1429); ((WftContext)_localctx).tok = match(STELLE_WORT);
				}
				break;
			case DER:
				{
				setState(1430); ((WftContext)_localctx).tok = match(DER);
				}
				break;
			case WORTREIHE_WORT:
				{
				setState(1431); ((WftContext)_localctx).tok = match(WORTREIHE_WORT);
				}
				break;
			case WORTKETTE_WORT:
				{
				setState(1432); ((WftContext)_localctx).tok = match(WORTKETTE_WORT);
				}
				break;
			case WORTFOLGE_WORT:
				{
				setState(1433); ((WftContext)_localctx).tok = match(WORTFOLGE_WORT);
				}
				break;
			case LETZTEN:
				{
				setState(1434); ((WftContext)_localctx).tok = match(LETZTEN);
				}
				break;
			case ZEICHEN:
				{
				setState(1435); ((WftContext)_localctx).tok = match(ZEICHEN);
				}
				break;
			case ZEICHENFOLGE:
				{
				setState(1436); ((WftContext)_localctx).tok = match(ZEICHENFOLGE);
				}
				break;
			case ZEICHENKETTE:
				{
				setState(1437); ((WftContext)_localctx).tok = match(ZEICHENKETTE);
				}
				break;
			case WORT_WORT:
				{
				setState(1438); ((WftContext)_localctx).tok = match(WORT_WORT);
				}
				break;
			case MENGE:
				{
				setState(1439); ((WftContext)_localctx).tok = match(MENGE);
				}
				break;
			case ANZAHL:
				{
				setState(1440); ((WftContext)_localctx).tok = match(ANZAHL);
				}
				break;
			case ZAHL_WORT:
				{
				setState(1441); ((WftContext)_localctx).tok = match(ZAHL_WORT);
				}
				break;
			case EINESEN:
				{
				setState(1442); ((WftContext)_localctx).tok = match(EINESEN);
				}
				break;
			case EINEN:
				{
				setState(1443); ((WftContext)_localctx).tok = match(EINEN);
				}
				break;
			case EINE:
				{
				setState(1444); ((WftContext)_localctx).tok = match(EINE);
				}
				break;
			case EIN:
				{
				setState(1445); ((WftContext)_localctx).tok = match(EIN);
				}
				break;
			case LESE:
				{
				setState(1446); ((WftContext)_localctx).tok = match(LESE);
				}
				break;
			case ODER:
				{
				setState(1447); ((WftContext)_localctx).tok = match(ODER);
				}
				break;
			case KLEINER:
				{
				setState(1448); ((WftContext)_localctx).tok = match(KLEINER);
				}
				break;
			case GRÖẞER:
				{
				setState(1449); ((WftContext)_localctx).tok = match(GRÖẞER);
				}
				break;
			case UNGLEICH:
				{
				setState(1450); ((WftContext)_localctx).tok = match(UNGLEICH);
				}
				break;
			case NICHT:
				{
				setState(1451); ((WftContext)_localctx).tok = match(NICHT);
				}
				break;
			case GLEICH:
				{
				setState(1452); ((WftContext)_localctx).tok = match(GLEICH);
				}
				break;
			case FALLS:
				{
				setState(1453); ((WftContext)_localctx).tok = match(FALLS);
				}
				break;
			case WENN:
				{
				setState(1454); ((WftContext)_localctx).tok = match(WENN);
				}
				break;
			case DES:
				{
				setState(1455); ((WftContext)_localctx).tok = match(DES);
				}
				break;
			case STAPELS:
				{
				setState(1456); ((WftContext)_localctx).tok = match(STAPELS);
				}
				break;
			case VOM:
				{
				setState(1457); ((WftContext)_localctx).tok = match(VOM);
				}
				break;
			case MAXIMALE:
				{
				setState(1458); ((WftContext)_localctx).tok = match(MAXIMALE);
				}
				break;
			case GRÖẞE:
				{
				setState(1459); ((WftContext)_localctx).tok = match(GRÖẞE);
				}
				break;
			case MAXIMUM:
				{
				setState(1460); ((WftContext)_localctx).tok = match(MAXIMUM);
				}
				break;
			case VERSION:
				{
				setState(1461); ((WftContext)_localctx).tok = match(VERSION);
				}
				break;
			case FEHLER:
				{
				setState(1462); ((WftContext)_localctx).tok = match(FEHLER);
				}
				break;
			case FALSCH:
				{
				setState(1463); ((WftContext)_localctx).tok = match(FALSCH);
				}
				break;
			case NAGATION:
				{
				setState(1464); ((WftContext)_localctx).tok = match(NAGATION);
				}
				break;
			case NEHME:
				{
				setState(1465); ((WftContext)_localctx).tok = match(NEHME);
				}
				break;
			case STAPEL:
				{
				setState(1466); ((WftContext)_localctx).tok = match(STAPEL);
				}
				break;
			case POS_ZAHL:
				{
				setState(1467); ((WftContext)_localctx).tok = match(POS_ZAHL);
				}
				break;
			case REGISTER:
				{
				setState(1468); ((WftContext)_localctx).tok = match(REGISTER);
				}
				break;
			case BIS:
				{
				setState(1469); ((WftContext)_localctx).tok = match(BIS);
				}
				break;
			case ERGEBNISSPEICHER:
				{
				setState(1470); ((WftContext)_localctx).tok = match(ERGEBNISSPEICHER);
				}
				break;
			case ERGEBNIS:
				{
				setState(1471); ((WftContext)_localctx).tok = match(ERGEBNIS);
				}
				break;
			case ZWISCHEN:
				{
				setState(1472); ((WftContext)_localctx).tok = match(ZWISCHEN);
				}
				break;
			case ZWISCHENSPEICHER:
				{
				setState(1473); ((WftContext)_localctx).tok = match(ZWISCHENSPEICHER);
				}
				break;
			case SPEICHERE:
				{
				setState(1474); ((WftContext)_localctx).tok = match(SPEICHERE);
				}
				break;
			case GEHE:
				{
				setState(1475); ((WftContext)_localctx).tok = match(GEHE);
				}
				break;
			case ZURÜCKGEHEN:
				{
				setState(1476); ((WftContext)_localctx).tok = match(ZURÜCKGEHEN);
				}
				break;
			case ZURÜCK:
				{
				setState(1477); ((WftContext)_localctx).tok = match(ZURÜCK);
				}
				break;
			case AUF:
				{
				setState(1478); ((WftContext)_localctx).tok = match(AUF);
				}
				break;
			case AUFRUF:
				{
				setState(1479); ((WftContext)_localctx).tok = match(AUFRUF);
				}
				break;
			case MACHE:
				{
				setState(1480); ((WftContext)_localctx).tok = match(MACHE);
				}
				break;
			case RUFE:
				{
				setState(1481); ((WftContext)_localctx).tok = match(RUFE);
				}
				break;
			case DP:
				{
				setState(1482); ((WftContext)_localctx).tok = match(DP);
				}
				break;
			case SPRINGE:
				{
				setState(1483); ((WftContext)_localctx).tok = match(SPRINGE);
				}
				break;
			case VERGLEICHE:
				{
				setState(1484); ((WftContext)_localctx).tok = match(VERGLEICHE);
				}
				break;
			case DIVIDIERE:
				{
				setState(1485); ((WftContext)_localctx).tok = match(DIVIDIERE);
				}
				break;
			case MULTIPLIZIERE:
				{
				setState(1486); ((WftContext)_localctx).tok = match(MULTIPLIZIERE);
				}
				break;
			case SUBTRAHIERE:
				{
				setState(1487); ((WftContext)_localctx).tok = match(SUBTRAHIERE);
				}
				break;
			case ADDIERE:
				{
				setState(1488); ((WftContext)_localctx).tok = match(ADDIERE);
				}
				break;
			case ZEILENUMBRUCH:
				{
				setState(1489); ((WftContext)_localctx).tok = match(ZEILENUMBRUCH);
				}
				break;
			case LEERZEILE:
				{
				setState(1490); ((WftContext)_localctx).tok = match(LEERZEILE);
				}
				break;
			case LEERTASTE:
				{
				setState(1491); ((WftContext)_localctx).tok = match(LEERTASTE);
				}
				break;
			case LEERZEICHEN:
				{
				setState(1492); ((WftContext)_localctx).tok = match(LEERZEICHEN);
				}
				break;
			case AUS:
				{
				setState(1493); ((WftContext)_localctx).tok = match(AUS);
				}
				break;
			case AUSGEBEN:
				{
				setState(1494); ((WftContext)_localctx).tok = match(AUSGEBEN);
				}
				break;
			case GEBE:
				{
				setState(1495); ((WftContext)_localctx).tok = match(GEBE);
				}
				break;
			case FOLGENDES:
				{
				setState(1496); ((WftContext)_localctx).tok = match(FOLGENDES);
				}
				break;
			case VON:
				{
				setState(1497); ((WftContext)_localctx).tok = match(VON);
				}
				break;
			case ZU:
				{
				setState(1498); ((WftContext)_localctx).tok = match(ZU);
				}
				break;
			case GAB:
				{
				setState(1499); ((WftContext)_localctx).tok = match(GAB);
				}
				break;
			case WAR:
				{
				setState(1500); ((WftContext)_localctx).tok = match(WAR);
				}
				break;
			case MIT:
				{
				setState(1501); ((WftContext)_localctx).tok = match(MIT);
				}
				break;
			case IST:
				{
				setState(1502); ((WftContext)_localctx).tok = match(IST);
				}
				break;
			case HIER:
				{
				setState(1503); ((WftContext)_localctx).tok = match(HIER);
				}
				break;
			case STELLE:
				{
				setState(1504); ((WftContext)_localctx).tok = match(STELLE);
				}
				break;
			case REST:
				{
				setState(1505); ((WftContext)_localctx).tok = match(REST);
				}
				break;
			case REST_2:
				{
				setState(1506); ((WftContext)_localctx).tok = match(REST_2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			((WftContext)_localctx).teil =  ((WftContext)_localctx).tok.getText();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WortfolgeSTContext extends ParserRuleContext {
		public String wortfolge;
		public WftContext wft;
		public List<WftContext> wft() {
			return getRuleContexts(WftContext.class);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public WftContext wft(int i) {
			return getRuleContext(WftContext.class,i);
		}
		public WortfolgeSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wortfolgeST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterWortfolgeST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitWortfolgeST(this);
		}
	}

	public final WortfolgeSTContext wortfolgeST() throws RecognitionException {
		WortfolgeSTContext _localctx = new WortfolgeSTContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_wortfolgeST);
		StringBuilder wf = new StringBuilder();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1511); ((WortfolgeSTContext)_localctx).wft = wft();
			wf.append(((WortfolgeSTContext)_localctx).wft.teil);
			setState(1525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STELLE_WORT) | (1L << DER) | (1L << WORTREIHE_WORT) | (1L << WORTKETTE_WORT) | (1L << WORTFOLGE_WORT) | (1L << LETZTEN) | (1L << ZEICHEN) | (1L << ZEICHENFOLGE) | (1L << ZEICHENKETTE) | (1L << WORT_WORT) | (1L << MENGE) | (1L << ANZAHL) | (1L << ZAHL_WORT) | (1L << EINESEN) | (1L << EINEN) | (1L << EINE) | (1L << EIN) | (1L << LESE) | (1L << ODER) | (1L << KLEINER) | (1L << GRÖẞER) | (1L << UNGLEICH) | (1L << NICHT) | (1L << GLEICH) | (1L << FALLS) | (1L << WENN) | (1L << DES) | (1L << STAPELS) | (1L << VOM) | (1L << MAXIMALE) | (1L << GRÖẞE) | (1L << MAXIMUM) | (1L << VERSION) | (1L << FEHLER) | (1L << FALSCH) | (1L << NAGATION) | (1L << NEHME) | (1L << STAPEL) | (1L << POS_ZAHL) | (1L << REGISTER) | (1L << BIS) | (1L << ERGEBNISSPEICHER) | (1L << ERGEBNIS) | (1L << ZWISCHEN) | (1L << ZWISCHENSPEICHER) | (1L << SPEICHERE) | (1L << GEHE) | (1L << ZURÜCKGEHEN) | (1L << ZURÜCK) | (1L << AUF) | (1L << AUFRUF) | (1L << MACHE) | (1L << RUFE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SPRINGE - 64)) | (1L << (VERGLEICHE - 64)) | (1L << (DIVIDIERE - 64)) | (1L << (MULTIPLIZIERE - 64)) | (1L << (SUBTRAHIERE - 64)) | (1L << (ADDIERE - 64)) | (1L << (ZEILENUMBRUCH - 64)) | (1L << (LEERZEILE - 64)) | (1L << (LEERTASTE - 64)) | (1L << (LEERZEICHEN - 64)) | (1L << (DP - 64)) | (1L << (AUS - 64)) | (1L << (AUSGEBEN - 64)) | (1L << (GEBE - 64)) | (1L << (FOLGENDES - 64)) | (1L << (VON - 64)) | (1L << (ZU - 64)) | (1L << (GAB - 64)) | (1L << (WAR - 64)) | (1L << (MIT - 64)) | (1L << (IST - 64)) | (1L << (HIER - 64)) | (1L << (STELLE - 64)) | (1L << (REST - 64)) | (1L << (REST_2 - 64)))) != 0)) {
				{
				{
				setState(1516); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1513); ((WortfolgeSTContext)_localctx).wft = wft();
					wf.append(((WortfolgeSTContext)_localctx).wft.teil);
					}
					}
					setState(1518); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STELLE_WORT) | (1L << DER) | (1L << WORTREIHE_WORT) | (1L << WORTKETTE_WORT) | (1L << WORTFOLGE_WORT) | (1L << LETZTEN) | (1L << ZEICHEN) | (1L << ZEICHENFOLGE) | (1L << ZEICHENKETTE) | (1L << WORT_WORT) | (1L << MENGE) | (1L << ANZAHL) | (1L << ZAHL_WORT) | (1L << EINESEN) | (1L << EINEN) | (1L << EINE) | (1L << EIN) | (1L << LESE) | (1L << ODER) | (1L << KLEINER) | (1L << GRÖẞER) | (1L << UNGLEICH) | (1L << NICHT) | (1L << GLEICH) | (1L << FALLS) | (1L << WENN) | (1L << DES) | (1L << STAPELS) | (1L << VOM) | (1L << MAXIMALE) | (1L << GRÖẞE) | (1L << MAXIMUM) | (1L << VERSION) | (1L << FEHLER) | (1L << FALSCH) | (1L << NAGATION) | (1L << NEHME) | (1L << STAPEL) | (1L << POS_ZAHL) | (1L << REGISTER) | (1L << BIS) | (1L << ERGEBNISSPEICHER) | (1L << ERGEBNIS) | (1L << ZWISCHEN) | (1L << ZWISCHENSPEICHER) | (1L << SPEICHERE) | (1L << GEHE) | (1L << ZURÜCKGEHEN) | (1L << ZURÜCK) | (1L << AUF) | (1L << AUFRUF) | (1L << MACHE) | (1L << RUFE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SPRINGE - 64)) | (1L << (VERGLEICHE - 64)) | (1L << (DIVIDIERE - 64)) | (1L << (MULTIPLIZIERE - 64)) | (1L << (SUBTRAHIERE - 64)) | (1L << (ADDIERE - 64)) | (1L << (ZEILENUMBRUCH - 64)) | (1L << (LEERZEILE - 64)) | (1L << (LEERTASTE - 64)) | (1L << (LEERZEICHEN - 64)) | (1L << (DP - 64)) | (1L << (AUS - 64)) | (1L << (AUSGEBEN - 64)) | (1L << (GEBE - 64)) | (1L << (FOLGENDES - 64)) | (1L << (VON - 64)) | (1L << (ZU - 64)) | (1L << (GAB - 64)) | (1L << (WAR - 64)) | (1L << (MIT - 64)) | (1L << (IST - 64)) | (1L << (HIER - 64)) | (1L << (STELLE - 64)) | (1L << (REST - 64)) | (1L << (REST_2 - 64)))) != 0) );
				setState(1520); match(WS);
				wf.append(' ');
				}
				}
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((WortfolgeSTContext)_localctx).wortfolge =  wf.toString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WennSTContext extends ParserRuleContext {
		public TerminalNode WENN() { return getToken(TPS_ANTLRParser.WENN, 0); }
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public TerminalNode ES() { return getToken(TPS_ANTLRParser.ES, 0); }
		public TerminalNode FALLS() { return getToken(TPS_ANTLRParser.FALLS, 0); }
		public WennSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wennST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterWennST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitWennST(this);
		}
	}

	public final WennSTContext wennST() throws RecognitionException {
		WennSTContext _localctx = new WennSTContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_wennST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1530);
			_la = _input.LA(1);
			if ( !(_la==FALLS || _la==WENN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(1531); match(WS);
			setState(1532); match(ES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UngleichSTContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public TerminalNode GLEICH() { return getToken(TPS_ANTLRParser.GLEICH, 0); }
		public TerminalNode UNGLEICH() { return getToken(TPS_ANTLRParser.UNGLEICH, 0); }
		public TerminalNode NICHT() { return getToken(TPS_ANTLRParser.NICHT, 0); }
		public UngleichSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ungleichST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterUngleichST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitUngleichST(this);
		}
	}

	public final UngleichSTContext ungleichST() throws RecognitionException {
		UngleichSTContext _localctx = new UngleichSTContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_ungleichST);
		try {
			setState(1538);
			switch (_input.LA(1)) {
			case UNGLEICH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1534); match(UNGLEICH);
				}
				break;
			case NICHT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1535); match(NICHT);
				setState(1536); match(WS);
				setState(1537); match(GLEICH);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GleichSTContext extends ParserRuleContext {
		public TerminalNode GLEICH() { return getToken(TPS_ANTLRParser.GLEICH, 0); }
		public GleichSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gleichST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterGleichST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitGleichST(this);
		}
	}

	public final GleichSTContext gleichST() throws RecognitionException {
		GleichSTContext _localctx = new GleichSTContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_gleichST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540); match(GLEICH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrößerSTContext extends ParserRuleContext {
		public TerminalNode GRÖẞER() { return getToken(TPS_ANTLRParser.GRÖẞER, 0); }
		public GrößerSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_größerST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterGrößerST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitGrößerST(this);
		}
	}

	public final GrößerSTContext größerST() throws RecognitionException {
		GrößerSTContext _localctx = new GrößerSTContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_größerST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542); match(GRÖẞER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KleinerSTContext extends ParserRuleContext {
		public TerminalNode KLEINER() { return getToken(TPS_ANTLRParser.KLEINER, 0); }
		public KleinerSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kleinerST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterKleinerST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitKleinerST(this);
		}
	}

	public final KleinerSTContext kleinerST() throws RecognitionException {
		KleinerSTContext _localctx = new KleinerSTContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_kleinerST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544); match(KLEINER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrößerGleichSTContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public TerminalNode ODER() { return getToken(TPS_ANTLRParser.ODER, 0); }
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public TerminalNode GRÖẞER() { return getToken(TPS_ANTLRParser.GRÖẞER, 0); }
		public TerminalNode GLEICH() { return getToken(TPS_ANTLRParser.GLEICH, 0); }
		public GrößerGleichSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_größerGleichST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterGrößerGleichST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitGrößerGleichST(this);
		}
	}

	public final GrößerGleichSTContext größerGleichST() throws RecognitionException {
		GrößerGleichSTContext _localctx = new GrößerGleichSTContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_größerGleichST);
		try {
			setState(1556);
			switch (_input.LA(1)) {
			case GRÖẞER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1546); match(GRÖẞER);
				setState(1547); match(WS);
				setState(1548); match(ODER);
				setState(1549); match(WS);
				setState(1550); match(GLEICH);
				}
				}
				break;
			case GLEICH:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1551); match(GLEICH);
				setState(1552); match(WS);
				setState(1553); match(ODER);
				setState(1554); match(WS);
				setState(1555); match(GRÖẞER);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KleinerGleichSTContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public TerminalNode ODER() { return getToken(TPS_ANTLRParser.ODER, 0); }
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public TerminalNode KLEINER() { return getToken(TPS_ANTLRParser.KLEINER, 0); }
		public TerminalNode GLEICH() { return getToken(TPS_ANTLRParser.GLEICH, 0); }
		public KleinerGleichSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kleinerGleichST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterKleinerGleichST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitKleinerGleichST(this);
		}
	}

	public final KleinerGleichSTContext kleinerGleichST() throws RecognitionException {
		KleinerGleichSTContext _localctx = new KleinerGleichSTContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_kleinerGleichST);
		try {
			setState(1568);
			switch (_input.LA(1)) {
			case KLEINER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1558); match(KLEINER);
				setState(1559); match(WS);
				setState(1560); match(ODER);
				setState(1561); match(WS);
				setState(1562); match(GLEICH);
				}
				}
				break;
			case GLEICH:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1563); match(GLEICH);
				setState(1564); match(WS);
				setState(1565); match(ODER);
				setState(1566); match(WS);
				setState(1567); match(KLEINER);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EinlesenSTContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public TerminalNode EINESEN() { return getToken(TPS_ANTLRParser.EINESEN, 0); }
		public TerminalNode EIN() { return getToken(TPS_ANTLRParser.EIN, 0); }
		public TerminalNode LESE() { return getToken(TPS_ANTLRParser.LESE, 0); }
		public EinlesenSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_einlesenST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterEinlesenST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitEinlesenST(this);
		}
	}

	public final EinlesenSTContext einlesenST() throws RecognitionException {
		EinlesenSTContext _localctx = new EinlesenSTContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_einlesenST);
		try {
			setState(1574);
			switch (_input.LA(1)) {
			case LESE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1570); match(LESE);
				setState(1571); match(WS);
				setState(1572); match(EIN);
				}
				}
				break;
			case EINESEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1573); match(EINESEN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZahlST_Context extends ParserRuleContext {
		public TerminalNode ZAHL_WORT() { return getToken(TPS_ANTLRParser.ZAHL_WORT, 0); }
		public ZahlST_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zahlST_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterZahlST_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitZahlST_(this);
		}
	}

	public final ZahlST_Context zahlST_() throws RecognitionException {
		ZahlST_Context _localctx = new ZahlST_Context(_ctx, getState());
		enterRule(_localctx, 216, RULE_zahlST_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576); match(ZAHL_WORT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegisterST_Context extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(TPS_ANTLRParser.REGISTER, 0); }
		public RegisterST_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registerST_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRegisterST_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRegisterST_(this);
		}
	}

	public final RegisterST_Context registerST_() throws RecognitionException {
		RegisterST_Context _localctx = new RegisterST_Context(_ctx, getState());
		enterRule(_localctx, 218, RULE_registerST_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578); match(REGISTER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnzahlSTContext extends ParserRuleContext {
		public TerminalNode MENGE() { return getToken(TPS_ANTLRParser.MENGE, 0); }
		public TerminalNode ANZAHL() { return getToken(TPS_ANTLRParser.ANZAHL, 0); }
		public AnzahlSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anzahlST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterAnzahlST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitAnzahlST(this);
		}
	}

	public final AnzahlSTContext anzahlST() throws RecognitionException {
		AnzahlSTContext _localctx = new AnzahlSTContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_anzahlST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			_la = _input.LA(1);
			if ( !(_la==MENGE || _la==ANZAHL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WortSTContext extends ParserRuleContext {
		public TerminalNode ZEICHENFOLGE() { return getToken(TPS_ANTLRParser.ZEICHENFOLGE, 0); }
		public TerminalNode ZEICHENKETTE() { return getToken(TPS_ANTLRParser.ZEICHENKETTE, 0); }
		public TerminalNode WORT_WORT() { return getToken(TPS_ANTLRParser.WORT_WORT, 0); }
		public WortSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wortST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterWortST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitWortST(this);
		}
	}

	public final WortSTContext wortST() throws RecognitionException {
		WortSTContext _localctx = new WortSTContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_wortST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZEICHENFOLGE) | (1L << ZEICHENKETTE) | (1L << WORT_WORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ZeichenSTContext extends ParserRuleContext {
		public TerminalNode ZEICHEN() { return getToken(TPS_ANTLRParser.ZEICHEN, 0); }
		public ZeichenSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeichenST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterZeichenST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitZeichenST(this);
		}
	}

	public final ZeichenSTContext zeichenST() throws RecognitionException {
		ZeichenSTContext _localctx = new ZeichenSTContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_zeichenST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584); match(ZEICHEN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetztenFehlerSTContext extends ParserRuleContext {
		public TerminalNode LETZTEN() { return getToken(TPS_ANTLRParser.LETZTEN, 0); }
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public TerminalNode FEHLER() { return getToken(TPS_ANTLRParser.FEHLER, 0); }
		public LetztenFehlerSTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letztenFehlerST; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterLetztenFehlerST(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitLetztenFehlerST(this);
		}
	}

	public final LetztenFehlerSTContext letztenFehlerST() throws RecognitionException {
		LetztenFehlerSTContext _localctx = new LetztenFehlerSTContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_letztenFehlerST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586); match(LETZTEN);
			setState(1587); match(WS);
			setState(1588); match(FEHLER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3]\u0639\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\3\2\3\2\5\2\u00e9\n"+
		"\2\3\2\3\2\6\2\u00ed\n\2\r\2\16\2\u00ee\3\2\3\2\3\3\3\3\3\3\5\3\u00f6"+
		"\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u01a3\n"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\u01b6\n\6\3\6\3\6\3\6\5\6\u01bb\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01cb\n\7\3\7\3\7\3\7\5\7\u01d0\n\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01e0\n\b\3\b"+
		"\3\b\3\b\5\b\u01e5\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u01f4\n\t\3\t\3\t\3\t\5\t\u01f9\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u0206\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0212\n\13\3\13\3\13\3\13\5\13\u0217\n\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u022b"+
		"\n\r\3\r\3\r\3\r\5\r\u0230\n\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0242\n\16\3\16\3\16\3\16"+
		"\5\16\u0247\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u0259\n\17\3\17\3\17\3\17\5\17\u025e\n"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u0270\n\20\3\20\3\20\3\20\5\20\u0275\n\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0287\n\21\3\21\3\21\3\21\5\21\u028c\n\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u029e"+
		"\n\22\3\22\3\22\3\22\5\22\u02a3\n\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u02af\n\23\3\23\3\23\3\23\5\23\u02b4\n\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u02d8\n\26\3\26\3\26\3\26\5\26\u02dd\n\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u02ea\n\27"+
		"\3\27\3\27\3\27\5\27\u02ef\n\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u02fb\n\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0309\n\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u0318\n\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0326\n\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0336\n\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0347\n\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0357\n\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0368\n\37\3\37\3\37\3\37\3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0378\n \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\5!\u0386\n!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\5#\u039f\n#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\5$\u03b4\n$\3$\3$\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&"+
		"\3&\3&\3&\5&\u03c5\n&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'"+
		"\u03d3\n\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u03e1\n(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u03ef\n)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\5*\u03fc\n*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\5,\u040e"+
		"\n,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u0420\n-\3-\3-"+
		"\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0432\n.\3.\3.\3.\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0444\n/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0456\n\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u0468\n\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u047a\n\62\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\5\63\u0486\n\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\5\65\u049e\n\65\5\65\u04a0\n\65\3\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38"+
		"\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?"+
		"\3?\3?\3?\3?\3?\3?\3?\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F"+
		"\3G\3G\3H\3H\3H\5H\u0500\nH\3H\5H\u0503\nH\3I\3I\3J\3J\3K\3K\3L\3L\3M"+
		"\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3Q\3Q\5Q\u0519\nQ\3R\3R\3R\3R\3R\3S\3S\3S"+
		"\5S\u0523\nS\3S\5S\u0526\nS\5S\u0528\nS\3T\3T\3T\3T\3T\3T\5T\u0530\nT"+
		"\3U\3U\3U\3U\5U\u0536\nU\3V\3V\3W\3W\3X\3X\3Y\3Y\3Y\3Y\5Y\u0542\nY\3Y"+
		"\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3\\\3\\\3]\3]\5]\u0558\n"+
		"]\3]\3]\3]\3]\3]\5]\u055f\n]\3^\3^\3^\3^\3^\3^\3^\3^\5^\u0569\n^\3_\3"+
		"_\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u057c\na\5a\u057e\n"+
		"a\3a\3a\3a\3a\3a\5a\u0585\na\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5"+
		"b\u0594\nb\3c\3c\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3"+
		"d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u05e6\nd\3d\3d\3e\3e\3"+
		"e\3e\3e\6e\u05ef\ne\re\16e\u05f0\3e\3e\3e\7e\u05f6\ne\fe\16e\u05f9\13"+
		"e\3e\3e\3f\3f\3f\3f\3g\3g\3g\3g\5g\u0605\ng\3h\3h\3i\3i\3j\3j\3k\3k\3"+
		"k\3k\3k\3k\3k\3k\3k\3k\5k\u0617\nk\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u0623"+
		"\nl\3m\3m\3m\3m\5m\u0629\nm\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3s\3s"+
		"\3s\2\2t\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\2\25\3\2\7\13\3"+
		"\2\30\32\3\2VW\4\2>>SU\4\2\'\'RR\3\2OP\3\2JK\3\2HI\3\2GG\3\2FF\3\2EE\3"+
		"\2DD\3\28:\3\2\66\67\3\2\64\65\3\2,-\3\2\"#\3\2\24\25\3\2\21\23\u069d"+
		"\2\u00ec\3\2\2\2\4\u00f2\3\2\2\2\6\u01a2\3\2\2\2\b\u01a4\3\2\2\2\n\u01a8"+
		"\3\2\2\2\f\u01bf\3\2\2\2\16\u01d4\3\2\2\2\20\u01e8\3\2\2\2\22\u01fc\3"+
		"\2\2\2\24\u020a\3\2\2\2\26\u021b\3\2\2\2\30\u021d\3\2\2\2\32\u0234\3\2"+
		"\2\2\34\u024b\3\2\2\2\36\u0262\3\2\2\2 \u0279\3\2\2\2\"\u0290\3\2\2\2"+
		"$\u02a7\3\2\2\2&\u02b8\3\2\2\2(\u02c3\3\2\2\2*\u02ce\3\2\2\2,\u02e0\3"+
		"\2\2\2.\u02f3\3\2\2\2\60\u02ff\3\2\2\2\62\u030e\3\2\2\2\64\u031c\3\2\2"+
		"\2\66\u032a\3\2\2\28\u033b\3\2\2\2:\u034b\3\2\2\2<\u035a\3\2\2\2>\u036c"+
		"\3\2\2\2@\u037c\3\2\2\2B\u038a\3\2\2\2D\u038f\3\2\2\2F\u03a4\3\2\2\2H"+
		"\u03b9\3\2\2\2J\u03bb\3\2\2\2L\u03c9\3\2\2\2N\u03d7\3\2\2\2P\u03e5\3\2"+
		"\2\2R\u03f2\3\2\2\2T\u03ff\3\2\2\2V\u0406\3\2\2\2X\u0412\3\2\2\2Z\u0424"+
		"\3\2\2\2\\\u0436\3\2\2\2^\u0448\3\2\2\2`\u045a\3\2\2\2b\u046c\3\2\2\2"+
		"d\u047e\3\2\2\2f\u048a\3\2\2\2h\u0495\3\2\2\2j\u04a4\3\2\2\2l\u04ad\3"+
		"\2\2\2n\u04b3\3\2\2\2p\u04b5\3\2\2\2r\u04b7\3\2\2\2t\u04bb\3\2\2\2v\u04c0"+
		"\3\2\2\2x\u04cb\3\2\2\2z\u04d6\3\2\2\2|\u04e1\3\2\2\2~\u04ec\3\2\2\2\u0080"+
		"\u04ee\3\2\2\2\u0082\u04f0\3\2\2\2\u0084\u04f2\3\2\2\2\u0086\u04f4\3\2"+
		"\2\2\u0088\u04f6\3\2\2\2\u008a\u04f8\3\2\2\2\u008c\u04fa\3\2\2\2\u008e"+
		"\u0502\3\2\2\2\u0090\u0504\3\2\2\2\u0092\u0506\3\2\2\2\u0094\u0508\3\2"+
		"\2\2\u0096\u050a\3\2\2\2\u0098\u050c\3\2\2\2\u009a\u050e\3\2\2\2\u009c"+
		"\u0510\3\2\2\2\u009e\u0512\3\2\2\2\u00a0\u0518\3\2\2\2\u00a2\u051a\3\2"+
		"\2\2\u00a4\u0527\3\2\2\2\u00a6\u052f\3\2\2\2\u00a8\u0535\3\2\2\2\u00aa"+
		"\u0537\3\2\2\2\u00ac\u0539\3\2\2\2\u00ae\u053b\3\2\2\2\u00b0\u053d\3\2"+
		"\2\2\u00b2\u0546\3\2\2\2\u00b4\u0551\3\2\2\2\u00b6\u0553\3\2\2\2\u00b8"+
		"\u055e\3\2\2\2\u00ba\u0568\3\2\2\2\u00bc\u056a\3\2\2\2\u00be\u056c\3\2"+
		"\2\2\u00c0\u0584\3\2\2\2\u00c2\u0593\3\2\2\2\u00c4\u0595\3\2\2\2\u00c6"+
		"\u05e5\3\2\2\2\u00c8\u05e9\3\2\2\2\u00ca\u05fc\3\2\2\2\u00cc\u0604\3\2"+
		"\2\2\u00ce\u0606\3\2\2\2\u00d0\u0608\3\2\2\2\u00d2\u060a\3\2\2\2\u00d4"+
		"\u0616\3\2\2\2\u00d6\u0622\3\2\2\2\u00d8\u0628\3\2\2\2\u00da\u062a\3\2"+
		"\2\2\u00dc\u062c\3\2\2\2\u00de\u062e\3\2\2\2\u00e0\u0630\3\2\2\2\u00e2"+
		"\u0632\3\2\2\2\u00e4\u0634\3\2\2\2\u00e6\u00e8\5\4\3\2\u00e7\u00e9\7\4"+
		"\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\b\2\1\2\u00eb\u00ed\3\2\2\2\u00ec\u00e6\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\7\2\2\3\u00f1\3\3\2\2\2\u00f2\u00f3\b\3\1\2\u00f3\u00f5\5\6\4\2"+
		"\u00f4\u00f6\7\4\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f8\7\3\2\2\u00f8\u00f9\b\3\1\2\u00f9\5\3\2\2\2\u00fa"+
		"\u00fb\5|?\2\u00fb\u00fc\b\4\1\2\u00fc\u01a3\3\2\2\2\u00fd\u00fe\5z>\2"+
		"\u00fe\u00ff\b\4\1\2\u00ff\u01a3\3\2\2\2\u0100\u0101\5v<\2\u0101\u0102"+
		"\b\4\1\2\u0102\u01a3\3\2\2\2\u0103\u0104\5x=\2\u0104\u0105\b\4\1\2\u0105"+
		"\u01a3\3\2\2\2\u0106\u0107\5t;\2\u0107\u0108\b\4\1\2\u0108\u01a3\3\2\2"+
		"\2\u0109\u010a\5r:\2\u010a\u010b\b\4\1\2\u010b\u01a3\3\2\2\2\u010c\u010d"+
		"\5l\67\2\u010d\u010e\b\4\1\2\u010e\u01a3\3\2\2\2\u010f\u0110\5j\66\2\u0110"+
		"\u0111\b\4\1\2\u0111\u01a3\3\2\2\2\u0112\u0113\5h\65\2\u0113\u0114\b\4"+
		"\1\2\u0114\u01a3\3\2\2\2\u0115\u0116\5f\64\2\u0116\u0117\b\4\1\2\u0117"+
		"\u01a3\3\2\2\2\u0118\u0119\5d\63\2\u0119\u011a\b\4\1\2\u011a\u01a3\3\2"+
		"\2\2\u011b\u011c\5`\61\2\u011c\u011d\b\4\1\2\u011d\u01a3\3\2\2\2\u011e"+
		"\u011f\5b\62\2\u011f\u0120\b\4\1\2\u0120\u01a3\3\2\2\2\u0121\u0122\5^"+
		"\60\2\u0122\u0123\b\4\1\2\u0123\u01a3\3\2\2\2\u0124\u0125\5\\/\2\u0125"+
		"\u0126\b\4\1\2\u0126\u01a3\3\2\2\2\u0127\u0128\5Z.\2\u0128\u0129\b\4\1"+
		"\2\u0129\u01a3\3\2\2\2\u012a\u012b\5X-\2\u012b\u012c\b\4\1\2\u012c\u01a3"+
		"\3\2\2\2\u012d\u012e\5V,\2\u012e\u012f\b\4\1\2\u012f\u01a3\3\2\2\2\u0130"+
		"\u0131\5T+\2\u0131\u0132\b\4\1\2\u0132\u01a3\3\2\2\2\u0133\u0134\5R*\2"+
		"\u0134\u0135\b\4\1\2\u0135\u01a3\3\2\2\2\u0136\u0137\5P)\2\u0137\u0138"+
		"\b\4\1\2\u0138\u01a3\3\2\2\2\u0139\u013a\5N(\2\u013a\u013b\b\4\1\2\u013b"+
		"\u01a3\3\2\2\2\u013c\u013d\5L\'\2\u013d\u013e\b\4\1\2\u013e\u01a3\3\2"+
		"\2\2\u013f\u0140\5J&\2\u0140\u0141\b\4\1\2\u0141\u01a3\3\2\2\2\u0142\u0143"+
		"\5F$\2\u0143\u0144\b\4\1\2\u0144\u01a3\3\2\2\2\u0145\u0146\5D#\2\u0146"+
		"\u0147\b\4\1\2\u0147\u01a3\3\2\2\2\u0148\u0149\5B\"\2\u0149\u014a\b\4"+
		"\1\2\u014a\u01a3\3\2\2\2\u014b\u014c\5@!\2\u014c\u014d\b\4\1\2\u014d\u01a3"+
		"\3\2\2\2\u014e\u014f\5> \2\u014f\u0150\b\4\1\2\u0150\u01a3\3\2\2\2\u0151"+
		"\u0152\5<\37\2\u0152\u0153\b\4\1\2\u0153\u01a3\3\2\2\2\u0154\u0155\5:"+
		"\36\2\u0155\u0156\b\4\1\2\u0156\u01a3\3\2\2\2\u0157\u0158\5\66\34\2\u0158"+
		"\u0159\b\4\1\2\u0159\u01a3\3\2\2\2\u015a\u015b\58\35\2\u015b\u015c\b\4"+
		"\1\2\u015c\u01a3\3\2\2\2\u015d\u015e\5\64\33\2\u015e\u015f\b\4\1\2\u015f"+
		"\u01a3\3\2\2\2\u0160\u0161\5\62\32\2\u0161\u0162\b\4\1\2\u0162\u01a3\3"+
		"\2\2\2\u0163\u0164\5\60\31\2\u0164\u0165\b\4\1\2\u0165\u01a3\3\2\2\2\u0166"+
		"\u0167\5.\30\2\u0167\u0168\b\4\1\2\u0168\u01a3\3\2\2\2\u0169\u016a\5*"+
		"\26\2\u016a\u016b\b\4\1\2\u016b\u01a3\3\2\2\2\u016c\u016d\5,\27\2\u016d"+
		"\u016e\b\4\1\2\u016e\u01a3\3\2\2\2\u016f\u0170\5(\25\2\u0170\u0171\b\4"+
		"\1\2\u0171\u01a3\3\2\2\2\u0172\u0173\5&\24\2\u0173\u0174\b\4\1\2\u0174"+
		"\u01a3\3\2\2\2\u0175\u0176\5$\23\2\u0176\u0177\b\4\1\2\u0177\u01a3\3\2"+
		"\2\2\u0178\u0179\5\"\22\2\u0179\u017a\b\4\1\2\u017a\u01a3\3\2\2\2\u017b"+
		"\u017c\5 \21\2\u017c\u017d\b\4\1\2\u017d\u01a3\3\2\2\2\u017e\u017f\5\36"+
		"\20\2\u017f\u0180\b\4\1\2\u0180\u01a3\3\2\2\2\u0181\u0182\5\34\17\2\u0182"+
		"\u0183\b\4\1\2\u0183\u01a3\3\2\2\2\u0184\u0185\5\32\16\2\u0185\u0186\b"+
		"\4\1\2\u0186\u01a3\3\2\2\2\u0187\u0188\5\30\r\2\u0188\u0189\b\4\1\2\u0189"+
		"\u01a3\3\2\2\2\u018a\u018b\5\26\f\2\u018b\u018c\b\4\1\2\u018c\u01a3\3"+
		"\2\2\2\u018d\u018e\5\24\13\2\u018e\u018f\b\4\1\2\u018f\u01a3\3\2\2\2\u0190"+
		"\u0191\5\22\n\2\u0191\u0192\b\4\1\2\u0192\u01a3\3\2\2\2\u0193\u0194\5"+
		"\20\t\2\u0194\u0195\b\4\1\2\u0195\u01a3\3\2\2\2\u0196\u0197\5\16\b\2\u0197"+
		"\u0198\b\4\1\2\u0198\u01a3\3\2\2\2\u0199\u019a\5\f\7\2\u019a\u019b\b\4"+
		"\1\2\u019b\u01a3\3\2\2\2\u019c\u019d\5\n\6\2\u019d\u019e\b\4\1\2\u019e"+
		"\u01a3\3\2\2\2\u019f\u01a0\5\b\5\2\u01a0\u01a1\b\4\1\2\u01a1\u01a3\3\2"+
		"\2\2\u01a2\u00fa\3\2\2\2\u01a2\u00fd\3\2\2\2\u01a2\u0100\3\2\2\2\u01a2"+
		"\u0103\3\2\2\2\u01a2\u0106\3\2\2\2\u01a2\u0109\3\2\2\2\u01a2\u010c\3\2"+
		"\2\2\u01a2\u010f\3\2\2\2\u01a2\u0112\3\2\2\2\u01a2\u0115\3\2\2\2\u01a2"+
		"\u0118\3\2\2\2\u01a2\u011b\3\2\2\2\u01a2\u011e\3\2\2\2\u01a2\u0121\3\2"+
		"\2\2\u01a2\u0124\3\2\2\2\u01a2\u0127\3\2\2\2\u01a2\u012a\3\2\2\2\u01a2"+
		"\u012d\3\2\2\2\u01a2\u0130\3\2\2\2\u01a2\u0133\3\2\2\2\u01a2\u0136\3\2"+
		"\2\2\u01a2\u0139\3\2\2\2\u01a2\u013c\3\2\2\2\u01a2\u013f\3\2\2\2\u01a2"+
		"\u0142\3\2\2\2\u01a2\u0145\3\2\2\2\u01a2\u0148\3\2\2\2\u01a2\u014b\3\2"+
		"\2\2\u01a2\u014e\3\2\2\2\u01a2\u0151\3\2\2\2\u01a2\u0154\3\2\2\2\u01a2"+
		"\u0157\3\2\2\2\u01a2\u015a\3\2\2\2\u01a2\u015d\3\2\2\2\u01a2\u0160\3\2"+
		"\2\2\u01a2\u0163\3\2\2\2\u01a2\u0166\3\2\2\2\u01a2\u0169\3\2\2\2\u01a2"+
		"\u016c\3\2\2\2\u01a2\u016f\3\2\2\2\u01a2\u0172\3\2\2\2\u01a2\u0175\3\2"+
		"\2\2\u01a2\u0178\3\2\2\2\u01a2\u017b\3\2\2\2\u01a2\u017e\3\2\2\2\u01a2"+
		"\u0181\3\2\2\2\u01a2\u0184\3\2\2\2\u01a2\u0187\3\2\2\2\u01a2\u018a\3\2"+
		"\2\2\u01a2\u018d\3\2\2\2\u01a2\u0190\3\2\2\2\u01a2\u0193\3\2\2\2\u01a2"+
		"\u0196\3\2\2\2\u01a2\u0199\3\2\2\2\u01a2\u019c\3\2\2\2\u01a2\u019f\3\2"+
		"\2\2\u01a3\7\3\2\2\2\u01a4\u01a5\5\u00b6\\\2\u01a5\u01a6\7\4\2\2\u01a6"+
		"\u01a7\5\u00e4s\2\u01a7\t\3\2\2\2\u01a8\u01a9\5\u00caf\2\u01a9\u01aa\7"+
		"\4\2\2\u01aa\u01ab\5\u00bc_\2\u01ab\u01ac\7\4\2\2\u01ac\u01ad\5\u0084"+
		"C\2\u01ad\u01ae\7\4\2\2\u01ae\u01af\5\u00a6T\2\u01af\u01b0\7\4\2\2\u01b0"+
		"\u01b1\5\u0086D\2\u01b1\u01b5\7\4\2\2\u01b2\u01b3\5H%\2\u01b3\u01b4\7"+
		"\4\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01ba\3\2\2\2\u01b7\u01b8\5H%\2\u01b8\u01b9\7\4\2\2\u01b9\u01bb\3\2\2"+
		"\2\u01ba\u01b7\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd"+
		"\5\u00a2R\2\u01bd\u01be\b\6\1\2\u01be\13\3\2\2\2\u01bf\u01c0\5\u00b6\\"+
		"\2\u01c0\u01c1\7\4\2\2\u01c1\u01c2\5\u0088E\2\u01c2\u01c3\7\4\2\2\u01c3"+
		"\u01c4\5\u00b4[\2\u01c4\u01c5\7\4\2\2\u01c5\u01c6\5\u0086D\2\u01c6\u01ca"+
		"\7\4\2\2\u01c7\u01c8\5H%\2\u01c8\u01c9\7\4\2\2\u01c9\u01cb\3\2\2\2\u01ca"+
		"\u01c7\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cf\3\2\2\2\u01cc\u01cd\5H"+
		"%\2\u01cd\u01ce\7\4\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cc\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\5\u00b0Y\2\u01d2\u01d3"+
		"\b\7\1\2\u01d3\r\3\2\2\2\u01d4\u01d5\5\u00b6\\\2\u01d5\u01d6\7\4\2\2\u01d6"+
		"\u01d7\5\u0088E\2\u01d7\u01d8\7\4\2\2\u01d8\u01d9\5\u00b4[\2\u01d9\u01da"+
		"\7\4\2\2\u01da\u01db\5\u0086D\2\u01db\u01df\7\4\2\2\u01dc\u01dd\5H%\2"+
		"\u01dd\u01de\7\4\2\2\u01de\u01e0\3\2\2\2\u01df\u01dc\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e4\3\2\2\2\u01e1\u01e2\5H%\2\u01e2\u01e3\7\4\2\2\u01e3"+
		"\u01e5\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6\u01e7\5\u00acW\2\u01e7\17\3\2\2\2\u01e8\u01e9\5\u00b6\\\2\u01e9"+
		"\u01ea\7\4\2\2\u01ea\u01eb\5\u0088E\2\u01eb\u01ec\7\4\2\2\u01ec\u01ed"+
		"\5\u00b4[\2\u01ed\u01ee\7\4\2\2\u01ee\u01ef\5\u0086D\2\u01ef\u01f3\7\4"+
		"\2\2\u01f0\u01f1\5H%\2\u01f1\u01f2\7\4\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f0"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f8\3\2\2\2\u01f5\u01f6\5H%\2\u01f6"+
		"\u01f7\7\4\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f5\3\2\2\2\u01f8\u01f9\3\2"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\5\u00aeX\2\u01fb\21\3\2\2\2\u01fc"+
		"\u01fd\5\u00aaV\2\u01fd\u01fe\7\4\2\2\u01fe\u01ff\5\u00b8]\2\u01ff\u0200"+
		"\7\4\2\2\u0200\u0201\5\u0086D\2\u0201\u0205\7\4\2\2\u0202\u0203\5H%\2"+
		"\u0203\u0204\7\4\2\2\u0204\u0206\3\2\2\2\u0205\u0202\3\2\2\2\u0205\u0206"+
		"\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\5\u00b4[\2\u0208\u0209\b\n\1"+
		"\2\u0209\23\3\2\2\2\u020a\u020b\5\u00a6T\2\u020b\u020c\7\4\2\2\u020c\u020d"+
		"\5\u0086D\2\u020d\u0211\7\4\2\2\u020e\u020f\5H%\2\u020f\u0210\7\4\2\2"+
		"\u0210\u0212\3\2\2\2\u0211\u020e\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0216"+
		"\3\2\2\2\u0213\u0214\5H%\2\u0214\u0215\7\4\2\2\u0215\u0217\3\2\2\2\u0216"+
		"\u0213\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\5\u00ba"+
		"^\2\u0219\u021a\b\13\1\2\u021a\25\3\2\2\2\u021b\u021c\5\u00a8U\2\u021c"+
		"\27\3\2\2\2\u021d\u021e\5\u00caf\2\u021e\u021f\7\4\2\2\u021f\u0220\5\u00d4"+
		"k\2\u0220\u0221\7\4\2\2\u0221\u0222\5\u0080A\2\u0222\u0223\7\4\2\2\u0223"+
		"\u0224\5\u00a6T\2\u0224\u0225\7\4\2\2\u0225\u0226\5\u0086D\2\u0226\u022a"+
		"\7\4\2\2\u0227\u0228\5H%\2\u0228\u0229\7\4\2\2\u0229\u022b\3\2\2\2\u022a"+
		"\u0227\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022f\3\2\2\2\u022c\u022d\5H"+
		"%\2\u022d\u022e\7\4\2\2\u022e\u0230\3\2\2\2\u022f\u022c\3\2\2\2\u022f"+
		"\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\5\u00a2R\2\u0232\u0233"+
		"\b\r\1\2\u0233\31\3\2\2\2\u0234\u0235\5\u00caf\2\u0235\u0236\7\4\2\2\u0236"+
		"\u0237\5\u00d6l\2\u0237\u0238\7\4\2\2\u0238\u0239\5\u0080A\2\u0239\u023a"+
		"\7\4\2\2\u023a\u023b\5\u00a6T\2\u023b\u023c\7\4\2\2\u023c\u023d\5\u0086"+
		"D\2\u023d\u0241\7\4\2\2\u023e\u023f\5H%\2\u023f\u0240\7\4\2\2\u0240\u0242"+
		"\3\2\2\2\u0241\u023e\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0246\3\2\2\2\u0243"+
		"\u0244\5H%\2\u0244\u0245\7\4\2\2\u0245\u0247\3\2\2\2\u0246\u0243\3\2\2"+
		"\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\5\u00a2R\2\u0249"+
		"\u024a\b\16\1\2\u024a\33\3\2\2\2\u024b\u024c\5\u00caf\2\u024c\u024d\7"+
		"\4\2\2\u024d\u024e\5\u00d0i\2\u024e\u024f\7\4\2\2\u024f\u0250\5\u0080"+
		"A\2\u0250\u0251\7\4\2\2\u0251\u0252\5\u00a6T\2\u0252\u0253\7\4\2\2\u0253"+
		"\u0254\5\u0086D\2\u0254\u0258\7\4\2\2\u0255\u0256\5H%\2\u0256\u0257\7"+
		"\4\2\2\u0257\u0259\3\2\2\2\u0258\u0255\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		"\u025d\3\2\2\2\u025a\u025b\5H%\2\u025b\u025c\7\4\2\2\u025c\u025e\3\2\2"+
		"\2\u025d\u025a\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260"+
		"\5\u00a2R\2\u0260\u0261\b\17\1\2\u0261\35\3\2\2\2\u0262\u0263\5\u00ca"+
		"f\2\u0263\u0264\7\4\2\2\u0264\u0265\5\u00d2j\2\u0265\u0266\7\4\2\2\u0266"+
		"\u0267\5\u0080A\2\u0267\u0268\7\4\2\2\u0268\u0269\5\u00a6T\2\u0269\u026a"+
		"\7\4\2\2\u026a\u026b\5\u0086D\2\u026b\u026f\7\4\2\2\u026c\u026d\5H%\2"+
		"\u026d\u026e\7\4\2\2\u026e\u0270\3\2\2\2\u026f\u026c\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\u0274\3\2\2\2\u0271\u0272\5H%\2\u0272\u0273\7\4\2\2\u0273"+
		"\u0275\3\2\2\2\u0274\u0271\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276\3\2"+
		"\2\2\u0276\u0277\5\u00a2R\2\u0277\u0278\b\20\1\2\u0278\37\3\2\2\2\u0279"+
		"\u027a\5\u00caf\2\u027a\u027b\7\4\2\2\u027b\u027c\5\u00ccg\2\u027c\u027d"+
		"\7\4\2\2\u027d\u027e\5\u0080A\2\u027e\u027f\7\4\2\2\u027f\u0280\5\u00a6"+
		"T\2\u0280\u0281\7\4\2\2\u0281\u0282\5\u0086D\2\u0282\u0286\7\4\2\2\u0283"+
		"\u0284\5H%\2\u0284\u0285\7\4\2\2\u0285\u0287\3\2\2\2\u0286\u0283\3\2\2"+
		"\2\u0286\u0287\3\2\2\2\u0287\u028b\3\2\2\2\u0288\u0289\5H%\2\u0289\u028a"+
		"\7\4\2\2\u028a\u028c\3\2\2\2\u028b\u0288\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028e\5\u00a2R\2\u028e\u028f\b\21\1\2\u028f!\3\2"+
		"\2\2\u0290\u0291\5\u00caf\2\u0291\u0292\7\4\2\2\u0292\u0293\5\u00ceh\2"+
		"\u0293\u0294\7\4\2\2\u0294\u0295\5\u0080A\2\u0295\u0296\7\4\2\2\u0296"+
		"\u0297\5\u00a6T\2\u0297\u0298\7\4\2\2\u0298\u0299\5\u0086D\2\u0299\u029d"+
		"\7\4\2\2\u029a\u029b\5H%\2\u029b\u029c\7\4\2\2\u029c\u029e\3\2\2\2\u029d"+
		"\u029a\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a2\3\2\2\2\u029f\u02a0\5H"+
		"%\2\u02a0\u02a1\7\4\2\2\u02a1\u02a3\3\2\2\2\u02a2\u029f\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a5\5\u00a2R\2\u02a5\u02a6"+
		"\b\22\1\2\u02a6#\3\2\2\2\u02a7\u02a8\5\u00a6T\2\u02a8\u02a9\7\4\2\2\u02a9"+
		"\u02aa\5\u0086D\2\u02aa\u02ae\7\4\2\2\u02ab\u02ac\5H%\2\u02ac\u02ad\7"+
		"\4\2\2\u02ad\u02af\3\2\2\2\u02ae\u02ab\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u02b3\3\2\2\2\u02b0\u02b1\5H%\2\u02b1\u02b2\7\4\2\2\u02b2\u02b4\3\2\2"+
		"\2\u02b3\u02b0\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6"+
		"\5\u00a2R\2\u02b6\u02b7\b\23\1\2\u02b7%\3\2\2\2\u02b8\u02b9\5\u009eP\2"+
		"\u02b9\u02ba\7\4\2\2\u02ba\u02bb\5\u00b2Z\2\u02bb\u02bc\7\4\2\2\u02bc"+
		"\u02bd\5~@\2\u02bd\u02be\7\4\2\2\u02be\u02bf\5\u00c4c\2\u02bf\u02c0\7"+
		"\4\2\2\u02c0\u02c1\5\u00c8e\2\u02c1\u02c2\b\24\1\2\u02c2\'\3\2\2\2\u02c3"+
		"\u02c4\5\u009eP\2\u02c4\u02c5\7\4\2\2\u02c5\u02c6\5\u00b2Z\2\u02c6\u02c7"+
		"\b\25\1\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\7\4\2\2\u02c9\u02ca\5~@\2\u02ca"+
		"\u02cb\7\4\2\2\u02cb\u02cc\5\u00b2Z\2\u02cc\u02cd\b\25\1\2\u02cd)\3\2"+
		"\2\2\u02ce\u02cf\5\u00aaV\2\u02cf\u02d0\7\4\2\2\u02d0\u02d1\5\u00c2b\2"+
		"\u02d1\u02d2\7\4\2\2\u02d2\u02d3\5\u0086D\2\u02d3\u02d7\7\4\2\2\u02d4"+
		"\u02d5\5H%\2\u02d5\u02d6\7\4\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d4\3\2\2"+
		"\2\u02d7\u02d8\3\2\2\2\u02d8\u02dc\3\2\2\2\u02d9\u02da\5H%\2\u02da\u02db"+
		"\7\4\2\2\u02db\u02dd\3\2\2\2\u02dc\u02d9\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd"+
		"\u02de\3\2\2\2\u02de\u02df\5\u00acW\2\u02df+\3\2\2\2\u02e0\u02e1\5\u00aa"+
		"V\2\u02e1\u02e2\7\4\2\2\u02e2\u02e3\5\u00c2b\2\u02e3\u02e4\7\4\2\2\u02e4"+
		"\u02e5\5\u0086D\2\u02e5\u02e9\7\4\2\2\u02e6\u02e7\5H%\2\u02e7\u02e8\7"+
		"\4\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e6\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02ee\3\2\2\2\u02eb\u02ec\5H%\2\u02ec\u02ed\7\4\2\2\u02ed\u02ef\3\2\2"+
		"\2\u02ee\u02eb\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1"+
		"\5\u00b0Y\2\u02f1\u02f2\b\27\1\2\u02f2-\3\2\2\2\u02f3\u02f4\5\u00aaV\2"+
		"\u02f4\u02f5\7\4\2\2\u02f5\u02f6\5\u00c2b\2\u02f6\u02f7\7\4\2\2\u02f7"+
		"\u02fa\5\u0086D\2\u02f8\u02f9\7\4\2\2\u02f9\u02fb\5H%\2\u02fa\u02f8\3"+
		"\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\7\4\2\2\u02fd"+
		"\u02fe\5\u00aeX\2\u02fe/\3\2\2\2\u02ff\u0300\5\u00aaV\2\u0300\u0301\7"+
		"\4\2\2\u0301\u0302\5H%\2\u0302\u0303\7\4\2\2\u0303\u0304\5\u00c0a\2\u0304"+
		"\u0305\7\4\2\2\u0305\u0308\5\u0086D\2\u0306\u0307\7\4\2\2\u0307\u0309"+
		"\5H%\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a"+
		"\u030b\7\4\2\2\u030b\u030c\5\u00b0Y\2\u030c\u030d\b\31\1\2\u030d\61\3"+
		"\2\2\2\u030e\u030f\5\u00aaV\2\u030f\u0310\7\4\2\2\u0310\u0311\5H%\2\u0311"+
		"\u0312\7\4\2\2\u0312\u0313\5\u00c0a\2\u0313\u0314\7\4\2\2\u0314\u0317"+
		"\5\u0086D\2\u0315\u0316\7\4\2\2\u0316\u0318\5H%\2\u0317\u0315\3\2\2\2"+
		"\u0317\u0318\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\7\4\2\2\u031a\u031b"+
		"\5\u00acW\2\u031b\63\3\2\2\2\u031c\u031d\5\u00aaV\2\u031d\u031e\7\4\2"+
		"\2\u031e\u031f\5H%\2\u031f\u0320\7\4\2\2\u0320\u0321\5\u00c0a\2\u0321"+
		"\u0322\7\4\2\2\u0322\u0325\5\u0086D\2\u0323\u0324\7\4\2\2\u0324\u0326"+
		"\5H%\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\3\2\2\2\u0327"+
		"\u0328\7\4\2\2\u0328\u0329\5\u00aeX\2\u0329\65\3\2\2\2\u032a\u032b\5\u00aa"+
		"V\2\u032b\u032c\7\4\2\2\u032c\u032d\5H%\2\u032d\u032e\7\4\2\2\u032e\u032f"+
		"\5\u00be`\2\u032f\u0330\7\4\2\2\u0330\u0331\5\u0086D\2\u0331\u0335\7\4"+
		"\2\2\u0332\u0333\5H%\2\u0333\u0334\7\4\2\2\u0334\u0336\3\2\2\2\u0335\u0332"+
		"\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\5H%\2\u0338"+
		"\u0339\7\4\2\2\u0339\u033a\5\u00acW\2\u033a\67\3\2\2\2\u033b\u033c\5\u00aa"+
		"V\2\u033c\u033d\7\4\2\2\u033d\u033e\5H%\2\u033e\u033f\7\4\2\2\u033f\u0340"+
		"\5\u00be`\2\u0340\u0341\7\4\2\2\u0341\u0342\5\u0086D\2\u0342\u0346\7\4"+
		"\2\2\u0343\u0344\5H%\2\u0344\u0345\7\4\2\2\u0345\u0347\3\2\2\2\u0346\u0343"+
		"\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\5\u00b0Y"+
		"\2\u0349\u034a\b\35\1\2\u034a9\3\2\2\2\u034b\u034c\5\u00aaV\2\u034c\u034d"+
		"\7\4\2\2\u034d\u034e\5H%\2\u034e\u034f\7\4\2\2\u034f\u0350\5\u00be`\2"+
		"\u0350\u0351\7\4\2\2\u0351\u0352\5\u0086D\2\u0352\u0356\7\4\2\2\u0353"+
		"\u0354\5H%\2\u0354\u0355\7\4\2\2\u0355\u0357\3\2\2\2\u0356\u0353\3\2\2"+
		"\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u0359\5\u00aeX\2\u0359"+
		";\3\2\2\2\u035a\u035b\5\u00caf\2\u035b\u035c\7\4\2\2\u035c\u035d\5\u00bc"+
		"_\2\u035d\u035e\7\4\2\2\u035e\u035f\5\u0084C\2\u035f\u0360\7\4\2\2\u0360"+
		"\u0361\5\u00a0Q\2\u0361\u0362\7\4\2\2\u0362\u0363\5\u0086D\2\u0363\u0367"+
		"\7\4\2\2\u0364\u0365\5H%\2\u0365\u0366\7\4\2\2\u0366\u0368\3\2\2\2\u0367"+
		"\u0364\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036a\5\u00a2"+
		"R\2\u036a\u036b\b\37\1\2\u036b=\3\2\2\2\u036c\u036d\5\u00d8m\2\u036d\u036e"+
		"\7\4\2\2\u036e\u036f\5\u00ba^\2\u036f\u0370\7\4\2\2\u0370\u0371\5\u00e2"+
		"r\2\u0371\u0372\7\4\2\2\u0372\u0373\5\u0086D\2\u0373\u0377\7\4\2\2\u0374"+
		"\u0375\5H%\2\u0375\u0376\7\4\2\2\u0376\u0378\3\2\2\2\u0377\u0374\3\2\2"+
		"\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\5\u00b0Y\2\u037a"+
		"\u037b\b \1\2\u037b?\3\2\2\2\u037c\u037d\5\u00d8m\2\u037d\u037e\7\4\2"+
		"\2\u037e\u037f\5\u00e0q\2\u037f\u0380\7\4\2\2\u0380\u0381\5\u0086D\2\u0381"+
		"\u0385\7\4\2\2\u0382\u0383\5H%\2\u0383\u0384\7\4\2\2\u0384\u0386\3\2\2"+
		"\2\u0385\u0382\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388"+
		"\5\u00b0Y\2\u0388\u0389\b!\1\2\u0389A\3\2\2\2\u038a\u038b\5\u008cG\2\u038b"+
		"\u038c\7\4\2\2\u038c\u038d\5\u00b2Z\2\u038d\u038e\b\"\1\2\u038eC\3\2\2"+
		"\2\u038f\u0390\5\u00aaV\2\u0390\u0391\7\4\2\2\u0391\u0392\5H%\2\u0392"+
		"\u0393\7\4\2\2\u0393\u0394\5\u00dep\2\u0394\u0395\7\4\2\2\u0395\u0396"+
		"\5H%\2\u0396\u0397\7\4\2\2\u0397\u0398\5\u00dco\2\u0398\u0399\7\4\2\2"+
		"\u0399\u039a\5\u0086D\2\u039a\u039e\7\4\2\2\u039b\u039c\5H%\2\u039c\u039d"+
		"\7\4\2\2\u039d\u039f\3\2\2\2\u039e\u039b\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0\u03a1\5H%\2\u03a1\u03a2\7\4\2\2\u03a2\u03a3\5\u00ac"+
		"W\2\u03a3E\3\2\2\2\u03a4\u03a5\5\u00aaV\2\u03a5\u03a6\7\4\2\2\u03a6\u03a7"+
		"\5H%\2\u03a7\u03a8\7\4\2\2\u03a8\u03a9\5\u00dep\2\u03a9\u03aa\7\4\2\2"+
		"\u03aa\u03ab\5H%\2\u03ab\u03ac\7\4\2\2\u03ac\u03ad\5\u00dco\2\u03ad\u03ae"+
		"\7\4\2\2\u03ae\u03af\5\u0086D\2\u03af\u03b3\7\4\2\2\u03b0\u03b1\5H%\2"+
		"\u03b1\u03b2\7\4\2\2\u03b2\u03b4\3\2\2\2\u03b3\u03b0\3\2\2\2\u03b3\u03b4"+
		"\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6\5H%\2\u03b6\u03b7\7\4\2\2\u03b7"+
		"\u03b8\5\u00aeX\2\u03b8G\3\2\2\2\u03b9\u03ba\t\2\2\2\u03baI\3\2\2\2\u03bb"+
		"\u03bc\5\u00aaV\2\u03bc\u03bd\7\4\2\2\u03bd\u03be\5\u00b0Y\2\u03be\u03bf"+
		"\7\4\2\2\u03bf\u03c0\5\u0086D\2\u03c0\u03c4\7\4\2\2\u03c1\u03c2\5H%\2"+
		"\u03c2\u03c3\7\4\2\2\u03c3\u03c5\3\2\2\2\u03c4\u03c1\3\2\2\2\u03c4\u03c5"+
		"\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c7\5\u00acW\2\u03c7\u03c8\b&\1\2"+
		"\u03c8K\3\2\2\2\u03c9\u03ca\5\u00aaV\2\u03ca\u03cb\7\4\2\2\u03cb\u03cc"+
		"\5\u00b0Y\2\u03cc\u03cd\7\4\2\2\u03cd\u03ce\5\u0086D\2\u03ce\u03d2\7\4"+
		"\2\2\u03cf\u03d0\5H%\2\u03d0\u03d1\7\4\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03cf"+
		"\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\5\u00aeX"+
		"\2\u03d5\u03d6\b\'\1\2\u03d6M\3\2\2\2\u03d7\u03d8\5\u00aaV\2\u03d8\u03d9"+
		"\7\4\2\2\u03d9\u03da\5\u00b8]\2\u03da\u03db\7\4\2\2\u03db\u03dc\5\u0086"+
		"D\2\u03dc\u03e0\7\4\2\2\u03dd\u03de\5H%\2\u03de\u03df\7\4\2\2\u03df\u03e1"+
		"\3\2\2\2\u03e0\u03dd\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u03e3\5\u00b0Y\2\u03e3\u03e4\b(\1\2\u03e4O\3\2\2\2\u03e5\u03e6\5\u00d8"+
		"m\2\u03e6\u03e7\7\4\2\2\u03e7\u03e8\5\u00dan\2\u03e8\u03e9\7\4\2\2\u03e9"+
		"\u03ea\5\u0086D\2\u03ea\u03ee\7\4\2\2\u03eb\u03ec\5H%\2\u03ec\u03ed\7"+
		"\4\2\2\u03ed\u03ef\3\2\2\2\u03ee\u03eb\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"\u03f0\3\2\2\2\u03f0\u03f1\5\u00acW\2\u03f1Q\3\2\2\2\u03f2\u03f3\5\u00d8"+
		"m\2\u03f3\u03f4\7\4\2\2\u03f4\u03f5\5\u00dan\2\u03f5\u03f6\7\4\2\2\u03f6"+
		"\u03f7\5\u0086D\2\u03f7\u03fb\7\4\2\2\u03f8\u03f9\5H%\2\u03f9\u03fa\7"+
		"\4\2\2\u03fa\u03fc\3\2\2\2\u03fb\u03f8\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u03fd\3\2\2\2\u03fd\u03fe\5\u00aeX\2\u03feS\3\2\2\2\u03ff\u0400\5\u0082"+
		"B\2\u0400\u0401\7\4\2\2\u0401\u0402\5\u0080A\2\u0402\u0403\7\4\2\2\u0403"+
		"\u0404\5\u00a2R\2\u0404\u0405\b+\1\2\u0405U\3\2\2\2\u0406\u0407\5\u00a0"+
		"Q\2\u0407\u0408\7\4\2\2\u0408\u0409\5\u0086D\2\u0409\u040d\7\4\2\2\u040a"+
		"\u040b\5H%\2\u040b\u040c\7\4\2\2\u040c\u040e\3\2\2\2\u040d\u040a\3\2\2"+
		"\2\u040d\u040e\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410\5\u00ba^\2\u0410"+
		"\u0411\b,\1\2\u0411W\3\2\2\2\u0412\u0413\5\u00caf\2\u0413\u0414\7\4\2"+
		"\2\u0414\u0415\5\u00d0i\2\u0415\u0416\7\4\2\2\u0416\u0417\5\u0080A\2\u0417"+
		"\u0418\7\4\2\2\u0418\u0419\5\u00a0Q\2\u0419\u041a\7\4\2\2\u041a\u041b"+
		"\5\u0086D\2\u041b\u041f\7\4\2\2\u041c\u041d\5H%\2\u041d\u041e\7\4\2\2"+
		"\u041e\u0420\3\2\2\2\u041f\u041c\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421"+
		"\3\2\2\2\u0421\u0422\5\u00a2R\2\u0422\u0423\b-\1\2\u0423Y\3\2\2\2\u0424"+
		"\u0425\5\u00caf\2\u0425\u0426\7\4\2\2\u0426\u0427\5\u00d6l\2\u0427\u0428"+
		"\7\4\2\2\u0428\u0429\5\u0080A\2\u0429\u042a\7\4\2\2\u042a\u042b\5\u00a0"+
		"Q\2\u042b\u042c\7\4\2\2\u042c\u042d\5\u0086D\2\u042d\u0431\7\4\2\2\u042e"+
		"\u042f\5H%\2\u042f\u0430\7\4\2\2\u0430\u0432\3\2\2\2\u0431\u042e\3\2\2"+
		"\2\u0431\u0432\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0434\5\u00a2R\2\u0434"+
		"\u0435\b.\1\2\u0435[\3\2\2\2\u0436\u0437\5\u00caf\2\u0437\u0438\7\4\2"+
		"\2\u0438\u0439\5\u00d0i\2\u0439\u043a\7\4\2\2\u043a\u043b\5\u0080A\2\u043b"+
		"\u043c\7\4\2\2\u043c\u043d\5\u00a0Q\2\u043d\u043e\7\4\2\2\u043e\u043f"+
		"\5\u0086D\2\u043f\u0443\7\4\2\2\u0440\u0441\5H%\2\u0441\u0442\7\4\2\2"+
		"\u0442\u0444\3\2\2\2\u0443\u0440\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445"+
		"\3\2\2\2\u0445\u0446\5\u00a2R\2\u0446\u0447\b/\1\2\u0447]\3\2\2\2\u0448"+
		"\u0449\5\u00caf\2\u0449\u044a\7\4\2\2\u044a\u044b\5\u00d2j\2\u044b\u044c"+
		"\7\4\2\2\u044c\u044d\5\u0080A\2\u044d\u044e\7\4\2\2\u044e\u044f\5\u00a0"+
		"Q\2\u044f\u0450\7\4\2\2\u0450\u0451\5\u0086D\2\u0451\u0455\7\4\2\2\u0452"+
		"\u0453\5H%\2\u0453\u0454\7\4\2\2\u0454\u0456\3\2\2\2\u0455\u0452\3\2\2"+
		"\2\u0455\u0456\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0458\5\u00a2R\2\u0458"+
		"\u0459\b\60\1\2\u0459_\3\2\2\2\u045a\u045b\5\u00caf\2\u045b\u045c\7\4"+
		"\2\2\u045c\u045d\5\u00ccg\2\u045d\u045e\7\4\2\2\u045e\u045f\5\u0080A\2"+
		"\u045f\u0460\7\4\2\2\u0460\u0461\5\u00a0Q\2\u0461\u0462\7\4\2\2\u0462"+
		"\u0463\5\u0086D\2\u0463\u0467\7\4\2\2\u0464\u0465\5H%\2\u0465\u0466\7"+
		"\4\2\2\u0466\u0468\3\2\2\2\u0467\u0464\3\2\2\2\u0467\u0468\3\2\2\2\u0468"+
		"\u0469\3\2\2\2\u0469\u046a\5\u00a2R\2\u046a\u046b\b\61\1\2\u046ba\3\2"+
		"\2\2\u046c\u046d\5\u00caf\2\u046d\u046e\7\4\2\2\u046e\u046f\5\u00ceh\2"+
		"\u046f\u0470\7\4\2\2\u0470\u0471\5\u0080A\2\u0471\u0472\7\4\2\2\u0472"+
		"\u0473\5\u00a0Q\2\u0473\u0474\7\4\2\2\u0474\u0475\5\u0086D\2\u0475\u0479"+
		"\7\4\2\2\u0476\u0477\5H%\2\u0477\u0478\7\4\2\2\u0478\u047a\3\2\2\2\u0479"+
		"\u0476\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\5\u00a2"+
		"R\2\u047c\u047d\b\62\1\2\u047dc\3\2\2\2\u047e\u047f\5\u00a0Q\2\u047f\u0480"+
		"\7\4\2\2\u0480\u0481\5\u0086D\2\u0481\u0485\7\4\2\2\u0482\u0483\5H%\2"+
		"\u0483\u0484\7\4\2\2\u0484\u0486\3\2\2\2\u0485\u0482\3\2\2\2\u0485\u0486"+
		"\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\5\u00a2R\2\u0488\u0489\b\63\1"+
		"\2\u0489e\3\2\2\2\u048a\u048b\5\u009eP\2\u048b\u048c\7\4\2\2\u048c\u048d"+
		"\5\u00b8]\2\u048d\u048e\b\64\1\2\u048e\u048f\3\2\2\2\u048f\u0490\7\4\2"+
		"\2\u0490\u0491\5~@\2\u0491\u0492\7\4\2\2\u0492\u0493\5\u00b8]\2\u0493"+
		"\u0494\b\64\1\2\u0494g\3\2\2\2\u0495\u0496\5\u00aaV\2\u0496\u0497\7\4"+
		"\2\2\u0497\u049f\5\u00aeX\2\u0498\u0499\7\4\2\2\u0499\u049d\5\u0086D\2"+
		"\u049a\u049b\5H%\2\u049b\u049c\7\4\2\2\u049c\u049e\3\2\2\2\u049d\u049a"+
		"\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u04a0\3\2\2\2\u049f\u0498\3\2\2\2\u049f"+
		"\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\7\4\2\2\u04a2\u04a3\5\u00ac"+
		"W\2\u04a3i\3\2\2\2\u04a4\u04a5\5\u008cG\2\u04a5\u04a6\7\4\2\2\u04a6\u04a7"+
		"\5\u008aF\2\u04a7\u04a8\7\4\2\2\u04a8\u04a9\5\u008eH\2\u04a9\u04aa\7\4"+
		"\2\2\u04aa\u04ab\5\u00c8e\2\u04ab\u04ac\b\66\1\2\u04ack\3\2\2\2\u04ad"+
		"\u04ae\5p9\2\u04ae\u04af\7\4\2\2\u04af\u04b0\5n8\2\u04b0\u04b1\7\4\2\2"+
		"\u04b1\u04b2\5\u0094K\2\u04b2m\3\2\2\2\u04b3\u04b4\t\3\2\2\u04b4o\3\2"+
		"\2\2\u04b5\u04b6\7@\2\2\u04b6q\3\2\2\2\u04b7\u04b8\5\u008cG\2\u04b8\u04b9"+
		"\7\4\2\2\u04b9\u04ba\5\u0092J\2\u04bas\3\2\2\2\u04bb\u04bc\5\u008cG\2"+
		"\u04bc\u04bd\7\4\2\2\u04bd\u04be\5\u00b8]\2\u04be\u04bf\b;\1\2\u04bfu"+
		"\3\2\2\2\u04c0\u04c1\5\u009aN\2\u04c1\u04c2\7\4\2\2\u04c2\u04c3\5\u00b8"+
		"]\2\u04c3\u04c4\b<\1\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6\7\4\2\2\u04c6\u04c7"+
		"\5~@\2\u04c7\u04c8\7\4\2\2\u04c8\u04c9\5\u00b8]\2\u04c9\u04ca\b<\1\2\u04ca"+
		"w\3\2\2\2\u04cb\u04cc\5\u009cO\2\u04cc\u04cd\7\4\2\2\u04cd\u04ce\5\u00b8"+
		"]\2\u04ce\u04cf\b=\1\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\7\4\2\2\u04d1\u04d2"+
		"\5~@\2\u04d2\u04d3\7\4\2\2\u04d3\u04d4\5\u00b8]\2\u04d4\u04d5\b=\1\2\u04d5"+
		"y\3\2\2\2\u04d6\u04d7\5\u0098M\2\u04d7\u04d8\7\4\2\2\u04d8\u04d9\5\u00b8"+
		"]\2\u04d9\u04da\b>\1\2\u04da\u04db\3\2\2\2\u04db\u04dc\7\4\2\2\u04dc\u04dd"+
		"\5~@\2\u04dd\u04de\7\4\2\2\u04de\u04df\5\u00b8]\2\u04df\u04e0\b>\1\2\u04e0"+
		"{\3\2\2\2\u04e1\u04e2\5\u0096L\2\u04e2\u04e3\7\4\2\2\u04e3\u04e4\5\u00b8"+
		"]\2\u04e4\u04e5\b?\1\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\7\4\2\2\u04e7\u04e8"+
		"\5~@\2\u04e8\u04e9\7\4\2\2\u04e9\u04ea\5\u00b8]\2\u04ea\u04eb\b?\1\2\u04eb"+
		"}\3\2\2\2\u04ec\u04ed\7X\2\2\u04ed\177\3\2\2\2\u04ee\u04ef\7Y\2\2\u04ef"+
		"\u0081\3\2\2\2\u04f0\u04f1\7Z\2\2\u04f1\u0083\3\2\2\2\u04f2\u04f3\t\4"+
		"\2\2\u04f3\u0085\3\2\2\2\u04f4\u04f5\t\5\2\2\u04f5\u0087\3\2\2\2\u04f6"+
		"\u04f7\t\6\2\2\u04f7\u0089\3\2\2\2\u04f8\u04f9\7Q\2\2\u04f9\u008b\3\2"+
		"\2\2\u04fa\u04fb\t\7\2\2\u04fb\u008d\3\2\2\2\u04fc\u0503\7L\2\2\u04fd"+
		"\u04ff\7N\2\2\u04fe\u0500\7\4\2\2\u04ff\u04fe\3\2\2\2\u04ff\u0500\3\2"+
		"\2\2\u0500\u0501\3\2\2\2\u0501\u0503\7M\2\2\u0502\u04fc\3\2\2\2\u0502"+
		"\u04fd\3\2\2\2\u0503\u008f\3\2\2\2\u0504\u0505\7N\2\2\u0505\u0091\3\2"+
		"\2\2\u0506\u0507\t\b\2\2\u0507\u0093\3\2\2\2\u0508\u0509\t\t\2\2\u0509"+
		"\u0095\3\2\2\2\u050a\u050b\t\n\2\2\u050b\u0097\3\2\2\2\u050c\u050d\t\13"+
		"\2\2\u050d\u0099\3\2\2\2\u050e\u050f\t\f\2\2\u050f\u009b\3\2\2\2\u0510"+
		"\u0511\t\r\2\2\u0511\u009d\3\2\2\2\u0512\u0513\7C\2\2\u0513\u009f\3\2"+
		"\2\2\u0514\u0519\7B\2\2\u0515\u0516\7P\2\2\u0516\u0517\7\4\2\2\u0517\u0519"+
		"\7T\2\2\u0518\u0514\3\2\2\2\u0518\u0515\3\2\2\2\u0519\u00a1\3\2\2\2\u051a"+
		"\u051b\5\u00a4S\2\u051b\u051c\7\4\2\2\u051c\u051d\7[\2\2\u051d\u051e\b"+
		"R\1\2\u051e\u00a3\3\2\2\2\u051f\u0528\7\5\2\2\u0520\u0522\7\6\2\2\u0521"+
		"\u0523\7\4\2\2\u0522\u0521\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0525\3\2"+
		"\2\2\u0524\u0526\7M\2\2\u0525\u0524\3\2\2\2\u0525\u0526\3\2\2\2\u0526"+
		"\u0528\3\2\2\2\u0527\u051f\3\2\2\2\u0527\u0520\3\2\2\2\u0528\u00a5\3\2"+
		"\2\2\u0529\u052a\7A\2\2\u052a\u052b\7\4\2\2\u052b\u0530\7>\2\2\u052c\u052d"+
		"\7@\2\2\u052d\u052e\7\4\2\2\u052e\u0530\7?\2\2\u052f\u0529\3\2\2\2\u052f"+
		"\u052c\3\2\2\2\u0530\u00a7\3\2\2\2\u0531\u0532\7;\2\2\u0532\u0533\7\4"+
		"\2\2\u0533\u0536\7=\2\2\u0534\u0536\7<\2\2\u0535\u0531\3\2\2\2\u0535\u0534"+
		"\3\2\2\2\u0536\u00a9\3\2\2\2\u0537\u0538\t\16\2\2\u0538\u00ab\3\2\2\2"+
		"\u0539\u053a\t\17\2\2\u053a\u00ad\3\2\2\2\u053b\u053c\t\20\2\2\u053c\u00af"+
		"\3\2\2\2\u053d\u053e\7\62\2\2\u053e\u0541\7\4\2\2\u053f\u0540\7R\2\2\u0540"+
		"\u0542\7\4\2\2\u0541\u053f\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543\3\2"+
		"\2\2\u0543\u0544\5\u00ba^\2\u0544\u0545\bY\1\2\u0545\u00b1\3\2\2\2\u0546"+
		"\u0547\7R\2\2\u0547\u0548\7\4\2\2\u0548\u0549\5\u00b0Y\2\u0549\u054a\b"+
		"Z\1\2\u054a\u054b\3\2\2\2\u054b\u054c\7\4\2\2\u054c\u054d\7\63\2\2\u054d"+
		"\u054e\7\4\2\2\u054e\u054f\5\u00b0Y\2\u054f\u0550\bZ\1\2\u0550\u00b3\3"+
		"\2\2\2\u0551\u0552\7\60\2\2\u0552\u00b5\3\2\2\2\u0553\u0554\7/\2\2\u0554"+
		"\u00b7\3\2\2\2\u0555\u0556\7.\2\2\u0556\u0558\b]\1\2\u0557\u0555\3\2\2"+
		"\2\u0557\u0558\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055a\7\61\2\2\u055a"+
		"\u055f\b]\1\2\u055b\u055c\5\u00ba^\2\u055c\u055d\b]\1\2\u055d\u055f\3"+
		"\2\2\2\u055e\u0557\3\2\2\2\u055e\u055b\3\2\2\2\u055f\u00b9\3\2\2\2\u0560"+
		"\u0561\7\61\2\2\u0561\u0569\b^\1\2\u0562\u0563\5\u00aeX\2\u0563\u0564"+
		"\b^\1\2\u0564\u0569\3\2\2\2\u0565\u0566\5\u00acW\2\u0566\u0567\b^\1\2"+
		"\u0567\u0569\3\2\2\2\u0568\u0560\3\2\2\2\u0568\u0562\3\2\2\2\u0568\u0565"+
		"\3\2\2\2\u0569\u00bb\3\2\2\2\u056a\u056b\t\21\2\2\u056b\u00bd\3\2\2\2"+
		"\u056c\u056d\7+\2\2\u056d\u00bf\3\2\2\2\u056e\u056f\7(\2\2\u056f\u057d"+
		"\7\4\2\2\u0570\u0571\7\60\2\2\u0571\u0572\7\4\2\2\u0572\u057e\7)\2\2\u0573"+
		"\u0574\7)\2\2\u0574\u057b\7\4\2\2\u0575\u0576\7\'\2\2\u0576\u0577\7\4"+
		"\2\2\u0577\u057c\7\60\2\2\u0578\u0579\7%\2\2\u0579\u057a\7\4\2\2\u057a"+
		"\u057c\7&\2\2\u057b\u0575\3\2\2\2\u057b\u0578\3\2\2\2\u057c\u057e\3\2"+
		"\2\2\u057d\u0570\3\2\2\2\u057d\u0573\3\2\2\2\u057e\u0585\3\2\2\2\u057f"+
		"\u0580\7\60\2\2\u0580\u0581\7\4\2\2\u0581\u0582\7*\2\2\u0582\u0583\7\4"+
		"\2\2\u0583\u0585\7)\2\2\u0584\u056e\3\2\2\2\u0584\u057f\3\2\2\2\u0585"+
		"\u00c1\3\2\2\2\u0586\u0587\7\60\2\2\u0587\u0588\7\4\2\2\u0588\u0594\7"+
		")\2\2\u0589\u058a\7)\2\2\u058a\u058b\7\4\2\2\u058b\u058c\7%\2\2\u058c"+
		"\u058d\7\4\2\2\u058d\u0594\7&\2\2\u058e\u058f\7)\2\2\u058f\u0590\7\4\2"+
		"\2\u0590\u0591\7\'\2\2\u0591\u0592\7\4\2\2\u0592\u0594\7\60\2\2\u0593"+
		"\u0586\3\2\2\2\u0593\u0589\3\2\2\2\u0593\u058e\3\2\2\2\u0594\u00c3\3\2"+
		"\2\2\u0595\u0596\7\b\2\2\u0596\u00c5\3\2\2\2\u0597\u05e6\7\6\2\2\u0598"+
		"\u05e6\7\b\2\2\u0599\u05e6\7\f\2\2\u059a\u05e6\7\r\2\2\u059b\u05e6\7\16"+
		"\2\2\u059c\u05e6\7\17\2\2\u059d\u05e6\7\20\2\2\u059e\u05e6\7\21\2\2\u059f"+
		"\u05e6\7\22\2\2\u05a0\u05e6\7\23\2\2\u05a1\u05e6\7\24\2\2\u05a2\u05e6"+
		"\7\25\2\2\u05a3\u05e6\7\26\2\2\u05a4\u05e6\7\27\2\2\u05a5\u05e6\7\30\2"+
		"\2\u05a6\u05e6\7\31\2\2\u05a7\u05e6\7\32\2\2\u05a8\u05e6\7\33\2\2\u05a9"+
		"\u05e6\7\34\2\2\u05aa\u05e6\7\35\2\2\u05ab\u05e6\7\36\2\2\u05ac\u05e6"+
		"\7\37\2\2\u05ad\u05e6\7 \2\2\u05ae\u05e6\7!\2\2\u05af\u05e6\7\"\2\2\u05b0"+
		"\u05e6\7#\2\2\u05b1\u05e6\7%\2\2\u05b2\u05e6\7&\2\2\u05b3\u05e6\7\'\2"+
		"\2\u05b4\u05e6\7(\2\2\u05b5\u05e6\7)\2\2\u05b6\u05e6\7*\2\2\u05b7\u05e6"+
		"\7+\2\2\u05b8\u05e6\7,\2\2\u05b9\u05e6\7-\2\2\u05ba\u05e6\7.\2\2\u05bb"+
		"\u05e6\7/\2\2\u05bc\u05e6\7\60\2\2\u05bd\u05e6\7\61\2\2\u05be\u05e6\7"+
		"\62\2\2\u05bf\u05e6\7\63\2\2\u05c0\u05e6\7\64\2\2\u05c1\u05e6\7\65\2\2"+
		"\u05c2\u05e6\7\66\2\2\u05c3\u05e6\7\67\2\2\u05c4\u05e6\79\2\2\u05c5\u05e6"+
		"\7;\2\2\u05c6\u05e6\7<\2\2\u05c7\u05e6\7=\2\2\u05c8\u05e6\7>\2\2\u05c9"+
		"\u05e6\7?\2\2\u05ca\u05e6\7@\2\2\u05cb\u05e6\7A\2\2\u05cc\u05e6\7M\2\2"+
		"\u05cd\u05e6\7B\2\2\u05ce\u05e6\7C\2\2\u05cf\u05e6\7D\2\2\u05d0\u05e6"+
		"\7E\2\2\u05d1\u05e6\7F\2\2\u05d2\u05e6\7G\2\2\u05d3\u05e6\7H\2\2\u05d4"+
		"\u05e6\7I\2\2\u05d5\u05e6\7J\2\2\u05d6\u05e6\7K\2\2\u05d7\u05e6\7N\2\2"+
		"\u05d8\u05e6\7O\2\2\u05d9\u05e6\7P\2\2\u05da\u05e6\7Q\2\2\u05db\u05e6"+
		"\7R\2\2\u05dc\u05e6\7T\2\2\u05dd\u05e6\7V\2\2\u05de\u05e6\7W\2\2\u05df"+
		"\u05e6\7X\2\2\u05e0\u05e6\7Y\2\2\u05e1\u05e6\7Z\2\2\u05e2\u05e6\7[\2\2"+
		"\u05e3\u05e6\7\\\2\2\u05e4\u05e6\7]\2\2\u05e5\u0597\3\2\2\2\u05e5\u0598"+
		"\3\2\2\2\u05e5\u0599\3\2\2\2\u05e5\u059a\3\2\2\2\u05e5\u059b\3\2\2\2\u05e5"+
		"\u059c\3\2\2\2\u05e5\u059d\3\2\2\2\u05e5\u059e\3\2\2\2\u05e5\u059f\3\2"+
		"\2\2\u05e5\u05a0\3\2\2\2\u05e5\u05a1\3\2\2\2\u05e5\u05a2\3\2\2\2\u05e5"+
		"\u05a3\3\2\2\2\u05e5\u05a4\3\2\2\2\u05e5\u05a5\3\2\2\2\u05e5\u05a6\3\2"+
		"\2\2\u05e5\u05a7\3\2\2\2\u05e5\u05a8\3\2\2\2\u05e5\u05a9\3\2\2\2\u05e5"+
		"\u05aa\3\2\2\2\u05e5\u05ab\3\2\2\2\u05e5\u05ac\3\2\2\2\u05e5\u05ad\3\2"+
		"\2\2\u05e5\u05ae\3\2\2\2\u05e5\u05af\3\2\2\2\u05e5\u05b0\3\2\2\2\u05e5"+
		"\u05b1\3\2\2\2\u05e5\u05b2\3\2\2\2\u05e5\u05b3\3\2\2\2\u05e5\u05b4\3\2"+
		"\2\2\u05e5\u05b5\3\2\2\2\u05e5\u05b6\3\2\2\2\u05e5\u05b7\3\2\2\2\u05e5"+
		"\u05b8\3\2\2\2\u05e5\u05b9\3\2\2\2\u05e5\u05ba\3\2\2\2\u05e5\u05bb\3\2"+
		"\2\2\u05e5\u05bc\3\2\2\2\u05e5\u05bd\3\2\2\2\u05e5\u05be\3\2\2\2\u05e5"+
		"\u05bf\3\2\2\2\u05e5\u05c0\3\2\2\2\u05e5\u05c1\3\2\2\2\u05e5\u05c2\3\2"+
		"\2\2\u05e5\u05c3\3\2\2\2\u05e5\u05c4\3\2\2\2\u05e5\u05c5\3\2\2\2\u05e5"+
		"\u05c6\3\2\2\2\u05e5\u05c7\3\2\2\2\u05e5\u05c8\3\2\2\2\u05e5\u05c9\3\2"+
		"\2\2\u05e5\u05ca\3\2\2\2\u05e5\u05cb\3\2\2\2\u05e5\u05cc\3\2\2\2\u05e5"+
		"\u05cd\3\2\2\2\u05e5\u05ce\3\2\2\2\u05e5\u05cf\3\2\2\2\u05e5\u05d0\3\2"+
		"\2\2\u05e5\u05d1\3\2\2\2\u05e5\u05d2\3\2\2\2\u05e5\u05d3\3\2\2\2\u05e5"+
		"\u05d4\3\2\2\2\u05e5\u05d5\3\2\2\2\u05e5\u05d6\3\2\2\2\u05e5\u05d7\3\2"+
		"\2\2\u05e5\u05d8\3\2\2\2\u05e5\u05d9\3\2\2\2\u05e5\u05da\3\2\2\2\u05e5"+
		"\u05db\3\2\2\2\u05e5\u05dc\3\2\2\2\u05e5\u05dd\3\2\2\2\u05e5\u05de\3\2"+
		"\2\2\u05e5\u05df\3\2\2\2\u05e5\u05e0\3\2\2\2\u05e5\u05e1\3\2\2\2\u05e5"+
		"\u05e2\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e5\u05e4\3\2\2\2\u05e6\u05e7\3\2"+
		"\2\2\u05e7\u05e8\bd\1\2\u05e8\u00c7\3\2\2\2\u05e9\u05ea\5\u00c6d\2\u05ea"+
		"\u05f7\be\1\2\u05eb\u05ec\5\u00c6d\2\u05ec\u05ed\be\1\2\u05ed\u05ef\3"+
		"\2\2\2\u05ee\u05eb\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f0"+
		"\u05f1\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f3\7\4\2\2\u05f3\u05f4\be"+
		"\1\2\u05f4\u05f6\3\2\2\2\u05f5\u05ee\3\2\2\2\u05f6\u05f9\3\2\2\2\u05f7"+
		"\u05f5\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05fa\3\2\2\2\u05f9\u05f7\3\2"+
		"\2\2\u05fa\u05fb\be\1\2\u05fb\u00c9\3\2\2\2\u05fc\u05fd\t\22\2\2\u05fd"+
		"\u05fe\7\4\2\2\u05fe\u05ff\7$\2\2\u05ff\u00cb\3\2\2\2\u0600\u0605\7\37"+
		"\2\2\u0601\u0602\7 \2\2\u0602\u0603\7\4\2\2\u0603\u0605\7!\2\2\u0604\u0600"+
		"\3\2\2\2\u0604\u0601\3\2\2\2\u0605\u00cd\3\2\2\2\u0606\u0607\7!\2\2\u0607"+
		"\u00cf\3\2\2\2\u0608\u0609\7\36\2\2\u0609\u00d1\3\2\2\2\u060a\u060b\7"+
		"\35\2\2\u060b\u00d3\3\2\2\2\u060c\u060d\7\36\2\2\u060d\u060e\7\4\2\2\u060e"+
		"\u060f\7\34\2\2\u060f\u0610\7\4\2\2\u0610\u0617\7!\2\2\u0611\u0612\7!"+
		"\2\2\u0612\u0613\7\4\2\2\u0613\u0614\7\34\2\2\u0614\u0615\7\4\2\2\u0615"+
		"\u0617\7\36\2\2\u0616\u060c\3\2\2\2\u0616\u0611\3\2\2\2\u0617\u00d5\3"+
		"\2\2\2\u0618\u0619\7\35\2\2\u0619\u061a\7\4\2\2\u061a\u061b\7\34\2\2\u061b"+
		"\u061c\7\4\2\2\u061c\u0623\7!\2\2\u061d\u061e\7!\2\2\u061e\u061f\7\4\2"+
		"\2\u061f\u0620\7\34\2\2\u0620\u0621\7\4\2\2\u0621\u0623\7\35\2\2\u0622"+
		"\u0618\3\2\2\2\u0622\u061d\3\2\2\2\u0623\u00d7\3\2\2\2\u0624\u0625\7\33"+
		"\2\2\u0625\u0626\7\4\2\2\u0626\u0629\7\32\2\2\u0627\u0629\7\27\2\2\u0628"+
		"\u0624\3\2\2\2\u0628\u0627\3\2\2\2\u0629\u00d9\3\2\2\2\u062a\u062b\7\26"+
		"\2\2\u062b\u00db\3\2\2\2\u062c\u062d\7\62\2\2\u062d\u00dd\3\2\2\2\u062e"+
		"\u062f\t\23\2\2\u062f\u00df\3\2\2\2\u0630\u0631\t\24\2\2\u0631\u00e1\3"+
		"\2\2\2\u0632\u0633\7\20\2\2\u0633\u00e3\3\2\2\2\u0634\u0635\7\17\2\2\u0635"+
		"\u0636\7\4\2\2\u0636\u0637\7,\2\2\u0637\u00e5\3\2\2\2U\u00e8\u00ee\u00f5"+
		"\u01a2\u01b5\u01ba\u01ca\u01cf\u01df\u01e4\u01f3\u01f8\u0205\u0211\u0216"+
		"\u022a\u022f\u0241\u0246\u0258\u025d\u026f\u0274\u0286\u028b\u029d\u02a2"+
		"\u02ae\u02b3\u02d7\u02dc\u02e9\u02ee\u02fa\u0308\u0317\u0325\u0335\u0346"+
		"\u0356\u0367\u0377\u0385\u039e\u03b3\u03c4\u03d2\u03e0\u03ee\u03fb\u040d"+
		"\u041f\u0431\u0443\u0455\u0467\u0479\u0485\u049d\u049f\u04ff\u0502\u0518"+
		"\u0522\u0525\u0527\u052f\u0535\u0541\u0557\u055e\u0568\u057b\u057d\u0584"+
		"\u0593\u05e5\u05f0\u05f7\u0604\u0616\u0622\u0628";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}