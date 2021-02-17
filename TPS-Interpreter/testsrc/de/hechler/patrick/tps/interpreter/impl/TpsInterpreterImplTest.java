package de.hechler.patrick.tps.interpreter.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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


class TpsInterpreterImplTest {
	
	private static final String TEST_1_1 = "addiere      3 \r\n" + "   mit 4.\r\n" + "multipliziere ergebnis mit 2. gebe das ergebnis aus.   \r\n" + "  ";
	private static final String TEST_1_2 = "";
	private static final String TEST_1_3 = "gebe das ergebnis AUS.";
	private static final String TEST_2 = "addiere 4 mit 3. multipliziere 5 mit ergebnis. gebe folgendes aus: das ergebnis ist. gebe das ergebnis aus.";
	private static final String TEST_3 = "addiere ergebnis mit 3.\r\n" + "speichere das ergebnis im zwischenspeicher.\r\n" + "mache einen zeilenumbruch.\r\n"
			+ "multipliziere 5 mit ergebnis.\r\n" + "gebe den zwischenspeicher aus.\r\n" + "dividiere ergebnis mit zwischen. "
			+ "mache einen zeilenumbruch. gebe das ergebnis aus.";
	
	@BeforeEach
	void setUp() throws Exception {
	}
	
	@AfterEach
	void tearDown() throws Exception {
		TpsInterpreterImpl.reset();
	}
	
	@Test
	void testInterpretiere1() throws IOException, InterpretierungsFehler {
		TpsInterpreterImpl.instanz().interpretiere(new ByteArrayInputStream(TEST_1_1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
		TpsInterpreterImpl.instanz().interpretiere(new ByteArrayInputStream(TEST_1_2.getBytes(StandardCharsets.UTF_16)), StandardCharsets.UTF_16);
		assertThrows(InterpretierungsFehler.class,
				() -> TpsInterpreterImpl.instanz().interpretiere(new ByteArrayInputStream(TEST_1_3.getBytes(new Pzs8bCharset())), new Pzs8bCharset()));
	}
	
	@Test
	void testInterpretiere2() throws IOException, InterpretierungsFehler {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		TpsInterpreterImpl.instanz().interpretiere(new ByteArrayInputStream(TEST_2.getBytes(new Pzs8bCharset())), new Pzs8bCharset());
		String printed = new String(out.toByteArray());
		assertEquals("das ergebnis ist 35", printed);
	}
	
	@Test
	void testInterpretiere3() throws IOException, InterpretierungsFehler {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		TpsInterpreterImpl.instanz().interpretiere(new ByteArrayInputStream(TEST_3.getBytes(new Pzs8bCharset())), new Pzs8bCharset());
		String printed = new String(out.toByteArray());
		assertEquals(System.lineSeparator() + "3" + System.lineSeparator() + "5", printed);
	}
	
}
