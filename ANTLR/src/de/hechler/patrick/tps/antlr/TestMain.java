package de.hechler.patrick.tps.antlr;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import de.hechler.patrick.tps.antlr.objects.Parameter;
import de.hechler.patrick.tps.antlr.objects.ZeichenKette;
import name.TPS_ANTLRLexer;
import name.TPS_ANTLRParser;
import name.TPS_ANTLRParser.BereichSTContext;
import name.TPS_ANTLRParser.WortfolgeSTContext;
import name.TPS_ANTLRParser.ZahlSTContext;

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
		
		try {
			Parameter p = new ZeichenKette("hello world");
			Parameter p2 = new ZeichenKette("hello second world");
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(p);
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			ZeichenKette zk = (ZeichenKette) ois.readObject();
			System.out.println(p == zk);
			System.out.println(p.equals(zk));
			System.out.println(p.hashCode() == zk.hashCode());
			System.out.println(p);
			System.out.println(zk);
			System.out.println(p2 == zk);
			System.out.println(p2.equals(zk));
			System.out.println(p2.hashCode() == zk.hashCode());
			System.out.println(p2);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
