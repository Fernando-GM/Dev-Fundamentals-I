import java.util.Scanner;

// Mi Primera Clase
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Mi Nombre es: " + nombre);
    }
}