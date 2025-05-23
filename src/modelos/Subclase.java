package modelos;

/**
 * Clase Hija que hereda de Superclase
 * IMPORTANTE: si la clase padre solo tiene un constructor sin parametros, se puede omitir el super() en
 * los constructores de la clase hija. PERO aunque se omita, por defecto se está llamando el constructor padre primero y despues el hijo
 * Testear comentando todos los constructores en Superclase excepto el de sin parámetros y comentar super(valor) en esta clase linea 25.
 * Correr con el debugger poniendo breakpoints en ambos constructores, y en el Main solo instanciar Subclase.
 * Se verificará que primero se corre el constructor de Superclase y luego el de Subclase.
 * Por eso de preferencia SIEMPRE usar super() para llamar cualquier Constructor cuando estamos usando Herencia en Java
 */
public class Subclase extends Superclase {
    String hijo;

    /**
     * Constructor de la clase hija
     * En los constructores de clases que heredan, podemos llamar constructores de la clase padre
     * usando super(), muy parecido a cuando usabamos this().
     * Y usar super() para llamar un 'constructor del padre' es obligatorio si la clase padre
     * no tiene definido un Constructor sin parámetros
     * @param valor un String
     */
    protected Subclase(String valor) {
        // Llamar constructor del padre siempre en la primera linea con super()
        super(valor);
        // Podemos usar this. para acceder a los parámetros y métodos heredados u omitir el this.
        // Tambien podemos usar super.
        this.valor = "Subclase";
        valor = "Sin this.";
        super.valor = "Propiedad heredada";
        this.metodoPadre();
        metodoPadre();
        super.metodoPadre();

        // Podemos acceder a propiedades y metodos estaticos heredados sin el this.
        contadorPadre++;
        metodoEstaticoPadre();

        // Tambien tenemos acceso a las clases internas
        Inner inner = this.new Inner();
        inner.inner = "clase interna del padre";
        InnerStatic.innerStatic = "Clase interna estatica del padre";

        // Las clases hijas pueden definir propiedades y metodos propios, accedemos con ellos como siempre
        hijo = "Propiedad solo del hijo";
        this.hijo = "";
    }

    /**
     * Metodo sobrescrito del padre para una nueva implementacion, ahora vamos a imprimir "¡Hola Mundo!"
     */
    @Override
    protected void mensaje() {
        System.out.println("¡Hola Mundo!");
        // No es obligatorio, pero con super. podemos usar la implementación original y el orden no importa
//        super.mensaje();
    }

    /**
     * Metodo propio de la clase hija, el padre no puede acceder a las propiedades y metodos definidos en sus hijos
     */
    protected void metodoHijo() {
        System.out.println("Estoy en el metodo hijo");

        // Tenemos un metodo mensaje() en la clase padre y en la clase hija fue sobrescrito, para diferenciar cual llamar usamos:
        // this. para el metodo en esta clase (la hija)
        this.mensaje();
        // super. para el metodo en la clase padre
        super.mensaje();
    }
}
