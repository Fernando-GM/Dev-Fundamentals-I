import java.util.Scanner;

public class ProblemaCalcularPromedio {
    /**
     * leer numero n, leer n numeros enteros que corresponden a calificaciones de 0 a 100.
     * calcular el promedio (a dos decimales) e imprimir la calificación más baja y la más alta
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 101, max = -1, sum = 0; // Declarar variables en una sola línea antes del ciclo
        for(int i = 0; i < n; i++) {
            int next = sc.nextInt();
            min = Math.min(min, next);
            max = Math.max(max, next);
            sum += next;
        }
        System.out.printf("Promedio = %.2f\n", ((float)sum / n));
        System.out.println("Calificacion mas baja = " + min);
        System.out.println("Calificacion mas alta = " + max);
    }
}
