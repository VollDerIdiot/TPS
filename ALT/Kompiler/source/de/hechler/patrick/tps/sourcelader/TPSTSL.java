package de.hechler.patrick.tps.sourcelader;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Set;

import de.hechler.patrick.tps.hilfen.Regeln;
import de.hechler.patrick.tps.konstanten.Sichtbarkeit;
import de.hechler.patrick.tps.objekte.BefehlsBox;
import de.hechler.patrick.tps.objekte.Datei;
import de.hechler.patrick.tps.objekte.Variable;
import de.hechler.patrick.tps.objekte.befehle.Befehl;
import de.hechler.patrick.tps.objekte.befehle.GeheAusNBoxen;
import de.hechler.patrick.tps.objekte.befehle.Vernichte;
import de.hechler.patrick.tps.objekte.fehler.FalscheSourcenFehler;
import de.hechler.patrick.tps.objekte.fehler.KompilierungsFehler;
import de.hechler.patrick.tps.objekte.methode.Methode;
import de.hechler.patrick.tps.objekte.sache.Ding;
import de.hechler.patrick.tps.objekte.sache.DingPlan;
import de.hechler.patrick.tps.objekte.sache.FertigeKlasse;
import de.hechler.patrick.tps.objekte.sache.FertigeSache;
import de.hechler.patrick.tps.objekte.sache.FertigesDing;
import de.hechler.patrick.tps.objekte.sache.KlassenPlan;
import de.hechler.patrick.tps.objekte.sache.Sache;
import de.hechler.patrick.tps.objekte.sache.SachenPlan;
import de.hechler.patrick.tps.objekte.sache.SachenVariable;
import de.hechler.patrick.tps.objekte.sache.UnfertigeKlasse;
import de.hechler.patrick.tps.objekte.sache.UnfertigeSache;
import de.hechler.patrick.tps.objekte.sache.UnfertigesDing;

public class TPSTSL extends SourceLader {
	
	private static final String KONSTANT = "konstante";
	private static final Set <String> BESETZTE_NAMEN = null;
	private static final String BESSERT = "bessert";
	private static final String MACHT = "macht";
	
	public TPSTSL() {
		super("tpst");
	}
	
	
	@Override
	protected void ladeDatei() throws IOException, KompilierungsFehler {
		ladeDateiKopf();
		ladeSachen();
	}
	
	/**
	 * lädt den DateiKopf. Dies beinhaltet den Ort der Datei und die Abhängigkeiten zu anderen Dateien
	 * 
	 * @throws IOException
	 * @throws FalscheSourcenFehler
	 * @throws NoSuchElementException
	 */
	private void ladeDateiKopf() throws FalscheSourcenFehler, IOException {
		ladeOrt();
		ladeBraucht();
	}
	
	/**
	 * Lädt den Dateiort
	 * 
	 * @throws IOException
	 * @throws FalscheSourcenFehler
	 * @throws NoSuchElementException
	 */
	private void ladeOrt() throws FalscheSourcenFehler, IOException {
		try {
			erwarte(new FalscheSourcenFehler(), "Diese", "tolle", "Datei", "liegt", "in:");
			datei.ort(leser.nächsteZeile());
		} catch (NoSuchElementException e) {
			throw new FalscheSourcenFehler("zu frühes Dateiende, konnte nicht einmal den ort der Sache einlesen!");
		}
	}
	
	/**
	 * Lädt die Abhängigkeiten zu anderen Dateien
	 * 
	 * @throws IOException
	 * @throws FalscheSourcenFehler
	 */
	private void ladeBraucht() throws FalscheSourcenFehler, IOException {
		try {
			erwarte(new FalscheSourcenFehler(), "Diese", "tolle", "Datei");
			String zw = leser.nächstes();
			switch (zw) {
			case "kommt":
				erwarte(new FalscheSourcenFehler(), "alleine", "super", "zurecht!");
				break;
			case "benötigt:":
				do {
					datei.neueAbhängigkeit(leser.nächsteZeile());
					zw = leser.nächstes();
				} while ("und".equals(zw));
				leser.zurück();
				break;
			default:
				throw new FalscheSourcenFehler("erwartet: 'kommt' oder 'benötigt:' erhalten: '" + zw + "'");
			}
		} catch (NoSuchElementException e) {
			throw new FalscheSourcenFehler("zu frühes Dateiende, konnte nicht einmal den abhängigkeiten der Sache einlesen!");
		}
	}
	
