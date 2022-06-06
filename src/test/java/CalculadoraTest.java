import context.Calculadora;
import org.junit.jupiter.api.Test;
import strategy.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    private Calculadora calc = new Calculadora(new Soma());

    @Test
    void soma() {
        assertEquals(15, calc.calcula(10, 5));
        calc.setOperação(new Subtracao());
        assertEquals(5, calc.calcula(10, 5));
        calc.setOperação(new Multiplicacao());
        assertEquals(50, calc.calcula(10, 5));
        calc.setOperação(new Divisao());
        assertEquals(2, calc.calcula(10, 5));
        calc.setOperação(new Resto());
        assertEquals(0, calc.calcula(10, 5));
    }
}
