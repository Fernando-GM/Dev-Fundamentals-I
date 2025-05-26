public enum Enumeracion {
    VALOR, OTRO, ULTIMO;

//    VALOR_CONSTRUCTOR(""),
//    OTRO("");

//    VALOR_ABSTRACTO {
//        @Override
//        void metodoAbstracto() {
//            System.out.println("Metodo abstracto en un Enum");
//        }
//    },
//    OTRO {
//        @Override
//        void metodoAbstracto() {
//            System.out.println("Otro");
//        }
//    };

    public String propiedad = "";

    public void metodoNormal(){
        switch (this) {
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
    }

    public static void metodoEstatico(){}

//    Enumeracion(String parametro) {
//        this.propiedad = parametro;
//    }

//    abstract void metodoAbstracto();
}
