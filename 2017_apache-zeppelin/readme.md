#Apache Zeppelin: Visualisierung von Big-Data ~~and Streaming Daten~~

Dieser Vortrag stellt zunächst Zeppelin sowie dessen Interpreter für gängige Big-Data-Tools wie Elasticsearch und Spark vor. Nach ersten Visualisierungen gibt er Tipps zum praktischen Umgang: Wozu nutzt man die Interpreter-API? Wie kann Cloud Storage beim Betrieb im Container helfen? 

Für den Schwerpunkt des Vortrags werden einige Daten mittels Spark analysiert und die eingebauten Tabellen- und Graph-Funktionen von Zeppelin präsentiert. Des Weiteren wird gezeigt, wie man dynamische Elemente mittels Angular und wie man interaktive Charts mittels D3 erzeugen und Helium Pakete einbinden kann.

## Setup

1. clone repo
2. run 
```
docker-compose up
```
3. Import `presentation.json` über "Import Notebook" auf [localhost](127.0.0.1:8080)
