import context.Calculadora;
import org.junit.jupiter.api.Test;
import strategy.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculadoraTest {
    private Calculadora calc = new Calculadora(new Soma());

    @Test
    void soma() {
        assertEquals(15, calc.calcula(10, 5));
    }
    @Test
    void subtracao() {
        calc.setOperação(new Subtracao());
        assertEquals(5, calc.calcula(10, 5));
    }
    @Test
    void multiplicacao() {
        calc.setOperação(new Multiplicacao());
        assertEquals(50, calc.calcula(10, 5));
    }
    @Test
    void divisao() {
        calc.setOperação(new Divisao());
        assertEquals(2, calc.calcula(10, 5));
        calc.setOperação(new Resto());
        assertEquals(0, calc.calcula(10, 5));
    }
}
