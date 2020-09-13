package tps.konstanten;

public enum KompiliertKonstanten {
	
	anfangBraucht(0x00),
	
	sachenAnfangKlasse(0x01), anfangUnfertigeKlasse(0x02), sachenAnfangPlanFürKlasse(0x02), sachenAnfangDing(0x03), sachenAnfangUnfertigesDing(0x04), sachenAnfangPlanFürDing(0x05),
	
	sichtbarkeitOffen(0x10), sichtbarkeitVererben(0x11), sichtbarkeitOrt(0x12), sichtbarkeitDatei(0x13), sichtbarkeitEigen(0x14),
	
	endeBoxEndeEinfach(0x20), endeBoxEndeMehrfach(0x21), endeVarEnde(0x22), endeSacheEnde(0x23), endeDateiEnde(0x24), endeStirb(0x25), endeMethodenEnde(0x26),
	
	zusatzKonstant(0x30),
	
	primBefehlSetzeAuf(0x40), primBefehlSchleife(0x44), primBefehlErbe(0x45), primBefehlIch(0x46), primBefehlIstNichts(0x47), primBefehlIstVon(0x48),
	
	komplexBefehlMethodenaufrufOhneParameter(0x50), komplexBefehlMethodenaufrufMitParameter(0x51), komplexBefehlWerfe(0x52), komplexBefehlFange(0x53), komplexBefehlVersuche(0x54),
	
	;
	
	public final int nummer;
	
	private KompiliertKonstanten(int nummer) {
		this.nummer = nummer;
	}
	
}
