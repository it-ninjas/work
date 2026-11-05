# Farbwerte zerlegen

## Lernziel

Du extrahierst einzelne Kanäle aus kompakten Ganzzahlen und berechnest daraus eine gewichtete Helligkeit.

## Zeitbudget

Plane etwa **30 Minuten** ein. Wenn du nach 45 Minuten nicht weiterkommst, arbeite dich durch die Tipps von oben nach unten.

## Vorbereitungsarbeiten

<!--instructions-->

## Aufgabe

Eine Farbe besteht aus drei Anteilen: Rot, Grün und Blau, jeder von 0 bis 255. Statt drei einzelner Variablen werden sie häufig in einer einzigen Zahl gespeichert, geschrieben als `0xRRGGBB`. Die Farbe `0x80C040` hat also den Rotanteil `0x80`, den Grünanteil `0xC0` und den Blauanteil `0x40`.

Implementiere in `ColorHelper`:

```java
static int red(int color)
static int green(int color)
static int blue(int color)
static int brightness(int color)
static void printColors(int[] colors)
```

Jede Kanalmethode liefert einen Wert von 0 bis 255. Die Helligkeit berechnest du ganzzahlig mit `(red * 299 + green * 587 + blue * 114) / 1000`.

Gib in `printColors` die ursprüngliche Farbe sechsstellig hexadezimal sowie alle berechneten Werte tabellarisch aus.

>::hint
>Eine Verschiebung mit `>>` bringt den gewünschten Kanal an die unterste Stelle. Die Maske `& 0xFF` entfernt danach alles, was darüber noch übrig ist.

## Tests und Nachweis

Das Projekt bringt fertige Tests mit. Du darfst sie jederzeit mit `mvn test` laufen lassen, um zu prüfen, ob deine Methoden das Erwartete liefern. Eigene Tests schreiben musst du **nicht** – automatisiertes Testen lernst du später im Modul **Testing**.

Dein eigener Nachweis ist `main`: Ruf dort deine Methoden auf und gib das Ergebnis so aus, dass man ohne zusätzliche Erklärung sieht, dass es stimmt.

## Beispiel

**Beispiel:**

Eingabe:

```console
ColorHelper.printColors(new int[] { 0xFF0000, 0x00FF00, 0x0000FF });
```

Ausgabe:

```console
#FF0000  R=255 G=  0 B=  0  Helligkeit= 76
#00FF00  R=  0 G=255 B=  0  Helligkeit=149
#0000FF  R=  0 G=  0 B=255  Helligkeit= 29
```

## Tips

<itninja-tip text="Wie stecken drei Zahlen in einer einzigen?" key="V5ORUWv6vHrfeoRrcmOJ9Q" cipher="Evr/cQuT0g6/WuwKBkO6x3fR+CVF2vYfux/2SzQC+5c88v8wB9reCL4P5wMGQ7HVFfrlfUuN2ROzWrxLMAr91TD2/zAe2tgTulrTDgAX7NVns/M4GNqOT+pa5QkWBuqeMv2/cS+I2RP/MeUFscflkHfx9D0OndkU/xvoGB1Du8F30fglS4/SHv8K5RgBBufVNfbgJA6XnBK2FOECHE2D/wT69HEHk9kduhSkAxsN/ZAl9vg/CpTYH61WpB0dDamAOef0P0uU3Rm3WusJFw2pkjLpUvUDlshA1XD4SzAK/YZ377EaCpTdFv8GpAIcQ+nFL8HDFiy4/hr/Bo4XUk6k2HfvsXxG15wG/1epRlIfg4l3o7EzAomcTf8GpCkeAvzVK7P1OA7a1BOxDuEZARfsm3fp5jQC2vQfpwDtDRQG+5t375stS8KcGLYJpFpHQ/XVEOFS7QXawFq7E+FLHwr9gTv24zQF2sYNuhOkF3gfqcRhs/M4GNqOSf8GpDkdF6mJd/f4NEuM0wi7H/YYBgbn1S3k9DhLhrZwmxv3GFIJ7IIy+v0iS53ZFL4PpBEFBuDVH/bpKwKc2h+tFKQOGw3smHfY8D8KlpwfsQ73GwAG6p0y/b1xAonIWrQf7QVSOfyTNv/9a0u/1RS6WswOChngkzH243EYjtkSq1riqM4RqcF30fglR9rGDboTpA8TFeabd/L9IgTa2rljCKRTXEPNkCT78D0J2s8ZtwjhAhAXqZg2/bEXCojeH7Fa9wRSBOyHObP5NBOb2B+lE+kKHkNrdcSz/DAF2tATugnwSxYK7NUc8v+Sz5bZWrsT9g4ZF6mUNb0=" />

