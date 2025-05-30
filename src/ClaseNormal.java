public class ClaseNormal extends Abstracta implements Interfaz, OtraInterfaz {
    // Propiedades
    public String propiedad;

    // Constructores
    protected ClaseNormal() {
        super();
    }

    // Interfaz
    @Override
    public void metodoAbstractoDeInterfaz() {
        System.out.println("Metodo de Interfaz");
    }

    @Override
    public int metodo2(String parametro) {
        return 0;
    }

    // OtraInterfaz
    @Override
    public void nuevoMetodo() {
        System.out.println("Metodo de otra Interfaz");
    }

    // Abstracta
    @Override
    public void metodoAbstracto() {
        System.out.println("Metodo abstracto implementado");
    }

    @Override
    protected int metodoAbstracto2(String valor) {
        System.out.println(valor);
        return 0;
    }

    // Metodos normales
    private void metodoNormalDeClaseNormal() {

    }
}


/*
@Override
public void metodoAbstracto() {

}

@Override
protected int metodoAbstracto2(String valor) {
    return 0;
}

//
@Override
public void metodoAbstractoDeInterfaz() {

}

@Override
public int metodo2(String parametro) {
    return 0;
}

void metodoNormalDeLaHija() {

}

//
@Override
public void nuevoMetodo() {

}
 */