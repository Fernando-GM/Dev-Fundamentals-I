package separado;

import clases.ClasePublica;

/**
 * Subclase de ClasePublica.
 * Esto es el concepto de herencia que veremos en otra clase.
 */
public class Subclase extends ClasePublica {

    /**
     * Dentro de las subclases podemos acceder a propiedades y metodos protected
     * aunque estemos en un paquete distinto
     */
    public void accederProtected() {
        System.out.println(this.protegido);
        this.metodoProtegido();
    }
}
