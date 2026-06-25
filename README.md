# Laboratorio-General
Pequeños ejercicios de cada fase
🏗️ BLOQUE 1: FUNDAMENTOS Y PROGRAMACIÓN ESTRUCTURADA AVANZADA (La Base del Motor)
🟢 Fase 1: Sintaxis Esencial, Tipos y Operadores
Qué aprenderemos:
Arquitectura interna: Cómo compila Java, qué es el código fuente (.java), el Bytecode (.class) y cómo actúa la Máquina Virtual de Java (JVM).
Variables y constantes (final) en memoria RAM.
Tipos de datos primitivos estrictos (int, double, boolean, char, byte, short, long, float) y rango de capacidad de cada uno.
Operadores aritméticos, lógicos y de asignación compacta (como +=, ++).
Conversión de tipos (Casting explícito e implícito) y prevención de pérdida de datos.
🟢 Fase 2: Estructuras de Control, Flujos Dinámicos y Robustez de Datos
Qué aprenderemos:
Estructuras condicionales complejas: if, else if, else, y operadores ternarios.
Estructuras de selección por coincidencia: switch-case tradicional y las nuevas expresiones switch de Java moderno. El efecto cascada y el uso correcto de break.
Bucles controlados por condición y por contador: while, do-while y for clásico.
Gestión avanzada del flujo: Sentencias de interrupción break y continue dentro de bucles.
Blindaje de la Consola: El buffer de la clase Scanner. Dominio absoluto del carácter latente \n tras lecturas numéricas (nextInt, nextDouble) y cómo limpiar la tubería de entrada con nextLine().
Sanitización básica: Uso exhaustivo del método .trim() en objetos String para eliminar ruido y espacios accidentales de los usuarios.
🟢 Fase 3: Modularización y Diseño Funcional
Qué aprenderemos:
Anatomía estricta de una función: Firma del método, modificadores (public static), tipo de retorno (void o tipos de datos) y argumentos/parámetros.
El concepto de Ámbito (Scope) de una variable: Variables locales vs. variables globales de clase.
Paso de parámetros: Diferencia técnica entre paso por valor (tipos primitivos) y paso por referencia (objetos).
Reutilización limpia: Crear librerías de funciones genéricas aisladas en un archivo para que el método main actúe únicamente como un director de orquesta simplificado.
🟡 BLOQUE 2: ESTRUCTURAS DE ALMACENAMIENTO LOCAL Y CONTROL DE CÓDIGO (Gestión de Memoria)
🟡 Fase 4: Arrays Estáticos e Indexación (Vectores y Matrices)
Qué aprenderemos:
Definición física de un Array en memoria: Espacios contiguos y tamaño fijo inmutable.
Declaración e inicialización de arrays unidimensionales de primitivos y de String.
La regla del índice cero: Acceso, modificación y control estricto del límite del array para evitar el temido error ArrayIndexOutOfBoundsException.
Arrays bidimensionales (Matrices): Tablas complejas por filas y columnas (esencial para mapas de estadios o cuadrantes de turnos).
🟡 Fase 5: Algoritmia, Recorridos y Filtrado de Datos
Qué aprenderemos:
Bucles optimizados: Estructura del bucle for-each (bucle mejorado) para lectura rápida.
Algoritmos de búsqueda lineal y búsqueda binaria dentro de colecciones.
Algoritmos de ordenación básicos (como el método de la burbuja o Bubble Sort).
Lógica de filtrado: Cómo extraer datos específicos de una lista bajo condiciones lógicas (ej. contar cuántos accesos válidos hay en una lista).
🟡 Fase 6: Control de Versiones Profesional (Git y GitHub)
Qué aprenderemos:
Fundamentos del control de versiones: Qué es un repositorio local y un área de preparación (Staging Area).
Comandos esenciales en consola: git init, git status, git add, git commit -m.
Gestión de ramas (git branch, git checkout, git merge): Cómo trabajar en una funcionalidad nueva sin romper el programa estable.
Resolución técnica de conflictos cuando dos personas (o tú mismo desde distintos ordenadores) modifican la misma línea de código.
Trabajo en la nube: Conectar tu repositorio local con GitHub (git push, git pull) para asegurar tu código y tener tu portafolio listo.
🔵 BLOQUE 3: PROGRAMACIÓN ORIENTADA A OBJETOS (El Superpoder del Diseño)
🔵 Fase 7: Modelado de Objetos, Moldes y Encapsulamiento
Qué aprenderemos:
Cambio de paradigma: Pensar en objetos del mundo real (Pases, Estadios, Usuarios).
Clases como planos abstractos frente a Objetos como instancias físicas reales en la memoria Heap.
Atributos (Variables de instancia) y Métodos (Comportamientos integrados).
El método Constructor: Inicialización segura de objetos, palabra clave this y sobrecarga de constructores.
Encapsulamiento y Ocultación de Datos: Uso estricto de modificadores de acceso (private, public, protected). Creación de métodos de acceso seguros (Getters y Setters).
🔵 Fase 8: Colecciones Dinámicas Avanzadas (ArrayList)
Qué aprenderemos:
Diferencia entre arrays fijos y colecciones dinámicas que crecen o encogen solas en memoria.
La clase ArrayList y el uso de tipos genéricos (< >).
Métodos operativos: .add(), .get(), .remove(), .size(), y .contains().
Fusión de conocimientos: Crear listas dinámicas que almacenen internamente objetos complejos de nuestras propias clases (ej: un ArrayList<PaseAcceso>).
🔵 Fase 9: Los Tres Pilares de la POO Avanzada
Qué aprenderemos:
Herencia: Reutilización masiva de código. Crear clases madre (ej. Persona) y clases hijas que heredan sus propiedades (ej. Empleado, Espectador) mediante la palabra clave extends.
Polimorfismo: La capacidad de un objeto de tomar múltiples formas. Tratamiento de colecciones heterogéneas.
Abstracción: Clases abstractas (abstract) e Interfaces (interface). Creación de contratos de comportamiento obligatorios en el software.
Métodos esenciales de la clase raíz: Sobrescribir .toString() para impresión limpia de objetos, y .equals() para comparar objetos de forma real y no por su dirección de memoria.
🟠 BLOQUE 4: ROBUSTEZ, CONCURRENCIA Y CONTROL DE RECURSOS (Sistemas de Alto Rendimiento)
🟠 Fase 10: Gestión Estricta de Errores (Excepciones)
Qué aprenderemos:
Comprensión del árbol de excepciones en Java (Throwable, Error, Exception).
Diferencia entre excepciones en tiempo de compilación (Checked Exceptions) y en tiempo de ejecución (Unchecked / Runtime Exceptions).
Estructura indestructible: Bloques try, catch múltiples y el bloque finally para liberación obligatoria de recursos.
Lanzamiento de excepciones controladas mediante throw y delegación con throws.
Creación de tus propias excepciones personalizadas para tu lógica de negocio (ej. EdadNoPermitidaException).
🟠 Fase 11: Concurrencia y Programación Multihilo (Uso del Sistema)
Qué aprenderemos:
Hilos de ejecución: Cómo hacer que Java ejecute múltiples tareas a la vez aprovechando los distintos núcleos de tu CPU.
Creación de hilos mediante la clase Thread y la interfaz Runnable.
Control del ciclo de vida de un hilo: start(), sleep(), join().
Sincronización: Evitar el caos de datos cuando dos hilos intentan modificar el mismo recurso a la vez (palabra clave synchronized).
🟣 BLOQUE 5: ENTORNO VISUAL, CONEXIÓN EXTERIOR Y DRIVERS (La Capa del Usuario)
🟣 Fase 12: Interfaces Gráficas de Usuario (GUI con JavaFX)
Qué aprenderemos:
Diseño visual frente a diseño de consola. Instalación y configuración de JavaFX.
Estructura de una ventana: Escenarios (Stage), Escenas (Scene) y Nodos / Controles.
Componentes visuales: Botones, campos de texto interactivos (TextField), tablas de datos (TableView), etiquetas, imágenes y alertas emergentes.
Programación Orientada a Eventos: Programar la acción exacta que ocurre en el código cuando el usuario hace clic físico en un botón o presiona una tecla.
🟣 Fase 13: Interacción con el Hardware, Puertos y Datos Universales
Qué aprenderemos:
Entrada/Salida de archivos en disco duro local: Leer y escribir archivos de texto plano utilizando clases avanzadas (BufferedReader, BufferedWriter).
Conexión con Drivers: Comunicación básica a través de la red (Sockets TCP/IP) o lectura de flujos de texto procedentes de puertos USB (simulando la entrada de datos automática de un lector físico de códigos QR o escáneres del estadio).
Formato Universal JSON: Estructuración de datos para intercambio por internet. Uso de librerías externas (como Jackson o Gson) para transformar instantáneamente tus objetos de Java en texto JSON y viceversa.
🟤 BLOQUE 6: ARQUITECTURA PROFESIONAL, BASES DE DATOS Y CALIDAD (El Software Total)
🟤 Fase 14: Gestión Automática de Librerías (Maven / Gradle)
Qué aprenderemos:
El concepto de automatización de proyectos. Estructura estándar de carpetas de la industria.
El archivo de configuración maestro (pom.xml en Maven).
Gestión automática de dependencias: Añadir librerías externas de repositorios centrales de internet escribiendo una sola línea de configuración, delegando la descarga y actualización automática en el gestor.
🟤 Fase 15: Persistencia Real: Bases de Datos Relacionales (SQL y JDBC)
Qué aprenderemos:
Bases de datos: Instalación de un servidor local (MySQL o PostgreSQL).
Lenguaje SQL esencial: Crear tablas (CREATE TABLE), insertar datos (INSERT), consultar con filtros (SELECT * FROM ... WHERE), actualizar y eliminar registros.
Conectividad en Java (JDBC): Crear la línea de comunicación entre tu código Java y tu base de datos MySQL.
Ejecución de consultas seguras desde Java mediante Statement y PreparedStatement (blindando el programa contra ataques informáticos). Procesamiento de los resultados devueltos a través de un ResultSet.
🟤 Fase 16: Arquitectura Limpia y Patrones de Diseño (MVC)
Qué aprenderemos:
Patrón Modelo-Vista-Controlador (MVC): Separación absoluta de responsabilidades en archivos independientes.
Diseño del Modelo (clases puras de datos y acceso a MySQL), de la Vista (pantallas visuales de JavaFX sin lógica interna), y del Controlador (el pegamento lógico que lee la pantalla y actualiza la base de datos).
Patrón DAO (Data Access Object): Aislar completamente las consultas SQL del resto de la aplicación para lograr un software 100% escalable.
🟤 Fase 17: Escudo de Seguridad: Pruebas Automatizadas (Testing con JUnit)
Qué aprenderemos:
Filosofía del control de calidad: Escribir código que verifique código de manera autónoma.
Creación de suites de pruebas utilizando la librería estándar JUnit.
Uso de afirmaciones (assertEquals, assertTrue, assertThrows) para comprobar que los métodos devuelven exactamente lo esperado ante entradas normales, límites y entradas erróneas.
Pruebas de regresión: Asegurar que al modificar una pantalla o añadir una función para una base de datos, el resto del sistema antiguo sigue funcionando a la perfección de forma automatizada.
🟤 Fase 18: Empaquetado, Exportación y Despliegue Final
Qué aprenderemos:
El proceso de construcción (Build) del software terminado.
Compilar todo tu universo de clases, imágenes, pantallas y drivers en un único archivo comprimido profesional ejecutable de Java: un archivo .jar.
Uso de herramientas nativas de empaquetado para convertir ese .jar en un archivo nativo ejecutable directo del sistema operativo (un archivo .exe para Windows o ejecutable para Mac/Linux), creando un instalador limpio para el usuario final.
📝 Cómo abordaremos este plan:
Este es el mapa definitivo. No nos saltaremos ninguna baldosa de este camino. Como tú bien has dicho, el tiempo no importa; lo que importa es que cada fase se cierre con un proyecto práctico donde demuestres que dominas esa herramienta.
Cuando estés trabajando de viaje en tu portátil, nos enfocaremos en las fases lógicas usando el entorno online (Bloques 1 y 2). En cuanto regreses a España a tu ordenador de sobremesa, instalaremos el entorno profesional (el IDE IntelliJ IDEA, Git y servidores locales) y devoraremos las fases visuales, las bases de datos y la arquitectura avanzada.
Si estás de acuerdo y este es el nivel de profundidad que buscabas para comprender el sistema de arriba a abajo, confírmamelo y en nuestra próxima sesión abrimos de manera oficial la Fase 4: Arrays Estáticos con código real. ¡Tienes un plan de estudio digno de un ingeniero de software! 🏆💻

