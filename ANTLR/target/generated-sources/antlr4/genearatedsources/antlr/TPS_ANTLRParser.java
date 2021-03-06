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
		WS=1, STELLE_WORT=2, DER=3, WORTREIHE_WORT=4, WORTKETTE_WORT=5, WORTFOLGE_WORT=6, 
		LETZTEN=7, ZEICHEN=8, ZEICHENFOLGE=9, ZEICHENKETTE=10, WORT_WORT=11, MENGE=12, 
		ANZAHL=13, ZAHL_WORT=14, EINESEN=15, EIN=16, LESE=17, ODER=18, KLEINER=19, 
		GRÖẞER=20, UNGLEICH=21, NICHT=22, GLEICH=23, FALLS=24, WENN=25, DES=26, 
		STAPELS=27, VOM=28, MAXIMALE=29, GRÖẞE=30, MAXIMUM=31, VERSION=32, FEHLER=33, 
		FALSCH=34, NAGATION=35, NEHME=36, STAPEL=37, POS_ZAHL=38, REGISTER=39, 
		BIS=40, ERGEBNISSPEICHER=41, ERGEBNIS=42, ZWISCHEN=43, ZWISCHENSPEICHER=44, 
		SPEICHERE=45, GEHE=46, ZURÜCKGEHEN=47, ZURÜCK=48, AUF=49, AUFRUF=50, MACHE=51, 
		RUFE=52, DP=53, SPRINGE=54, VERGLEICHE=55, DIVIDIERE=56, MULTIPLIZIERE=57, 
		SUBTRAHIERE=58, ADDIERE=59, ZEILENUMBRUCH=60, LEERZEILE=61, LEERTASTE=62, 
		LEERZEICHEN=63, AUS=64, AUSGEBEN=65, GEBE=66, FOLGENDES=67, VON=68, ZU=69, 
		IN=70, GAB=71, WAR=72, MIT=73, IST=74, HIER=75, PUNKT=76, STELLE=77, REST=78, 
		REST_2=79;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "'stelle'", "'der'", "'wortreihe'", "'wortkette'", 
		"'wortfolge'", "'letzten'", "'zeichen'", "'zeichenfolge'", "'zeichenkette'", 
		"'wort'", "'menge'", "'anzahl'", "'zahl'", "'einlesen'", "'ein'", "'lese'", 
		"'oder'", "'kleiner'", "'größer'", "'ungleich'", "'nicht'", "'gleich'", 
		"'falls'", "'wenn'", "'des'", "'stapels'", "'vom'", "'maximale'", "'größe'", 
		"'maximum'", "'version'", "'fehler'", "'falsch'", "'-'", "'nehme'", "'stapel'", 
		"POS_ZAHL", "'register'", "'bis'", "'ergebnisspeicher'", "'ergebnis'", 
		"'zwischen'", "'zwischenspeicher'", "'speichere'", "'gehe'", "'zurückgehen'", 
		"'zurück'", "'auf'", "'aufruf'", "'mache'", "'rufe'", "':'", "'springe'", 
		"'vergleiche'", "'dividiere'", "'multipliziere'", "'subtrahiere'", "'addiere'", 
		"'zeilenumbruch'", "'leerzeile'", "'leertaste'", "'leerzeichen'", "'aus'", 
		"'ausgeben'", "'gebe'", "'folgendes'", "'von'", "'zu'", "'in'", "'gab'", 
		"'war'", "'mit'", "'ist'", "'hier'", "PUNKT", "STELLE", "REST", "REST_2"
	};
	public static final int
		RULE_datei = 0, RULE_satz = 1, RULE_satzWert = 2, RULE_letzterFehler = 3, 
		RULE_rufeAufWennFalsch = 4, RULE_stapelLesenReg = 5, RULE_stapelLesenZw = 6, 
		RULE_stapelLesenErg = 7, RULE_stapelSchreiben = 8, RULE_rufeAufDirekt = 9, 
		RULE_geheZurück = 10, RULE_rufeAufGrGleich = 11, RULE_rufeAufKleinerGleich = 12, 
		RULE_rufeAufGr = 13, RULE_rufeAufWennKleiner = 14, RULE_rufeAufWennNichtGleich = 15, 
		RULE_rufeAufWennGleich = 16, RULE_rufeAuf = 17, RULE_vergleicheRegisterText = 18, 
		RULE_vergleicheRegister = 19, RULE_stapelGrößeZw = 20, RULE_stapelGrößeReg = 21, 
		RULE_stapelGrößeErg = 22, RULE_stapelMaxGrößeReg = 23, RULE_stapelMaxGrößeZw = 24, 
		RULE_stapelMaxGrößeErg = 25, RULE_versionZw = 26, RULE_versionReg = 27, 
		RULE_versionErg = 28, RULE_springeWennFalsch = 29, RULE_registerZeichenEinlesen = 30, 
		RULE_registerWortEinlesen = 31, RULE_registerausgabe = 32, RULE_ladeRegisterAnzahlZw = 33, 
		RULE_ladeRegisterAnzahlErg = 34, RULE_ladeVomRegisterZw = 35, RULE_ladeVomRegisterErg = 36, 
		RULE_ladeInRegister = 37, RULE_leseZahlEinZwischen = 38, RULE_leseZahlEinErg = 39, 
		RULE_stelle = 40, RULE_springeZuDirekt = 41, RULE_springeWennGrGleich = 42, 
		RULE_springeWennKleinerGleich = 43, RULE_springeWennGr = 44, RULE_springeWennKleiner = 45, 
		RULE_springeWennNichtGleich = 46, RULE_springeWennGleich = 47, RULE_springe = 48, 
		RULE_vergleiche = 49, RULE_zwischenspeicher = 50, RULE_ausgabe = 51, RULE_leerzeile = 52, 
		RULE_leerzeichen = 53, RULE_zahlenausgabe = 54, RULE_multipliziere = 55, 
		RULE_dividiere = 56, RULE_subtrahiere = 57, RULE_addiere = 58, RULE_mitST = 59, 
		RULE_istST = 60, RULE_hierST = 61, RULE_gabST = 62, RULE_zuST = 63, RULE_vonST = 64, 
		RULE_folgendesST = 65, RULE_ausgebenST = 66, RULE_leerzeichenST = 67, 
		RULE_leerzeileST = 68, RULE_addiereST = 69, RULE_subtrahiereST = 70, RULE_multipliziereST = 71, 
		RULE_dividiereST = 72, RULE_vergleichST = 73, RULE_springeST = 74, RULE_stelleST = 75, 
		RULE_aufrufST = 76, RULE_zurückgehenST = 77, RULE_speichereST = 78, RULE_zwischenST = 79, 
		RULE_ergebnisST = 80, RULE_registerST = 81, RULE_bereichST = 82, RULE_stapelST = 83, 
		RULE_nehmeST = 84, RULE_zahlST = 85, RULE_posZahlST = 86, RULE_fehlerST = 87, 
		RULE_versionST = 88, RULE_stapelMaxGrST = 89, RULE_stapelGrST = 90, RULE_derST = 91, 
		RULE_wft = 92, RULE_wortfolgeSTALT = 93, RULE_wortfolgeST = 94, RULE_wennST = 95, 
		RULE_ungleichST = 96, RULE_gleichST = 97, RULE_größerST = 98, RULE_kleinerST = 99, 
		RULE_größerGleichST = 100, RULE_kleinerGleichST = 101, RULE_einlesenST = 102, 
		RULE_zahlST_ = 103, RULE_registerST_ = 104, RULE_anzahlST = 105, RULE_wortST = 106, 
		RULE_zeichenST = 107, RULE_letztenFehlerST = 108;
	public static final String[] ruleNames = {
		"datei", "satz", "satzWert", "letzterFehler", "rufeAufWennFalsch", "stapelLesenReg", 
		"stapelLesenZw", "stapelLesenErg", "stapelSchreiben", "rufeAufDirekt", 
		"geheZurück", "rufeAufGrGleich", "rufeAufKleinerGleich", "rufeAufGr", 
		"rufeAufWennKleiner", "rufeAufWennNichtGleich", "rufeAufWennGleich", "rufeAuf", 
		"vergleicheRegisterText", "vergleicheRegister", "stapelGrößeZw", "stapelGrößeReg", 
		"stapelGrößeErg", "stapelMaxGrößeReg", "stapelMaxGrößeZw", "stapelMaxGrößeErg", 
		"versionZw", "versionReg", "versionErg", "springeWennFalsch", "registerZeichenEinlesen", 
		"registerWortEinlesen", "registerausgabe", "ladeRegisterAnzahlZw", "ladeRegisterAnzahlErg", 
		"ladeVomRegisterZw", "ladeVomRegisterErg", "ladeInRegister", "leseZahlEinZwischen", 
		"leseZahlEinErg", "stelle", "springeZuDirekt", "springeWennGrGleich", 
		"springeWennKleinerGleich", "springeWennGr", "springeWennKleiner", "springeWennNichtGleich", 
		"springeWennGleich", "springe", "vergleiche", "zwischenspeicher", "ausgabe", 
		"leerzeile", "leerzeichen", "zahlenausgabe", "multipliziere", "dividiere", 
		"subtrahiere", "addiere", "mitST", "istST", "hierST", "gabST", "zuST", 
		"vonST", "folgendesST", "ausgebenST", "leerzeichenST", "leerzeileST", 
		"addiereST", "subtrahiereST", "multipliziereST", "dividiereST", "vergleichST", 
		"springeST", "stelleST", "aufrufST", "zurückgehenST", "speichereST", "zwischenST", 
		"ergebnisST", "registerST", "bereichST", "stapelST", "nehmeST", "zahlST", 
		"posZahlST", "fehlerST", "versionST", "stapelMaxGrST", "stapelGrST", "derST", 
		"wft", "wortfolgeSTALT", "wortfolgeST", "wennST", "ungleichST", "gleichST", 
		"größerST", "kleinerST", "größerGleichST", "kleinerGleichST", "einlesenST", 
		"zahlST_", "registerST_", "anzahlST", "wortST", "zeichenST", "letztenFehlerST"
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
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218); ((DateiContext)_localctx).satz = satz();
				setState(220);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(219); match(WS);
					}
				}

				_localctx.inhalt.add(((DateiContext)_localctx).satz.inhalt);
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 15)) & ~0x3f) == 0 && ((1L << (_la - 15)) & ((1L << (EINESEN - 15)) | (1L << (LESE - 15)) | (1L << (FALLS - 15)) | (1L << (WENN - 15)) | (1L << (NEHME - 15)) | (1L << (SPEICHERE - 15)) | (1L << (GEHE - 15)) | (1L << (ZURÜCKGEHEN - 15)) | (1L << (MACHE - 15)) | (1L << (RUFE - 15)) | (1L << (SPRINGE - 15)) | (1L << (VERGLEICHE - 15)) | (1L << (DIVIDIERE - 15)) | (1L << (MULTIPLIZIERE - 15)) | (1L << (SUBTRAHIERE - 15)) | (1L << (ADDIERE - 15)) | (1L << (AUSGEBEN - 15)) | (1L << (GEBE - 15)) | (1L << (HIER - 15)))) != 0) );
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
			setState(229); ((SatzContext)_localctx).satzWert = satzWert();
			setState(231);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(230); match(WS);
				}
			}

			setState(233); match(PUNKT);
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
		public StapelMaxGrößeErgContext stapelMaxGrößeErg() {
			return getRuleContext(StapelMaxGrößeErgContext.class,0);
		}
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
		public StapelGrößeErgContext stapelGrößeErg() {
			return getRuleContext(StapelGrößeErgContext.class,0);
		}
		public RegisterausgabeContext registerausgabe() {
			return getRuleContext(RegisterausgabeContext.class,0);
		}
		public VersionRegContext versionReg() {
			return getRuleContext(VersionRegContext.class,0);
		}
		public GeheZurückContext geheZurück() {
			return getRuleContext(GeheZurückContext.class,0);
		}
		public RegisterWortEinlesenContext registerWortEinlesen() {
			return getRuleContext(RegisterWortEinlesenContext.class,0);
		}
		public RufeAufGrContext rufeAufGr() {
			return getRuleContext(RufeAufGrContext.class,0);
		}
		public StelleContext stelle() {
			return getRuleContext(StelleContext.class,0);
		}
		public MultipliziereContext multipliziere() {
			return getRuleContext(MultipliziereContext.class,0);
		}
		public StapelLesenRegContext stapelLesenReg() {
			return getRuleContext(StapelLesenRegContext.class,0);
		}
		public StapelGrößeZwContext stapelGrößeZw() {
			return getRuleContext(StapelGrößeZwContext.class,0);
		}
		public LeseZahlEinZwischenContext leseZahlEinZwischen() {
			return getRuleContext(LeseZahlEinZwischenContext.class,0);
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
		public StapelMaxGrößeRegContext stapelMaxGrößeReg() {
			return getRuleContext(StapelMaxGrößeRegContext.class,0);
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
		public StapelGrößeRegContext stapelGrößeReg() {
			return getRuleContext(StapelGrößeRegContext.class,0);
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
		public StapelLesenZwContext stapelLesenZw() {
			return getRuleContext(StapelLesenZwContext.class,0);
		}
		public StapelLesenErgContext stapelLesenErg() {
			return getRuleContext(StapelLesenErgContext.class,0);
		}
		public VergleicheContext vergleiche() {
			return getRuleContext(VergleicheContext.class,0);
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
		public SpringeZuDirektContext springeZuDirekt() {
			return getRuleContext(SpringeZuDirektContext.class,0);
		}
		public StapelMaxGrößeZwContext stapelMaxGrößeZw() {
			return getRuleContext(StapelMaxGrößeZwContext.class,0);
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
			setState(336);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(236); ((SatzWertContext)_localctx).addiere = addiere();
				((SatzWertContext)_localctx).inhalt =  new Zahlenoperation(SatzArt.addiere, ((SatzWertContext)_localctx).addiere.a, ((SatzWertContext)_localctx).addiere.b);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(239); ((SatzWertContext)_localctx).subtrahiere = subtrahiere();
				((SatzWertContext)_localctx).inhalt =  new Zahlenoperation(SatzArt.subtrahiere, ((SatzWertContext)_localctx).subtrahiere.a, ((SatzWertContext)_localctx).subtrahiere.b);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(242); ((SatzWertContext)_localctx).multipliziere = multipliziere();
				((SatzWertContext)_localctx).inhalt =  new Zahlenoperation(SatzArt.multipliziere, ((SatzWertContext)_localctx).multipliziere.a, ((SatzWertContext)_localctx).multipliziere.b);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(245); ((SatzWertContext)_localctx).dividiere = dividiere();
				((SatzWertContext)_localctx).inhalt =  new Zahlenoperation(SatzArt.dividiere, ((SatzWertContext)_localctx).dividiere.a, ((SatzWertContext)_localctx).dividiere.b);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(248); ((SatzWertContext)_localctx).zahlenausgabe = zahlenausgabe();
				((SatzWertContext)_localctx).inhalt =  new Ausgabeoperation(SatzArt.zahlenausgabe, ((SatzWertContext)_localctx).zahlenausgabe.ausgeben);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(251); leerzeichen();
				((SatzWertContext)_localctx).inhalt =  new Ausgabeoperation(SatzArt.leerzeichen, ZeichenKette.LEERZEICHEN);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(254); leerzeile();
				((SatzWertContext)_localctx).inhalt =  new Ausgabeoperation(SatzArt.leerzeichen, ZeichenKette.LEERZEILE);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(257); ((SatzWertContext)_localctx).ausgabe = ausgabe();
				((SatzWertContext)_localctx).inhalt =  new Ausgabeoperation(SatzArt.leerzeichen, ((SatzWertContext)_localctx).ausgabe.wortfolge);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(260); zwischenspeicher();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.zwischenspeicher, Collections.emptyList());
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(263); ((SatzWertContext)_localctx).vergleiche = vergleiche();
				((SatzWertContext)_localctx).inhalt =  new Zahlenoperation(SatzArt.vergleiche, ((SatzWertContext)_localctx).vergleiche.a, ((SatzWertContext)_localctx).vergleiche.b);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(266); ((SatzWertContext)_localctx).springe = springe();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.springe, ((SatzWertContext)_localctx).springe.ziel);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(269); ((SatzWertContext)_localctx).springeWennNichtGleich = springeWennNichtGleich();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.springeWennNichtGleich, ((SatzWertContext)_localctx).springeWennNichtGleich.ziel);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				{
				setState(272); ((SatzWertContext)_localctx).springeWennGleich = springeWennGleich();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.springeWennGleich, ((SatzWertContext)_localctx).springeWennGleich.ziel);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				{
				setState(275); ((SatzWertContext)_localctx).springeWennKleiner = springeWennKleiner();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.springeWennKleiner, ((SatzWertContext)_localctx).springeWennKleiner.ziel);
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				{
				setState(278); ((SatzWertContext)_localctx).springeWennGr = springeWennGr();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.springeWennGrößer, ((SatzWertContext)_localctx).springeWennGr.ziel);
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				{
				setState(281); ((SatzWertContext)_localctx).springeWennKleinerGleich = springeWennKleinerGleich();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.springeWennKleinerGleich, ((SatzWertContext)_localctx).springeWennKleinerGleich.ziel);
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(284); ((SatzWertContext)_localctx).springeWennGrGleich = springeWennGrGleich();
				((SatzWertContext)_localctx).inhalt =  new Stellenoperation(SatzArt.springeWennGrößerGleich, ((SatzWertContext)_localctx).springeWennGrGleich.ziel);
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				{
				setState(287); ((SatzWertContext)_localctx).springeZuDirekt = springeZuDirekt();
				((SatzWertContext)_localctx).inhalt =  new EinzelZahlenoperation(SatzArt.springeZuDirekt, ((SatzWertContext)_localctx).springeZuDirekt.ziel);
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				{
				setState(290); ((SatzWertContext)_localctx).stelle = stelle();
				((SatzWertContext)_localctx).inhalt =  new ZeichenKettenoperation(SatzArt.stelle, ((SatzWertContext)_localctx).stelle.name);
				}
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				{
				setState(293); leseZahlEinErg();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.leseZahlEinErg, Collections.emptyList());
				}
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				{
				setState(296); leseZahlEinZwischen();
				((SatzWertContext)_localctx).inhalt =  new Satz(SatzArt.leseZahlEinZwischen, Collections.emptyList());
				}
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				{
				setState(299); ((SatzWertContext)_localctx).ladeInRegister = ladeInRegister();
				((SatzWertContext)_localctx).inhalt =  new RegisterUndZahlOperation(SatzArt.ladeInRegister, ((SatzWertContext)_localctx).ladeInRegister.reg, ((SatzWertContext)_localctx).ladeInRegister.wert);
				}
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				{
				setState(302); ladeVomRegisterErg();
				}
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				{
				setState(303); ladeVomRegisterZw();
				}
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				{
				setState(304); ladeRegisterAnzahlErg();
				}
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				{
				setState(305); ladeRegisterAnzahlZw();
				}
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				{
				setState(306); registerausgabe();
				}
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				{
				setState(307); registerWortEinlesen();
				}
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				{
				setState(308); registerZeichenEinlesen();
				}
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				{
				setState(309); springeWennFalsch();
				}
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				{
				setState(310); versionErg();
				}
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				{
				setState(311); versionZw();
				}
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				{
				setState(312); versionReg();
				}
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				{
				setState(313); stapelMaxGrößeErg();
				}
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				{
				setState(314); stapelMaxGrößeZw();
				}
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				{
				setState(315); stapelMaxGrößeReg();
				}
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				{
				setState(316); stapelGrößeErg();
				}
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				{
				setState(317); stapelGrößeZw();
				}
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				{
				setState(318); stapelGrößeReg();
				}
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				{
				setState(319); vergleicheRegister();
				}
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				{
				setState(320); vergleicheRegisterText();
				}
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				{
				setState(321); rufeAuf();
				}
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				{
				setState(322); rufeAufWennGleich();
				}
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				{
				setState(323); rufeAufWennNichtGleich();
				}
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				{
				setState(324); rufeAufWennKleiner();
				}
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				{
				setState(325); rufeAufGr();
				}
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				{
				setState(326); rufeAufKleinerGleich();
				}
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				{
				setState(327); rufeAufGrGleich();
				}
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				{
				setState(328); geheZurück();
				}
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				{
				setState(329); rufeAufDirekt();
				}
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				{
				setState(330); stapelSchreiben();
				}
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				{
				setState(331); stapelLesenErg();
				}
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				{
				setState(332); stapelLesenZw();
				}
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				{
				setState(333); stapelLesenReg();
				}
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				{
				setState(334); rufeAufWennFalsch();
				}
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				{
				setState(335); letzterFehler();
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
			setState(338); nehmeST();
			setState(339); match(WS);
			setState(340); letztenFehlerST();
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
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public FehlerSTContext fehlerST() {
			return getRuleContext(FehlerSTContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342); wennST();
			setState(343); match(WS);
			setState(344); fehlerST();
			setState(345); match(WS);
			setState(346); gabST();
			setState(347); match(WS);
			setState(348); aufrufST();
			setState(349); match(WS);
			setState(350); zuST();
			setState(351); match(WS);
			setState(352); ((RufeAufWennFalschContext)_localctx).stelleST = stelleST();
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
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public NehmeSTContext nehmeST() {
			return getRuleContext(NehmeSTContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355); nehmeST();
			setState(356); match(WS);
			setState(357); vonST();
			setState(358); match(WS);
			setState(359); stapelST();
			setState(360); match(WS);
			setState(361); zuST();
			setState(362); match(WS);
			setState(363); ((StapelLesenRegContext)_localctx).registerST = registerST();
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
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public NehmeSTContext nehmeST() {
			return getRuleContext(NehmeSTContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); nehmeST();
			setState(367); match(WS);
			setState(368); vonST();
			setState(369); match(WS);
			setState(370); stapelST();
			setState(371); match(WS);
			setState(372); zuST();
			setState(373); match(WS);
			setState(374); zwischenST();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); nehmeST();
			setState(377); match(WS);
			setState(378); vonST();
			setState(379); match(WS);
			setState(380); stapelST();
			setState(381); match(WS);
			setState(382); zuST();
			setState(383); match(WS);
			setState(384); ergebnisST();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386); speichereST();
			setState(387); match(WS);
			setState(388); ((StapelSchreibenContext)_localctx).zahlST = zahlST();
			setState(389); match(WS);
			setState(390); zuST();
			setState(391); match(WS);
			setState(392); stapelST();
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
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public PosZahlSTContext posZahlST() {
			return getRuleContext(PosZahlSTContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395); aufrufST();
			setState(396); match(WS);
			setState(397); zuST();
			setState(398); match(WS);
			setState(399); ((RufeAufDirektContext)_localctx).posZahlST = posZahlST();
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

	public static class GeheZurückContext extends ParserRuleContext {
		public ZurückgehenSTContext zurückgehenST() {
			return getRuleContext(ZurückgehenSTContext.class,0);
		}
		public GeheZurückContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geheZurück; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterGeheZurück(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitGeheZurück(this);
		}
	}

	public final GeheZurückContext geheZurück() throws RecognitionException {
		GeheZurückContext _localctx = new GeheZurückContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_geheZurück);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402); zurückgehenST();
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
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public AufrufSTContext aufrufST() {
			return getRuleContext(AufrufSTContext.class,0);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404); wennST();
			setState(405); match(WS);
			setState(406); größerGleichST();
			setState(407); match(WS);
			setState(408); aufrufST();
			setState(409); match(WS);
			setState(410); zuST();
			setState(411); match(WS);
			setState(412); ((RufeAufGrGleichContext)_localctx).stelleST = stelleST();
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
		public KleinerGleichSTContext kleinerGleichST() {
			return getRuleContext(KleinerGleichSTContext.class,0);
		}
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public AufrufSTContext aufrufST() {
			return getRuleContext(AufrufSTContext.class,0);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); wennST();
			setState(416); match(WS);
			setState(417); kleinerGleichST();
			setState(418); match(WS);
			setState(419); aufrufST();
			setState(420); match(WS);
			setState(421); zuST();
			setState(422); match(WS);
			setState(423); ((RufeAufKleinerGleichContext)_localctx).stelleST = stelleST();
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
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public AufrufSTContext aufrufST() {
			return getRuleContext(AufrufSTContext.class,0);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426); wennST();
			setState(427); match(WS);
			setState(428); größerST();
			setState(429); match(WS);
			setState(430); aufrufST();
			setState(431); match(WS);
			setState(432); zuST();
			setState(433); match(WS);
			setState(434); ((RufeAufGrContext)_localctx).stelleST = stelleST();
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
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public AufrufSTContext aufrufST() {
			return getRuleContext(AufrufSTContext.class,0);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public KleinerSTContext kleinerST() {
			return getRuleContext(KleinerSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437); wennST();
			setState(438); match(WS);
			setState(439); kleinerST();
			setState(440); match(WS);
			setState(441); aufrufST();
			setState(442); match(WS);
			setState(443); zuST();
			setState(444); match(WS);
			setState(445); ((RufeAufWennKleinerContext)_localctx).stelleST = stelleST();
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
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public AufrufSTContext aufrufST() {
			return getRuleContext(AufrufSTContext.class,0);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public UngleichSTContext ungleichST() {
			return getRuleContext(UngleichSTContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448); wennST();
			setState(449); match(WS);
			setState(450); ungleichST();
			setState(451); match(WS);
			setState(452); aufrufST();
			setState(453); match(WS);
			setState(454); zuST();
			setState(455); match(WS);
			setState(456); ((RufeAufWennNichtGleichContext)_localctx).stelleST = stelleST();
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
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public AufrufSTContext aufrufST() {
			return getRuleContext(AufrufSTContext.class,0);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459); wennST();
			setState(460); match(WS);
			setState(461); gleichST();
			setState(462); match(WS);
			setState(463); aufrufST();
			setState(464); match(WS);
			setState(465); zuST();
			setState(466); match(WS);
			setState(467); ((RufeAufWennGleichContext)_localctx).stelleST = stelleST();
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
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470); aufrufST();
			setState(471); match(WS);
			setState(472); zuST();
			setState(473); match(WS);
			setState(474); ((RufeAufContext)_localctx).stelleST = stelleST();
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
		public Zahl start;
		public Zahl ende;
		public String wortfolge;
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
			setState(477); vergleichST();
			setState(478); match(WS);
			setState(479); ((VergleicheRegisterTextContext)_localctx).bereichST = bereichST();
			setState(480); match(WS);
			setState(481); mitST();
			setState(482); match(WS);
			setState(483); derST();
			setState(484); match(WS);
			setState(485); ((VergleicheRegisterTextContext)_localctx).wortfolgeST = wortfolgeST();
				((VergleicheRegisterTextContext)_localctx).start =  ((VergleicheRegisterTextContext)_localctx).bereichST.start;
					((VergleicheRegisterTextContext)_localctx).ende =  ((VergleicheRegisterTextContext)_localctx).bereichST.ende;
					((VergleicheRegisterTextContext)_localctx).wortfolge =  ((VergleicheRegisterTextContext)_localctx).wortfolgeST.wortfolge;
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
			setState(488); vergleichST();
			setState(489); match(WS);
			setState(490); bereichST();
			setState(491); match(WS);
			setState(492); mitST();
			setState(493); match(WS);
			setState(494); bereichST();
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

	public static class StapelGrößeZwContext extends ParserRuleContext {
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
		public StapelGrSTContext stapelGrST() {
			return getRuleContext(StapelGrSTContext.class,0);
		}
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public StapelGrößeZwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelGrößeZw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelGrößeZw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelGrößeZw(this);
		}
	}

	public final StapelGrößeZwContext stapelGrößeZw() throws RecognitionException {
		StapelGrößeZwContext _localctx = new StapelGrößeZwContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stapelGrößeZw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496); speichereST();
			setState(497); match(WS);
			setState(498); stapelGrST();
			setState(499); match(WS);
			setState(500); zuST();
			setState(501); match(WS);
			setState(502); zwischenST();
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

	public static class StapelGrößeRegContext extends ParserRuleContext {
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
		public StapelGrSTContext stapelGrST() {
			return getRuleContext(StapelGrSTContext.class,0);
		}
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public StapelGrößeRegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelGrößeReg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelGrößeReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelGrößeReg(this);
		}
	}

	public final StapelGrößeRegContext stapelGrößeReg() throws RecognitionException {
		StapelGrößeRegContext _localctx = new StapelGrößeRegContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stapelGrößeReg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504); speichereST();
			setState(505); match(WS);
			setState(506); stapelGrST();
			setState(507); match(WS);
			setState(508); zuST();
			setState(509); match(WS);
			setState(510); ((StapelGrößeRegContext)_localctx).registerST = registerST();
			((StapelGrößeRegContext)_localctx).reg =  ((StapelGrößeRegContext)_localctx).registerST.reg;
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

	public static class StapelGrößeErgContext extends ParserRuleContext {
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
		public StapelGrößeErgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelGrößeErg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelGrößeErg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelGrößeErg(this);
		}
	}

	public final StapelGrößeErgContext stapelGrößeErg() throws RecognitionException {
		StapelGrößeErgContext _localctx = new StapelGrößeErgContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stapelGrößeErg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513); speichereST();
			setState(514); match(WS);
			setState(515); stapelGrST();
			setState(516); match(WS);
			setState(517); zuST();
			setState(518); match(WS);
			setState(519); ergebnisST();
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

	public static class StapelMaxGrößeRegContext extends ParserRuleContext {
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
		public StapelMaxGrSTContext stapelMaxGrST() {
			return getRuleContext(StapelMaxGrSTContext.class,0);
		}
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public StapelMaxGrößeRegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelMaxGrößeReg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelMaxGrößeReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelMaxGrößeReg(this);
		}
	}

	public final StapelMaxGrößeRegContext stapelMaxGrößeReg() throws RecognitionException {
		StapelMaxGrößeRegContext _localctx = new StapelMaxGrößeRegContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_stapelMaxGrößeReg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521); speichereST();
			setState(522); match(WS);
			setState(523); stapelMaxGrST();
			setState(524); match(WS);
			setState(525); zuST();
			setState(526); match(WS);
			setState(527); ((StapelMaxGrößeRegContext)_localctx).registerST = registerST();
			((StapelMaxGrößeRegContext)_localctx).reg =  ((StapelMaxGrößeRegContext)_localctx).registerST.reg;
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

	public static class StapelMaxGrößeZwContext extends ParserRuleContext {
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
		public StapelMaxGrSTContext stapelMaxGrST() {
			return getRuleContext(StapelMaxGrSTContext.class,0);
		}
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public StapelMaxGrößeZwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelMaxGrößeZw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelMaxGrößeZw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelMaxGrößeZw(this);
		}
	}

	public final StapelMaxGrößeZwContext stapelMaxGrößeZw() throws RecognitionException {
		StapelMaxGrößeZwContext _localctx = new StapelMaxGrößeZwContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_stapelMaxGrößeZw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530); speichereST();
			setState(531); match(WS);
			setState(532); stapelMaxGrST();
			setState(533); match(WS);
			setState(534); zuST();
			setState(535); match(WS);
			setState(536); zwischenST();
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

	public static class StapelMaxGrößeErgContext extends ParserRuleContext {
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
		public StapelMaxGrSTContext stapelMaxGrST() {
			return getRuleContext(StapelMaxGrSTContext.class,0);
		}
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
		}
		public StapelMaxGrößeErgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stapelMaxGrößeErg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterStapelMaxGrößeErg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitStapelMaxGrößeErg(this);
		}
	}

	public final StapelMaxGrößeErgContext stapelMaxGrößeErg() throws RecognitionException {
		StapelMaxGrößeErgContext _localctx = new StapelMaxGrößeErgContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stapelMaxGrößeErg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538); speichereST();
			setState(539); match(WS);
			setState(540); stapelMaxGrST();
			setState(541); match(WS);
			setState(542); zuST();
			setState(543); match(WS);
			setState(544); ergebnisST();
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
			setState(546); speichereST();
			setState(547); match(WS);
			setState(548); versionST();
			setState(549); match(WS);
			setState(550); zuST();
			setState(551); match(WS);
			setState(552); zwischenST();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554); speichereST();
			setState(555); match(WS);
			setState(556); versionST();
			setState(557); match(WS);
			setState(558); zuST();
			setState(559); match(WS);
			setState(560); ((VersionRegContext)_localctx).registerST = registerST();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563); speichereST();
			setState(564); match(WS);
			setState(565); versionST();
			setState(566); match(WS);
			setState(567); zuST();
			setState(568); match(WS);
			setState(569); ergebnisST();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571); wennST();
			setState(572); match(WS);
			setState(573); fehlerST();
			setState(574); match(WS);
			setState(575); gabST();
			setState(576); match(WS);
			setState(577); springeST();
			setState(578); match(WS);
			setState(579); zuST();
			setState(580); match(WS);
			setState(581); ((SpringeWennFalschContext)_localctx).stelleST = stelleST();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584); einlesenST();
			setState(585); match(WS);
			setState(586); ((RegisterZeichenEinlesenContext)_localctx).posZahlST = posZahlST();
			setState(587); match(WS);
			setState(588); zeichenST();
			setState(589); match(WS);
			setState(590); zuST();
			setState(591); match(WS);
			setState(592); ((RegisterZeichenEinlesenContext)_localctx).registerST = registerST();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); einlesenST();
			setState(596); match(WS);
			setState(597); wortST();
			setState(598); match(WS);
			setState(599); zuST();
			setState(600); match(WS);
			setState(601); ((RegisterWortEinlesenContext)_localctx).registerST = registerST();
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
		public Zahl start;
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
			setState(604); ausgebenST();
			setState(605); match(WS);
			setState(606); ((RegisterausgabeContext)_localctx).bereichST = bereichST();
				((RegisterausgabeContext)_localctx).start =  ((RegisterausgabeContext)_localctx).bereichST.start;
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
		public RegisterST_Context registerST_() {
			return getRuleContext(RegisterST_Context.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public SpeichereSTContext speichereST() {
			return getRuleContext(SpeichereSTContext.class,0);
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
			setState(609); speichereST();
			setState(610); match(WS);
			setState(611); anzahlST();
			setState(612); match(WS);
			setState(613); registerST_();
			setState(614); match(WS);
			setState(615); zwischenST();
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
			setState(617); speichereST();
			setState(618); match(WS);
			setState(619); anzahlST();
			setState(620); match(WS);
			setState(621); registerST_();
			setState(622); match(WS);
			setState(623); ergebnisST();
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
		enterRule(_localctx, 70, RULE_ladeVomRegisterZw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625); speichereST();
			setState(626); match(WS);
			setState(627); ((LadeVomRegisterZwContext)_localctx).registerST = registerST();
			setState(628); match(WS);
			setState(629); zuST();
			setState(630); match(WS);
			setState(631); zwischenST();
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
		enterRule(_localctx, 72, RULE_ladeVomRegisterErg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634); speichereST();
			setState(635); match(WS);
			setState(636); ((LadeVomRegisterErgContext)_localctx).registerST = registerST();
			setState(637); match(WS);
			setState(638); zuST();
			setState(639); match(WS);
			setState(640); ergebnisST();
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
		public zahl wert;
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
		enterRule(_localctx, 74, RULE_ladeInRegister);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643); speichereST();
			setState(644); match(WS);
			setState(645); ((LadeInRegisterContext)_localctx).zahlST = zahlST();
			setState(646); match(WS);
			setState(647); zuST();
			setState(648); match(WS);
			setState(649); ((LadeInRegisterContext)_localctx).registerST = registerST();
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
		enterRule(_localctx, 76, RULE_leseZahlEinZwischen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652); einlesenST();
			setState(653); match(WS);
			setState(654); zahlST_();
			setState(655); match(WS);
			setState(656); zuST();
			setState(657); match(WS);
			setState(658); zwischenST();
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
		enterRule(_localctx, 78, RULE_leseZahlEinErg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660); einlesenST();
			setState(661); match(WS);
			setState(662); zahlST_();
			setState(663); match(WS);
			setState(664); zuST();
			setState(665); match(WS);
			setState(666); ergebnisST();
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
		enterRule(_localctx, 80, RULE_stelle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668); hierST();
			setState(669); match(WS);
			setState(670); istST();
			setState(671); match(WS);
			setState(672); ((StelleContext)_localctx).stelleST = stelleST();
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
		enterRule(_localctx, 82, RULE_springeZuDirekt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675); springeST();
			setState(676); match(WS);
			setState(677); zuST();
			setState(678); match(WS);
			setState(679); ((SpringeZuDirektContext)_localctx).posZahlST = posZahlST();
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
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
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
		enterRule(_localctx, 84, RULE_springeWennGrGleich);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682); wennST();
			setState(683); match(WS);
			setState(684); größerST();
			setState(685); match(WS);
			setState(686); springeST();
			setState(687); match(WS);
			setState(688); zuST();
			setState(689); match(WS);
			setState(690); ((SpringeWennGrGleichContext)_localctx).stelleST = stelleST();
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
		enterRule(_localctx, 86, RULE_springeWennKleinerGleich);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693); wennST();
			setState(694); match(WS);
			setState(695); kleinerGleichST();
			setState(696); match(WS);
			setState(697); springeST();
			setState(698); match(WS);
			setState(699); zuST();
			setState(700); match(WS);
			setState(701); ((SpringeWennKleinerGleichContext)_localctx).stelleST = stelleST();
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
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
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
		enterRule(_localctx, 88, RULE_springeWennGr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704); wennST();
			setState(705); match(WS);
			setState(706); größerST();
			setState(707); match(WS);
			setState(708); springeST();
			setState(709); match(WS);
			setState(710); zuST();
			setState(711); match(WS);
			setState(712); ((SpringeWennGrContext)_localctx).stelleST = stelleST();
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
		enterRule(_localctx, 90, RULE_springeWennKleiner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715); wennST();
			setState(716); match(WS);
			setState(717); kleinerST();
			setState(718); match(WS);
			setState(719); springeST();
			setState(720); match(WS);
			setState(721); zuST();
			setState(722); match(WS);
			setState(723); ((SpringeWennKleinerContext)_localctx).stelleST = stelleST();
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
		enterRule(_localctx, 92, RULE_springeWennNichtGleich);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726); wennST();
			setState(727); match(WS);
			setState(728); ungleichST();
			setState(729); match(WS);
			setState(730); springeST();
			setState(731); match(WS);
			setState(732); zuST();
			setState(733); match(WS);
			setState(734); ((SpringeWennNichtGleichContext)_localctx).stelleST = stelleST();
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
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public ZuSTContext zuST() {
			return getRuleContext(ZuSTContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
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
		enterRule(_localctx, 94, RULE_springeWennGleich);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737); wennST();
			setState(738); match(WS);
			setState(739); gleichST();
			setState(740); match(WS);
			setState(741); springeST();
			setState(742); match(WS);
			setState(743); zuST();
			setState(744); match(WS);
			setState(745); ((SpringeWennGleichContext)_localctx).stelleST = stelleST();
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
		enterRule(_localctx, 96, RULE_springe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748); springeST();
			setState(749); match(WS);
			setState(750); zuST();
			setState(751); match(WS);
			setState(752); ((SpringeContext)_localctx).stelleST = stelleST();
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
		enterRule(_localctx, 98, RULE_vergleiche);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755); vergleichST();
			setState(756); match(WS);
			{
			setState(757); ((VergleicheContext)_localctx).zahlST = zahlST();
			((VergleicheContext)_localctx).a =  ((VergleicheContext)_localctx).zahlST.zahl;
			}
			setState(760); match(WS);
			setState(761); mitST();
			setState(762); match(WS);
			{
			setState(763); ((VergleicheContext)_localctx).zahlST = zahlST();
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
		enterRule(_localctx, 100, RULE_zwischenspeicher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766); speichereST();
			setState(767); match(WS);
			setState(768); ergebnisST();
			setState(771);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(769); match(WS);
				setState(770); zuST();
				}
				break;
			}
			setState(773); match(WS);
			setState(774); zwischenST();
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
		enterRule(_localctx, 102, RULE_ausgabe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776); ausgebenST();
			setState(777); match(WS);
			setState(778); folgendesST();
			setState(779); match(WS);
			setState(780); ((AusgabeContext)_localctx).wortfolgeST = wortfolgeST();
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
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public AusgebenSTContext ausgebenST() {
			return getRuleContext(AusgebenSTContext.class,0);
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
		enterRule(_localctx, 104, RULE_leerzeile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783); ausgebenST();
			setState(784); match(WS);
			setState(785); leerzeileST();
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
		enterRule(_localctx, 106, RULE_leerzeichen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787); ausgebenST();
			setState(788); match(WS);
			setState(789); leerzeichenST();
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
		enterRule(_localctx, 108, RULE_zahlenausgabe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791); ausgebenST();
			setState(792); match(WS);
			setState(793); ((ZahlenausgabeContext)_localctx).zahlST = zahlST();
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
		enterRule(_localctx, 110, RULE_multipliziere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796); multipliziereST();
			setState(797); match(WS);
			{
			setState(798); ((MultipliziereContext)_localctx).zahlST = zahlST();
			((MultipliziereContext)_localctx).a =  ((MultipliziereContext)_localctx).zahlST.zahl;
			}
			setState(801); match(WS);
			setState(802); mitST();
			setState(803); match(WS);
			{
			setState(804); ((MultipliziereContext)_localctx).zahlST = zahlST();
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
		enterRule(_localctx, 112, RULE_dividiere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807); dividiereST();
			setState(808); match(WS);
			{
			setState(809); ((DividiereContext)_localctx).zahlST = zahlST();
			((DividiereContext)_localctx).a =  ((DividiereContext)_localctx).zahlST.zahl;
			}
			setState(812); match(WS);
			setState(813); mitST();
			setState(814); match(WS);
			{
			setState(815); ((DividiereContext)_localctx).zahlST = zahlST();
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
		enterRule(_localctx, 114, RULE_subtrahiere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818); subtrahiereST();
			setState(819); match(WS);
			{
			setState(820); ((SubtrahiereContext)_localctx).zahlST = zahlST();
			((SubtrahiereContext)_localctx).a =  ((SubtrahiereContext)_localctx).zahlST.zahl;
			}
			setState(823); match(WS);
			setState(824); mitST();
			setState(825); match(WS);
			{
			setState(826); ((SubtrahiereContext)_localctx).zahlST = zahlST();
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
		enterRule(_localctx, 116, RULE_addiere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829); addiereST();
			setState(830); match(WS);
			{
			setState(831); ((AddiereContext)_localctx).zahlST = zahlST();
			((AddiereContext)_localctx).a =  ((AddiereContext)_localctx).zahlST.zahl;
			}
			setState(834); match(WS);
			setState(835); mitST();
			setState(836); match(WS);
			{
			setState(837); ((AddiereContext)_localctx).zahlST = zahlST();
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
		enterRule(_localctx, 118, RULE_mitST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840); match(MIT);
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
		enterRule(_localctx, 120, RULE_istST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842); match(IST);
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
		enterRule(_localctx, 122, RULE_hierST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844); match(HIER);
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
		enterRule(_localctx, 124, RULE_gabST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
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
		enterRule(_localctx, 126, RULE_zuST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			_la = _input.LA(1);
			if ( !(_la==ZU || _la==IN) ) {
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
		enterRule(_localctx, 128, RULE_vonST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
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
		public TerminalNode DP() { return getToken(TPS_ANTLRParser.DP, 0); }
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
		enterRule(_localctx, 130, RULE_folgendesST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852); match(FOLGENDES);
			setState(854);
			_la = _input.LA(1);
			if (_la==DP) {
				{
				setState(853); match(DP);
				}
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

	public static class AusgebenSTContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(TPS_ANTLRParser.WS, 0); }
		public TerminalNode AUSGEBEN() { return getToken(TPS_ANTLRParser.AUSGEBEN, 0); }
		public TerminalNode GEBE() { return getToken(TPS_ANTLRParser.GEBE, 0); }
		public TerminalNode AUS() { return getToken(TPS_ANTLRParser.AUS, 0); }
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
		enterRule(_localctx, 132, RULE_ausgebenST);
		try {
			setState(860);
			switch (_input.LA(1)) {
			case GEBE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(856); match(GEBE);
				setState(857); match(WS);
				setState(858); match(AUS);
				}
				}
				break;
			case AUSGEBEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(859); match(AUSGEBEN);
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
		enterRule(_localctx, 134, RULE_leerzeichenST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
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
		enterRule(_localctx, 136, RULE_leerzeileST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
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
		enterRule(_localctx, 138, RULE_addiereST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(866);
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
		enterRule(_localctx, 140, RULE_subtrahiereST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
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
		enterRule(_localctx, 142, RULE_multipliziereST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
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
		enterRule(_localctx, 144, RULE_dividiereST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
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
		enterRule(_localctx, 146, RULE_vergleichST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874); match(VERGLEICHE);
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
		enterRule(_localctx, 148, RULE_springeST);
		try {
			setState(880);
			switch (_input.LA(1)) {
			case SPRINGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(876); match(SPRINGE);
				}
				break;
			case GEBE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(877); match(GEBE);
				setState(878); match(WS);
				setState(879); match(ZU);
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
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public TerminalNode DP() { return getToken(TPS_ANTLRParser.DP, 0); }
		public TerminalNode STELLE_WORT() { return getToken(TPS_ANTLRParser.STELLE_WORT, 0); }
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
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
		enterRule(_localctx, 150, RULE_stelleST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882); match(STELLE_WORT);
			setState(884);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(883); match(WS);
				}
				break;
			}
			setState(887);
			_la = _input.LA(1);
			if (_la==DP) {
				{
				setState(886); match(DP);
				}
			}

			setState(889); match(WS);
			setState(890); ((StelleSTContext)_localctx).STELLE = match(STELLE);
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
		enterRule(_localctx, 152, RULE_aufrufST);
		try {
			setState(899);
			switch (_input.LA(1)) {
			case RUFE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(893); match(RUFE);
				setState(894); match(WS);
				setState(895); match(AUF);
				}
				}
				break;
			case MACHE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(896); match(MACHE);
				setState(897); match(WS);
				setState(898); match(AUFRUF);
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
		enterRule(_localctx, 154, RULE_zurückgehenST);
		try {
			setState(905);
			switch (_input.LA(1)) {
			case GEHE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(901); match(GEHE);
				setState(902); match(WS);
				setState(903); match(ZURÜCK);
				}
				}
				break;
			case ZURÜCKGEHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(904); match(ZURÜCKGEHEN);
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
		enterRule(_localctx, 156, RULE_speichereST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907); match(SPEICHERE);
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
		enterRule(_localctx, 158, RULE_zwischenST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
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
		enterRule(_localctx, 160, RULE_ergebnisST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
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
		enterRule(_localctx, 162, RULE_registerST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(913); match(REGISTER);
			setState(914); match(WS);
			setState(917);
			_la = _input.LA(1);
			if (_la==VON) {
				{
				setState(915); match(VON);
				setState(916); match(WS);
				}
			}

			setState(919); ((RegisterSTContext)_localctx).posZahlST = posZahlST();
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
		public Zahl start;
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
		enterRule(_localctx, 164, RULE_bereichST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922); match(VON);
			setState(923); match(WS);
			{
			setState(924); ((BereichSTContext)_localctx).registerST = registerST();
			((BereichSTContext)_localctx).start =  ((BereichSTContext)_localctx).registerST.reg;
			}
			setState(927); match(WS);
			setState(928); match(BIS);
			setState(929); match(WS);
			{
			setState(930); ((BereichSTContext)_localctx).registerST = registerST();
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
		enterRule(_localctx, 166, RULE_stapelST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933); match(STAPEL);
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
		enterRule(_localctx, 168, RULE_nehmeST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935); match(NEHME);
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
		enterRule(_localctx, 170, RULE_zahlST);
		boolean negieren = false;
		int _la;
		try {
			setState(946);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(939);
				_la = _input.LA(1);
				if (_la==NAGATION) {
					{
					setState(937); match(NAGATION);
					negieren = true;
					}
				}

				setState(941); ((ZahlSTContext)_localctx).POS_ZAHL = match(POS_ZAHL);
				((ZahlSTContext)_localctx).zahl =  new Zahl(- Long.parseLong(((ZahlSTContext)_localctx).POS_ZAHL.getText()));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(943); ((ZahlSTContext)_localctx).posZahlST = posZahlST();
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
		enterRule(_localctx, 172, RULE_posZahlST);
		try {
			setState(956);
			switch (_input.LA(1)) {
			case POS_ZAHL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(948); ((PosZahlSTContext)_localctx).POS_ZAHL = match(POS_ZAHL);
				((PosZahlSTContext)_localctx).zahl =  new Zahl(Long.parseLong(((PosZahlSTContext)_localctx).POS_ZAHL.getText()));
				}
				}
				break;
			case ERGEBNISSPEICHER:
			case ERGEBNIS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(950); ergebnisST();
				((PosZahlSTContext)_localctx).zahl =  new Zahl(true);
				}
				}
				break;
			case ZWISCHEN:
			case ZWISCHENSPEICHER:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(953); zwischenST();
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
		enterRule(_localctx, 174, RULE_fehlerST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(958);
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
		enterRule(_localctx, 176, RULE_versionST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960); match(VERSION);
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
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public TerminalNode GRÖẞE() { return getToken(TPS_ANTLRParser.GRÖẞE, 0); }
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
		enterRule(_localctx, 178, RULE_stapelMaxGrST);
		try {
			setState(972);
			switch (_input.LA(1)) {
			case MAXIMALE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(962); match(MAXIMALE);
				setState(963); match(WS);
				setState(964); match(STAPEL);
				setState(965); match(WS);
				setState(966); match(GRÖẞE);
				}
				}
				break;
			case STAPEL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(967); match(STAPEL);
				setState(968); match(WS);
				setState(969); match(MAXIMUM);
				setState(970); match(WS);
				setState(971); match(GRÖẞE);
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
		enterRule(_localctx, 180, RULE_stapelGrST);
		try {
			setState(987);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(974); match(STAPEL);
				setState(975); match(WS);
				setState(976); match(GRÖẞE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(977); match(GRÖẞE);
				setState(978); match(WS);
				setState(979); match(DES);
				setState(980); match(WS);
				setState(981); match(STAPELS);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(982); match(GRÖẞE);
				setState(983); match(WS);
				setState(984); match(VOM);
				setState(985); match(WS);
				setState(986); match(STAPEL);
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
		enterRule(_localctx, 182, RULE_derST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989); match(DER);
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
		enterRule(_localctx, 184, RULE_wft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			switch (_input.LA(1)) {
			case STELLE_WORT:
				{
				setState(991); ((WftContext)_localctx).tok = match(STELLE_WORT);
				}
				break;
			case DER:
				{
				setState(992); ((WftContext)_localctx).tok = match(DER);
				}
				break;
			case WORTREIHE_WORT:
				{
				setState(993); ((WftContext)_localctx).tok = match(WORTREIHE_WORT);
				}
				break;
			case WORTKETTE_WORT:
				{
				setState(994); ((WftContext)_localctx).tok = match(WORTKETTE_WORT);
				}
				break;
			case WORTFOLGE_WORT:
				{
				setState(995); ((WftContext)_localctx).tok = match(WORTFOLGE_WORT);
				}
				break;
			case LETZTEN:
				{
				setState(996); ((WftContext)_localctx).tok = match(LETZTEN);
				}
				break;
			case ZEICHEN:
				{
				setState(997); ((WftContext)_localctx).tok = match(ZEICHEN);
				}
				break;
			case ZEICHENFOLGE:
				{
				setState(998); ((WftContext)_localctx).tok = match(ZEICHENFOLGE);
				}
				break;
			case ZEICHENKETTE:
				{
				setState(999); ((WftContext)_localctx).tok = match(ZEICHENKETTE);
				}
				break;
			case WORT_WORT:
				{
				setState(1000); ((WftContext)_localctx).tok = match(WORT_WORT);
				}
				break;
			case MENGE:
				{
				setState(1001); ((WftContext)_localctx).tok = match(MENGE);
				}
				break;
			case ANZAHL:
				{
				setState(1002); ((WftContext)_localctx).tok = match(ANZAHL);
				}
				break;
			case ZAHL_WORT:
				{
				setState(1003); ((WftContext)_localctx).tok = match(ZAHL_WORT);
				}
				break;
			case EINESEN:
				{
				setState(1004); ((WftContext)_localctx).tok = match(EINESEN);
				}
				break;
			case EIN:
				{
				setState(1005); ((WftContext)_localctx).tok = match(EIN);
				}
				break;
			case LESE:
				{
				setState(1006); ((WftContext)_localctx).tok = match(LESE);
				}
				break;
			case ODER:
				{
				setState(1007); ((WftContext)_localctx).tok = match(ODER);
				}
				break;
			case KLEINER:
				{
				setState(1008); ((WftContext)_localctx).tok = match(KLEINER);
				}
				break;
			case GRÖẞER:
				{
				setState(1009); ((WftContext)_localctx).tok = match(GRÖẞER);
				}
				break;
			case UNGLEICH:
				{
				setState(1010); ((WftContext)_localctx).tok = match(UNGLEICH);
				}
				break;
			case NICHT:
				{
				setState(1011); ((WftContext)_localctx).tok = match(NICHT);
				}
				break;
			case GLEICH:
				{
				setState(1012); ((WftContext)_localctx).tok = match(GLEICH);
				}
				break;
			case FALLS:
				{
				setState(1013); ((WftContext)_localctx).tok = match(FALLS);
				}
				break;
			case WENN:
				{
				setState(1014); ((WftContext)_localctx).tok = match(WENN);
				}
				break;
			case DES:
				{
				setState(1015); ((WftContext)_localctx).tok = match(DES);
				}
				break;
			case STAPELS:
				{
				setState(1016); ((WftContext)_localctx).tok = match(STAPELS);
				}
				break;
			case VOM:
				{
				setState(1017); ((WftContext)_localctx).tok = match(VOM);
				}
				break;
			case MAXIMALE:
				{
				setState(1018); ((WftContext)_localctx).tok = match(MAXIMALE);
				}
				break;
			case GRÖẞE:
				{
				setState(1019); ((WftContext)_localctx).tok = match(GRÖẞE);
				}
				break;
			case MAXIMUM:
				{
				setState(1020); ((WftContext)_localctx).tok = match(MAXIMUM);
				}
				break;
			case VERSION:
				{
				setState(1021); ((WftContext)_localctx).tok = match(VERSION);
				}
				break;
			case FEHLER:
				{
				setState(1022); ((WftContext)_localctx).tok = match(FEHLER);
				}
				break;
			case FALSCH:
				{
				setState(1023); ((WftContext)_localctx).tok = match(FALSCH);
				}
				break;
			case NAGATION:
				{
				setState(1024); ((WftContext)_localctx).tok = match(NAGATION);
				}
				break;
			case NEHME:
				{
				setState(1025); ((WftContext)_localctx).tok = match(NEHME);
				}
				break;
			case STAPEL:
				{
				setState(1026); ((WftContext)_localctx).tok = match(STAPEL);
				}
				break;
			case POS_ZAHL:
				{
				setState(1027); ((WftContext)_localctx).tok = match(POS_ZAHL);
				}
				break;
			case REGISTER:
				{
				setState(1028); ((WftContext)_localctx).tok = match(REGISTER);
				}
				break;
			case BIS:
				{
				setState(1029); ((WftContext)_localctx).tok = match(BIS);
				}
				break;
			case ERGEBNISSPEICHER:
				{
				setState(1030); ((WftContext)_localctx).tok = match(ERGEBNISSPEICHER);
				}
				break;
			case ERGEBNIS:
				{
				setState(1031); ((WftContext)_localctx).tok = match(ERGEBNIS);
				}
				break;
			case ZWISCHEN:
				{
				setState(1032); ((WftContext)_localctx).tok = match(ZWISCHEN);
				}
				break;
			case ZWISCHENSPEICHER:
				{
				setState(1033); ((WftContext)_localctx).tok = match(ZWISCHENSPEICHER);
				}
				break;
			case SPEICHERE:
				{
				setState(1034); ((WftContext)_localctx).tok = match(SPEICHERE);
				}
				break;
			case GEHE:
				{
				setState(1035); ((WftContext)_localctx).tok = match(GEHE);
				}
				break;
			case ZURÜCKGEHEN:
				{
				setState(1036); ((WftContext)_localctx).tok = match(ZURÜCKGEHEN);
				}
				break;
			case ZURÜCK:
				{
				setState(1037); ((WftContext)_localctx).tok = match(ZURÜCK);
				}
				break;
			case AUF:
				{
				setState(1038); ((WftContext)_localctx).tok = match(AUF);
				}
				break;
			case AUFRUF:
				{
				setState(1039); ((WftContext)_localctx).tok = match(AUFRUF);
				}
				break;
			case MACHE:
				{
				setState(1040); ((WftContext)_localctx).tok = match(MACHE);
				}
				break;
			case RUFE:
				{
				setState(1041); ((WftContext)_localctx).tok = match(RUFE);
				}
				break;
			case DP:
				{
				setState(1042); ((WftContext)_localctx).tok = match(DP);
				}
				break;
			case SPRINGE:
				{
				setState(1043); ((WftContext)_localctx).tok = match(SPRINGE);
				}
				break;
			case VERGLEICHE:
				{
				setState(1044); ((WftContext)_localctx).tok = match(VERGLEICHE);
				}
				break;
			case DIVIDIERE:
				{
				setState(1045); ((WftContext)_localctx).tok = match(DIVIDIERE);
				}
				break;
			case MULTIPLIZIERE:
				{
				setState(1046); ((WftContext)_localctx).tok = match(MULTIPLIZIERE);
				}
				break;
			case SUBTRAHIERE:
				{
				setState(1047); ((WftContext)_localctx).tok = match(SUBTRAHIERE);
				}
				break;
			case ADDIERE:
				{
				setState(1048); ((WftContext)_localctx).tok = match(ADDIERE);
				}
				break;
			case ZEILENUMBRUCH:
				{
				setState(1049); ((WftContext)_localctx).tok = match(ZEILENUMBRUCH);
				}
				break;
			case LEERZEILE:
				{
				setState(1050); ((WftContext)_localctx).tok = match(LEERZEILE);
				}
				break;
			case LEERTASTE:
				{
				setState(1051); ((WftContext)_localctx).tok = match(LEERTASTE);
				}
				break;
			case LEERZEICHEN:
				{
				setState(1052); ((WftContext)_localctx).tok = match(LEERZEICHEN);
				}
				break;
			case AUS:
				{
				setState(1053); ((WftContext)_localctx).tok = match(AUS);
				}
				break;
			case AUSGEBEN:
				{
				setState(1054); ((WftContext)_localctx).tok = match(AUSGEBEN);
				}
				break;
			case GEBE:
				{
				setState(1055); ((WftContext)_localctx).tok = match(GEBE);
				}
				break;
			case FOLGENDES:
				{
				setState(1056); ((WftContext)_localctx).tok = match(FOLGENDES);
				}
				break;
			case VON:
				{
				setState(1057); ((WftContext)_localctx).tok = match(VON);
				}
				break;
			case ZU:
				{
				setState(1058); ((WftContext)_localctx).tok = match(ZU);
				}
				break;
			case GAB:
				{
				setState(1059); ((WftContext)_localctx).tok = match(GAB);
				}
				break;
			case WAR:
				{
				setState(1060); ((WftContext)_localctx).tok = match(WAR);
				}
				break;
			case MIT:
				{
				setState(1061); ((WftContext)_localctx).tok = match(MIT);
				}
				break;
			case IST:
				{
				setState(1062); ((WftContext)_localctx).tok = match(IST);
				}
				break;
			case HIER:
				{
				setState(1063); ((WftContext)_localctx).tok = match(HIER);
				}
				break;
			case STELLE:
				{
				setState(1064); ((WftContext)_localctx).tok = match(STELLE);
				}
				break;
			case REST:
				{
				setState(1065); ((WftContext)_localctx).tok = match(REST);
				}
				break;
			case REST_2:
				{
				setState(1066); ((WftContext)_localctx).tok = match(REST_2);
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

	public static class WortfolgeSTALTContext extends ParserRuleContext {
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
		public WortfolgeSTALTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wortfolgeSTALT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterWortfolgeSTALT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitWortfolgeSTALT(this);
		}
	}

	public final WortfolgeSTALTContext wortfolgeSTALT() throws RecognitionException {
		WortfolgeSTALTContext _localctx = new WortfolgeSTALTContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_wortfolgeSTALT);
		StringBuilder wf = new StringBuilder();
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1081); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1076);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STELLE_WORT) | (1L << DER) | (1L << WORTREIHE_WORT) | (1L << WORTKETTE_WORT) | (1L << WORTFOLGE_WORT) | (1L << LETZTEN) | (1L << ZEICHEN) | (1L << ZEICHENFOLGE) | (1L << ZEICHENKETTE) | (1L << WORT_WORT) | (1L << MENGE) | (1L << ANZAHL) | (1L << ZAHL_WORT) | (1L << EINESEN) | (1L << EIN) | (1L << LESE) | (1L << ODER) | (1L << KLEINER) | (1L << GRÖẞER) | (1L << UNGLEICH) | (1L << NICHT) | (1L << GLEICH) | (1L << FALLS) | (1L << WENN) | (1L << DES) | (1L << STAPELS) | (1L << VOM) | (1L << MAXIMALE) | (1L << GRÖẞE) | (1L << MAXIMUM) | (1L << VERSION) | (1L << FEHLER) | (1L << FALSCH) | (1L << NAGATION) | (1L << NEHME) | (1L << STAPEL) | (1L << POS_ZAHL) | (1L << REGISTER) | (1L << BIS) | (1L << ERGEBNISSPEICHER) | (1L << ERGEBNIS) | (1L << ZWISCHEN) | (1L << ZWISCHENSPEICHER) | (1L << SPEICHERE) | (1L << GEHE) | (1L << ZURÜCKGEHEN) | (1L << ZURÜCK) | (1L << AUF) | (1L << AUFRUF) | (1L << MACHE) | (1L << RUFE) | (1L << DP) | (1L << SPRINGE) | (1L << VERGLEICHE) | (1L << DIVIDIERE) | (1L << MULTIPLIZIERE) | (1L << SUBTRAHIERE) | (1L << ADDIERE) | (1L << ZEILENUMBRUCH) | (1L << LEERZEILE) | (1L << LEERTASTE) | (1L << LEERZEICHEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AUS - 64)) | (1L << (AUSGEBEN - 64)) | (1L << (GEBE - 64)) | (1L << (FOLGENDES - 64)) | (1L << (VON - 64)) | (1L << (ZU - 64)) | (1L << (GAB - 64)) | (1L << (WAR - 64)) | (1L << (MIT - 64)) | (1L << (IST - 64)) | (1L << (HIER - 64)) | (1L << (STELLE - 64)) | (1L << (REST - 64)) | (1L << (REST_2 - 64)))) != 0)) {
						{
						{
						setState(1071); ((WortfolgeSTALTContext)_localctx).wft = wft();
						wf.append(((WortfolgeSTALTContext)_localctx).wft.teil);
						}
						}
						setState(1078);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1079); match(WS);
					wf.append(' ');
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1083); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1085); ((WortfolgeSTALTContext)_localctx).wft = wft();
			wf.append(((WortfolgeSTALTContext)_localctx).wft.teil);
			((WortfolgeSTALTContext)_localctx).wortfolge =  wf.toString();
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
		enterRule(_localctx, 188, RULE_wortfolgeST);
		StringBuilder wf = new StringBuilder();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1089); ((WortfolgeSTContext)_localctx).wft = wft();
				wf.append(((WortfolgeSTContext)_localctx).wft.teil);
				setState(1093);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(1091); match(WS);
					wf.append(' ');
					}
					break;
				}
				}
				}
				setState(1097); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STELLE_WORT) | (1L << DER) | (1L << WORTREIHE_WORT) | (1L << WORTKETTE_WORT) | (1L << WORTFOLGE_WORT) | (1L << LETZTEN) | (1L << ZEICHEN) | (1L << ZEICHENFOLGE) | (1L << ZEICHENKETTE) | (1L << WORT_WORT) | (1L << MENGE) | (1L << ANZAHL) | (1L << ZAHL_WORT) | (1L << EINESEN) | (1L << EIN) | (1L << LESE) | (1L << ODER) | (1L << KLEINER) | (1L << GRÖẞER) | (1L << UNGLEICH) | (1L << NICHT) | (1L << GLEICH) | (1L << FALLS) | (1L << WENN) | (1L << DES) | (1L << STAPELS) | (1L << VOM) | (1L << MAXIMALE) | (1L << GRÖẞE) | (1L << MAXIMUM) | (1L << VERSION) | (1L << FEHLER) | (1L << FALSCH) | (1L << NAGATION) | (1L << NEHME) | (1L << STAPEL) | (1L << POS_ZAHL) | (1L << REGISTER) | (1L << BIS) | (1L << ERGEBNISSPEICHER) | (1L << ERGEBNIS) | (1L << ZWISCHEN) | (1L << ZWISCHENSPEICHER) | (1L << SPEICHERE) | (1L << GEHE) | (1L << ZURÜCKGEHEN) | (1L << ZURÜCK) | (1L << AUF) | (1L << AUFRUF) | (1L << MACHE) | (1L << RUFE) | (1L << DP) | (1L << SPRINGE) | (1L << VERGLEICHE) | (1L << DIVIDIERE) | (1L << MULTIPLIZIERE) | (1L << SUBTRAHIERE) | (1L << ADDIERE) | (1L << ZEILENUMBRUCH) | (1L << LEERZEILE) | (1L << LEERTASTE) | (1L << LEERZEICHEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AUS - 64)) | (1L << (AUSGEBEN - 64)) | (1L << (GEBE - 64)) | (1L << (FOLGENDES - 64)) | (1L << (VON - 64)) | (1L << (ZU - 64)) | (1L << (GAB - 64)) | (1L << (WAR - 64)) | (1L << (MIT - 64)) | (1L << (IST - 64)) | (1L << (HIER - 64)) | (1L << (STELLE - 64)) | (1L << (REST - 64)) | (1L << (REST_2 - 64)))) != 0) );
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
		enterRule(_localctx, 190, RULE_wennST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			_la = _input.LA(1);
			if ( !(_la==FALLS || _la==WENN) ) {
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
		enterRule(_localctx, 192, RULE_ungleichST);
		try {
			setState(1107);
			switch (_input.LA(1)) {
			case UNGLEICH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103); match(UNGLEICH);
				}
				break;
			case NICHT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1104); match(NICHT);
				setState(1105); match(WS);
				setState(1106); match(GLEICH);
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
		enterRule(_localctx, 194, RULE_gleichST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109); match(GLEICH);
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
		enterRule(_localctx, 196, RULE_größerST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111); match(GRÖẞER);
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
		enterRule(_localctx, 198, RULE_kleinerST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1113); match(KLEINER);
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
		enterRule(_localctx, 200, RULE_größerGleichST);
		try {
			setState(1125);
			switch (_input.LA(1)) {
			case GRÖẞER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1115); match(GRÖẞER);
				setState(1116); match(WS);
				setState(1117); match(ODER);
				setState(1118); match(WS);
				setState(1119); match(GLEICH);
				}
				}
				break;
			case GLEICH:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1120); match(GLEICH);
				setState(1121); match(WS);
				setState(1122); match(ODER);
				setState(1123); match(WS);
				setState(1124); match(GRÖẞER);
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
		enterRule(_localctx, 202, RULE_kleinerGleichST);
		try {
			setState(1137);
			switch (_input.LA(1)) {
			case KLEINER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1127); match(KLEINER);
				setState(1128); match(WS);
				setState(1129); match(ODER);
				setState(1130); match(WS);
				setState(1131); match(GLEICH);
				}
				}
				break;
			case GLEICH:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1132); match(GLEICH);
				setState(1133); match(WS);
				setState(1134); match(ODER);
				setState(1135); match(WS);
				setState(1136); match(KLEINER);
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
		enterRule(_localctx, 204, RULE_einlesenST);
		try {
			setState(1143);
			switch (_input.LA(1)) {
			case LESE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1139); match(LESE);
				setState(1140); match(WS);
				setState(1141); match(EIN);
				}
				}
				break;
			case EINESEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1142); match(EINESEN);
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
		enterRule(_localctx, 206, RULE_zahlST_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145); match(ZAHL_WORT);
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
		enterRule(_localctx, 208, RULE_registerST_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147); match(REGISTER);
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
		enterRule(_localctx, 210, RULE_anzahlST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
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
		enterRule(_localctx, 212, RULE_wortST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
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
		enterRule(_localctx, 214, RULE_zeichenST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153); match(ZEICHEN);
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
		enterRule(_localctx, 216, RULE_letztenFehlerST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155); match(LETZTEN);
			setState(1156); match(WS);
			setState(1157); match(FEHLER);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Q\u048a\4\2\t\2\4"+
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
		"k\4l\tl\4m\tm\4n\tn\3\2\3\2\5\2\u00df\n\2\3\2\3\2\6\2\u00e3\n\2\r\2\16"+
		"\2\u00e4\3\3\3\3\3\3\5\3\u00ea\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0153\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\5\64\u0306\n\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\39\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\5C"+
		"\u0359\nC\3D\3D\3D\3D\5D\u035f\nD\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J"+
		"\3K\3K\3L\3L\3L\3L\5L\u0373\nL\3M\3M\5M\u0377\nM\3M\5M\u037a\nM\3M\3M"+
		"\3M\3M\3N\3N\3N\3N\3N\3N\5N\u0386\nN\3O\3O\3O\3O\5O\u038c\nO\3P\3P\3Q"+
		"\3Q\3R\3R\3S\3S\3S\3S\5S\u0398\nS\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T"+
		"\3T\3T\3U\3U\3V\3V\3W\3W\5W\u03ae\nW\3W\3W\3W\3W\3W\5W\u03b5\nW\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\5X\u03bf\nX\3Y\3Y\3Z\3Z\3[\3[\3[\3[\3[\3[\3[\3[\3["+
		"\3[\5[\u03cf\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5"+
		"\\\u03de\n\\\3]\3]\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^"+
		"\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u042e\n^\3^\3^\3_\3_\3_\7_"+
		"\u0435\n_\f_\16_\u0438\13_\3_\3_\6_\u043c\n_\r_\16_\u043d\3_\3_\3_\3_"+
		"\3`\3`\3`\3`\5`\u0448\n`\6`\u044a\n`\r`\16`\u044b\3`\3`\3a\3a\3b\3b\3"+
		"b\3b\5b\u0456\nb\3c\3c\3d\3d\3e\3e\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0468"+
		"\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u0474\ng\3h\3h\3h\3h\5h\u047a\nh"+
		"\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3n\3n\3n\2\2o\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\2\21"+
		"\3\2IJ\3\2GH\4\2\36\36FF\3\2@A\3\2>?\3\2==\3\2<<\3\2;;\3\2::\3\2-.\3\2"+
		"+,\3\2#$\3\2\32\33\3\2\16\17\3\2\13\r\u04b9\2\u00e2\3\2\2\2\4\u00e6\3"+
		"\2\2\2\6\u0152\3\2\2\2\b\u0154\3\2\2\2\n\u0158\3\2\2\2\f\u0165\3\2\2\2"+
		"\16\u0170\3\2\2\2\20\u017a\3\2\2\2\22\u0184\3\2\2\2\24\u018d\3\2\2\2\26"+
		"\u0194\3\2\2\2\30\u0196\3\2\2\2\32\u01a1\3\2\2\2\34\u01ac\3\2\2\2\36\u01b7"+
		"\3\2\2\2 \u01c2\3\2\2\2\"\u01cd\3\2\2\2$\u01d8\3\2\2\2&\u01df\3\2\2\2"+
		"(\u01ea\3\2\2\2*\u01f2\3\2\2\2,\u01fa\3\2\2\2.\u0203\3\2\2\2\60\u020b"+
		"\3\2\2\2\62\u0214\3\2\2\2\64\u021c\3\2\2\2\66\u0224\3\2\2\28\u022c\3\2"+
		"\2\2:\u0235\3\2\2\2<\u023d\3\2\2\2>\u024a\3\2\2\2@\u0255\3\2\2\2B\u025e"+
		"\3\2\2\2D\u0263\3\2\2\2F\u026b\3\2\2\2H\u0273\3\2\2\2J\u027c\3\2\2\2L"+
		"\u0285\3\2\2\2N\u028e\3\2\2\2P\u0296\3\2\2\2R\u029e\3\2\2\2T\u02a5\3\2"+
		"\2\2V\u02ac\3\2\2\2X\u02b7\3\2\2\2Z\u02c2\3\2\2\2\\\u02cd\3\2\2\2^\u02d8"+
		"\3\2\2\2`\u02e3\3\2\2\2b\u02ee\3\2\2\2d\u02f5\3\2\2\2f\u0300\3\2\2\2h"+
		"\u030a\3\2\2\2j\u0311\3\2\2\2l\u0315\3\2\2\2n\u0319\3\2\2\2p\u031e\3\2"+
		"\2\2r\u0329\3\2\2\2t\u0334\3\2\2\2v\u033f\3\2\2\2x\u034a\3\2\2\2z\u034c"+
		"\3\2\2\2|\u034e\3\2\2\2~\u0350\3\2\2\2\u0080\u0352\3\2\2\2\u0082\u0354"+
		"\3\2\2\2\u0084\u0356\3\2\2\2\u0086\u035e\3\2\2\2\u0088\u0360\3\2\2\2\u008a"+
		"\u0362\3\2\2\2\u008c\u0364\3\2\2\2\u008e\u0366\3\2\2\2\u0090\u0368\3\2"+
		"\2\2\u0092\u036a\3\2\2\2\u0094\u036c\3\2\2\2\u0096\u0372\3\2\2\2\u0098"+
		"\u0374\3\2\2\2\u009a\u0385\3\2\2\2\u009c\u038b\3\2\2\2\u009e\u038d\3\2"+
		"\2\2\u00a0\u038f\3\2\2\2\u00a2\u0391\3\2\2\2\u00a4\u0393\3\2\2\2\u00a6"+
		"\u039c\3\2\2\2\u00a8\u03a7\3\2\2\2\u00aa\u03a9\3\2\2\2\u00ac\u03b4\3\2"+
		"\2\2\u00ae\u03be\3\2\2\2\u00b0\u03c0\3\2\2\2\u00b2\u03c2\3\2\2\2\u00b4"+
		"\u03ce\3\2\2\2\u00b6\u03dd\3\2\2\2\u00b8\u03df\3\2\2\2\u00ba\u042d\3\2"+
		"\2\2\u00bc\u043b\3\2\2\2\u00be\u0449\3\2\2\2\u00c0\u044f\3\2\2\2\u00c2"+
		"\u0455\3\2\2\2\u00c4\u0457\3\2\2\2\u00c6\u0459\3\2\2\2\u00c8\u045b\3\2"+
		"\2\2\u00ca\u0467\3\2\2\2\u00cc\u0473\3\2\2\2\u00ce\u0479\3\2\2\2\u00d0"+
		"\u047b\3\2\2\2\u00d2\u047d\3\2\2\2\u00d4\u047f\3\2\2\2\u00d6\u0481\3\2"+
		"\2\2\u00d8\u0483\3\2\2\2\u00da\u0485\3\2\2\2\u00dc\u00de\5\4\3\2\u00dd"+
		"\u00df\7\3\2\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e1\b\2\1\2\u00e1\u00e3\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\3\3\2\2\2"+
		"\u00e6\u00e7\b\3\1\2\u00e7\u00e9\5\6\4\2\u00e8\u00ea\7\3\2\2\u00e9\u00e8"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7N\2\2\u00ec"+
		"\u00ed\b\3\1\2\u00ed\5\3\2\2\2\u00ee\u00ef\5v<\2\u00ef\u00f0\b\4\1\2\u00f0"+
		"\u0153\3\2\2\2\u00f1\u00f2\5t;\2\u00f2\u00f3\b\4\1\2\u00f3\u0153\3\2\2"+
		"\2\u00f4\u00f5\5p9\2\u00f5\u00f6\b\4\1\2\u00f6\u0153\3\2\2\2\u00f7\u00f8"+
		"\5r:\2\u00f8\u00f9\b\4\1\2\u00f9\u0153\3\2\2\2\u00fa\u00fb\5n8\2\u00fb"+
		"\u00fc\b\4\1\2\u00fc\u0153\3\2\2\2\u00fd\u00fe\5l\67\2\u00fe\u00ff\b\4"+
		"\1\2\u00ff\u0153\3\2\2\2\u0100\u0101\5j\66\2\u0101\u0102\b\4\1\2\u0102"+
		"\u0153\3\2\2\2\u0103\u0104\5h\65\2\u0104\u0105\b\4\1\2\u0105\u0153\3\2"+
		"\2\2\u0106\u0107\5f\64\2\u0107\u0108\b\4\1\2\u0108\u0153\3\2\2\2\u0109"+
		"\u010a\5d\63\2\u010a\u010b\b\4\1\2\u010b\u0153\3\2\2\2\u010c\u010d\5b"+
		"\62\2\u010d\u010e\b\4\1\2\u010e\u0153\3\2\2\2\u010f\u0110\5^\60\2\u0110"+
		"\u0111\b\4\1\2\u0111\u0153\3\2\2\2\u0112\u0113\5`\61\2\u0113\u0114\b\4"+
		"\1\2\u0114\u0153\3\2\2\2\u0115\u0116\5\\/\2\u0116\u0117\b\4\1\2\u0117"+
		"\u0153\3\2\2\2\u0118\u0119\5Z.\2\u0119\u011a\b\4\1\2\u011a\u0153\3\2\2"+
		"\2\u011b\u011c\5X-\2\u011c\u011d\b\4\1\2\u011d\u0153\3\2\2\2\u011e\u011f"+
		"\5V,\2\u011f\u0120\b\4\1\2\u0120\u0153\3\2\2\2\u0121\u0122\5T+\2\u0122"+
		"\u0123\b\4\1\2\u0123\u0153\3\2\2\2\u0124\u0125\5R*\2\u0125\u0126\b\4\1"+
		"\2\u0126\u0153\3\2\2\2\u0127\u0128\5P)\2\u0128\u0129\b\4\1\2\u0129\u0153"+
		"\3\2\2\2\u012a\u012b\5N(\2\u012b\u012c\b\4\1\2\u012c\u0153\3\2\2\2\u012d"+
		"\u012e\5L\'\2\u012e\u012f\b\4\1\2\u012f\u0153\3\2\2\2\u0130\u0153\5J&"+
		"\2\u0131\u0153\5H%\2\u0132\u0153\5F$\2\u0133\u0153\5D#\2\u0134\u0153\5"+
		"B\"\2\u0135\u0153\5@!\2\u0136\u0153\5> \2\u0137\u0153\5<\37\2\u0138\u0153"+
		"\5:\36\2\u0139\u0153\5\66\34\2\u013a\u0153\58\35\2\u013b\u0153\5\64\33"+
		"\2\u013c\u0153\5\62\32\2\u013d\u0153\5\60\31\2\u013e\u0153\5.\30\2\u013f"+
		"\u0153\5*\26\2\u0140\u0153\5,\27\2\u0141\u0153\5(\25\2\u0142\u0153\5&"+
		"\24\2\u0143\u0153\5$\23\2\u0144\u0153\5\"\22\2\u0145\u0153\5 \21\2\u0146"+
		"\u0153\5\36\20\2\u0147\u0153\5\34\17\2\u0148\u0153\5\32\16\2\u0149\u0153"+
		"\5\30\r\2\u014a\u0153\5\26\f\2\u014b\u0153\5\24\13\2\u014c\u0153\5\22"+
		"\n\2\u014d\u0153\5\20\t\2\u014e\u0153\5\16\b\2\u014f\u0153\5\f\7\2\u0150"+
		"\u0153\5\n\6\2\u0151\u0153\5\b\5\2\u0152\u00ee\3\2\2\2\u0152\u00f1\3\2"+
		"\2\2\u0152\u00f4\3\2\2\2\u0152\u00f7\3\2\2\2\u0152\u00fa\3\2\2\2\u0152"+
		"\u00fd\3\2\2\2\u0152\u0100\3\2\2\2\u0152\u0103\3\2\2\2\u0152\u0106\3\2"+
		"\2\2\u0152\u0109\3\2\2\2\u0152\u010c\3\2\2\2\u0152\u010f\3\2\2\2\u0152"+
		"\u0112\3\2\2\2\u0152\u0115\3\2\2\2\u0152\u0118\3\2\2\2\u0152\u011b\3\2"+
		"\2\2\u0152\u011e\3\2\2\2\u0152\u0121\3\2\2\2\u0152\u0124\3\2\2\2\u0152"+
		"\u0127\3\2\2\2\u0152\u012a\3\2\2\2\u0152\u012d\3\2\2\2\u0152\u0130\3\2"+
		"\2\2\u0152\u0131\3\2\2\2\u0152\u0132\3\2\2\2\u0152\u0133\3\2\2\2\u0152"+
		"\u0134\3\2\2\2\u0152\u0135\3\2\2\2\u0152\u0136\3\2\2\2\u0152\u0137\3\2"+
		"\2\2\u0152\u0138\3\2\2\2\u0152\u0139\3\2\2\2\u0152\u013a\3\2\2\2\u0152"+
		"\u013b\3\2\2\2\u0152\u013c\3\2\2\2\u0152\u013d\3\2\2\2\u0152\u013e\3\2"+
		"\2\2\u0152\u013f\3\2\2\2\u0152\u0140\3\2\2\2\u0152\u0141\3\2\2\2\u0152"+
		"\u0142\3\2\2\2\u0152\u0143\3\2\2\2\u0152\u0144\3\2\2\2\u0152\u0145\3\2"+
		"\2\2\u0152\u0146\3\2\2\2\u0152\u0147\3\2\2\2\u0152\u0148\3\2\2\2\u0152"+
		"\u0149\3\2\2\2\u0152\u014a\3\2\2\2\u0152\u014b\3\2\2\2\u0152\u014c\3\2"+
		"\2\2\u0152\u014d\3\2\2\2\u0152\u014e\3\2\2\2\u0152\u014f\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\7\3\2\2\2\u0154\u0155\5\u00aa"+
		"V\2\u0155\u0156\7\3\2\2\u0156\u0157\5\u00dan\2\u0157\t\3\2\2\2\u0158\u0159"+
		"\5\u00c0a\2\u0159\u015a\7\3\2\2\u015a\u015b\5\u00b0Y\2\u015b\u015c\7\3"+
		"\2\2\u015c\u015d\5~@\2\u015d\u015e\7\3\2\2\u015e\u015f\5\u009aN\2\u015f"+
		"\u0160\7\3\2\2\u0160\u0161\5\u0080A\2\u0161\u0162\7\3\2\2\u0162\u0163"+
		"\5\u0098M\2\u0163\u0164\b\6\1\2\u0164\13\3\2\2\2\u0165\u0166\5\u00aaV"+
		"\2\u0166\u0167\7\3\2\2\u0167\u0168\5\u0082B\2\u0168\u0169\7\3\2\2\u0169"+
		"\u016a\5\u00a8U\2\u016a\u016b\7\3\2\2\u016b\u016c\5\u0080A\2\u016c\u016d"+
		"\7\3\2\2\u016d\u016e\5\u00a4S\2\u016e\u016f\b\7\1\2\u016f\r\3\2\2\2\u0170"+
		"\u0171\5\u00aaV\2\u0171\u0172\7\3\2\2\u0172\u0173\5\u0082B\2\u0173\u0174"+
		"\7\3\2\2\u0174\u0175\5\u00a8U\2\u0175\u0176\7\3\2\2\u0176\u0177\5\u0080"+
		"A\2\u0177\u0178\7\3\2\2\u0178\u0179\5\u00a0Q\2\u0179\17\3\2\2\2\u017a"+
		"\u017b\5\u00aaV\2\u017b\u017c\7\3\2\2\u017c\u017d\5\u0082B\2\u017d\u017e"+
		"\7\3\2\2\u017e\u017f\5\u00a8U\2\u017f\u0180\7\3\2\2\u0180\u0181\5\u0080"+
		"A\2\u0181\u0182\7\3\2\2\u0182\u0183\5\u00a2R\2\u0183\21\3\2\2\2\u0184"+
		"\u0185\5\u009eP\2\u0185\u0186\7\3\2\2\u0186\u0187\5\u00acW\2\u0187\u0188"+
		"\7\3\2\2\u0188\u0189\5\u0080A\2\u0189\u018a\7\3\2\2\u018a\u018b\5\u00a8"+
		"U\2\u018b\u018c\b\n\1\2\u018c\23\3\2\2\2\u018d\u018e\5\u009aN\2\u018e"+
		"\u018f\7\3\2\2\u018f\u0190\5\u0080A\2\u0190\u0191\7\3\2\2\u0191\u0192"+
		"\5\u00aeX\2\u0192\u0193\b\13\1\2\u0193\25\3\2\2\2\u0194\u0195\5\u009c"+
		"O\2\u0195\27\3\2\2\2\u0196\u0197\5\u00c0a\2\u0197\u0198\7\3\2\2\u0198"+
		"\u0199\5\u00caf\2\u0199\u019a\7\3\2\2\u019a\u019b\5\u009aN\2\u019b\u019c"+
		"\7\3\2\2\u019c\u019d\5\u0080A\2\u019d\u019e\7\3\2\2\u019e\u019f\5\u0098"+
		"M\2\u019f\u01a0\b\r\1\2\u01a0\31\3\2\2\2\u01a1\u01a2\5\u00c0a\2\u01a2"+
		"\u01a3\7\3\2\2\u01a3\u01a4\5\u00ccg\2\u01a4\u01a5\7\3\2\2\u01a5\u01a6"+
		"\5\u009aN\2\u01a6\u01a7\7\3\2\2\u01a7\u01a8\5\u0080A\2\u01a8\u01a9\7\3"+
		"\2\2\u01a9\u01aa\5\u0098M\2\u01aa\u01ab\b\16\1\2\u01ab\33\3\2\2\2\u01ac"+
		"\u01ad\5\u00c0a\2\u01ad\u01ae\7\3\2\2\u01ae\u01af\5\u00c6d\2\u01af\u01b0"+
		"\7\3\2\2\u01b0\u01b1\5\u009aN\2\u01b1\u01b2\7\3\2\2\u01b2\u01b3\5\u0080"+
		"A\2\u01b3\u01b4\7\3\2\2\u01b4\u01b5\5\u0098M\2\u01b5\u01b6\b\17\1\2\u01b6"+
		"\35\3\2\2\2\u01b7\u01b8\5\u00c0a\2\u01b8\u01b9\7\3\2\2\u01b9\u01ba\5\u00c8"+
		"e\2\u01ba\u01bb\7\3\2\2\u01bb\u01bc\5\u009aN\2\u01bc\u01bd\7\3\2\2\u01bd"+
		"\u01be\5\u0080A\2\u01be\u01bf\7\3\2\2\u01bf\u01c0\5\u0098M\2\u01c0\u01c1"+
		"\b\20\1\2\u01c1\37\3\2\2\2\u01c2\u01c3\5\u00c0a\2\u01c3\u01c4\7\3\2\2"+
		"\u01c4\u01c5\5\u00c2b\2\u01c5\u01c6\7\3\2\2\u01c6\u01c7\5\u009aN\2\u01c7"+
		"\u01c8\7\3\2\2\u01c8\u01c9\5\u0080A\2\u01c9\u01ca\7\3\2\2\u01ca\u01cb"+
		"\5\u0098M\2\u01cb\u01cc\b\21\1\2\u01cc!\3\2\2\2\u01cd\u01ce\5\u00c0a\2"+
		"\u01ce\u01cf\7\3\2\2\u01cf\u01d0\5\u00c4c\2\u01d0\u01d1\7\3\2\2\u01d1"+
		"\u01d2\5\u009aN\2\u01d2\u01d3\7\3\2\2\u01d3\u01d4\5\u0080A\2\u01d4\u01d5"+
		"\7\3\2\2\u01d5\u01d6\5\u0098M\2\u01d6\u01d7\b\22\1\2\u01d7#\3\2\2\2\u01d8"+
		"\u01d9\5\u009aN\2\u01d9\u01da\7\3\2\2\u01da\u01db\5\u0080A\2\u01db\u01dc"+
		"\7\3\2\2\u01dc\u01dd\5\u0098M\2\u01dd\u01de\b\23\1\2\u01de%\3\2\2\2\u01df"+
		"\u01e0\5\u0094K\2\u01e0\u01e1\7\3\2\2\u01e1\u01e2\5\u00a6T\2\u01e2\u01e3"+
		"\7\3\2\2\u01e3\u01e4\5x=\2\u01e4\u01e5\7\3\2\2\u01e5\u01e6\5\u00b8]\2"+
		"\u01e6\u01e7\7\3\2\2\u01e7\u01e8\5\u00be`\2\u01e8\u01e9\b\24\1\2\u01e9"+
		"\'\3\2\2\2\u01ea\u01eb\5\u0094K\2\u01eb\u01ec\7\3\2\2\u01ec\u01ed\5\u00a6"+
		"T\2\u01ed\u01ee\7\3\2\2\u01ee\u01ef\5x=\2\u01ef\u01f0\7\3\2\2\u01f0\u01f1"+
		"\5\u00a6T\2\u01f1)\3\2\2\2\u01f2\u01f3\5\u009eP\2\u01f3\u01f4\7\3\2\2"+
		"\u01f4\u01f5\5\u00b6\\\2\u01f5\u01f6\7\3\2\2\u01f6\u01f7\5\u0080A\2\u01f7"+
		"\u01f8\7\3\2\2\u01f8\u01f9\5\u00a0Q\2\u01f9+\3\2\2\2\u01fa\u01fb\5\u009e"+
		"P\2\u01fb\u01fc\7\3\2\2\u01fc\u01fd\5\u00b6\\\2\u01fd\u01fe\7\3\2\2\u01fe"+
		"\u01ff\5\u0080A\2\u01ff\u0200\7\3\2\2\u0200\u0201\5\u00a4S\2\u0201\u0202"+
		"\b\27\1\2\u0202-\3\2\2\2\u0203\u0204\5\u009eP\2\u0204\u0205\7\3\2\2\u0205"+
		"\u0206\5\u00b6\\\2\u0206\u0207\7\3\2\2\u0207\u0208\5\u0080A\2\u0208\u0209"+
		"\7\3\2\2\u0209\u020a\5\u00a2R\2\u020a/\3\2\2\2\u020b\u020c\5\u009eP\2"+
		"\u020c\u020d\7\3\2\2\u020d\u020e\5\u00b4[\2\u020e\u020f\7\3\2\2\u020f"+
		"\u0210\5\u0080A\2\u0210\u0211\7\3\2\2\u0211\u0212\5\u00a4S\2\u0212\u0213"+
		"\b\31\1\2\u0213\61\3\2\2\2\u0214\u0215\5\u009eP\2\u0215\u0216\7\3\2\2"+
		"\u0216\u0217\5\u00b4[\2\u0217\u0218\7\3\2\2\u0218\u0219\5\u0080A\2\u0219"+
		"\u021a\7\3\2\2\u021a\u021b\5\u00a0Q\2\u021b\63\3\2\2\2\u021c\u021d\5\u009e"+
		"P\2\u021d\u021e\7\3\2\2\u021e\u021f\5\u00b4[\2\u021f\u0220\7\3\2\2\u0220"+
		"\u0221\5\u0080A\2\u0221\u0222\7\3\2\2\u0222\u0223\5\u00a2R\2\u0223\65"+
		"\3\2\2\2\u0224\u0225\5\u009eP\2\u0225\u0226\7\3\2\2\u0226\u0227\5\u00b2"+
		"Z\2\u0227\u0228\7\3\2\2\u0228\u0229\5\u0080A\2\u0229\u022a\7\3\2\2\u022a"+
		"\u022b\5\u00a0Q\2\u022b\67\3\2\2\2\u022c\u022d\5\u009eP\2\u022d\u022e"+
		"\7\3\2\2\u022e\u022f\5\u00b2Z\2\u022f\u0230\7\3\2\2\u0230\u0231\5\u0080"+
		"A\2\u0231\u0232\7\3\2\2\u0232\u0233\5\u00a4S\2\u0233\u0234\b\35\1\2\u0234"+
		"9\3\2\2\2\u0235\u0236\5\u009eP\2\u0236\u0237\7\3\2\2\u0237\u0238\5\u00b2"+
		"Z\2\u0238\u0239\7\3\2\2\u0239\u023a\5\u0080A\2\u023a\u023b\7\3\2\2\u023b"+
		"\u023c\5\u00a2R\2\u023c;\3\2\2\2\u023d\u023e\5\u00c0a\2\u023e\u023f\7"+
		"\3\2\2\u023f\u0240\5\u00b0Y\2\u0240\u0241\7\3\2\2\u0241\u0242\5~@\2\u0242"+
		"\u0243\7\3\2\2\u0243\u0244\5\u0096L\2\u0244\u0245\7\3\2\2\u0245\u0246"+
		"\5\u0080A\2\u0246\u0247\7\3\2\2\u0247\u0248\5\u0098M\2\u0248\u0249\b\37"+
		"\1\2\u0249=\3\2\2\2\u024a\u024b\5\u00ceh\2\u024b\u024c\7\3\2\2\u024c\u024d"+
		"\5\u00aeX\2\u024d\u024e\7\3\2\2\u024e\u024f\5\u00d8m\2\u024f\u0250\7\3"+
		"\2\2\u0250\u0251\5\u0080A\2\u0251\u0252\7\3\2\2\u0252\u0253\5\u00a4S\2"+
		"\u0253\u0254\b \1\2\u0254?\3\2\2\2\u0255\u0256\5\u00ceh\2\u0256\u0257"+
		"\7\3\2\2\u0257\u0258\5\u00d6l\2\u0258\u0259\7\3\2\2\u0259\u025a\5\u0080"+
		"A\2\u025a\u025b\7\3\2\2\u025b\u025c\5\u00a4S\2\u025c\u025d\b!\1\2\u025d"+
		"A\3\2\2\2\u025e\u025f\5\u0086D\2\u025f\u0260\7\3\2\2\u0260\u0261\5\u00a6"+
		"T\2\u0261\u0262\b\"\1\2\u0262C\3\2\2\2\u0263\u0264\5\u009eP\2\u0264\u0265"+
		"\7\3\2\2\u0265\u0266\5\u00d4k\2\u0266\u0267\7\3\2\2\u0267\u0268\5\u00d2"+
		"j\2\u0268\u0269\7\3\2\2\u0269\u026a\5\u00a0Q\2\u026aE\3\2\2\2\u026b\u026c"+
		"\5\u009eP\2\u026c\u026d\7\3\2\2\u026d\u026e\5\u00d4k\2\u026e\u026f\7\3"+
		"\2\2\u026f\u0270\5\u00d2j\2\u0270\u0271\7\3\2\2\u0271\u0272\5\u00a2R\2"+
		"\u0272G\3\2\2\2\u0273\u0274\5\u009eP\2\u0274\u0275\7\3\2\2\u0275\u0276"+
		"\5\u00a4S\2\u0276\u0277\7\3\2\2\u0277\u0278\5\u0080A\2\u0278\u0279\7\3"+
		"\2\2\u0279\u027a\5\u00a0Q\2\u027a\u027b\b%\1\2\u027bI\3\2\2\2\u027c\u027d"+
		"\5\u009eP\2\u027d\u027e\7\3\2\2\u027e\u027f\5\u00a4S\2\u027f\u0280\7\3"+
		"\2\2\u0280\u0281\5\u0080A\2\u0281\u0282\7\3\2\2\u0282\u0283\5\u00a2R\2"+
		"\u0283\u0284\b&\1\2\u0284K\3\2\2\2\u0285\u0286\5\u009eP\2\u0286\u0287"+
		"\7\3\2\2\u0287\u0288\5\u00acW\2\u0288\u0289\7\3\2\2\u0289\u028a\5\u0080"+
		"A\2\u028a\u028b\7\3\2\2\u028b\u028c\5\u00a4S\2\u028c\u028d\b\'\1\2\u028d"+
		"M\3\2\2\2\u028e\u028f\5\u00ceh\2\u028f\u0290\7\3\2\2\u0290\u0291\5\u00d0"+
		"i\2\u0291\u0292\7\3\2\2\u0292\u0293\5\u0080A\2\u0293\u0294\7\3\2\2\u0294"+
		"\u0295\5\u00a0Q\2\u0295O\3\2\2\2\u0296\u0297\5\u00ceh\2\u0297\u0298\7"+
		"\3\2\2\u0298\u0299\5\u00d0i\2\u0299\u029a\7\3\2\2\u029a\u029b\5\u0080"+
		"A\2\u029b\u029c\7\3\2\2\u029c\u029d\5\u00a2R\2\u029dQ\3\2\2\2\u029e\u029f"+
		"\5|?\2\u029f\u02a0\7\3\2\2\u02a0\u02a1\5z>\2\u02a1\u02a2\7\3\2\2\u02a2"+
		"\u02a3\5\u0098M\2\u02a3\u02a4\b*\1\2\u02a4S\3\2\2\2\u02a5\u02a6\5\u0096"+
		"L\2\u02a6\u02a7\7\3\2\2\u02a7\u02a8\5\u0080A\2\u02a8\u02a9\7\3\2\2\u02a9"+
		"\u02aa\5\u00aeX\2\u02aa\u02ab\b+\1\2\u02abU\3\2\2\2\u02ac\u02ad\5\u00c0"+
		"a\2\u02ad\u02ae\7\3\2\2\u02ae\u02af\5\u00c6d\2\u02af\u02b0\7\3\2\2\u02b0"+
		"\u02b1\5\u0096L\2\u02b1\u02b2\7\3\2\2\u02b2\u02b3\5\u0080A\2\u02b3\u02b4"+
		"\7\3\2\2\u02b4\u02b5\5\u0098M\2\u02b5\u02b6\b,\1\2\u02b6W\3\2\2\2\u02b7"+
		"\u02b8\5\u00c0a\2\u02b8\u02b9\7\3\2\2\u02b9\u02ba\5\u00ccg\2\u02ba\u02bb"+
		"\7\3\2\2\u02bb\u02bc\5\u0096L\2\u02bc\u02bd\7\3\2\2\u02bd\u02be\5\u0080"+
		"A\2\u02be\u02bf\7\3\2\2\u02bf\u02c0\5\u0098M\2\u02c0\u02c1\b-\1\2\u02c1"+
		"Y\3\2\2\2\u02c2\u02c3\5\u00c0a\2\u02c3\u02c4\7\3\2\2\u02c4\u02c5\5\u00c6"+
		"d\2\u02c5\u02c6\7\3\2\2\u02c6\u02c7\5\u0096L\2\u02c7\u02c8\7\3\2\2\u02c8"+
		"\u02c9\5\u0080A\2\u02c9\u02ca\7\3\2\2\u02ca\u02cb\5\u0098M\2\u02cb\u02cc"+
		"\b.\1\2\u02cc[\3\2\2\2\u02cd\u02ce\5\u00c0a\2\u02ce\u02cf\7\3\2\2\u02cf"+
		"\u02d0\5\u00c8e\2\u02d0\u02d1\7\3\2\2\u02d1\u02d2\5\u0096L\2\u02d2\u02d3"+
		"\7\3\2\2\u02d3\u02d4\5\u0080A\2\u02d4\u02d5\7\3\2\2\u02d5\u02d6\5\u0098"+
		"M\2\u02d6\u02d7\b/\1\2\u02d7]\3\2\2\2\u02d8\u02d9\5\u00c0a\2\u02d9\u02da"+
		"\7\3\2\2\u02da\u02db\5\u00c2b\2\u02db\u02dc\7\3\2\2\u02dc\u02dd\5\u0096"+
		"L\2\u02dd\u02de\7\3\2\2\u02de\u02df\5\u0080A\2\u02df\u02e0\7\3\2\2\u02e0"+
		"\u02e1\5\u0098M\2\u02e1\u02e2\b\60\1\2\u02e2_\3\2\2\2\u02e3\u02e4\5\u00c0"+
		"a\2\u02e4\u02e5\7\3\2\2\u02e5\u02e6\5\u00c4c\2\u02e6\u02e7\7\3\2\2\u02e7"+
		"\u02e8\5\u0096L\2\u02e8\u02e9\7\3\2\2\u02e9\u02ea\5\u0080A\2\u02ea\u02eb"+
		"\7\3\2\2\u02eb\u02ec\5\u0098M\2\u02ec\u02ed\b\61\1\2\u02eda\3\2\2\2\u02ee"+
		"\u02ef\5\u0096L\2\u02ef\u02f0\7\3\2\2\u02f0\u02f1\5\u0080A\2\u02f1\u02f2"+
		"\7\3\2\2\u02f2\u02f3\5\u0098M\2\u02f3\u02f4\b\62\1\2\u02f4c\3\2\2\2\u02f5"+
		"\u02f6\5\u0094K\2\u02f6\u02f7\7\3\2\2\u02f7\u02f8\5\u00acW\2\u02f8\u02f9"+
		"\b\63\1\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\7\3\2\2\u02fb\u02fc\5x=\2\u02fc"+
		"\u02fd\7\3\2\2\u02fd\u02fe\5\u00acW\2\u02fe\u02ff\b\63\1\2\u02ffe\3\2"+
		"\2\2\u0300\u0301\5\u009eP\2\u0301\u0302\7\3\2\2\u0302\u0305\5\u00a2R\2"+
		"\u0303\u0304\7\3\2\2\u0304\u0306\5\u0080A\2\u0305\u0303\3\2\2\2\u0305"+
		"\u0306\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\7\3\2\2\u0308\u0309\5\u00a0"+
		"Q\2\u0309g\3\2\2\2\u030a\u030b\5\u0086D\2\u030b\u030c\7\3\2\2\u030c\u030d"+
		"\5\u0084C\2\u030d\u030e\7\3\2\2\u030e\u030f\5\u00be`\2\u030f\u0310\b\65"+
		"\1\2\u0310i\3\2\2\2\u0311\u0312\5\u0086D\2\u0312\u0313\7\3\2\2\u0313\u0314"+
		"\5\u008aF\2\u0314k\3\2\2\2\u0315\u0316\5\u0086D\2\u0316\u0317\7\3\2\2"+
		"\u0317\u0318\5\u0088E\2\u0318m\3\2\2\2\u0319\u031a\5\u0086D\2\u031a\u031b"+
		"\7\3\2\2\u031b\u031c\5\u00acW\2\u031c\u031d\b8\1\2\u031do\3\2\2\2\u031e"+
		"\u031f\5\u0090I\2\u031f\u0320\7\3\2\2\u0320\u0321\5\u00acW\2\u0321\u0322"+
		"\b9\1\2\u0322\u0323\3\2\2\2\u0323\u0324\7\3\2\2\u0324\u0325\5x=\2\u0325"+
		"\u0326\7\3\2\2\u0326\u0327\5\u00acW\2\u0327\u0328\b9\1\2\u0328q\3\2\2"+
		"\2\u0329\u032a\5\u0092J\2\u032a\u032b\7\3\2\2\u032b\u032c\5\u00acW\2\u032c"+
		"\u032d\b:\1\2\u032d\u032e\3\2\2\2\u032e\u032f\7\3\2\2\u032f\u0330\5x="+
		"\2\u0330\u0331\7\3\2\2\u0331\u0332\5\u00acW\2\u0332\u0333\b:\1\2\u0333"+
		"s\3\2\2\2\u0334\u0335\5\u008eH\2\u0335\u0336\7\3\2\2\u0336\u0337\5\u00ac"+
		"W\2\u0337\u0338\b;\1\2\u0338\u0339\3\2\2\2\u0339\u033a\7\3\2\2\u033a\u033b"+
		"\5x=\2\u033b\u033c\7\3\2\2\u033c\u033d\5\u00acW\2\u033d\u033e\b;\1\2\u033e"+
		"u\3\2\2\2\u033f\u0340\5\u008cG\2\u0340\u0341\7\3\2\2\u0341\u0342\5\u00ac"+
		"W\2\u0342\u0343\b<\1\2\u0343\u0344\3\2\2\2\u0344\u0345\7\3\2\2\u0345\u0346"+
		"\5x=\2\u0346\u0347\7\3\2\2\u0347\u0348\5\u00acW\2\u0348\u0349\b<\1\2\u0349"+
		"w\3\2\2\2\u034a\u034b\7K\2\2\u034by\3\2\2\2\u034c\u034d\7L\2\2\u034d{"+
		"\3\2\2\2\u034e\u034f\7M\2\2\u034f}\3\2\2\2\u0350\u0351\t\2\2\2\u0351\177"+
		"\3\2\2\2\u0352\u0353\t\3\2\2\u0353\u0081\3\2\2\2\u0354\u0355\t\4\2\2\u0355"+
		"\u0083\3\2\2\2\u0356\u0358\7E\2\2\u0357\u0359\7\67\2\2\u0358\u0357\3\2"+
		"\2\2\u0358\u0359\3\2\2\2\u0359\u0085\3\2\2\2\u035a\u035b\7D\2\2\u035b"+
		"\u035c\7\3\2\2\u035c\u035f\7B\2\2\u035d\u035f\7C\2\2\u035e\u035a\3\2\2"+
		"\2\u035e\u035d\3\2\2\2\u035f\u0087\3\2\2\2\u0360\u0361\t\5\2\2\u0361\u0089"+
		"\3\2\2\2\u0362\u0363\t\6\2\2\u0363\u008b\3\2\2\2\u0364\u0365\t\7\2\2\u0365"+
		"\u008d\3\2\2\2\u0366\u0367\t\b\2\2\u0367\u008f\3\2\2\2\u0368\u0369\t\t"+
		"\2\2\u0369\u0091\3\2\2\2\u036a\u036b\t\n\2\2\u036b\u0093\3\2\2\2\u036c"+
		"\u036d\79\2\2\u036d\u0095\3\2\2\2\u036e\u0373\78\2\2\u036f\u0370\7D\2"+
		"\2\u0370\u0371\7\3\2\2\u0371\u0373\7G\2\2\u0372\u036e\3\2\2\2\u0372\u036f"+
		"\3\2\2\2\u0373\u0097\3\2\2\2\u0374\u0376\7\4\2\2\u0375\u0377\7\3\2\2\u0376"+
		"\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0379\3\2\2\2\u0378\u037a\7\67"+
		"\2\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u037c\7\3\2\2\u037c\u037d\7O\2\2\u037d\u037e\bM\1\2\u037e\u0099\3\2\2"+
		"\2\u037f\u0380\7\66\2\2\u0380\u0381\7\3\2\2\u0381\u0386\7\63\2\2\u0382"+
		"\u0383\7\65\2\2\u0383\u0384\7\3\2\2\u0384\u0386\7\64\2\2\u0385\u037f\3"+
		"\2\2\2\u0385\u0382\3\2\2\2\u0386\u009b\3\2\2\2\u0387\u0388\7\60\2\2\u0388"+
		"\u0389\7\3\2\2\u0389\u038c\7\62\2\2\u038a\u038c\7\61\2\2\u038b\u0387\3"+
		"\2\2\2\u038b\u038a\3\2\2\2\u038c\u009d\3\2\2\2\u038d\u038e\7/\2\2\u038e"+
		"\u009f\3\2\2\2\u038f\u0390\t\13\2\2\u0390\u00a1\3\2\2\2\u0391\u0392\t"+
		"\f\2\2\u0392\u00a3\3\2\2\2\u0393\u0394\7)\2\2\u0394\u0397\7\3\2\2\u0395"+
		"\u0396\7F\2\2\u0396\u0398\7\3\2\2\u0397\u0395\3\2\2\2\u0397\u0398\3\2"+
		"\2\2\u0398\u0399\3\2\2\2\u0399\u039a\5\u00aeX\2\u039a\u039b\bS\1\2\u039b"+
		"\u00a5\3\2\2\2\u039c\u039d\7F\2\2\u039d\u039e\7\3\2\2\u039e\u039f\5\u00a4"+
		"S\2\u039f\u03a0\bT\1\2\u03a0\u03a1\3\2\2\2\u03a1\u03a2\7\3\2\2\u03a2\u03a3"+
		"\7*\2\2\u03a3\u03a4\7\3\2\2\u03a4\u03a5\5\u00a4S\2\u03a5\u03a6\bT\1\2"+
		"\u03a6\u00a7\3\2\2\2\u03a7\u03a8\7\'\2\2\u03a8\u00a9\3\2\2\2\u03a9\u03aa"+
		"\7&\2\2\u03aa\u00ab\3\2\2\2\u03ab\u03ac\7%\2\2\u03ac\u03ae\bW\1\2\u03ad"+
		"\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\7("+
		"\2\2\u03b0\u03b5\bW\1\2\u03b1\u03b2\5\u00aeX\2\u03b2\u03b3\bW\1\2\u03b3"+
		"\u03b5\3\2\2\2\u03b4\u03ad\3\2\2\2\u03b4\u03b1\3\2\2\2\u03b5\u00ad\3\2"+
		"\2\2\u03b6\u03b7\7(\2\2\u03b7\u03bf\bX\1\2\u03b8\u03b9\5\u00a2R\2\u03b9"+
		"\u03ba\bX\1\2\u03ba\u03bf\3\2\2\2\u03bb\u03bc\5\u00a0Q\2\u03bc\u03bd\b"+
		"X\1\2\u03bd\u03bf\3\2\2\2\u03be\u03b6\3\2\2\2\u03be\u03b8\3\2\2\2\u03be"+
		"\u03bb\3\2\2\2\u03bf\u00af\3\2\2\2\u03c0\u03c1\t\r\2\2\u03c1\u00b1\3\2"+
		"\2\2\u03c2\u03c3\7\"\2\2\u03c3\u00b3\3\2\2\2\u03c4\u03c5\7\37\2\2\u03c5"+
		"\u03c6\7\3\2\2\u03c6\u03c7\7\'\2\2\u03c7\u03c8\7\3\2\2\u03c8\u03cf\7 "+
		"\2\2\u03c9\u03ca\7\'\2\2\u03ca\u03cb\7\3\2\2\u03cb\u03cc\7!\2\2\u03cc"+
		"\u03cd\7\3\2\2\u03cd\u03cf\7 \2\2\u03ce\u03c4\3\2\2\2\u03ce\u03c9\3\2"+
		"\2\2\u03cf\u00b5\3\2\2\2\u03d0\u03d1\7\'\2\2\u03d1\u03d2\7\3\2\2\u03d2"+
		"\u03de\7 \2\2\u03d3\u03d4\7 \2\2\u03d4\u03d5\7\3\2\2\u03d5\u03d6\7\34"+
		"\2\2\u03d6\u03d7\7\3\2\2\u03d7\u03de\7\35\2\2\u03d8\u03d9\7 \2\2\u03d9"+
		"\u03da\7\3\2\2\u03da\u03db\7\36\2\2\u03db\u03dc\7\3\2\2\u03dc\u03de\7"+
		"\'\2\2\u03dd\u03d0\3\2\2\2\u03dd\u03d3\3\2\2\2\u03dd\u03d8\3\2\2\2\u03de"+
		"\u00b7\3\2\2\2\u03df\u03e0\7\5\2\2\u03e0\u00b9\3\2\2\2\u03e1\u042e\7\4"+
		"\2\2\u03e2\u042e\7\5\2\2\u03e3\u042e\7\6\2\2\u03e4\u042e\7\7\2\2\u03e5"+
		"\u042e\7\b\2\2\u03e6\u042e\7\t\2\2\u03e7\u042e\7\n\2\2\u03e8\u042e\7\13"+
		"\2\2\u03e9\u042e\7\f\2\2\u03ea\u042e\7\r\2\2\u03eb\u042e\7\16\2\2\u03ec"+
		"\u042e\7\17\2\2\u03ed\u042e\7\20\2\2\u03ee\u042e\7\21\2\2\u03ef\u042e"+
		"\7\22\2\2\u03f0\u042e\7\23\2\2\u03f1\u042e\7\24\2\2\u03f2\u042e\7\25\2"+
		"\2\u03f3\u042e\7\26\2\2\u03f4\u042e\7\27\2\2\u03f5\u042e\7\30\2\2\u03f6"+
		"\u042e\7\31\2\2\u03f7\u042e\7\32\2\2\u03f8\u042e\7\33\2\2\u03f9\u042e"+
		"\7\34\2\2\u03fa\u042e\7\35\2\2\u03fb\u042e\7\36\2\2\u03fc\u042e\7\37\2"+
		"\2\u03fd\u042e\7 \2\2\u03fe\u042e\7!\2\2\u03ff\u042e\7\"\2\2\u0400\u042e"+
		"\7#\2\2\u0401\u042e\7$\2\2\u0402\u042e\7%\2\2\u0403\u042e\7&\2\2\u0404"+
		"\u042e\7\'\2\2\u0405\u042e\7(\2\2\u0406\u042e\7)\2\2\u0407\u042e\7*\2"+
		"\2\u0408\u042e\7+\2\2\u0409\u042e\7,\2\2\u040a\u042e\7-\2\2\u040b\u042e"+
		"\7.\2\2\u040c\u042e\7/\2\2\u040d\u042e\7\60\2\2\u040e\u042e\7\61\2\2\u040f"+
		"\u042e\7\62\2\2\u0410\u042e\7\63\2\2\u0411\u042e\7\64\2\2\u0412\u042e"+
		"\7\65\2\2\u0413\u042e\7\66\2\2\u0414\u042e\7\67\2\2\u0415\u042e\78\2\2"+
		"\u0416\u042e\79\2\2\u0417\u042e\7:\2\2\u0418\u042e\7;\2\2\u0419\u042e"+
		"\7<\2\2\u041a\u042e\7=\2\2\u041b\u042e\7>\2\2\u041c\u042e\7?\2\2\u041d"+
		"\u042e\7@\2\2\u041e\u042e\7A\2\2\u041f\u042e\7B\2\2\u0420\u042e\7C\2\2"+
		"\u0421\u042e\7D\2\2\u0422\u042e\7E\2\2\u0423\u042e\7F\2\2\u0424\u042e"+
		"\7G\2\2\u0425\u042e\7I\2\2\u0426\u042e\7J\2\2\u0427\u042e\7K\2\2\u0428"+
		"\u042e\7L\2\2\u0429\u042e\7M\2\2\u042a\u042e\7O\2\2\u042b\u042e\7P\2\2"+
		"\u042c\u042e\7Q\2\2\u042d\u03e1\3\2\2\2\u042d\u03e2\3\2\2\2\u042d\u03e3"+
		"\3\2\2\2\u042d\u03e4\3\2\2\2\u042d\u03e5\3\2\2\2\u042d\u03e6\3\2\2\2\u042d"+
		"\u03e7\3\2\2\2\u042d\u03e8\3\2\2\2\u042d\u03e9\3\2\2\2\u042d\u03ea\3\2"+
		"\2\2\u042d\u03eb\3\2\2\2\u042d\u03ec\3\2\2\2\u042d\u03ed\3\2\2\2\u042d"+
		"\u03ee\3\2\2\2\u042d\u03ef\3\2\2\2\u042d\u03f0\3\2\2\2\u042d\u03f1\3\2"+
		"\2\2\u042d\u03f2\3\2\2\2\u042d\u03f3\3\2\2\2\u042d\u03f4\3\2\2\2\u042d"+
		"\u03f5\3\2\2\2\u042d\u03f6\3\2\2\2\u042d\u03f7\3\2\2\2\u042d\u03f8\3\2"+
		"\2\2\u042d\u03f9\3\2\2\2\u042d\u03fa\3\2\2\2\u042d\u03fb\3\2\2\2\u042d"+
		"\u03fc\3\2\2\2\u042d\u03fd\3\2\2\2\u042d\u03fe\3\2\2\2\u042d\u03ff\3\2"+
		"\2\2\u042d\u0400\3\2\2\2\u042d\u0401\3\2\2\2\u042d\u0402\3\2\2\2\u042d"+
		"\u0403\3\2\2\2\u042d\u0404\3\2\2\2\u042d\u0405\3\2\2\2\u042d\u0406\3\2"+
		"\2\2\u042d\u0407\3\2\2\2\u042d\u0408\3\2\2\2\u042d\u0409\3\2\2\2\u042d"+
		"\u040a\3\2\2\2\u042d\u040b\3\2\2\2\u042d\u040c\3\2\2\2\u042d\u040d\3\2"+
		"\2\2\u042d\u040e\3\2\2\2\u042d\u040f\3\2\2\2\u042d\u0410\3\2\2\2\u042d"+
		"\u0411\3\2\2\2\u042d\u0412\3\2\2\2\u042d\u0413\3\2\2\2\u042d\u0414\3\2"+
		"\2\2\u042d\u0415\3\2\2\2\u042d\u0416\3\2\2\2\u042d\u0417\3\2\2\2\u042d"+
		"\u0418\3\2\2\2\u042d\u0419\3\2\2\2\u042d\u041a\3\2\2\2\u042d\u041b\3\2"+
		"\2\2\u042d\u041c\3\2\2\2\u042d\u041d\3\2\2\2\u042d\u041e\3\2\2\2\u042d"+
		"\u041f\3\2\2\2\u042d\u0420\3\2\2\2\u042d\u0421\3\2\2\2\u042d\u0422\3\2"+
		"\2\2\u042d\u0423\3\2\2\2\u042d\u0424\3\2\2\2\u042d\u0425\3\2\2\2\u042d"+
		"\u0426\3\2\2\2\u042d\u0427\3\2\2\2\u042d\u0428\3\2\2\2\u042d\u0429\3\2"+
		"\2\2\u042d\u042a\3\2\2\2\u042d\u042b\3\2\2\2\u042d\u042c\3\2\2\2\u042e"+
		"\u042f\3\2\2\2\u042f\u0430\b^\1\2\u0430\u00bb\3\2\2\2\u0431\u0432\5\u00ba"+
		"^\2\u0432\u0433\b_\1\2\u0433\u0435\3\2\2\2\u0434\u0431\3\2\2\2\u0435\u0438"+
		"\3\2\2\2\u0436\u0434\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0439\3\2\2\2\u0438"+
		"\u0436\3\2\2\2\u0439\u043a\7\3\2\2\u043a\u043c\b_\1\2\u043b\u0436\3\2"+
		"\2\2\u043c\u043d\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e"+
		"\u043f\3\2\2\2\u043f\u0440\5\u00ba^\2\u0440\u0441\b_\1\2\u0441\u0442\b"+
		"_\1\2\u0442\u00bd\3\2\2\2\u0443\u0444\5\u00ba^\2\u0444\u0447\b`\1\2\u0445"+
		"\u0446\7\3\2\2\u0446\u0448\b`\1\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2"+
		"\2\2\u0448\u044a\3\2\2\2\u0449\u0443\3\2\2\2\u044a\u044b\3\2\2\2\u044b"+
		"\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e\b`"+
		"\1\2\u044e\u00bf\3\2\2\2\u044f\u0450\t\16\2\2\u0450\u00c1\3\2\2\2\u0451"+
		"\u0456\7\27\2\2\u0452\u0453\7\30\2\2\u0453\u0454\7\3\2\2\u0454\u0456\7"+
		"\31\2\2\u0455\u0451\3\2\2\2\u0455\u0452\3\2\2\2\u0456\u00c3\3\2\2\2\u0457"+
		"\u0458\7\31\2\2\u0458\u00c5\3\2\2\2\u0459\u045a\7\26\2\2\u045a\u00c7\3"+
		"\2\2\2\u045b\u045c\7\25\2\2\u045c\u00c9\3\2\2\2\u045d\u045e\7\26\2\2\u045e"+
		"\u045f\7\3\2\2\u045f\u0460\7\24\2\2\u0460\u0461\7\3\2\2\u0461\u0468\7"+
		"\31\2\2\u0462\u0463\7\31\2\2\u0463\u0464\7\3\2\2\u0464\u0465\7\24\2\2"+
		"\u0465\u0466\7\3\2\2\u0466\u0468\7\26\2\2\u0467\u045d\3\2\2\2\u0467\u0462"+
		"\3\2\2\2\u0468\u00cb\3\2\2\2\u0469\u046a\7\25\2\2\u046a\u046b\7\3\2\2"+
		"\u046b\u046c\7\24\2\2\u046c\u046d\7\3\2\2\u046d\u0474\7\31\2\2\u046e\u046f"+
		"\7\31\2\2\u046f\u0470\7\3\2\2\u0470\u0471\7\24\2\2\u0471\u0472\7\3\2\2"+
		"\u0472\u0474\7\25\2\2\u0473\u0469\3\2\2\2\u0473\u046e\3\2\2\2\u0474\u00cd"+
		"\3\2\2\2\u0475\u0476\7\23\2\2\u0476\u0477\7\3\2\2\u0477\u047a\7\22\2\2"+
		"\u0478\u047a\7\21\2\2\u0479\u0475\3\2\2\2\u0479\u0478\3\2\2\2\u047a\u00cf"+
		"\3\2\2\2\u047b\u047c\7\20\2\2\u047c\u00d1\3\2\2\2\u047d\u047e\7)\2\2\u047e"+
		"\u00d3\3\2\2\2\u047f\u0480\t\17\2\2\u0480\u00d5\3\2\2\2\u0481\u0482\t"+
		"\20\2\2\u0482\u00d7\3\2\2\2\u0483\u0484\7\n\2\2\u0484\u00d9\3\2\2\2\u0485"+
		"\u0486\7\t\2\2\u0486\u0487\7\3\2\2\u0487\u0488\7#\2\2\u0488\u00db\3\2"+
		"\2\2\35\u00de\u00e4\u00e9\u0152\u0305\u0358\u035e\u0372\u0376\u0379\u0385"+
		"\u038b\u0397\u03ad\u03b4\u03be\u03ce\u03dd\u042d\u0436\u043d\u0447\u044b"+
		"\u0455\u0467\u0473\u0479";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}