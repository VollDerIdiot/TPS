package de.hechler.patrick.antlrtest;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import genearatedsources.antlr.TPS_ANTLRLexer;
import genearatedsources.antlr.TPS_ANTLRParser;
import genearatedsources.antlr.TPS_ANTLRParser.VonSTContext;

@SuppressWarnings("deprecation")
public class TestMain {
	
	public static void main(String[] args) {
		ANTLRInputStream in = new ANTLRInputStream("789");
		TPS_ANTLRLexer lexer = new TPS_ANTLRLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TPS_ANTLRParser parser = new TPS_ANTLRParser(tokens);
		System.out.println(parser.zahlST().zahl);
		
		in = new ANTLRInputStream("von");// register 852 bis register 425");
		lexer = new TPS_ANTLRLexer(in);
		tokens = new CommonTokenStream(lexer);
		parser = new TPS_ANTLRParser(tokens);
		VonSTContext test = parser.vonST();
		System.out.println(test);
	}
	
}
