package de.hechler.patrick.tps.interpreter.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import de.hechler.patrick.tps.fehler.InterpretierungsFehler;
import de.hechler.patrick.tps.interpreter.Interpreter;


class StapelbesitzendeTpsInterpreterImplTest {
	
	static final String TEST_DATEI_1      = "../rechner.tps";
	static final String TEST_FUTTER_1_1   = "0 112 52 0\r\n";
	static final String TEST_FUTTER_1_2   = "0 58 3 1\r\n" + " 1 12 8 1\r\n" + "8 3 8 1\r\n" + "piosjdg 4 843 4 0";
	static final String TEST_ERGEBNIS_1_1 = "hello world\r\n" + "wähle eine der optionen: teilen(0), multiplizieren(1), addieren(2), subrahieren(3)\r\n" + "gebe nun die erste zahl ein\r\n"
			+ "gebe nun die zweite zahl ein\r\n" + "das ergebnis ist: 2 \r\n" + "soll ich noch etwas berechnen? (NE=0|ja=1)\r\n" + "tschüss";
	static final String TEST_ERGEBNIS_1_2 = "hello world\r\n" + "wähle eine der optionen: teilen(0), multiplizieren(1), addieren(2), subrahieren(3)\r\n" + "gebe nun die erste zahl ein\r\n"
			+ "gebe nun die zweite zahl ein\r\n" + "das ergebnis ist: 19 \r\n" + "soll ich noch etwas berechnen? (NE=0|ja=1)\r\n" + "hello world\r\n"
			+ "wähle eine der optionen: teilen(0), multiplizieren(1), addieren(2), subrahieren(3)\r\n" + "gebe nun die erste zahl ein\r\n" + "gebe nun die zweite zahl ein\r\n"
			+ "das ergebnis ist: 96 \r\n" + "soll ich noch etwas berechnen? (NE=0|ja=1)\r\n" + "hello world\r\n"
			+ "wähle eine der optionen: teilen(0), multiplizieren(1), addieren(2), subrahieren(3)\r\n" + "wähle eine der optionen: teilen(0), multiplizieren(1), addieren(2), subrahieren(3)\r\n"
			+ "gebe nun die erste zahl ein\r\n" + "gebe nun die zweite zahl ein\r\n" + "das ergebnis ist: 7 \r\n" + "soll ich noch etwas berechnen? (NE=0|ja=1)\r\n" + "tschüss";
	
	
	
	static final int STAP_MAX_GR = 0xFF;
	static final int REG_ANZ     = 0xFFFF;
	
	
	
	Interpreter           inter;
	ByteArrayInputStream  ein;
	ByteArrayOutputStream out;
	
	@Test
	void testInterpretiere1() throws IOException, InterpretierungsFehler {
		out = new ByteArrayOutputStream();
		ein = new ByteArrayInputStream(TEST_FUTTER_1_1.getBytes());
		inter = new StapelbesitzendeTpsInterpreterImpl(new PrintStream(out), new Scanner(ein), REG_ANZ, STAP_MAX_GR);
		inter.interpretiere(new File(TEST_DATEI_1), StandardCharsets.UTF_8);
		assertEquals(TEST_ERGEBNIS_1_1, new String(out.toByteArray()));
		out = new ByteArrayOutputStream();
		ein = new ByteArrayInputStream(TEST_FUTTER_1_2.getBytes());
		inter = new StapelbesitzendeTpsInterpreterImpl(new PrintStream(out), new Scanner(ein), REG_ANZ, STAP_MAX_GR);
		inter.interpretiere(new File(TEST_DATEI_1), StandardCharsets.UTF_8);
		assertEquals(TEST_ERGEBNIS_1_2, new String(out.toByteArray()));
	}
	
}
