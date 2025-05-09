import java.util.Scanner;

// Mi Primera Clase
public class Main {
    public static void main(String[] args) {
        // If-Else
        Scanner scanner = new Scanner(System.in); // Leer significa entrada desde teclado
        int a = scanner.nextInt(); // Número entero o sea un int

        if (a < 0) {
            System.out.println("a es negativo");
        } else if (a == 0) {
            System.out.println("a es igual a cero");
        } else {
            System.out.println("a es positivo");
        }
    }
}