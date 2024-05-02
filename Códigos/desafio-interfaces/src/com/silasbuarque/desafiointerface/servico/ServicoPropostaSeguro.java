package com.silasbuarque.desafiointerface.servico;

import com.silasbuarque.desafiointerface.model.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir(BemSeguravel bem) {
        System.out.println(bem.descrever());
        System.out.println("Valor do prêmio: R$ " + bem.calcularValorPremio());
    }

}
