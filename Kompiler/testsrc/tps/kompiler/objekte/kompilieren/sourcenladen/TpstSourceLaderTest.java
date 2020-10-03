package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.hilfen.Leser;
import tps.kompiler.objekte.programm.Datentyp;


class TpstSourceLaderTest {
	
	private static TpstSourceLader sourceLader; 
	
	@BeforeAll
	static void setUpAll() throws Exception {
		sourceLader = new TpstSourceLader(); 
	}
	
	@AfterAll
	static void tearDownAll() throws Exception {
		sourceLader = null;
	}
	
	@Test
	void testBesetzteNamen() {
		assertNotNull(sourceLader.besetzteNamen());
		assertTrue(sourceLader.besetzteNamen().size() > 0);
	}
	
	@Test
	void testEndung() {
		assertEquals("tpst", sourceLader.endung());
	}
	
	@Test
	@Disabled
	void testLade() {
		fail("Not yet implemented");
	}
	
	@Test
	void testLeseDatentyp() throws FalscheSourcenFehler {
		sourceLader.sourceLeser = new Leser(new Scanner("variableEins"));
		Datentyp dat = sourceLader.leseDatentyp();
		assertNotNull(dat);
		assertEquals("variableEins", dat.name);
		assertNotNull(dat.zusatzsachen);
		assertTrue(dat.zusatzsachen.isEmpty());
		
		sourceLader.sourceLeser = new Leser(new Scanner("variableEins von Zeichenkette"));
		dat = sourceLader.leseDatentyp();
		assertNotNull(dat);
		assertEquals("variableEins", dat.name);
		assertNotNull(dat.zusatzsachen);
		System.out.println(dat.zusatzsachen);
	}
	
	@Test
	void testLeseSichtbarkeit() {
		fail("Not yet implemented");
	}
	
	@Test
	void testTpstSourceLader() {
		fail("Not yet implemented");
	}
	
	@Test
	void testTpsSourceLader() {
		fail("Not yet implemented");
	}
	
	@Test
	void testZeichensatzCharset() {
		fail("Not yet implemented");
	}
	
	@Test
	void testZeichensatz() {
		fail("Not yet implemented");
	}
	
	@Test
	void testTeste() {
		fail("Not yet implemented");
	}
	
	@Test
	void testLesePfad() {
		fail("Not yet implemented");
	}
	
}
