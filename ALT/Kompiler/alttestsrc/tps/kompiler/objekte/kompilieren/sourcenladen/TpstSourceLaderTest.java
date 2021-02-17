package tps.kompiler.objekte.kompilieren.sourcenladen;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import tps.kompiler.objekte.fehler.FalscheSourcenFehler;
import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.hilfen.Leser;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Datentyp;


class TpstSourceLaderTest {
	
	private static TpstSourceLader sourceLader;
	
	@BeforeEach
	void setUpAll() throws Exception {
		sourceLader = new TpstSourceLader();
	}
	
	@AfterEach
	void tearDownAll() throws Exception {
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
	void testLade() throws KompilierungsFehler {
		sourceLader.sourceLeser = new Leser(new Scanner("Diese tolle Datei liegt in: |:pfad:>"));
		sourceLader.lade("name");
		
		// TODO: continue this test if error is fixed
	}
	
	@Test
	void testZeichen() throws FalscheSourcenFehler {
		fail("Not yet implemented!");
	}
	
	@Test
	void testZeichenKette() throws FalscheSourcenFehler {
		fail("Not yet implemented!");
	}
	
	@Test
	void testLeseDatentyp() throws FalscheSourcenFehler {
		sourceLader.sourceLeser = new Leser(new Scanner("variableEins"));
		Datentyp dat = sourceLader.leseDatentyp();
		assertNotNull(dat);
		assertEquals("variableEins", dat.name);
		assertNotNull(dat.zusatzsachen);
		assertTrue(dat.zusatzsachen.isEmpty());
		
		// Zusatzgedings:
		// von [Name] (Potentiell: ( + [Name])* und [Name])
		sourceLader.sourceLeser = new Leser(new Scanner("variableEins von Zeichenkette"));
		dat = sourceLader.leseDatentyp();
		assertNotNull(dat);
		assertEquals("variableEins", dat.name);
		assertNotNull(dat.zusatzsachen);
		Set <String> names = dat.zusatzsachen.stream().map(dt -> dt.name).collect(Collectors.toSet());
		assertEquals(1, names.size());
		assertTrue(names.contains("Zeichenkette"));
		
		sourceLader.sourceLeser = new Leser(new Scanner("variableEins von Zeichenkette + variableZwei und Zahl"));
		dat = sourceLader.leseDatentyp();
		assertNotNull(dat);
		assertEquals("variableEins", dat.name);
		assertNotNull(dat.zusatzsachen);
		names = dat.zusatzsachen.stream().map(dt -> dt.name).collect(Collectors.toSet());
		assertEquals(3, names.size());
		assertTrue(names.contains("Zeichenkette"));
		assertTrue(names.contains("variableZwei"));
		assertTrue(names.contains("Zahl"));
	}
	
	@Test
	void testLeseSichtbarkeit() throws FalscheSourcenFehler {
		
		assertThrows(FalscheSourcenFehler.class, () -> {
			sourceLader.sourceLeser = new Leser(new Scanner("irgendwas"));
			sourceLader.leseSichtbarkeit();
		});
		
		List <String> sichtbarkeitenKeywords = Arrays.asList("offen", "vererbe", "datei", "eigen");
		for (String keyword : sichtbarkeitenKeywords) {
			sourceLader.sourceLeser = new Leser(new Scanner(keyword));
			Sichtbarkeit sichtbarkeit = sourceLader.leseSichtbarkeit();
			assertNotNull(sichtbarkeit);
			assertEquals(keyword, sichtbarkeit.name());
		}
		
		// TODO: continue this test if error is fixed
		
	}
	
	@Test
	void testZeichensatz() {
		assertNull(sourceLader.zeichensatz());
		
		sourceLader.zeichensatz(StandardCharsets.ISO_8859_1);
		assertEquals(StandardCharsets.ISO_8859_1, sourceLader.zeichensatz());
		
		sourceLader.zeichensatz(StandardCharsets.UTF_8);
		assertEquals(StandardCharsets.UTF_8, sourceLader.zeichensatz());
		
		assertThrows(NullPointerException.class, () -> {
			sourceLader.zeichensatz(null);
		});
		
	}
	
	@Test
	void testTeste() throws FalscheSourcenFehler {
		sourceLader.sourceLeser = new Leser(new Scanner("eins zwei drei"));
		sourceLader.teste("eins", "zwei");
		sourceLader.teste("drei");
		
		sourceLader.sourceLeser = new Leser(new Scanner("eins  \t\t  \tzwei\tdrei"));
		sourceLader.teste("eins", "zwei", "drei");
		
		assertThrows(FalscheSourcenFehler.class, () -> {
			sourceLader.sourceLeser = new Leser(new Scanner("eins 2 drei"));
			sourceLader.teste("eins", "zwei");
		});
		
		sourceLader.sourceLeser = new Leser(new Scanner("eins"));
		sourceLader.teste("eins");
		
		sourceLader.sourceLeser = new Leser(new Scanner(""));
		sourceLader.teste();
		
		assertThrows(FalscheSourcenFehler.class, () -> {
			sourceLader.sourceLeser = new Leser(new Scanner("eins"));
			sourceLader.teste("eins", "zwei");
		});
		
		// TODO: continue this test if error is fixed
		
	}
	
	@Test
	void testLesePfad() throws FalscheSourcenFehler {
		sourceLader.sourceLeser = new Leser(new Scanner("|:das/ist/ein/Pfad:>"));
		String pfad = sourceLader.lesePfad();
		assertNotNull(pfad);
		
		// TODO: continue this test if error is fixed
		
	}
	
}
