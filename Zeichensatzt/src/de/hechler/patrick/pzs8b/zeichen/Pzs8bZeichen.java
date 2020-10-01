package de.hechler.patrick.pzs8b.zeichen;

import de.hechler.patrick.patischerZeichensatzt.zeichen.ZeichenZeugs;
import de.hechler.patrick.patischerZeichensatzt.zeichen.exeption.FalscheAnzahlBytesUmEinZeichenZuGenerieren;
import de.hechler.patrick.patischerZeichensatzt.zeichen.exeption.UnbekanntesZeichen;

public class Pzs8bZeichen extends ZeichenZeugs {
	
	private static Character[] alleZeichen;
	private static boolean[] command;
	
	
	
	private final byte zeichen;
	
	
	
	static {
		setup();
	}
	
	
	
	public Pzs8bZeichen(char zeichen) {
		if (isZeichen(zeichen)) {
			this.zeichen = (byte) getIndex(zeichen);
			return;
		}
		
		if (isCommand(zeichen)) {
			this.zeichen = (byte) zeichen;
			return;
		}
		
		throw new UnbekanntesZeichen("Ich kenne das Zeichen '" + zeichen + "' nicht!");
	}
	
	public Pzs8bZeichen(int zeichenNummer) {
		zeichen = (byte) zeichenNummer;
	}
	
	
	
	@Override
	public char getZeichen() {
		if (Pzs8bZeichen.isZeichen(Pzs8bZeichen.getChar(zeichen))) {
			return getChar(zeichen);
		}
		if (zeichen == 0xFF) {
			return (char) -1;
		}
		throw new UnbekanntesZeichen("Ich kenne das Zeichen mit der nummer '" + zeichen + "' nicht!");
	}
	
	@Override
	public int getNummer() {
		return zeichen;
	}
	
	@Override
	public String toString() {
		return getZeichen() + "";
	}
	
	public int benötigteBytesZumWissenWieVieleWeitereBenötigWerdenUmZuGenerieren() {
		return 0;
	}
	
	public int benötigteWeitereBytesZumGenerieren(byte[] bytes) {
		return 1 - bytes.length;
	}
	
	@Override
	public Pzs8bZeichen generiereVonBytes(byte[] bytes) throws FalscheAnzahlBytesUmEinZeichenZuGenerieren {
		if (bytes.length > 1) {
			throw new FalscheAnzahlBytesUmEinZeichenZuGenerieren(bytes.length - 1);
		}
		if (bytes.length < 1) {
			throw new FalscheAnzahlBytesUmEinZeichenZuGenerieren( -1);
		}
		return new Pzs8bZeichen( ((int) bytes[0]) & 0xFF);
	}
	
	public static boolean isCommand(int prüfen) {
		if (prüfen < command.length && prüfen >= 0) {
			return command[prüfen];
		}
		return false;
	}
	
