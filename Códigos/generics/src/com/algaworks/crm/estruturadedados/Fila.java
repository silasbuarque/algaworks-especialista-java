package com.algaworks.crm.estruturadedados;

import java.util.Arrays;

public class Fila<T> implements Colecao<T>{

    private T[] itens;

    public Fila() {
        itens = (T[]) new Object[0];
    }

    @Override
    public void colocar(T item) {
            itens = Arrays.copyOf(itens, itens.length + 1);
            itens[itens.length-1] = item;
    }

    @Override
    public T retirar() {
        if (itens.length == 0) {
            throw new ColecaoVaziaException("Fila sem itens");
        }

        T item = itens[0];
        itens = Arrays.copyOfRange(itens, 1, itens.length);

        return item;
    }
}
