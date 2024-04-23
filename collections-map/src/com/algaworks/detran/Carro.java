package com.algaworks.detran;

import java.util.Objects;

public class Carro implements Comparable<Carro>{

    private final String placa;
    private final String modelo;

    public Carro(String placa, String modelo) {

        Objects.nonNull(placa);
        Objects.nonNull(modelo);

        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(placa, carro.placa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }

    @Override
    public int compareTo(Carro o) {
        return getPlaca().compareTo(o.getPlaca());
    }
}