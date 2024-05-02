package com.javabank;

public interface Conta {

    double getSaldo();

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta destino);

    void apliarEmInvestimento(double valor);

}

