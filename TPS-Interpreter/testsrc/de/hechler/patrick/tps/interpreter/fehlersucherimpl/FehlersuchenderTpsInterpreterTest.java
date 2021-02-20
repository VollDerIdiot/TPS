package de.hechler.patrick.tps.interpreter.fehlersucherimpl;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.hechler.patrick.tps.fehler.InterpretierungsFehler;
import de.hechler.patrick.tps.interpreter.FehlersuchenInterpreter;
import de.hechler.patrick.tps.interpreter.Interpreter;


class FehlersuchenderTpsInterpreterTest {
	
	private static final File STOPPE_DATEI = new File("./test-ein/stoppe.tps");
	private static final File STOPP_PUNKTE_DATEI = new File("./test-ein/stoppPunkte.tps");
	private FehlersuchenInterpreter inter;
	private ByteArrayInputStream    ein;
	private ByteArrayOutputStream   aus;
	
	@BeforeEach
	void setUp() {
		aus = new ByteArrayOutputStream();
	}
	
	@AfterEach
	void tearDown() throws Exception {
		inter = null;
		ein = null;
		aus = null;
	}
	
	@Test
	void testInterpretiere() {
		fail("Not yet implemented");
	}
	
	@Test
	void testIgnoriereStoppPunkte() {
		fail("Not yet implemented");
	}
	
	@Test
	void testAnordnungVon() {
		fail("Not yet implemented");
	}
	
	@Test
	void testFehlerStoppen() {
		fail("Not yet implemented");
	}
	
	@Test
	void testSchreibeRegister() {
		fail("Not yet implemented");
	}
	
	@Test
	void testSpringeZu() {
		fail("Not yet implemented");
	}
	
	@Test
	void testRufeAuf() {
		fail("Not yet implemented");
	}
	
	@Test
	void testStatusInt() {
		fail("Not yet implemented");
	}
	
	@Test
	void testLetzterFehlerArt() {
		fail("Not yet implemented");
	}
	
	@Test
	void testZwischendurch() {
		fail("Not yet implemented");
	}
	
	@Test
	void testMacheSchritt() {
		fail("Not yet implemented");
	}
	
	@Test
	void testMacheBisRaus() {
		fail("Not yet implemented");
	}
	
	@Test
	void testMacheBisStopper() throws IOException, InterpretierungsFehler {
		ein = new ByteArrayInputStream(new byte[0]);
		create(aus, ein, 0, 0);
		inter.lade(STOPP_PUNKTE_DATEI, StandardCharsets.UTF_8);
		assertNull(inter.macheBisStopper());
		
		ein = new ByteArrayInputStream(new byte[0]);
		create(aus, ein, 0, 0);
		inter.lade(STOPP_PUNKTE_DATEI, StandardCharsets.UTF_8);
		inter.stoppPunkt(3);
		assertNotNull(inter.macheBisStopper());
		
		ein = new ByteArrayInputStream(new byte[0]);
		create(aus, ein, 0, 0);
		inter.lade(STOPP_PUNKTE_DATEI, StandardCharsets.UTF_8);
		inter.stoppPunkt(3);
		inter.ignoriereStoppPunkte(false);
		inter.run();
		inter.nächstes();
		
		ein = new ByteArrayInputStream(new byte[0]);
		create(aus, ein, 0, 0);
		inter.lade(STOPP_PUNKTE_DATEI, StandardCharsets.UTF_8);
		inter.stoppPunkt(3);
		inter.ignoriereStoppPunkte(false);
		inter.stoppPunkt(70);
		inter.stoppPunkt(50);
		inter.stoppPunkt(33);
		inter.stoppPunkt(8);
		inter.run();
		inter.nächstes();
	}
	
	@Test
	void testStoppe() throws IOException, InterpretierungsFehler {
		ein = new ByteArrayInputStream(new byte[0]);
		create(aus, ein, 0, 0);
		inter.lade(STOPPE_DATEI, StandardCharsets.UTF_8);
		new Thread(inter).start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		assertEquals(Interpreter.STATUS_LÄUFT, inter.status() & Interpreter.STATUS_LÄUFT);
		inter.stoppe();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		assertEquals(Interpreter.STATUS_ANGEHALTEN, inter.status() & Interpreter.STATUS_ANGEHALTEN);
		assertEquals(0, inter.status() & Interpreter.STATUS_LÄUFT);
	}
	
	private void create(OutputStream aus, InputStream ein, int register, int stapel) {
		inter = new FehlersuchenderTpsInterpreter(new PrintStream(aus), new Scanner(ein), register, stapel);
	}
	
}
