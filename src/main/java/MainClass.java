import context.Calculadora;
import strategy.*;

public class MainClass {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(new Soma());
        System.out.println(calculadora.calcula(10, 5));

        calculadora.setOpera��o(new Subtracao());
        System.out.println(calculadora.calcula(10, 5));

        calculadora.setOpera��o(new Multiplicacao());
        System.out.println(calculadora.calcula(10, 5));

        calculadora.setOpera��o(new Divisao());
        System.out.println(calculadora.calcula(10, 5));

        calculadora.setOpera��o(new Resto());
        System.out.println(calculadora.calcula(10, 5));
    }

}
