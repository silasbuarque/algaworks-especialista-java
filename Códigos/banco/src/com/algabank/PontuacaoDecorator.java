package com.algabank;

import com.javabank.Conta;

public class PontuacaoDecorator extends ContaBaseDecorator {

    private int pontos;

    public PontuacaoDecorator(Conta conta) {
        super(conta);
    }


    public int getPontos() {
        return pontos;
    }


    @Override
    public void depositar(double valor) {
        getContaOriginal().depositar(valor);
        pontos += valor / 100;
    }

}
