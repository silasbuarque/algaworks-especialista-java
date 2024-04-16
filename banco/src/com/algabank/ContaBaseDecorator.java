package com.algabank;

import com.javabank.Conta;

import java.util.Objects;

public abstract class ContaBaseDecorator implements Conta {

    private Conta contaOriginal;

    public ContaBaseDecorator(Conta conta) {
        Objects.requireNonNull(conta);
        this.contaOriginal = conta;
    }

    public Conta getContaOriginal() {
        return contaOriginal;
    }

    @Override
    public double getSaldo() {
        return contaOriginal.getSaldo();
    }

    @Override
    public void sacar(double valor) {
        contaOriginal.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        contaOriginal.depositar(valor);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        contaOriginal.transferir(valor, destino);
    }

    @Override
    public void apliarEmInvestimento(double valor) {
        contaOriginal.apliarEmInvestimento(valor);
    }
}
