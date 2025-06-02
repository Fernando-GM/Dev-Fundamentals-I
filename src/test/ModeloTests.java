package test;

import main.modelos.Modelo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModeloTests {

    @Test
    void testValor() {
        Modelo modelo = new Modelo();
//        Assertions.assertEquals("Valor", modelo.valor(), "Metodo valor()");
    }

    @Test
    void testBandera() {
        Modelo modelo = new Modelo();
//        Assertions.assertTrue(modelo.bandera(), "Bandera no es verdadera");

        // Asertar si dos valores son iguales
        Assertions.assertEquals(
                "Cadna;", // Valor esperado, o sea valor ejemplo a testear
                modelo.concatenarPuntoYComa("Cadena"), // Valor actual, o sea el metodo o propiedad a testear
                "Concatenación incorrecta"); // Mensaje de error cuando no se cumpla la Asercion
    }
}
