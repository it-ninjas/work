# Buchstabenstatistik

## Lernziel

Du verwendest ein Zähl-Array, ermittelst Summen und suchst gleichzeitig nach dem grössten Eintrag.

## Zeitbudget

Plane etwa **35 Minuten** ein. Wenn du nach 50 Minuten nicht weiterkommst, arbeite dich durch die Tipps von oben nach unten.

## Vorbereitungsarbeiten

<!--instructions-->

## Aufgabe

Analysiere einen Text ohne Beachtung der Gross- und Kleinschreibung. Gezählt werden nur die Buchstaben A bis Z; Leerzeichen, Satzzeichen, Ziffern und alle übrigen Zeichen werden ignoriert. Verwende dafür ein `int[]` mit 26 Einträgen.

Gib für jeden **vorkommenden** Buchstaben eine Tabellenzeile mit Buchstabe, Anzahl und einem `#`-Balken aus. Buchstaben, die im Text nicht auftauchen, lässt du weg.

Ergänze danach eine Zusammenfassung mit der Gesamtzahl gezählter Buchstaben, der Anzahl verschiedener Buchstaben und dem am häufigsten vorkommenden Buchstaben. Plane die benötigten statischen Methoden selbst in `CharacterStatistics`.

>::hint
>Diese Aufgabe beschränkt sich absichtlich auf A bis Z. Umlaute und Akzente musst du nicht auf einen anderen Buchstaben abbilden – sie werden einfach nicht mitgezählt.

## Tests und Nachweis

Das Projekt bringt fertige Tests mit. Du darfst sie jederzeit mit `mvn test` laufen lassen, um zu prüfen, ob deine Methoden das Erwartete liefern. Eigene Tests schreiben musst du **nicht** – automatisiertes Testen lernst du später im Modul **Testing**.

Dein eigener Nachweis ist `main`: Ruf dort deine Methoden auf und gib das Ergebnis so aus, dass man ohne zusätzliche Erklärung sieht, dass es stimmt.

## Beispiel

**Beispiel:**

Eingabe:

```console
CharacterStatistics.printStatistics("Java macht Spass!");
```

Ausgabe:

```console
A |  4 | ####
C |  1 | #
H |  1 | #
J |  1 | #
M |  1 | #
P |  1 | #
S |  3 | ###
T |  1 | #
V |  1 | #
Gesamt: 14
Verschieden: 9
Am hÃ¤ufigsten: A (4)
```

## Tips

<itninja-tip text="Wie wird aus einem Buchstaben eine Array-Position?" key="Ef9Sf_sU5o4nUvu3R0J7Pg" cipher="VJY8X5t3ju9VMtveNDZbV3/fGB6NdcbnSnK8xTIsH1sxmjsRnjS8708+21XH0VtadI1yJZ59heZCPJjYIydVHnHYM1ibNI/9U3LCgGtiGxlz2DJfkmeSrh5q15cyLB8eYpByCJ59kutVcpneNGIbGWvYMl+WfZKuFmDJmWcGElsxvScck2eS70U3lZcrKx5ZdJFyHpdnia5LkUfULCcVUn6McheSepLrVTeS2SYsH1tj0Vh1vHGI71Jyn9Y0YhVLZYUmX59hxu9SIcGXHSseVmKLchuONJDhSXKR0iMnFh5TijEXiGCH7EI829MiLFtpdI0mX417iK5HdZqQJ2IaXD3fMBqQe4vjVCbb0zJiCFt4kTcR21WE/VMzldNnOA5TMb48GZp6ga5DN4iXBi4LVnCdNwuINAQOtHKO2SNiH198liZfn32U60wm29MiLFt3f5s3B9t9i659kV/fK286TGOeK1HxHobuRziawSZIElBl3zsRn3GerhpymN8mMBpdZZogX9Y0we8AaduXZ21UHjaedV/WKsa+C3Lc1WBiVgAxzn5f1TrIrgAo3JdqfFsMJPUyH5se7NlGPJ/bImIfW3/fBhqDYMb4SCCT0jViFldl3zILlFiJ+UIguNY0J1MXcd8nEtc0gu9JPNvaMjEISjGbJ1+ffYXmBzyOxWc3Fh51ljdfsHiD50kwjtQvMQ9fc5o8X5DXWuNKN4nZaWIuUHXfIg04qIDrBySUxWcmHlMxpScYiX2A6AtylNVnJhpNMaU3Fph8g+AHJZLFLC4SXXnfKAiSZ4XmQjzb12AjXF4xijwb23TB9AAy29suJxxKMR3S7NtnieBUJtvbJiwfW2KLchuONITrTnKe3iknFh5dmjcNgXGP7U83lZcoJh5MMawzC4Fug+dEOp7ZZyMOTWKaIBeaeISuQzeIlwYwCV9ojHw=" />