	private static void setup() {
		alleZeichen = new Character[0xFD]; // Das letzte ist einfach immer frei!
		command = new boolean[0xFD];
		
		for (int index = 0; index <= 0x1F; index ++ ) {
			command[index] = true;
		}
		// 00 = ^@
		// 01 = ^A
		// 02 = ^B
		// 03 = ^C
		// 04 = ^D
		// 05 = ^E
		// 06 = ^F
		// 07 = ^G
		// 08 = ^H
		// 09 = ^I
		// 0A = ^J
		// 0B = ^K
		// 0C = ^L
		// 0D = ^M
		// 0E = ^N
		// 0F = ^O
		// 10 = ^P
		// 11 = ^Q
		// 12 = ^R
		// 13 = ^S
		// 14 = ^T
		// 15 = ^U
		// 16 = ^V
		// 17 = ^W
		// 18 = ^X
		// 19 = ^Y
		// 1A = ^Z
		// 1B = ^[
		// 1C = ^\
		// 1D = ^]
		// 1E = ^^
		// 1F = ^_
		
		alleZeichen[0x20] = ' ';
		alleZeichen[0x21] = '-';
		alleZeichen[0x22] = '_';
		alleZeichen[0x23] = '#';
		alleZeichen[0x24] = '.';
		alleZeichen[0x25] = ':';
		alleZeichen[0x26] = ',';
		alleZeichen[0x27] = ';';
		alleZeichen[0x28] = '\'';
		alleZeichen[0x29] = '"';
		alleZeichen[0x2A] = '+';
		alleZeichen[0x2B] = '*';
		alleZeichen[0x2C] = '~';
		alleZeichen[0x2D] = '/';
		alleZeichen[0x2E] = '\\';
		alleZeichen[0x2F] = '|';
		alleZeichen[0x30] = '0';
		alleZeichen[0x31] = '1';
		alleZeichen[0x32] = '2';
		alleZeichen[0x33] = '3';
		alleZeichen[0x34] = '4';
		alleZeichen[0x35] = '5';
		alleZeichen[0x36] = '6';
		alleZeichen[0x37] = '7';
		alleZeichen[0x38] = '8';
		alleZeichen[0x39] = '9';
		alleZeichen[0x3A] = '}';
		alleZeichen[0x3B] = '=';
		alleZeichen[0x3C] = '&';
		alleZeichen[0x3D] = '%';
		alleZeichen[0x3E] = '@';
		alleZeichen[0x3F] = '!';
		alleZeichen[0x40] = '°';
		
		alleZeichen[0x41] = 'A';
		alleZeichen[0x42] = 'B';
		alleZeichen[0x43] = 'C';
		alleZeichen[0x44] = 'D';
		alleZeichen[0x45] = 'E';
		alleZeichen[0x46] = 'F';
		alleZeichen[0x47] = 'G';
		alleZeichen[0x48] = 'H';
		alleZeichen[0x49] = 'I';
		alleZeichen[0x4A] = 'J';
		alleZeichen[0x4B] = 'K';
		alleZeichen[0x4C] = 'L';
		alleZeichen[0x4D] = 'M';
		alleZeichen[0x4E] = 'N';
		alleZeichen[0x4F] = 'O';
		alleZeichen[0x50] = 'P';
		alleZeichen[0x51] = 'Q';
		alleZeichen[0x52] = 'R';
		alleZeichen[0x53] = 'S';
		alleZeichen[0x54] = 'T';
		alleZeichen[0x55] = 'U';
		alleZeichen[0x56] = 'V';
		alleZeichen[0x57] = 'W';
		alleZeichen[0x58] = 'X';
		alleZeichen[0x59] = 'Y';
		alleZeichen[0x5A] = 'Z';
		alleZeichen[0x5B] = 'ẞ';
		alleZeichen[0x5C] = 'Ä';
		alleZeichen[0x5D] = 'Ü';
		alleZeichen[0x5E] = 'Ö';
		
		alleZeichen[0x5F] = '^';
		alleZeichen[0x60] = '§';
		
		alleZeichen[0x61] = 'a';
		alleZeichen[0x62] = 'b';
		alleZeichen[0x63] = 'c';
		alleZeichen[0x64] = 'd';
		alleZeichen[0x65] = 'e';
		alleZeichen[0x66] = 'f';
		alleZeichen[0x67] = 'g';
		alleZeichen[0x68] = 'h';
		alleZeichen[0x69] = 'i';
		alleZeichen[0x6A] = 'j';
		alleZeichen[0x6B] = 'k';
		alleZeichen[0x6C] = 'l';
		alleZeichen[0x6D] = 'm';
		alleZeichen[0x6E] = 'n';
		alleZeichen[0x6F] = 'o';
		alleZeichen[0x70] = 'p';
		alleZeichen[0x71] = 'q';
		alleZeichen[0x72] = 'r';
		alleZeichen[0x73] = 's';
		alleZeichen[0x74] = 't';
		alleZeichen[0x75] = 'u';
		alleZeichen[0x76] = 'v';
		alleZeichen[0x77] = 'w';
		alleZeichen[0x78] = 'x';
		alleZeichen[0x79] = 'y';
		alleZeichen[0x7A] = 'z';
		alleZeichen[0x7B] = 'ß';
		alleZeichen[0x7C] = 'ä';
		alleZeichen[0x7D] = 'ü';
		alleZeichen[0x7E] = 'ö';
		
		command[0x7F] = true;
		// 7F = DEL
		
		alleZeichen[0x80] = '$';
		alleZeichen[0x81] = '€';
		alleZeichen[0x82] = '£';
		alleZeichen[0x83] = '<';
		alleZeichen[0x84] = '>';
		alleZeichen[0x85] = '´';
		alleZeichen[0x86] = '`';
		alleZeichen[0x87] = '?';
		alleZeichen[0x88] = '(';
		alleZeichen[0x89] = ')';
		alleZeichen[0x8A] = '[';
		alleZeichen[0x8B] = ']';
		alleZeichen[0x8C] = '{';
		alleZeichen[0x8D] = '→';
		alleZeichen[0x8E] = '←';
		alleZeichen[0x8F] = '↑';
		alleZeichen[0x90] = '↓';
		alleZeichen[0x91] = '©';
		alleZeichen[0x92] = '®';
		alleZeichen[0x93] = '±';
		alleZeichen[0x94] = '¨';
		alleZeichen[0x95] = '„';
		alleZeichen[0x96] = '“';
		alleZeichen[0x97] = '¶';
		alleZeichen[0x98] = 'µ';
		alleZeichen[0x99] = 'ೲ';
		alleZeichen[0x9B] = '੦';
		alleZeichen[0x9C] = '۞';
		alleZeichen[0x9D] = '۝';
		alleZeichen[0x9F] = 'Ю';
		alleZeichen[0xA0] = 'Ф';
		alleZeichen[0xA1] = 'ϟ';
		alleZeichen[0xA2] = '‖';
		alleZeichen[0xA3] = '⁞';
		alleZeichen[0xA4] = '‼';
		alleZeichen[0xA5] = '≈';
		alleZeichen[0xA6] = '≤';
		alleZeichen[0xA7] = '≥';
		alleZeichen[0xA8] = '≠';
		alleZeichen[0xA9] = '÷';
		alleZeichen[0xAA] = 'ೱ';
		alleZeichen[0xAB] = '™';
		alleZeichen[0xAC] = 'Ʃ';
		alleZeichen[0xAD] = '֍';
		alleZeichen[0xAF] = '֎';
		alleZeichen[0xB0] = '⁰';
		alleZeichen[0xB1] = '¹';
		alleZeichen[0xB2] = '²';
		alleZeichen[0xB3] = '³';
		alleZeichen[0xB4] = '⁴';
		alleZeichen[0xB5] = '⁵';
		alleZeichen[0xB6] = '⁶';
		alleZeichen[0xB7] = '⁷';
		alleZeichen[0xB8] = '⁸';
		alleZeichen[0xB9] = '⁹';
		alleZeichen[0xBA] = '…';
		alleZeichen[0xBB] = '↔';
		alleZeichen[0xBC] = '↕';
		alleZeichen[0xBD] = '℗';
		alleZeichen[0xBE] = '⌂';
		alleZeichen[0xBF] = '₀';
		alleZeichen[0xC0] = '₁';
		alleZeichen[0xC1] = '₂';
		alleZeichen[0xC2] = '₃';
		alleZeichen[0xC3] = '₄';
		alleZeichen[0xC4] = '₅';
		alleZeichen[0xC5] = '₆';
		alleZeichen[0xC6] = '₇';
		alleZeichen[0xC7] = '₈';
		alleZeichen[0xC8] = '₉';
		alleZeichen[0xC9] = '♀';
		alleZeichen[0xCA] = '♂';
		alleZeichen[0xCB] = '☺';
		alleZeichen[0xCC] = '♠';
		alleZeichen[0xCD] = '♣';
		alleZeichen[0xCE] = '♥';
		alleZeichen[0xCF] = '♦';
		alleZeichen[0xD0] = '♪';
		alleZeichen[0xD1] = '♫';
		alleZeichen[0xD2] = '♯';
		alleZeichen[0xD3] = '✶';
		alleZeichen[0xD4] = '·';
		alleZeichen[0xD5] = 'Ͱ';
		alleZeichen[0xD6] = 'Ω';
		alleZeichen[0xD7] = 'π';
		alleZeichen[0xD8] = 'α';
		alleZeichen[0xD9] = 'β';
		alleZeichen[0xDA] = 'γ';
		alleZeichen[0xDB] = 'δ';
		alleZeichen[0xDC] = 'ꜛ';
		alleZeichen[0xDD] = 'ꜜ';
		alleZeichen[0xDE] = 'ǁ';
		alleZeichen[0xDF] = '⅓';
		alleZeichen[0xE0] = '⅔';
		alleZeichen[0xE1] = '⅕';
		alleZeichen[0xE2] = '⅖';
		alleZeichen[0xE3] = '⅗';
		alleZeichen[0xE4] = '⅘';
		alleZeichen[0xE5] = '⅙';
		alleZeichen[0xE6] = '⅚';
		alleZeichen[0xE7] = '⅛';
		alleZeichen[0xE8] = '⅜';
		alleZeichen[0xE9] = '⅝';
		alleZeichen[0xEA] = '⅞';
		alleZeichen[0xEB] = '‰';
		alleZeichen[0xEC] = '‼';
		alleZeichen[0xED] = '‽';
	}
	
