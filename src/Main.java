import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

interface TextFieldListener {
    void textChanged(String newText);
    void onFocus();
}

class Main {
    public static void main(String[] args) {
        // Clase Anonima
        TextFieldListener listener = new TextFieldListener() {
            @Override
            public void textChanged(String newText) {
                System.out.println(newText);
            }

            @Override
            public void onFocus() {
                System.out.println("Text Field is focused");
            }
        };
//        imprimir(listener);
    }

    public static <T extends Otro & TextFieldListener> void imprimir(T param) {
        System.out.println(param);
        TextFieldListener listener = (TextFieldListener) param;
        listener.textChanged("Texto con Generics");
    }
}
abstract class Nueva {}
abstract class Otro {}

//TextField campo = new TextField();
//campo.listener = listener;

class TextField {
    TextFieldListener listener;
    void focus() {
        //
        listener.onFocus();
    }
    void changeText(String newText) {
        //
        listener.textChanged(newText);
    }
}

//    public static void main(String[] args) {
//        /*
//        Tipo de dato
//        durante
//        compilacion */
//        Animal myPig = new Pig();
//        /*                 Tipo de objeto
//                           durante ejecución*/
//        Animal myAnimal = new Animal();  // Create an Animal object
//        // Create a Pig object as Animal type
//        Animal myDog = new Dog();  // Create a Dog object as Animal type
//        Pig pig = new Pig();
////        myAnimal.animalSound();
////        myPig.animalSound();
////        myDog.animalSound();
//
//        pig.animalSound();
//        pig.pigFood();
////        myPig.pigFoog(); // Error. aunque myPig sea Pig, es de tipo Animal y tenemos que castearlo
//
//        // Downcasting
//        Pig newPig = (Pig) myPig; // Castear a una nueva variable
//        newPig.pigFood();
//        ((Pig)myPig).pigFood(); // Castear en una línea
//
//        System.out.println("Usar Polimorfismo como parametros de un metodo");
//        imprimirAnimal(myAnimal);
//        imprimirAnimal(myPig);
//        imprimirAnimal(myDog);
//
//        System.out.println("Con Estructura de Datos (Arreglos y Colecciones)");
//        Animal[] animales = {
//                myAnimal, myPig, myDog
//        };
//        for(Animal animal: animales) imprimirAnimal(animal);
//
//        // Clase Anonima. Basicamente es una Clase que implementa los abstractos durante la instanciacion del objeto y no se puede reusar
//        Mamifero tigre = new Mamifero() {
//            static int y = 0;
//            @Override
//            public boolean carnivoros() {
//                return true;
//            }
//
//            @Override
//            public boolean herviboros() {
//                return false;
//            }
//        };
//
////        Mamifero otro = new Mamifero(); // Error. No se pueden instanciar interfaces o clases abstractas directamente
//        Animal animalAnoninmo = new Animal() {
//            String propiedadAnonima;
//            static String estatico = "";
//            // Clase Interna, no vamos a poder llamar este metodo fuera
//            public void metodoAnonimo() {
//                System.out.println("Estoy en una clase normal anonima");
//                this.valor = "";
//            }
//
//            @Override
//            public void animalSound() {
//                System.out.println("Sobrescritura en una clase anonima");
//            }
//        };
//        animalAnoninmo.animalSound();
//        animalAnoninmo.valor = "";
//    }
//
//    public static void imprimirAnimal(Animal animal) {
//        System.out.println(animal.getClass());
//    }
//}
//
//interface Mamifero {
//    boolean carnivoros();
//    boolean herviboros();
//    class otro implements Mamifero {
//        @Override
//        public boolean carnivoros() {
//            return false;
//        }
//
//        @Override
//        public boolean herviboros() {
//            return false;
//        }
//    }
//}
//
////abstract class Mamifero {
////    abstract boolean carnivoros();
////    abstract boolean herviboros();
////    class otro extends Mamifero {
////        @Override
////        boolean carnivoros() {
////            return false;
////        }
////
////        @Override
////        boolean herviboros() {
////            return false;
////        }
////    }
////}
//
//
//class Animal {
//    public String valor;
//    public void animalSound() {
//        System.out.println("The animal makes a sound");
//    }
//}
//
//class Pig extends Animal {
//    //    @Override
//    public void animalSound() {
//        System.out.println("The pig says: wee wee");
//    }
//
//    public void pigFood() {
//        System.out.println("The pig eats mud");
//    }
//}
//
//class Dog extends Animal {
//    public void animalSound() {
//        System.out.println("The dog says: bow wow");
//    }
//}