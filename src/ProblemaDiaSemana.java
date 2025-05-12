import java.util.Scanner;

public class ProblemaDiaSemana {
    /**
     * dado un numero entre 1 y 365, imprimir el día de la semana correspondiente al año 2025
     * (1 de Enero fue miércoles. 31 de Diciembre será miércoles.)
     * Extra: imprimir el mes al que corresponde el input
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insertar un entero entre 1 y 365: ");
        int dia = sc.nextInt();
        String semana = switch (dia % 7) { // Asignar una variable usando switch
            case 1 -> "Miercoles";
            case 2 -> "Jueves";
            case 3 -> "Viernes";
            case 4 -> "Sabado";
            case 5 -> "Domingo";
            case 6 -> "Lunes";
            default -> "Martes";
        };

        String mes = "";
        if (dia <= 31) mes = "Enero";
        else if (dia <= 31 + 28) mes = "Febrero"; // Operación aritmética dentro de un if
        else if (dia <= 31 + 28 + 31) mes = "Marzo";
        else if (dia <= 31 + 28 + 31 + 30) mes = "Abril";
        else if (dia <= 31 + 28 + 31 + 30 + 31) mes = "Mayo";
        else if (dia <= 31 + 28 + 31 + 30 + 31 + 30) mes = "Junio";
        else if (dia <= 31 + 28 + 31 + 30 + 31 + 30 + 31) mes = "Julio";
        else if (dia <= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31) mes = "Agosto";
        else if (dia <= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30) mes = "Septiembre";
        else if (dia <= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31) mes = "Octubre";
        else if (dia <= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30) mes = "Noviembre";
        else mes = "Diciembre";

        System.out.printf("Dia %d cae %s en el mes de %s", dia, semana, mes); // printf con tres variables
    }
}
