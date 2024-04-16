package com.algaworks.agencia;

import java.util.Objects;

public class Hotel implements Comparable<Hotel>{

    private String nome;
    private String cidade;
    private double precoDiaria;

    public Hotel(String nome, String cidade, double precoDiaria) {
        this.nome = nome;
        this.cidade = cidade;
        this.precoDiaria = precoDiaria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        Objects.requireNonNull(nome);

        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {

        if (precoDiaria < 0) {
            throw new IllegalArgumentException("Preço da diária não pode ser negativo");
        }

        this.precoDiaria = precoDiaria;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", precoDiaria=" + precoDiaria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        return Objects.equals(nome, hotel.nome);
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }

    @Override
    public int compareTo(Hotel o) {
        return getNome().compareTo(o.getNome());

//        return Double.valueOf(getPrecoDiaria()).compareTo(Double.valueOf(o.getPrecoDiaria()));

//        if (this.getPrecoDiaria() < o.getPrecoDiaria()) {
//            return -1;
//        } else if (this.getPrecoDiaria() > o.getPrecoDiaria()) {
//            return 1;
//        } else {
//            return 0;
//        }
    }
}
