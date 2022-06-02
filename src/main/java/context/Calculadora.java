package context;

import strategy.Operação;

public class Calculadora {
    Operação operação;

    public Calculadora(Operação operação) {
        this.operação = operação;
    }

    public float calcula(float numero1, float numero2){
        return operação.calculaOperacao(numero1, numero2);
    }

    public void setOperação(Operação operação) {
        this.operação = operação;
    }
}
