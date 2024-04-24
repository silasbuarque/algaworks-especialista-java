package com.algaworks.comercial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venda {

    private final Cliente cliente;
    private final List<ItemVenda> itens = new ArrayList<>();
    private double valorTotal;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemVenda> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void adicionarItem(ItemVenda itemVenda) {

        if (excedeLimiteDeCompra(itemVenda)) {
            throw new LimiteDeCompraExcedidoException(
                    String.format("Limite atual: %.2f", cliente.getLimiteCompras()));
        }

        valorTotal += itemVenda.getValor();
        itens.add(itemVenda);
    }

    private boolean excedeLimiteDeCompra(ItemVenda itemVenda) {
        return valorTotal + itemVenda.getValor() > getCliente().getLimiteCompras();
    }

}
