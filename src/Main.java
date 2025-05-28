public class Main {
    public static void main(String[] args) {
        Runnable hilo = new Thread() {
            int contador = 0;
            @Override
            public void run() {
                while (true) {
                    contador++;
                    System.out.println(contador);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Runnable hilo2 = new Runnable() {
            int contador = 0;
            @Override
            public void run() {
                while (true) {
                    contador--;
                    System.out.println(contador);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
//        hilo.run();
        ((Thread)hilo).start();
        hilo2.run();
    }
}