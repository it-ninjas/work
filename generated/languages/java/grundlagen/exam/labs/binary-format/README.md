# Ein binäres Punktformat auslesen

## Lernziel

Du liest Header und Datensätze eines erfundenen Binärformats anhand fester Offsets und berücksichtigst, dass Datensätze auf eine feste Grösse aufgefüllt werden.

## Zeitbudget

Plane etwa **35 Minuten** ein. Wenn du nach 50 Minuten nicht weiterkommst, arbeite dich durch die Tipps von oben nach unten.

## Vorbereitungsarbeiten

<!--instructions-->

## Aufgabe

Das erfundene `.pts`-Format speichert eine Liste von Punkten. Es beginnt mit einem sechs Byte grossen Header:

| Offset | Grösse | Inhalt |
|------:|------:|---|
| `0x00` | 2 Bytes | Kennung `PT` |
| `0x02` | 4 Bytes | Anzahl Datensätze als 32-Bit-Zahl in Little Endian |
| `0x06` | … | Erster Datensatz, danach lückenlos die weiteren |

Ein Datensatz enthält zwei Koordinaten als vorzeichenbehaftete 16-Bit-Zahlen in Little Endian, zusammen also vier Nutzbytes:

| Relativer Offset | Grösse | Inhalt |
|------:|------:|---|
| `0x00` | 2 Bytes | Koordinate `x` |
| `0x02` | 2 Bytes | Koordinate `y` |

**Die Regel des Formats:** Jeder Datensatz wird mit Nullbytes auf ein Vielfaches von acht Bytes aufgefüllt. Aus den vier Nutzbytes werden dadurch acht gespeicherte Bytes, von denen die letzten vier zu keiner Koordinate gehören.

Implementiere in `PointFileHelper`:

```java
static int readInt16LittleEndian(byte[] data, int offset)
static int readInt32LittleEndian(byte[] data, int offset)
static int paddedSize(int size)
static void printPoints(byte[] data)
```

Prüfe zuerst die Kennung, lies die Anzahl Datensätze ab Offset 2 und gib danach die Koordinaten jedes Datensatzes aus.

>::hint
>Die Füllbytes gehören nicht zu `x` oder `y`, bestimmen aber mit, wo der nächste Datensatz beginnt. Genau dafür gibt es `paddedSize`: Rechne die Datensatzgrösse aus, statt die Acht fest in den Code zu schreiben.

## Tests und Nachweis

Das Projekt bringt fertige Tests mit. Du darfst sie jederzeit mit `mvn test` laufen lassen, um zu prüfen, ob deine Methoden das Erwartete liefern. Eigene Tests schreiben musst du **nicht** – automatisiertes Testen lernst du später im Modul **Testing**.

Dein eigener Nachweis ist `main`: Ruf dort deine Methoden auf und gib das Ergebnis so aus, dass man ohne zusätzliche Erklärung sieht, dass es stimmt.

## Beispiel

**Beispiel:**

Eingabe:

```console
byte[] data = {
    // Header: PT und Anzahl DatensÃ¤tze
    0x50, 0x54, 0x02, 0x00, 0x00, 0x00,
    // Datensatz 1: x = 10, y = 20 und vier FÃ¼llbytes
    0x0A, 0x00, 0x14, 0x00, 0x00, 0x00, 0x00, 0x00,
    // Datensatz 2: x = -5, y = 30 und vier FÃ¼llbytes
    (byte) 0xFB, (byte) 0xFF, 0x1E, 0x00, 0x00, 0x00, 0x00, 0x00
};
PointFileHelper.printPoints(data);
```

Ausgabe:

```console
Punkte: 2
1: (10, 20)
2: (-5, 30)
```

## Tips

