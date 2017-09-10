Vortrag (40 Minuten)   
Expertenniveau   

Titel: 
 * Apache Zeppelin: Visualisierung von Big-Data and Streaming Daten
 
Stichwörter: Zeppelin, D3, Streaming

Abstract (400-700 Zeichen):
Der Vortrag stellt zunächst Zeppelin sowie dessen Interpreter für gängige Big Data Tools wie Elastic Search und Spark vor. Nach ersten Visualisierungen gibt der Vortrag Tipps zum praktischen Umgang: Wozu nutzt man die Interpreter-API? Wie kann Cloud Storage (S3) beim Betrieb im Container helfen? Für den Schwerpunkt des Vortrags werden einige Daten mittels Spark analysiert und die eingebauten Tabellen- und Graphfunktionalitäten von Zeppelin präsentiert. Desweiteren wird gezeigt, wie man dynamische Elemente mittels Angular und interaktive Charst mittels D3 erzeugen kann, um etwa Streaming-Daten zu visualisieren.

Skizzieren Sie kurz die Lernziele Ihrer Einreichung:
* Verständnis zur Funktionsweise von Zeppelin sowie hilfreiche Tipps
* Praktische und Reproduzierbare Beispiel für interaktive Visualisierung mit Zeppelin.


Shell API

```
wget https://projects.apache.org/json/foundation/projects.json

cat ~/dev/techtalks/2017_zeppelin/projects.json | jq '.[] | select(.created > "2016-03-29") | .created'

cat ~/dev/techtalks/2017_zeppelin/projects.json | jq 'to_entries | .[] | select(.value.created | contains("2012"))'
```

Elastic API

Interpreter API verbinden mit dem Spark Cluster

``````

Spark API

Tabellen

Graphen

Buttonu / Editfelder

Streaming

S3 für Storage