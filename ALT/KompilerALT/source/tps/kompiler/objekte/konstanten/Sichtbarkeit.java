package tps.kompiler.objekte.konstanten;

import tps.kompiler.objekte.fehler.FalscheSourcenFehler;

public enum Sichtbarkeit {
	
	offen, vererben, ort, datei, eigen;
	
	/**
	 * prüft, ob es eine Gleichnamige Sichtbarkeit gibt und gibt ebendiese zurück. <br>
	 * Wenn es keine gibt, wird ein <code>FalscheSourcenFehler</code> geworfen.
	 * 
	 * @param testen
	 *            die zu findende Sichtbarkeit als String
	 * @return Die gefundene Sichtbarkeit
	 * @throws FalscheSourcenFehler
	 *             Wenn die Sichtbarkeit nicht bekannt ist.
	 */
	public static Sichtbarkeit erhalteVomNamen(String testen) throws FalscheSourcenFehler {
		switch (testen) {
		case "offen":
			return offen;
		case "vererben":
			return vererben;
		case "ort":
			return ort;
		case "datei":
			return datei;
		case "eigen":
			return eigen;
		default:
			throw new FalscheSourcenFehler("'" + testen + "' ist keine bekannte Sichtbarkeit!");
		}
	}
	
}
