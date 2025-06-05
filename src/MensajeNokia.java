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
//        miercoles();
        jueves();
    }

    private static void miercoles() {
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

    private static void jueves() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Leer entrada
        String output = ""; // Declarar salida
        for (int i = 0; i < input.length(); i++) { // Recorrer cadena caracter por caracter
            char character = input.charAt(i); // Obtener caracter
            if (character == ' ') { // Si es espacio, agregar automaticamente "0-" y continuar el ciclo
                output = output.concat("0-"); // Un espacio nunca va al final
                continue;
            }
//            output = switch (character) {
//                case 'a' -> output.concat("2");
//                case 'b' -> output.concat("22");
//                case 'c' -> output.concat("222");
//                case 'd' -> output.concat("3");
//                case 'e' -> output.concat("33");
//                case 'f' -> output.concat("333");
//                default -> output.concat("0");
//            };
            int valorLetra = (int) character - 'a'; // Calcular indice del valor de la letra, podemos restar 'a' ya que en terminos de int está tomando la posicion de la tabla ASCII
            output = output.concat(REVERSE_KEYBOARD[valorLetra]);
            if (i < input.length() - 1) output = output.concat("-"); // Si estoy en la ultima letra, no agregues guion corto
        }
        System.out.println(output);
    }

    // Arreglo de strings que corresponde a un teclado de un celular antiguo como Nokia pero al reves
    // Los indices corresponden al valor numerico de cada letra del abecedario: i = (int)'a' - 'a'
    // Los elementos corresponden al número de presiones a cada boton para cada letra del abecedario
    private static final String[] REVERSE_KEYBOARD = {
            "2", "22", "222",
            "3", "33", "333",
            "4", "44", "444",
            "5", "55", "555",
            "6", "66", "666",
            "7", "77", "777", "7777",
            "8", "88", "888",
            "9", "99", "999", "9999"
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
