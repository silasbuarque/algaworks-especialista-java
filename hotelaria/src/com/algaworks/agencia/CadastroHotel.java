package com.algaworks.agencia;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class CadastroHotel {

    private final Vector<Hotel> hoteis = new Vector<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {

        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) {
            throw new HotelJaExisteException("O hotel já existe");
        }

        hoteis.add(hotel);
    }

    public Vector<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerPorCidade(String cidade) {

        Iterator<Hotel> hotelIterator = hoteis.iterator();

        while (hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();

            if (hotel.getCidade().equals(cidade)) {
                hotelIterator.remove();
            }

        }

    }

    public void remover(Hotel hotel) {

        boolean hotelEncontrado = hoteis.remove(hotel);

        if (!hotelEncontrado) {
            throw new HotelNaoEncontradoException("Hotel não encontrado para remoção");
        }

    }

}