<itninja-tip text="Wozu brauche ich paddedSize, wenn ein Datensatz doch immer acht Bytes gross ist?" key="4dEDmnGzdvIIIKiZgL2nEw" cipher="qL8j/hjWBZd6AGsF4sjJdMG4cO5R1gTSbEHbufTc02AidWDyHdoVmihJxfTlz4kztaNs7gvXE58oU8f17M7TM4WkI/MZ3VaTfVPa/OPVyXaP/SPpBdIChihEwfyg/MR7lfFq6BbWGJZ/T4jx6dPdZpKya+gU2hSXZgBKGROdxmaS8Wf/HMATnmpFxrnHz9J9hf0j+wTAVpZtTYj99Z3UYyJ1d/8Dkx+fKGXQ+O3YyTOFuGa6M9oalmpSzfD02IdylKIj/hTeVrptQcz88p3LeoSid7ZRwAKTfFSIqraNh3qP8Wf/H5M1nWxFiOP1ndN6kaFm9F+5fLZhRYjL5drCf8G1ZulR9RmAZUHc6qDRxmaVtHe6H9oVmnwAivzp04dXgKVm9ALSAogoSdvtoNzEe5XxQeMF1gXSb1LH6vOfizOSvm3+FMEY0ipFwfeg+cZnhL9w+wXJVoVhUsy54cjBM4S4bbon2hOebkHL8eXOh2WOvyP7EtsC0mlVzv7l22Svjb13uF+TNJdj4wz05Z3Ceo/xU+8f2ALSbUnG/POd83KGtHC6FNoYlyhahdLv0tV3iL9i7hSfVoXLhNr87p3CYMGiZvkZwFa8fVTS+/nJwmDN8Xb0FZMSl2FOiNrv2cIzihKn9xSTH59lRdq57tLEe8GwdvxR1x+XKFLB+ujJznSE8UTosgUFgW0MiPbo08IzhbBw6VHXA9JhSMa54dPBcpKiZvRR3gOBe1SGk4rd13KFtWb+ItoMlyAUgfmg0c52h7Rx7lHSGoFnAJC1oN3XcoW1Zv4i2gyXIBmB+aDKZK+TtWa6QIVWnmFFzvzy04k=" />

<itninja-tip text="Wie runde ich eine Zahl auf das nächste Vielfache von acht auf?" key="060IIZ4nG6fkCFjGjMN_Vw" cipher="l8h6AV2becuNazCjrJcNPrDGKE/rU2HTxGkttaDjGzag3ihF90I74IVmIrztqxMzutthUvdIdYeNZniM7bUed7LPe0L2SX7OgG0s/IbJHzezx2lX/y1yyZAoKKfopxoz85AoCbZUct2BKHPmu+pfePOVIQG0ByOc7mg4pobJKDah2GUB+kZoh4J9Nq34qhA5ush6VaQHe9SNcj3mo+NHd/mNMEG+RnfLgWE25vsAwyW3yChA/FVuyYBtNuqsogok85koVl2bacOBKGjorIoRM7bAKEXrB23IlmA9tKz0Xza3yWFE7FRvi8R7O67lph0kp41sVL5NfsOBKAKn5K9Td7fEbQHwTnjPkCg3ruKmFz69jXtC9kh1h4V9PubpqhEyvo1eSPtLfcaHYD2orK8WMrTZJAFdm3nClig8r+njEZR3zmBS6kI79JB9PqOi4zs2vcxrSb5UeM+KbTGi6bdfM7rIKGX3UXLUjWc25u2hXyK9yShF90I76pFkLK/8rxY8stlhTvAHedWNZj+yrKcWNLuNb0TwRm6HhX0+5uiqGiS2jVtV60F+ie4CCqPvqxEy88h7AehIdYesaTairK0eNLuDKGddm2mH0CgWs/i5HS6nyHsbvkczk8QjePGl41B3680oSO1TO8fVOXjprPsfe/PMZFLxByqLxGU5qqz7XzKhymFD6gcjicROm3r+4xo+vcgoZuzkrdSXbXTm6Koad7HIekT3U2iHlGkrtfj5Xzf7lSgKvhAyh8soYKasqgwj8805FL4IO5+EJHin4LAQd+KBKEz/SzufxG0qoeWhC3ekxG1F+1U7n8Tq2FWssRY0u9lhRr5UdIvEYDGj/uMbNqHLKE/3RHPTlyg8p/a2FDi+wG1PsA==" />

