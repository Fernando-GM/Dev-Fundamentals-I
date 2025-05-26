package modelos;

// Definición de Clase Persona en Paquete modelos
class Persona {
    // Propiedades
    String nombre;
    String apellidos;
    int edad;
    String nacionalidad;

    // Constructor vacío
    Persona(){}

    // Constructor con nombre completo
    Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // Constructor completo
    Persona(String nombre, String apellidos, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    // Metodo para imprimir la info de la persona
    void imprimirInfo() {
        System.out.println("Imprimir info de la persona:");
        // Verificar que las propiedades fueron inicializadas
        if (nombre != null) {
            System.out.println("Nombre: " + nombre);
            // No hay constructor para inicializar solo nombre sin apellidos así que nos ahorramos una validación
            System.out.println("Apellidos: " + apellidos);
        }
        if (edad > 0) { // los tipos primitivos como int no pueden ser null
            System.out.println("Edad: " + edad);
        }
        if (nacionalidad != null) {
            System.out.println("Nacionalidad: " + nacionalidad);
        }
    }

    // Metodo para imprimir el año de nacimiento de la persona
    void calcularNacimiento() {
        // Verificar que edad fue inicializada
        if (edad > 0) {
            System.out.println("Año de Nacimiento = " + (2025 - edad));
        }
    }

    // Metodo para cambiar nacionalidad
    void cambiarNacionalidad(String nuevaNacionalidad) {
        // Validar que nacionalidades son diferentes
        if (!nuevaNacionalidad.equalsIgnoreCase(nacionalidad)) {
            this.nacionalidad = nuevaNacionalidad;
        } else {
            System.out.println("Misma nacionalidad.");
        }
    }
}
