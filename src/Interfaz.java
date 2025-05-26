/**
 * Como las clases, solo puedes definir interfaces como public o sin modificador de acceso
 * Dentro de las interfaces, casi todos los elementos son public aunque se omita el modificador de acceso
  */
public interface Interfaz {

    /**
     * Constantes en interfaces.
     * A fuerzas son public aunque se omita.
     * A fuerzas son static aunque se omita.
     * A fuerzas se inicializan.
     * No se pueden definir propiedades normales.
     */
    String CONSTANTE = "INTERFAZ";

    /**
     * Metodos abstractos en una Interfaz.
     * Solamente pueden ser publicos, aunque el public se omita
     */
    void metodoAbstractoDeInterfaz();
    int metodo2(String parametro);
    // Recordar que los metodos abstractos terminan con punto y coma






    /**
     * Metodos normales estaticos y no estaticos en una Interfaz.
     * Solamente pueden ser public o private. Los public se pone la palabra "default" en vez de public
     * Java 8 en adelante.
     */
    default void metodoDefault() {
        System.out.println("Metodo normal, public aunque se omita");
    }

    private void metodoPrivado() {
        System.out.println("Sin default, solo se puede usar en este archivo como todo lo que es private");
    }

    static void otro() {
        System.out.println("Metodo estatico, public aunque se omita");
    }

    private static void estatico() {
        System.out.println("Metodo estatico privado, solo se puede usar aqui");
    }
}
