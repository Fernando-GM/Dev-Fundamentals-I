public abstract class Triangulo implements Figura {
    int base, altura;

    protected Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura / 2.0;
    }

    public double hipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }
}
