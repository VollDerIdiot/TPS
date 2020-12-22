package de.hechler.patrick.tps.sourcelader;

import java.io.IOException;
import java.util.NoSuchElementException;

import de.hechler.patrick.tps.objekte.Datei;
import de.hechler.patrick.tps.objekte.fehler.FalscheSourcenFehler;
import de.hechler.patrick.tps.objekte.methode.Methode;
import de.hechler.patrick.tps.objekte.sache.DingPlan;
import de.hechler.patrick.tps.objekte.sache.FertigeKlasse;
import de.hechler.patrick.tps.objekte.sache.FertigeSache;
import de.hechler.patrick.tps.objekte.sache.FertigesDing;
import de.hechler.patrick.tps.objekte.sache.KlassenPlan;
import de.hechler.patrick.tps.objekte.sache.Sache;
import de.hechler.patrick.tps.objekte.sache.SachenPlan;
import de.hechler.patrick.tps.objekte.sache.UnfertigeKlasse;
import de.hechler.patrick.tps.objekte.sache.UnfertigeSache;
import de.hechler.patrick.tps.objekte.sache.UnfertigesDing;

public class TPSTSL extends SourceLader {
	
	public TPSTSL() {
		super("tpst");
	}
	
	
	@Override
	protected void ladeDatei() throws FalscheSourcenFehler, IOException {
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
	 */
	private void ladeSachen() {
		ladeSachenKopf();
		while (ladeSachenInhalt()) {
			ladeSachenKopf();
		}
	}
	
	/**
	 * Lädt den Sachenkopf einer Sache
	 */
	private void ladeSachenKopf() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Lädt den Inhalt einer Sache, dies ist alles, was sich nicht im Kopf beinhaltet und Sachenartspezifich
	 * 
	 * @return <code>true</code>, wenn danach noch eine weitere {@link Sache} kommt
	 */
	private boolean ladeSachenInhalt() {
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
			ladeerstesMethode();
			while (ladeUnfertigeMethode()) {
			}
			while (ladeFertigeMethode()) {
			}
			return false;
		} else if (sache instanceof FertigeKlasse) {
			while (ladeSachenVariable()) {
			}
			ladeerstesMethode();
			while (ladeFertigeMethode()) {
			}
			return false;
		} else {
			throw new RuntimeException("Unbekannte sache: '" + sache + "' von " + sache.getClass().getName());
		}
	}
	
	/**
	 * Lädt die erstes Methode einer {@link FertigeKlasse} bzw. {@link UnfertigeKlasse}
	 */
	private void ladeerstesMethode() {
		// TODO Auto-generated method stub
		
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
	
}
