package clases;

public class ClasePublica {
    // Protección de menos a más
    public String publico = "public";
    protected String protegido = "protected";
    String porDefecto = "default";
    private String privado = "private";

    /**
     * Los Constructores tambien pueden llevar modificadores de acceso
     */
    public ClasePublica(){}

    /**
     * Con comentarios de javadoc podemos documentar la funcionalidad de los parametros de metodos y constructores
     * @param x entero que no hace nada
     */
    protected ClasePublica(int x){}

    /**
     * Constructor con dos parametros y sin modificador de acceso
     * @param x entero que no hace nada
     * @param y otro entero
     */
    ClasePublica(int x, int y){}

    /**
     * Recordatorio que un Constructor privado solo puede llamarse dentro de la misma Clase
     */
    private ClasePublica(int x, int y, int z){}

    /**
     * Un metodo publico puede ser llamado desde cualquier parte del código
     */
    public void metodoPublico() {
        System.out.println(publico);
        System.out.println(protegido);
        System.out.println(porDefecto);
        System.out.println(privado);

        // Podemos llamar metodos y propiedades privadas dentro de la clase
        metodoPrivado();
    }

    /**
     * Un metodo protegido puede ser llamado desde cualquier parte del codigo en el mismo paquete
     * o de subclases en paquetes distintos
     */
    protected void metodoProtegido() {
        System.out.println(publico);
        System.out.println(protegido);
        System.out.println(porDefecto);
        System.out.println(privado);
    }

    /**
     * Un metodo sin modificador de acceso puede ser llamado desde cualqueir parte del codigo en el mismo paquete
     */
    void metodoPorDefecto() {
        System.out.println(publico);
        System.out.println(protegido);
        System.out.println(porDefecto);
        System.out.println(privado);
    }

    /**
     * Un metodo privado solo puede usarse dentro de la definición de la propia clase
     */
    private void metodoPrivado() {
        System.out.println(publico);
        System.out.println(protegido);
        System.out.println(porDefecto);
        System.out.println(privado);
    }

    /**
     * Clase Interna. La Clase principal se le llamará Clase Exterior.
     * Se usan solo si es necesario agrupar lógica en una Clase que "pertenece" a otra
     */
    public class ClaseInterna {
        public int x, y;

        ClaseInterna(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void imprimirCoordenadas() {
            System.out.println("(" + x + "," + y + ")");
            // Usar propiedad de la clase externa
            System.out.println(privado);
        }
    }
}