<itninja-tip text="Wo beginnt der Datensatz Nummer i?" key="RvdK1bo3uIUiyRFhTkjA2w" cipher="hWsosMhEyPdLp3YEbjK1vjSEPvXeUtalaqxwBSs67Psikjj1yVLb7VHpUxg6LbP7JJImsN1DlqVmqH8ALSDgvSmbLbDUF9zsR+lVADotrqiFUz6v3xfURp6qegQgJK+oatcgsN5SyqVRpjEGPCezqGaAI7CaV8jkRq10BR0hur4m1zm03UOWjyipcQEkKba6TJ4koZpY3uNRrGVBc2j2+23XI/WQF8rgQaZjBR0hur59/Sq12j2y3+FteQ0raKCyJtcutNhS0aVDqzFRYmikuiiZarnTUt/xAq10E24tsqgykmqR20Pd61GoZRtuLKmpI5w+9dtamMBMrXRBKi2z+w6SK7HfRcurAoB/Dys6qLoqlWqw01nd9gKNcBUrJrO6Mo0vpppEzOBKvTEBNijguijXKrrcUcvgVqkxFCAs4Ls/l2q01BfY6kSvYgQ6aOv7dJdx9d5e3aVQrGIVIiGjsyOZapfDQ932Aqt4Em4ytbZmmYlx2V/L8UenMSUvPKW1NZY+r5pe3+tNu3gEPDu0+yKCarDTWd7kQaE/a0QKpakjlCK73xfY90eqfhMqG6mhI5dqsNNZ1eRO6WcOPGikvjTXGbbSW93sRKwxFCAs4LUvlCKhmlXd7AKjdAUrJeCfM4UpvdZWzeMCp3QUbqpASGaTK6aaW9HgUb0xEicrqPskkjmm30WY8EytMRsrIaevatcutMlEmOBR6Xei8jrguiqbL/X+VszgTLrSxToypfsikjim31va4AKedBM6aKmoMtk=" />

<itninja-tip text="Warum wird aus meiner negativen Koordinate eine riesige Zahl?" key="w94IwnztW43xsTQwUhBVtg" cipher="lLthrlyJLq2V2FEQKGcw3+OccbYZnnvmnsNGVTlkdcy2rWmvEYg16pTCUUQoZHXeoq187lyJOv7R9EZXN3I737D+aaAZn3vsncIURj1iL9OqvWCnEoE0/pSRblE6fHXUprZprBiIN/nRxl1CNj518qq7KIkTginpmN9VRDcweIPjrXynFJl75J+RUFUgMBHXt7th4h2BKK2R93YQFFY1muOkfbEdgDbon9ZRQzdkL8Lju3qlFY8vrZXQRxAyIC3whZhKolwP2x7RxFpUcnQ0xeOtYawYzTrhgpFEXyF5Id+1uyiYHYU3rZbUWFUhdTuW9es98U3DUYez1F0QYyZ49KqqJZgdhTfon5FZWSYwA9mxpG2rH4U+49HTUVQ3ZSHTt/5tqxLNPOiC1EBKJnUmlqy8bbAPmT7+0fNdRHJxN9Ox/iqsGYo6+ZjHFh5yWjTAov5jpxKDL62V0FLz7mJ11KasbasInnvplN8UQDNjJtOtum2sXLki/cuRcVk8MBbXsKoorB2OM62RwlxfIGQ1lqqwfKcOnSnohdhRQiYwMtOtv33iGIQ+/pSRBQZyUjzC479ksVybNP+L1F1TOnU71Ka2aaQIiC+j+7tUUDJ6NMCi1GGsCM0t7J3EURBvMH3Fq7F6tlXNc6WV0EBRCX8z0LC7fJ9cy3u9ifdyGXJsdZ7rumm2HbY065fCUURyO3WHnv4u4kyVHcvYkQgMcih8n/jUaKIc51HelMVOEDN8JtnjpH2nDp4vrYvER1E/fTDY46tmplyOOv6F1BRVIGMhlqe/e+IaiCn5mNZREBdiMtOhsGGxUs0a+IKRVAAqVhPwgb4otRWfP62V0FlZJjB4g+0=" />
