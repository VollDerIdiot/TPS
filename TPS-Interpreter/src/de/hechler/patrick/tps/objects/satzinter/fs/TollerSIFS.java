package de.hechler.patrick.tps.objects.satzinter.fs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import de.hechler.patrick.tps.antlr.anotatins.Version;
import de.hechler.patrick.tps.antlr.objects.Satz;
import genearatedsources.antlr.TPS_ANTLRLexer;
import genearatedsources.antlr.TPS_ANTLRParser;
import genearatedsources.antlr.TPS_ANTLRParser.DateiContext;

@Version(6)
public class TollerSIFS extends SätzeInterpretierenderFehlerSucher {
	

	public TollerSIFS(Scanner eingabe, PrintStream ausgabe, int registerAnzahl, int stapelMaxGröße) {
		super(eingabe, ausgabe, registerAnzahl, stapelMaxGröße);
	}
	
	@Override
	protected Ergebnis mache(Satz machen, long stelle) {
		switch (machen.art) {
		default:
			return super.mache(machen, stelle);
		}
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws FileNotFoundException, IOException {
		TollerSIFS sifs = new TollerSIFS(new Scanner(System.in), System.out, 100, 100);
		org.antlr.v4.runtime.ANTLRInputStream in = new org.antlr.v4.runtime.ANTLRInputStream(new FileInputStream("C:\\Users\\Patrick\\git\\TPS\\rechner-3.tps"));
		TPS_ANTLRLexer lexer = new TPS_ANTLRLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TPS_ANTLRParser parser = new TPS_ANTLRParser(tokens);
		parser.setErrorHandler(new BailErrorStrategy());
		try {
			DateiContext datei = parser.datei();
			System.out.println("TEXT=" + datei.getText());
			System.out.println("LIST=" + datei.inhalt);
			System.out.println("CHILDREN:");
			datei.children.forEach(a -> System.out.println("    CHILD=" + a.getText()));
			sifs.lade(datei.inhalt);
			sifs.run();
		} catch (ParseCancellationException pce) {
			System.err.println();
			System.err.println("TOKEN=       " + parser.getCurrentToken());
			System.err.println("TOKEN_NAME=  " + parser.getTokenNames()[parser.getCurrentToken().getType()]);
			System.err.println("TOKEN_TEXT=  " + parser.getCurrentToken().getText());
			System.err.println("TOKEN_CLASS= " + parser.getCurrentToken().getClass());
			System.err.println();
			String errMsg = "Fehler beim Kompilieren! ";
			final String orig = errMsg;
			if (pce.getCause() instanceof RecognitionException) {
				RecognitionException e = (RecognitionException) pce.getCause();
				Token token = e.getOffendingToken();
				if (token != null) {
					errMsg += "Fehlerhaftes Wort [" + parser.getTokenNames()[token.getType()] + "]:'" + token.getText() + "' in Zeile " + token.getLine() + " ab Zeichen "
							+ token.getCharPositionInLine() + ". ";
				}
			}
			if (pce.getCause() instanceof InputMismatchException) {
				InputMismatchException e = (InputMismatchException) pce.getCause();
				errMsg += "Erwartet wird [" + e.getExpectedTokens().toString(parser.getTokenNames()) + ']';
			} else if (pce.getCause() instanceof NoViableAltException) {
				NoViableAltException e = (NoViableAltException) pce.getCause();
				TokenStream tokenss = parser.getInputStream();
				String input;
				if (tokenss != null) {
					if (e.getStartToken().getType() == Token.EOF) input = "<EOF>";
					else input = tokenss.getText(e.getStartToken(), e.getOffendingToken());
				} else {
					input = "<unknown input>";
				}
				errMsg += "Ungültige Zeichen: " + input;
			} else if (pce.getCause() instanceof FailedPredicateException) {
				FailedPredicateException e = (FailedPredicateException) pce.getCause();
				String ruleName = parser.getRuleNames()[e.getCtx().getRuleIndex()];
				errMsg += "Regelfehler " + ruleName + " " + e.getMessage();
			} else if (pce.getCause() instanceof RecognitionException) {
				RecognitionException e = (RecognitionException) pce.getCause();
				errMsg += "Unbekannter Syntaxfehler: " + e.toString();
			} else if (orig == errMsg) {
				errMsg += "Unerwarteter Parse-Fehler: " + pce.getCause();
			}
			System.err.println(errMsg);
			pce.printStackTrace();
		}
	}
	
}
