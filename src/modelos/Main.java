package modelos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro car = new Carro(); // Instanciar un objeto de la clase Carro
        car.color = "Amarillo"; // Asignar un valor a una propiedad del objeto car
        car.marca = "Ford";

//        System.out.println(car.color); // Acceder al valor de una propiedad del objeto car
//        metodo(car); // Los objetos se pasan "por referencia" a los métodos
//        System.out.println(car.color);

//        Carro car2 = new Carro();
//        car2.color = "Negro";
//        car2.marca = "Ford";
        car.info();
//        car2.info();
//        double kilometraje = car.kilometrajeAnual(50000, 6);
//        System.out.println("Kilometraje del carro: " + kilometraje);
    }

    public static void metodo(Carro car) {
        // Extra de como romper la referencia entre el parámetro y el objeto original
//        Carro extra = new Carro(); // Nueva instancia
//        car = extra; // Asignar una nueva referencia al parámetro, "rompe" la conexión con el objeto original

        car.color = "Rojo";
        System.out.println(car.color);
    }
}