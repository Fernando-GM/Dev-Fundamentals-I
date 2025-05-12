import java.util.Scanner;

public class SumaMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insertar dimensiones de las matrices");
        System.out.print("N = ");
        int n = scanner.nextInt();
        System.out.print("M = ");
        int m = scanner.nextInt();
        System.out.printf("Insertar primer matriz(%dx%d)\n", n, m);
        int[][] matriz1 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }
        System.out.printf("Insertar segunda matriz(%dx%d)\n", n, m);
        int[][] matriz2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Imprimir suma de matrices: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print((matriz1[i][j] + matriz2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
