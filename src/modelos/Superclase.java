package modelos;

public class Superclase {
    String valor;
    static int contadorPadre = 0;

    /**
     * Constructor de la Clase Padre con un parámetro
     * @param valor un String
     */
    protected Superclase(String valor) {
        // usamos this. para acceder a las propiedades de esta Clase
        this.valor = valor;
    }

    /**
     * Constructor sin parámetros
     * Si la clase padre no tiene un Constructor definido sin parámetros
     * la clase hija debe llamar en todos sus Constructores
     * cualquier Constructor de la clase padre a fuerzas
     * @see Subclase Constructor de Subclase
     */
    protected Superclase(){
        this.valor = "hola";
    }

    /**
     * Constructor extra con dos parámetros
     */
//    Superclase(int x, int y) {}

    /**
     * Las clase hijas no tienen acceso a las cosas privadas
     * Si se va a usar herencia, el único constructor no puede ser private porque la clase hija tiene que llamarlo.
     */
//    private Superclase() {
//        // Recordatorio que se puede llamar un constructor dentro de otro usando this
//        this("Constructor privado");
//    }

    /**
     * Metodo de la Clase Padre
     */
    protected void metodoPadre() {
        System.out.println("Metodo de la Clase Padre");
    }

    /**
     * Metodo estatico de la Clase Padre
     */
    protected static void metodoEstaticoPadre() {
        System.out.println("Metodo estatico de la Clase Padre");
    }

    protected class Inner {
        protected String inner;
    }

    protected static class InnerStatic {
        protected static String innerStatic;
    }

    /**
     * Metodo padre que imprime "Hello World!", lo vamos a sobrescribir en Subclase
     * @see Subclase
     */
    protected void mensaje() {
        System.out.println("Hello World!");
    }

    /**
     * No podemos sobrescribir metodos privados
     */
    private void metodoPrivado() {
        System.out.println("Metodo privado del padre");
    }

    /**
     * Tampoco podemos sobrescribir metodos finales ni metodos estaticos
     */
    protected final void metodoFinal() {
        System.out.println("Metodo final");
    }
}
