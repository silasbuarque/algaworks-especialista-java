package com.silasbuarque.desafiointerface.model;

public class CarroParticular extends VeiculoAutomotor{

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {

        double valorMercado = getValorMercado() * 0.4;

        if (getAnoFabricacao() < 2000) {
            valorMercado *=  1.05;
        }

        return valorMercado;
    }

    @Override
    public String descrever() {
        return String.format("Carro particular: %s, ano %d, valor de mercado R$ %.2f",
                getModelo(), getAnoFabricacao(), getValorMercado());
    }
}
