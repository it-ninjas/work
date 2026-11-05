# Aufgaben Objekte anwenden

## Lernziel

Du entwickelst Lösungen zu einfachen Anforderungen mithilfe von vorgefertigten Klassen, die Java mitliefert.

## Vorbereitungsarbeiten

<!--instructions-->

## Aufgabe 1

Simuliere 10 Würfelwürfe. Erzeuge ein Random-Objekt und würfle in einer Schleife 10-mal eine Zahl von 1 bis 6. Speichere jedes Ergebnis in einer List<Integer>. Gib am Ende aus:

- alle Würfe (die ganze Liste)
- wie oft eine 6 gewürfelt wurde.
- Den Durchschnitt er Würfelwürfe


## Aufgabe 2

Gegeben ist eine Klasse `Basket` mit den folgenden Methoden:

```java
void add(String name);          // Fügt neuen Artikel hinzu
void remove(String name);       // Entfernt einen Artikel
int count();                    // Zählt die Artikel im Einkaufskorb
boolean contains(String name);  // Sieht nach, ob der Artikel im Einkaufskorb ist
```

- Erstelle ein Objekt des Typs `Basket`
- Konsoleneingabe:
  - Frag den Benutzer nach einem Artikel
  - Lies den Artikel von der Konsole
  - Speichere den Artikel im `Basket` Objekt
  - Frage den Benutzer, ob er einen weiteren Artikel hinzufügen will. Wiederhole, bis der Benutzer nein sagt
- Gib an, wie viele Artikel bisher im Korb sind
- Überprüfe, ob dein Einkaufskorb Birnen enthält. Wenn nicht, füge sie hinzu
- Überprüfe, ob dir jemand Gummibärchen in den Korb geschmuggelt hat. Wenn ja, entferne sie
- Gib noch einmal die Anzahl der Artikel aus


```java

```



## Aufgabe 3

Gegeben ist eine Klasse `Playlist` mit den folgenden Methoden:

```java
void addSong(String title);     // Titel zur Playlist hinzufügen
void removeSong(int position);  // Titel aus der Playlist entfernen
String getSong(int position);   // Titel an der gegebenen Position auslesen
int count();                    // Anzahl Titel in der Playlist ausgeben
```
- Erstelle ein Objekt des Typs `Playlist`
- Konsoleneingabe:
  - Frag den Benutzer nach einem Titel
  - Lies den Titel von der Konsole
  - Speichere den Titel im `Basket` Objekt
  - Frage den Benutzer, ob er einen weiteren Titel hinzufügen will. Wiederhole, bis der Benutzer nein sagt
- Gib an, wie viele Titel bisher in der Playlist sind
- Gib eine Liste der Titel in der Playlist aus


```java

```


