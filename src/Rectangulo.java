public class Rectangulo implements Figura, Cuadrilatero {
    private int ladoMayor, ladoMenor;

    protected Rectangulo(int ladoMayor, int ladoMenor) {
        this.ladoMayor = ladoMayor;
        this.ladoMenor = ladoMenor;
    }

    @Override
    public double altura() {
        return ladoMenor;
    }

    @Override
    public int base() {
        return ladoMayor;
    }

    @Override
    public double area() {
        return ladoMayor * ladoMenor;
    }

    @Override
    public double perimetro() {
        return ladoMayor * 2 + ladoMenor * 2;
    }
}
