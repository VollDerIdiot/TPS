// Generated from TPS_ANTLR.g4 by ANTLR 4.4

package genearatedsources.antlr;

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
		GAB=70, WAR=71, MIT=72, IST=73, HIER=74, PUNKT=75, STELLE=76, REST=77, 
		REST_2=78;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "'stelle'", "'der'", "'wortreihe'", "'wortkette'", 
		"'wortfolge'", "'letzten'", "'zeichen'", "'zeichenfolge'", "'zeichenkette'", 
		"'wort'", "'menge'", "'anzahl'", "'zahl'", "'einlesen'", "'ein'", "'lese'", 
		"'oder'", "'kleiner'", "'größer'", "'ungleich'", "'nicht'", "'gleich'", 
		"'falls'", "'wenn'", "'des'", "'stapels'", "VOM", "'maximale'", "'größe'", 
		"'maximum'", "'version'", "'fehler'", "'falsch'", "'-'", "'nehme'", "'stapel'", 
		"POS_ZAHL", "'register'", "'bis'", "'ergebnisspeicher'", "'ergebnis'", 
		"'zwischen'", "'zwischenspeicher'", "'speichere'", "'gehe'", "'zurückgehen'", 
		"'zurück'", "'auf'", "'aufruf'", "'mache'", "'rufe'", "':'", "'springe'", 
		"'vergleiche'", "'dividiere'", "'multipliziere'", "'subtrahiere'", "'addiere'", 
		"'zeilenumbruch'", "'leerzeile'", "'leertaste'", "'leerzeichen'", "'aus'", 
		"'ausgeben'", "'gebe'", "'folgendes'", "VON", "'zu'", "'gab'", "'war'", 
		"'mit'", "'ist'", "'hier'", "PUNKT", "STELLE", "REST", "REST_2"
	};
	public static final int
		RULE_datei = 0, RULE_satz = 1, RULE_satzWert = 2, RULE_letzterFehler = 3, 
		RULE_rufeAufWennFalsch = 4, RULE_stapelLesenReg = 5, RULE_stapelLesenZw = 6, 
		RULE_stapelLesenErg = 7, RULE_stapelSchreiben = 8, RULE_rufeAufDirekt = 9, 
		RULE_geheZurück = 10, RULE_rufeAufGrößerGleich = 11, RULE_rufeAufKleinerGleich = 12, 
		RULE_rufeAufGrößer = 13, RULE_rufeAufWennKleiner = 14, RULE_rufeAufWennNichtGleich = 15, 
		RULE_rufeAufWennGleich = 16, RULE_rufeAuf = 17, RULE_vergleicheRegisterText = 18, 
		RULE_vergleicheRegister = 19, RULE_stapelGrößeZw = 20, RULE_stapelGrößeReg = 21, 
		RULE_stapelGrößeErg = 22, RULE_stapelMaxGrößeReg = 23, RULE_stapelMaxGrößeZw = 24, 
		RULE_stapelMaxGrößeErg = 25, RULE_versionZw = 26, RULE_versionReg = 27, 
		RULE_versionErg = 28, RULE_springeWennFalsch = 29, RULE_registerZeichenEinlesen = 30, 
		RULE_registerWortEinlesen = 31, RULE_registerausgabe = 32, RULE_ladeRegisterAnzahlZw = 33, 
		RULE_ladeRegisterAnzahlErg = 34, RULE_ladeVomRegisterZw = 35, RULE_ladeVomRegisterErg = 36, 
		RULE_ladeInRegister = 37, RULE_leseZahlEinZwischen = 38, RULE_leseZahlEinErg = 39, 
		RULE_stelle = 40, RULE_springeZuDirekt = 41, RULE_springeWennGrößerGleich = 42, 
		RULE_springeWennKleinerGleich = 43, RULE_springeWennGrößer = 44, RULE_springeWennKleiner = 45, 
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
		RULE_wortfolgeST = 92, RULE_wennST = 93, RULE_ungleichST = 94, RULE_gleichST = 95, 
		RULE_größerST = 96, RULE_kleinerST = 97, RULE_größerGleichST = 98, RULE_kleinerGleichST = 99, 
		RULE_einlesenST = 100, RULE_zahlST_ = 101, RULE_registerST_ = 102, RULE_anzahlST = 103, 
		RULE_wortST = 104, RULE_zeichenST = 105, RULE_letztenFehlerST = 106;
	public static final String[] ruleNames = {
		"datei", "satz", "satzWert", "letzterFehler", "rufeAufWennFalsch", "stapelLesenReg", 
		"stapelLesenZw", "stapelLesenErg", "stapelSchreiben", "rufeAufDirekt", 
		"geheZurück", "rufeAufGrößerGleich", "rufeAufKleinerGleich", "rufeAufGrößer", 
		"rufeAufWennKleiner", "rufeAufWennNichtGleich", "rufeAufWennGleich", "rufeAuf", 
		"vergleicheRegisterText", "vergleicheRegister", "stapelGrößeZw", "stapelGrößeReg", 
		"stapelGrößeErg", "stapelMaxGrößeReg", "stapelMaxGrößeZw", "stapelMaxGrößeErg", 
		"versionZw", "versionReg", "versionErg", "springeWennFalsch", "registerZeichenEinlesen", 
		"registerWortEinlesen", "registerausgabe", "ladeRegisterAnzahlZw", "ladeRegisterAnzahlErg", 
		"ladeVomRegisterZw", "ladeVomRegisterErg", "ladeInRegister", "leseZahlEinZwischen", 
		"leseZahlEinErg", "stelle", "springeZuDirekt", "springeWennGrößerGleich", 
		"springeWennKleinerGleich", "springeWennGrößer", "springeWennKleiner", 
		"springeWennNichtGleich", "springeWennGleich", "springe", "vergleiche", 
		"zwischenspeicher", "ausgabe", "leerzeile", "leerzeichen", "zahlenausgabe", 
		"multipliziere", "dividiere", "subtrahiere", "addiere", "mitST", "istST", 
		"hierST", "gabST", "zuST", "vonST", "folgendesST", "ausgebenST", "leerzeichenST", 
		"leerzeileST", "addiereST", "subtrahiereST", "multipliziereST", "dividiereST", 
		"vergleichST", "springeST", "stelleST", "aufrufST", "zurückgehenST", "speichereST", 
		"zwischenST", "ergebnisST", "registerST", "bereichST", "stapelST", "nehmeST", 
		"zahlST", "posZahlST", "fehlerST", "versionST", "stapelMaxGrST", "stapelGrST", 
		"derST", "wortfolgeST", "wennST", "ungleichST", "gleichST", "größerST", 
		"kleinerST", "größerGleichST", "kleinerGleichST", "einlesenST", "zahlST_", 
		"registerST_", "anzahlST", "wortST", "zeichenST", "letztenFehlerST"
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

	public TPS_ANTLRParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DateiContext extends ParserRuleContext {
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214); satz();
				setState(216);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(215); match(WS);
					}
				}

				}
				}
				setState(220); 
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
			setState(222); satzWert();
			setState(224);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(223); match(WS);
				}
			}

			setState(226); match(PUNKT);
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
		public RufeAufGrößerGleichContext rufeAufGrößerGleich() {
			return getRuleContext(RufeAufGrößerGleichContext.class,0);
		}
		public StelleContext stelle() {
			return getRuleContext(StelleContext.class,0);
		}
		public SpringeWennGrößerGleichContext springeWennGrößerGleich() {
			return getRuleContext(SpringeWennGrößerGleichContext.class,0);
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
		public RufeAufWennFalschContext rufeAufWennFalsch() {
			return getRuleContext(RufeAufWennFalschContext.class,0);
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
		public SpringeWennGrößerContext springeWennGrößer() {
			return getRuleContext(SpringeWennGrößerContext.class,0);
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
		public RufeAufGrößerContext rufeAufGrößer() {
			return getRuleContext(RufeAufGrößerContext.class,0);
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
			setState(284);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); addiere();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); subtrahiere();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230); multipliziere();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231); dividiere();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232); zahlenausgabe();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(233); leerzeichen();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(234); leerzeile();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(235); ausgabe();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(236); zwischenspeicher();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(237); vergleiche();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(238); springe();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(239); springeWennNichtGleich();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(240); springeWennGleich();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(241); springeWennKleiner();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(242); springeWennGrößer();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(243); springeWennKleinerGleich();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(244); springeWennGrößerGleich();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(245); springeZuDirekt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(246); stelle();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(247); leseZahlEinErg();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(248); leseZahlEinZwischen();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(249); ladeInRegister();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(250); ladeVomRegisterErg();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(251); ladeVomRegisterZw();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(252); ladeRegisterAnzahlErg();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(253); ladeRegisterAnzahlZw();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(254); registerausgabe();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(255); registerWortEinlesen();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(256); registerZeichenEinlesen();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(257); springeWennFalsch();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(258); versionErg();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(259); versionZw();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(260); versionReg();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(261); stapelMaxGrößeErg();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(262); stapelMaxGrößeZw();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(263); stapelMaxGrößeReg();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(264); stapelGrößeErg();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(265); stapelGrößeZw();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(266); stapelGrößeReg();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(267); vergleicheRegister();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(268); vergleicheRegisterText();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(269); rufeAuf();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(270); rufeAufWennGleich();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(271); rufeAufWennNichtGleich();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(272); rufeAufWennKleiner();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(273); rufeAufGrößer();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(274); rufeAufKleinerGleich();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(275); rufeAufGrößerGleich();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(276); geheZurück();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(277); rufeAufDirekt();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(278); stapelSchreiben();
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(279); stapelLesenErg();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(280); stapelLesenZw();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(281); stapelLesenReg();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(282); rufeAufWennFalsch();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(283); letzterFehler();
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
			setState(286); nehmeST();
			setState(287); match(WS);
			setState(288); letztenFehlerST();
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
			setState(290); wennST();
			setState(291); match(WS);
			setState(292); fehlerST();
			setState(293); match(WS);
			setState(294); gabST();
			setState(295); match(WS);
			setState(296); aufrufST();
			setState(297); match(WS);
			setState(298); zuST();
			setState(299); match(WS);
			setState(300); stelleST();
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
			setState(302); nehmeST();
			setState(303); match(WS);
			setState(304); vonST();
			setState(305); match(WS);
			setState(306); stapelST();
			setState(307); match(WS);
			setState(308); zuST();
			setState(309); match(WS);
			setState(310); registerST();
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
			setState(312); nehmeST();
			setState(313); match(WS);
			setState(314); vonST();
			setState(315); match(WS);
			setState(316); stapelST();
			setState(317); match(WS);
			setState(318); zuST();
			setState(319); match(WS);
			setState(320); zwischenST();
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
			setState(322); nehmeST();
			setState(323); match(WS);
			setState(324); vonST();
			setState(325); match(WS);
			setState(326); stapelST();
			setState(327); match(WS);
			setState(328); zuST();
			setState(329); match(WS);
			setState(330); ergebnisST();
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
			setState(332); speichereST();
			setState(333); match(WS);
			setState(334); zahlST();
			setState(335); match(WS);
			setState(336); zuST();
			setState(337); match(WS);
			setState(338); stapelST();
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
			setState(340); aufrufST();
			setState(341); match(WS);
			setState(342); zuST();
			setState(343); match(WS);
			setState(344); posZahlST();
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
			setState(346); zurückgehenST();
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

	public static class RufeAufGrößerGleichContext extends ParserRuleContext {
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
		public RufeAufGrößerGleichContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rufeAufGrößerGleich; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRufeAufGrößerGleich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRufeAufGrößerGleich(this);
		}
	}

	public final RufeAufGrößerGleichContext rufeAufGrößerGleich() throws RecognitionException {
		RufeAufGrößerGleichContext _localctx = new RufeAufGrößerGleichContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rufeAufGrößerGleich);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348); wennST();
			setState(349); match(WS);
			setState(350); größerGleichST();
			setState(351); match(WS);
			setState(352); aufrufST();
			setState(353); match(WS);
			setState(354); zuST();
			setState(355); match(WS);
			setState(356); stelleST();
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
			setState(358); wennST();
			setState(359); match(WS);
			setState(360); kleinerGleichST();
			setState(361); match(WS);
			setState(362); aufrufST();
			setState(363); match(WS);
			setState(364); zuST();
			setState(365); match(WS);
			setState(366); stelleST();
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

	public static class RufeAufGrößerContext extends ParserRuleContext {
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
		public RufeAufGrößerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rufeAufGrößer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterRufeAufGrößer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitRufeAufGrößer(this);
		}
	}

	public final RufeAufGrößerContext rufeAufGrößer() throws RecognitionException {
		RufeAufGrößerContext _localctx = new RufeAufGrößerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rufeAufGrößer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); wennST();
			setState(369); match(WS);
			setState(370); größerST();
			setState(371); match(WS);
			setState(372); aufrufST();
			setState(373); match(WS);
			setState(374); zuST();
			setState(375); match(WS);
			setState(376); stelleST();
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
			setState(378); wennST();
			setState(379); match(WS);
			setState(380); kleinerST();
			setState(381); match(WS);
			setState(382); aufrufST();
			setState(383); match(WS);
			setState(384); zuST();
			setState(385); match(WS);
			setState(386); stelleST();
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
			setState(388); wennST();
			setState(389); match(WS);
			setState(390); ungleichST();
			setState(391); match(WS);
			setState(392); aufrufST();
			setState(393); match(WS);
			setState(394); zuST();
			setState(395); match(WS);
			setState(396); stelleST();
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
			setState(398); wennST();
			setState(399); match(WS);
			setState(400); gleichST();
			setState(401); match(WS);
			setState(402); aufrufST();
			setState(403); match(WS);
			setState(404); zuST();
			setState(405); match(WS);
			setState(406); stelleST();
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
			setState(408); aufrufST();
			setState(409); match(WS);
			setState(410); zuST();
			setState(411); match(WS);
			setState(412); stelleST();
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
			setState(414); vergleichST();
			setState(415); match(WS);
			setState(416); bereichST();
			setState(417); match(WS);
			setState(418); mitST();
			setState(419); match(WS);
			setState(420); derST();
			setState(421); match(WS);
			setState(422); wortfolgeST();
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
			setState(424); vergleichST();
			setState(425); match(WS);
			setState(426); bereichST();
			setState(427); match(WS);
			setState(428); mitST();
			setState(429); match(WS);
			setState(430); bereichST();
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
			setState(432); speichereST();
			setState(433); match(WS);
			setState(434); stapelGrST();
			setState(435); match(WS);
			setState(436); zuST();
			setState(437); match(WS);
			setState(438); zwischenST();
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
			setState(440); speichereST();
			setState(441); match(WS);
			setState(442); stapelGrST();
			setState(443); match(WS);
			setState(444); zuST();
			setState(445); match(WS);
			setState(446); registerST();
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
			setState(448); speichereST();
			setState(449); match(WS);
			setState(450); stapelGrST();
			setState(451); match(WS);
			setState(452); zuST();
			setState(453); match(WS);
			setState(454); ergebnisST();
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
			setState(456); speichereST();
			setState(457); match(WS);
			setState(458); stapelMaxGrST();
			setState(459); match(WS);
			setState(460); zuST();
			setState(461); match(WS);
			setState(462); registerST();
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
			setState(464); speichereST();
			setState(465); match(WS);
			setState(466); stapelMaxGrST();
			setState(467); match(WS);
			setState(468); zuST();
			setState(469); match(WS);
			setState(470); zwischenST();
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
			setState(472); speichereST();
			setState(473); match(WS);
			setState(474); stapelMaxGrST();
			setState(475); match(WS);
			setState(476); zuST();
			setState(477); match(WS);
			setState(478); ergebnisST();
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
			setState(480); speichereST();
			setState(481); match(WS);
			setState(482); versionST();
			setState(483); match(WS);
			setState(484); zuST();
			setState(485); match(WS);
			setState(486); zwischenST();
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
			setState(488); speichereST();
			setState(489); match(WS);
			setState(490); versionST();
			setState(491); match(WS);
			setState(492); zuST();
			setState(493); match(WS);
			setState(494); registerST();
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
			setState(496); speichereST();
			setState(497); match(WS);
			setState(498); versionST();
			setState(499); match(WS);
			setState(500); zuST();
			setState(501); match(WS);
			setState(502); ergebnisST();
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
			setState(504); wennST();
			setState(505); match(WS);
			setState(506); fehlerST();
			setState(507); match(WS);
			setState(508); gabST();
			setState(509); match(WS);
			setState(510); springeST();
			setState(511); match(WS);
			setState(512); zuST();
			setState(513); match(WS);
			setState(514); stelleST();
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
			setState(516); einlesenST();
			setState(517); match(WS);
			setState(518); posZahlST();
			setState(519); match(WS);
			setState(520); zeichenST();
			setState(521); match(WS);
			setState(522); zuST();
			setState(523); match(WS);
			setState(524); registerST();
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
			setState(526); einlesenST();
			setState(527); match(WS);
			setState(528); wortST();
			setState(529); match(WS);
			setState(530); zuST();
			setState(531); match(WS);
			setState(532); registerST();
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
			setState(534); ausgebenST();
			setState(535); match(WS);
			setState(536); bereichST();
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
			setState(538); speichereST();
			setState(539); match(WS);
			setState(540); anzahlST();
			setState(541); match(WS);
			setState(542); registerST_();
			setState(543); match(WS);
			setState(544); zwischenST();
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
			setState(546); speichereST();
			setState(547); match(WS);
			setState(548); anzahlST();
			setState(549); match(WS);
			setState(550); registerST_();
			setState(551); match(WS);
			setState(552); ergebnisST();
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
			setState(554); speichereST();
			setState(555); match(WS);
			setState(556); registerST();
			setState(557); match(WS);
			setState(558); zuST();
			setState(559); match(WS);
			setState(560); zwischenST();
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
			setState(562); speichereST();
			setState(563); match(WS);
			setState(564); registerST();
			setState(565); match(WS);
			setState(566); zuST();
			setState(567); match(WS);
			setState(568); ergebnisST();
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
			setState(570); speichereST();
			setState(571); match(WS);
			setState(572); zahlST();
			setState(573); match(WS);
			setState(574); zuST();
			setState(575); match(WS);
			setState(576); registerST();
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
			setState(578); einlesenST();
			setState(579); match(WS);
			setState(580); zahlST_();
			setState(581); match(WS);
			setState(582); zwischenST();
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
			setState(584); einlesenST();
			setState(585); match(WS);
			setState(586); zahlST_();
			setState(587); match(WS);
			setState(588); ergebnisST();
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
			setState(590); hierST();
			setState(591); match(WS);
			setState(592); istST();
			setState(593); match(WS);
			setState(594); stelleST();
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
			setState(596); springeST();
			setState(597); match(WS);
			setState(598); zuST();
			setState(599); match(WS);
			setState(600); posZahlST();
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

	public static class SpringeWennGrößerGleichContext extends ParserRuleContext {
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
		public SpringeWennGrößerGleichContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springeWennGrößerGleich; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSpringeWennGrößerGleich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSpringeWennGrößerGleich(this);
		}
	}

	public final SpringeWennGrößerGleichContext springeWennGrößerGleich() throws RecognitionException {
		SpringeWennGrößerGleichContext _localctx = new SpringeWennGrößerGleichContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_springeWennGrößerGleich);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602); wennST();
			setState(603); match(WS);
			setState(604); größerST();
			setState(605); match(WS);
			setState(606); springeST();
			setState(607); match(WS);
			setState(608); zuST();
			setState(609); match(WS);
			setState(610); stelleST();
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
			setState(612); wennST();
			setState(613); match(WS);
			setState(614); kleinerGleichST();
			setState(615); match(WS);
			setState(616); springeST();
			setState(617); match(WS);
			setState(618); zuST();
			setState(619); match(WS);
			setState(620); stelleST();
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

	public static class SpringeWennGrößerContext extends ParserRuleContext {
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
		public SpringeWennGrößerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_springeWennGrößer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).enterSpringeWennGrößer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TPS_ANTLRListener ) ((TPS_ANTLRListener)listener).exitSpringeWennGrößer(this);
		}
	}

	public final SpringeWennGrößerContext springeWennGrößer() throws RecognitionException {
		SpringeWennGrößerContext _localctx = new SpringeWennGrößerContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_springeWennGrößer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622); wennST();
			setState(623); match(WS);
			setState(624); größerST();
			setState(625); match(WS);
			setState(626); springeST();
			setState(627); match(WS);
			setState(628); zuST();
			setState(629); match(WS);
			setState(630); stelleST();
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
			setState(632); wennST();
			setState(633); match(WS);
			setState(634); kleinerST();
			setState(635); match(WS);
			setState(636); springeST();
			setState(637); match(WS);
			setState(638); zuST();
			setState(639); match(WS);
			setState(640); stelleST();
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
			setState(642); wennST();
			setState(643); match(WS);
			setState(644); ungleichST();
			setState(645); match(WS);
			setState(646); springeST();
			setState(647); match(WS);
			setState(648); zuST();
			setState(649); match(WS);
			setState(650); stelleST();
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
			setState(652); wennST();
			setState(653); match(WS);
			setState(654); gleichST();
			setState(655); match(WS);
			setState(656); springeST();
			setState(657); match(WS);
			setState(658); zuST();
			setState(659); match(WS);
			setState(660); stelleST();
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
			setState(662); springeST();
			setState(663); match(WS);
			setState(664); zuST();
			setState(665); match(WS);
			setState(666); stelleST();
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
			setState(668); vergleichST();
			setState(669); match(WS);
			setState(670); zahlST();
			setState(671); match(WS);
			setState(672); mitST();
			setState(673); match(WS);
			setState(674); zahlST();
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
			setState(676); speichereST();
			setState(677); match(WS);
			setState(678); ergebnisST();
			setState(679); match(WS);
			setState(680); zuST();
			setState(681); match(WS);
			setState(682); zwischenST();
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
			setState(684); ausgebenST();
			setState(685); match(WS);
			setState(686); folgendesST();
			setState(687); match(WS);
			setState(688); wortfolgeST();
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
			setState(690); ausgebenST();
			setState(691); match(WS);
			setState(692); leerzeileST();
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
			setState(694); ausgebenST();
			setState(695); match(WS);
			setState(696); leerzeichenST();
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
			setState(698); ausgebenST();
			setState(699); match(WS);
			setState(700); zahlST();
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
			setState(702); multipliziereST();
			setState(703); match(WS);
			setState(704); zahlST();
			setState(705); match(WS);
			setState(706); mitST();
			setState(707); match(WS);
			setState(708); zahlST();
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
			setState(710); dividiereST();
			setState(711); match(WS);
			setState(712); zahlST();
			setState(713); match(WS);
			setState(714); mitST();
			setState(715); match(WS);
			setState(716); zahlST();
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
			setState(718); subtrahiereST();
			setState(719); match(WS);
			setState(720); zahlST();
			setState(721); match(WS);
			setState(722); mitST();
			setState(723); match(WS);
			setState(724); zahlST();
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
			setState(726); addiereST();
			setState(727); match(WS);
			setState(728); zahlST();
			setState(729); match(WS);
			setState(730); mitST();
			setState(731); match(WS);
			setState(732); zahlST();
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
			setState(734); match(MIT);
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
			setState(736); match(IST);
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
			setState(738); match(HIER);
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
			setState(740);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742); match(ZU);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744); match(VON);
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
		enterRule(_localctx, 130, RULE_folgendesST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746); match(FOLGENDES);
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
			setState(752);
			switch (_input.LA(1)) {
			case GEBE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(748); match(GEBE);
				setState(749); match(WS);
				setState(750); match(AUS);
				}
				}
				break;
			case AUSGEBEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(751); match(AUSGEBEN);
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
			setState(754);
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
			setState(756);
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
			setState(758);
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
			setState(760);
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
			setState(762);
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
			setState(764);
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
			setState(766); match(VERGLEICHE);
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
			setState(772);
			switch (_input.LA(1)) {
			case SPRINGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(768); match(SPRINGE);
				}
				break;
			case GEBE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(769); match(GEBE);
				setState(770); match(WS);
				setState(771); match(ZU);
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
			setState(774); match(STELLE_WORT);
			setState(776);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(775); match(WS);
				}
				break;
			}
			setState(779);
			_la = _input.LA(1);
			if (_la==DP) {
				{
				setState(778); match(DP);
				}
			}

			setState(781); match(WS);
			setState(782); match(STELLE);
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
			setState(790);
			switch (_input.LA(1)) {
			case RUFE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(784); match(RUFE);
				setState(785); match(WS);
				setState(786); match(AUF);
				}
				}
				break;
			case MACHE:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(787); match(MACHE);
				setState(788); match(WS);
				setState(789); match(AUFRUF);
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
			setState(796);
			switch (_input.LA(1)) {
			case GEHE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(792); match(GEHE);
				setState(793); match(WS);
				setState(794); match(ZURÜCK);
				}
				}
				break;
			case ZURÜCKGEHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(795); match(ZURÜCKGEHEN);
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
			setState(798); match(SPEICHERE);
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
			setState(800);
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
			setState(802);
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
		public int reg;
		public Token POS_ZAHL;
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public TerminalNode REGISTER() { return getToken(TPS_ANTLRParser.REGISTER, 0); }
		public TerminalNode POS_ZAHL() { return getToken(TPS_ANTLRParser.POS_ZAHL, 0); }
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
			setState(804); match(REGISTER);
			setState(805); match(WS);
			setState(808);
			_la = _input.LA(1);
			if (_la==VON) {
				{
				setState(806); match(VON);
				setState(807); match(WS);
				}
			}

			setState(810); ((RegisterSTContext)_localctx).POS_ZAHL = match(POS_ZAHL);
			((RegisterSTContext)_localctx).reg =  Integer.parseInt(((RegisterSTContext)_localctx).POS_ZAHL.getText());
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
		public int regA;
		public int regB;
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
			setState(813); match(VON);
			setState(814); match(WS);
			{
			setState(815); ((BereichSTContext)_localctx).registerST = registerST();
			((BereichSTContext)_localctx).regA =  ((BereichSTContext)_localctx).registerST.reg;
			}
			setState(818); match(WS);
			setState(819); match(BIS);
			setState(820); match(WS);
			{
			setState(821); ((BereichSTContext)_localctx).registerST = registerST();
			((BereichSTContext)_localctx).regB =  ((BereichSTContext)_localctx).registerST.reg;
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
			setState(824); match(STAPEL);
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
			setState(826); match(NEHME);
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
		public long zahl;
		public Token POS_ZAHL;
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
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			_la = _input.LA(1);
			if (_la==NAGATION) {
				{
				setState(828); match(NAGATION);
				negieren = true;
				}
			}

			setState(832); ((ZahlSTContext)_localctx).POS_ZAHL = match(POS_ZAHL);
			 ((ZahlSTContext)_localctx).zahl =  (negieren ? ( - Long.parseLong(((ZahlSTContext)_localctx).POS_ZAHL.getText()) ): ( Long.parseLong(((ZahlSTContext)_localctx).POS_ZAHL.getText()) ) ) ;  
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
		public long zahl;
		public Token POS_ZAHL;
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
			enterOuterAlt(_localctx, 1);
			{
			setState(835); ((PosZahlSTContext)_localctx).POS_ZAHL = match(POS_ZAHL);
			((PosZahlSTContext)_localctx).zahl =  Long.parseLong(((PosZahlSTContext)_localctx).POS_ZAHL.getText());
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
			setState(838);
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
			setState(840); match(VERSION);
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
			setState(852);
			switch (_input.LA(1)) {
			case MAXIMALE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(842); match(MAXIMALE);
				setState(843); match(WS);
				setState(844); match(STAPEL);
				setState(845); match(WS);
				setState(846); match(GRÖẞE);
				}
				}
				break;
			case STAPEL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(847); match(STAPEL);
				setState(848); match(WS);
				setState(849); match(MAXIMUM);
				setState(850); match(WS);
				setState(851); match(GRÖẞE);
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
			setState(867);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(854); match(STAPEL);
				setState(855); match(WS);
				setState(856); match(GRÖẞE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(857); match(GRÖẞE);
				setState(858); match(WS);
				setState(859); match(DES);
				setState(860); match(WS);
				setState(861); match(STAPELS);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(862); match(GRÖẞE);
				setState(863); match(WS);
				setState(864); match(VOM);
				setState(865); match(WS);
				setState(866); match(STAPEL);
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
			setState(869); match(DER);
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
		public TerminalNode AUFRUF(int i) {
			return getToken(TPS_ANTLRParser.AUFRUF, i);
		}
		public List<TerminalNode> ODER() { return getTokens(TPS_ANTLRParser.ODER); }
		public TerminalNode UNGLEICH(int i) {
			return getToken(TPS_ANTLRParser.UNGLEICH, i);
		}
		public List<TerminalNode> ZAHL_WORT() { return getTokens(TPS_ANTLRParser.ZAHL_WORT); }
		public List<TerminalNode> FOLGENDES() { return getTokens(TPS_ANTLRParser.FOLGENDES); }
		public TerminalNode WORT_WORT(int i) {
			return getToken(TPS_ANTLRParser.WORT_WORT, i);
		}
		public List<TerminalNode> POS_ZAHL() { return getTokens(TPS_ANTLRParser.POS_ZAHL); }
		public List<TerminalNode> WORT_WORT() { return getTokens(TPS_ANTLRParser.WORT_WORT); }
		public List<TerminalNode> NICHT() { return getTokens(TPS_ANTLRParser.NICHT); }
		public TerminalNode AUSGEBEN(int i) {
			return getToken(TPS_ANTLRParser.AUSGEBEN, i);
		}
		public List<TerminalNode> REST_2() { return getTokens(TPS_ANTLRParser.REST_2); }
		public TerminalNode REGISTER(int i) {
			return getToken(TPS_ANTLRParser.REGISTER, i);
		}
		public TerminalNode LEERTASTE(int i) {
			return getToken(TPS_ANTLRParser.LEERTASTE, i);
		}
		public TerminalNode DIVIDIERE(int i) {
			return getToken(TPS_ANTLRParser.DIVIDIERE, i);
		}
		public TerminalNode VERSION(int i) {
			return getToken(TPS_ANTLRParser.VERSION, i);
		}
		public TerminalNode SPRINGE(int i) {
			return getToken(TPS_ANTLRParser.SPRINGE, i);
		}
		public TerminalNode WORTFOLGE_WORT(int i) {
			return getToken(TPS_ANTLRParser.WORTFOLGE_WORT, i);
		}
		public List<TerminalNode> GRÖẞER() { return getTokens(TPS_ANTLRParser.GRÖẞER); }
		public TerminalNode EIN(int i) {
			return getToken(TPS_ANTLRParser.EIN, i);
		}
		public TerminalNode DES(int i) {
			return getToken(TPS_ANTLRParser.DES, i);
		}
		public List<TerminalNode> GEHE() { return getTokens(TPS_ANTLRParser.GEHE); }
		public TerminalNode MENGE(int i) {
			return getToken(TPS_ANTLRParser.MENGE, i);
		}
		public TerminalNode ZEICHENFOLGE(int i) {
			return getToken(TPS_ANTLRParser.ZEICHENFOLGE, i);
		}
		public List<TerminalNode> ZWISCHENSPEICHER() { return getTokens(TPS_ANTLRParser.ZWISCHENSPEICHER); }
		public List<TerminalNode> DP() { return getTokens(TPS_ANTLRParser.DP); }
		public TerminalNode FOLGENDES(int i) {
			return getToken(TPS_ANTLRParser.FOLGENDES, i);
		}
		public TerminalNode DER(int i) {
			return getToken(TPS_ANTLRParser.DER, i);
		}
		public List<TerminalNode> SPRINGE() { return getTokens(TPS_ANTLRParser.SPRINGE); }
		public TerminalNode AUF(int i) {
			return getToken(TPS_ANTLRParser.AUF, i);
		}
		public List<TerminalNode> SUBTRAHIERE() { return getTokens(TPS_ANTLRParser.SUBTRAHIERE); }
		public List<TerminalNode> FALSCH() { return getTokens(TPS_ANTLRParser.FALSCH); }
		public List<TerminalNode> WENN() { return getTokens(TPS_ANTLRParser.WENN); }
		public TerminalNode MACHE(int i) {
			return getToken(TPS_ANTLRParser.MACHE, i);
		}
		public List<TerminalNode> WS() { return getTokens(TPS_ANTLRParser.WS); }
		public List<TerminalNode> ZU() { return getTokens(TPS_ANTLRParser.ZU); }
		public List<TerminalNode> UNGLEICH() { return getTokens(TPS_ANTLRParser.UNGLEICH); }
		public TerminalNode STELLE_WORT(int i) {
			return getToken(TPS_ANTLRParser.STELLE_WORT, i);
		}
		public List<TerminalNode> NEHME() { return getTokens(TPS_ANTLRParser.NEHME); }
		public TerminalNode LEERZEILE(int i) {
			return getToken(TPS_ANTLRParser.LEERZEILE, i);
		}
		public TerminalNode ZURÜCK(int i) {
			return getToken(TPS_ANTLRParser.ZURÜCK, i);
		}
		public List<TerminalNode> AUF() { return getTokens(TPS_ANTLRParser.AUF); }
		public TerminalNode FEHLER(int i) {
			return getToken(TPS_ANTLRParser.FEHLER, i);
		}
		public TerminalNode DP(int i) {
			return getToken(TPS_ANTLRParser.DP, i);
		}
		public TerminalNode ZWISCHEN(int i) {
			return getToken(TPS_ANTLRParser.ZWISCHEN, i);
		}
		public TerminalNode ADDIERE(int i) {
			return getToken(TPS_ANTLRParser.ADDIERE, i);
		}
		public TerminalNode BIS(int i) {
			return getToken(TPS_ANTLRParser.BIS, i);
		}
		public List<TerminalNode> DES() { return getTokens(TPS_ANTLRParser.DES); }
		public List<TerminalNode> LETZTEN() { return getTokens(TPS_ANTLRParser.LETZTEN); }
		public List<TerminalNode> STELLE_WORT() { return getTokens(TPS_ANTLRParser.STELLE_WORT); }
		public TerminalNode SUBTRAHIERE(int i) {
			return getToken(TPS_ANTLRParser.SUBTRAHIERE, i);
		}
		public TerminalNode IST(int i) {
			return getToken(TPS_ANTLRParser.IST, i);
		}
		public List<TerminalNode> REST() { return getTokens(TPS_ANTLRParser.REST); }
		public List<TerminalNode> STELLE() { return getTokens(TPS_ANTLRParser.STELLE); }
		public List<TerminalNode> BIS() { return getTokens(TPS_ANTLRParser.BIS); }
		public TerminalNode NICHT(int i) {
			return getToken(TPS_ANTLRParser.NICHT, i);
		}
		public List<TerminalNode> GEBE() { return getTokens(TPS_ANTLRParser.GEBE); }
		public List<TerminalNode> VERSION() { return getTokens(TPS_ANTLRParser.VERSION); }
		public TerminalNode ZWISCHENSPEICHER(int i) {
			return getToken(TPS_ANTLRParser.ZWISCHENSPEICHER, i);
		}
		public TerminalNode GAB(int i) {
			return getToken(TPS_ANTLRParser.GAB, i);
		}
		public TerminalNode WORTKETTE_WORT(int i) {
			return getToken(TPS_ANTLRParser.WORTKETTE_WORT, i);
		}
		public List<TerminalNode> RUFE() { return getTokens(TPS_ANTLRParser.RUFE); }
		public List<TerminalNode> SPEICHERE() { return getTokens(TPS_ANTLRParser.SPEICHERE); }
		public List<TerminalNode> LESE() { return getTokens(TPS_ANTLRParser.LESE); }
		public List<TerminalNode> LEERZEICHEN() { return getTokens(TPS_ANTLRParser.LEERZEICHEN); }
		public TerminalNode ERGEBNIS(int i) {
			return getToken(TPS_ANTLRParser.ERGEBNIS, i);
		}
		public TerminalNode MAXIMUM(int i) {
			return getToken(TPS_ANTLRParser.MAXIMUM, i);
		}
		public TerminalNode KLEINER(int i) {
			return getToken(TPS_ANTLRParser.KLEINER, i);
		}
		public TerminalNode SPEICHERE(int i) {
			return getToken(TPS_ANTLRParser.SPEICHERE, i);
		}
		public List<TerminalNode> GRÖẞE() { return getTokens(TPS_ANTLRParser.GRÖẞE); }
		public List<TerminalNode> LEERTASTE() { return getTokens(TPS_ANTLRParser.LEERTASTE); }
		public TerminalNode ODER(int i) {
			return getToken(TPS_ANTLRParser.ODER, i);
		}
		public TerminalNode GRÖẞER(int i) {
			return getToken(TPS_ANTLRParser.GRÖẞER, i);
		}
		public TerminalNode MIT(int i) {
			return getToken(TPS_ANTLRParser.MIT, i);
		}
		public List<TerminalNode> FALLS() { return getTokens(TPS_ANTLRParser.FALLS); }
		public TerminalNode WAR(int i) {
			return getToken(TPS_ANTLRParser.WAR, i);
		}
		public List<TerminalNode> HIER() { return getTokens(TPS_ANTLRParser.HIER); }
		public List<TerminalNode> VON() { return getTokens(TPS_ANTLRParser.VON); }
		public List<TerminalNode> PUNKT() { return getTokens(TPS_ANTLRParser.PUNKT); }
		public TerminalNode REST(int i) {
			return getToken(TPS_ANTLRParser.REST, i);
		}
		public TerminalNode FALSCH(int i) {
			return getToken(TPS_ANTLRParser.FALSCH, i);
		}
		public TerminalNode ZURÜCKGEHEN(int i) {
			return getToken(TPS_ANTLRParser.ZURÜCKGEHEN, i);
		}
		public TerminalNode LEERZEICHEN(int i) {
			return getToken(TPS_ANTLRParser.LEERZEICHEN, i);
		}
		public TerminalNode VON(int i) {
			return getToken(TPS_ANTLRParser.VON, i);
		}
		public List<TerminalNode> MENGE() { return getTokens(TPS_ANTLRParser.MENGE); }
		public List<TerminalNode> AUSGEBEN() { return getTokens(TPS_ANTLRParser.AUSGEBEN); }
		public TerminalNode WORTREIHE_WORT(int i) {
			return getToken(TPS_ANTLRParser.WORTREIHE_WORT, i);
		}
		public List<TerminalNode> ERGEBNISSPEICHER() { return getTokens(TPS_ANTLRParser.ERGEBNISSPEICHER); }
		public TerminalNode LESE(int i) {
			return getToken(TPS_ANTLRParser.LESE, i);
		}
		public List<TerminalNode> NAGATION() { return getTokens(TPS_ANTLRParser.NAGATION); }
		public TerminalNode GEBE(int i) {
			return getToken(TPS_ANTLRParser.GEBE, i);
		}
		public TerminalNode GLEICH(int i) {
			return getToken(TPS_ANTLRParser.GLEICH, i);
		}
		public TerminalNode ZAHL_WORT(int i) {
			return getToken(TPS_ANTLRParser.ZAHL_WORT, i);
		}
		public TerminalNode STAPELS(int i) {
			return getToken(TPS_ANTLRParser.STAPELS, i);
		}
		public TerminalNode GEHE(int i) {
			return getToken(TPS_ANTLRParser.GEHE, i);
		}
		public List<TerminalNode> ZEICHENKETTE() { return getTokens(TPS_ANTLRParser.ZEICHENKETTE); }
		public TerminalNode NEHME(int i) {
			return getToken(TPS_ANTLRParser.NEHME, i);
		}
		public List<TerminalNode> MACHE() { return getTokens(TPS_ANTLRParser.MACHE); }
		public TerminalNode FALLS(int i) {
			return getToken(TPS_ANTLRParser.FALLS, i);
		}
		public List<TerminalNode> FEHLER() { return getTokens(TPS_ANTLRParser.FEHLER); }
		public TerminalNode PUNKT(int i) {
			return getToken(TPS_ANTLRParser.PUNKT, i);
		}
		public TerminalNode ANZAHL(int i) {
			return getToken(TPS_ANTLRParser.ANZAHL, i);
		}
		public TerminalNode STAPEL(int i) {
			return getToken(TPS_ANTLRParser.STAPEL, i);
		}
		public List<TerminalNode> REGISTER() { return getTokens(TPS_ANTLRParser.REGISTER); }
		public List<TerminalNode> ZURÜCKGEHEN() { return getTokens(TPS_ANTLRParser.ZURÜCKGEHEN); }
		public List<TerminalNode> LEERZEILE() { return getTokens(TPS_ANTLRParser.LEERZEILE); }
		public TerminalNode ZEICHENKETTE(int i) {
			return getToken(TPS_ANTLRParser.ZEICHENKETTE, i);
		}
		public List<TerminalNode> DIVIDIERE() { return getTokens(TPS_ANTLRParser.DIVIDIERE); }
		public List<TerminalNode> MIT() { return getTokens(TPS_ANTLRParser.MIT); }
		public List<TerminalNode> MAXIMUM() { return getTokens(TPS_ANTLRParser.MAXIMUM); }
		public List<TerminalNode> IST() { return getTokens(TPS_ANTLRParser.IST); }
		public List<TerminalNode> DER() { return getTokens(TPS_ANTLRParser.DER); }
		public List<TerminalNode> AUFRUF() { return getTokens(TPS_ANTLRParser.AUFRUF); }
		public List<TerminalNode> EINESEN() { return getTokens(TPS_ANTLRParser.EINESEN); }
		public TerminalNode LETZTEN(int i) {
			return getToken(TPS_ANTLRParser.LETZTEN, i);
		}
		public List<TerminalNode> MULTIPLIZIERE() { return getTokens(TPS_ANTLRParser.MULTIPLIZIERE); }
		public TerminalNode WENN(int i) {
			return getToken(TPS_ANTLRParser.WENN, i);
		}
		public TerminalNode ERGEBNISSPEICHER(int i) {
			return getToken(TPS_ANTLRParser.ERGEBNISSPEICHER, i);
		}
		public TerminalNode HIER(int i) {
			return getToken(TPS_ANTLRParser.HIER, i);
		}
		public TerminalNode MAXIMALE(int i) {
			return getToken(TPS_ANTLRParser.MAXIMALE, i);
		}
		public List<TerminalNode> AUS() { return getTokens(TPS_ANTLRParser.AUS); }
		public TerminalNode AUS(int i) {
			return getToken(TPS_ANTLRParser.AUS, i);
		}
		public TerminalNode GRÖẞE(int i) {
			return getToken(TPS_ANTLRParser.GRÖẞE, i);
		}
		public TerminalNode ZEILENUMBRUCH(int i) {
			return getToken(TPS_ANTLRParser.ZEILENUMBRUCH, i);
		}
		public List<TerminalNode> WAR() { return getTokens(TPS_ANTLRParser.WAR); }
		public List<TerminalNode> ZEICHEN() { return getTokens(TPS_ANTLRParser.ZEICHEN); }
		public List<TerminalNode> KLEINER() { return getTokens(TPS_ANTLRParser.KLEINER); }
		public List<TerminalNode> ADDIERE() { return getTokens(TPS_ANTLRParser.ADDIERE); }
		public List<TerminalNode> ERGEBNIS() { return getTokens(TPS_ANTLRParser.ERGEBNIS); }
		public List<TerminalNode> GAB() { return getTokens(TPS_ANTLRParser.GAB); }
		public List<TerminalNode> ZWISCHEN() { return getTokens(TPS_ANTLRParser.ZWISCHEN); }
		public List<TerminalNode> WORTFOLGE_WORT() { return getTokens(TPS_ANTLRParser.WORTFOLGE_WORT); }
		public List<TerminalNode> STAPEL() { return getTokens(TPS_ANTLRParser.STAPEL); }
		public TerminalNode EINESEN(int i) {
			return getToken(TPS_ANTLRParser.EINESEN, i);
		}
		public TerminalNode VOM(int i) {
			return getToken(TPS_ANTLRParser.VOM, i);
		}
		public TerminalNode ZEICHEN(int i) {
			return getToken(TPS_ANTLRParser.ZEICHEN, i);
		}
		public List<TerminalNode> ZEICHENFOLGE() { return getTokens(TPS_ANTLRParser.ZEICHENFOLGE); }
		public List<TerminalNode> ANZAHL() { return getTokens(TPS_ANTLRParser.ANZAHL); }
		public List<TerminalNode> WORTREIHE_WORT() { return getTokens(TPS_ANTLRParser.WORTREIHE_WORT); }
		public List<TerminalNode> EIN() { return getTokens(TPS_ANTLRParser.EIN); }
		public List<TerminalNode> ZURÜCK() { return getTokens(TPS_ANTLRParser.ZURÜCK); }
		public List<TerminalNode> WORTKETTE_WORT() { return getTokens(TPS_ANTLRParser.WORTKETTE_WORT); }
		public TerminalNode NAGATION(int i) {
			return getToken(TPS_ANTLRParser.NAGATION, i);
		}
		public TerminalNode VERGLEICHE(int i) {
			return getToken(TPS_ANTLRParser.VERGLEICHE, i);
		}
		public List<TerminalNode> GLEICH() { return getTokens(TPS_ANTLRParser.GLEICH); }
		public TerminalNode WS(int i) {
			return getToken(TPS_ANTLRParser.WS, i);
		}
		public TerminalNode POS_ZAHL(int i) {
			return getToken(TPS_ANTLRParser.POS_ZAHL, i);
		}
		public TerminalNode MULTIPLIZIERE(int i) {
			return getToken(TPS_ANTLRParser.MULTIPLIZIERE, i);
		}
		public TerminalNode REST_2(int i) {
			return getToken(TPS_ANTLRParser.REST_2, i);
		}
		public List<TerminalNode> VERGLEICHE() { return getTokens(TPS_ANTLRParser.VERGLEICHE); }
		public List<TerminalNode> STAPELS() { return getTokens(TPS_ANTLRParser.STAPELS); }
		public TerminalNode ZU(int i) {
			return getToken(TPS_ANTLRParser.ZU, i);
		}
		public List<TerminalNode> VOM() { return getTokens(TPS_ANTLRParser.VOM); }
		public TerminalNode RUFE(int i) {
			return getToken(TPS_ANTLRParser.RUFE, i);
		}
		public List<TerminalNode> ZEILENUMBRUCH() { return getTokens(TPS_ANTLRParser.ZEILENUMBRUCH); }
		public List<TerminalNode> MAXIMALE() { return getTokens(TPS_ANTLRParser.MAXIMALE); }
		public TerminalNode STELLE(int i) {
			return getToken(TPS_ANTLRParser.STELLE, i);
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
		enterRule(_localctx, 184, RULE_wortfolgeST);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WORTREIHE_WORT) | (1L << WORTKETTE_WORT) | (1L << WORTFOLGE_WORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(879); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(872); match(WS);
					setState(876);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(873);
							_la = _input.LA(1);
							if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STELLE_WORT) | (1L << DER) | (1L << WORTREIHE_WORT) | (1L << WORTKETTE_WORT) | (1L << WORTFOLGE_WORT) | (1L << LETZTEN) | (1L << ZEICHEN) | (1L << ZEICHENFOLGE) | (1L << ZEICHENKETTE) | (1L << WORT_WORT) | (1L << MENGE) | (1L << ANZAHL) | (1L << ZAHL_WORT) | (1L << EINESEN) | (1L << EIN) | (1L << LESE) | (1L << ODER) | (1L << KLEINER) | (1L << GRÖẞER) | (1L << UNGLEICH) | (1L << NICHT) | (1L << GLEICH) | (1L << FALLS) | (1L << WENN) | (1L << DES) | (1L << STAPELS) | (1L << VOM) | (1L << MAXIMALE) | (1L << GRÖẞE) | (1L << MAXIMUM) | (1L << VERSION) | (1L << FEHLER) | (1L << FALSCH) | (1L << NAGATION) | (1L << NEHME) | (1L << STAPEL) | (1L << POS_ZAHL) | (1L << REGISTER) | (1L << BIS) | (1L << ERGEBNISSPEICHER) | (1L << ERGEBNIS) | (1L << ZWISCHEN) | (1L << ZWISCHENSPEICHER) | (1L << SPEICHERE) | (1L << GEHE) | (1L << ZURÜCKGEHEN) | (1L << ZURÜCK) | (1L << AUF) | (1L << AUFRUF) | (1L << MACHE) | (1L << RUFE) | (1L << DP) | (1L << SPRINGE) | (1L << VERGLEICHE) | (1L << DIVIDIERE) | (1L << MULTIPLIZIERE) | (1L << SUBTRAHIERE) | (1L << ADDIERE) | (1L << ZEILENUMBRUCH) | (1L << LEERZEILE) | (1L << LEERTASTE) | (1L << LEERZEICHEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AUS - 64)) | (1L << (AUSGEBEN - 64)) | (1L << (GEBE - 64)) | (1L << (FOLGENDES - 64)) | (1L << (VON - 64)) | (1L << (ZU - 64)) | (1L << (GAB - 64)) | (1L << (WAR - 64)) | (1L << (MIT - 64)) | (1L << (IST - 64)) | (1L << (HIER - 64)) | (1L << (PUNKT - 64)) | (1L << (STELLE - 64)) | (1L << (REST - 64)) | (1L << (REST_2 - 64)))) != 0)) ) {
							_errHandler.recoverInline(this);
							}
							consume();
							}
							} 
						}
						setState(878);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(881); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 186, RULE_wennST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
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
		enterRule(_localctx, 188, RULE_ungleichST);
		try {
			setState(889);
			switch (_input.LA(1)) {
			case UNGLEICH:
				enterOuterAlt(_localctx, 1);
				{
				setState(885); match(UNGLEICH);
				}
				break;
			case NICHT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(886); match(NICHT);
				setState(887); match(WS);
				setState(888); match(GLEICH);
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
		enterRule(_localctx, 190, RULE_gleichST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891); match(GLEICH);
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
		enterRule(_localctx, 192, RULE_größerST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893); match(GRÖẞER);
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
		enterRule(_localctx, 194, RULE_kleinerST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895); match(KLEINER);
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
		enterRule(_localctx, 196, RULE_größerGleichST);
		try {
			setState(907);
			switch (_input.LA(1)) {
			case GRÖẞER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(897); match(GRÖẞER);
				setState(898); match(WS);
				setState(899); match(ODER);
				setState(900); match(WS);
				setState(901); match(GLEICH);
				}
				}
				break;
			case GLEICH:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(902); match(GLEICH);
				setState(903); match(WS);
				setState(904); match(ODER);
				setState(905); match(WS);
				setState(906); match(GRÖẞER);
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
		enterRule(_localctx, 198, RULE_kleinerGleichST);
		try {
			setState(919);
			switch (_input.LA(1)) {
			case KLEINER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(909); match(KLEINER);
				setState(910); match(WS);
				setState(911); match(ODER);
				setState(912); match(WS);
				setState(913); match(GLEICH);
				}
				}
				break;
			case GLEICH:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(914); match(GLEICH);
				setState(915); match(WS);
				setState(916); match(ODER);
				setState(917); match(WS);
				setState(918); match(KLEINER);
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
		enterRule(_localctx, 200, RULE_einlesenST);
		try {
			setState(925);
			switch (_input.LA(1)) {
			case LESE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(921); match(LESE);
				setState(922); match(WS);
				setState(923); match(EIN);
				}
				}
				break;
			case EINESEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(924); match(EINESEN);
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
		enterRule(_localctx, 202, RULE_zahlST_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927); match(ZAHL_WORT);
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
		enterRule(_localctx, 204, RULE_registerST_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(929); match(REGISTER);
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
		enterRule(_localctx, 206, RULE_anzahlST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
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
		enterRule(_localctx, 208, RULE_wortST);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
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
		enterRule(_localctx, 210, RULE_zeichenST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935); match(ZEICHEN);
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
		enterRule(_localctx, 212, RULE_letztenFehlerST);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937); match(LETZTEN);
			setState(938); match(WS);
			setState(939); match(FEHLER);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\u03b0\4\2\t\2\4"+
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
		"k\4l\tl\3\2\3\2\5\2\u00db\n\2\6\2\u00dd\n\2\r\2\16\2\u00de\3\3\3\3\5\3"+
		"\u00e3\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u011f\n\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38\38\38\3"+
		"9\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3"+
		"D\3D\3D\3D\5D\u02f3\nD\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3"+
		"L\3L\3L\5L\u0307\nL\3M\3M\5M\u030b\nM\3M\5M\u030e\nM\3M\3M\3M\3N\3N\3"+
		"N\3N\3N\3N\5N\u0319\nN\3O\3O\3O\3O\5O\u031f\nO\3P\3P\3Q\3Q\3R\3R\3S\3"+
		"S\3S\3S\5S\u032b\nS\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3"+
		"V\3V\3W\3W\5W\u0341\nW\3W\3W\3W\3X\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3[\3[\3[\3"+
		"[\3[\3[\3[\3[\5[\u0357\n[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\"+
		"\3\\\3\\\5\\\u0366\n\\\3]\3]\3^\3^\3^\7^\u036d\n^\f^\16^\u0370\13^\6^"+
		"\u0372\n^\r^\16^\u0373\3_\3_\3`\3`\3`\3`\5`\u037c\n`\3a\3a\3b\3b\3c\3"+
		"c\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u038e\nd\3e\3e\3e\3e\3e\3e\3e\3e\3"+
		"e\3e\5e\u039a\ne\3f\3f\3f\3f\5f\u03a0\nf\3g\3g\3h\3h\3i\3i\3j\3j\3k\3"+
		"k\3l\3l\3l\3l\3l\2\2m\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\2\21\3\2HI\3\2@A\3\2>?\3\2==\3\2<<\3\2;;\3\2"+
		"::\3\2-.\3\2+,\3\2#$\3\2\6\b\3\2\4P\3\2\32\33\3\2\16\17\3\2\13\r\u038f"+
		"\2\u00dc\3\2\2\2\4\u00e0\3\2\2\2\6\u011e\3\2\2\2\b\u0120\3\2\2\2\n\u0124"+
		"\3\2\2\2\f\u0130\3\2\2\2\16\u013a\3\2\2\2\20\u0144\3\2\2\2\22\u014e\3"+
		"\2\2\2\24\u0156\3\2\2\2\26\u015c\3\2\2\2\30\u015e\3\2\2\2\32\u0168\3\2"+
		"\2\2\34\u0172\3\2\2\2\36\u017c\3\2\2\2 \u0186\3\2\2\2\"\u0190\3\2\2\2"+
		"$\u019a\3\2\2\2&\u01a0\3\2\2\2(\u01aa\3\2\2\2*\u01b2\3\2\2\2,\u01ba\3"+
		"\2\2\2.\u01c2\3\2\2\2\60\u01ca\3\2\2\2\62\u01d2\3\2\2\2\64\u01da\3\2\2"+
		"\2\66\u01e2\3\2\2\28\u01ea\3\2\2\2:\u01f2\3\2\2\2<\u01fa\3\2\2\2>\u0206"+
		"\3\2\2\2@\u0210\3\2\2\2B\u0218\3\2\2\2D\u021c\3\2\2\2F\u0224\3\2\2\2H"+
		"\u022c\3\2\2\2J\u0234\3\2\2\2L\u023c\3\2\2\2N\u0244\3\2\2\2P\u024a\3\2"+
		"\2\2R\u0250\3\2\2\2T\u0256\3\2\2\2V\u025c\3\2\2\2X\u0266\3\2\2\2Z\u0270"+
		"\3\2\2\2\\\u027a\3\2\2\2^\u0284\3\2\2\2`\u028e\3\2\2\2b\u0298\3\2\2\2"+
		"d\u029e\3\2\2\2f\u02a6\3\2\2\2h\u02ae\3\2\2\2j\u02b4\3\2\2\2l\u02b8\3"+
		"\2\2\2n\u02bc\3\2\2\2p\u02c0\3\2\2\2r\u02c8\3\2\2\2t\u02d0\3\2\2\2v\u02d8"+
		"\3\2\2\2x\u02e0\3\2\2\2z\u02e2\3\2\2\2|\u02e4\3\2\2\2~\u02e6\3\2\2\2\u0080"+
		"\u02e8\3\2\2\2\u0082\u02ea\3\2\2\2\u0084\u02ec\3\2\2\2\u0086\u02f2\3\2"+
		"\2\2\u0088\u02f4\3\2\2\2\u008a\u02f6\3\2\2\2\u008c\u02f8\3\2\2\2\u008e"+
		"\u02fa\3\2\2\2\u0090\u02fc\3\2\2\2\u0092\u02fe\3\2\2\2\u0094\u0300\3\2"+
		"\2\2\u0096\u0306\3\2\2\2\u0098\u0308\3\2\2\2\u009a\u0318\3\2\2\2\u009c"+
		"\u031e\3\2\2\2\u009e\u0320\3\2\2\2\u00a0\u0322\3\2\2\2\u00a2\u0324\3\2"+
		"\2\2\u00a4\u0326\3\2\2\2\u00a6\u032f\3\2\2\2\u00a8\u033a\3\2\2\2\u00aa"+
		"\u033c\3\2\2\2\u00ac\u0340\3\2\2\2\u00ae\u0345\3\2\2\2\u00b0\u0348\3\2"+
		"\2\2\u00b2\u034a\3\2\2\2\u00b4\u0356\3\2\2\2\u00b6\u0365\3\2\2\2\u00b8"+
		"\u0367\3\2\2\2\u00ba\u0369\3\2\2\2\u00bc\u0375\3\2\2\2\u00be\u037b\3\2"+
		"\2\2\u00c0\u037d\3\2\2\2\u00c2\u037f\3\2\2\2\u00c4\u0381\3\2\2\2\u00c6"+
		"\u038d\3\2\2\2\u00c8\u0399\3\2\2\2\u00ca\u039f\3\2\2\2\u00cc\u03a1\3\2"+
		"\2\2\u00ce\u03a3\3\2\2\2\u00d0\u03a5\3\2\2\2\u00d2\u03a7\3\2\2\2\u00d4"+
		"\u03a9\3\2\2\2\u00d6\u03ab\3\2\2\2\u00d8\u00da\5\4\3\2\u00d9\u00db\7\3"+
		"\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00d8\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\3\3\2\2\2\u00e0\u00e2\5\6\4\2\u00e1\u00e3\7\3\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7M\2\2\u00e5"+
		"\5\3\2\2\2\u00e6\u011f\5v<\2\u00e7\u011f\5t;\2\u00e8\u011f\5p9\2\u00e9"+
		"\u011f\5r:\2\u00ea\u011f\5n8\2\u00eb\u011f\5l\67\2\u00ec\u011f\5j\66\2"+
		"\u00ed\u011f\5h\65\2\u00ee\u011f\5f\64\2\u00ef\u011f\5d\63\2\u00f0\u011f"+
		"\5b\62\2\u00f1\u011f\5^\60\2\u00f2\u011f\5`\61\2\u00f3\u011f\5\\/\2\u00f4"+
		"\u011f\5Z.\2\u00f5\u011f\5X-\2\u00f6\u011f\5V,\2\u00f7\u011f\5T+\2\u00f8"+
		"\u011f\5R*\2\u00f9\u011f\5P)\2\u00fa\u011f\5N(\2\u00fb\u011f\5L\'\2\u00fc"+
		"\u011f\5J&\2\u00fd\u011f\5H%\2\u00fe\u011f\5F$\2\u00ff\u011f\5D#\2\u0100"+
		"\u011f\5B\"\2\u0101\u011f\5@!\2\u0102\u011f\5> \2\u0103\u011f\5<\37\2"+
		"\u0104\u011f\5:\36\2\u0105\u011f\5\66\34\2\u0106\u011f\58\35\2\u0107\u011f"+
		"\5\64\33\2\u0108\u011f\5\62\32\2\u0109\u011f\5\60\31\2\u010a\u011f\5."+
		"\30\2\u010b\u011f\5*\26\2\u010c\u011f\5,\27\2\u010d\u011f\5(\25\2\u010e"+
		"\u011f\5&\24\2\u010f\u011f\5$\23\2\u0110\u011f\5\"\22\2\u0111\u011f\5"+
		" \21\2\u0112\u011f\5\36\20\2\u0113\u011f\5\34\17\2\u0114\u011f\5\32\16"+
		"\2\u0115\u011f\5\30\r\2\u0116\u011f\5\26\f\2\u0117\u011f\5\24\13\2\u0118"+
		"\u011f\5\22\n\2\u0119\u011f\5\20\t\2\u011a\u011f\5\16\b\2\u011b\u011f"+
		"\5\f\7\2\u011c\u011f\5\n\6\2\u011d\u011f\5\b\5\2\u011e\u00e6\3\2\2\2\u011e"+
		"\u00e7\3\2\2\2\u011e\u00e8\3\2\2\2\u011e\u00e9\3\2\2\2\u011e\u00ea\3\2"+
		"\2\2\u011e\u00eb\3\2\2\2\u011e\u00ec\3\2\2\2\u011e\u00ed\3\2\2\2\u011e"+
		"\u00ee\3\2\2\2\u011e\u00ef\3\2\2\2\u011e\u00f0\3\2\2\2\u011e\u00f1\3\2"+
		"\2\2\u011e\u00f2\3\2\2\2\u011e\u00f3\3\2\2\2\u011e\u00f4\3\2\2\2\u011e"+
		"\u00f5\3\2\2\2\u011e\u00f6\3\2\2\2\u011e\u00f7\3\2\2\2\u011e\u00f8\3\2"+
		"\2\2\u011e\u00f9\3\2\2\2\u011e\u00fa\3\2\2\2\u011e\u00fb\3\2\2\2\u011e"+
		"\u00fc\3\2\2\2\u011e\u00fd\3\2\2\2\u011e\u00fe\3\2\2\2\u011e\u00ff\3\2"+
		"\2\2\u011e\u0100\3\2\2\2\u011e\u0101\3\2\2\2\u011e\u0102\3\2\2\2\u011e"+
		"\u0103\3\2\2\2\u011e\u0104\3\2\2\2\u011e\u0105\3\2\2\2\u011e\u0106\3\2"+
		"\2\2\u011e\u0107\3\2\2\2\u011e\u0108\3\2\2\2\u011e\u0109\3\2\2\2\u011e"+
		"\u010a\3\2\2\2\u011e\u010b\3\2\2\2\u011e\u010c\3\2\2\2\u011e\u010d\3\2"+
		"\2\2\u011e\u010e\3\2\2\2\u011e\u010f\3\2\2\2\u011e\u0110\3\2\2\2\u011e"+
		"\u0111\3\2\2\2\u011e\u0112\3\2\2\2\u011e\u0113\3\2\2\2\u011e\u0114\3\2"+
		"\2\2\u011e\u0115\3\2\2\2\u011e\u0116\3\2\2\2\u011e\u0117\3\2\2\2\u011e"+
		"\u0118\3\2\2\2\u011e\u0119\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011b\3\2"+
		"\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2\2\u011f\7\3\2\2\2\u0120\u0121"+
		"\5\u00aaV\2\u0121\u0122\7\3\2\2\u0122\u0123\5\u00d6l\2\u0123\t\3\2\2\2"+
		"\u0124\u0125\5\u00bc_\2\u0125\u0126\7\3\2\2\u0126\u0127\5\u00b0Y\2\u0127"+
		"\u0128\7\3\2\2\u0128\u0129\5~@\2\u0129\u012a\7\3\2\2\u012a\u012b\5\u009a"+
		"N\2\u012b\u012c\7\3\2\2\u012c\u012d\5\u0080A\2\u012d\u012e\7\3\2\2\u012e"+
		"\u012f\5\u0098M\2\u012f\13\3\2\2\2\u0130\u0131\5\u00aaV\2\u0131\u0132"+
		"\7\3\2\2\u0132\u0133\5\u0082B\2\u0133\u0134\7\3\2\2\u0134\u0135\5\u00a8"+
		"U\2\u0135\u0136\7\3\2\2\u0136\u0137\5\u0080A\2\u0137\u0138\7\3\2\2\u0138"+
		"\u0139\5\u00a4S\2\u0139\r\3\2\2\2\u013a\u013b\5\u00aaV\2\u013b\u013c\7"+
		"\3\2\2\u013c\u013d\5\u0082B\2\u013d\u013e\7\3\2\2\u013e\u013f\5\u00a8"+
		"U\2\u013f\u0140\7\3\2\2\u0140\u0141\5\u0080A\2\u0141\u0142\7\3\2\2\u0142"+
		"\u0143\5\u00a0Q\2\u0143\17\3\2\2\2\u0144\u0145\5\u00aaV\2\u0145\u0146"+
		"\7\3\2\2\u0146\u0147\5\u0082B\2\u0147\u0148\7\3\2\2\u0148\u0149\5\u00a8"+
		"U\2\u0149\u014a\7\3\2\2\u014a\u014b\5\u0080A\2\u014b\u014c\7\3\2\2\u014c"+
		"\u014d\5\u00a2R\2\u014d\21\3\2\2\2\u014e\u014f\5\u009eP\2\u014f\u0150"+
		"\7\3\2\2\u0150\u0151\5\u00acW\2\u0151\u0152\7\3\2\2\u0152\u0153\5\u0080"+
		"A\2\u0153\u0154\7\3\2\2\u0154\u0155\5\u00a8U\2\u0155\23\3\2\2\2\u0156"+
		"\u0157\5\u009aN\2\u0157\u0158\7\3\2\2\u0158\u0159\5\u0080A\2\u0159\u015a"+
		"\7\3\2\2\u015a\u015b\5\u00aeX\2\u015b\25\3\2\2\2\u015c\u015d\5\u009cO"+
		"\2\u015d\27\3\2\2\2\u015e\u015f\5\u00bc_\2\u015f\u0160\7\3\2\2\u0160\u0161"+
		"\5\u00c6d\2\u0161\u0162\7\3\2\2\u0162\u0163\5\u009aN\2\u0163\u0164\7\3"+
		"\2\2\u0164\u0165\5\u0080A\2\u0165\u0166\7\3\2\2\u0166\u0167\5\u0098M\2"+
		"\u0167\31\3\2\2\2\u0168\u0169\5\u00bc_\2\u0169\u016a\7\3\2\2\u016a\u016b"+
		"\5\u00c8e\2\u016b\u016c\7\3\2\2\u016c\u016d\5\u009aN\2\u016d\u016e\7\3"+
		"\2\2\u016e\u016f\5\u0080A\2\u016f\u0170\7\3\2\2\u0170\u0171\5\u0098M\2"+
		"\u0171\33\3\2\2\2\u0172\u0173\5\u00bc_\2\u0173\u0174\7\3\2\2\u0174\u0175"+
		"\5\u00c2b\2\u0175\u0176\7\3\2\2\u0176\u0177\5\u009aN\2\u0177\u0178\7\3"+
		"\2\2\u0178\u0179\5\u0080A\2\u0179\u017a\7\3\2\2\u017a\u017b\5\u0098M\2"+
		"\u017b\35\3\2\2\2\u017c\u017d\5\u00bc_\2\u017d\u017e\7\3\2\2\u017e\u017f"+
		"\5\u00c4c\2\u017f\u0180\7\3\2\2\u0180\u0181\5\u009aN\2\u0181\u0182\7\3"+
		"\2\2\u0182\u0183\5\u0080A\2\u0183\u0184\7\3\2\2\u0184\u0185\5\u0098M\2"+
		"\u0185\37\3\2\2\2\u0186\u0187\5\u00bc_\2\u0187\u0188\7\3\2\2\u0188\u0189"+
		"\5\u00be`\2\u0189\u018a\7\3\2\2\u018a\u018b\5\u009aN\2\u018b\u018c\7\3"+
		"\2\2\u018c\u018d\5\u0080A\2\u018d\u018e\7\3\2\2\u018e\u018f\5\u0098M\2"+
		"\u018f!\3\2\2\2\u0190\u0191\5\u00bc_\2\u0191\u0192\7\3\2\2\u0192\u0193"+
		"\5\u00c0a\2\u0193\u0194\7\3\2\2\u0194\u0195\5\u009aN\2\u0195\u0196\7\3"+
		"\2\2\u0196\u0197\5\u0080A\2\u0197\u0198\7\3\2\2\u0198\u0199\5\u0098M\2"+
		"\u0199#\3\2\2\2\u019a\u019b\5\u009aN\2\u019b\u019c\7\3\2\2\u019c\u019d"+
		"\5\u0080A\2\u019d\u019e\7\3\2\2\u019e\u019f\5\u0098M\2\u019f%\3\2\2\2"+
		"\u01a0\u01a1\5\u0094K\2\u01a1\u01a2\7\3\2\2\u01a2\u01a3\5\u00a6T\2\u01a3"+
		"\u01a4\7\3\2\2\u01a4\u01a5\5x=\2\u01a5\u01a6\7\3\2\2\u01a6\u01a7\5\u00b8"+
		"]\2\u01a7\u01a8\7\3\2\2\u01a8\u01a9\5\u00ba^\2\u01a9\'\3\2\2\2\u01aa\u01ab"+
		"\5\u0094K\2\u01ab\u01ac\7\3\2\2\u01ac\u01ad\5\u00a6T\2\u01ad\u01ae\7\3"+
		"\2\2\u01ae\u01af\5x=\2\u01af\u01b0\7\3\2\2\u01b0\u01b1\5\u00a6T\2\u01b1"+
		")\3\2\2\2\u01b2\u01b3\5\u009eP\2\u01b3\u01b4\7\3\2\2\u01b4\u01b5\5\u00b6"+
		"\\\2\u01b5\u01b6\7\3\2\2\u01b6\u01b7\5\u0080A\2\u01b7\u01b8\7\3\2\2\u01b8"+
		"\u01b9\5\u00a0Q\2\u01b9+\3\2\2\2\u01ba\u01bb\5\u009eP\2\u01bb\u01bc\7"+
		"\3\2\2\u01bc\u01bd\5\u00b6\\\2\u01bd\u01be\7\3\2\2\u01be\u01bf\5\u0080"+
		"A\2\u01bf\u01c0\7\3\2\2\u01c0\u01c1\5\u00a4S\2\u01c1-\3\2\2\2\u01c2\u01c3"+
		"\5\u009eP\2\u01c3\u01c4\7\3\2\2\u01c4\u01c5\5\u00b6\\\2\u01c5\u01c6\7"+
		"\3\2\2\u01c6\u01c7\5\u0080A\2\u01c7\u01c8\7\3\2\2\u01c8\u01c9\5\u00a2"+
		"R\2\u01c9/\3\2\2\2\u01ca\u01cb\5\u009eP\2\u01cb\u01cc\7\3\2\2\u01cc\u01cd"+
		"\5\u00b4[\2\u01cd\u01ce\7\3\2\2\u01ce\u01cf\5\u0080A\2\u01cf\u01d0\7\3"+
		"\2\2\u01d0\u01d1\5\u00a4S\2\u01d1\61\3\2\2\2\u01d2\u01d3\5\u009eP\2\u01d3"+
		"\u01d4\7\3\2\2\u01d4\u01d5\5\u00b4[\2\u01d5\u01d6\7\3\2\2\u01d6\u01d7"+
		"\5\u0080A\2\u01d7\u01d8\7\3\2\2\u01d8\u01d9\5\u00a0Q\2\u01d9\63\3\2\2"+
		"\2\u01da\u01db\5\u009eP\2\u01db\u01dc\7\3\2\2\u01dc\u01dd\5\u00b4[\2\u01dd"+
		"\u01de\7\3\2\2\u01de\u01df\5\u0080A\2\u01df\u01e0\7\3\2\2\u01e0\u01e1"+
		"\5\u00a2R\2\u01e1\65\3\2\2\2\u01e2\u01e3\5\u009eP\2\u01e3\u01e4\7\3\2"+
		"\2\u01e4\u01e5\5\u00b2Z\2\u01e5\u01e6\7\3\2\2\u01e6\u01e7\5\u0080A\2\u01e7"+
		"\u01e8\7\3\2\2\u01e8\u01e9\5\u00a0Q\2\u01e9\67\3\2\2\2\u01ea\u01eb\5\u009e"+
		"P\2\u01eb\u01ec\7\3\2\2\u01ec\u01ed\5\u00b2Z\2\u01ed\u01ee\7\3\2\2\u01ee"+
		"\u01ef\5\u0080A\2\u01ef\u01f0\7\3\2\2\u01f0\u01f1\5\u00a4S\2\u01f19\3"+
		"\2\2\2\u01f2\u01f3\5\u009eP\2\u01f3\u01f4\7\3\2\2\u01f4\u01f5\5\u00b2"+
		"Z\2\u01f5\u01f6\7\3\2\2\u01f6\u01f7\5\u0080A\2\u01f7\u01f8\7\3\2\2\u01f8"+
		"\u01f9\5\u00a2R\2\u01f9;\3\2\2\2\u01fa\u01fb\5\u00bc_\2\u01fb\u01fc\7"+
		"\3\2\2\u01fc\u01fd\5\u00b0Y\2\u01fd\u01fe\7\3\2\2\u01fe\u01ff\5~@\2\u01ff"+
		"\u0200\7\3\2\2\u0200\u0201\5\u0096L\2\u0201\u0202\7\3\2\2\u0202\u0203"+
		"\5\u0080A\2\u0203\u0204\7\3\2\2\u0204\u0205\5\u0098M\2\u0205=\3\2\2\2"+
		"\u0206\u0207\5\u00caf\2\u0207\u0208\7\3\2\2\u0208\u0209\5\u00aeX\2\u0209"+
		"\u020a\7\3\2\2\u020a\u020b\5\u00d4k\2\u020b\u020c\7\3\2\2\u020c\u020d"+
		"\5\u0080A\2\u020d\u020e\7\3\2\2\u020e\u020f\5\u00a4S\2\u020f?\3\2\2\2"+
		"\u0210\u0211\5\u00caf\2\u0211\u0212\7\3\2\2\u0212\u0213\5\u00d2j\2\u0213"+
		"\u0214\7\3\2\2\u0214\u0215\5\u0080A\2\u0215\u0216\7\3\2\2\u0216\u0217"+
		"\5\u00a4S\2\u0217A\3\2\2\2\u0218\u0219\5\u0086D\2\u0219\u021a\7\3\2\2"+
		"\u021a\u021b\5\u00a6T\2\u021bC\3\2\2\2\u021c\u021d\5\u009eP\2\u021d\u021e"+
		"\7\3\2\2\u021e\u021f\5\u00d0i\2\u021f\u0220\7\3\2\2\u0220\u0221\5\u00ce"+
		"h\2\u0221\u0222\7\3\2\2\u0222\u0223\5\u00a0Q\2\u0223E\3\2\2\2\u0224\u0225"+
		"\5\u009eP\2\u0225\u0226\7\3\2\2\u0226\u0227\5\u00d0i\2\u0227\u0228\7\3"+
		"\2\2\u0228\u0229\5\u00ceh\2\u0229\u022a\7\3\2\2\u022a\u022b\5\u00a2R\2"+
		"\u022bG\3\2\2\2\u022c\u022d\5\u009eP\2\u022d\u022e\7\3\2\2\u022e\u022f"+
		"\5\u00a4S\2\u022f\u0230\7\3\2\2\u0230\u0231\5\u0080A\2\u0231\u0232\7\3"+
		"\2\2\u0232\u0233\5\u00a0Q\2\u0233I\3\2\2\2\u0234\u0235\5\u009eP\2\u0235"+
		"\u0236\7\3\2\2\u0236\u0237\5\u00a4S\2\u0237\u0238\7\3\2\2\u0238\u0239"+
		"\5\u0080A\2\u0239\u023a\7\3\2\2\u023a\u023b\5\u00a2R\2\u023bK\3\2\2\2"+
		"\u023c\u023d\5\u009eP\2\u023d\u023e\7\3\2\2\u023e\u023f\5\u00acW\2\u023f"+
		"\u0240\7\3\2\2\u0240\u0241\5\u0080A\2\u0241\u0242\7\3\2\2\u0242\u0243"+
		"\5\u00a4S\2\u0243M\3\2\2\2\u0244\u0245\5\u00caf\2\u0245\u0246\7\3\2\2"+
		"\u0246\u0247\5\u00ccg\2\u0247\u0248\7\3\2\2\u0248\u0249\5\u00a0Q\2\u0249"+
		"O\3\2\2\2\u024a\u024b\5\u00caf\2\u024b\u024c\7\3\2\2\u024c\u024d\5\u00cc"+
		"g\2\u024d\u024e\7\3\2\2\u024e\u024f\5\u00a2R\2\u024fQ\3\2\2\2\u0250\u0251"+
		"\5|?\2\u0251\u0252\7\3\2\2\u0252\u0253\5z>\2\u0253\u0254\7\3\2\2\u0254"+
		"\u0255\5\u0098M\2\u0255S\3\2\2\2\u0256\u0257\5\u0096L\2\u0257\u0258\7"+
		"\3\2\2\u0258\u0259\5\u0080A\2\u0259\u025a\7\3\2\2\u025a\u025b\5\u00ae"+
		"X\2\u025bU\3\2\2\2\u025c\u025d\5\u00bc_\2\u025d\u025e\7\3\2\2\u025e\u025f"+
		"\5\u00c2b\2\u025f\u0260\7\3\2\2\u0260\u0261\5\u0096L\2\u0261\u0262\7\3"+
		"\2\2\u0262\u0263\5\u0080A\2\u0263\u0264\7\3\2\2\u0264\u0265\5\u0098M\2"+
		"\u0265W\3\2\2\2\u0266\u0267\5\u00bc_\2\u0267\u0268\7\3\2\2\u0268\u0269"+
		"\5\u00c8e\2\u0269\u026a\7\3\2\2\u026a\u026b\5\u0096L\2\u026b\u026c\7\3"+
		"\2\2\u026c\u026d\5\u0080A\2\u026d\u026e\7\3\2\2\u026e\u026f\5\u0098M\2"+
		"\u026fY\3\2\2\2\u0270\u0271\5\u00bc_\2\u0271\u0272\7\3\2\2\u0272\u0273"+
		"\5\u00c2b\2\u0273\u0274\7\3\2\2\u0274\u0275\5\u0096L\2\u0275\u0276\7\3"+
		"\2\2\u0276\u0277\5\u0080A\2\u0277\u0278\7\3\2\2\u0278\u0279\5\u0098M\2"+
		"\u0279[\3\2\2\2\u027a\u027b\5\u00bc_\2\u027b\u027c\7\3\2\2\u027c\u027d"+
		"\5\u00c4c\2\u027d\u027e\7\3\2\2\u027e\u027f\5\u0096L\2\u027f\u0280\7\3"+
		"\2\2\u0280\u0281\5\u0080A\2\u0281\u0282\7\3\2\2\u0282\u0283\5\u0098M\2"+
		"\u0283]\3\2\2\2\u0284\u0285\5\u00bc_\2\u0285\u0286\7\3\2\2\u0286\u0287"+
		"\5\u00be`\2\u0287\u0288\7\3\2\2\u0288\u0289\5\u0096L\2\u0289\u028a\7\3"+
		"\2\2\u028a\u028b\5\u0080A\2\u028b\u028c\7\3\2\2\u028c\u028d\5\u0098M\2"+
		"\u028d_\3\2\2\2\u028e\u028f\5\u00bc_\2\u028f\u0290\7\3\2\2\u0290\u0291"+
		"\5\u00c0a\2\u0291\u0292\7\3\2\2\u0292\u0293\5\u0096L\2\u0293\u0294\7\3"+
		"\2\2\u0294\u0295\5\u0080A\2\u0295\u0296\7\3\2\2\u0296\u0297\5\u0098M\2"+
		"\u0297a\3\2\2\2\u0298\u0299\5\u0096L\2\u0299\u029a\7\3\2\2\u029a\u029b"+
		"\5\u0080A\2\u029b\u029c\7\3\2\2\u029c\u029d\5\u0098M\2\u029dc\3\2\2\2"+
		"\u029e\u029f\5\u0094K\2\u029f\u02a0\7\3\2\2\u02a0\u02a1\5\u00acW\2\u02a1"+
		"\u02a2\7\3\2\2\u02a2\u02a3\5x=\2\u02a3\u02a4\7\3\2\2\u02a4\u02a5\5\u00ac"+
		"W\2\u02a5e\3\2\2\2\u02a6\u02a7\5\u009eP\2\u02a7\u02a8\7\3\2\2\u02a8\u02a9"+
		"\5\u00a2R\2\u02a9\u02aa\7\3\2\2\u02aa\u02ab\5\u0080A\2\u02ab\u02ac\7\3"+
		"\2\2\u02ac\u02ad\5\u00a0Q\2\u02adg\3\2\2\2\u02ae\u02af\5\u0086D\2\u02af"+
		"\u02b0\7\3\2\2\u02b0\u02b1\5\u0084C\2\u02b1\u02b2\7\3\2\2\u02b2\u02b3"+
		"\5\u00ba^\2\u02b3i\3\2\2\2\u02b4\u02b5\5\u0086D\2\u02b5\u02b6\7\3\2\2"+
		"\u02b6\u02b7\5\u008aF\2\u02b7k\3\2\2\2\u02b8\u02b9\5\u0086D\2\u02b9\u02ba"+
		"\7\3\2\2\u02ba\u02bb\5\u0088E\2\u02bbm\3\2\2\2\u02bc\u02bd\5\u0086D\2"+
		"\u02bd\u02be\7\3\2\2\u02be\u02bf\5\u00acW\2\u02bfo\3\2\2\2\u02c0\u02c1"+
		"\5\u0090I\2\u02c1\u02c2\7\3\2\2\u02c2\u02c3\5\u00acW\2\u02c3\u02c4\7\3"+
		"\2\2\u02c4\u02c5\5x=\2\u02c5\u02c6\7\3\2\2\u02c6\u02c7\5\u00acW\2\u02c7"+
		"q\3\2\2\2\u02c8\u02c9\5\u0092J\2\u02c9\u02ca\7\3\2\2\u02ca\u02cb\5\u00ac"+
		"W\2\u02cb\u02cc\7\3\2\2\u02cc\u02cd\5x=\2\u02cd\u02ce\7\3\2\2\u02ce\u02cf"+
		"\5\u00acW\2\u02cfs\3\2\2\2\u02d0\u02d1\5\u008eH\2\u02d1\u02d2\7\3\2\2"+
		"\u02d2\u02d3\5\u00acW\2\u02d3\u02d4\7\3\2\2\u02d4\u02d5\5x=\2\u02d5\u02d6"+
		"\7\3\2\2\u02d6\u02d7\5\u00acW\2\u02d7u\3\2\2\2\u02d8\u02d9\5\u008cG\2"+
		"\u02d9\u02da\7\3\2\2\u02da\u02db\5\u00acW\2\u02db\u02dc\7\3\2\2\u02dc"+
		"\u02dd\5x=\2\u02dd\u02de\7\3\2\2\u02de\u02df\5\u00acW\2\u02dfw\3\2\2\2"+
		"\u02e0\u02e1\7J\2\2\u02e1y\3\2\2\2\u02e2\u02e3\7K\2\2\u02e3{\3\2\2\2\u02e4"+
		"\u02e5\7L\2\2\u02e5}\3\2\2\2\u02e6\u02e7\t\2\2\2\u02e7\177\3\2\2\2\u02e8"+
		"\u02e9\7G\2\2\u02e9\u0081\3\2\2\2\u02ea\u02eb\7F\2\2\u02eb\u0083\3\2\2"+
		"\2\u02ec\u02ed\7E\2\2\u02ed\u0085\3\2\2\2\u02ee\u02ef\7D\2\2\u02ef\u02f0"+
		"\7\3\2\2\u02f0\u02f3\7B\2\2\u02f1\u02f3\7C\2\2\u02f2\u02ee\3\2\2\2\u02f2"+
		"\u02f1\3\2\2\2\u02f3\u0087\3\2\2\2\u02f4\u02f5\t\3\2\2\u02f5\u0089\3\2"+
		"\2\2\u02f6\u02f7\t\4\2\2\u02f7\u008b\3\2\2\2\u02f8\u02f9\t\5\2\2\u02f9"+
		"\u008d\3\2\2\2\u02fa\u02fb\t\6\2\2\u02fb\u008f\3\2\2\2\u02fc\u02fd\t\7"+
		"\2\2\u02fd\u0091\3\2\2\2\u02fe\u02ff\t\b\2\2\u02ff\u0093\3\2\2\2\u0300"+
		"\u0301\79\2\2\u0301\u0095\3\2\2\2\u0302\u0307\78\2\2\u0303\u0304\7D\2"+
		"\2\u0304\u0305\7\3\2\2\u0305\u0307\7G\2\2\u0306\u0302\3\2\2\2\u0306\u0303"+
		"\3\2\2\2\u0307\u0097\3\2\2\2\u0308\u030a\7\4\2\2\u0309\u030b\7\3\2\2\u030a"+
		"\u0309\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u030e\7\67"+
		"\2\2\u030d\u030c\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u0310\7\3\2\2\u0310\u0311\7N\2\2\u0311\u0099\3\2\2\2\u0312\u0313\7\66"+
		"\2\2\u0313\u0314\7\3\2\2\u0314\u0319\7\63\2\2\u0315\u0316\7\65\2\2\u0316"+
		"\u0317\7\3\2\2\u0317\u0319\7\64\2\2\u0318\u0312\3\2\2\2\u0318\u0315\3"+
		"\2\2\2\u0319\u009b\3\2\2\2\u031a\u031b\7\60\2\2\u031b\u031c\7\3\2\2\u031c"+
		"\u031f\7\62\2\2\u031d\u031f\7\61\2\2\u031e\u031a\3\2\2\2\u031e\u031d\3"+
		"\2\2\2\u031f\u009d\3\2\2\2\u0320\u0321\7/\2\2\u0321\u009f\3\2\2\2\u0322"+
		"\u0323\t\t\2\2\u0323\u00a1\3\2\2\2\u0324\u0325\t\n\2\2\u0325\u00a3\3\2"+
		"\2\2\u0326\u0327\7)\2\2\u0327\u032a\7\3\2\2\u0328\u0329\7F\2\2\u0329\u032b"+
		"\7\3\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u032d\7(\2\2\u032d\u032e\bS\1\2\u032e\u00a5\3\2\2\2\u032f\u0330\7F\2"+
		"\2\u0330\u0331\7\3\2\2\u0331\u0332\5\u00a4S\2\u0332\u0333\bT\1\2\u0333"+
		"\u0334\3\2\2\2\u0334\u0335\7\3\2\2\u0335\u0336\7*\2\2\u0336\u0337\7\3"+
		"\2\2\u0337\u0338\5\u00a4S\2\u0338\u0339\bT\1\2\u0339\u00a7\3\2\2\2\u033a"+
		"\u033b\7\'\2\2\u033b\u00a9\3\2\2\2\u033c\u033d\7&\2\2\u033d\u00ab\3\2"+
		"\2\2\u033e\u033f\7%\2\2\u033f\u0341\bW\1\2\u0340\u033e\3\2\2\2\u0340\u0341"+
		"\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\7(\2\2\u0343\u0344\bW\1\2\u0344"+
		"\u00ad\3\2\2\2\u0345\u0346\7(\2\2\u0346\u0347\bX\1\2\u0347\u00af\3\2\2"+
		"\2\u0348\u0349\t\13\2\2\u0349\u00b1\3\2\2\2\u034a\u034b\7\"\2\2\u034b"+
		"\u00b3\3\2\2\2\u034c\u034d\7\37\2\2\u034d\u034e\7\3\2\2\u034e\u034f\7"+
		"\'\2\2\u034f\u0350\7\3\2\2\u0350\u0357\7 \2\2\u0351\u0352\7\'\2\2\u0352"+
		"\u0353\7\3\2\2\u0353\u0354\7!\2\2\u0354\u0355\7\3\2\2\u0355\u0357\7 \2"+
		"\2\u0356\u034c\3\2\2\2\u0356\u0351\3\2\2\2\u0357\u00b5\3\2\2\2\u0358\u0359"+
		"\7\'\2\2\u0359\u035a\7\3\2\2\u035a\u0366\7 \2\2\u035b\u035c\7 \2\2\u035c"+
		"\u035d\7\3\2\2\u035d\u035e\7\34\2\2\u035e\u035f\7\3\2\2\u035f\u0366\7"+
		"\35\2\2\u0360\u0361\7 \2\2\u0361\u0362\7\3\2\2\u0362\u0363\7\36\2\2\u0363"+
		"\u0364\7\3\2\2\u0364\u0366\7\'\2\2\u0365\u0358\3\2\2\2\u0365\u035b\3\2"+
		"\2\2\u0365\u0360\3\2\2\2\u0366\u00b7\3\2\2\2\u0367\u0368\7\5\2\2\u0368"+
		"\u00b9\3\2\2\2\u0369\u0371\t\f\2\2\u036a\u036e\7\3\2\2\u036b\u036d\t\r"+
		"\2\2\u036c\u036b\3\2\2\2\u036d\u0370\3\2\2\2\u036e\u036c\3\2\2\2\u036e"+
		"\u036f\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0371\u036a\3\2"+
		"\2\2\u0372\u0373\3\2\2\2\u0373\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u00bb\3\2\2\2\u0375\u0376\t\16\2\2\u0376\u00bd\3\2\2\2\u0377\u037c\7"+
		"\27\2\2\u0378\u0379\7\30\2\2\u0379\u037a\7\3\2\2\u037a\u037c\7\31\2\2"+
		"\u037b\u0377\3\2\2\2\u037b\u0378\3\2\2\2\u037c\u00bf\3\2\2\2\u037d\u037e"+
		"\7\31\2\2\u037e\u00c1\3\2\2\2\u037f\u0380\7\26\2\2\u0380\u00c3\3\2\2\2"+
		"\u0381\u0382\7\25\2\2\u0382\u00c5\3\2\2\2\u0383\u0384\7\26\2\2\u0384\u0385"+
		"\7\3\2\2\u0385\u0386\7\24\2\2\u0386\u0387\7\3\2\2\u0387\u038e\7\31\2\2"+
		"\u0388\u0389\7\31\2\2\u0389\u038a\7\3\2\2\u038a\u038b\7\24\2\2\u038b\u038c"+
		"\7\3\2\2\u038c\u038e\7\26\2\2\u038d\u0383\3\2\2\2\u038d\u0388\3\2\2\2"+
		"\u038e\u00c7\3\2\2\2\u038f\u0390\7\25\2\2\u0390\u0391\7\3\2\2\u0391\u0392"+
		"\7\24\2\2\u0392\u0393\7\3\2\2\u0393\u039a\7\31\2\2\u0394\u0395\7\31\2"+
		"\2\u0395\u0396\7\3\2\2\u0396\u0397\7\24\2\2\u0397\u0398\7\3\2\2\u0398"+
		"\u039a\7\25\2\2\u0399\u038f\3\2\2\2\u0399\u0394\3\2\2\2\u039a\u00c9\3"+
		"\2\2\2\u039b\u039c\7\23\2\2\u039c\u039d\7\3\2\2\u039d\u03a0\7\22\2\2\u039e"+
		"\u03a0\7\21\2\2\u039f\u039b\3\2\2\2\u039f\u039e\3\2\2\2\u03a0\u00cb\3"+
		"\2\2\2\u03a1\u03a2\7\20\2\2\u03a2\u00cd\3\2\2\2\u03a3\u03a4\7)\2\2\u03a4"+
		"\u00cf\3\2\2\2\u03a5\u03a6\t\17\2\2\u03a6\u00d1\3\2\2\2\u03a7\u03a8\t"+
		"\20\2\2\u03a8\u00d3\3\2\2\2\u03a9\u03aa\7\n\2\2\u03aa\u00d5\3\2\2\2\u03ab"+
		"\u03ac\7\t\2\2\u03ac\u03ad\7\3\2\2\u03ad\u03ae\7#\2\2\u03ae\u00d7\3\2"+
		"\2\2\26\u00da\u00de\u00e2\u011e\u02f2\u0306\u030a\u030d\u0318\u031e\u032a"+
		"\u0340\u0356\u0365\u036e\u0373\u037b\u038d\u0399\u039f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}