	/**
	 * Lädt die {@link Sache}n der {@link Datei}
	 * 
	 * @throws IOException
	 * @throws KompilierungsFehler
	 */
	private void ladeSachen() throws IOException, KompilierungsFehler {
		ladeSachenKopf();
		while (ladeSachenInhalt()) {
			ladeSachenKopf();
		}
	}
	
	/**
	 * Lädt den Sachenkopf einer Sache
	 * 
	 * @throws IOException
	 * @throws FalscheSourcenFehler
	 */
	private void ladeSachenKopf() throws FalscheSourcenFehler, IOException {
		try {
			Sichtbarkeit sicht;
			String zw = leser.nächstes();
			boolean art;
			erwarte(new FalscheSourcenFehler(), "tolle");
			switch (zw) {
			case "Dieser":
				zw = leser.nächstes();
				erwarte(new FalscheSourcenFehler(), "heißt");
				switch (zw) {
				case "DingPlan":
					art = true;
					break;
				case "KlassenPlan":
					art = false;
					break;
				default:
					throw new FalscheSourcenFehler("erwartet: 'DingPlan' oder 'KlassenPlan' erhalten: '" + zw + "'");
				}
				zw = leser.nächstes();
				testeName(zw);
				if (art) {
					sache = new DingPlan(zw);
				} else {
					sache = new KlassenPlan(zw);
				}
				erwarte(new FalscheSourcenFehler(), "und", "ist");
				zw = leser.nächstes();
				if ('.' != zw.charAt(zw.length() - 1)) {
					throw new FalscheSourcenFehler("Direkt hinter dem sSachennamen hätte ein '.' sein müssen! " + zw);
				}
				zw = zw.substring(0, zw.length() - 1);
				sicht = erhalteSicht(zw);
				sache.sichtbarkeit(sicht);
				zw = leser.nächstes();
				if ( !"Es".equals(zw)) {
					leser.zurück();
					return;
				}
				erwarte(new FalscheSourcenFehler("habe 'bessert' erwartet!"), "bessert");
				zw = testeName(leser.nächstes());
				((SachenPlan) sache).dazuBessert(zw);
				zw = leser.nächstes();
				while ("+".equals(zw)) {
					zw = testeName(leser.nächstes());
					((SachenPlan) sache).dazuBessert(zw);
					zw = leser.nächstes();
				}
				return;
			case "Dieses":
				zw = leser.nächstes();
				boolean konst = false;
				switch (zw) {
				case KONSTANT:
					konst = true;
					erwarte(new FalscheSourcenFehler("habe 'Ding' erwartet!"), "Ding");
				case "Ding":
					art = true;
					break;
				case "unfertige":
					erwarte(new FalscheSourcenFehler("habe 'Ding' erwartet!"), "Ding");
					art = false;
				default:
					throw new FalscheSourcenFehler("habe 'Ding' oder 'unfertige' erwartet und '" + zw + "' erhalten!");
				}
				erwarte(new FalscheSourcenFehler(), "heißt");
				zw = testeName(leser.nächstes());
				if (art) {
					sache = new FertigesDing(zw, konst);
				} else {
					sache = new UnfertigesDing(zw);
				}
				erwarte(new FalscheSourcenFehler(), "und", "ist");
				zw = leser.nächstes();
				if ('.' != zw.charAt(zw.length() - 1)) {
					throw new FalscheSourcenFehler("Direkt hinter der Sichtbarkeit muss ein '.' sein! '" + zw + "' hatte dies nicht!");
				}
				sicht = erhalteSicht(zw.substring(0, zw.length() - 1));
				zw = leser.nächstes();
				if ( !"Es".equals(zw)) {
					leser.zurück();
					return;
				}
				zw = leser.nächstes();
				switch (zw) {
				case BESSERT:
					zw = testeName(leser.nächstes());
					if (art) {
						((UnfertigesDing) sache).bessert(zw);
					} else {
						((FertigesDing) sache).bessert(zw);
					}
					if ( !"Es".equals(leser.nächstes())) {
						leser.zurück();
						return;
					}
					erwarte(new FalscheSourcenFehler(), MACHT);
				case MACHT:
					zw = testeName(leser.nächstes());
					if (art) {
						((UnfertigesDing) sache).dazuMacht(zw);
					} else {
						((FertigesDing) sache).dazuMacht(zw);
					}
					do {
						zw = testeName(leser.nächstes());
						if (art) {
							((UnfertigesDing) sache).dazuMacht(zw);
						} else {
							((FertigesDing) sache).dazuMacht(zw);
						}
					} while ("+".equals(leser.nächstes()));
					leser.zurück();
					return;
				default:
					throw new FalscheSourcenFehler("erwartet: '" + BESSERT + "' oder '" + MACHT + "' erhalten: '" + zw + "'");
				}
			case "Diese":
				zw = leser.nächstes();
				konst = false;
				switch (zw) {
				case KONSTANT:
					konst = true;
					erwarte(new FalscheSourcenFehler(), "Klasse");
				case "Klasse":
					art = true;
					break;
				case "unfertige":
					art = false;
					erwarte(new FalscheSourcenFehler(), "Klasse");
					break;
				default:
					throw new FalscheSourcenFehler("erwartet: 'Klasse' oder 'unfertige' erhalten: '" + zw + "'");
				}
				erwarte(new FalscheSourcenFehler(), "heißt");
				zw = testeName(leser.nächstes());
				if (art) {
					sache = new FertigeKlasse(zw, konst);
				} else {
					sache = new UnfertigeKlasse(zw);
				}
				erwarte(new FalscheSourcenFehler(), "und", "ist");
				zw = leser.nächstes();
				if ('.' != zw.charAt(zw.length() - 1)) {
					throw new FalscheSourcenFehler("Direkt hinter der Sichtbarkeit muss ein '.' sein! '" + zw + "' hatte dies nicht!");
				}
				sicht = erhalteSicht(zw.substring(0, zw.length() - 1));
				sache.sichtbarkeit(sicht);
				
				if ( !"Es".equals(zw)) {
					leser.zurück();
					return;
				}
				zw = leser.nächstes();
				switch (zw) {
				case BESSERT:
					zw = testeName(leser.nächstes());
					if (art) {
						((FertigeKlasse) sache).bessert(zw);
					} else {
						((UnfertigeKlasse) sache).bessert(zw);
					}
					if ( !"Es".equals(leser.nächstes())) {
						leser.zurück();
						return;
					}
					erwarte(new FalscheSourcenFehler(), MACHT);
				case MACHT:
					zw = testeName(leser.nächstes());
					if (art) {
						((FertigeKlasse) sache).dazuMacht(zw);
					} else {
						((UnfertigeKlasse) sache).dazuMacht(zw);
					}
					do {
						zw = testeName(leser.nächstes());
						if (art) {
							((FertigeKlasse) sache).dazuMacht(zw);
						} else {
							((UnfertigeKlasse) sache).dazuMacht(zw);
						}
					} while ("+".equals(leser.nächstes()));
					leser.zurück();
					return;
				default:
					throw new FalscheSourcenFehler("erwartet: '" + BESSERT + "' oder '" + MACHT + "' erhalten: '" + zw + "'");
				}
			default:
				throw new FalscheSourcenFehler("erwartet: 'Dieser', 'Dieses' oder 'Diese' erhalten: '" + zw + "'");
			}
		} catch (NoSuchElementException e) {
			throw new FalscheSourcenFehler("Zu frühes Dateiende, konnte den Sachenkopf nicht einlesen!");
		}
	}
	
