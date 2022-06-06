import context.Calculadora;
import strategy.*;

public class MainClass {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(new Soma());
        System.out.println(calculadora.calcula(10, 5));

        calculadora.setOperação(new Subtracao());
        System.out.println(calculadora.calcula(10, 5));

        calculadora.setOperação(new Multiplicacao());
        System.out.println(calculadora.calcula(10, 5));

        calculadora.setOperação(new Divisao());
        System.out.println(calculadora.calcula(10, 5));

        calculadora.setOperação(new Resto());
        System.out.println(calculadora.calcula(10, 5));
    }

}
