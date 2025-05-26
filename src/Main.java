import java.util.Scanner;

public class Main {
    /**
     * Leer un entero n, y despues leer n Strings (guardar en un Arreglo).
     * Imprimir los Strings con orden: del último al primero.
     * Ejemplo: tengo este arreglo String[] carros = {"BMW", "90", "Chevy"};
     * Entonces la salida en consola será:
     * "Chevy"
     * "90"
     * "BMW"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Leer n
        String[] arreglo = new String[n]; // Definir un arreglo de tamaño n
        /**
         * Después de usar un scanner.nextInt() y antes de un scanner.nextLine()
         * Ponemos un scanenr.nextLine() extra para que consuma el "enter" que nosotros metemos en consola cuando escribimos un numero
         */
        scanner.nextLine(); // Consumir salto de línea después de leer un número y antes de leer cadenas
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextLine(); // Leer n cadenas
        }
        // Recorrer arreglo de fin a inicio para imprimir al revés
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arreglo[i]);
        }
    }
}