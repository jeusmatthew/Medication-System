# Correspondence with requirements

Effective requirement management in software development is crucial to ensure project success. Requirements can be classified into two main categories: functional and non-functional. Both types play a critical role in defining the features and behavior of the final system, contributing to the achievement of established objectives. It is essential to understand the correspondence of these requirements throughout the entire software development lifecycle, from project conception to the implementation of the final product.

Functional requirements focus on what the system must do. They represent specific characteristics that the software is expected to provide, such as functionalities, capabilities, and behaviors. These requirements serve as the backbone of the system, defining the actions and operations that end-users can perform. During the development process, the precise implementation of functional requirements is crucial to ensure that the final product meets customer expectations and aligns with project objectives.

On the other hand, non-functional requirements focus on how the system should perform its functions. They include aspects such as performance, security, usability, and other attributes that impact the overall quality of the system. While they do not define specific functionalities, non-functional requirements are equally essential for project success. Proper implementation of non-functional requirements ensures that the software is efficient, reliable, and complies with established quality standards.

As the development process progresses, it is crucial to establish effective traceability between requirements and different stages of the software development lifecycle. Traceability ensures that each requirement is implemented comprehensively and verified at each development phase. This involves careful management of changes in requirements, ensuring that any modifications are made in a controlled and documented manner to avoid potential issues in the final product.

Verification and validation are critical steps in ensuring the successful implementation of requirements. Verification focuses on confirming that requirements have been implemented correctly, while validation ensures that the requirements truly satisfy customer needs. Both processes are essential to ensure the quality and compliance of the software with established requirements.

In summary, effective requirement management is vital for successful software development projects. Understanding both functional and non-functional requirements and establishing traceability throughout the development lifecycle are key practices. The proper implementation of requirements, along with thorough verification and validation processes, ensures that the software meets customer expectations and quality standards.

## Artifact

## Functional Requirements (RF) traceability matrix

| Identification | Description | Current Status | Registration Date |
| -------------- | ----------- | --------------- | ------------------ |
| RF-1 | The program should allow users to add medications, search for them, select dosage details, and schedule intake times. | Approved | [08/12/2023] |
| RF-2 | The system should provide detailed information about each medication, including precautions, possible side effects, and medication interactions. | Approved | [08/12/2023] |
| RF-3 | The program will create alarms for oral medication dosages through the calendar. It should execute a visual display and produce an alarming sound when the alarm is triggered. Users should be able to click on a date on the calendar to view complete details of scheduled doses for that day. | Approved | [08/12/2023] |
| RF-4 | The system must display medication names clearly and legibly. The application should be compatible with horizontal orientation on mobile devices. Buttons, interactive elements, charts, and data tables should adapt to horizontal orientation to maintain functionality and usability. | Approved | [08/12/2023] |
| RF-5 | The system must allow users to remove a medication from the list of scheduled medications. Removing a medication should require user confirmation to prevent accidental deletions. There should also be an option to remove all medications from the list for a complete reset. | Approved | [08/12/2023] |
| RF-6 | The system could include a symptom log module that allows users to record any side effects or symptoms experienced during treatment, as well as a history of all medications taken with the help of the DoseWize medication manager. | Could | [NA] |

## Non-Functional Requirements (RNF) traceability matrix

| Identification | Description | Current Status | Registration Date |
| -------------- | ----------- | --------------- | ------------------ |
| RNF-1 | The system will incorporate an extensive range of medications, covering the majority available in the Mexican market. | Approved | [08/12/2023] |
| RNF-2 | Incorrect medication information should be less than 1%. | Approved | [08/12/2023] |
| RNF-3 | The medication database must have been reviewed by at least one specialized healthcare organization. | Approved | [08/12/2023] |
| RNF-4 | The system should be compatible with Windows devices. | Approved | [08/12/2023] |
| RNF-5 | The application architecture should support easy scalability to accommodate an increasing number of users and data volume. | Approved | [08/12/2023] |
| RNF-6 | Routine maintenance tasks, including updates and bug fixes, should be performed with minimal disruption to the users and system availability. | Approved | [08/12/2023] |
| RNF-10 | The system should facilitate integration with external healthcare systems for seamless information exchange. | Approved | [08/12/2023] |
| RNF-11 | Implement measures to ensure discreet handling of sensitive medical information, preventing unauthorized access or disclosure. | Approved | [08/12/2023] |
| RNF-12 | The system implements the MVC pattern. | Approved | [08/12/2023] |

En resumen, la correspondencia efectiva de los requisitos a lo largo del desarrollo del software es esencial para el éxito del proyecto. La comprensión clara de los requisitos funcionales y no funcionales, junto con una gestión cuidadosa de la trazabilidad, cambios y validación, contribuye a la creación de un producto final que cumple con las expectativas del cliente y se alinea con los objetivos del proyecto. La implementación integral de los requisitos no solo es una práctica recomendada, sino que también es un requisito fundamental para el desarrollo exitoso de software.