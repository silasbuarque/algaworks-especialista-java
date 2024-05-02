package com.algaworks.comercial;

public class Cliente {

    private String nome;
    private double limiteCompras;

    public Cliente(String nome, double limiteCompras) {
        this.nome = nome;
        this.limiteCompras = limiteCompras;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getLimiteCompras() {
        return limiteCompras;
    }
}
