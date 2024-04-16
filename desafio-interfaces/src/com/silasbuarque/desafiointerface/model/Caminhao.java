package com.silasbuarque.desafiointerface.model;

public class Caminhao extends VeiculoAutomotor {

    private int quantidadeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {

        double valorMercado = getValorMercado() * 2.0 / 100;
        double valorEixos = getQuantidadeEixos() * 50.0;

        return valorMercado + valorEixos;
    }

    @Override
    public String descrever() {
        return String.format("Caminhão: %s, ano %d, valor de mercado R$ %.2f, %d eixos",
                getModelo(), getAnoFabricacao(), getValorMercado(), getQuantidadeEixos());
    }
}
