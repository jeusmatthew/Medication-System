# Cambios en la Fase 3:

1. *Cambio en las Herramientas de Desarrollo:*
   - *Antes:* Inicialmente, el equipo de desarrollo utilizaba Flutterflow y Android Studio para el desarrollo de la aplicación móvil.
   - *Después:* Se tomó la decisión de abandonar Flutterflow y Android Studio para pasar a una simulación de aplicaciones móviles utilizando NetBeans e IntelliJ bajo el patrón de diseño Modelo-Vista-Controlador (MVC). Este cambio tiene como objetivo proporcionar un marco más robusto y adaptable a las necesidades de desarrollo.

2. *Requisitos Refinados y Enfocados:*
   - *Antes:* El proyecto tenía una extensa lista de requisitos.
   - *Después:* El proyecto fue sometido a una revisión, resultando en una lista de seis requisitos clave más refinada y enfocada. Este enfoque selectivo simplifica la gestión del proyecto y permite concentrarse en la implementación de características críticas y valiosas para los usuarios.

3. *Rediseño Estratégico de la Estructura del Software:*
   - *Antes:* La estructura del software se estaba desarrollando sin una mención específica de la modularización.
   - *Después:* El equipo llevó a cabo un rediseño exhaustivo de la estructura del software, introduciendo la modularización en los diagramas de clases y casos de uso. Esta adaptación estratégica mejora la legibilidad y eficiencia del desarrollo, facilitando la comprensión de la arquitectura del sistema y permitiendo futuras expansiones y mejoras.

4. *Implementación del Patrón MVC:*
   - *Antes:* El patrón MVC no se mencionaba.
   - *Después:* Se implementó el patrón Modelo-Vista-Controlador (MVC), proporcionando una separación más clara de responsabilidades dentro del código. Esto mejora la mantenibilidad y escalabilidad del proyecto. Las demostraciones de código bajo este enfoque muestran promesas sobre cómo se estructurará y gestionará la lógica del software en el futuro.

5. *Cambio en el IDE y Enfoque de Prototipado:*
   - *Antes:* Se consideraba Android Studio para crear el prototipo de escritorio.
   - *Después:* Debido a limitaciones de tiempo y la necesidad de familiarizarse con el entorno de desarrollo, se decidió cambiar a Java y NetBeans para desarrollar el prototipo de escritorio. Este cambio tenía como objetivo proporcionar una experiencia de desarrollo más fluida y eficiente.

6. *Gestión de la Base de Datos:*
   - *Antes:* No se mencionaba explícitamente la preferencia final para la base de datos.
   - *Después:* Aunque H2 se utilizó inicialmente para las pruebas, la preferencia final es una base de datos relacional en la nube para almacenar la información de los medicamentos. Se contempla el uso de SQLite para almacenar localmente la lista de medicamentos del usuario, permitiendo una gestión eficiente de la información específica del usuario mientras se aprovecha una base de datos en la nube para datos más generales.

En la fase inicial, el objetivo principal del "Sistema de Gestión de Medicamentos" era mejorar la experiencia del usuario en la administración de medicamentos, asegurando información precisa y recordatorios oportunos. Se enfocó en proporcionar acceso eficiente a detalles cruciales de medicamentos, registros históricos completos y recordatorios personalizados. La integración de la extensa base de datos PLM VADECUM aseguró información actualizada sobre diversos medicamentos. Sin embargo, se destacaron limitaciones importantes, como la falta de asesoramiento médico y la dependencia de la precisión de la base de datos.
En la segunda fase, se observaron cambios significativos en la estrategia de desarrollo. Se evidenció una transición en las herramientas de desarrollo, abandonando Flutterflow y Android Studio en favor de NetBeans e IntelliJ bajo el patrón MVC. La lista de requisitos del proyecto se refinó, centrándose en seis tareas clave para simplificar la gestión y enfocarse en características críticas. Además, se implementó el patrón MVC para mejorar la estructura del software, facilitando la comprensión y la escalabilidad del proyecto.
En la fase más reciente, la decisión estratégica de cambiar a Java y NetBeans para el prototipo de escritorio marcó un giro importante en el desarrollo. Este cambio se basó en la percepción de NetBeans como una opción más intuitiva y accesible, con el objetivo de garantizar una experiencia de desarrollo más fluida y eficiente, dada la presión temporal del proyecto y la curva de aprendizaje asociada con Android Studio. Además, se consideró H2 para pruebas iniciales de la base de datos, aunque se destacó la preferencia por una base de datos relacional en la nube para un almacenamiento escalable y accesible.