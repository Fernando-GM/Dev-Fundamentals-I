import java.util.Scanner;

public class MiClaseTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();

//        // Operador Ternario
//        String resultado = (x < 0) ? "Negativo" : ( (x == 0) ? "Cero" : "Positvo" );
//        // Lo mismo que arriba
//        if (x < 0) {
//            resultado = "Negativo";
//        } //...
//
//        // Operador AND
//        if (x >= 5 && x <= 10) {
////            System.out.println("X esta entre 5 y 10");
//        }
//        // Lo mismo que arriba con ifs anidados
////        if (x >= 5) {
////            if (x <= 10) {
////                System.out.println("X esta entre 5 y 10");
////            }
////        }
//
//        // Operador OR
//        if(x < 0 || x > 0) {
////            System.out.println("X no es 0");
//        }
//
//        // Operador NOT
//        boolean primeraCarga = true;
//        if (!primeraCarga) {
//            System.out.println("Es falso");
//        }

        //Ejemploito (P && Q) || !Q
//        boolean p = false;
//        boolean q = false;
//        if (p && q || !q) {
//            System.out.println("entre");
//        }

        // switch
//        System.out.println("Menu. Opcion 1: Haz esto. Opcion 2: Haz otro etc");
//        int opcion = scanner.nextInt();
//        switch (opcion) {
//            case 1: {
//                System.out.println("Opcion 1");
//                //if
//                break;
//            }
//            case 2: {
//                System.out.println("Opcion 2");
//                break;
//            }
//            case 3: {
//                System.out.println("Opcion 3");
//                break;
//            }
//            default: {
//                System.out.println("Salir del menu");
//            }
//        }

        // Ciclo While
//        int n = 10;
//        while (n < 10) {
//            System.out.println("While. n = " + n);
//            n += 2;
//        }
//
//        // Ciclo Do...While
//        int m = 10;
//        do {
//            System.out.println("Do While. m = " + m);
//            m += 2;
//        } while(m < 10);

        // Ciclo For
        //  Parte 1;    Parte 2;    Parte 3
        int n = scanner.nextInt();
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            // Sumar calificaciones mientras vayamos leyendo inputs del teclado}
            // Guardar calificacion más baja y calificación mas alta en sus respectivas variables para imprimir al final
        }

    }
}
