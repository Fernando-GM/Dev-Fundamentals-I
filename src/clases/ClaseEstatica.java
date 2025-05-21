package clases;

/**
 * La palabra static se puede usar para propiedades y métodos dentro de clases.
 * No se puede usar para clases principales
 */
public class ClaseEstatica {
    public static int contador = 0;
    protected static boolean bandera = false;
    static double fraccion = 1.0/3.0;
    private static String cadena = "clase estatica";

    // Propiedad no estatica
    public int normal = 10;

    // CONSTANTES SE ESCRIBEN CON 'final' Y MAYUSCULAS separadas por guion bajo '_'
    public final String TAG = "ClaseEstatica";
    protected static final int NUM_DE_CLASE = 8;

    /**
     * Las propiedades estaticas no pertenecen a una instancia especifica.
     * Pueden considerarse como "variables globales" de la Clase
     */
    ClaseEstatica() {
        aumentarContador();
    }

    /**
     * Dentro de una clase podemos acceder a propiedades estaticas sin 'this.'
     */
    public void aumentarContador() {
        contador++;
    }

    /**
     * Metodo estatico. Se pueden llamar sin instanciar un objeto.
     * Dentro de metodos estaticos solo podemos usar propiedades estaticas.
     */
    public static void cambiarBandera() {
        bandera = !bandera;
        // Esto de abajo da error porque no hay instancias en metodos estaticos
//        System.out.println(this.normal);
    }

    /**
     * Sí se pueden crear Clases Internas Estáticas
     * Pueden servir para agrupar propiedades y metodos estaticos internos
     */
    public static class ClaseEstaticaInterna {
        public int x, y;
        public static int z = 0;

        ClaseEstaticaInterna(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void imprimirCoordenadas() {
            System.out.println("(" + x + "," + y + ")");
        }
    }
}
