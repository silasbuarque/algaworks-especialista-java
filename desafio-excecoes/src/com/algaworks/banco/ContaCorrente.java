package com.algaworks.banco;

import com.algaworks.excecoes.ContaInativaException;
import com.algaworks.excecoes.SaldoInsuficienteException;
import com.algaworks.excecoes.ValorSaqueMenorQueZeroException;

import java.util.Objects;

public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public void sacar(double valor) {

        if (valor <= 0) {
            throw new ValorSaqueMenorQueZeroException("O valor de saque não pode ser menor que zero");
        }

        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para fazer o saque");
        }

        if (isInativa()) {
            throw new ContaInativaException("A conta encontra-se inativa.");
        }

        this.saldo -= valor;

    }

    public void depositar(double valor) {

        if (valor <= 0) {
            throw new ValorSaqueMenorQueZeroException("O valor de saque não pode ser menor que zero");
        }

        if (isInativa()) {
            throw new ContaInativaException("A conta encontra-se inativa.");
        }

        this.saldo += valor;

    }

    public void transferir(ContaCorrente contaDestino, double valor) {

        Objects.requireNonNull(contaDestino);

        if (contaDestino.isInativa()) {
            throw new ContaInativaException("A conta destino encontra-se inativa.");
        }

        this.sacar(valor);
        contaDestino.depositar(valor);

    }


}
