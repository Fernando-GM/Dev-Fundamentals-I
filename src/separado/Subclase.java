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
//        System.out.println(this.porDefecto); // Esto da error porque dentro de las subclases solo tenemos acceso a public y protected
        this.metodoProtegido();
    }
}
