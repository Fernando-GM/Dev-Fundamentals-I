public class Main {
    /**
     * Vamos a recrear uno de los patrones de diseño más comunes usando
     * Encapsulamiento: el patrón Singleton. Un objeto Singleton es la única instancia
     * que puede existir de una Clase en específico.
     * 1. Definir una nueva clase así: "public final class MiSingleton" (final se usa aquí
     * en clases para evitar que se creen subclases)
     * 2. Definir una propiedad privada estatica del tipo de dato MiSingleton (la
     * propia clase), usualmente con el nombre de instance (instancia)
     * 3. Definir un único Constructor privado vacío
     * 4. Definir un metodo publico estatico para obtener la propiedad privada del
     * paso 2 (Un getter, no un Setter)
     * o Si la propiedad no ha sido inicializada, la inicializamos en este metodo
     * llamando el constructor del paso 3
     * o Si la propiedad ya ha sido inicializada, retorna la instancia
     * Para hacer pruebas en el Main, creen nuevas propiedas y/o metodos publicos
     * no estaticos en MiSingleton. Para intentar acceder a ellos, solo pueden
     * lograrlo mediante el getter del paso 4
     */
    public static void main(String[] args) {
        MiSingleton singleton = MiSingleton.getInstancia(); // Obtener instancia de Singleton, primera vez instancia el Singleton
        singleton.setNombre("Fernando Guerrrero Montero");
        System.out.println(singleton.getNombre());

        MiSingleton singleton2 = MiSingleton.getInstancia(); // Obtener misma instancia en una segunda variable
        System.out.println(singleton2.getNombre()); // Comprobar que la propiedad del Singleton es igual para ambas variables
        singleton.setNombre("Lalo");

        // Verificación que ambas variables imprimen el mismo nombre después de ser cambiado usando solo una variable
        System.out.println("*************************************");
        System.out.println(singleton.getNombre());
        System.out.println(singleton2.getNombre());
    }
}