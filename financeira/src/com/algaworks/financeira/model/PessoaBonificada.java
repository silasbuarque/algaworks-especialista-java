package com.algaworks.financeira.model;

public interface PessoaBonificada extends ClienteFinanciavel {

    double calcularBonus(double percentualMetaAlcancada);

}
