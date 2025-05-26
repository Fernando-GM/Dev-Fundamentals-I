/**
 * Definicion de una Clase Abstracta
 */
public abstract class Abstracta {
    /**
     * Propiedades, constructores y metodos como clase normal...
     */
    public String valor1;
    String valor2;
    protected String valor3;
    private String valor4;

    public Abstracta(){}

    protected Abstracta(int x){}

    private Abstracta(int x, int y){}

    Abstracta(int x, int y, int z){}

    void metodoNormal(){
        System.out.println("Metodo normal");
    }

    public static void metodoEstatico(){
        System.out.println("metodo estatico");
    }

    /**
     * Metodos abstractos
     * No pueden ser private ni static
     */
    abstract public void metodoAbstracto();
    abstract protected int metodoAbstracto2(String valor);
}
