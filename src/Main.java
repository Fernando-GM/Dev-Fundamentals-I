public class Main {
    public static void main(String[] args) {
        MiSingleton singleton = MiSingleton.getInstancia();
        singleton.setNombre("Fernando Guerrrero Montero");
        System.out.println(singleton.getNombre());

        MiSingleton singleton2 = MiSingleton.getInstancia();
        System.out.println(singleton2.getNombre());
        singleton.setNombre("El nombre de mi novia inexistente");

        System.out.println("*************************************");
        System.out.println(singleton.getNombre());
        System.out.println(singleton2.getNombre());
    }
}