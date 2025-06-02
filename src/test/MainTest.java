package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import main.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MainTest {

//    static Main calculator;
//    @BeforeAll
//    static void setup() {
//        calculator = new Main();
//    }

//    @Test
////    @DisplayName("1 + 1 = 2")
//    void addsTwoNumbers() {
//        Main calculator = new Main();
//        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
//    }

    @Test
    @DisplayName("Suma")
    void addTest() {
        Main calculator = new Main();
        int result = calculator.add(4, 5);
        // Primero el valor esperado
        // Segundo el valor a probar (Metodo de la Clase a probar)
        // Tercero mensaje de error opcional
        Assertions.assertEquals(10, result, "La suma no fue correcta");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void add(int first, int second, int expectedResult) {
        Main calculator = new Main();
        assertEquals(expectedResult, calculator.add(first, second), first + " + " + second + " should equal " + expectedResult);
//                () -> first + " + " + second + " should equal " + expectedResult);
    }
}