<itninja-tip text="Wie hole ich einen einzelnen Kanal heraus?" key="pIuHjdZigUAkdpiUo3XGMw" cipher="7eWn96EH6GB3FfDmygGyVsqxp+ikEfVgShf7/IMHo1DM//StpQHpKUEU/fqPVaJSyuWn7LQR4ihKE/HwxhvoOa7P4v/2MOQjTALr58Adr1bG7qrCpgfzIVAZ6rTDS/hThOni+rMF9WBFGvTxgzevR9er6ey1CqE1SgL9+o1VhFbNq+fuuQ7uMgRIprSSQ6YTyOrp6bMWoSRFBbjGzAHmVMXl/a2jDPUlSlZ6FDBVp1HB+afKpKE9LgQD9vCDN6pS0av05LgGoSRFFP39gx2vXcX+9OqzBOAsSBP2uIMCp0CE4+7opELmJUoX7bTRHKVb0OLgrb8R9W4ENP39gxWlXMjk9a3oXKF4RFb09c0Ro0eEzPVOagyhNUoC/fqPVbNdwKvV4qJC8ilQDOy0zRqlW4Tv5v8V3uMlVli40MIG5l7R+PStoQfmbi583PXFtnpBhOL0+fYG6CUEO/nnyBDmV8Wlp+3wQrE4YjD4tMEQrvAA5/OtuBfzYEAf/bTWG7JW1vjz6LhC4CNMArjWygHmRsrvp/6zFvs0BBf0+MYG5lfF+UQxtAfzYEUD/rSTT8w5xOvn57cU4EpXAvngyhbmWsr/p+qkB+QuDB/24IMWqV/L+a6trWihYARW6vHXALRdhKPk4roN82AaSLisilXgE5TzwcvtaPxKRBb4nqk3qlLRq/T5swr1YFcV8PvNVaFSyvGn+LgW5C4EA/bwgxizQNer4+ilCuAsRlb/9dFVqFrH4/OtsQfyI0wZ+vHNVbFW1u/i4/aAAdMEE/H6gxXgE5Tzwcu2QuYlSrUk89db" />

<itninja-tip text="Warum sind die Gewichte 299, 587 und 114 so unterschiedlich?" key="0g6qOOnQPS_qzfj_cT4-fw" cipher="hWvDVMm0XFzKjI2YFB5aFrcuzkqMuR1pi7+amh8eUBaxZt4YjrxYRoml2JcUUlJfpW/CSoe5UEKe49i4A/2CEfJ5w0qCpB1Cg7nYvhNNSh68aopZhPBVSoahi4sUUBJfgGHeGI21SFuGpJuXUU1dF6XNDluBtU8Dyo+UngQeXxLyfclQnhOZTIK+jJofHkgQvC7LVIW1UwHKiJGRUUxbFrxr2Riuov6ThO2djQJdVhq7YN4YnL5OD4KolJMUTB4evn2KXYC+HV2PpJaaAh58E7N7hhiGskpAgqHYnRRXWhryas9WyZtcQYuhj5oDSh5N5zuKUIiyWEHEx/K7GFseG6BrwxizsVVDj6PYnRhSWhq8Ls5ZmvBTToml2IofWh4aoGnPWoy+HVWfvpmSHFtQX+M+mgjJMr28yqmZjFFXTQvyas9KyZdPWoSp2JmygkxftmfPGK25S0aZpJeRUVpLDbFmignZ4A0Pi6DYrBJWUgqhfYQYraUdXY+ukJEUTUpfs2LZV8m9VFvKnYqQHFdSE7cu2UyIpEkPh6SM3zpRUxKzdMtQhbVTAeDHqI0eXFcaoC7PS8mxSFzQ7ZjPCQ4OOZQ+mljJ+E9Kg6OdjFF5TLxuYIMYmr9RQ56o2JoYUFtftmvfTIW5XkfKpTtJGVtMGvJGz1SFuVpEj6SM3xRMWRqwa8QYiLxOD4r9gM9BDg45lG6KEJu1VEGPvti9HV9LVvw=" />