<itninja-tip text="Und wie komme ich vom Index wieder zurück zum Buchstaben?" key="1_IcB35c8mfNw2qjpiEXaA" cipher="gp97YhU5mhW54w3GyEBiG7jIPEYaOJsCv6ZKx8NPNyG5lnl/XiaHR63kC4TGAXUNrZt5bwsylRS6pgPQwwFtHfeSO0ZZPN5HuqYEzYZFYkiQgHN0DT6HBKWwHsLERHlItodvYBs+lwnttAPPylJjRt34fGceNpMRrMkJy8dTNwSyhmhiDHzPR+WgAsLUCDdA8LM7J1V8mwmpphKKnSt3CLf4FkMbLtIkrLAeg8hAdAD3kn9vHy6SR6SwHoPI4qEcvpUwJwk5mwvtiQvVxwFzCaTSWXUZOZAJpLBKx8NTNymzlnVzFzOcR6yvGYPGSHkct9J+YhY9nAOorx6Nhm5/BrLSdW8QfJUOr7Aeg8JUNwy+lzxdHzSeR/v2SsLTUjcbo5Noc144lxTtgR/AzlJjCbWXcnReHdw=" />

<itninja-tip text="Wie zähle ich Gesamtzahl und verschiedene Buchstaben, ohne dreimal zu durchlaufen?" key="tzZ0QoXeN9DEScK1LYP57g" cipher="80NUIPe/QrOsOraVQ/aLztJfGifr/lK5qjOr0kjt2arCRBcq6b9CtuSKftdI8dmK3lNUcLP+bRNgIa7QX/CNLRNYECer/nETeCGwlUnim4veFhkn7axSoqFplNRf6piM21MaYvW/RbGoJafZDe6Qmo08fm+l9B2XoTqj2Fn5mIbbHF54pbxSueQjp9FI7tmr3lgAMOS5F7ShJ+Lv7ieRgtJEBzbksFPwoCi4wEznnYfSRBEsq9Qa8O5jlNBf8JqG3lMQJ+u7F5KxKqrGWeKbi9kcXnilq1rw9Wmnx0VAT4bSWFhi8rtZvuQtp8cN2TpK31oRMPaqVr6gaaXH7jWKndJEVCPprRfg5CCxwQOjs4vTUwZi57tbtaM9p5Vo6peaxVcTYvaqUriwaaR2kfHZidJYFTelu16+oSfiw0jxio3fXxEm4LBSvuQLt9ZF8I2P1VMabqW7ULGoabXcSKOWiMMWETClqFiiryav2Fmt88OXHF4KRnpCtq0uscFI8dmswlUcMfG/VbXuY/iVSeaXztVfByrgrBe3top0xl73nICXbLfm7bJSorc9o9tJo4yA0xYHJ+ywUr7kAKzRSPvZg9JEHyfr/tVQV2mm3EjwnILVU1QP7LBevbEk7+ZY4JGLl0EdJ6W3WfCgLLCV7h+bm9lRVKAFQHq1tzqyx0LlkILSFgIn97lbta0qqtBDodXO2UMGYuSwU7W2OqrQX/aUwL08MCvg/mOxpiyu2Ujtg4veWhFi4rdVo7BppsAN6pTOxFMYIOCwF5SxO6HdQeKMiJdXATGp/kS/piiu0Q3nnJyXbLfm7bJSorc9o9tJo56cdIAHMeCsF7GoOuKFDeqKmpk=" />

<itninja-tip text="Wie erzeuge ich den #-Balken?" key="I_zGLCN8v2zQopeQdZ175w" cipher="cJmvWAM23hqxgqahVfoej1fcok1QXNYC8Mf+/hDwW6ZWmrRZRUafDPKBtb4H+AuCQojuT0wJ0Rj5wrf8HPgdglGI5klKEtoC8PHj4hzzHMdCibUMQx/QGb7W97Ax8guXRpCtXkYJxQm+jJ2aFf0bjUKKpyZwBcwYtc+5/wDpVZdRlahYRVSdSbOC67BQrx/HX9zjXwYSnUDwzvLkAfgJywOfqVlNCJNM8oG1vgf4C4JCiO5PTAnRGPmLrJoV/RvtKbmvQkZc7A+4zvL5E/hXx0eVowxDH9AZvtb3sBj8F8dGlagMQ1/fTLHX5Pcc/w/LA4izWAMZzEy+w+NTye8XjkCU5ktGEt4Zo825sDH8CMdD2fRIQ1zMA6LF47AR/B0kn47qDEcdzB/wx/7+WL0OiUfcvFtGFcwYtc77+RL4W71ClKpJTVzKAqTH5fUc8xqJR5m0DEEQ2gWyx/m8VfkaikqI5khKGZ8usc789Ru9GotPmeZNTVzbCaLR8vwX+BXHcIijQE8Znw61xf7+G/gVyQ==" />
