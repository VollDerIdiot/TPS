package tps.kompiler.objekte.kompilieren;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import tps.kompiler.objekte.fehler.KompilierungsFehler;
import tps.kompiler.objekte.kompilieren.sourcenladen.TpsSourceLader;
import tps.kompiler.objekte.konstanten.Sichtbarkeit;
import tps.kompiler.objekte.programm.Datentyp;


class BekannteSourcenLaderTest {
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	@Test
	void testErhalteFileCharset() {
		File f = new File("test.tpst");
		TpsSourceLader lader = BekannteSourcenLader.erhalte(f, StandardCharsets.US_ASCII);
		assertNotNull(lader);
		assertEquals(StandardCharsets.US_ASCII,  lader.zeichensatz());
		assertEquals("tpst", lader.endung());

		try {
			BekannteSourcenLader.erhalte((File)null, StandardCharsets.ISO_8859_1);
		} catch (NullPointerException e) {
			assertEquals("Ich kann mit eimer null-Datei micht arbeiten!",  e.getMessage());
		}

		try {
			BekannteSourcenLader.erhalte(f, null);
		} catch (NullPointerException e) {
			assertEquals("Ich kann das nicht mit null machen!",  e.getMessage());
		}

	}
	
	@Test
	void testErhalteStringCharset() {
		String dateiname = "test.txt";
		Charset zeichensatz = StandardCharsets.ISO_8859_1;
		TpsSourceLader lader = BekannteSourcenLader.erhalte(dateiname, zeichensatz);
		assertNull(lader);

		dateiname = "test.tpstx";
		zeichensatz = StandardCharsets.ISO_8859_1;
		lader = BekannteSourcenLader.erhalte(dateiname, zeichensatz);
		assertNull(lader);

		dateiname = "test.....";
		zeichensatz = StandardCharsets.ISO_8859_1;
		lader = BekannteSourcenLader.erhalte(dateiname, zeichensatz);
		assertNull(lader);

		dateiname = "test.tps";
		zeichensatz = StandardCharsets.ISO_8859_1;
		lader = BekannteSourcenLader.erhalte(dateiname, zeichensatz);
		assertNull(lader);
		
		dateiname = "test.tpst";
		zeichensatz = StandardCharsets.ISO_8859_1;
		lader = BekannteSourcenLader.erhalte(dateiname, zeichensatz);
		assertNotNull(lader);
		assertEquals(zeichensatz,  lader.zeichensatz());
		assertEquals("tpst", lader.endung());

		try {
			BekannteSourcenLader.erhalte((String)null, StandardCharsets.ISO_8859_1);
		} catch (NullPointerException e) {
			assertEquals("Ich kann das nicht mit null machen!",  e.getMessage());
		}

		try {
			BekannteSourcenLader.erhalte("egal", null);
		} catch (NullPointerException e) {
			assertEquals("Ich kann das nicht mit null machen!",  e.getMessage());
		}

	}
	
	@Test
	void testNeuerLader() {
		TpsSourceLader abcLader = new TpsSourceLader() {
			@Override protected Sichtbarkeit leseSichtbarkeit() throws KompilierungsFehler { throw new UnsupportedOperationException(); }
			@Override protected Datentyp leseDatentyp() throws KompilierungsFehler { throw new UnsupportedOperationException(); }
			@Override protected void lade(String name) throws KompilierungsFehler { throw new UnsupportedOperationException(); }
			@Override public Set <String> besetzteNamen() { throw new UnsupportedOperationException(); }
			@Override
			public String endung() {
				return "abc";
			}
		};
		assertEquals("abc", abcLader.endung());
		boolean erfolg = BekannteSourcenLader.neuerLader(abcLader);
		assertTrue(erfolg);

		TpsSourceLader lader = BekannteSourcenLader.erhalte("test.abc", StandardCharsets.UTF_8);
		assertNotNull(lader);
		assertEquals(StandardCharsets.UTF_8,  lader.zeichensatz());
		assertTrue(abcLader == lader);
		assertEquals("abc", lader.endung());
		
		String dateiname = "test.tpst";
		Charset zeichensatz = StandardCharsets.ISO_8859_1;
		lader = BekannteSourcenLader.erhalte(dateiname, zeichensatz);
		assertNotNull(lader);
		assertEquals(zeichensatz,  lader.zeichensatz());
		assertEquals("tpst", lader.endung());

		lader = BekannteSourcenLader.erhalte("gibtes.nicht", zeichensatz);
		assertNull(lader);

		
	}
	
}
