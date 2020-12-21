package de.hechler.patrick.tps.tools;

import java.lang.reflect.Array;

public class Stapel <W> {
	
	/**
	 * Standardwert für {@link #wachsen}, {@link #schrunpfeBei} und Standardweise der doppelte wert wie {@link #schrunpfenAuf}
	 */
	private static final int STANDARD = 8;
	
	
	
	/**
	 * Speichert die Werte des {@link Stapel}s
	 */
	private W[] werte;
	/**
	 * Um so viele Platzhalter wird {@link #werte} vergrößert, wenn nötig
	 */
	private int wachsen;
	/**
	 * Wenn so viele Platzhalter frei sind wird {@link #werte} um {@link #schrunpfenAuf} verkleinert
	 */
	private int schrunpfeBei;
	/**
	 * Um so viele Platzhalter wird {@link #werte} verkleinert, wenn {@link #schrunpfeBei} viele Platzhalter frei sind
	 */
	private int schrunpfenAuf;
	/**
	 * aktuelle anzahl an Werten in {@link #werte}
	 */
	private int anz;
	
	
	
	/**
	 * erzeugt einen leeren {@link Stapel}
	 * 
	 * @param egal
	 */
	public Stapel(W[] egal) {
		this(egal, 0, 0, STANDARD, STANDARD, STANDARD >> 1);
	}
	
	/**
	 * erzeugt einen Stapel mit den Werten von {@code von} bis {@code bis} aus {@code start} mit den Regelwerten {@code wachsen, schrumpfenBei, schrumpfenAuf}
	 */
	public Stapel(W[] start, int von, int bis, int wachsen, int schrumpfenBei, int schrumpfenAuf) {
		this.wachsen = wachsen;
		this.schrunpfeBei = schrumpfenBei;
		this.schrunpfenAuf = schrumpfenAuf;
		this.anz = 0;
		this.werte = neuesFeld(start, von, bis, wachsen);
	}
	
	
	
	/**
	 * Erstellt ein neues Feld von {@code von} bis {@code bis} aus {@code ursprung} mit {@code zusatz} vielen Freien Platzhaltern hinten drangehängt
	 * 
	 * @param ursprung
	 *            das ursprüngliche Feld aus dem die Werte Kopiert werden
	 * @param von
	 *            der Startindex (Inklusiv)
	 * @param bis
	 *            der Endpunkt (Exklusiv)
	 * @param zusatz
	 *            Die Anzahl an zusätzlichen Elementen
	 * @return das neu erstellte Feld
	 */
	private final W[] neuesFeld(W[] ursprung, int von, int bis, int zusatz) {
		@SuppressWarnings("unchecked")
		W[] erg = (W[]) Array.newInstance(ursprung.getClass().componentType(), bis - von + zusatz);
		System.arraycopy(ursprung, von, erg, 0, bis - von);
		return erg;
	}
	
	
	
	/**
	 * legt {@code legen} oben auf den {@link Stapel} drauf.
	 * 
	 * @param legen
	 *            Der Wert, der danach ganz oben auf den {@link Stapel} sein wird
	 */
	public void drauf(W legen) {
		if (anz == werte.length - 1) {
			werte = neuesFeld(werte, 0, werte.length, wachsen);
		}
		werte[anz ++ ] = legen;
	}
	
	/**
	 * Holt den obersten Wert vom {@link Stapel} herunter und gibt diesen auch zurück
	 * 
	 * @return den ehemals obersten Wert des {@link Stapel}s
	 */
	public W runter() {
		if (anz <= werte.length - schrunpfeBei) {
			werte = neuesFeld(werte, 0, anz, schrunpfenAuf);
		}
		W erg = werte[ -- anz];
		werte[anz] = null;
		return erg;
	}
	
	/**
	 * Gibt die Anzahl an Werten des {@link Stapel}s zurück
	 * 
	 * @return Die Anzahl an Werten des {@link Stapel}s
	 */
	public int anzahl() {
		return anz;
	}
	
	/**
	 * Gibt <code>true</code> zurück, wenn sich kein Wert in diesem {@link Stapel} befindet, also wenn {@link #anzahl()} bzw. {@link #anz} 0 ist.
	 * 
	 * @return <code>true</code> wenn der {@link Stapel} leer ist.
	 */
	public boolean istLeer() {
		return anz == 0;
	}
	
	/**
	 * Entfernt alle Werte des {@link Stapel}s. <br>
	 * Danach wird {@link #istLeer()} <code>true</code> zurückgeben.
	 */
	public void allesWeg() {
		werte = neuesFeld(werte, 0, 0, wachsen);
		anz = 0;
	}
	
}
