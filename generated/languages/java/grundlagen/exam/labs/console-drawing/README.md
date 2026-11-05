# Zeichnen auf der Konsole

## Lernziel

Du zeichnest Formen und Verläufe mit verschachtelten Schleifen und berücksichtigst, dass Konsolenzeichen höher als breit erscheinen.

## Zeitbudget

Plane etwa **45 Minuten** ein. Wenn du nach 60 Minuten nicht weiterkommst, arbeite dich durch die Tipps von oben nach unten.

## Vorbereitungsarbeiten

<!--instructions-->

## Aufgabe

Implementiere in `ConsoleDrawing` drei Ausgaben:

1. einen **gefüllten Kreis**,
2. eine **Sinuskurve**,
3. einen **Helligkeitsverlauf**.

Verwende für den Verlauf zuerst die Rampe `" .:-=+*#%@"`. Zeichne ihn danach ein zweites Mal mit den Unicode-Blockelementen `" ░▒▓█"`.

Plane die Methoden und ihre Parameter selbst. Verwende `print`, um innerhalb einer Zeile weiterzuzeichnen, und `println`, sobald eine Zeile abgeschlossen ist. Gleiche beim Kreis aus, dass ein Konsolenzeichen ungefähr doppelt so hoch wie breit ist.

>::hint
>Falls Unicode-Zeichen als `?` erscheinen, ist nicht zwingend dein Java-Code falsch. Die Konsole muss UTF-8 verwenden und eine Schrift besitzen, die diese Zeichen enthält.
>
>Unter Windows kannst du vor dem Start `chcp 65001` ausführen. In PowerShell hilft zusätzlich `[Console]::OutputEncoding = [System.Text.Encoding]::UTF8`.

## Tests und Nachweis

Das Projekt bringt fertige Tests mit. Du darfst sie jederzeit mit `mvn test` laufen lassen, um zu prüfen, ob deine Methoden das Erwartete liefern. Eigene Tests schreiben musst du **nicht** – automatisiertes Testen lernst du später im Modul **Testing**.

Bei dieser Übung ist ohnehin dein Auge der beste Prüfer: Ruf deine Methoden aus `main` auf und schau dir an, ob Kreis, Kurve und Verlauf so aussehen, wie sie sollen.

## Beispiel

**Beispiel:**

Eingabe:

```console
ConsoleDrawing.drawFilledCircle(2);
ConsoleDrawing.drawSine(31, 9);
ConsoleDrawing.drawGradient(20, " .:-=+*#%@");
ConsoleDrawing.drawGradient(20, " â–‘â–’â–“â–ˆ");
```

Ausgabe:

```console
    #    
 ####### 
#########
 ####### 
    #    
      ****                     
    **    **                   
  **        **                 
 *            *                
*              *              *
                *            * 
                 **        **  
                   **    **    
                     ****      
   ..::--==++**##%%@
     â–‘â–‘â–‘â–‘â–‘â–’â–’â–’â–’â–’â–“â–“â–“â–“â–ˆ
```

## Tips

<itninja-tip text="Wie entscheide ich, ob ein Zeichen zum Kreis gehört?" key="oDAWM_6TgCMSpPKJBGLm8w" cipher="Y6x0Voyz5EZ8hKHocBjGl8VDNmOH5+hCdcuA6HdMxrbJXjZji/3rVzLIm+xjFsaazl5zQZby7EEywZvnYRHGuNJVf0Cb4KwDZcGc5yQRg5rOEFdRjefhTXaEiPxpQqua1ERzX47m7khmhJnlYQuIltIQeVeb4aBEfsGb6mxCgpbNEERSmvr1UDLNgf0qaOy3xV42cpzg9EJ8wNLkcRGVh4BUYxOa8ubgrtbS520BjoeAVX9dk/LsA3PRgfthAY6dxV420X4AoEZhhJXsaqFalNQcNleX9qByZ8WW+2UWg9PaRTZFm+HnT3fNkeFhDMjT5FF7Woqz81Nz1oH9JAaT08RZZBOa+uUDRdGA82EOxobOVDZRkvbpQWHQ0uthC8aUwV5sVpCz2kJ6yJfnPmjsk8BQfFKI8opKdITa8SRIxouAGzZK3rmgWjKYz6l2A4Ka1UM2Gd7h4Ud70YGgJBns04AQNkmb+uNLfMG34Go4g5rDWHNd1rq7AzKE3aYkMpOdy0Q2VJv7Q5Vg0NLzcQ/GuNJVf0D07opDcsT4g0gDlYCAVH9W3tjvTGDAm+dlFoOdgFR3UZv6oFV9ytLpKRCHl8lFZVPe8elQMsTZ+2UGj4bTUDZfn+bmRnyI0u1lDIjTzFlzVIqz5EZghL/gcBaDn9BFeFiKs+FWZsuf6HALlZDIEHRWl7OoEz6EwqAkF4iXgFRjE5Pm81BmhJzgZwqSgIBGc0GN8OhKd8aX5yo=" />

