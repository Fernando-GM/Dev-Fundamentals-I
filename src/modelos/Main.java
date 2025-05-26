package modelos;

import java.util.Scanner;

/**
 * 1. Definir un paquete "modelos" y mover la clase Main al paquete.
 * 2. Definir la clase "Persona" dentro del paquete (ustedes definirán los tipos de datos y el código que tenga más sentido):
 * o Atributos: Nombre; Apellidos; Edad; Nacionalidad.
 * o Constructores: vacio; con nombre y apellidos; con todo.
 * o Métodos: imprimir toda la información de la persona (ignorar
 * atributos no inicializados); imprimir el año de nacimiento de
 * la persona dada su edad (consideraremos que ya cumplieron
 * años en 2025); cambiar de nacionalidad a una nueva (validar
 * que sea diferente a la actual)
 *
 * Pueden hacer pruebas con la clase modelos.Main
 */
public class Main {
    public static void main(String[] args) {
        // Pruebas
        Persona nada = new Persona();
        nada.imprimirInfo();
        nada.calcularNacimiento();

        System.out.println("*************************");
        Persona nombres = new Persona("Fernando", "Guerrero Montero");
        nombres.imprimirInfo();
        nombres.calcularNacimiento();
        nombres.cambiarNacionalidad("Mexicano");
        nombres.imprimirInfo();

        System.out.println("*************************");
        Persona persona = new Persona("Melissa", "Cartwright", 20, "Americana");
        persona.imprimirInfo();
        persona.calcularNacimiento();
        persona.cambiarNacionalidad("Brasileña");
        persona.imprimirInfo();
    }
}