import java.util.Arrays;

// TODO: esto es un comentario TODO para marcar algo del código a hacer o completar en el futuro
public class Main {
    public static void main(String[] args) {
        ClaseNormal objetito = new ClaseNormal();
//        objetito.metodoAbstracto();
//        objetito.metodoNormal();
//        objetito.valor1 = "";
//
//        objetito.metodoAbstractoDeInterfaz();
//        objetito.nuevoMetodo();
//        objetito.metodoDefault();

        Enumeracion enumeracion = Enumeracion.valueOf("ULTIMO");

        switch (enumeracion) {
            case VALOR: {
                System.out.println("Valor");
                break;
            }
            case OTRO: {
                System.out.println("Otro");
                break;
            }
            case ULTIMO: {
                System.out.println("Ultimo");
                break;
            }
            default:
                System.out.println("Valor no valido");
        }

        System.out.println(Arrays.toString(Enumeracion.values()));
        System.out.println(enumeracion.ordinal());
    }
}