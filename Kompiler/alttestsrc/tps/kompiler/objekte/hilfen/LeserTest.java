package tps.kompiler.objekte.hilfen;

import java.util.NoSuchElementException;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class LeserTest {
	
	private Leser leser;
	
	
	private final static String TEST_TEXT1 = 
			  "Das ist der Titel!\r\n"
			+ "\t\tUnd hier die zweite Zeile.\r\n"
		    + "\r\n"
			+ "        Und Schluss().\r\n"
			+ "\r\n           \t"
			+ "\r\n";
	
	@BeforeEach
	void setUp() throws Exception {
		leser = new Leser(new Scanner(TEST_TEXT1));
	}
	
	@AfterEach
	void tearDown() throws Exception {
		leser = null;
	}
	
	@Test
	void testLeser() {
		assertThrows(NullPointerException.class, () -> new Leser((Scanner) null));

		leser = new Leser(new Scanner(""));
		assertFalse(leser.hatNächstes());
}
	
	@Test
	void testZurück() {
		assertEquals("Das", leser.nächstes());
		assertEquals("ist", leser.nächstes());
		assertEquals("der", leser.nächstes());
		assertEquals("Titel!", leser.nächstes());
		assertEquals("Und", leser.nächstes());
		leser.zurück();
		assertEquals("Und", leser.nächstes());
		leser.zurück(3);
		assertEquals("der", leser.nächstes());
		assertEquals("Titel!", leser.nächstes());
		leser.zurück(0);
		assertEquals("Und", leser.nächstes());
		leser.zurück(3);
		leser.zurück(2);
		assertEquals("Das", leser.nächstes());
		assertEquals("ist", leser.nächstes());
		assertEquals("der", leser.nächstes());
		assertThrows(IndexOutOfBoundsException.class, () -> leser.zurück(4));
		
		leser = new Leser(new Scanner(TEST_TEXT1));
		assertEquals("Das", leser.nächstes());
		assertEquals("ist", leser.nächstes());
		assertThrows(IndexOutOfBoundsException.class, () -> leser.zurück(4));

		leser = new Leser(new Scanner(TEST_TEXT1));
		assertThrows(IndexOutOfBoundsException.class, () -> leser.zurück(4));
		
		leser = new Leser(new Scanner(TEST_TEXT1));
		while (leser.hatNächstes()) {
			leser.nächstes();
		}
		assertFalse(leser.hatNächstes());
		leser.zurück();
		assertTrue(leser.hatNächstes());
		assertEquals("Schluss().", leser.nächstes());
		
	}
	

	@Test
	void testZurückZeile() {
		while (leser.hatNächsteZeile()) {
			leser.nächsteZeile();
		}
		assertFalse(leser.hatNächsteZeile());
		leser.zurück();
		assertTrue(leser.hatNächsteZeile());
		assertEquals("           \t", leser.nächsteZeile());
		assertFalse(leser.hatNächsteZeile());

	}
	@Test
	void testHatNächstes() {
		StringBuilder wörter = new StringBuilder();
		while (leser.hatNächstes()) {
			wörter.append(leser.nächstes()).append(" ");
		}
		assertNull(leser.nächstes());
		assertEquals("Das ist der Titel! Und hier die zweite Zeile. Und Schluss(). ", wörter.toString());
	}
	
	@Test
	void testNächstes() {
		assertEquals("Das", leser.nächstes());
		assertEquals("ist", leser.nächstes());
		assertEquals("der", leser.nächstes());
		assertEquals("Titel!", leser.nächstes());
		assertEquals("Und", leser.nächstes());
		assertEquals("hier", leser.nächstes());
		assertEquals("die", leser.nächstes());
		assertEquals("zweite", leser.nächstes());
		assertEquals("Zeile.", leser.nächstes());
		assertEquals("Und", leser.nächstes());
		assertEquals("Schluss().", leser.nächstes());
		assertNull(leser.nächstes());
	}
	
	@Test
	void testHatNächsteZeile() {
		StringBuilder sb = new StringBuilder();
		while (leser.hatNächsteZeile()) {
			sb.append(leser.nächsteZeile()).append("|");
		}
		assertEquals("Das ist der Titel!|\t\tUnd hier die zweite Zeile.|        Und Schluss().|           \t|", sb.toString());
		assertFalse(leser.hatNächsteZeile());
		leser.zurück();
		assertTrue(leser.hatNächsteZeile());
		assertEquals("           \t", leser.nächsteZeile());

		assertFalse(leser.hatNächsteZeile());
		assertEquals(null, leser.nächsteZeile());
		
	}
	
	@Test
	void testNächsteZeile() {
		assertEquals("Das ist der Titel!", leser.nächsteZeile());
		assertEquals("\t\tUnd hier die zweite Zeile.", leser.nächsteZeile());
		assertEquals("        Und Schluss().", leser.nächsteZeile());
		assertEquals("           \t", leser.nächsteZeile());
		assertEquals(null, leser.nächsteZeile());
	}
	
	@Test
	void testAnfangsTabsulatorenZeilen() {
		leser.nächsteZeile();
		assertEquals(0, leser.anfangsTabsulatoren());
		leser.nächsteZeile();
		assertEquals(2, leser.anfangsTabsulatoren());
		leser.nächsteZeile();
		assertEquals(0, leser.anfangsTabsulatoren());
		leser.nächsteZeile();
		assertEquals(0, leser.anfangsTabsulatoren());
		assertFalse(leser.hatNächsteZeile());
	}
	
	@Test
	void testAnfangsTabsulatorenWörter() {
		leser.nächstes();
		assertEquals(0, leser.anfangsTabsulatoren());
		leser.nächstes();
		assertEquals(0, leser.anfangsTabsulatoren());
		leser.nächstes();
		assertEquals(0, leser.anfangsTabsulatoren());
		leser.nächstes();
		assertEquals(0, leser.anfangsTabsulatoren());
		leser.nächstes();
		assertEquals(2, leser.anfangsTabsulatoren());
		leser.nächstes();
		assertEquals(2, leser.anfangsTabsulatoren());
		leser.nächstes();
		assertEquals(2, leser.anfangsTabsulatoren());
		leser.nächstes();
		assertEquals(2, leser.anfangsTabsulatoren());
		leser.nächstes();
		assertEquals(2, leser.anfangsTabsulatoren());
		leser.nächstes();
		assertEquals(0, leser.anfangsTabsulatoren());
		leser.nächstes();
		assertEquals(0, leser.anfangsTabsulatoren());
		leser.nächstes();
		assertFalse(leser.hatNächstes());
	}
	
	@Test
	void testÜberspringe() {
		assertEquals("Das", leser.nächstes());
		leser.überspringe(".*der");
		leser.zurück();
		assertEquals("ist", leser.nächstes());
		leser.zurück();
		// search for words in second line are not possible
		assertThrows(NoSuchElementException.class, () -> leser.überspringe(".*die"));
		assertEquals("ist", leser.nächstes());
		
	}
	
}
