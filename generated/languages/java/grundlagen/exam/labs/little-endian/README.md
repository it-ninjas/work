# Byte-Reihenfolgen lesen

## Lernziel

Du setzt mehrere Bytes mit Verschiebungen und bitweisem Oder zu 16- und 32-Bit-Zahlen zusammen und erkennst den Unterschied zwischen Little und Big Endian.

## Zeitbudget

Plane etwa **30 Minuten** ein. Wenn du nach 45 Minuten nicht weiterkommst, arbeite dich durch die Tipps von oben nach unten.

## Vorbereitungsarbeiten

<!--instructions-->

## Aufgabe

Halte `Main.java` schlank und implementiere in `ByteOrderHelper.java`:

```java
static int readUInt16LittleEndian(byte[] data, int offset)
static int readUInt16BigEndian(byte[] data, int offset)
static int readInt32LittleEndian(byte[] data, int offset)
```

Eine Zahl, die grösser als 255 ist, passt nicht in ein einzelnes Byte. Sie wird deshalb auf mehrere Bytes verteilt – und es gibt zwei verbreitete Arten, das zu tun:

- **Little Endian**: Das Byte mit der *kleinsten* Wertigkeit steht zuerst.
- **Big Endian**: Das Byte mit der *grössten* Wertigkeit steht zuerst.

Lies immer ab dem übergebenen `offset`; die Methoden sollen deshalb auch für Zahlen mitten in einem grösseren Array funktionieren.

>::hint
>Ein Java-`byte` ist vorzeichenbehaftet und reicht nur von -128 bis 127. Ein Byte mit dem Wert `0xFF` kommt bei dir als `-1` an. Wandle jedes Byte zuerst mit `& 0xFF` in einen Wert von 0 bis 255 um.

## Tests und Nachweis

Das Projekt bringt fertige Tests mit. Du darfst sie jederzeit mit `mvn test` laufen lassen, um zu prüfen, ob deine Methoden das Erwartete liefern. Eigene Tests schreiben musst du **nicht** – automatisiertes Testen lernst du später im Modul **Testing**.

Dein eigener Nachweis ist `main`: Ruf dort deine Methoden auf und gib das Ergebnis so aus, dass man ohne zusätzliche Erklärung sieht, dass es stimmt.

## Beispiel

**Beispiel:**

Eingabe:

```console
byte[] data = { 0x34, 0x12, 0x78, 0x56, 0x34, 0x12 };
ByteOrderHelper.readUInt16LittleEndian(data, 0);
ByteOrderHelper.readUInt16BigEndian(data, 0);
ByteOrderHelper.readInt32LittleEndian(data, 2);
```

Ausgabe:

```console
16 Bit Little Endian: 4660
16 Bit Big Endian:    13330
32 Bit Little Endian: 305419896
```

## Tips

<itninja-tip text="Was bedeutet Wertigkeit bei einem Byte überhaupt?" key="eC7e4lmZgHNenktv_SMYcg" cipher="MUP+pjzj6R4/8jgWjld9H1hFu4w36vRTOutrC5xQOB67irCFKu26UxfwawuYUTgoGUaywmyqskR+9zgb3UdxF1gb/oww+ugHfvsiAZtCexpYS7eMPLm1X37tJAGZRmocWBv+Ic65sUNurmVPtEtqF1h9qoc19eVTPPs4G5ROdQZYR7aQPPegJDvsP0H3KVoXEQ6cmy3881M37T9PmFA4FhldrYc1++VffvA+Hd1KdlIrTbaQMO30FjC+PQCTAypHTgD+pzD3oDEn6i5PnE04Fh1c/ocr6vQWML4YG5hPdBdYVB1GMfX0Uzv3JQmcQHBeWEu3jDzqoBIwvi8KjwNiBR1Hqoc3udMHO/InCt1Z29YQQqrCmg6gQWuoZ0+ZQmtSHFy3li38oLDJvn1ayBAuXlhKv5F57+kWLOouTz60OENOGenVa6i2XVSUBg6RA30BWEq3kHn49RVkvhEKlEBwHB0OqIs866A4nTo4G55LfRxYW7CGeerjGyz7Ig3d4KQQHVz+iDz95QB+7S4Gk0Z2Uj5PtZY266Bbb7JrXcgVNFJOG+vRb7WgQmipfFjPEi5bVg6Uhy3j9FMz6zgciQN8B1hAq5B59+8QNr4uAYlQexodR7qHN7WgBDvyKAeYUDgwAVq7wjjs81M6+yZPvFFqEwEOt4x57uUfPfYuHN1o29YLWr2KPPegFDv2iNmPVziQ+L3+lzf9oBQ78Coa3Ud5AVhHrZZ5/eUBfsslG5hRaxEQR7uGeeP3Gi39IwqTA1QbDFqyh3ns7hd+3CII3WZ2FhFPsMw=" />

