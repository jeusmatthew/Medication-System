# Abstraction

## Class Diagram

```mermaid
classDiagram
    classDiagram
    class AlarmSystem {
        
    }

    class CalendarSystem{

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

    %% App..>AlarmSystem
    %% App..>Database
    %% App..>SearchSystem
    %% App..>CalendarSystem

    MedicamentDosage..>Medicament

    SearchSystem--Database
```
