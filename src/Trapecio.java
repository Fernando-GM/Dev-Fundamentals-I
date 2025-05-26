public class Trapecio implements Figura, Cuadrilatero {
    private int baseMayor, baseMenor, diagonal;

    protected Trapecio(int baseMayor, int baseMenor, int diagonal) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.diagonal = diagonal;
    }

    @Override
    public double altura() {
        double cateto = (baseMayor - baseMenor) / 2.0;
        // h^2 = a^2 + b^2
        // a = sqrt( h^2 - b^2 )
        return Math.sqrt(diagonal * diagonal - cateto * cateto);
    }

    @Override
    public int base() {
        return baseMayor;
    }

    @Override
    public double area() {
        return (baseMayor + baseMenor) / 2.0 * altura();
    }

    @Override
    public double perimetro() {
        return baseMayor + baseMenor + diagonal * 2;
    }
}
