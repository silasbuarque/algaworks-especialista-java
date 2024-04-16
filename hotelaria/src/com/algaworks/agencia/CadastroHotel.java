package com.algaworks.agencia;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CadastroHotel {

    private final LinkedList<Hotel> hoteis = new LinkedList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {

        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) {
            throw new HotelJaExisteException("O hotel já existe");
        }

        hoteis.add(hotel);
    }

    public LinkedList<Hotel> obterTodos() {
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
