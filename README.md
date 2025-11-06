
# Respuestas a preguntas:
# 1.- ¿Cómo podría en el Caso1 representar una situación más genérica para el caso de los animales?
Crearía una clase abstracta Animal que defina atributos comunes (nombre, color, edad) y métodos abstractos. Luego implementaría subclases como "Perro", "Gato" que hereden de Animal y sobrescriban los métodos de animal segun el animal.
Cambios en el diagrama de clases para la universidad con facultades y departamentos:

El diagrama cambiaría a:
La Universidad se compondría de Facultades. Cada Facultad se compondría de Departamentos. Los Departamentos tendrían Carreras 
Aparecerían nuevas relaciones: Universidad → Facultad → Departamento → Carrera

# 2.- Si consideramos ahora que una universidad no se encuentra compuesta de carreras sino que se compone de facultades y éstas a su vez se conforman de departamentos independientes. ¿Cómo cambia eso sus diagramas de clases. Aplicando el mismo razonamiento anterior ¿Cómo se podría generalizar el análisis hecho en el Caso2 en la clase Persona, Moto y Empresa Naviera?
  
Para Persona: Crearía una clase abstracta "Persona" con atributos (nombre, edad) y métodos abstractos. Implementaría subclases como "Empleado".
Para Moto: Diseñaría una clase abstracta "Vehículo" con atributos (marca, modelo) y métodos abstractos (encender, acelerar). "Moto" sería una subclase, así después se prodrian crear otras subclases como"Automóvil", "Camioneta", etc.
Para Empresa Naviera: haría que "Empresa" sea una clase abstracta, con "EmpresaNaviera" como subclase.



## Diagrama UML 

<img width="928" height="490" alt="image" src="https://github.com/user-attachments/assets/37f34b87-0d48-4001-b347-f0eb4a3cd99d" />
<img width="1215" height="489" alt="image" src="https://github.com/user-attachments/assets/795b9626-5b66-4b03-b2d6-667cefdf5dc6" />



