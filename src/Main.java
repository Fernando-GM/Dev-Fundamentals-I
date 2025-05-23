import paquete.*;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Fernando");
        Directivo directivo = new Directivo("Samantha");
        Operario operario = new Operario("Tomás");
        Tecnico tecnico = new Tecnico("María", 98);
        Oficial oficial = new Oficial("Mario", 749);

        System.out.println(empleado);
        System.out.println(directivo);
        System.out.println(operario);
        System.out.println(tecnico);
        System.out.println(oficial);
    }
}