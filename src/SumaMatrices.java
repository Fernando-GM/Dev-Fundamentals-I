import java.util.Scanner;

public class SumaMatrices {
    /**
     * Leer dos números n y m que indican las dimensiones de dos matrices. Leer dos matrices de enteros y
     * realizar una suma de matrices entre ellas.
     * (Una matriz es como una tabla de números en cada celda. n será el número de filas horizontales y m el
     * número de columnas verticales)
     * (La suma de matrices de dimensiones iguales es sumar cada correspondiente celda entre las dos matrices.
     * Por ejemplo sumar el número en las coordenadas (0,0) de la matriz 1 con el número en las mismas
     * coordendas (0,0) de la matriz 2.)
     * Extra: Escribir un menú con tres opciones: metodo para sumar matrices (con el código de arriba), metodo
     * para restar matrices (reusar código de arriba pero en vez de sumar, restar) o salir del programa (terminar el programa)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        ciclo: while(true) { // Sintaxis para etiquetar Ciclos
            System.out.println("""
                    Operación de Matrices. Menú:
                    1. Sumar
                    2. Restar
                    3. Salir""");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    int[][] matriz1 = leerPrimeraMatriz();
                    int[][] matriz2 = leerSegundaMatriz(matriz1.length, matriz1[0].length);
                    sumarMatrices(matriz1, matriz2);
                    break;
                case 2:
                    int[][] matrizA = leerPrimeraMatriz();
                    int[][] matrizB = leerSegundaMatriz(matrizA.length, matrizA[0].length);
                    restarMatrices(matrizA, matrizB);
                    break;
                case 3: break ciclo; // Sintaxis para salir de un Ciclo dentro de un switch usando etiquetas
            }
        }
        System.out.println("Fin de Programa.");
    }

    public static int[][] leerPrimeraMatriz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insertar dimensiones de las matrices");
        System.out.print("N = ");
        int n = scanner.nextInt();
        System.out.print("M = ");
        int m = scanner.nextInt();
        System.out.printf("Insertar primer matriz(%dx%d)\n", n, m);
        int[][] matriz = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    public static int[][] leerSegundaMatriz(int n, int m) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Insertar segunda matriz(%dx%d)\n", n, m);
        int[][] matriz = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    public static void sumarMatrices(int[][] matriz1, int[][] matriz2) {
        System.out.println("Imprimir suma de matrices: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print((matriz1[i][j] + matriz2[i][j]) + " ");
            }
            System.out.println();
        }
    }

    public static void restarMatrices(int[][] matriz1, int[][] matriz2) {
        System.out.println("Imprimir resta de matrices: ");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print((matriz1[i][j] - matriz2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
