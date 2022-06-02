import context.Calculadora;
import strategy.Resto;

public class MainClass {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(new Resto());
        System.out.println(calculadora.calcula(10, 6));
    }

}
