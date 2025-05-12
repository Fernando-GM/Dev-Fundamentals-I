import java.util.Scanner;

// Mi Primera Clase
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n0 = 0, n1 = 1;
//        int n2 = n0 + n1;
//        while (n2 < 1000) {
//            n0 = n1;
//            n1 = n2;
//            n2 = n0 + n1;
//        }
        for (int i= 0; i< 10; i++) {
            // Codigo...
            if (i == 4) {
//                return; // Fin del programa en public static void main
//                continue;
                 break;
            }
            System.out.println(i);
        }
        System.out.println("Fin del programa");
    }
}