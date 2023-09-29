# Abstraction

TODO:

Se incluye una versión inicial del Diagrama de Clases. Se establecen algunas relaciones y tipos de asociaciones. Existe una forma de verificar la correspondencia de las clases con respecto a los rrequisitos. Opcional: Se incluyen diagramas de secuencia para complementar la especificación de los RF.

## Class Diagram

```mermaid
classDiagram
    class AlarmSystem {
        
    }

    class CalendarSystem{

    }

    class App{

    }

    class SearchSystem{

    }

    class Medicament {

    }

    class Alarm{

    }

    class Database{

    }

    class Calendar{

    }

    class MedicamentDosage{

    }


    AlarmSystem"1"..>"*"Alarm
    Database"1"..>"*"Medicament

    

    CalendarSystem"1"..>"*"Calendar

    Alarm..>MedicamentDosage

    AlarmSystem--CalendarSystem

    App..>AlarmSystem
    App..>Database
    App..>SearchSystem
    App..>CalendarSystem

    MedicamentDosage..>Medicament

    SearchSystem--Database
```
