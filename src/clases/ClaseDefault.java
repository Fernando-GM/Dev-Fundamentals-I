package clases;

/**
 * Una Clase principal solo puede definirse como public o sin modificador de acceso.
 * Una Clase sin modificador de acceso solo puede usarse por otras clases dentro del mismo paquete.
 * @see separado.Main
 */
class ClaseDefault {

    // Propiedad donde guardaremos una instancia de la clase interna privada
    ClasePrivada clasePrivada = new ClasePrivada();

    void usar() {
        clasePrivada.interno = "Puedo acceder a propiedades y metodos de una clase privada interna solo en la clase exterior";
        clasePrivada.mensaje();
    }

    /**
     * Las Clases internas pueden declararse con cualquier modificador de acceso.
     * Y se siguen respetando las reglas dadas.
     */
    private class ClasePrivada {
        String interno = "";

        void mensaje() {
            System.out.println("Estoy en una clase privada interna");
        }
    }
}
