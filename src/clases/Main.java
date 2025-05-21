package clases;

/**
 * Esto es un comentario javadoc, para documentar código.
 * Usar '@' al inicio de la línea para poner diferentes tags
 * @author Fernando Guerrero
 * @version 1.0
 * @see <a href="https://github.com/Fernando-GM/Dev-Fundamentals-I">Repo en Github</a>
 */
public class Main {

    /**
     * Metodo main, el principio de la ejecución de código Java
     * @param args Arreglo de Strings que se usa solo cuando se ejecuta un código Java desde la terminal
     */
    public static void main(String[] args) {
        ClasePublica publica = new ClasePublica();

        // Para crear instancias de clases internas... necesitamos una instancia de la clase externa
        ClasePublica.ClaseInterna interna = publica.new ClaseInterna(-2, 5);

        ClaseDefault porDefecto = new ClaseDefault();

        ClaseEstatica estatica = new ClaseEstatica();
        // Para usar propiedades o métodos estaticos no se usa el nombre del objeto, si no el nombre de la Clase
        System.out.println(ClaseEstatica.contador);
        ClaseEstatica.cambiarBandera();

        // Para crear instancias de clases internas ESTATICAS... no necesitamos una instancia de la clase externa
        ClaseEstatica.ClaseEstaticaInterna estaticaInterna = new ClaseEstatica.ClaseEstaticaInterna(9, 8);
    }
}

