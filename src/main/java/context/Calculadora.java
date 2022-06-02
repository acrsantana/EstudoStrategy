package context;

import strategy.Opera��o;

public class Calculadora {
    Opera��o opera��o;

    public Calculadora(Opera��o opera��o) {
        this.opera��o = opera��o;
    }

    public float calcula(float numero1, float numero2){
        return opera��o.calculaOperacao(numero1, numero2);
    }

    public void setOpera��o(Opera��o opera��o) {
        this.opera��o = opera��o;
    }
}
