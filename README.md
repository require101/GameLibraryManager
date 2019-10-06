# GameLibraryManager

## Requirements

* Firebase Project (```serviceAccount.json```)
* Steam API Key 

##Installation
In the root folder of the directory, place the ```serviceAccount.json``` from firebase.

In ```/java/resources``` edit ```application.example.properties``` and rename it to ```application.properties```.

Place your steam API key in the ```steamAPIKey``` property in the ```application.properties```.

Build the project, and it should run on ```http://localhost:8080```.
