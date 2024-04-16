package com.javabank;

public class ContaCorrente implements Conta {

    private double saldo;

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.saldo -= valor;
        destino.depositar(valor);
    }

    @Override
    public void apliarEmInvestimento(double valor) {
        this.saldo -= valor;

        // TODO implementar lógica de investimento
    }
}
