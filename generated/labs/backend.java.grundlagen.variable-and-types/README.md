<!--suppress CheckEmptyScriptTag -->

# Java Exercises - Variablen und primitive Datentypen

Mit diesen Übungen kannst du dein Wissen über Variablen und primitive Datentypen vertiefen.

#### Voraussetzung

- Du weisst was Variablen sind.
- Du kannst eine Variable deklarieren und initialisieren.
- Du weisst was primitive Datentypen sind.
- Du weisst wie man Variablen formatiert auf der Konsole ausgibt.

<!--instructions-->

## Aufgabe 1 - Hello It-Ninja

Erstelle eine Variable, welche deinen Namen beinhaltet.
Gib `Hello [name]` auf der Konsole aus.

```java
    public static void printHelloName(){

        // IT-Ninja: Füge hier Deinen Code ein:

    }
```

::src(src/main/java/ch/itninja/labs/basicexercises/HelloName.java)

**Beispielausgabe:**

```console
Hello It-Ninja
```

## Aufgabe 2 - Reise Report

Gib den folgenden Text mit `System.out.printf(...)` aus. Ersetze die kursiv, fett dargestellten Werte im Logbuch durch
Variablen, welche du selber definieren musst.

--- 
Reise Report – **_Takeshi_**, Codename **_ShadowFox_**  
Datum der Abreise: **_26. Juli 2025_**  
Mission: **_Code-Review_**  
Startpunkt: **_Lausanne_**  
Zielort: **_St. Gallen_**  
Abfahrt: **_06:14 Uhr_**  
Ankunft: **_09:07 Uhr_**  
Zwischenhalte: **_5_**  
Reisekosten: **_51.80_** **_CHF_**  
  
**_ShadowFox_** nutzte die **_1. Klasse_** am **_26. Juli 2025_**, um sich auf den anstehenden **_Code-Review_**
vorzubereiten. Mit einem Akku-Ladestand von **_92%_** und **_2_** mitgeführten Laptops war **_er_** bestens gerüstet.
Die Mission wurde **_erfolgreich_** abgeschlossen. Die Reisekosten sind in **_CHF_**.

---

Anforderungen:
- Verwende sinnvolle Datentypen (String, int, double, boolean)
- Nutze `printf` mit Formatangaben wie `%.2f`, `%d`, `%s`, `%%`
- Achte auf Lesbarkeit und saubere Struktur

```java
    public static void printTravelReport() {

        // IT-Ninja: Füge hier Deinen Code ein:
    }
```

::src(src/main/java/ch/itninja/labs/basicexercises/TravelReport.java)

**Beispiel:**

Eingabe:

```console
TravelReport.printTravelReport();
```

Ausgabe:

```console
Reise Report â€“ Takeshi, Codename ShadowFox
Datum der Abreise: 26. Juli 2025
Mission: Code-Review
Startpunkt: Lausanne
Zielort: St. Gallen
Abfahrt: 06:14 Uhr
Ankunft: 09:07 Uhr
Zwischenhalte: 5
Reisekosten: 51.80 CHF

ShadowFox nutzte die 1. Klasse am 26. Juli 2025, um sich auf die anstehende Code-Review vorzubereiten. Mit einem Akku-Ladestand von 92% und 2 mitgefÃ¼hrten Laptops war er bestens gerÃ¼stet. Die Mission wurde erfolgreich abgeschlossen. Die Reisekosten sind in CHF.
```
