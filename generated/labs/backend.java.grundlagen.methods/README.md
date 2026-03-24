<!--suppress CheckEmptyScriptTag -->

# Java Exercises - Methoden

Mit diesen Übungen kannst du dein Wissen über Methoden vertiefen.

#### Voraussetzung


<!--instructions-->

## Aufgabe 1: Nachricht drucken

Passe untenstehenden Quellcode an und füge folgende Methode hinzu:

---

**Name der Methode:** *Bestimme selber einen passenden Namen für die Methode*  
**Funktion:** Gibt eine Nachricht auf der Konsole aus, Format: `Nachricht an [Name des Empfängers]: [Nachricht]`  
**Parameter1:** Name des Empfängers [String]  
**Parameter2:** Nachricht [String]  
**Rückgabewert:** Keiner  

---

> Halte die Coding Guidelines ein!

```java
public class MessageHelper {

    // IT-Ninja: Füge hier Deinen Code ein:
}
```

::src(src/main/java/ch/itninja/labs/basicexercises/MessageHelper.java)

Wenn du die Methode implementiert hast, kannst du sie aus `main` aufrufen.

```java
    public static void main(String[] args) {

        // Sample call for "Nachricht drucken"
        // IT-Ninja: Füge hier Deinen Code ein:

        // Sample call for "Minimum von drei Zahlen"
        // IT-Ninja: Füge hier Deinen Code ein:

        // Sample call for "Fibonacci"
        // IT-Ninja: Füge hier Deinen Code ein:
    }
```

::src(src/main/java/ch/itninja/labs/Main.java)

Falls du sie testen willst, kannst du sie aus dem vorbereiteten Test aufrufen.

```java
        try {
            // WHEN
            // Aufruf der Methode, welche wir testen wollen (etwas wie: methode(name, message);):
            // IT-Ninja: Füge hier Deinen Code ein:
        } finally {
            System.setOut(originalOut);
        }
```

::src(src/test/java/ch/itninja/labs/basicexercises/MessageHelperTest.java)

**Beispiel 1:**

Eingabe:

```console
yourImplementation("Peter", "Das Meeting beginnt um 9 Uhr.");
```

Ausgabe:

```console
Nachricht an Peter: Das Meeting beginnt um 9 Uhr.
```

**Beispiel 2:**

Eingabe:

```console
yourImplementation("Linda", "Bitte rufe Hans Mustermann zurÃ¼ck.");
```

Ausgabe:

```console
Nachricht an Linda: Bitte rufe Hans Mustermann zurÃ¼ck.
```

## Aufgabe 2: Minimum von drei Zahlen

Passe untenstehenden Quellcode an und füge folgende Methode hinzu:

---

**Name der Methode:** *Bestimme selber einen passenden Namen für die Methode*  
**Funktion:** Gibt die kleinste von 3 Zahlen zurück  
**Parameter1:** Erste Zahl [int]  
**Parameter2:** Zweite Zahl [int]  
**Parameter3:** Dritte Zahl [int]  
**Rückgabewert:** Kleinste der 3 Zahlen [int]  

---

> Halte die Coding Guidelines ein!

```java
public class NumberHelper {

    // IT-Ninja: Füge hier Deinen Code ein:
}
```

::src(src/main/java/ch/itninja/labs/basicexercises/NumberHelper.java)

Wenn du die Methode implementiert hast, kannst du sie aus `main` aufrufen.

```java
    public static void main(String[] args) {

        // Sample call for "Nachricht drucken"
        // IT-Ninja: Füge hier Deinen Code ein:

        // Sample call for "Minimum von drei Zahlen"
        // IT-Ninja: Füge hier Deinen Code ein:

        // Sample call for "Fibonacci"
        // IT-Ninja: Füge hier Deinen Code ein:
    }
```

::src(src/main/java/ch/itninja/labs/Main.java)

Falls du sie testen willst, kannst du sie aus dem vorbereiteten Test aufrufen.

