package strategy;

public class Divisao implements Operação{
    @Override public float calculaOperacao(float numero1, float numero2) {
        return numero1 / numero2;
    }
}
