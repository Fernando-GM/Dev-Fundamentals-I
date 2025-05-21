package separado;

//import clases.ClaseDefault;
import clases.ClasePublica;

/**
 * Clase Main para este segundo paquete.
 * Si descomentamos las lineas de clases.ClaseDefault
 * nos dará error porque no tenemos acceso a esa clase en este paquete diferente
 * @see clases.Main
 */
public class Main {
    public static void main(String[] args) {
        ClasePublica publica = new ClasePublica();
//        ClaseDefault porDefecto = new ClaseDefault();
        Subclase subclase = new Subclase();
    }
}