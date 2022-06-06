import context.Calculadora;
import org.junit.jupiter.api.Test;
import strategy.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    private Calculadora calc = new Calculadora(new Soma());

    @Test
    void soma() {
        assertEquals(15, calc.calcula(10, 5));
        calc.setOpera��o(new Subtracao());
        assertEquals(5, calc.calcula(10, 5));
        calc.setOpera��o(new Multiplicacao());
        assertEquals(50, calc.calcula(10, 5));
        calc.setOpera��o(new Divisao());
        assertEquals(2, calc.calcula(10, 5));
        calc.setOpera��o(new Resto());
        assertEquals(0, calc.calcula(10, 5));
    }
}
