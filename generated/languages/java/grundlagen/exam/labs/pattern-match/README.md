# Messprofile vergleichen

## Lernziel

Du vergleichst ein gemessenes Zahlenprofil mit mehreren Referenzen und merkst dir während einer Minimum-Suche den besten Index.

## Zeitbudget

Plane etwa **30 Minuten** ein. Wenn du nach 45 Minuten nicht weiterkommst, arbeite dich durch die Tipps von oben nach unten.

## Vorbereitungsarbeiten

<!--instructions-->

## Aufgabe

Ein Messgerät liefert fünf Werte. Vergleiche dieses Profil mit fünf gleich langen Referenzprofilen und finde heraus, welchem es am ähnlichsten ist.

Als Mass für die Ähnlichkeit verwendest du den **Abstand**: die Summe der absoluten Differenzen an allen Positionen. Je kleiner der Abstand, desto ähnlicher die Profile. Die Referenz mit dem kleinsten Abstand gewinnt.

Lege die Referenzen in einem `int[][]` und ihre Namen in einem parallelen `String[]` ab. Gib zuerst den Abstand jeder einzelnen Referenz aus und danach den Namen der besten Übereinstimmung. Plane passende statische Methoden in `ProfileHelper`; `Main` bleibt für Beispieldaten und Aufrufe zuständig.

>::hint
>Die Namen und die Referenzen gehören über denselben Index zusammen: `names[2]` beschreibt `references[2]`. Sortiere oder vertausche deshalb niemals nur eines der beiden Arrays.

## Tests und Nachweis

Das Projekt bringt fertige Tests mit. Du darfst sie jederzeit mit `mvn test` laufen lassen, um zu prüfen, ob deine Methoden das Erwartete liefern. Eigene Tests schreiben musst du **nicht** – automatisiertes Testen lernst du später im Modul **Testing**.

Dein eigener Nachweis ist `main`: Ruf dort deine Methoden auf und gib das Ergebnis so aus, dass man ohne zusätzliche Erklärung sieht, dass es stimmt.

## Beispiel

**Beispiel:**

Eingabe:

```console
int[] measured = {12, 18, 31, 39, 48};
int[][] references = {
  {5, 10, 15, 20, 25},
  {10, 20, 30, 40, 50},
  {50, 40, 30, 20, 10},
  {12, 12, 12, 12, 12},
  {0, 25, 50, 25, 0}
};
String[] names = {
  "Langsam", "Steigend", "Fallend", "Konstant", "Spitze"
};
ProfileHelper.printBestMatch(measured, references, names);
```

Ausgabe:

```console
Langsam    Abstand: 73
Steigend  Abstand: 8
Fallend   Abstand: 118
Konstant  Abstand: 88
Spitze    Abstand: 100
Beste Ãœbereinstimmung: Steigend
```

## Tips

<itninja-tip text="Was genau ist der Abstand zweier Profile?" key="VAUqYmlYgO3BQzpWbDubMQ" cipher="B3FPDgV45ISzY1gzBV/+EQ5kQg4MNvKIqCtfOExO9UUxd08LBznuiaQxGiADSbURFWsKCAw85Z/hE1UlBU/yXjolWQEBOfWetWNeI0Ab7FgxJV0HACygiagmGjQJUv9UOiV9Bxss5c2gNkkzBVX6XzBgWA4APeeIr2PY1v8b9Fk6YAo0Bir6iKggUjMCF7tVMWtEQgY6oImoJhobCUjoRDpiChgceOiCoisaOQhe6REucAoWAD3mza0qXzEYF7tYJ3EKBKrk8s2lKl92r7/zXzhsSQoCPemZ4SZdNwAVu3U9YFkHSR3pg7smVjcOSO/y8GtOB0k55ImoJkglGBv/RHoPIB5JCO+eqDdTOQIb5xFkJVZCWHj8zfNjRnZfG+cRYCVWQjot7YCkY0ZcEBu2HHklVkJEda3NvWMXe0Eb5xF5KAdCFXitwOxjRnZBFrYRKCUHT0R4/Oe9Y10zAV7oQjFrCh5JabLNvWMLbkxHuwJlJVZCWmGgkeF3AnYQG+c7KCV4Bw898oivORoqTAqrESglGFJJJKDe8WNGdlgLu010MBpCFXj8571jezQfT/pfMCVWQlt4/M3zY0Z2XRvnEWUlVkJbePzN62kCfEYb5zteTERCKjfkiOEwUzgIG/9QJyVOEAwxoLekKlYzAgG7VD1rT0I6Le2ApC1MNx5S+lM4YAZCDDHuiOEQWT4AXvJXMSXp3gs98s2jJlMyCRvaQyZkUxFJP+yIqCBSLAlS71gzKQoXBzygiaAxUzhMW+hEOSUBX0kV4ZmpbVs0HxP2VDV2XxAMPNuEnGMXdh5e/VQmYEQBDAPpsOh4Wng=" />

