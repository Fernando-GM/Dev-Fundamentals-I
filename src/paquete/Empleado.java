package paquete;

public class Empleado {
    private final String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre;
    }
}
