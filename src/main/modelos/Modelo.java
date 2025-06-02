package main.modelos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class Modelo {

    private String valor() {
        return "Valor";
    }

    public boolean bandera() {
        return true;
    }

    public String concatenarPuntoYComa(String cadena) {
        return cadena + ";";
    }

    // No lo recomiendo pero es para probar cosas privadas
    @Nested
    public class InnerTests {
        @Test
        void testValor() {
            Modelo modelo = new Modelo();
            Assertions.assertEquals("valor", modelo.valor(), "Metodo valor() privado regresa \"valor\"");
        }
    }
}
