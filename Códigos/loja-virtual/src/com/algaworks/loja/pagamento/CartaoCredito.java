package com.algaworks.loja.pagamento;

public class CartaoCredito implements MetodoPagamento {

    private final String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    @Override
    public void pagar(double valor) {
        if (!numeroCartao.startsWith("123")) {
            throw new RuntimeException("Pagamento negado!");
        }

        System.out.printf("Pagamento de R$%.2f realizado com cartão de crédito %s\n", valor, getNumeroCartao());
    }
}
