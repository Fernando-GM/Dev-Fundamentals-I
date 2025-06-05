import java.util.Arrays;
import java.util.Scanner;

/**
 * Dado una lista de enteros (leer con Scanner el número de enteros también) mayor a 0 y menor a 100 y sin repetir números,
 * calcular el número menor y el número mayor
 * e imprimir todos los números entre el menor y el mayor (ordenados de abajo para arriba)
 * que no aparezcan en la lista de entrada.
 * (Pueden leer un entero por línea con Scanner e imprimir un número por línea con println)
 *
 * Ejemplo: dada la lista "6 11 3 8 9 7"; se imprimirán los números "4 5 10".
 */
public class ListaNumeros {
    public static void main(String[] args) {
        // miercoles();
        jueves();
    }

    private static void miercoles() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca cantidad de numeros: ");
        int n = scanner.nextInt();
        System.out.println("Introduzca lista de enteros mayores a 0 y menores a 100: ");
        int[] numbers = new int[n]; // Definir arreglo de tamaño n
        int menor = 100, mayor = 0;  // Declarar variables para guardar el numero mas pequeño y el mas grande
        for (int i = 0; i < n; i++) { // Recorrer la lista de numeros de entrada
            numbers[i] = scanner.nextInt(); // Leer numero y guardarlo en el arreglo
            if (numbers[i] < menor) menor = numbers[i]; // Guardar el menor
            if (numbers[i] > mayor) mayor = numbers[i]; // Guardar el mayor
        }
        boolean[] appears = new boolean[mayor + 1]; // Declarar arreglo de banderas para marcar los numeros que sí aparecen como true
        System.out.println(Arrays.toString(appears)); // Imprimir banderas iniciales (todas false)
        for (int number: numbers) { // Recorrer lista de entrada
            appears[number] = true; // Marcar como true el indice porque el numero aparecio en la entrada
        }
        System.out.println(Arrays.toString(appears)); // Imprimir banderas despues de marcar
        for (int i = 0; i < mayor + 1; i++) { // Recorrer banderas para imprimir
            if (i > menor && !appears[i]) // Solo imprimir si el indice es mayor a menor y si es false (significa que no aparecio en la entrada)
                System.out.print(i + " ");
        }
    }

    private static void jueves() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca cantidad de numeros: ");
        int n = scanner.nextInt();
        System.out.println("Introduzca lista de enteros mayores a 0 y menores a 100: ");
        int[] numbers = new int[n]; // Definir arreglo de tamaño n
        int menor = 100, mayor = 0;  // Declarar variables para guardar el numero mas pequeño y el mas grande
        for (int i = 0; i < n; i++) { // Recorrer la lista de numeros de entrada
            numbers[i] = scanner.nextInt(); // Leer numero y guardarlo en el arreglo
            if (numbers[i] < menor) menor = numbers[i]; // Guardar el menor
            if (numbers[i] > mayor) mayor = numbers[i]; // Guardar el mayor
        }
        boolean[] appears = new boolean[mayor + 1]; // Declarar arreglo de banderas para marcar los numeros que sí aparecen como true
        System.out.println(Arrays.toString(appears)); // Imprimir banderas iniciales (todas false)
        for (int number: numbers) { // Recorrer lista de entrada
            appears[number] = true; // Marcar como true el indice porque el numero aparecio en la entrada
        }
        System.out.println(Arrays.toString(appears)); // Imprimir banderas despues de marcar
        for (int i = mayor - 1; i > menor; i--) { // Recorrer banderas para imprimir
            if (!appears[i]) // Solo imprimir si el indice es mayor a menor y si es false (significa que no aparecio en la entrada)
                System.out.print(i + " ");
        }

    }
}

/**
 * Casos de prueba:
 * Input: "6 11 3 8 9 7"
 * Output: "4 5 10"
 *
 * Input: "1 11 13 8 4 2 5"
 * Output: "3 6 7 9 10 12"
 */
