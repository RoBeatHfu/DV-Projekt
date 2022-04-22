# DV-Projekt

Dieses GitHub Repository ist der Startpunkt des DV-Projekts. Das DV-Projekt soll Studierenden vermitteln, wie ein Software-Projekt in der Praxis abläuft und wie Entwickler miteinander zusammenarbeiten.

## Setup

### Anmelden bei Github

Jeder Studierende erstellt zunächst einen eigenen Account hier auf GitHub mit seiner HFU E-Mail Adresse und installiert anschließend die Software [Github Desktop](https://desktop.github.com).

### Teams

Bitte schreiben Sie sich dann im zugehörigen [FELIX-Kurs](https://felix.hs-furtwangen.de/url/RepositoryEntry/4067262512)  in ein Team ein. Jedes Studierenden-Team wählt einen Teamleiter, der dieses Repository hier "forkt" und seine Teammitglieder sowie seinen Betreuer als Collaborators einträgt. Jeder Teamleiter sendet den Link zum Team Repository per E-Mail mit dem Betreff "DV-Projekt: Team Repository" an seinen Betreuer/Dozenten.

**Die Teams legen alle Ihre Abgaben, Dokumente sowie den Quellcode in diesem Repository ab.**

### Benötigte Entiwcklungssoftware

* [Java 17 Software Development Kit](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
* [Eclipse IDE for Java Developers](https://eclipse.org/downloads)

Bitte stellen Sie sicher, dass alle Teammitglieder dieselbe Version der Softwarepakete haben

### Einrichtung

Alle Teammitglieder "clonen" das Team Repository auf Ihren Rechner (siehe Abschnitt "Wichtige Grundlagen > Teamwork" weiter unten). Änderungen, die Sie anschließend auf Ihrem Rechner machen, müssen mit Hilfe von Github-Desktop wieder in das Repository "gepusht" werden, damit diese den anderen Teammitglieder zur Verfügung stehen. Der Teamleiter trägt dann als erste Änderung in Ihrem Repository die Namen aller Teammitglieder in die Datei [TeamMembers.txt](TeamMembers.txt) ein.

Für Ihr Programm soll als Programmier-Workspace der Ordner [2_Quellcode](2_Quellcode) ausgewählt werden. Dort existiert bereits eine Applikations-Vorlage, welche Sie als Ausgangspunkt verwenden können. Alternativ können Sie ein neues Java-Projekt anlegen. Falls ein Java-Projekt bei Teammitgliedern nicht automatisch in Eclipse angezeigt wird, so können Sie dieses manuell importieren: [Video Projektimport](https://youtu.be/R3k8S28pr1c)

## Wichtige Grundlagen

### Teamwork

Die komplette Zusammenarbeit der Teams erfolgt über GitHub. Zum tieferen Verständnis, was Git und GitHub sind und wie diese Tools verwendet werden können, schauen Sie sich bitte die folgenden Videos an:
* [What is Git?](https://youtu.be/2ReR1YJrNOM)
* [Intro to GitHub Desktop](https://youtu.be/77W2JSL7-r8)
* [Better Commits](https://youtu.be/Hlp-9cdImSM) (until timestamp 3:22)

Es ist beim gesamten Projekt darauf zu achten die Arbeit in sinnvolle, kleine Commits mit aussagekräftigen Commit-Messages aufzuteilen. Dies gilt nicht nur für den Java-Quelltext, sondern auch für HTML Dokumente, die erstellt werden.

### Objektorientierte Entwurf

Das Projekt soll mit objektorientierten Entwurfsprinzipien erstellt werden. D.h. jedes Team sollte sich überlegen, welche Klassen, Methoden oder Interfaces die Anwendung benötigt und wie diese miteinander zusammenhängen. Dafür soll in der Projektskizze ein sogenanntes UML Klassendiagramm erstellt werden.

Hier einige Videos die Sie dabei unterstützen:
* [Quick recap OOP](https://youtu.be/1ONhXmQuWP8)
* [UML class diagrams](https://youtu.be/UI6lqHOVHic)

### HTML-Dokumente schreiben

Die Dokumentation der Projekte erfolgt über Webseiten im HTML-Format. HTML hat für diesen Zweck zwei entscheidende Vorteile. Erstens können die Dokumente bei Bedarf über das Internet zur Verfügung gestellt werden und auf jedem Rechner ohne Zusatzsoftware in einem Browser dargestellt werden. Zweitens bestehen HTML-Dokumente aus Text, was es einfach erlaubt die Änderungen an den Dokumenten mit dem Tool Git nachzuverfolgen.
* [HTML Quick Intro](https://youtu.be/ok-plXXHlWw)

### Quellcode-Dokumentation

Quellcode sollte stets dokumentiert werden, damit andere Entwickler diesen leichter verstehen un besser mit diesem umgehen können.
* [Intro to JavaDoc](https://youtu.be/CJxMwbJPisw)
* [Generate documentation from JavaDoc comments](https://youtu.be/Ls-NHebXY20)

### GUI Programmierung

Ihre Anwendung sollte eine grafische Oberfläche haben. In Java kann dazu beispielsweise die Bibliothek Swing verwendet werden:
* [Swing Intro](https://youtu.be/5o3fMLPY7qY)
* [Swing Login Form](https://youtu.be/iE8tZ0hn2Ws)
* [Swing Layouts](https://youtu.be/TxCHvvr2bMQ)
* [Drawing Graphics in Swing](https://youtu.be/KcEvHq8Pqs0)

Weitere Informationen finden Sie auch im Dokument [GUI Threads](2_Quellcode/GUI_Threads.pdf).

Sollten Sie ein Spiel mit Animationen oder sich bewegenden grafischen Elementen implementieren wollen, dann schauen Sie sich zudem gerne die folgende Playlist auf YouTube an: [Java 2D Game Programming](https://www.youtube.com/watch?v=LICU6zH8gVU&list=PLfHzvwt1lruOl0h6nn72545ISqh6Y1aPb&index=3)

Im Ordner [2_Quellcode](2_Quellcode) finden Sie bereits eine Projektvorlage mit GUI, an welcher Sie sich orientieren können. Zusätzlich finden Sie im Ordner [Beispielprojekte](Beispielprojekte) weitere Beispiele.

Alternativ können Sie auch eine Web-Anwendung erstellen, deren Oberfläche in HTML, CSS und JavaScript implementiert ist und welche über den Browser mit einem eigenen Server kommuniziert:
* [Intro to web development](https://www.youtube.com/playlist?list=PLZlA0Gpn_vH-cEDOofOujFIknfZZpIk3a)
* [Server requests](https://www.youtube.com/watch?v=cuEtnrL9-H0) with [JSON](https://www.youtube.com/watch?v=iiADhChRriM)

Eine Vorlage für eine solche Web App inkl. beispielhafter Serveranfragen finden Sie ebenfalls im Ordner [2_Quellcode](2_Quellcode).

## Zeitlicher Ablauf

1. Erarbeitung einer Projektskizze mit Anforderungen (ca. Woche 1-4)
	* Jedes Team wählt zunächst ein Projekt aus. In Absprache mit dem Betreuer/Dozenten ist es auch möglich eigene Projektideen vorzuschlagen.
	* Für sein Projekt erarbeitet jedes Team eine Projektskizze mit Anforderungen an das Programm im HTML-Format. Benutzen Sie dazu die Vorlage in [1_Projektidee](1_Projektidee)
	* In Woche 3 hat jedes Team die Gelegenheit die Projektskizze und die Anforderungen mit dem Betreuer/Dozenten zu besprechen.
	* **Abgabe**: Projektskizze in [1_Projektidee](1_Projektidee) (4. Semesterwoche)

2. Programmierung und Dokumentation (Woche 5-13)
	* Jedes Team programmiert selbständig an seinem Projekt.
	* Es gibt regelmäßige Rücksprachetermine mit dem Betreuer/Dozenten. Die entsprechenden Termine entnehmen Sie dem <a href="https://felix.hs-furtwangen.de/url/RepositoryEntry/4067262512" target="_blank">FELIX-Kurs</a>. In den Rücksprachterminen stellen Sie den aktuellen Stand Ihres Projekts vor. Sie können Fragen stellen und werden umgekehrt von Ihrem Betreuer befragt. Die Mitarbeit bei diesen Besprechungen wirkt sich auf Ihre Bewertung aus.
	* Der Programm-Quellcode soll mit JavaDoc dokumentiert werden. Einzelne, wichtige Quelltext-Abschnitte sollten zudem mit Kommentaren versehen werden, die das Verständnis beim Lesen des Quelltexts vereinfachen.
	* In einem Benutzerhandbuch im HTML-Format soll die Verwendung der erstellten Anwendung erläutert werden.
	* **Abgabe**: Quelltext in [2_Quellcode](2_Quellcode) (13. Semesterwoche)
	* **Abgabe**: Programmier-Dokumentation in [3_Dokumentation/JavaDoc](3_Dokumentation/JavaDoc) (13. Semesterwoche)
	* **Abgabe**: Benutzer-Handbuch in [3_Dokumentation/Handbuch](3_Dokumentation/Handbuch) (13. Semesterwoche)

3. Projektvorstellung (Woche 14)
	* Jedes Team präsentiert sein Projekt in 12 Minuten inkl. einer Live-Demonstration
	* Bereiten Sie
	* **Abgabe**: Präsentations-Folien in [4_Praesentation](4_Praesentation) (14. Semesterwoche)
	
## Bewertung

Hinweis: Es ist darauf zu achten, die Erarbeitung der Projektskizze sowie die Programmierung und Dokumentation so aufzuteilen, dass alle Teammitglieder beteiligt sind. Die individuelle Benotung hängt von den eigenen Beiträgen ab. Jedes Teammitglied erstellt daher seine eigenen Commits und "pusht" diese ins GitHub Repository. Pair-Programming ist möglich, d.h. Sie können an Commits zu zweit arbeiten. Erwähnen Sie dann die Namen am Beginn der Commit-Message. Mehr als 2 Studierende pro Commit sind nicht zugelassen.

Die einzelnen Projektteile werden wie folgt gewichtet:
* Projektskizze (10%)
* Programmier-Dokumentation und Benutzerhandbuch (10%)
* Mitarbeit (20%)
* Quelltext, Commits, Commit-Messages (50%)
* Präsentation (10%)

## Projektideen
* Applikation: ToDo-Liste
* Applikation: Netzplan für U-und S-Bahn
* Simulation: 2D-Roboter/Roboterarme: Bahnen im Arbeitsraum, Achsenbewegung 
* Simulation: Labyrinth erzeugen, Routenfindung
* Simulation: Autorennen (1 Fahrzeug, gestaltbare Rennbahn)
* Simulation: Feder-Masse-Schwinger (homogen, nicht homogen) 
* Networking: Chatprogramm 
* Networking: Serielle Schnittstelle über Internet "verlängern"
* Visualisierung: Sensor-Rohdaten (z.B. Gyroskop-Daten, EKG) über serielle Schnittstelle übertragen und grafisch aufbereiten
* Visualisierung: Mathematische Funktionen
* Spiel: Schere, Stein, Papier
* Spiel: Black Jack
* Spiel: Vier gewinnt
* Spiel: Tic Tac Toe


