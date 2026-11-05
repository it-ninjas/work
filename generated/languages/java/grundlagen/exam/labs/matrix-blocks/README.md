# Eine Matrix in Blöcke zerlegen

## Lernziel

Du navigierst sicher in einer zweidimensionalen Matrix, fasst konfigurierbar grosse rechteckige Bereiche zusammen und kehrst die Reihenfolge der Zeilen um.

## Zeitbudget

Plane etwa **40 Minuten** ein. Diese Übung ist besonders wichtig für das Examen; wenn du nach 55 Minuten nicht weiterkommst, arbeite dich durch die Tipps von oben nach unten.

## Vorbereitungsarbeiten

<!--instructions-->

## Aufgabe

Erzeuge eine Matrix mit 8 Zeilen und 12 Spalten. Der Wert einer Zelle soll `row * 10 + column` sein – so siehst du jeder Zahl an, wo sie herkommt.

Zerlege die Matrix danach in rechteckige Blöcke. Breite und Höhe der Blöcke sollen beim Methodenaufruf als Parameter übergeben werden, damit die Berechnung nicht auf eine feste Blockgrösse festgelegt ist. Berechne für jeden Block den ganzzahligen Mittelwert seiner Zellen und gib die Ergebnisse als kleinere Matrix aus.

Verwende im Beispiel eine Blockbreite von 3 Spalten und eine Blockhöhe von 2 Zeilen. Du kannst davon ausgehen, dass die gewählte Blockgrösse ohne Rest in die Matrix passt.

Plane die Methoden selbst. `Main.java` soll lediglich Beispieldaten anfordern und die Ausgaben starten; Schleifen und Berechnungen gehören in `MatrixHelper`.

**Zusatz:** Gib die ursprüngliche Matrix ein zweites Mal aus, diesmal von der untersten Zeile bis zur obersten. Innerhalb einer Zeile bleibt die Reihenfolge unverändert.

>::hint
>Zeilen und Spalten haben unterschiedliche Grenzen. Die Anzahl Zeilen ist `matrix.length`, die Anzahl Spalten einer Zeile ist `matrix[row].length`. Wer beide verwechselt, merkt es bei einer quadratischen Matrix nie – bei 8×12 sofort.

## Tests und Nachweis

Das Projekt bringt fertige Tests mit. Du darfst sie jederzeit mit `mvn test` laufen lassen, um zu prüfen, ob deine Methoden das Erwartete liefern. Eigene Tests schreiben musst du **nicht** – automatisiertes Testen lernst du später im Modul **Testing**.

Dein eigener Nachweis ist `main`: Ruf dort deine Methoden auf und gib das Ergebnis so aus, dass man ohne zusätzliche Erklärung sieht, dass es stimmt.

## Beispiel

**Beispiel:**

Eingabe:

```console
int[][] matrix = MatrixHelper.createMatrix();
// Blockbreite: 3 Spalten, BlockhÃ¶he: 2 Zeilen
MatrixHelper.printBlockAverages(matrix, 3, 2);
System.out.println("Von unten nach oben:");
MatrixHelper.printBottomUp(matrix);
```

Ausgabe:

```console
  6  9 12 15
 26 29 32 35
 46 49 52 55
 66 69 72 75
Von unten nach oben:
 70 71 72 73 74 75 76 77 78 79 80 81
 60 61 62 63 64 65 66 67 68 69 70 71
 50 51 52 53 54 55 56 57 58 59 60 61
 40 41 42 43 44 45 46 47 48 49 50 51
 30 31 32 33 34 35 36 37 38 39 40 41
 20 21 22 23 24 25 26 27 28 29 30 31
 10 11 12 13 14 15 16 17 18 19 20 21
  0  1  2  3  4  5  6  7  8  9 10 11
```

## Tips

<itninja-tip text="Ich verliere den Überblick. Wie viele Schleifen brauche ich eigentlich?" key="y1PAr1as78AghdxBf9Id_A" cipher="nTql3XZOb1MA5L4kDfJzlag7tI83wIOlAOSpJ1+3dJKmMqyBdvidpU7r/CUWtz2erjqkyjiMqqJF67kvX6F8iak2so8gw4GlSeu9Lxu3b9DrN6HBOIyNrEXsvjVft27cCO+iyiTfjKhB8L4gDegX9vp94IV8+4qsQ+25M1+QcZOoOP+FfIy1t0Xs/BIcunGZojWlwXbAjrVG4LJhvG5/mblzpMYzjLy0QfeoMRChdIiiPK7KOIyLpVKlni28ZH6Xrmngyj/CiuDjOb4kDfJ5la5zk9s33pu6ReywJBH+PZmiPaWPlRCNpVKluCga8k6IqiG03CbNg7RF6/JLTfw91uEEpcM1xIrgeuCwLRrydJHrEazANcfQ6gqlhjYauz2Lrjq0yiTJz5ND7bAkFrR4kus/odowyYHg4zm+JA3yeZWuc5rKOsCKrgDiuS8epz2Zoj2l3Hbug69D7q9vddhckes2qcEwzYyoU/G5L1+ldI6vc6XceoyYpU7r/CUK8lierj2lj2SMhq4A4LUvGvJ4law2rsp24Yq0SOq4JF+zaI+nMqfKJN+b7ADgqDYe8n2epzyjxBfairJB4rlpErNpjqIr7I8l2I6yVNezNlPyboiqIbTsOcCarU6p/Ckau3qUv3/g2D/Im6gJ5fJhO7Nzkus2rts+b0usVKW4JBa8eNyJP6/MPd+MqEzgtSca8nOJuXO62DPFz5ND7bAkFrR4kusmrst2yYauRev8DBqmdZOvNq7OI8qdtUalPsHs8miSr3Ok2nbHjq5O9qhhG7dz3IY6tNszwJilUvH8JBa8eI/rNqnBLMmDrkXr/AMTvX6XuHOzyibNnaFUpb00DKJvk6k6pd0zwsPgQuCqLg3yeYnrMqzDM4ytrOMzvyoa8nmJuTCow5UImqZT8fI=" />

