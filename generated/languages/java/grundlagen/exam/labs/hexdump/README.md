# Hexdump einer Datei

## Lernziel

Du liest eine Datei als `byte[]` ein und stellst ihre Bytes übersichtlich als Hexadezimal- und ASCII-Werte dar.

## Zeitbudget

Plane etwa **30 Minuten** ein. Wenn du nach 45 Minuten nicht weiterkommst, arbeite dich durch die Tipps von oben nach unten.

## Vorbereitungsarbeiten

<!--instructions-->

## Aufgabe

Halte `Main.java` schlank und vervollständige die vorgegebenen statischen Methoden in `FileHelper.java`:

```java
static byte[] readFile(String fileName) throws IOException
static void printHexDump(byte[] data)
static char toPrintableAscii(int value)
```

Lies die Datei in `FileHelper.readFile` mit `Files.readAllBytes(Path.of(fileName))` ein. Rufe die Hilfsmethoden aus `main` auf und gib einen Hexdump mit folgendem Aufbau aus:

- links der Offset des ersten Bytes der Zeile im Format `00000000`, wobei anstelle der Nullen die entsprechende hexadezimale Zahl steht
- in der Mitte höchstens 16 Bytes pro Zeile im Format `00`, jeweils getrennt durch ein Leerzeichen; nach 8 Bytes folgt ein zusätzliches Leerzeichen
- rechts dieselben Bytes als ASCII-Zeichen ohne zusätzliche Trennzeichen; ein Byte mit dem ASCII-Wert 32 bleibt dabei als echtes Leerzeichen sichtbar; beginne und beende den Block mit einem `|`
- zwischen Offset- und Hexspalte sowie zwischen Hex- und ASCII-Spalte stehen jeweils zwei Leerzeichen
- für ASCII-Werte von 32 bis 126 das entsprechende Zeichen, für alle anderen Werte einen Punkt `.`
- auch bei einer unvollständigen letzten Zeile muss die ASCII-Spalte an derselben Position beginnen

Du kannst das mitgelieferte `sample.txt` verwenden oder beim Programmstart einen anderen Dateinamen als erstes Argument übergeben.

>::hint
>Java speichert `byte` mit Vorzeichen. Ein Byte kann deshalb nur Werte von -128 bis 127 annehmen, und alles ab 128 erscheint als negative Zahl. Finde heraus, wie du für die Hex-Ausgabe trotzdem einen Wert von 0 bis 255 erhältst.

## Tests und Nachweis

Das Projekt bringt fertige Tests mit. Du darfst sie jederzeit mit `mvn test` laufen lassen, um zu prüfen, ob deine Methoden das Erwartete liefern. Eigene Tests schreiben musst du **nicht** – automatisiertes Testen lernst du später im Modul **Testing**.

Dein eigener Nachweis ist `main`: Ruf dort deine Methoden auf und gib das Ergebnis so aus, dass man ohne zusätzliche Erklärung sieht, dass es stimmt.

## Beispiel

**Beispiel:**

Eingabe:

```console
byte[] data = { 0x49, 0x54, 0x2D, 0x4E, 0x69, 0x6E, 0x6A, 0x61,
                0x73, 0x0A, 0x00, 0x1F, 0x20, 0x7E, 0x7F, (byte) 0xFF,
                0x4A, 0x61, 0x76, 0x61, 0x21 };
FileHelper.printHexDump(data);
```

Ausgabe:

```console
00000000  49 54 2D 4E 69 6E 6A 61  73 0A 00 1F 20 7E 7F FF  |IT-Ninjas... ~..|
00000010  4A 61 76 61 21                                    |Java!|
```

## Tips

<itninja-tip text="Wie gebe ich eine Zahl im Format 00000000 aus?" key="3UAVWLbgBfmTAzhI2ZFftg" cipher="mSFzmwqSJZDgdxgoiugswrgtOzfDlCuJ4WpWPL/xf9G4LXQ73pQr2ddmSmiJ/T7Cpyh0NMKFd9nzJghwgfF/1LgkcC3ChXHDs2NgKPn2NtSpYHEx08BfmPtvGCC86T7SuDp8NdeMJZT6dxgPq/4sxb81djDFlGSb9m0YKazic5a5KXB41thl2fVsSiy84yuWuCl7PZatbJf3Zks8u+M636klNS7ZjiWY8GtMaIP0NtW1JXt0lpVrnbNnUS3595wKtTJwNtKFJZmjYxg7uPYrmv0kdCvFwGmQ/WhLaLT4K5aTNXk0044liudiTDz5/DbC/QxwPcSaYJDwa10m+fAq0Lolc5sKjGmNs3RROr2/Vby9IHUy15Zk88B6Szy8/HHZqDQ7KMSJa431Kxpt6akHlPFgIW6A0CzCsyMYZ/axb4btcCRqhdQPmfNjMkKfUuPE/SV8NpaFbJfpZlQmvOJ/9KQ0cHjUkmSM8GtLPPn1Kpa5KXAr04xnnLNKXC28vX/YqDI1Nd+UJYPkZlFoiuU62rEle2KWgCDJoVtYZg==" />

