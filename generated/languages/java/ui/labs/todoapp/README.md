# Mini To-Do Planner

Eine kleine Javelit-App zum Lernen von Zustandsfluss, Formularen, Filterung und berechneten Zusammenfassungen.

## Ziel

Die App hilft dabei, typische Javelit-Muster in einer kleinen, verständlichen Anwendung zu üben:

- Mehrere Pages
- Formular-Eingaben
- Listen von Objekten
- Checkboxen / Toggle-Zustände
- Filtern von Daten
- Berechnete Statistiken
- 
## Vorbereitungsarbeiten

<!--instructions-->

## Anforderungen

### 1. Pages
Die App besteht aus drei Seiten:

1. Tasks
2. Add Task
3. Summary

### 2. Aufgabenmodell
Jede Aufgabe hat:

- Titel
- Status: offen / erledigt

### 3. Aufgabenliste
Auf der Tasks-Seite werden alle Aufgaben angezeigt.

Funktionen:

- Aufgaben hinzufügen
- Aufgaben löschen
- Aufgaben als erledigt / offen markieren
- Aufgaben nach Status filtern

### 4. Formular zum Hinzufügen
Auf der Add Task-Seite gibt es ein Formular mit:

- Textfeld für den Titel
- Submit-Button zum Speichern

Wenn der Titel leer ist, darf die Aufgabe nicht gespeichert werden.

### 5. Zusammenfassung
Auf der Summary-Seite werden berechnete Werte angezeigt:

- Gesamtzahl der Aufgaben
- Anzahl offener Aufgaben
- Anzahl erledigter Aufgaben
- Abschlussrate in Prozent

Zusätzlich kann eine Aktion vorhanden sein, um erledigte Aufgaben zu löschen.

## Beispiel-Use-Cases

- Eine neue Aufgabe für heute hinzufügen
- Eine Aufgabe als erledigt markieren
- Nur offene Aufgaben anzeigen
- Nur hochpriorisierte Aufgaben zeigen
- Den Gesamtfortschritt im Überblick sehen
