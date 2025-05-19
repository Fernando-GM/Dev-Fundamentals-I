package modelos;

class Carro {
    // 1.
    // Lista de propiedades de la Clase
    String color;
    String marca;

    // 2.
    // Constructor vacio, creado automáticamente si no hay definido otro constructor
    Carro(){}

    // Pueden haber varios constructores, mientras los parámetros sean diferentes
    Carro(String marca) {
        this.marca = marca;
        color = "Blanco";
    }

    // Constructor con dos parámetros
    Carro(String color, String marca) {
        // Usualmente los constructores se usan para inicializar las propiedades
        this.color = color;
        this.marca = marca;
    }

    // 3.
    // Lista de métodos de la Clase
    void avanzar() {
        System.out.println("Avanzar!");
    }

    double kilometrajeAnual(double total, int years) {
        return total / years;
    }

    // Para sobrecarga de métodos, solo importa el número de parámetros y el tipo de dato de los parámetros
    void info(String algo) {
        System.out.println(algo);
    }

    void info(int algo) {
        System.out.println(algo);
    }

    void info() {
        // Nos referimos a la instancia de la Clase que ha llamado este metodo. En nuestro caso seria el objeto car en Main
//        this.
        System.out.println("Carro " + color + " marca " + marca); // Podemos omitir el this
        String color = "Blanco", marca = "BMW"; // Variables locales
        System.out.println("Otro Carro " + color + " marca " + marca); // Variables locales con mismo nombre que propiedades de la clase
        System.out.println("Este Carro " + this.color + " marca " + this.marca); // Usamos el this. para acceder a propiedades o metodos de la clase
    }
}
