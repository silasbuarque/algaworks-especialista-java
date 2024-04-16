package com.algaworks.contaspagar.servico;

import com.algaworks.pagamento.DocumentoPagavel;
import com.algaworks.pagamento.MetodoPagamento;
import com.algaworks.pagamento.Pix;

public class ServicoContasPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContasPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {

        metodoPagamento.pagar(documento);
    }

}