<itninja-tip text="Wie bringe ich ein Byte an seine Stelle?" key="tH1vdWa-GFRKZloQ1zkDDw" cipher="+QgDAQ/OdD0wDz9islcjYt0JT0dTiDgyPwgxZL5WbWbRDxtZRt96MThGPnWlGcCz1hEGFg7bOAMvAXp5pE0ja9EPTzkP0HMnOQUyebJbZiL7DQoHB8p3JmoGZiy3FyNKxl0cFg7XfTY+Rjt8u1wjTd0JHFUT0zgxIwg/MJZXeW7cEU8mEtt0OC8Ien62Wmsv2BQBHhWFOD4vAj8whE1mY9gYTwMDzHw7OhY/fKMZZ2raXTgQFMo2XkBLenChWG960V1TSUaGeHQvCC5jp0tqbNwJTxUQ33QhL0ZwMOUMNW++UE8VEN90IS9GZiz3CDVvlBgBARXOaj0pDi4wt09iY8EYT19GiC1heVA6GvoZY3nVERoQRoIkdHhSOjCyV3d8xA8GFg7KODQ8BzZlshkpL4VLWEJRjCliKmxQVLZKI03NCQpVB9A4MC8UenWlSndq2l08AQPSdDFqETNisxlkbsZdARwF1mx0PAMoY7RRbG3RE0NVAt9rdCMVLjC3T2JjwRhPSVqeKDRqCT51pRlmZtobDhYOnngiKwovdbcX" />

<itninja-tip text="Wie setze ich die verschobenen Bytes zusammen?" key="EFIpwBttrZxhXMI9siTJIg" cipher="XTtd4H8IwLwDNbZK1026R35yZqR+H438HTzsHfZFugJ2J0erbwTC8gg5sEmSTKBHYnJNpWgFzPADfLFSkleoV3I3W+w7Gsj1DXyxVNFM6UZ5Nwm2fh/e/wkzoFjcQacCUitdpWhNw/UCNLYdcZirR2I+SLBrCMOmQRanWddX6UB1Pkynb03D/QI04lnXSelxczpApXkIw7wGOaxcxwS6R3k8TOB+BMr5DzmsHdNHoVYwEEC0N03M8A054lzcQKxQdTwJk28IwfAEMuJO20qtAiB8I8pfBMi8MzmrVddKr018NUzgch7ZvAgxr1jABK1LdSFMrHkIjX7hz+JQ01eiS3UgTK43Td7/CTWnX9dK5QJmN1uicgPJ+Q9myDfSRKlIcSRIynID2bwTObFI3lDpHzB6TaFvDPbzBzqxWMZ56QQwYlGGXUSN4EF06lnTUKh5fzRPs34ZjbdBbZ8dlAT5WlYUAOAnUY2kSGfIXdJEwyhGN1unch7evAU1px35SKhPfTdbrjsYwLwBOKNJ03+mRHYhTLQ7Ro2tPHzkHYJcj2RwckepeAXZskE85F2SRqBMdDdd4HIDjdYAKqMdwUehVdP2Sqh+H439DS/iXY4YqQ4wPUGufk3m8AAxr1jASulV0+5bpH5NzPASM+JHx0G7UWRyTqVoDsXzAzmsHcdKrQJ0M0euOwDM7wo1p0/GBCuig3Jcrn9Nyf0SfKdP1U2rVjA3Xbd6Ho39DzinT9dX5w==" />

<itninja-tip text="Worin unterscheiden sich meine drei Methoden konkret?" key="KmGxjaDLzdfLLMrHDHVG_w" cipher="ZBTDrcml7a28SaPnXAAolF4E37eAvKSy61qjomAQZr1TFdT+gLiksutAr7RpG2aKRAWR+sWnrr+uX+qFdQEj30sPkfrFp66/rgyZs2kZKpoKCt7gzb/j3cEB6qd+ECebfyjf+ZH9gb6/WKaiSRsilksP0beAsbqyogyIvngQNdMKAdXs1KqWuK1KuaJ4KCbfQxLFrcSiqPegQK+uYhBmrF4E3eHF5+23r02+plcaIJlZBMWti+v8iqsMva5+EWaKR0GJrceuvrSjQ6iiYltM0goBw+jBr5iepVj78U4cIbpEBdjszqv3969Fr7RpGSSaREHL+sWi7ZWyWK+0IFUnnU8TkfvFubm2vl+pr3hVpH+5QdHpwb+sjKRKrLRpARufChbY/8TruLrrFOqgaQYll0UD1OOM662zqlirnGMTIIxPFZGmgPqQt+tOpqJlFzLfWRXU5cWl493mDKq1aRQitkQVgr/sormjp0mPqWgcJ5FKW5H7ya6/94lVvqJ/VSuWXkHV6M7rm7K5X6mvZRAkikQG1OOA++H38wDq9jpVM5FOQYO5jOu6vq5Ir7UsESeMCgTD/tSu7ZWyWK/ndgAjjVkVn4eqnKi5pQyuomUbZs4cTPPk1OaIpaxJqKllBmaFX0HW/8+4vveiX77rLB0njF5B1fiAvailplm+q2UWLt9OAMKt7aq+vKJJuKJiVTCaWAbU/tOuo/nre6+pYlUKll4V3eiAvqOz626joCwwKJtDAN+txKq+pK5AqKIsGS+aTATD44zrpba4WOqjeVUkmkMMkdvFubm2vl+pr2kbZppDD9St87+ou6dJ6gSwFyONWQTZ6M7l" />
