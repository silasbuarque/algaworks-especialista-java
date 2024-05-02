package com.algabank;

import com.javabank.Conta;

public class TributacaoDecorator extends ContaBaseDecorator {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

    public TributacaoDecorator(Conta conta) {
        super(conta);
    }

    @Override
    public void sacar(double valor) {
        getContaOriginal().sacar(valor);
        debitarImpostoMovimentacao(valor);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        getContaOriginal().transferir(valor, contaDestino);
        debitarImpostoMovimentacao(valor);
    }

    @Override
    public void apliarEmInvestimento(double valor) {
        getContaOriginal().apliarEmInvestimento(valor);
        debitarImpostoMovimentacao(valor);
    }

    private void debitarImpostoMovimentacao(double valor) {
        getContaOriginal().sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
    }
}