<itninja-tip text="Wie komme ich von einem Block zum nächsten?" key="mm6BN6KcmAJm-J2IR7lSUg" cipher="1AfiX9a89WsS2P36KM55efpCoUTN8vxnFJa94SmZASLorT1Zxfn2LEa89O1n6iYz6Br7Usvw/SICne6oKXr2MfId9VLMvNpuCZv2+2fVOzf9GqFQx/L5d0ad9OYimRA+9Q3qX2Eq8GdGj/jhM9wgcu8A9VLMsLhmD5292zPYICbpHuBb1vm4Zw+W+KgF1T0x8QzzUsvo/SIRnfT8IstyIP8N6UPRspIIBpj94ibPM1j8AfMXivX2dkaK8v9nhHJioU7zWNW8pCILmen6LsF8Pv8A5kPKp7hwCY+9o3qZMD71Dep/x/X/ahLRvfNNmXJyugjuRYK08WwS2P7nK8w/PLpToQeZvPttCo3w5meFcj/7GvNe2sfqbRGls+Qi1zUm8lWhVM3w7W8I2La1Z9s+PfkF1l7G6PArRoOXqGeZcnK6TqFBx+75cASd9Pwi+z49+QWpRc3rtCIFl/H9Ktd7abpOoRiNvNpuCZv2qCrQJnL2B+9cx+64bQSd7+01mRcx8QuhH9Dz7y5Gm/LkMtQ8e5BOoReC4ZJ/bJj96E2zFjv/TtdW0PX5YAqd86gnyz0l+k70Wca8+GEJlOjlKdlyKP8H5lLMvPxjC5HpqC7UPzfoTuBCxLz8awPY8eEp0jdy9QzkRce83WENnb3tLtc3Ibos7VjB9+ssRrr44WeBcgj/B+1SzLztbALY+OEp3CBy2ALuVMn0W7QOnb3+KNdyYLoA6FrP6LhiFJfq6GfYPiH1TuVex7zPZxSM+Kh3lXJgtk61F9fy/CJQ2PzmZ1vSwboK4ESC7/FsAtjr4SLLchD2AeJc2PnxbgOWsw==" />

<itninja-tip text="Wie besuche ich die Zellen innerhalb eines Blocks?" key="ITtxqB7_iaEYHuyVYiM8zg" cipher="ZV4DiFyT5sJzPo7wBUpSoFUbE8133+nSbH+e4TBMS64BTh/MPp/61XlsmNYNT0mjT1tR3XCbqchrasz1CkZVqUlPEYhEmuDNfXDM/Q1AVO5UVRWIfojgxWx2jLUxU12iVV4fiHyN7MhsMMzGB0pSqwFhFMRymueBdH+Z8wdNHK9NSB6IaJDngXx7nrUxV128VUse23eL4M52Po78EQNvukBJBdhxjODVcXGCtRJPSb0BfANrqIz6xCIU5vUCQ1avV1p7znGNqYlxcJi1EExL7hwbAtx/jf3zd2nXtRBMS+4dGwLcf43983dpzL5CS1mnRlMFkz6N5tYzNcW1GSkc7gEbF8ds36HIdmrM9g1PSaNPG0yIbYvo02xdg/kXTlL1AVgexGuS54EkPp/hA1FIjU5XBMVw36KBb3eI4QoYHK1OVwTFcNSiiDhl5rVCAxzuARtR22uSqYolPoH0FlFVtnpJHt9DpOrOdGuB+z8YNu4BG1HVFIKDwXh+5p8jQFS6RBsQ3Xjf7cBrPoypAgNPukBPBYh+w7TBNj6p/AwDfqJOWBqEPpvs0zh8ifxCeVmnTV5Rmj6d7MZxcILhQlZSqgEJUfJ7luXEdj6E+gFLHKdST12Ia5LvwGttmLUGSlnue14YxHuRqZM4a4LxQhAcLKGoUcZ3nOHVOCzAtVEDSaBFG0WGPqjsz3Y+iPALTRyLU1wUynCW+oFia8zyEExPvQFMGNp1i6nOfHuetQZWHKtIVRSIfr7703lnpfsGRkSBVE8+zlyQ/M98bantAUZMukhUH8g+nezKd3OB5hYPHKdST1HFe5b61X1wn7UFRlKvVBsVyW3f7ch9PrnnEUJfpkQV" />

