<!--suppress CheckEmptyScriptTag -->

# Java Exercises - Debugging

Mit diesen Übungen kannst du dein Wissen zum Thema Debuggen vertiefen.

#### Voraussetzung

- Du weisst was ein Breakpoint ist.
- Du kannst den Debugger starten und den Code Schritt für Schritt ausführen



{{< ninja warning>}}
Zum Lösen der folgenden Aufgaben darfst du den Quellcode nicht verändern!
{{< /ninja >}}

## Aufgabe 1 - Wert in Zwischenberechnung herausfinden

Finde heraus, welcher Wert z hat, wenn x = 500 ist.

```java
    public static int generate(int iterations) throws InterruptedException {

        // IT-Ninja: Zum Lösen der folgenden Aufgaben darfst du den Quellcode nicht verändern!

        // IT-Ninja: Aufgabe 1 - Finde heraus, welcher Wert z hat, wenn x = 500 ist.

        // IT-Ninja: Aufgabe 2 - Hat z am Ende immer den gleichen Wert, auch wenn du in der 'for'-Schleife einen
        //                       Breakpoint gesetzt hast?

        // IT-Ninja: Erstelle Screenshots und diskutiere deine Resultate und Erkenntnisse mit deinem Praxisbildner.

        int z = 0;
        for(int x = 0; x < iterations; x++) {
            z = MagicNumberHelper.getSecretValue(x);
        }
        return z;
    }
```

::src(src/main/java/ch/itninja/labs/basicexercises/MagicNumber.java)

## Aufgabe 2 - Verhalten des Programms beim Debuggen

Beantworte folgende Frage: Hat z am Ende immer den gleichen Wert, auch wenn du in der 'for'-Schleife einen Breakpoint
gesetzt hast?

```java
    public static int generate(int iterations) throws InterruptedException {

        // IT-Ninja: Zum Lösen der folgenden Aufgaben darfst du den Quellcode nicht verändern!

        // IT-Ninja: Aufgabe 1 - Finde heraus, welcher Wert z hat, wenn x = 500 ist.

        // IT-Ninja: Aufgabe 2 - Hat z am Ende immer den gleichen Wert, auch wenn du in der 'for'-Schleife einen
        //                       Breakpoint gesetzt hast?

        // IT-Ninja: Erstelle Screenshots und diskutiere deine Resultate und Erkenntnisse mit deinem Praxisbildner.

        int z = 0;
        for(int x = 0; x < iterations; x++) {
            z = MagicNumberHelper.getSecretValue(x);
        }
        return z;
    }
```

::src(src/main/java/ch/itninja/labs/basicexercises/MagicNumber.java)

**Beispiel:**

Eingabe:

```console
MagicNumber.generate(1000);
```

Ausgabe:

```console
-32414486
```

{{< ninja info>}}
Erstelle ScreenShots und diskutiere deine Resultate und Erkenntnisse mit deinem Praxisbildner.
{{< /ninja >}}
