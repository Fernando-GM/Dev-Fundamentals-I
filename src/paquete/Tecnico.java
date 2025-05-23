package paquete;

public class Tecnico extends Operario {

    public Tecnico(String nombre, int numControl) {
        super(nombre);
        super.numControl = numControl;
    }

    @Override
    public String toString() {
        return super.toString() + " Tecnico con num de control #" + numControl;
    }
}
