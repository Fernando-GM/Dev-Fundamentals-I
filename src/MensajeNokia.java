import java.util.Arrays;
import java.util.Scanner;

/**
 * Dada una cadena (leer con Scanner) que solamente contiene números del 0 al 9 y guiones cortos,
 * convertirlo a texto en minúsculas con espacios (imprimirlo con println)
 * como si cada número fuera presionar una vez el botón correspondiente a un celular antiguo (ver la imagen).
 * El número 1 no corresponde a nada (ignorar el 1). El guión corto es para separar caracteres
 *
 * Ejemplo: la cadena "44-666-555-2-0-6-88-66-3-666" corresponde al texto "hola mundo".
 */
public class MensajeNokia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Leer entrada
        String[] characters = input.split("-"); // Dividir entrada en conjunto de numeros por guiones
        String output = ""; // Declarar salida
        for (String palabra: characters) { // Recorrer cada conjunto de numeros
            int num = Integer.parseInt(String.valueOf(palabra.charAt(0))); // Obtener el numero entero del primer caracter de cada conjunto
            int veces = palabra.length() - 1; // Calcular cuantas veces "se ha presionado" la tecla
            output = output.concat(KEYBOARD[num][veces] +""); // Concatenar a la salida el caracter correspondiente
        }
//        System.out.println(Arrays.toString(characters)); // Imprimir conjunto de numeros separaados, opcional
        System.out.println(output); // Salida
    }

    // Matriz de caracteres que corresponde a un teclado de un celular antiguo (ej: Nokia):
    // i (filas): tecla del numero
    // j (columnas): numero de veces que se presiona la tecla
    private static final char[][] KEYBOARD = {
            {' '},                  //0
            {},                     //1
            {'a', 'b', 'c'},        //2
            {'d', 'e', 'f'},        //3
            {'g', 'h', 'i'},        //4
            {'j', 'k', 'l'},        //5
            {'m', 'n', 'o'},        //6
            {'p', 'q', 'r', 's'},   //7
            {'t', 'u', 'v'},        //8
            {'w', 'x', 'y', 'z'}    //9
    };
}

/**
 * Casos de prueba:
 * Input: "8-44-33-0-77-88-444-222-55-0-22-777-666-9-66-0-333-666-99-0-5-88-6-7-7777-0-666-888-33-777-0-2-0-555-2-9999-999-0-3-666-4"
 * Output: "the quick brown fox jumps over a lazy dog"
 *
 * Input: "44-666-555-2-0-6-88-66-3-666"
 * Output: "hola mundo"
 */