<itninja-tip text="Wie finde ich das Minimum und weiss hinterher noch, zu wem es gehört?" key="O2Zuz8RkeVe8_rzZn5Dv7Q" cipher="fwcd760XDXfYm875+vmIiFUSAqanDBx395vOt7/0hohIAxzvB/gbItKZkvna+YGIGwELuAfSETnQl9+x+rCihFUPA7qpSSoi35bZ+fL1nYZPRh2mpwxZOcmMnL36/s+GVwMHobcQHDmc1JaO+uKbxxFGjE9XRB0inJzOuOrzh55PRg+toRZZM9mQnPO12YGJXh5E5ehEHTLSkJy36uLPLocEC73kDRE5nJXTtPLjm81fE06uqkQdMtLe8rjy9YHDMWwoDHgMCzKcmtmq9/GDjxscGaqtRC82zpfdu/P1gc1WDxrvsQodd92VyKz+/IaeUgMcquQNFDrZjJy7+vmLiBsBC6KhDRck3ZOG05Xwj41RBxiuzg0XI5yT1bf2/ZqAG1tOhqoQHDDZjJKU3siwu3oqO4r/bhA5yN7evOzkz9AbS1/0zm4fOM7elLDx5M+EG1tO//9EEHeA3s68+fWdiFUFC7zqCBw524rU4r/5xMYSRhXF5ERZd9WQyPn85Z2fXgga7/lEHT7Pit23/PXHgF4HHbq2AR17nIzZv/riioNYAx2UrTlQbLbenPm/+YnNEwUbvbYBFyOcwpy09v6GgE4LR++/bll3nN6c+b+wgoRVDwO6qUREd9+Lzqv6/pvWMUZO7+REWXecnNmq67DSzVJdZO/kRFkqtoO2uf/w5ed5AweroRdZPtHez7zz8oqDGwYHqaREAyKcjdmt5fWBzVIVGu+zDRo/yJfb97/HioNVRgq65AQbMs+K3Pnp9Z2eXg4LobAIEDTU3t2s7OOKn1MHAq3kBRIjyZ/QsOz5ip9IEkLvvgEQMMje2aq/8YLNfggKquQFDDGcmtW8v+qagV4SFLvkAxwnzj0Av+v1z79eAAu9oQoDd8+K3a3rsI6YXUYKpqFEGzLPitn3" />

<itninja-tip text="Mit welchem Startwert beginne ich die Suche?" key="uNTldFT3xUmX3fM_tUaBSg" cipher="2J2LADGQoDu5kLJn6hDABu2RhVQ9hLFp87SWH9I0QvzLp5ERdK2kIfvx01vcI6Ej1vSAHTqSq2n3tJ1L1WbxK8unkVp0vaAt8q/TWtYu9S+YlYcHIJarLbe0gEuVLe0v0bqABnjXpCXkstNYxyPoLMz0gR0x14cs87SdWMAo5mrYt5AGJpKrPbfh01LcKOgnzbmFVDOWtyj5qZpaxzKhOdu8ihp0laAg+v2WTcYy5CSYkJAGN5+pKOK73TW/C+g+mOTFDiHXtj32r4da22bnP9a/kR07maws5anTW9Qh5C3dusUaPZStPa39uFrcKKEL2qeRFTqT5SDkqdNU2SPoJN2mxRU4hOV5u/2XVtBmwy/cvYsTIZmiaeAeV03QZu8j3fSSFTyF5Tz5udNf1yPyPtj0hxg9kqcst7yGWZVrsGrLoIAcMZnrQ52YmlHQZsAmzLGXGjWDrD/y8dNb3COhLs30hAE3n+Um8anTTNwj6TnM7sU6PZqoafO4nR/QNPI+3brFMT2ZsTv2utNe2TWhPNemibfwgqMg8LidH+Yv5C3dpsVcNJqsJ/6whlKVe6Eu0aeRFTqUoGH6uJJMwDTkLpT0lxEykrcs+b6WTO523GPY+MUUNpK2Pbfg0w/Vb6E/1rDFByCWtz3y/ZdW0GbSKdC4gB0ykuUr8rTTDptmwy/RsIAHdJ62PbevmlzdMugtmDZl53SEsCr//ZdWx2bkI9axllQ1grZp4rOXH9cq5CPa9IEVNpKsZw==" />

<itninja-tip text="Was passiert bei zwei gleich guten Referenzen?" key="LZ2RF3h5dQHqP3hM6K0iJg" cipher="YPTlNxgaAHOYWhY4yJECS0Tz+HoNFBUhjVoPJYbDVgZJ9PQ3UlMPdI9NCzjIykdWX14tcQwcXyvGHxwphsMCQ0Tz9DcLCbalnloKKcj/R0BI7/R5AlkYaJ4fHTSJxlYGSfj8ZB0VF2SEHzkum9lDSEm99GUeuslthktYKIHIAmRI+fh5HwwbZspRES+A2QJLSPXjOVg0HHXKX0RxiI1V5ZHv9XJYCgFgnkscKZveR0gN+fhyWBUQdZBLHWyPyFVPQ/P0eVZzf0OPVhwpyPtDVET8/2MdF1Vtg1oeKZrDAkNE87Fwu8UZdYNYHT/I6FBBSP//fgtVVWCIWgpsm8RHBkH09HEdCxshhFYbJJyNRkde7vR7GhxbIa9RDD+LxUdPSfixcxEaHSGIWg85m95WBljz9TcLGh1zj1YabI3eAk9DvfR+FhwbIYFKCjaNwwJtQvD8chYNFHPK3fjfyMlDSEO9+GQMWRtgiVcOI4TBWE9I9fN2ClVVdotNDSHIz0dPDfj4eR0UVUaGWhEvgN5WR0P5sXAdFxR0ylsRKZvIAnRI+/RlHRcPIYJaCi2d3klJQPDlOXJzPGzKegAthchMBk/49nIfFxB1ylsRPsjJS0Ne+P11HVkzc4tYHWyfxEdCSO+9Nw8cG2/KRQ8pgY14Q0T++XIWWRJtj1YbJMjKV1IN5+Q3HRAbZIcfOiWEyUBKQv76NwgYBnKPUVY=" />
