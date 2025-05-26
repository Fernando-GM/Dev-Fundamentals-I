public class Circulo implements Figura {
    private int radio;

    protected Circulo(int radio) {
        this.setRadio(radio);
    }

    @Override
    public double area() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * getRadio();
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