	/**
	 * Lädt den Inhalt einer Sache, dies ist alles, was sich nicht im Kopf beinhaltet und Sachenartspezifich
	 * 
	 * @return <code>true</code>, wenn danach noch eine weitere {@link Sache} kommt
	 * @throws IOException
	 * @throws KompilierungsFehler
	 */
	private boolean ladeSachenInhalt() throws IOException, KompilierungsFehler {
		if (sache instanceof DingPlan) {
			while (ladeUnfertigeMethode()) {
			}
			return false;
		} else if (sache instanceof UnfertigesDing) {
			while (ladeSachenVariable()) {
			}
			while (ladeErschaffeMethode()) {
			}
			while (ladeUnfertigeMethode()) {
			}
			while (ladeFertigeMethode()) {
			}
			return false;
		} else if (sache instanceof FertigesDing) {
			while (ladeSachenVariable()) {
			}
			while (ladeErschaffeMethode()) {
			}
			while (ladeFertigeMethode()) {
			}
			return false;
		} else if (sache instanceof KlassenPlan) {
			while (ladeUnfertigeMethode()) {
			}
			return false;
		} else if (sache instanceof UnfertigeKlasse) {
			while (ladeSachenVariable()) {
			}
			ladeErstesMethode();
			while (ladeUnfertigeMethode()) {
			}
			while (ladeFertigeMethode()) {
			}
			return false;
		} else if (sache instanceof FertigeKlasse) {
			while (ladeSachenVariable()) {
			}
			ladeErstesMethode();
			while (ladeFertigeMethode()) {
			}
			return false;
		} else {
			throw new RuntimeException("Unbekannte sache: '" + sache + "' von " + sache.getClass().getName());
		}
	}
	
