package com.algaworks.loja.pagamento;

public class Transferencia implements MetodoPagamento{

    private final String agencia;
    private final String numeroConta;

    public Transferencia(String agencia, String numeroConta) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    @Override
    public void pagar(double valor) {
        if (!numeroConta.startsWith("999")) {
            new RuntimeException("Pagamento negado");
        }

        System.out.printf("Transferência de R$%.2f realizada com sucesso!%n. Agência: %s%n Conta: %s%n",
                valor, getAgencia(), getNumeroConta());

    }

}
