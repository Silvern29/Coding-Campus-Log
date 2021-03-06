# Coding Campus 
Dornbirn 2019

## Woche 1
### Tag 1 
Montag, 16.09.2019

#### Basics
###### Entstehung des Internets
Die Entstehung des Internets mit dem Arpanet 1969 rein zu militärischen Zwecken. 
1971 die Entwicklung der E-Mail
Abschaltung Arpanet und Wechsel zu IP-Netz
Einführung für den Privatanwender
Web 2.0 - Kommmerzialisierung, Social Media und user generated content

###### OSI-7-Schichtmodell

7. Schicht / Anwendung: Funktionen für Anwendungen, sowie die Dateneingabe und -ausgabe.
6. Schicht / Darstellung: Umwandlung der systemabhängigen Daten in ein unabhängiges Format.
5. Schicht / Kommunikation: Steuerung der Verbindungen und des Datenaustauschs.
4. Schicht / Transport: Zuordnung der Datenpakete zu einer Anwendung.
3. Schicht / Vermittlung: Routing der Datenpakete zum nächsten Knoten.
2. Schicht / Sicherung: Segmentierung der Pakete in Frames und Hinzufügen von Prüfsummen.
1. Schicht / Bitübertragung: Umwandlung der Bits in ein zum Medium passendes Signal und physikalische Übertragung.

Layer 6 - Die Darstellungsschicht (Presentation Layer)

Aufgabe: Umwandlung, Präsentation, Kompression, Verschlüsselung 

Hier werden die Daten zu oder von der Anwendungsschicht in ein geeignetes Format umgewandelt. Auch Aufgaben wie die Datenkompression und die Verschlüsselung gehören zur Schicht 6. 

Die Darstellungsschicht gewährleistet, dass Daten, die von der Anwendungsschicht eines Systems gesendet werden, von der Anwendungsschicht eines anderen Systems gelesen werden können. Falls erforderlich, agiert die Darstellungsschicht als Übersetzer zwischen verschiedenen Datenformaten, indem sie ein für beide Systeme verständliches Datenformat, die ASN.1 (Abstract Syntax Notation One), verwendet.

Protokolle und Normen: ISO 8822 / X.216 (Presentation Service), ISO 8823 / X.226 (Connection-Oriented Presentation Protocol), ISO 9576 (Connectionless Presentation Protocol)

Protokolle: Telnet, FTP, HTTP, SMTP, NNTP, NetBIOS

#### Begriffe
###### W3C

ist ein Gremium aller Organisationen und Firmen zur Standardisierung der Web-Technologien.

###### OMG

kümmert sich um herstellerunabhängige, systemübergreifende Standards in der objektorientierten Programmierung.

###### Accessibility

Barrierefreiheit zeigt Standards auf um die bestmögliche Nutzung von Technologien durch Menschen Beeinträchtigungen ohne zusätzliche Hilfen zu gewährleisten.

###### Responsive Webdesign

bezeichnet Webdesign, das es Internetseiten erlaubt, sich an das Anzeigegerät anzupassen. Es stellt den Seiteninhalt auch auf kleinen Bildschirmgrößen übersichtlich dar. Überwiegend gilt hier "mobile first", was so viel bedeutet wie, eine Seite auf die mobile Ansicht anzupassen und diese Ansicht dann über Mediaqueries für größere Bildschirme zu verändern. Nützliche Seite: http://ami.responsivedesign.is/

### Tag 2
Dienstag, 17.09.2019

###### Styleguide

Ein Styleguide legt fest, wie Unternehmenslogos, Slogans und andere Gestaltungselemente in der Öffentlichkeit genutzt werden dürfen. 

###### Corporate Identity & Corporate Design

Die Corporate Identity ist das Selbstbild des Unternehmens. Die Summe der Charakteristika eines Unternehmens repräsentiert die Corporate Identity. Das Konzept der CI beruht auf der Annahme, dass Unternehmen als soziale Systeme wie Personen wahrgenommen werden und ähnlich handeln können. Insofern wird dem Unternehmen eine quasi menschliche Persönlichkeit zugesprochen, beziehungsweise wird es als Aufgabe der Unternehmenskommunikation angesehen, dem Unternehmen zu einer solchen Identität zu verhelfen. 

Unter Corporate Design, kurz CD, wird die visuelle Identität verstanden. Corporate Design findet Anwendung u. a. bei der Gestaltung von Firmenzeichen (Unternehmenslogo, Firmensignet), Corporate Wear (Arbeitskleidung), Briefbögen, Visitenkarten, Onlineauftritten, der Corporate Architecture der Betriebsgebäude, Farbgebung.

