import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Tipo de dato de la variable
        durante
        compilacion */
        Animal myPig = new Pig();
        /*                 Tipo de objeto
                           durante ejecución*/
        Animal myAnimal = new Animal();  // Create an Animal object
        // Create a Pig object as Animal type
        Animal myDog = new Dog();  // Create a Dog object as Animal type
//        myAnimal.animalSound();
//        myPig.animalSound();
//        myDog.animalSound();


//        Pig pig = new Pig();
//        pig.animalSound();
//        pig.pigFood();
//        pig.valorCerdo = "";
//        myPig.pigFoog(); // Error. aunque myPig sea Pig, es de tipo Animal y tenemos que castearlo
//        myPig.valorCerdo = ""; // Error

        // Downcasting
//        Pig newPig = (Pig) myPig; // Castear a una nueva variable
//        newPig.pigFood();
//        newPig.valorCerdo = "";
//        ((Pig) myPig).pigFood(); // Castear en una línea
//        ((Pig) myPig).valorCerdo = "";

//        System.out.println("Usar Polimorfismo como parametros de un metodo");
//        imprimirAnimal(myAnimal);
//        imprimirAnimal(myPig);
//        imprimirAnimal(myDog);
//
//        System.out.println("Con Estructura de Datos (Arreglos y Colecciones)");
//        Animal[] animales = {
//                myAnimal, myPig, myDog
//        };
//        for (Animal animal : animales) {
//            imprimirAnimal(animal);
//        }

        // Clase Anonima. Basicamente es una Clase que implementa los abstractos durante la instanciacion del objeto y no se puede reusar
        Mamifero tigre = new Mamifero() {
            static int y = 0;
            int x = 0;

            @Override
            public boolean carnivoros() {
                x++;
                return true;
            }

            @Override
            public boolean herviboros() {
                y++;
                return false;
            }

            public boolean propioMetodo() {
                return true;
            }
        };
        imprimirMamifero(tigre);
        imprimirMamifero(new Mamifero() {
            @Override
            boolean carnivoros() {
                return false;
            }

            @Override
            boolean herviboros() {
                return false;
            }
        });
        Mamifero[] mamiferos = new Mamifero[] {
                tigre,
                new Mamifero() {
                    @Override
                    boolean carnivoros() {
                        return false;
                    }

                    @Override
                    boolean herviboros() {
                        return false;
                    }
                }
        };
    }

    public static void imprimirAnimal(Animal animal) {
        System.out.println(animal.getClass());
    }

    public static void imprimirMamifero(Mamifero mamifero) {
        System.out.println(mamifero.getClass());
    }
}


//interface Mamifero {
//    boolean carnivoros();
//    boolean herviboros();
//    class Interna implements Mamifero {
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

abstract class Mamifero {
    abstract boolean carnivoros();
    abstract boolean herviboros();
    class Interna extends Mamifero {
        @Override
        boolean carnivoros() {
            return false;
        }

        @Override
        boolean herviboros() {
            return false;
        }
    }
}


class Animal {
    public String valor;
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public String valorCerdo;
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public void pigFood() {
        System.out.println("The pig eats mud");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}