<itninja-tip text="Wie berechne ich den Mittelwert eines Blocks?" key="yR5Ecd-Azi_fjd4F64UkEw" cipher="k93gGbPl7k265LMlr/BWcKFyJQS55aAPu+isJanpS3CiZCEds+WgD77hsmDL0kFhvXtkGLGgq0ax6KwluPBJfqxwMhCt6a9Ns+iwJZHwV3KkcyEf//WgS//5u2yH4ARypD4BH7vl7kuq/71ty+FNdulfKgu+6KIPheiyaY7rCjONdyFRnu60Trfh/mie9ldn6XoxUbHprUerrbNsn//nt6FyIR/zoKpa/+a7a4X2UDO6dyFL/+CmSrbqtnHLrwRkoHowGb+uxCW/7b5vivNFGaBwMFG+9qtdvuq7JdalV2akPmtR9+irRrjlqiXBpVN6rWosWOSKrk+/h9RHjuwEdqBwIRz/sw247aCcaYTmTzO6dyoV/+SvXP/+u2aD9gRJrHIoFLGu7mu26P5Ciuteaah2KBW29qdctuKwJZjmTH2sdyAUq6CqSrGtjGCY8QRyqzJkBLHk7ku+/v5smPEEe6B7NlG+9b1LrU5iZoDpTXChPiMUqO+iQ6utPIV4pU1+6Vs8ELLloA+y7L1tmPEEd7w+KRiroKpKsa2cbIfhRn8KqCcauu7uSLrjv3DL4UVgunsoE7quxCWJ6KxigvZXM6d3JxmrrO5PrPizZcvj56+7Pi4Uu+WgD53hsWaApVN6rHohA//hu0n/vf5/nqVXdr1kIR/xoJlKseP+YY7sSnbpUy0Fq+WiWLr/qmDL80t96XItH7Tz7kG+7rYlmeBHe71tZBiy7atd/+qsxl32V3a7PjMUreSrQfOttmSY8QR3vD4gGLqgnVqy4LslneBWfrxqKBi86O5Oqv6tYJntRX+rPiAUraCMQ7DutXaI7Uh2oHghUbvlpUO+/7dgmfEK" />

<itninja-tip text="Wie gebe ich die Matrix von unten nach oben aus?" key="P2sskX834VcIawKwP4HZVQ" cipher="exlJ+V9ZlCUoD2vVH0J9IEwYSeMaF7I0YAdn2Vnk+SBSRQzVFlLBPmYFZ8JaoYo2VwdJ+BlSwZS0CWfCH+WwMB84XPATQ4Q5KAlu1VbjrXVKBVr0DfRFOWwOcMQTob0wUQUM+BFZhCVgCm7SH+SwO1oZDMsaXo0yKBht3FOhqjxcAwz7HhePPmsDdsMfQn07Ww5e/1E96zdoC2jRSeDTM1AZDLkWWZV3egR1kAKhtDRLGUXpUVuEOW8fapASoehuHxlD5l8J3Hc4UCLCUPb0eBZLV5tfF8F3bwJg6lrotTB+Hl+5ElaVJWETLpBN7q58BEsMsVAYwQ1tAm7VH/awMB8MSeYQX48jKB1t3h/tsDtUGAz/HlSJd3oOYdhL8tMoNQtM8XU9uyBtAiLjS+61JVoZX+UaXo8yMktG1U2hiiFeGVjmGkWVd2EYdpBf7LghTQJUvxNSjzB8AyKdH7C5dUoFSLERXoI/fEti3V71qzxHRUD0EVCVP2hHIsNQ76ohHwxe9BZRkiMoD3eQTO6/Ok0fDPUeWYQ1bQUskGrvvXVbAkmxPVKFPmYMd95YobU0Sh9J5V9X32ooW2KcH++wNlcfDPFBF9E3KImCIx/ssCEfCxKxT1fBMW0DbsQf5bAnHwpBsSxUiTt9GHGQW+i8dWUORf0aF9F5AmFG2VryvHVqBkf0F0WUOW9LYMJe9Lo9TB8M9QoXiDooLnrRUuS3dUgCSfUaRdt3TQJs1R/DlAUSL03lGl7BJHgOa9NX5KshHwJE4xoXoz5kD3jVVu28Ox8FQ+MSVo0yehxn2Uzk+SNQBQzkEUOEOSgFY9NXobY3WgUC" />
