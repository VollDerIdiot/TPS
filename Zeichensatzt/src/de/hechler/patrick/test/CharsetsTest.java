package de.hechler.patrick.test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.spi.CharsetProvider;
import java.util.ServiceLoader;

class CharsetsTest {
	
	
	public static void main(String[] args) throws IOException {
		Charset csu = Charset.forName("utf-8");
		System.out.println(csu.name());
		ServiceLoader<CharsetProvider> loader = ServiceLoader .load(CharsetProvider.class);
		loader.forEach(csp -> {
			System.out.println(csp.getClass());
			csp.charsets().forEachRemaining(cs -> {
				System.out.println("  " + cs.displayName() + " - " + cs.name());
				if (!cs.aliases().isEmpty()) {
					System.out.println("    " + cs.aliases());
				}
			});
		});
	}
	
}
