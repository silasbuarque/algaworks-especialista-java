package com.algaworks.pagamento;

public class Transferencia implements MetodoPagamento{

    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiContaBancaria()) {
            throw new RuntimeException("Beneficiario não possui conta bancária");
        }

        System.out.printf("DEBUG: Efetuando Transferencia para %s de R$ %.2f para conta bancária %s%n",
                beneficiario.getNome(), documento.getValorTotal(), beneficiario.getContaBancaria());
    }

}