```java
        try {
            // WHEN
            // Aufruf der Methode, welche wir testen wollen (etwas wie: min = methode(a, b, c);):
            // IT-Ninja: Füge hier Deinen Code ein:
        } finally {
        }
```

::src(src/test/java/ch/itninja/labs/basicexercises/NumberHelperTest.java)

**Beispiel 1:**

Eingabe:

```console
min = yourImplementation(63, 22, 98);
```

Ausgabe:

```console
Example Output: The minimum from 63, 22 and 98 is 22.

```

**Beispiel 2:**

Eingabe:

```console
min = yourImplementation(17, 67, 32);
```

Ausgabe:

```console
Example Output: The minimum from 17, 67 and 32 is 17.

```

**Beispiel 3:**

Eingabe:

```console
min = yourImplementation(4, 56, 3);
```

Ausgabe:

```console
Example Output: The minimum from 4, 56 and 3 is 3.

```

## Aufgabe 3: Fibonacci

Passe untenstehenden Quellcode an und füge folgende Methode hinzu:

---

**Name der Methode:** *Bestimme selber einen passenden Namen für die Methode*  
**Funktion:** Berechnet die n-te Zahl der Fibonacci-Folge.  
**Parameter1:** n [int]  
**Rückgabewert:** n-te Zahl der Fibonacci-Folge [int]  
**Abgrenzung:** Gibt -1 zurück, wenn Fibonacci-Folge ausserhalb des Wertebreichs von int ist.  

---

Informationen zur Fibonacci-Folge findest du [hier](https://de.wikipedia.org/wiki/Fibonacci-Folge).

> Halte die Coding Guidelines ein!

```java
public class FibonacciHelper {

    // IT-Ninja: Füge hier Deinen Code ein:
}
```

::src(src/main/java/ch/itninja/labs/basicexercises/FibonacciHelper.java)

Wenn du die Methode implementiert hast, kannst du sie aus `main` aufrufen.

```java
    public static void main(String[] args) {

        // Sample call for "Nachricht drucken"
        // IT-Ninja: Füge hier Deinen Code ein:

        // Sample call for "Minimum von drei Zahlen"
        // IT-Ninja: Füge hier Deinen Code ein:

        // Sample call for "Fibonacci"
        // IT-Ninja: Füge hier Deinen Code ein:
    }
```

::src(src/main/java/ch/itninja/labs/Main.java)

Falls du sie testen willst, kannst du sie aus dem vorbereiteten Test aufrufen.

```java
        try {
            // WHEN
            // Aufruf der Methode, welche wir testen wollen (etwas wie: fibonacci = methode(n);):
            // IT-Ninja: Füge hier Deinen Code ein:
        } finally {
        }
```

::src(src/test/java/ch/itninja/labs/basicexercises/FibonacciHelperTest.java)

**Beispiel 1:**

Eingabe:

```console
fibonacci = yourImplementation(0);
```

Ausgabe:

```console
Example Output: The 0. element of the Fibonacci sequence is 0.

```

**Beispiel 2:**

Eingabe:

```console
fibonacci = yourImplementation(1);
```

Ausgabe:

```console
Example Output: The 1. element of the Fibonacci sequence is 1.

```

**Beispiel 3:**

Eingabe:

```console
fibonacci = yourImplementation(2);
```

Ausgabe:

```console
Example Output: The 2. element of the Fibonacci sequence is 1.

```

**Beispiel 4:**

Eingabe:

```console
fibonacci = yourImplementation(7);
```

Ausgabe:

```console
Example Output: The 7. element of the Fibonacci sequence is 13.

```

**Beispiel 5:**

Eingabe:

```console
fibonacci = yourImplementation(-5);
```

Ausgabe:

```console
Example Output: The -5. element of the Fibonacci sequence is 0.

```

**Beispiel 6:**

Eingabe:

```console
fibonacci = yourImplementation(100);
```

Ausgabe:

```console
Example Output: The 100. element of the Fibonacci sequence is -1.

```