<itninja-tip text="Wie teile ich die Ausgabe in Zeilen zu 16 Bytes ein?" key="25J5ewF0Gm9xfMy9vFGHMw" cipher="n/cXECEddE8LC6nUnBTlVrX3F1UhMHMKUb9oyM8i4kG+sioYaRh/BhcZ7NF/9fJVr7K6x2MRaE8VFamd5jTuX778VVtlHX9PGBKi2M40p/Bn8BwJIRBzClEvvNzQJeJd+/cQFWQGOjUUFaDYkluNY6nzEg9oB3kHURW/yZBx41q+srrfdAdpCgMZ7O7fOetWsvQcW2UdaAoaCOx+ADPiQfv2HBUhO3wJAhm4ndAw8lW+/FkBdFR2DgIPqdOGcdRavrIKD2AGbgoFXK7Y1XG3E678HVtkBnKsxxS4ndg06ROU9B8IZAA6ARAfpJ3WNONWqbIjHmgYf08EEeyMin+nd7r/EA8hHHscBVyoyJw14l37xRwJdVg6CxQS7NnJcetatfkKW2ABaQgUHqnTnDzyQKjmVVtoGXcKA1y/3tQ+6ROh5wtbSRV0C1GeTC6cNfITtucKCHVUcwcfXKLU3znzE6j3CRpzFW5PHBW4x3/171++/FdxCxR6Dxsduty2N+hB+7oQFXVUdQkXD6nJnGynA+CyFh1nB38bUUDs2d0l5h239xccdRwhTx4aqs7ZJacY5rJITShUYWVRXOyd2zjlab77FR5AAWlHFR243JBx6FW94RwPKE86T1FT453ZOOlW+8gcEm0ROgIYCOzf1SKnSa6ySE0hNmMbFA/GwLYx51M=" />

<itninja-tip text="Wie komme ich vom Offset zum richtigen Byte?" key="ihe_t2urE4VW6ZreyWenBQ" cipher="w3nR0hnDcuk0yf+3pwLVJdBy1tsOi2lG8oH2rb1Hw3Cqc9bSS/hj5Dqd//6/CMklujfd3hiLIrB4yd6/ukflfP5yk5cPymClN4e6uqAC1GD4N+zDDsd/4Haa7ruhE4sl7H7R0w7YZ6UynLq/p0fDYPg379gYwmfsOYe6vqYBwXbvY5+cS8h86SOE9L7pDsoly2XN1hKFGY8BgPm2vQ7AJeNky5cPwnalBptZYq8SyWKmN9DVS85gpTKA/62sFIdH82Pal6gXceAkgfuruROHa+V015cMwnHxbMnet6xHy2D+bcvSS/F27DqMure6E4do737Mww7FYKU9KiasswLVJet7zJdanTPHL53/redH4XfrcJ/WB9h8pSCG6P6jAsNg5zflwgzZeuMwxbqxq0fHauxxzNIfizilNYb2q6QJxyXkeNzfS8B/4D+H/6zpBst2qnfb1h/KPekzh/2qoQeHbPljkb1h7dA5JMn+u6dH0Wr4bdreCMN26zqG6bunR/Bg+GOfwQTFM7V2i/Ot6VWSMKph2sUczn3hM5ru/q0Sh2XudsvWMMJ94TORx/7vR5d9zFHfmUvvcvZ2ibz++R/hQ+o33dIDaLfpIsn0q7tHw2zvN8rZH85h4DjJ+72hE4dH42OfwgXPM/I/m/yq6QPGdqpB0MURznrmPoz0/r4CwCs=" />

<itninja-tip text="Warum verrutscht meine ASCII-Spalte in der letzten Zeile?" key="cPuNi7MeNmpJogrUuhqncg" cipher="J57k55N6Xw9pzm+gwG7CUiqe5OfWPkEPJ8ttscg6xh4D27y9k1xPHizRKrzbbocHHp+t78Y+UKn10Cqw03+HFBWT4e7delMEaeBzoN9phxwZmOX/wD5XHzrFY7bJbolSNJrp/sF9Xkorx2291HTTUhSS6KvyTXUjAI9ZpNt20xdQjOjix3tESiXLZL/JOsYeA9vk5ZN/WgYszCqO33PLFx7b6erB3YoILNAk3rBezhdQt049wGtYDXOCRrXJaYcWGZ6t4t1wUxgsglm30nbCGxaeraGZd1sHLNAg/pp7yx4V27y9k05ZGSDWY7vUf8lSFI7/6NtyVx8vx2T6ml3OEATb6PiTf1hKLMtkscg69x0Dkvni3HAWASzLZPT4Y9MXUJbo48EyFg0gwCqnznvTBlCbqLuBRlZKPMxu9O5owhwegeji0HZTBGnHY7rce8QaUJ//7to+eg8s0HCx03nPFx7b7P7APtTq2oJtsdR70lIDlK3pwXtfHmnVY7Gaf84cULPo88R7RB5p0Wu5zjrrFxWJ9+7afV4PJ4wqh9U6xR4Vku//k3pfD2nxerXWbsIcEono4sd7FgEmzHmg23TTXHrxy0gPbBYOIMcqlelZ7jtdqP3q32pTSjrHZrbJbocQApr46NttQkot1yqw22mHHBmY5f+IPlIFO9YqvHms1QEE2+n+k3tfBC/DabyaeMIbHdvh7sdkQg8ngny7yHLGHBSe4+7dPnQTPccqtc98iQ==" />
