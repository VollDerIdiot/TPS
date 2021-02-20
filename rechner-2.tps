gebe folgendes aus: HALLO. mache einen zeilenumbruch.
lade die anzahl der register in den ergebnisspeicher.
vergleiche ergebnis mit 15.
wenn es kleiner ist springe zur stelle: KEINE_MINDESTANFORDERUNG.
schreibe die version in den zwischenspeicher.
vergleiche zwischen mit 6.
wenn es kleiner ist springe zur stelle: KEINE_MINDESTANFORDERUNG.
schreibe die maximale größe des stapels in den zwischenspeicher.
schreibe die aktuelle größe des stapels in den ergebnisspeicher.
subtrahiere zwischen mit ergebnis.
vergleiche ergebnis mit 1.
wenn es kleiner ist springe zur stelle: KEINE_MINDESTANFORDERUNG.
hier ist die stelle: START.
gebe folgendes aus: wähle eine der optionen: addieren, subrahieren, multiplizieren, teilen, modulo. mache einen zeilenumbruch.
lese das nächste wort des benutzers in die register ab 0 ein.
lade die zahl aus dem register 0 in den ergebnisspeicher.
vergleiche ergebnis mit 8.
wenn es gleich ist springe zur stelle: ADDIEREN.
wenn es größer ist springe zur stelle: TEST_LANG_WORT.
vergleiche ergebnis mit 6.
wenn es gleich ist springe zur stelle: TEST_KLEIN_WORT.
springe zur stelle: START.

hier ist die stelle: ADDIEREN.
vergleiche die register von 1 bis 9 mit dem text: addieren.
wenn es nicht gleich ist springe zur stelle: START.
mache einen stellenaufruf bei der stelle: LESE_EINS.
mache einen stellenaufruf bei der stelle: LESE_ZWEI.
addiere ergebnis mit zwischen.
springe zur stelle: ERGEBNISAUSGABE.

hier ist die stelle: TEST_LANG_WORT.
vergleiche ergebnis mit 11.
wenn es größer ist springe zur stelle: MULTIPLIZIEREN.
wenn es kleiner ist springe zur stelle: START.
vergleiche die register von 1 bis 13 mit dem text: subrahieren.
wenn es nicht gleich ist springe zur stelle: START.
mache einen stellenaufruf bei der stelle: LESE_EINS.
mache einen stellenaufruf bei der stelle: LESE_ZWEI.
subtrahiere ergebnis mit zwischen.
springe zur stelle: ERGEBNISAUSGABE.

hier ist die stelle: MULTIPLIZIEREN.
vergleiche die register von 1 bis 15 mit dem text: multiplizieren.
wenn es nicht gleich ist springe zur stelle: START.
mache einen stellenaufruf bei der stelle: LESE_EINS.
mache einen stellenaufruf bei der stelle: LESE_ZWEI.
multipliziere ergebnis mit zwischen.
springe zur stelle: ERGEBNISAUSGABE.

hier ist die stelle: TEST_KLEIN_WORT.
vergleiche die register von 1 bis 8 mit dem text: teilen.
wenn es gleich ist springe zur stelle: TEILEN.
vergleiche die register von 1 bis 8 mit dem text: modulo.
wenn es nicht gleich ist springe zur stelle: START.
vergleiche 0 mit 1.
hier ist die stelle: TEILEN.
mache einen stellenaufruf bei der stelle: LESE_EINS.
mache einen stellenaufruf bei der stelle: LESE_ZWEI.
dividiere ergebnis mit zwischen.
wenn es nicht gleich ist mache einen stellenaufruf bei der stelle: ZWISCHENERGEBNIS.

hier ist die stelle: ERGEBNISAUSGABE.
gebe folgendes aus: das ergebnis ist:. gebe ein leerzeichen aus. gebe das ergebnis aus. mache einen zeilenumbruch.
gebe folgendes aus: nochmal? 'ja' oder 'NE'. mache einen zeilenumbruch.
lese das nächste wort des benutzers in die register ab 0 ein.
lade die zahl aus dem register 0 in den ergebnisspeicher.
vergleiche ergebnis mit 2.
wenn es nicht gleich ist springe zur stelle: ENDE.
vergleiche die register von 1 bis 3 mit dem text: ja.
wenn es gleich ist springe zur stelle: START.
vergleiche die register von 1 bis 3 mit dem text: JA.
wenn es gleich ist springe zur stelle: START.
vergleiche die register von 1 bis 3 mit dem text: Ja.
wenn es gleich ist springe zur stelle: START.
vergleiche die register von 1 bis 3 mit dem text: jA.
wenn es gleich ist springe zur stelle: START.
springe zur stelle: ENDE.

hier ist die stelle: LESE_EINS.
gebe folgendes aus: gebe nun die erste zahl ein:. mache einen zeilenumbruch.
lese eine zahl ein.
wenn es einen fehler gab springe zur stelle: EINGABEFEHLER_EINS.
lade die ergebnis in das register 0.
gehe zurück.

hier ist die stelle: LESE_ZWEI.
gebe folgendes aus: gebe nun die zweite zahl ein:. mache einen zeilenumbruch.
lese eine zahl ein.
wenn es einen fehler gab springe zur stelle: EINGABEFEHLER_ZWEI.
speichere das ergebnis im zwischenspeicher.
lade die zahl aus dem register 0 in den ergebnisspeicher.
gehe zurück.

hier ist die stelle: EINGABEFEHLER_EINS.
lese das nächste wort des benutzers in die register ab 0 ein.
springe zur stelle: LESE_EINS.

hier ist die stelle: EINGABEFEHLER_ZWEI.
lese das nächste wort des benutzers in die register ab 0 ein.
springe zur stelle: LESE_ZWEI.

hier ist die stelle: ZWISCHENERGEBNIS.
addiere zwischen mit 0.
gehe zurück.
hier ist die stelle: KEINE_MINDESTANFORDERUNG.
gebe folgendes aus: MINDESTANFORDERUNG: version 6, 15 register, stapelFreiGröße von 1. mache einen zeilenumbruch.
hier ist die stelle: ENDE.
gebe folgendes aus: tschüss.