package com.silasbuarque.desafiointerface.model;

public class ImovelResidencial implements BemSeguravel{

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * 0.001) + (getAreaConstruida() * 0.3);
    }

    @Override
    public String descrever() {
        return String.format("Imóvel residencial: valor de mercado R$ %.2f, área construída %d m²",
                getValorMercado(), getAreaConstruida());
    }
}
