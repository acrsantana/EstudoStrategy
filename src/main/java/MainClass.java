import context.Calculadora;
import strategy.Resto;
import strategy.Subtracao;

public class MainClass {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(new Resto());
        System.out.println(calculadora.calcula(10, 5));

        calculadora.setOpera��o(new Subtracao());
        System.out.println(calculadora.calcula(10, 5));
    }

}