	public static boolean contains(char prüfen) {
		int prüfer = getIndex(prüfen);
		if (prüfer == -1) {
			return false;
		}
		return true;
	}
	
	public static char getChar(int index) {
		if (alleZeichen == null || command == null) {
			setup();
		}
		if (isCommand(index)) {
			return (char) index;
		}
		if (index < alleZeichen.length && index >= 0) {
			return (char) alleZeichen[index];
		}
		return (char) -1;
	}
	
	public static int getIndex(char prüfen) {
		if (alleZeichen == null || command == null) {
			setup();
		}
		if (isCommand(prüfen)) {
			return prüfen;
		}
		int runde;
		for (runde = 0; runde < alleZeichen.length; runde ++ ) {
			if ((char) alleZeichen[runde] == prüfen) {
				return runde;
			}
		}
		return -1;
	}
	
	public static Boolean isZeichen(char prüfen) {
		if (isCommand(getIndex(prüfen))) {
			return null;
		}
		if (getIndex(prüfen) == -1 || prüfen == (new char[1])[0]) {
			return false;
		}
		return true;
	}
	
	public static ImmutableArray <Character> getAlle() {
		return new ImmutableArray <Character>(alleZeichen);
	}
	
	public static class ImmutableArray <I> {
		
		private I[] inhalt;
		
		
		
		public ImmutableArray(I[] inhalt) {
			this.inhalt = inhalt;
		}
		
		
		
		public I getInhalt(int index) {
			return inhalt[index];
		}
		
		public int lenght() {
			return inhalt.length;
		}
		
	}
	
}
