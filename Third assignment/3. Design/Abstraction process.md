# Abstraction process

## Class Diagram

![Class Diagram](https://www.mermaidchart.com/raw/78b1e765-0daf-46ed-970d-19bcba14b194?theme=light&version=v0.1&format=svg)

## Changes

The following changes were made to the class diagram in the third delivery:

### Removal of the observer design pattern

The observer design pattern implemented in the previous delivery was removed because it was not necessary for the functioning of the project. The pattern was used to notify the view of changes in the state of the model. However, in this project, the model and view already communicate through the controller, so the observer design pattern was not necessary.

### Separation of classes by packages

The classes were separated by packages to improve the organization and understanding of the project. Previously, the classes were in the same main package, which could lead to side effects in the stability of the system. The packages were created according to the MVC (Model, View, Controller) structure.

### Addition of the `database` package

The `database` package was added to contain the `Conexion` and `Consultas` classes. These classes are responsible for connecting to the database and executing queries.

In the first delivery, there was a class called `Database` together with the class `SeachSystem`. In this third delivery, it has been decided to change it to the `database` package, because the current implementation provides better clarity compared to the previous one.

### Addition of a composition between AlarmsRoutine, Alarms, Medicament and Dosage:

The `AlarmsRoutine` class now has a composition with the `Alarms`, `Medicament` and `Dosage` classes. This means that each instance of `AlarmsRoutine` must have a corresponding instance of each of these classes.

This modification was made to reflect the fact that these three classes cannot exist without `AlarmsRoutine`. For example, an Alarm does not make sense without an AlarmsRoutine that controls it.

These changes were made to improve the clarity and efficiency of the class diagram.