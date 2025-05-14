import java.util.Scanner;

public class MiClaseCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arreglo unidimensional
//        int[] arreglo = {4 , 5 , 8};
//        int[] arreglo2 = new int[3];
//
//        // Arreglos bidimensionales (Matrices)
        int[][] matriz = {
                {4, 5, 8},
                {1, 9, 7}
        };
//
        for(int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
//        // Con for-each
////        for (int[] ints : matriz) {
////            for (int anInt : ints) {
////                System.out.print(anInt + " ");
////            }
////            System.out.println();
////        }
//
        int[][] matriz2 = new int[2][3];
        for(int i=0; i<matriz2.length; i++) {
            for (int j=0; j<matriz2[i].length; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }
//        for (int[] filas : matriz2) {
//            for (int celda : filas) {
//                System.out.print(celda + " ");
//            }
//            System.out.println();
//        }

//        imprimirMensajes(1);
//        System.out.println("Otra cosa");
//        double decimal = 7.8;
//        String string = concatenarNumeros(3, decimal);
//        System.out.println(string);

        int y = 5;
        System.out.println("antes: "+y);
        sumarNumero(y);
        System.out.println("Despues: "+ y);


//        int[] arr = {1, 2};
//        System.out.println("antes: "+ arr[0]);
//        sumarArreglos(arr);
//        System.out.println("despues " + arr[0]);
    }


    // Por el momento, tratar de no repetir nombres de métodos
    public static void imprimirMensajes(int x) {
        System.out.println("Hello World");
        if (x == 1) {
            return;
        }
        System.out.println("Segundo mensaje");
    }

    public static String concatenarNumeros(int num, double decimal) {
        String cadena = num + "" + decimal;
        return cadena;
    }

    public static void conParametros(int[] arreglo, int[][] matriz) {
        //
    }

    // Parametros se pasan por valor
    public static void sumarNumero(int x){
        x+=2;
        System.out.println("durante: " + x);
    }

    // Objetos como arreglos se pasan por referencia
    public static void sumarArreglos(int[] arreglo) {
        for (int i =0; i<arreglo.length;i++) {
            arreglo[i]+=2;
        }
        System.out.println("durante " + arreglo[0]);
    }
}
