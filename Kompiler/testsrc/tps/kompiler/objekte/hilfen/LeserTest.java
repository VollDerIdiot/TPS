package tps.kompiler.objekte.hilfen;

import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


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
	@Disabled
	void testLeser() {
		fail("Not yet implemented");
	}
	
	@Test
	@Disabled
	void testZurück() {
		fail("Not yet implemented");
	}
	
	@Test
	@Disabled
	void testZurückInt() {
		fail("Not yet implemented");
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
	@Disabled
	void testHatNächsteZeile() {
		fail("Not yet implemented");
	}
	
	@Test
	@Disabled
	void testNächsteZeile() {
		fail("Not yet implemented");
	}
	
	@Test
	@Disabled
	void testAnfangsTabsulatoren() {
		fail("Not yet implemented");
	}
	
	@Test
	@Disabled
	void testÜberspringe() {
		fail("Not yet implemented");
	}
	
}