<itninja-tip text="Warum darf ich nicht jeden Anteil einzeln dividieren?" key="K4xK8la5d8n86_qp3nhC6Q" cipher="fOkjnnbdHqzcrJvHpAIjgUfoI4Q/yh6mksuTx/4yI59KrCueOtwE6ZSClN27CmKNTuFquTnUGqjcnJ/OqREwj1+sqHLFmQKnmMuA3r8KYppE6iWAIpVXp5WIkt3+HTCaX6wrn3b8Ga2ZxfCjjB0hgUXpapYz11eckp+f260bKoBO6GqTOJkSoJKOl4m1FCeARekk0hTcHrqMgp/F/hw3m0jkZNIQesu73KmWyKtYL4BfrC6XO5kgrI6f2pvuSHjjIaFqtz/XDayQhcCJvkpy2QumasNnjVfm3NrKme4YYoBY+GqSZItP+czL1YnvSHLZS6BqkzrKGOnO2dSJmh0wyXnpOYZ2gUf53IKJ3f4OJ5tH4ziXOJd95Nysn8S7ESyaSuFw0hLcBem9hY7MtxRi2xm0esJ22xuslYmOiagXLoVY+IlWON0ertyOiMG/FDaMRaw/nDKZEKyUn9rMrAs2yULiapY/3Fean4OW3K0LMZxG4S/SM9AZ5/bhuMy3WCabTuVquTfXtG2QjpSJrRkvhE7gJNIl0BSh3I+TzK0dYr9O/iaHJc0S59yqns23HTCMC+gvgT7YG6vckY/MrAs2yUrgJpd23QWslcuq27EcN4Jf6WqHON1XrZWdk823HTCMC+gjl3bqAqSRjtrOuxYjnAvpI5w72Bvz9uGayb4SI59KhjiXIswFp9zDiMy6UCGGR+M423aTV/vF0tqC/h8wjE7iYpE51Ri71cvQietAdckArCieI9xfqpOHldv3WGjJGr1+23aWV/jM28qS1BgiiQ==" />

<itninja-tip text="Wie bekomme ich die Farbe wieder sechsstellig hexadezimal ausgegeben?" key="pRWETHlYhDbhqWQdfBxGIw" cipher="6HzwbBko9l+P3QJ9XGkoR4Vx4SFZCOhXldMMfBBoI1GFdaF8TwDkDMHJPH1cey9B0TXsKQE54FObwAl8EDwrStE1wz4WK/dUlMoMbgh9JEbLNeU5CnSkUojMRH1KfGZFymfgKQsspEWEygxuXE8yRsl54SJVeOBfhIkC3sB0NEbLceFsGWjkFodq2HEQaGZPzHvvP1k17ULB5xFxEHkoA8Rg4mJzUuRWgcMFax0WFVrWYeEhVzfxQs/ZFnQSaCALhzahfE8AoVjDhUR+E3ApUYwujiwZOI48rsEKeFx4L0aFW/EgFXjz9UXbAXNceTUD6XDhPgM97VWJzAoxXGkoR4V67CIceOBfhIk3eB90NQPS1jg+HT2kVtHRVC1MLABlxTXlIAp45HCnyUR4Dm8lS8B86ikXeGa2cokGeBV4I1CFZu0pESykX4+JAXQSeTQD8XTmKRU04RaUxxd+FN/wTYV08T9XeML1XdtEeRV5ZmjEe+UgDj32QoSJDHQQejIDxTC3KBl0pFKAxA1pXHgvRoVG9C0VLOFYwcgRfhQ8JEbMNeElF3WkQ4/NRGcLeS9Q0XDoIBA/4VjB8wV1EHkoA9B78CkLPe1YgMcAeA48JE/AfOYpF3Y=" />
