// Generated from TPS_ANTLR.g4 by ANTLR 4.4

package genearatedsources.antlr;

import de.hechler.patrick.tps.antlr.enums.*;
import de.hechler.patrick.tps.antlr.objects.*;
import de.hechler.patrick.tps.antlr.objects.satz.*;

import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TPS_ANTLRParser}.
 */
public interface TPS_ANTLRListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#letzterFehler}.
	 * @param ctx the parse tree
	 */
	void enterLetzterFehler(@NotNull TPS_ANTLRParser.LetzterFehlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#letzterFehler}.
	 * @param ctx the parse tree
	 */
	void exitLetzterFehler(@NotNull TPS_ANTLRParser.LetzterFehlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#leerzeichen}.
	 * @param ctx the parse tree
	 */
	void enterLeerzeichen(@NotNull TPS_ANTLRParser.LeerzeichenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#leerzeichen}.
	 * @param ctx the parse tree
	 */
	void exitLeerzeichen(@NotNull TPS_ANTLRParser.LeerzeichenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#rufeAufWennKleiner}.
	 * @param ctx the parse tree
	 */
	void enterRufeAufWennKleiner(@NotNull TPS_ANTLRParser.RufeAufWennKleinerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#rufeAufWennKleiner}.
	 * @param ctx the parse tree
	 */
	void exitRufeAufWennKleiner(@NotNull TPS_ANTLRParser.RufeAufWennKleinerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#springeWennNichtGleich}.
	 * @param ctx the parse tree
	 */
	void enterSpringeWennNichtGleich(@NotNull TPS_ANTLRParser.SpringeWennNichtGleichContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#springeWennNichtGleich}.
	 * @param ctx the parse tree
	 */
	void exitSpringeWennNichtGleich(@NotNull TPS_ANTLRParser.SpringeWennNichtGleichContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stapelGrErg}.
	 * @param ctx the parse tree
	 */
	void enterStapelGrErg(@NotNull TPS_ANTLRParser.StapelGrErgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stapelGrErg}.
	 * @param ctx the parse tree
	 */
	void exitStapelGrErg(@NotNull TPS_ANTLRParser.StapelGrErgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#zwischenspeicher}.
	 * @param ctx the parse tree
	 */
	void enterZwischenspeicher(@NotNull TPS_ANTLRParser.ZwischenspeicherContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#zwischenspeicher}.
	 * @param ctx the parse tree
	 */
	void exitZwischenspeicher(@NotNull TPS_ANTLRParser.ZwischenspeicherContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#rufeAufKleinerGleich}.
	 * @param ctx the parse tree
	 */
	void enterRufeAufKleinerGleich(@NotNull TPS_ANTLRParser.RufeAufKleinerGleichContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#rufeAufKleinerGleich}.
	 * @param ctx the parse tree
	 */
	void exitRufeAufKleinerGleich(@NotNull TPS_ANTLRParser.RufeAufKleinerGleichContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#versionZw}.
	 * @param ctx the parse tree
	 */
	void enterVersionZw(@NotNull TPS_ANTLRParser.VersionZwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#versionZw}.
	 * @param ctx the parse tree
	 */
	void exitVersionZw(@NotNull TPS_ANTLRParser.VersionZwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#registerZeichenEinlesen}.
	 * @param ctx the parse tree
	 */
	void enterRegisterZeichenEinlesen(@NotNull TPS_ANTLRParser.RegisterZeichenEinlesenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#registerZeichenEinlesen}.
	 * @param ctx the parse tree
	 */
	void exitRegisterZeichenEinlesen(@NotNull TPS_ANTLRParser.RegisterZeichenEinlesenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#addiereST}.
	 * @param ctx the parse tree
	 */
	void enterAddiereST(@NotNull TPS_ANTLRParser.AddiereSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#addiereST}.
	 * @param ctx the parse tree
	 */
	void exitAddiereST(@NotNull TPS_ANTLRParser.AddiereSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#vergleichST}.
	 * @param ctx the parse tree
	 */
	void enterVergleichST(@NotNull TPS_ANTLRParser.VergleichSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#vergleichST}.
	 * @param ctx the parse tree
	 */
	void exitVergleichST(@NotNull TPS_ANTLRParser.VergleichSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#versionST}.
	 * @param ctx the parse tree
	 */
	void enterVersionST(@NotNull TPS_ANTLRParser.VersionSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#versionST}.
	 * @param ctx the parse tree
	 */
	void exitVersionST(@NotNull TPS_ANTLRParser.VersionSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#springeZuDirekt}.
	 * @param ctx the parse tree
	 */
	void enterSpringeZuDirekt(@NotNull TPS_ANTLRParser.SpringeZuDirektContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#springeZuDirekt}.
	 * @param ctx the parse tree
	 */
	void exitSpringeZuDirekt(@NotNull TPS_ANTLRParser.SpringeZuDirektContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#registerWortEinlesen}.
	 * @param ctx the parse tree
	 */
	void enterRegisterWortEinlesen(@NotNull TPS_ANTLRParser.RegisterWortEinlesenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#registerWortEinlesen}.
	 * @param ctx the parse tree
	 */
	void exitRegisterWortEinlesen(@NotNull TPS_ANTLRParser.RegisterWortEinlesenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#hierST}.
	 * @param ctx the parse tree
	 */
	void enterHierST(@NotNull TPS_ANTLRParser.HierSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#hierST}.
	 * @param ctx the parse tree
	 */
	void exitHierST(@NotNull TPS_ANTLRParser.HierSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#springeWennGr}.
	 * @param ctx the parse tree
	 */
	void enterSpringeWennGr(@NotNull TPS_ANTLRParser.SpringeWennGrContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#springeWennGr}.
	 * @param ctx the parse tree
	 */
	void exitSpringeWennGr(@NotNull TPS_ANTLRParser.SpringeWennGrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#größerGleichST}.
	 * @param ctx the parse tree
	 */
	void enterGrößerGleichST(@NotNull TPS_ANTLRParser.GrößerGleichSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#größerGleichST}.
	 * @param ctx the parse tree
	 */
	void exitGrößerGleichST(@NotNull TPS_ANTLRParser.GrößerGleichSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stelleVorTextST}.
	 * @param ctx the parse tree
	 */
	void enterStelleVorTextST(@NotNull TPS_ANTLRParser.StelleVorTextSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stelleVorTextST}.
	 * @param ctx the parse tree
	 */
	void exitStelleVorTextST(@NotNull TPS_ANTLRParser.StelleVorTextSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#satzWert}.
	 * @param ctx the parse tree
	 */
	void enterSatzWert(@NotNull TPS_ANTLRParser.SatzWertContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#satzWert}.
	 * @param ctx the parse tree
	 */
	void exitSatzWert(@NotNull TPS_ANTLRParser.SatzWertContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#ladeVomRegisterErg}.
	 * @param ctx the parse tree
	 */
	void enterLadeVomRegisterErg(@NotNull TPS_ANTLRParser.LadeVomRegisterErgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#ladeVomRegisterErg}.
	 * @param ctx the parse tree
	 */
	void exitLadeVomRegisterErg(@NotNull TPS_ANTLRParser.LadeVomRegisterErgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#rufeAufWennFalsch}.
	 * @param ctx the parse tree
	 */
	void enterRufeAufWennFalsch(@NotNull TPS_ANTLRParser.RufeAufWennFalschContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#rufeAufWennFalsch}.
	 * @param ctx the parse tree
	 */
	void exitRufeAufWennFalsch(@NotNull TPS_ANTLRParser.RufeAufWennFalschContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#multipliziereST}.
	 * @param ctx the parse tree
	 */
	void enterMultipliziereST(@NotNull TPS_ANTLRParser.MultipliziereSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#multipliziereST}.
	 * @param ctx the parse tree
	 */
	void exitMultipliziereST(@NotNull TPS_ANTLRParser.MultipliziereSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#ergebnisST}.
	 * @param ctx the parse tree
	 */
	void enterErgebnisST(@NotNull TPS_ANTLRParser.ErgebnisSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#ergebnisST}.
	 * @param ctx the parse tree
	 */
	void exitErgebnisST(@NotNull TPS_ANTLRParser.ErgebnisSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#nehmeST}.
	 * @param ctx the parse tree
	 */
	void enterNehmeST(@NotNull TPS_ANTLRParser.NehmeSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#nehmeST}.
	 * @param ctx the parse tree
	 */
	void exitNehmeST(@NotNull TPS_ANTLRParser.NehmeSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#zurückgehenST}.
	 * @param ctx the parse tree
	 */
	void enterZurückgehenST(@NotNull TPS_ANTLRParser.ZurückgehenSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#zurückgehenST}.
	 * @param ctx the parse tree
	 */
	void exitZurückgehenST(@NotNull TPS_ANTLRParser.ZurückgehenSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#wennST}.
	 * @param ctx the parse tree
	 */
	void enterWennST(@NotNull TPS_ANTLRParser.WennSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#wennST}.
	 * @param ctx the parse tree
	 */
	void exitWennST(@NotNull TPS_ANTLRParser.WennSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stapelGrReg}.
	 * @param ctx the parse tree
	 */
	void enterStapelGrReg(@NotNull TPS_ANTLRParser.StapelGrRegContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stapelGrReg}.
	 * @param ctx the parse tree
	 */
	void exitStapelGrReg(@NotNull TPS_ANTLRParser.StapelGrRegContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#springeWennFalsch}.
	 * @param ctx the parse tree
	 */
	void enterSpringeWennFalsch(@NotNull TPS_ANTLRParser.SpringeWennFalschContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#springeWennFalsch}.
	 * @param ctx the parse tree
	 */
	void exitSpringeWennFalsch(@NotNull TPS_ANTLRParser.SpringeWennFalschContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#registerST_}.
	 * @param ctx the parse tree
	 */
	void enterRegisterST_(@NotNull TPS_ANTLRParser.RegisterST_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#registerST_}.
	 * @param ctx the parse tree
	 */
	void exitRegisterST_(@NotNull TPS_ANTLRParser.RegisterST_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#vonST}.
	 * @param ctx the parse tree
	 */
	void enterVonST(@NotNull TPS_ANTLRParser.VonSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#vonST}.
	 * @param ctx the parse tree
	 */
	void exitVonST(@NotNull TPS_ANTLRParser.VonSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#gleichST}.
	 * @param ctx the parse tree
	 */
	void enterGleichST(@NotNull TPS_ANTLRParser.GleichSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#gleichST}.
	 * @param ctx the parse tree
	 */
	void exitGleichST(@NotNull TPS_ANTLRParser.GleichSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#subtrahiere}.
	 * @param ctx the parse tree
	 */
	void enterSubtrahiere(@NotNull TPS_ANTLRParser.SubtrahiereContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#subtrahiere}.
	 * @param ctx the parse tree
	 */
	void exitSubtrahiere(@NotNull TPS_ANTLRParser.SubtrahiereContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#kleinerST}.
	 * @param ctx the parse tree
	 */
	void enterKleinerST(@NotNull TPS_ANTLRParser.KleinerSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#kleinerST}.
	 * @param ctx the parse tree
	 */
	void exitKleinerST(@NotNull TPS_ANTLRParser.KleinerSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#leerzeileST}.
	 * @param ctx the parse tree
	 */
	void enterLeerzeileST(@NotNull TPS_ANTLRParser.LeerzeileSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#leerzeileST}.
	 * @param ctx the parse tree
	 */
	void exitLeerzeileST(@NotNull TPS_ANTLRParser.LeerzeileSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#kleinerGleichST}.
	 * @param ctx the parse tree
	 */
	void enterKleinerGleichST(@NotNull TPS_ANTLRParser.KleinerGleichSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#kleinerGleichST}.
	 * @param ctx the parse tree
	 */
	void exitKleinerGleichST(@NotNull TPS_ANTLRParser.KleinerGleichSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#wortfolgeST}.
	 * @param ctx the parse tree
	 */
	void enterWortfolgeST(@NotNull TPS_ANTLRParser.WortfolgeSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#wortfolgeST}.
	 * @param ctx the parse tree
	 */
	void exitWortfolgeST(@NotNull TPS_ANTLRParser.WortfolgeSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#rufeAufGr}.
	 * @param ctx the parse tree
	 */
	void enterRufeAufGr(@NotNull TPS_ANTLRParser.RufeAufGrContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#rufeAufGr}.
	 * @param ctx the parse tree
	 */
	void exitRufeAufGr(@NotNull TPS_ANTLRParser.RufeAufGrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#direktPronomST}.
	 * @param ctx the parse tree
	 */
	void enterDirektPronomST(@NotNull TPS_ANTLRParser.DirektPronomSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#direktPronomST}.
	 * @param ctx the parse tree
	 */
	void exitDirektPronomST(@NotNull TPS_ANTLRParser.DirektPronomSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stapelGrST}.
	 * @param ctx the parse tree
	 */
	void enterStapelGrST(@NotNull TPS_ANTLRParser.StapelGrSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stapelGrST}.
	 * @param ctx the parse tree
	 */
	void exitStapelGrST(@NotNull TPS_ANTLRParser.StapelGrSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#dividiereST}.
	 * @param ctx the parse tree
	 */
	void enterDividiereST(@NotNull TPS_ANTLRParser.DividiereSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#dividiereST}.
	 * @param ctx the parse tree
	 */
	void exitDividiereST(@NotNull TPS_ANTLRParser.DividiereSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#satz}.
	 * @param ctx the parse tree
	 */
	void enterSatz(@NotNull TPS_ANTLRParser.SatzContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#satz}.
	 * @param ctx the parse tree
	 */
	void exitSatz(@NotNull TPS_ANTLRParser.SatzContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stapelGrZw}.
	 * @param ctx the parse tree
	 */
	void enterStapelGrZw(@NotNull TPS_ANTLRParser.StapelGrZwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stapelGrZw}.
	 * @param ctx the parse tree
	 */
	void exitStapelGrZw(@NotNull TPS_ANTLRParser.StapelGrZwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#ladeRegisterAnzahlErg}.
	 * @param ctx the parse tree
	 */
	void enterLadeRegisterAnzahlErg(@NotNull TPS_ANTLRParser.LadeRegisterAnzahlErgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#ladeRegisterAnzahlErg}.
	 * @param ctx the parse tree
	 */
	void exitLadeRegisterAnzahlErg(@NotNull TPS_ANTLRParser.LadeRegisterAnzahlErgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#versionErg}.
	 * @param ctx the parse tree
	 */
	void enterVersionErg(@NotNull TPS_ANTLRParser.VersionErgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#versionErg}.
	 * @param ctx the parse tree
	 */
	void exitVersionErg(@NotNull TPS_ANTLRParser.VersionErgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#springeST}.
	 * @param ctx the parse tree
	 */
	void enterSpringeST(@NotNull TPS_ANTLRParser.SpringeSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#springeST}.
	 * @param ctx the parse tree
	 */
	void exitSpringeST(@NotNull TPS_ANTLRParser.SpringeSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#letztenFehlerST}.
	 * @param ctx the parse tree
	 */
	void enterLetztenFehlerST(@NotNull TPS_ANTLRParser.LetztenFehlerSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#letztenFehlerST}.
	 * @param ctx the parse tree
	 */
	void exitLetztenFehlerST(@NotNull TPS_ANTLRParser.LetztenFehlerSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#ausDPST}.
	 * @param ctx the parse tree
	 */
	void enterAusDPST(@NotNull TPS_ANTLRParser.AusDPSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#ausDPST}.
	 * @param ctx the parse tree
	 */
	void exitAusDPST(@NotNull TPS_ANTLRParser.AusDPSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#fehlerST}.
	 * @param ctx the parse tree
	 */
	void enterFehlerST(@NotNull TPS_ANTLRParser.FehlerSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#fehlerST}.
	 * @param ctx the parse tree
	 */
	void exitFehlerST(@NotNull TPS_ANTLRParser.FehlerSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#zeichenST}.
	 * @param ctx the parse tree
	 */
	void enterZeichenST(@NotNull TPS_ANTLRParser.ZeichenSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#zeichenST}.
	 * @param ctx the parse tree
	 */
	void exitZeichenST(@NotNull TPS_ANTLRParser.ZeichenSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#vergleiche}.
	 * @param ctx the parse tree
	 */
	void enterVergleiche(@NotNull TPS_ANTLRParser.VergleicheContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#vergleiche}.
	 * @param ctx the parse tree
	 */
	void exitVergleiche(@NotNull TPS_ANTLRParser.VergleicheContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#derST}.
	 * @param ctx the parse tree
	 */
	void enterDerST(@NotNull TPS_ANTLRParser.DerSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#derST}.
	 * @param ctx the parse tree
	 */
	void exitDerST(@NotNull TPS_ANTLRParser.DerSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#wft}.
	 * @param ctx the parse tree
	 */
	void enterWft(@NotNull TPS_ANTLRParser.WftContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#wft}.
	 * @param ctx the parse tree
	 */
	void exitWft(@NotNull TPS_ANTLRParser.WftContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#rufeAufWennNichtGleich}.
	 * @param ctx the parse tree
	 */
	void enterRufeAufWennNichtGleich(@NotNull TPS_ANTLRParser.RufeAufWennNichtGleichContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#rufeAufWennNichtGleich}.
	 * @param ctx the parse tree
	 */
	void exitRufeAufWennNichtGleich(@NotNull TPS_ANTLRParser.RufeAufWennNichtGleichContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#mitST}.
	 * @param ctx the parse tree
	 */
	void enterMitST(@NotNull TPS_ANTLRParser.MitSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#mitST}.
	 * @param ctx the parse tree
	 */
	void exitMitST(@NotNull TPS_ANTLRParser.MitSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#leerzeile}.
	 * @param ctx the parse tree
	 */
	void enterLeerzeile(@NotNull TPS_ANTLRParser.LeerzeileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#leerzeile}.
	 * @param ctx the parse tree
	 */
	void exitLeerzeile(@NotNull TPS_ANTLRParser.LeerzeileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stapelLesenReg}.
	 * @param ctx the parse tree
	 */
	void enterStapelLesenReg(@NotNull TPS_ANTLRParser.StapelLesenRegContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stapelLesenReg}.
	 * @param ctx the parse tree
	 */
	void exitStapelLesenReg(@NotNull TPS_ANTLRParser.StapelLesenRegContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stelle}.
	 * @param ctx the parse tree
	 */
	void enterStelle(@NotNull TPS_ANTLRParser.StelleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stelle}.
	 * @param ctx the parse tree
	 */
	void exitStelle(@NotNull TPS_ANTLRParser.StelleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#springeWennGleich}.
	 * @param ctx the parse tree
	 */
	void enterSpringeWennGleich(@NotNull TPS_ANTLRParser.SpringeWennGleichContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#springeWennGleich}.
	 * @param ctx the parse tree
	 */
	void exitSpringeWennGleich(@NotNull TPS_ANTLRParser.SpringeWennGleichContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#anzahlST}.
	 * @param ctx the parse tree
	 */
	void enterAnzahlST(@NotNull TPS_ANTLRParser.AnzahlSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#anzahlST}.
	 * @param ctx the parse tree
	 */
	void exitAnzahlST(@NotNull TPS_ANTLRParser.AnzahlSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#einlesenST}.
	 * @param ctx the parse tree
	 */
	void enterEinlesenST(@NotNull TPS_ANTLRParser.EinlesenSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#einlesenST}.
	 * @param ctx the parse tree
	 */
	void exitEinlesenST(@NotNull TPS_ANTLRParser.EinlesenSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stapelMaxGrErg}.
	 * @param ctx the parse tree
	 */
	void enterStapelMaxGrErg(@NotNull TPS_ANTLRParser.StapelMaxGrErgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stapelMaxGrErg}.
	 * @param ctx the parse tree
	 */
	void exitStapelMaxGrErg(@NotNull TPS_ANTLRParser.StapelMaxGrErgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#versionReg}.
	 * @param ctx the parse tree
	 */
	void enterVersionReg(@NotNull TPS_ANTLRParser.VersionRegContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#versionReg}.
	 * @param ctx the parse tree
	 */
	void exitVersionReg(@NotNull TPS_ANTLRParser.VersionRegContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#istST}.
	 * @param ctx the parse tree
	 */
	void enterIstST(@NotNull TPS_ANTLRParser.IstSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#istST}.
	 * @param ctx the parse tree
	 */
	void exitIstST(@NotNull TPS_ANTLRParser.IstSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#wortST}.
	 * @param ctx the parse tree
	 */
	void enterWortST(@NotNull TPS_ANTLRParser.WortSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#wortST}.
	 * @param ctx the parse tree
	 */
	void exitWortST(@NotNull TPS_ANTLRParser.WortSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stelleST}.
	 * @param ctx the parse tree
	 */
	void enterStelleST(@NotNull TPS_ANTLRParser.StelleSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stelleST}.
	 * @param ctx the parse tree
	 */
	void exitStelleST(@NotNull TPS_ANTLRParser.StelleSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#posZahlST}.
	 * @param ctx the parse tree
	 */
	void enterPosZahlST(@NotNull TPS_ANTLRParser.PosZahlSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#posZahlST}.
	 * @param ctx the parse tree
	 */
	void exitPosZahlST(@NotNull TPS_ANTLRParser.PosZahlSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#springeWennGrGleich}.
	 * @param ctx the parse tree
	 */
	void enterSpringeWennGrGleich(@NotNull TPS_ANTLRParser.SpringeWennGrGleichContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#springeWennGrGleich}.
	 * @param ctx the parse tree
	 */
	void exitSpringeWennGrGleich(@NotNull TPS_ANTLRParser.SpringeWennGrGleichContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#leerzeichenST}.
	 * @param ctx the parse tree
	 */
	void enterLeerzeichenST(@NotNull TPS_ANTLRParser.LeerzeichenSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#leerzeichenST}.
	 * @param ctx the parse tree
	 */
	void exitLeerzeichenST(@NotNull TPS_ANTLRParser.LeerzeichenSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#registerausgabe}.
	 * @param ctx the parse tree
	 */
	void enterRegisterausgabe(@NotNull TPS_ANTLRParser.RegisterausgabeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#registerausgabe}.
	 * @param ctx the parse tree
	 */
	void exitRegisterausgabe(@NotNull TPS_ANTLRParser.RegisterausgabeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#aufrufST}.
	 * @param ctx the parse tree
	 */
	void enterAufrufST(@NotNull TPS_ANTLRParser.AufrufSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#aufrufST}.
	 * @param ctx the parse tree
	 */
	void exitAufrufST(@NotNull TPS_ANTLRParser.AufrufSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#bereichST}.
	 * @param ctx the parse tree
	 */
	void enterBereichST(@NotNull TPS_ANTLRParser.BereichSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#bereichST}.
	 * @param ctx the parse tree
	 */
	void exitBereichST(@NotNull TPS_ANTLRParser.BereichSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stapelMaxGrReg}.
	 * @param ctx the parse tree
	 */
	void enterStapelMaxGrReg(@NotNull TPS_ANTLRParser.StapelMaxGrRegContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stapelMaxGrReg}.
	 * @param ctx the parse tree
	 */
	void exitStapelMaxGrReg(@NotNull TPS_ANTLRParser.StapelMaxGrRegContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#dividiere}.
	 * @param ctx the parse tree
	 */
	void enterDividiere(@NotNull TPS_ANTLRParser.DividiereContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#dividiere}.
	 * @param ctx the parse tree
	 */
	void exitDividiere(@NotNull TPS_ANTLRParser.DividiereContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stapelSchreiben}.
	 * @param ctx the parse tree
	 */
	void enterStapelSchreiben(@NotNull TPS_ANTLRParser.StapelSchreibenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stapelSchreiben}.
	 * @param ctx the parse tree
	 */
	void exitStapelSchreiben(@NotNull TPS_ANTLRParser.StapelSchreibenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stapelLesenZw}.
	 * @param ctx the parse tree
	 */
	void enterStapelLesenZw(@NotNull TPS_ANTLRParser.StapelLesenZwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stapelLesenZw}.
	 * @param ctx the parse tree
	 */
	void exitStapelLesenZw(@NotNull TPS_ANTLRParser.StapelLesenZwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stapelMaxGrZw}.
	 * @param ctx the parse tree
	 */
	void enterStapelMaxGrZw(@NotNull TPS_ANTLRParser.StapelMaxGrZwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stapelMaxGrZw}.
	 * @param ctx the parse tree
	 */
	void exitStapelMaxGrZw(@NotNull TPS_ANTLRParser.StapelMaxGrZwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#subtrahiereST}.
	 * @param ctx the parse tree
	 */
	void enterSubtrahiereST(@NotNull TPS_ANTLRParser.SubtrahiereSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#subtrahiereST}.
	 * @param ctx the parse tree
	 */
	void exitSubtrahiereST(@NotNull TPS_ANTLRParser.SubtrahiereSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#ausgabe}.
	 * @param ctx the parse tree
	 */
	void enterAusgabe(@NotNull TPS_ANTLRParser.AusgabeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#ausgabe}.
	 * @param ctx the parse tree
	 */
	void exitAusgabe(@NotNull TPS_ANTLRParser.AusgabeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#leseZahlEinErg}.
	 * @param ctx the parse tree
	 */
	void enterLeseZahlEinErg(@NotNull TPS_ANTLRParser.LeseZahlEinErgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#leseZahlEinErg}.
	 * @param ctx the parse tree
	 */
	void exitLeseZahlEinErg(@NotNull TPS_ANTLRParser.LeseZahlEinErgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#zahlST}.
	 * @param ctx the parse tree
	 */
	void enterZahlST(@NotNull TPS_ANTLRParser.ZahlSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#zahlST}.
	 * @param ctx the parse tree
	 */
	void exitZahlST(@NotNull TPS_ANTLRParser.ZahlSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stapelMaxGrST}.
	 * @param ctx the parse tree
	 */
	void enterStapelMaxGrST(@NotNull TPS_ANTLRParser.StapelMaxGrSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stapelMaxGrST}.
	 * @param ctx the parse tree
	 */
	void exitStapelMaxGrST(@NotNull TPS_ANTLRParser.StapelMaxGrSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#multipliziere}.
	 * @param ctx the parse tree
	 */
	void enterMultipliziere(@NotNull TPS_ANTLRParser.MultipliziereContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#multipliziere}.
	 * @param ctx the parse tree
	 */
	void exitMultipliziere(@NotNull TPS_ANTLRParser.MultipliziereContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#ausgebenST}.
	 * @param ctx the parse tree
	 */
	void enterAusgebenST(@NotNull TPS_ANTLRParser.AusgebenSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#ausgebenST}.
	 * @param ctx the parse tree
	 */
	void exitAusgebenST(@NotNull TPS_ANTLRParser.AusgebenSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#rufeAufDirekt}.
	 * @param ctx the parse tree
	 */
	void enterRufeAufDirekt(@NotNull TPS_ANTLRParser.RufeAufDirektContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#rufeAufDirekt}.
	 * @param ctx the parse tree
	 */
	void exitRufeAufDirekt(@NotNull TPS_ANTLRParser.RufeAufDirektContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stapelST}.
	 * @param ctx the parse tree
	 */
	void enterStapelST(@NotNull TPS_ANTLRParser.StapelSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stapelST}.
	 * @param ctx the parse tree
	 */
	void exitStapelST(@NotNull TPS_ANTLRParser.StapelSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#ladeRegisterAnzahlZw}.
	 * @param ctx the parse tree
	 */
	void enterLadeRegisterAnzahlZw(@NotNull TPS_ANTLRParser.LadeRegisterAnzahlZwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#ladeRegisterAnzahlZw}.
	 * @param ctx the parse tree
	 */
	void exitLadeRegisterAnzahlZw(@NotNull TPS_ANTLRParser.LadeRegisterAnzahlZwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#zahlenausgabe}.
	 * @param ctx the parse tree
	 */
	void enterZahlenausgabe(@NotNull TPS_ANTLRParser.ZahlenausgabeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#zahlenausgabe}.
	 * @param ctx the parse tree
	 */
	void exitZahlenausgabe(@NotNull TPS_ANTLRParser.ZahlenausgabeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#leseZahlEinZwischen}.
	 * @param ctx the parse tree
	 */
	void enterLeseZahlEinZwischen(@NotNull TPS_ANTLRParser.LeseZahlEinZwischenContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#leseZahlEinZwischen}.
	 * @param ctx the parse tree
	 */
	void exitLeseZahlEinZwischen(@NotNull TPS_ANTLRParser.LeseZahlEinZwischenContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#stapelLesenErg}.
	 * @param ctx the parse tree
	 */
	void enterStapelLesenErg(@NotNull TPS_ANTLRParser.StapelLesenErgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#stapelLesenErg}.
	 * @param ctx the parse tree
	 */
	void exitStapelLesenErg(@NotNull TPS_ANTLRParser.StapelLesenErgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#folgendesST}.
	 * @param ctx the parse tree
	 */
	void enterFolgendesST(@NotNull TPS_ANTLRParser.FolgendesSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#folgendesST}.
	 * @param ctx the parse tree
	 */
	void exitFolgendesST(@NotNull TPS_ANTLRParser.FolgendesSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#registerST}.
	 * @param ctx the parse tree
	 */
	void enterRegisterST(@NotNull TPS_ANTLRParser.RegisterSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#registerST}.
	 * @param ctx the parse tree
	 */
	void exitRegisterST(@NotNull TPS_ANTLRParser.RegisterSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#springeWennKleinerGleich}.
	 * @param ctx the parse tree
	 */
	void enterSpringeWennKleinerGleich(@NotNull TPS_ANTLRParser.SpringeWennKleinerGleichContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#springeWennKleinerGleich}.
	 * @param ctx the parse tree
	 */
	void exitSpringeWennKleinerGleich(@NotNull TPS_ANTLRParser.SpringeWennKleinerGleichContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#datei}.
	 * @param ctx the parse tree
	 */
	void enterDatei(@NotNull TPS_ANTLRParser.DateiContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#datei}.
	 * @param ctx the parse tree
	 */
	void exitDatei(@NotNull TPS_ANTLRParser.DateiContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#geheZur}.
	 * @param ctx the parse tree
	 */
	void enterGeheZur(@NotNull TPS_ANTLRParser.GeheZurContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#geheZur}.
	 * @param ctx the parse tree
	 */
	void exitGeheZur(@NotNull TPS_ANTLRParser.GeheZurContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#ladeInRegister}.
	 * @param ctx the parse tree
	 */
	void enterLadeInRegister(@NotNull TPS_ANTLRParser.LadeInRegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#ladeInRegister}.
	 * @param ctx the parse tree
	 */
	void exitLadeInRegister(@NotNull TPS_ANTLRParser.LadeInRegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#macheST}.
	 * @param ctx the parse tree
	 */
	void enterMacheST(@NotNull TPS_ANTLRParser.MacheSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#macheST}.
	 * @param ctx the parse tree
	 */
	void exitMacheST(@NotNull TPS_ANTLRParser.MacheSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#vergleicheRegisterText}.
	 * @param ctx the parse tree
	 */
	void enterVergleicheRegisterText(@NotNull TPS_ANTLRParser.VergleicheRegisterTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#vergleicheRegisterText}.
	 * @param ctx the parse tree
	 */
	void exitVergleicheRegisterText(@NotNull TPS_ANTLRParser.VergleicheRegisterTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#addiere}.
	 * @param ctx the parse tree
	 */
	void enterAddiere(@NotNull TPS_ANTLRParser.AddiereContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#addiere}.
	 * @param ctx the parse tree
	 */
	void exitAddiere(@NotNull TPS_ANTLRParser.AddiereContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#zuST}.
	 * @param ctx the parse tree
	 */
	void enterZuST(@NotNull TPS_ANTLRParser.ZuSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#zuST}.
	 * @param ctx the parse tree
	 */
	void exitZuST(@NotNull TPS_ANTLRParser.ZuSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#zwischenST}.
	 * @param ctx the parse tree
	 */
	void enterZwischenST(@NotNull TPS_ANTLRParser.ZwischenSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#zwischenST}.
	 * @param ctx the parse tree
	 */
	void exitZwischenST(@NotNull TPS_ANTLRParser.ZwischenSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#rufeAuf}.
	 * @param ctx the parse tree
	 */
	void enterRufeAuf(@NotNull TPS_ANTLRParser.RufeAufContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#rufeAuf}.
	 * @param ctx the parse tree
	 */
	void exitRufeAuf(@NotNull TPS_ANTLRParser.RufeAufContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#ungleichST}.
	 * @param ctx the parse tree
	 */
	void enterUngleichST(@NotNull TPS_ANTLRParser.UngleichSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#ungleichST}.
	 * @param ctx the parse tree
	 */
	void exitUngleichST(@NotNull TPS_ANTLRParser.UngleichSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#vergleicheRegister}.
	 * @param ctx the parse tree
	 */
	void enterVergleicheRegister(@NotNull TPS_ANTLRParser.VergleicheRegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#vergleicheRegister}.
	 * @param ctx the parse tree
	 */
	void exitVergleicheRegister(@NotNull TPS_ANTLRParser.VergleicheRegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#einST}.
	 * @param ctx the parse tree
	 */
	void enterEinST(@NotNull TPS_ANTLRParser.EinSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#einST}.
	 * @param ctx the parse tree
	 */
	void exitEinST(@NotNull TPS_ANTLRParser.EinSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#ausST}.
	 * @param ctx the parse tree
	 */
	void enterAusST(@NotNull TPS_ANTLRParser.AusSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#ausST}.
	 * @param ctx the parse tree
	 */
	void exitAusST(@NotNull TPS_ANTLRParser.AusSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#speichereST}.
	 * @param ctx the parse tree
	 */
	void enterSpeichereST(@NotNull TPS_ANTLRParser.SpeichereSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#speichereST}.
	 * @param ctx the parse tree
	 */
	void exitSpeichereST(@NotNull TPS_ANTLRParser.SpeichereSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#rufeAufGrGleich}.
	 * @param ctx the parse tree
	 */
	void enterRufeAufGrGleich(@NotNull TPS_ANTLRParser.RufeAufGrGleichContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#rufeAufGrGleich}.
	 * @param ctx the parse tree
	 */
	void exitRufeAufGrGleich(@NotNull TPS_ANTLRParser.RufeAufGrGleichContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#gabST}.
	 * @param ctx the parse tree
	 */
	void enterGabST(@NotNull TPS_ANTLRParser.GabSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#gabST}.
	 * @param ctx the parse tree
	 */
	void exitGabST(@NotNull TPS_ANTLRParser.GabSTContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#rufeAufWennGleich}.
	 * @param ctx the parse tree
	 */
	void enterRufeAufWennGleich(@NotNull TPS_ANTLRParser.RufeAufWennGleichContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#rufeAufWennGleich}.
	 * @param ctx the parse tree
	 */
	void exitRufeAufWennGleich(@NotNull TPS_ANTLRParser.RufeAufWennGleichContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#ladeVomRegisterZw}.
	 * @param ctx the parse tree
	 */
	void enterLadeVomRegisterZw(@NotNull TPS_ANTLRParser.LadeVomRegisterZwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#ladeVomRegisterZw}.
	 * @param ctx the parse tree
	 */
	void exitLadeVomRegisterZw(@NotNull TPS_ANTLRParser.LadeVomRegisterZwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#springeWennKleiner}.
	 * @param ctx the parse tree
	 */
	void enterSpringeWennKleiner(@NotNull TPS_ANTLRParser.SpringeWennKleinerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#springeWennKleiner}.
	 * @param ctx the parse tree
	 */
	void exitSpringeWennKleiner(@NotNull TPS_ANTLRParser.SpringeWennKleinerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#zahlST_}.
	 * @param ctx the parse tree
	 */
	void enterZahlST_(@NotNull TPS_ANTLRParser.ZahlST_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#zahlST_}.
	 * @param ctx the parse tree
	 */
	void exitZahlST_(@NotNull TPS_ANTLRParser.ZahlST_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#springe}.
	 * @param ctx the parse tree
	 */
	void enterSpringe(@NotNull TPS_ANTLRParser.SpringeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#springe}.
	 * @param ctx the parse tree
	 */
	void exitSpringe(@NotNull TPS_ANTLRParser.SpringeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TPS_ANTLRParser#größerST}.
	 * @param ctx the parse tree
	 */
	void enterGrößerST(@NotNull TPS_ANTLRParser.GrößerSTContext ctx);
	/**
	 * Exit a parse tree produced by {@link TPS_ANTLRParser#größerST}.
	 * @param ctx the parse tree
	 */
	void exitGrößerST(@NotNull TPS_ANTLRParser.GrößerSTContext ctx);
}