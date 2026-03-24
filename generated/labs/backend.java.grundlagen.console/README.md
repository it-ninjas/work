<!--suppress CheckEmptyScriptTag -->

# Java Exercises - Ausgabe auf die Kommandozeile

Mit diesen Übungen kannst du dein Wissen über die Ausgabe auf die Kommandozeile (Konsole) vertiefen.

## Voraussetzung

- Du weisst, was mit Konsole gemeint ist.
- Du kannst Ausgaben auf die Konsole machen.
- Du weisst wie und warum man Zeichen escapen muss.

<!--instructions-->

## Aufgabe 1 - Hello World

Passe den Code an damit `Hello World` auf der Konsole ausgegeben wird.

```java
    public static void printHelloWorld(){

        // IT-Ninja: Füge hier Deinen Code ein:

    }
```

::src(src/main/java/ch/itninja/labs/basicexercises/HelloWorld.java)



## Aufgabe 2 - Ascii House

Zeichne ein Haus in der Konsole. Du darfst dazu folgende Zeichen verwenden:

- `'/'`, `'\'`, `'+'`, `'-'`, `'_'`, `'['`, `']'`, `'|'`, Leerzeichen (`' '`)

```java
    public static void printHouse(){

        // IT-Ninja: Füge hier Deinen Code ein:

    }
```

::src(src/main/java/ch/itninja/labs/basicexercises/AsciiHouse.java)

> **Hinweis:** Vorsicht bei `'\'`, das ist ein besonderes Zeichen in einem String und muss escaped werden, das
> heisst für ein `'\'` muss man innerhalb von einem String das Zeichen zweimal schreiben → `".\\."`

Falls unklar ist, was hier gemeint ist, schau dir [ASCII-Art](https://de.wikipedia.org/wiki/ASCII-Art) an.

Hier eine Katze als Beispiel:

```console
 /\_/\
( o.o )
 > ^ <
```

## Aufgabe 3 - Ascii Swiss Flag

Zeichne eine Schweizer Fahne. Die Fahne muss einen Rahmen haben. Du darfst dazu
folgende Zeichen verwenden:

- Im Rahmen: `'|'`, `'-'`, `'+''`, Leerzeichen (`' '`)
- Innerhalb: `'|'`, `'-'`, `'+'`, `'*'`, `'='`, `'@''`, Leerzeichen (`' '`)

```java
    public static void printSwissFlag(){

        // IT-Ninja: Füge hier Deinen Code ein:

    }
```

::src(src/main/java/ch/itninja/labs/basicexercises/AsciiSwissFlag.java)

Falls unklar ist, was hier gemeint ist, schau dir [ASCII-Art](https://de.wikipedia.org/wiki/ASCII-Art) an.

Hier ist die japanische Flagge als Beispiel:

```console
 ------------------
|                  |
|       @@@@       |
|     @@@@@@@@     |
|    @@@@@@@@@@    |
|     @@@@@@@@     |
|       @@@@       |
|                  |
 ------------------
```
