package aula_24_8;

import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) {

        Conta conta = new Conta(new BigDecimal("1000"));
        System.out.printf("Saldo inicial R$ %s%n", conta.getSaldo());

        Transacao transacao1 = conta.efetuarPagamento(new BigDecimal("100"));
        Transacao transacao2 = conta.cobrarTarifa(new BigDecimal("20"));

        System.out.printf("Transacao 1: R$ %s%n", transacao1.getValorTotal());
        System.out.printf("Transacao 2: R$ %s%n", transacao2.getValorTotal());
        System.out.printf("Saldo final: R$ %s%n", conta.getSaldo());

        transacao1.reembolsar();

        System.out.printf("Saldo apos reembolso: R$ %s%n", conta.getSaldo());

    }

}
