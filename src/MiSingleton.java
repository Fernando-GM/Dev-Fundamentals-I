// 1. Definición de clase para Singleton
public final class MiSingleton {
    // 2. Propiedad para guardar la única instancia del Singleton
    private static MiSingleton instancia;
    private String nombre;

    // 3. Constructor privado para definir un Singleton
    private MiSingleton(){}

    // 4. Metodo publico getter para instanciar Singleton por solamente primera vez
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