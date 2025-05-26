public class Main {
    /**
     * Dada la cadena "_055@AB12c053/(2\90", generar un número
     * entero que servirá como índice usando Math.random() de 0 a 30,
     * obtener el caracter de la cadena en esa posición y tratar de
     * imprimir la división "100 / caracter" (Usar Integer.parseInt por
     * ejemplo). Imprimir el caracter al final sólo si se obtiene
     * correctamente. Capturar cualquier posible excepción.
     */
    public static void main(String[] args) {
        String cadena = "_055@AB12c053/(2\\90"; // Definir cadena dada
        int indice = (int) (Math.random() * 31); // Generar un número random de 0 a 30 y castear a int
        char caracter = 0; // Inicializar caracter con un valor por default
        System.out.println("Indice generado = " + indice);
        try {
            caracter = cadena.charAt(indice); // Obtener caracter en el indice generado
            int numero = Integer.parseInt(String.valueOf(caracter)); // Parsear char a int, es diferente a castear
            System.out.println("La división es = " + (100 / caracter) );
        } catch (IndexOutOfBoundsException ex) {
            // .charAt() puede generar esta excepcion
            System.out.println("Indice fuera del rango de la cadena. Ex: " + ex.getLocalizedMessage());
        } catch (NumberFormatException ex) {
            // Integer.parseInt() puede generar esta excepcion
            System.out.println("Caracter no es un numero entero. Ex: " + ex.getLocalizedMessage());
        } catch (ArithmeticException ex) {
            System.out.println("Division por 0. Ex: " + ex.getLocalizedMessage());
        } finally {
            // Imprimir el caracter obtenido solo si se obtuvo correctamente, o sea no es igual al valor por default
            if (caracter != 0) System.out.println("Caracter obtenido: " + caracter);
        }
    }
}