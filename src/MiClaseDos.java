import java.util.Scanner;
public class MiClaseDos {
    public static void main(String[] args) {
//        int num5ero55 = 50000;
//        double _decimalesMasGrandes = 5.987665;
//        boolean bandera = false;
//        int x = 1;
//        System.out.println(bandera);
//        bandera = true;
//        System.out.println(_decimalesMasGrandes);
//
//        char letra = '&';
//        String palabra = "hola clase";
//        System.out.println(letra);
//        System.out.println(palabra);
//
//        // Prints
//        System.out.println("Este print imprime una linea nueva");
//        System.out.println("Esta es una segunda linea");
//
//        System.out.print("Este no es con una nueva linea\n");
//        System.out.print("Mensaje nuevo\n");
//
//        double dolares = 9;
//        System.out.printf("$%.2f, esto es un numero: %d\n", dolares, x);
//        System.out.printf("%s", palabra);

        // Operadores
        int x = 5;
        int y = 10;
//        y = y * 2;
        y *= 2;
        double numero1 = (double) 10 / 2.6;
        int numero2 = (int) ((int) 10 / 2.6);
        double result = (double) (x + 10) / y; // Cociente
        int modulo = (x + 11) % y; // Residuo
//        System.out.println(numero2);

        // Operadores comparacion
        boolean banderita = 5 != 5;
//        System.out.println(banderita);

        // If-Else
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if ((a + 10) < b) {
            System.out.println("a es menor que b");
        } else if (a == b) {
            System.out.println("a es igual a b");
        }

        // tarea spoiler
        int numero = scanner.nextInt();

//        if () {
//            System.out.println("Es positivo");
//        } else if () {
//            System.out.println("Es negativo");
//        } else if () {
//
//        } else {
//
//        }
    }
}