	/**
	 * Lädt die erstes Methode einer {@link FertigeKlasse} bzw. {@link UnfertigeKlasse}
	 * 
	 * @throws IOException
	 * @throws KompilierungsFehler
	 */
	private void ladeErstesMethode() throws IOException, KompilierungsFehler {
		boolean art;
		Set <SachenVariable> vars;
		if (sache instanceof FertigeKlasse) {
			art = true;
		} else if (sache instanceof UnfertigeKlasse) {
			art = false;
		} else {
			throw new KompilierungsFehler("Wieso bin ich hier, wenn sache keine erstes-methode haben darf!?");
		}
		try {
			if ( !"Zuerst:".equals(leser.nächstes())) {
				leser.zurück();
				return;
			}
		} catch (NoSuchElementException eof) {
			return;
		}
		if (art) {
			vars = ((FertigeKlasse) sache).variablen();
		} else {
			vars = ((UnfertigeKlasse) sache).variablen();
		}
		BefehlsBox box = ladeBox(2, vars, null);
		if (art) {
			((FertigeKlasse) sache).zuerst(box);
		} else {
			((UnfertigeKlasse) sache).zuerst(box);
		}
	}
	
	/**
	 * lädt eine {@link BefehlsBox} und gibt diese zurück
	 * 
	 * @param einrückung
	 * @param variablen
	 * @return
	 * @throws IOException
	 * @throws NoSuchElementException
	 * @throws FalscheSourcenFehler
	 */
	private BefehlsBox ladeBox(int einrückung, Set <? extends Variable> variablen, String endArt) throws IOException, FalscheSourcenFehler {
		BefehlsBox erg = new BefehlsBox();
		variablen.forEach(var -> erg.neu(var));
		String zw;
		while (true) {
			try {
				taps(einrückung);
				zw = leser.nächstes();
				if ( !"VARIABLE:".equals(zw)) {
					leser.zurück();
					break;
				}
				String name = testeName(leser.nächstes());
				erwarte(new FalscheSourcenFehler(), "ist", "von");
				zw = testeName(leser.nächstes());
				Variable var = new Variable(zw, name);
				erg.neu(var);
			} catch (NoSuchElementException eof) {
				throw new FalscheSourcenFehler("Konnte nicht einmal die Variablen der Box einlesen!");
			}
		}
		do {
			// TODO Befehle einlesen
			taps(einrückung);
			String art = leser.nächstes();
			switch (art) {
			case "Wiederhohle":
				break;
			case "Mache":
				break;
			case "setzte":
				break;
			case "ist":
				break;
			case "sind":
				break;
			case "höre":
				break;
			case "verschwinde":
				if (endArt != null) {
					erwarte(new FalscheSourcenFehler(null), "mit");
					zw = leser.nächstes();
					try {
						testeName(zw);
						if (erg.hatVariable(zw)) {
//							TODO machen
						}
					} catch (FalscheSourcenFehler f) {
//						TODO machen
					}
				}
				break;
			case "gehe": {
				int anzahl;
				erwarte(new FalscheSourcenFehler(null), "aus");
				zw = leser.nächstes();
				switch (zw.substring(0, 4)) {
				case "DEZ:":
					anzahl = Integer.parseUnsignedInt(zw.substring(4), 10);
					break;
				case "HEX:":
					anzahl = Integer.parseUnsignedInt(zw.substring(4), 0x10);
					break;
				case "BIN:":
					anzahl = Integer.parseUnsignedInt(zw.substring(4), 0b10);
					break;
				case "OCT:":
					anzahl = Integer.parseUnsignedInt(zw.substring(4), 8);
					break;
				default:
					throw new FalscheSourcenFehler("Unbekante Zahlenformatierung: " + zw);
				}
				if (anzahl + 2 > einrückung) {
					throw new FalscheSourcenFehler("Kann nicht aus mehr Boxen, als ich bin");
				}
				erg.neu(new GeheAusNBoxen(anzahl));
				erwarte(new FalscheSourcenFehler(null), "Boxen!");
				break;
			}
			case "VERNICHTE":
				erwarte(new FalscheSourcenFehler(null), "MICH");
				if (sache instanceof FertigesDing || sache instanceof UnfertigesDing) {
					erg.neu(new Vernichte(sache));
				} else {
					throw new FalscheSourcenFehler("nur ein Ding kann sich VERNICHTEN!");
				}
				break;
			default:
				throw new FalscheSourcenFehler("unbekannte art!: '" + art + "'");
			}
			
			
			break;
		} while (true);
		return erg;
	}
	
	
	private void taps(int einrückung) throws NoSuchElementException, IOException, FalscheSourcenFehler {
		int test;
		int anzahl = 1;
		char[] check;
		String zw = leser.nächsteZeile();
		while (zw.isBlank()) {
			anzahl ++ ;
			zw = leser.nächsteZeile();
		}
		leser.zurück(anzahl);
		check = zw.toCharArray();
		for (test = 0; test < check.length; test ++ ) {
			if ('\t' != check[test]) {
				break;
			}
		}
		if (test != einrückung) {
			throw new FalscheSourcenFehler("Falsche anzahl an start tabs: " + test + " und nicht " + einrückung);
		}
	}
	
	
	/**
	 * Lädt eine {@link Methode} und speichert diese in der {@link SourceLader#sache}. Dies ist bei {@link FertigeSache} und {@link UnfertigeSache} möglich
	 * 
	 * @return ob es noch eine weitere {@link Methode} danach gibt
	 */
	private boolean ladeFertigeMethode() {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * Lädt eine Erschaffe-Methode eines {@link FertigesDing} oder {@link UnfertigesDing}
	 * 
	 * @return ob es noch eine weitere erschaffe Methode gibt
	 */
	private boolean ladeErschaffeMethode() {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * Lädt eine SachenVariable
	 * 
	 * @return ob es noch eine weitere SachenVariable gibt
	 */
	private boolean ladeSachenVariable() {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * Lädt eine unfertige Methode (möglich bei {@link SachenPlan} und {@link UnfertigeSache})
	 * 
	 * @return ob es noch eine weitere unfertige Methode gibt
	 */
	private boolean ladeUnfertigeMethode() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private static String testeName(String name) throws FalscheSourcenFehler {
		return Regeln.testeName(name, new FalscheSourcenFehler("ungültiger name: '" + name + "'"), BESETZTE_NAMEN);
	}
	
	private static Sichtbarkeit erhalteSicht(String sicht) {
		switch (sicht) {
		case "offen":
			return Sichtbarkeit.offen;
		case "vererbe":
			return Sichtbarkeit.vererben;
		case "datei":
			return Sichtbarkeit.datei;
		case "eigen":
			return Sichtbarkeit.eigen;
		default:
			throw new IllegalArgumentException("unbekannte Sichtbarkeit: '" + sicht + "'");
		}
	}
	
}