<itninja-tip text="Warum wird mein Kreis zu einem hochkant stehenden Oval?" key="0VcTu79UH2Mksn3jDgJ6Dg" cipher="hjJ6158xdg0E+RKNfW0Wa78tdtLcPHoNBNkYimAiK3uwM2Hay3R2EFCcXaZ9IhN9pXdm1dgxeaCA2g/Dam0KfrQ7Z5vMOz8LS9EVw3lrHy6zJXbSy3o/OUHbHotgZwl68TNmm9g4egpH2l2VZ2cWa/ENdtLcPHoNBNsTw2prHy6TJXbSyzE/FE3XXYpgIh5ntHdbeAk8ek8ExRSRaiIeZ7R3VdLYIW1DQN0Nk2tuDi6iODPT0Dd3Q1PbGMNscB9npXfxOyx0fhZXkhmGYyIxfLQ+YJvIPW0HBNcUjS5xDmu5Mn3f2ic/LFLTEc0ECD5ro3dSzswzcwZN0RXZLkwTY7x3e9TNPWUMSsYcjy5nDnmwd3fUzyR6D1CSDowudBNrvTIz69AndhdN3ROGYCxaQrAkYJvfLH9DRd4OjC50FWDxNz6Jn34/EUXWFJZ9YlpsuCQz2410NUNW0xmKe3EaLr02Zt3aOj8WStZdi29uGGe0JXab2zFxQ3PXD5cudRNrtTJhl582ehVLwF2HeyITZr93etWfMHYGBPkPhmdxHGGjOnbXnydrBkfZDpc0CHBusTd52sk1FQdLxx+PayIUYaM6ctfWLnoHfJJAw3YiVS7jeSOAtT15QwzcEpFjYxZnqzJ3459+Pw1LwBCCYmsAa7UPM5CfLT9JBMtd3zMiCG+1PmbIn34/EUXWFJZ9K1p18Xk9lZ8pFQNE0nfpWWsZZqU+dJvWJ2tDQNMOw24wVD6xd2DP3iBrQ0SAHc0uTxN68Tch258j3N9W1hjDRGMMb/EwctXFLn4LSNsaw3pnE2K0OTPO0TA/B1GSC4Z8bhNroyRnm9gxcQJRkhmKayIgebgkcNPaOmwATMAUl3pnVi61Pnab2yE/C03XD8NscBt7sj9gz5E=" />