###### Browser

Webbrowser sind spezielle Computerprogramme zur Darstellung von Webseiten im World Wide Web oder allgemein von Dokumenten und Daten. Beispiele sind Chrome, Firefox, Edge, Internet Explorer, Opera. 

Webseiten und Apps sollten immer auf verschiedenen Browsern getestet werden. Nicht alle Browser unterstüzen jede Funktion. https://caniuse.com zeigt die Unterschiede.

###### SEO

Suchmaschinenoptimierung beschäftigt sich damit, Webseiten darauf auszurichten, dass Suchmaschinen wie Google sie für besonders relevant zu einem Suchbegriff einstufen und dementsprechend weiter vorne listen. Der Algorithmus hierfür ändert sich immer wieder. Veraltete Suchmaschinen nutzen weiterhin vorrangig Angaben aus den Metadaten, zB Keywords. Google geht inzwischen zur Bewertung des tatsächlichen Inhalts einer Seite über. Die Schnelligkeit einer Seite wird mitbewertet. Content sollte nicht kopiert werden.  

###### Crawler

scannen das Internet und seine Seiten nach Inhalten. Die Einstufung der Seiten bei zB Google wird über Crawler vorgenommen.

###### Sitemap

Ist eine hierarchisch strukturierte Auflistung aller Unterseiten und Inhalte eines Internetauftritts.

###### Session

In einer Session wird eine ID verwendet, um User zu identifizieren und eine Verbindung aufrecht zu erhalten.

###### clientseitig

Clientseitige Programme und Scripts werden auf dem Rechner des Users ausgeführt. Eingaben, Abfragen und Prüfungen können offline gemacht werden. Seiten werden zum Beispiel auf dem Rechner des Users zusammen gestellt und interpetiert.

###### serverseitig

Programme und Scripts werden direkt auf dem Server ausgeführt. Der Server übernimmt die Rechenleistung und liefert das Ergebnis dann aus. Seiten werden zum Beispiel auf dem Server zusammen gestellt und dann erst ausgeliefert.

###### DOM

Document Object Model - ist eine Baumstruktur in der sich alle Elemente einer HTML-Seite befinden. 

###### Impressum, DSGVO

Im Impressum müssen Angaben zum Verantwortlichen für den Inhalt gemacht werden. (Name, Adresse, evtl Gewerbe, UID) Auch Angaben zum Urheberrecht finden sich hier.

###### Editor

Unter einem Editor versteht man in der Regel einen reinen Texteditor. Die meisten Editoren können über Plugins erweitert und ausgebaut werden bis hin zum Umfang einer kompletten IDE. 

###### Parser

ist ein Computerprogramm, das in der Informatik für die Zerlegung und Umwandlung einer Eingabe in ein für die Weiterverarbeitung geeigneteres Format zuständig ist. 

###### Compiler

wandelt Sourcecode um, in Maschinencode um der ausgeführt wird, oder zB in Bytecode, der dann weiter interpretiert wird. 

###### Interpreter

interpretiert Code und führt ihn aus, in dem er ihn in Maschinencode übersetzt.

###### IDE

Integrated Development Environment - sind Entwicklungsumgebungen, die alle wichtigen Tools bereits enthalten. Wichtige wiederkehrende Aufgaben werden automatisiert.

### Tag 3

###### XML

ist ein strukturiertes Dateiformat zur Speicherung und Weitergabe von Daten.

###### JSON

Javascript Opject Notation basiert auf Javascript. Ist ebenfalls ein Dateiformat zur Speicherung und Weitergabe von Daten.

###### HTML

derzeit Version 5, gibt über Tags die Struktur, das Grundgerüst einer Seite vor.

### Tag 4

###### CSS

beinhaltet Styles für Form und Aussehen einer Webseite. Über Selektoren werden HTML-Elemente angewählt.

### Tag 5 

###### Javascript/jQuery

Javascript ist eine Scriptsprache. Sie wird hauptsächlich auf Internetseiten clientseitig verwendet. Serverseitige Anwendung ist inzwischen auch verbreitet über zB Node.js. jQuery ist eine Library zu JS. Sie vereinfacht die Interaktion mit den einzelnen DOM-Elementen. 

## Woche 2
### Tag 6

###### PHP

ist eine serverseitige Scriptsprache. Sie wird auf dem entsprechenden Server interpretiert.

###### Java

ist eine objektorientierte Programmiersprache, die zu Bytecode compiliert wird, um dann in der Java Runtime Environment bei Ausführung interpretiert zu werden. 

###### C#

ist eine objektorientierte Programmiersprache im .NET-Framework

###### AJAX

