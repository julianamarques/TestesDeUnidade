package models;

public class Fracao {
    public int numerador;
    public int denominador;

    public Fracao(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("Denominador não pode ser 0");
        }

        else {
            this.numerador = numerador;
            this.denominador = denominador;
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public String dividirFracao(Fracao fracao1, Fracao fracao2) {
        int novoNumerador = fracao1.numerador * fracao2.denominador;
        int novoDenominador = fracao1.denominador * fracao2.numerador;

        return novoNumerador + " / " + novoDenominador;
    }

    public String multiplicarFracao(Fracao fracao1, Fracao fracao2) {
        int novoNumerador = fracao1.numerador * fracao2.numerador;
        int novoDenominador = fracao1.denominador * fracao2.denominador;

        return novoNumerador + " / " + novoDenominador;
    }

    public String somarFracao(Fracao fracao1, Fracao fracao2) {
        double mmc = calcularMMC(fracao1.getDenominador(), fracao2.getDenominador());

        return (fracao1.getNumerador() + fracao2.getNumerador()) + " / " + mmc;
    }

    public String subtrairFracao(Fracao fracao1, Fracao fracao2) {
        int mmc = calcularMMC(fracao1.getDenominador(), fracao2.getDenominador());

        return (fracao1.getNumerador() - fracao2.getNumerador()) + " / " + mmc;
    }

    public String getValorReal() {
        double valorReal = this.numerador / this.denominador;

        return String.valueOf(valorReal);
    }

    public int calcularMMC(int num1, int num2) {
        int resto = 0;
        int a = num1;
        int b = num2;

        do {
            resto = a % b;

            a = b;
            b = resto;

        } while (resto != 0);

        return ( num1 * num2) / a;
    }
}
