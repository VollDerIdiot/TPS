package de.hechler.patrick.tps.interpreter.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.hechler.patrick.pzs8b.Pzs8bCharset;
import de.hechler.patrick.tps.fehler.InterpretierungsFehler;
import de.hechler.patrick.tps.fehler.UnbekannteStellenFehler;


class VerbesserterTpsInterpreterImplTest {
	
	private static final String TEST_1_1_1 = "addiere      3 \r\n" + "   mit 4.\r\n" + "multipliziere ergebnis mit 2. gebe das ergebnis aus.   \r\n" + "  ";
	private static final String TEST_1_1_2 = "";
	private static final String TEST_1_1_3 = "gebe das ergebnis AUS.";
	private static final String TEST_1_2 = "addiere 4 mit 3. multipliziere 5 mit ergebnis. gebe folgendes aus: das ergebnis ist:. gebe das ergebnis aus.";
	private static final String TEST_1_3 = "addiere ergebnis mit 3.\r\n" + "speichere das ergebnis im zwischenspeicher.\r\n" + "mache einen zeilenumbruch.\r\n" + "multipliziere 5 mit ergebnis.\r\n"
			+ "gebe den zwischenspeicher aus.\r\n" + "dividiere ergebnis mit zwischen. " + "mache einen zeilenumbruch. gebe das ergebnis aus.";
	private static final String TEST_2_1 = "addiere 23 mit 2. " + "vergleiche ergebnis mit 5. " + "springe zur stelle: JMP. ";
	private static final String TEST_2_2 = "addiere 23 mit 2.\r\n" + "vergleiche ergebnis mit 5.\r\n" + "springe zur stelle: SPRUNG.\r\n" + "wenn es größer ist springe zur stelle: GROSS.\r\n"
			+ "hier ist die stelle: KLEIN.\r\n" + "vergleiche zwischen mit ergebnis.\r\n" + "speichere das ergebnis im zwischenspeicher.\r\n" + "wenn es gleich ist springe zur stelle: GLEICH.\r\n"
			+ "hier ist die stelle: SPRUNG.\r\n" + "mache einen zeilenumbruch.\r\n" + "wenn es nicht gleich ist springe zur stelle: KLEIN.\r\n" + "hier ist die stelle: GROSS.\r\n"
			+ "multipliziere 2 mit zwischen.\r\n" + "vergleiche 0 mit zwischen.\r\n" + "wenn es nicht gleich ist springe zur stelle: ZWISCHENINITIALISIERT.\r\n" + "addiere 136 mit 1.\r\n"
			+ "speichere das ergebnis im zwischenspeicher.\r\n" + "hier ist die stelle: ZWISCHENINITIALISIERT.\r\n" + "dividiere zwischen mit ergebnis.\r\n" + "hier ist die stelle: GLEICH.\r\n"
			+ "gebe das ergebnis aus.\r\n" + "mache einen zeilenumbruch.\r\n" + "gebe den zwischenspeicher aus.";
	
	VerbesserterTpsInterpreterImpl inter;
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	
	@BeforeEach
	void setUp() throws Exception {
		inter = new VerbesserterTpsInterpreterImpl(new PrintStream(out));
	}
	
	@AfterEach
	void tearDown() throws Exception {
		inter = null;
		out = null;
	}
	
	@Test
	void testInterpretiereV1_1() throws IOException, InterpretierungsFehler {
		inter.interpretiere(new ByteArrayInputStream(TEST_1_1_1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
		inter.interpretiere(new ByteArrayInputStream(TEST_1_1_2.getBytes(StandardCharsets.UTF_16)), StandardCharsets.UTF_16);
		assertThrows(InterpretierungsFehler.class, () -> inter.interpretiere(new ByteArrayInputStream(TEST_1_1_3.getBytes(new Pzs8bCharset())), new Pzs8bCharset()));
		assertEquals("14", new String(out.toByteArray()));
	}
	
	@Test
	void testInterpretiereV1_2() throws IOException, InterpretierungsFehler {
		inter.interpretiere(new ByteArrayInputStream(TEST_1_2.getBytes(new Pzs8bCharset())), new Pzs8bCharset());
		String printed = new String(out.toByteArray());
		assertEquals("das ergebnis ist:35", printed);
	}
	
	@Test
	void testInterpretiereV1_3() throws IOException, InterpretierungsFehler {
		inter.interpretiere(new ByteArrayInputStream(TEST_1_3.getBytes(new Pzs8bCharset())), new Pzs8bCharset());
		String printed = new String(out.toByteArray());
		assertEquals(System.lineSeparator() + "3" + System.lineSeparator() + "5", printed);
	}
	
	@Test
	void testInterpretiereV2_1() throws IOException, InterpretierungsFehler {
		assertThrows(UnbekannteStellenFehler.class, () -> inter.interpretiere(new ByteArrayInputStream(TEST_2_1.getBytes(new Pzs8bCharset())), new Pzs8bCharset()));
	}
	
	@Test
	void testInterpretiereV2_2() throws IOException, InterpretierungsFehler {
		inter.interpretiere(new ByteArrayInputStream(TEST_2_2.getBytes(new Pzs8bCharset())), new Pzs8bCharset());
		String printed = new String(out.toByteArray());
		assertEquals("\r\n" + "\r\n" + "25\r\n" + "25", printed);
	}
	
}
