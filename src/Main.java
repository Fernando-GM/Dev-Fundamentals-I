import java.util.Scanner;

// Mi Primera Clase
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String[] carros = {"BMW", "Jetta", "Chevy"};
//        System.out.println(carros.length);
//        for (int i=0; i<carros.length; i++) {
//            int x = 5;
//            System.out.println(carros[i]);
//        }
//        //System.out.println(x); // No se puede ocupar variable x porque esta dentro de las llaves del for
//        System.out.println("*******************************");
//        for (String carro: carros) {
//            System.out.println(carro);
//        }
        String[] carros = {"BMW", "90", "Chevy"}; // Arreglo con valores definidos desde el inicio
        int n = scanner.nextInt();
        int[] numeros = new int[n]; // Arreglo sin valores definidos desde el inicio
        for (int i=0; i<numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        if (numeros.length > 2) {
            System.out.println(numeros[2]);
        }
        /*
        Tarea 4 :
        Leer un entero n, y despues leer n Strings. Imprimir los Strings con orden: del ultimo al primero
        Ejemplo: tengo este arreglo String[] carros = {"BMW", "90", "Chevy"};
        Entonces la salida es:
        "Chevy"
        "90"
        "BMW"
         */
    }
}