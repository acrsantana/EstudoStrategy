package strategy;

public class Soma implements Operação{
    @Override public float calculaOperacao(float numero1, float numero2) {
        return numero1 + numero2;
    }
}
