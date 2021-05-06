# arcgis.soe.sample
Projekt zawiera Server object extensions (SOE) utworzony z wykorzystaniem ArcObjects SDK 10.8.1

## Objaśnienia
* [PROJECT_HOME] - ścieżka w której znajduję się ten projekt

## Wymagania do budowania zródeł
W systemie powinny być zainstalowane poniższe komponenty:
* ArcGIS Server 10.8.1
* ArcObjects SDK 10.8.1
* Java JDK 8
* Maven 3.6.3

Ponadto w systemie powinny być ustawione zmienne środowiskowe:
* AGSSERVER - ścieżka instalacji ArcGIS Server 10.8.1
* AGSDEVKITJAVA - ścieżka instalacji ArcObjects SDK 10.8.1
* JAVA_HOME - ścieżka instalacji Java JDK 8


##Budowanie projektu
W celu zbudowania zródeł w kataloku [PROJECT_HOME] należy wywołać komendę

	mvn clean install
	
Podczas budowania projektu w katalogu [PROJECT_HOME]/target/soe zostanie utworzony plik arcgis.soe.sample.soe

##Deploy SOE
Plik arcgis.soe.sample.soe należy zdeployować na ArcGIS Serwerze 10.8.1 według instrukcji ze strony:

	https://enterprise.arcgis.com/en/server/latest/develop/windows/deploying-an-extension.htm
	
##Włączenie SOE
Po zdeployowaniu SOE można je włączyć do wybranej usługi na ArcGIS Serwerze według instrukcji:
	
	https://enterprise.arcgis.com/en/server/latest/develop/windows/enable-extensions.htm



