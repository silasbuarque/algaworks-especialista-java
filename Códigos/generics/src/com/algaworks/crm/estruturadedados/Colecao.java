package com.algaworks.crm.estruturadedados;

public interface Colecao<T> {

    void colocar(T item);
    T retirar();

}
