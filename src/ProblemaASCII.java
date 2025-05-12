import java.util.Scanner;

public class ProblemaASCII {
    /**
     * Dado un número entre 0 y 127, imprimir si corresponde a:
     * un número (0-9), letra mayúscula (A-Z) o letra minúscula (a-z) en la tabla ASCII
     * Extra: imprimir el caracter exacto dado por el input
     */
    public static void main(String[] args) {
        System.out.println("Inserta un numero correspondiente a un caracter ASCII: ");
        Scanner sc = new Scanner(System.in);
        char c = (char) sc.nextInt(); // Castear un int a un char
        if (c >= '0' && c <= '9')
            System.out.println(c + " es un número"); // Puedes omitir las llaves '{...}' para un if-else si solo hay una línea adentro
        else if (c >= 'A' && c <= 'Z')
            System.out.println(c + " es una mayúscula");
        else if (c >= 'a' && c <= 'z')
            System.out.println(c + " es una minúscula");
        else System.out.println(c + " es otro caracter");
    }
}
