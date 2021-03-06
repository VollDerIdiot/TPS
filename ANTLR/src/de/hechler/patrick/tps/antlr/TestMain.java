package de.hechler.patrick.tps.antlr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import genearatedsources.antlr.TPS_ANTLRLexer;
import genearatedsources.antlr.TPS_ANTLRParser;
import genearatedsources.antlr.TPS_ANTLRParser.BereichSTContext;
import genearatedsources.antlr.TPS_ANTLRParser.SatzContext;
import genearatedsources.antlr.TPS_ANTLRParser.WortfolgeSTContext;
import genearatedsources.antlr.TPS_ANTLRParser.ZahlSTContext;

@SuppressWarnings("deprecation")
public class TestMain {
	
	public static void main(String[] args) {
		ANTLRInputStream in = new ANTLRInputStream("789");
		TPS_ANTLRLexer lexer = new TPS_ANTLRLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		TPS_ANTLRParser parser = new TPS_ANTLRParser(tokens);
		ZahlSTContext z = parser.zahlST();
		System.out.println(z.zahl);
		System.out.println("TEXT=" + z.getText());
		
		in = new ANTLRInputStream("von register 852 bis register 425");
		lexer = new TPS_ANTLRLexer(in);
		tokens = new CommonTokenStream(lexer);
		parser = new TPS_ANTLRParser(tokens);
		BereichSTContext bereichST = parser.bereichST();
		System.out.println("REGA=" + bereichST.start);
		System.out.println("REGB=" + bereichST.ende);
		System.out.println("TEXT=" + bereichST.getText());
		
		in = new ANTLRInputStream("ausgeben folgendes: \thello world this is an nice text: von register 654684864 bis register 684+/*7+\r\n4- ende");
		lexer = new TPS_ANTLRLexer(in);
		tokens = new CommonTokenStream(lexer);
		parser = new TPS_ANTLRParser(tokens);
		WortfolgeSTContext wf = parser.wortfolgeST();
		System.out.println("WF  =" + wf.wortfolge);
		System.out.println("TEXT=" + wf.getText());
		System.out.println("TREE=" + wf.toStringTree());
		
		in = new ANTLRInputStream("ausgeben folgendes: \thello world this is an nice text: von register 654684864 bis register 684+/*7+\r\n4- ende");
		lexer = new TPS_ANTLRLexer(in);
		tokens = new CommonTokenStream(lexer);
		parser = new TPS_ANTLRParser(tokens);
		SatzContext satz = parser.satz();
		System.out.println("WF  =" + ((WortfolgeSTContext) satz.getChild(0).getChild(2)).wortfolge);
		System.out.println("TEXT=" + satz.getText());
		System.out.println("TREE=" + satz.toStringTree());
	}
	
}