<itninja-tip text="Wie wird aus Math.sin eine Zeile mit einem Sternchen?" key="a61zxcwjSmkKUa0o_eC6IQ" cipher="IsNTob5GI0lZMsValJTORAWBU6MPnzhJYDTJTd2zykAH2RblqUokE289wwb36pALLt8AsalNOUluNMMIqonUSg7BXe/mAyokayXFBo6J1EFLyAGyrVE+DH5x/0mZidtPH4FTq6VAIh0qFt9Jmc6aZALDFuW6TCYFb3H9TY+J1UUOjQCsokdqCThxhwiwgc5JRf06peIDHAx4JchBkYWaUgLIU6S5RWoNYzSNao+F01UOl1OlqEw/C2Y0jUmTh9ZES5BTpqNPPwRkcYcIz8CQASbMB63icwNJJXGFX5SEzklLgFP05RgqYwB7h3KKhdNVDsMA5ahGJEldNN9c3YHPR0v3FqygRiRJfzzfTZ6I1EQFg1nv7EMHCH45g1uUjtoBB8QWo6lRPkknYI1KlJOaEEeNF7DsQTgIfzLFW4nAigEJxADlrEsvAG052QjQwItBRY0yoahKLxtvcdddmJLJVUucU+2oQjlJbyPKQZ+UmhFLzxq27BFjRSo82ESJicpNAtcaoL5Gag1rP8MIkInOAQuFG6ClRCIdKnyNGdSAmlQFyVOxqUomDCo12FqeiJoTRad57+ZnOAB+JchGjsDARALOG6upTWRDIHHnTYmazgEcyBq2v1dqDX9xy+tBkppLDskW5Z9TKwV+NIEIlI6aVg7BEK2pUWozbzjBTd2E21JL/gegvk0pAW8/jVuJhdJEBY0esL9QZElNNMUIp4XTTQ6NFQZwUWozbzjBTd2Ez1MIxVOwokdqDmMzjUGTwNBED8gB5Z9TKwV+NI1Nk5TNRA/IAeWoQjlJWSXIWpOD0kQFjRyhqVFqDGM/jWSYhchbDsQQralNagh/IoMi96TfTwCNF6S+QiRFKjXMW47A4EQCwRbl/AMlC28/jUGOlJYBDsQd5aRMIgx4cf5Bk5XJVg7fB+WtQS8bKj7PTZPAyVUOxRar7FAlBWZ/jWyIwNdUGN4H5a1POQYqMcVNlIfSVUuAU/TsDmobZSbNCJCJzgEPyB7lrkY4DGk5w02JhdQBPMgBsexVLxttPchBnojfT0eNAKqiUD5JeSXIQInA3kQCwxblh1Y4H29xzF2bwN5EBo04qrxFZA==" />

<itninja-tip text="Wie ordne ich einer Spalte das richtige Zeichen der Rampe zu?" key="WnTL5M_wCQUyQf9QtlIUMw" cipher="HgHrjK6DfSVINpo5lhBxQT8dqIyq0HxrRiSNI9U6fVY+GKKHp5V7JXUzPObFIXEJehCige+jeWReNZo+liR7XXpE64amgyllRSibJN5yORNrFOuRoZQpYVsk3wLXP2RWNA6ujayYbGsSN5A+lmI0UTMH64S9kWR1HC2aPtEmfBtzVObE/pAnJXUkjCXVOmATMwe/xKuZbCVnLI011Tp6RjQT65KgnSlgWy+aPpY7ehM+EaXErp5tYEAkkX68WHRTOh6qkq76YGtGYZY+0jdsE2dUosTl0CF3UyyPfto3elQuHOPN790pNBth0HCeJX1XLhzrye/BID44IpcxxHJ3WzsGqoe7lXslD2GNMdsiOlAyFbmlu9hga1Ykh3mNWHRTOn7BoKaVKVdXKJc12DR7Xz0R6428hClgXDWMM943fVc/Gq/e75V7dkZhkiXaJn1DNh2xjaqCbGseYZsx2Dw0VzMCooCmlXtgXG/fB3XuZlc/B7/Eq4Upf0ckjSPCcnRaelvrzLiZbXFaYdJwh3t0EygRqIyhlWcpEio89Ns3NFE/HeuAqoIpQlMvhSrXOnhXMwKil6afZyVUIIwkljt5Xj8G69TvmGx3UzSMcMM8cBM+EaKK75doa0gkjXDgN2ZfOwGtxK2VenHx/ZE003J1RilUr4Gi0Gx3QTWaPpYIcVo5HK6K4foDVUCCQzaWM3kTCRejiLqDeiVWKJpw5JGwXT4Rud7vsmxsEiGWcItyJFN6Gb6XvNA5JVokjTHDIX9cNxmuiuPQa2BbYZ85lm80RDMQv4zv3Sk0UmGYNdgzYRM6BqqJv95lYFwmizieezQeekWryg==" />
