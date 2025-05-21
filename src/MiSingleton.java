public final class MiSingleton {
    private static MiSingleton instancia;
    private String nombre;

    private MiSingleton(){}

    public static MiSingleton getInstancia() {
        if (instancia == null) {
            instancia = new MiSingleton();
        }
        return instancia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}