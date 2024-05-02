package com.algaworks.financeira.servicos;

import com.algaworks.financeira.model.PessoaBonificada;

public class ServicoPagamentoBonus {

    public void pagar(PessoaBonificada pessoa, double percentualMetaAlcancada) {
        double bonus = pessoa.calcularBonus(percentualMetaAlcancada);
        System.out.printf("DEBUG: Bonus pago no valor de R$ %.2f", bonus);
    }

}
