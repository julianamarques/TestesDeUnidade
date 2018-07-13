package tests;

import junit.framework.Assert;
import models.Fracao;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;
import org.junit.jupiter.api.Test;

public class TesteFracao {

    @Test(expected = ValueException.class)
    public void nao_deve_criar_fracao_com_denominador_zero(){
        Fracao fracao = new Fracao(2,0);
    }

    @Test
    public void deve_dividir_fracao() {
        Fracao fracao1 = new Fracao(9, 2);
        Fracao fracao2 = new Fracao(7, 3);
        Assert.assertEquals("27 / 14", fracao1.dividirFracao(fracao1,fracao2));
    }

    @Test
    public void deve_multiplicar_a_fracao() {
        Fracao fracao1 = new Fracao(2, 3);
        Fracao fracao2 = new Fracao(5, 7);
        Assert.assertEquals("10 / 21", fracao1.multiplicarFracao(fracao1, fracao2));
    }

    @Test
    public void deve_somar_fracao() {
        Fracao fracao1 = new Fracao(3,6);
        Fracao fracao2 = new Fracao(6,5);
        Assert.assertEquals("27 / 10", fracao1.somarFracao(fracao1, fracao2));
    }

    @Test
    public void deve_subtrair_fracao() {
        Fracao fracao1 = new Fracao(9,3);
        Fracao fracao2 = new Fracao(5,2);
        Assert.assertEquals("3 / 6", fracao1.subtrairFracao(fracao1, fracao2));
    }

    @Test
    public void deve_calcular_mmc() {
        Fracao fracao = new Fracao(3, 12);
        Assert.assertEquals(60, fracao.calcularMMC(12, 20));
    }

    @Test
    public void deve_obter_valor_real_da_fracao() {
        Fracao fracao = new Fracao(5, 20);
        Assert.assertEquals("0.25", fracao);
    }
}