package com.algaworks.financeira.servicos;

import com.algaworks.financeira.model.ClienteFinanciavel;

public class ServicoFinanceiro {

    public void solicitarFinanciamento(ClienteFinanciavel cliente, double valorSolicitado) {
        double limiteAprovado = cliente.calcularLimiteAprovado();
        double jurosCalculado = cliente.calcularJuros(valorSolicitado);

        if (limiteAprovado < valorSolicitado) {
            throw new RuntimeException(String.format("Financiamento não aprovado. Limite maximo de R$ %.2f", limiteAprovado));
        }

        System.out.printf("DEBUG: Financiamento aprovado de R$ %.2f com juros de %.2f. Limite máximo de R$ %.2f%n",
                valorSolicitado, jurosCalculado, limiteAprovado);

    }

    public double consultarLimiteAprovado(ClienteFinanciavel cliente) {
        return cliente.calcularLimiteAprovado();
    }

}
