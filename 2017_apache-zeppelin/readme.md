#Apache Zeppelin: Visualisierung von Big-Data and Streaming Daten

Dieser Vortrag stellt zunächst Zeppelin sowie dessen Interpreter für gängige Big-Data-Tools wie Elasticsearch und Spark vor. Nach ersten Visualisierungen gibt er Tipps zum praktischen Umgang: Wozu nutzt man die Interpreter-API? Wie kann Cloud Storage beim Betrieb im Container helfen? 

Für den Schwerpunkt des Vortrags werden einige Daten mittels Spark analysiert und die eingebauten Tabellen- und Graph-Funktionen von Zeppelin präsentiert. Des Weiteren wird gezeigt, wie man dynamische Elemente mittels Angular und wie man interaktive Charts mittels D3 erzeugen kann, um etwa Streaming-Daten zu visualisieren.

__Vorkenntnisse:__
Allgemeines Verständnis von Spark, JavaScript und Angular hilfreich, aber nicht erforderlich.

__Lernziele:__

* Verständnis zur Funktionsweise von Zeppelin sowie hilfreiche Tipps
* Praktische und reproduzierbare Beispiele für interaktive Visualisierung mit Zeppelin

## Setup
```
docker run -d --rm -e "USER=root" -p 8080:8080 apache/zeppelin:0.7.2
```

Then choose "import note" and select the presentation. 