package paquete;

public class Operario extends Empleado {
    protected int numControl;

    public Operario(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " es Operario";
    }
}
