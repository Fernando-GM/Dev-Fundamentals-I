public class TrianguloIsosceles extends Triangulo {
    protected TrianguloIsosceles(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double perimetro() {
        return base + hipotenusa() * 2;
    }
}
