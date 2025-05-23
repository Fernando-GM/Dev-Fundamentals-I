package paquete;

public class Oficial extends Operario {

    public Oficial(String nombre, int numControl) {
        super(nombre);
        super.numControl = numControl;
    }

    @Override
    public String toString() {
        return super.toString() + " Oficial con num de control #" + numControl;
    }
}
