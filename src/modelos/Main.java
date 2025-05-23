package modelos;

public class Main {
    public static void main(String[] args) {
        Superclase superclase = new Superclase("Superclase");
        Subclase subclase = new Subclase("Java");
        Subclase subclase2 = new Subclase("otra");

        System.out.println(subclase);
        if (subclase.getClass() == superclase.getClass()) {
            System.out.println("Mismas clases");
        }

        superclase.valor = "";
        superclase.metodoPadre();

        subclase.valor = "";
        subclase.metodoPadre();
        subclase.hijo = "";
        subclase.metodoHijo();

        superclase.mensaje();
        subclase.mensaje();
        subclase.metodoHijo();

        /**
         * Lo comentado de abajo será visto el Lunes, no es necesario para la Tarea 9
         */
//        // Tambien podemos crear una instancia de la Clase padre usando un Constructor de la Clase Hija
//        // El uso de esto se verá en otra sesión
//        Superclase subclase2 = new Subclase("Es subclase pero esta instanciado como superclase?");
//
////        System.out.println("GETCLASS = " + superclase.getClass());
//
//        // Castear de Hijo a Padre sí se puede
//        Superclase casteado = (Superclase) subclase;
//        // Castear de Padre a Hijo no se puede y genera una excepción
//        try {
//            Subclase casteado2 = (Subclase) superclase;
//        } catch (ClassCastException ex) {
////            ex.printStackTrace();
//        }
//        // a menos que la instancia sea de tipo de dato de la Clase Padre PERO se use un Constructor de la Clase Hija
//        Subclase casteado3 = (Subclase) subclase2;
//
////        System.out.println("GETCLASS = " + casteado3.getClass());
    }
}