import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.lang.Math;

public class MiClaseSeis {
    public static void main(String[] args) {
        // Strings
        String s = String.format("%s|%f", "cadena", 6.6);
//        System.out.println(s);
//        int orden = s.compareTo("abc");
//        if (orden < 0) {
//            System.out.println("Menor lexicograficamente");
//        } else if (orden > 0) {
//            System.out.println("Mayour lexicograficamente");
//        } else {
//            System.out.println("Cadenas iguales");
//        }
        System.out.println(s.charAt(2));
//        if (s.contains("dena")) {
//            System.out.println(s + " contiene \"dena\"");
//        }
//        if (s.equalsIgnoreCase(s.toUpperCase())) {
//            System.out.println("Iguales sin importar mayusculas");
//        }
//        String s2 = "   con espacios   ".trim();
//        System.out.println(s2);
//        String[] cadenas = "1,2,3,4,5,6,7,8,9,10".split(",");
//        for (String cadena: cadenas) {
//            System.out.println(cadena);
//        }
//        int id = 89;
//        String ruta = "https://www.webpage.com/api/modelo/{ID}"
//                .replace("{ID}", ""+id);
//        System.out.println(ruta);
////
////        // Math
//        int a = Math.abs(-5);
//        double b = Math.cos(Math.toRadians(60));
//        double c = Math.PI;
//        double d = Math.ceil(8.1);
//        double e = Math.floor(8.9);
//        double f = Math.pow(2, 32);
//        double max = Math.max(6.6, 10);
//        int min = Math.min(0, -90);
//        // [0,1]
//        double random = Math.random();
//        int r = (int) (Math.random() * 101);
//        System.out.println(r);

//        Date date = new Date();
//        java.sql.Date x = new java.sql.Date(4);
//        System.out.println(date);
//
//        // Exceptions
//        while(true) {
//        try {
//            // Todos estos son Unchecked Exceptions
//            System.out.println("Start");
//            int[] myNumbers = {1, 2, 3};
//                System.out.println(myNumbers[10]);
//                System.out.println("Despues de la excepcion");
//            int div = 5/0;
//            Scanner sc = new Scanner(System.in);
//            int notAString = sc.nextInt();
//                int[] negSize = new int[-1];
//                String notInitialized = null;
//                System.out.println(notInitialized);
//        } catch (ArithmeticException ex) {
//            System.out.println("Division / 0 no es valido");
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Indice de arreglo fuera del tamaño");
//        } catch (Exception e) {
//            System.out.println("GENERAL");
//        } finally {
//            System.out.println("The 'try catch' is finished.");
//        }
//        System.out.println("FInal");
//        }
// Leer n enteros en un arreglo, validar input con try-catch. Usar Math.random() + 1 para asignar negativo si es 0 o positivo si es 1.
//
     // Checked Exception
        try {
            processFile(null);
        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
            System.out.println("Ocurrio un problema");
//            throw new RuntimeException(e);
        }
//        System.out.println("Hola");
//
//        String s2 = "CADENA";
    }


    public static int metodo() throws IOException {
        int x = Integer.parseInt("0");
        return 5 / x;
    }

    public static void processFile(String fileName) throws IllegalArgumentException {
        if (fileName == null) {
            throw new IllegalArgumentException("File name cannot be null.");
        }
        // codigo
        System.out.println(fileName);
    }
}