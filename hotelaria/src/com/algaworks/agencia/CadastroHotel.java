package com.algaworks.agencia;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {

        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) {
            throw new HotelJaExisteException("O hotel já existe");
        }

        hoteis.add(hotel);
    }

    public ArrayList<Hotel> obterTodos() {
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
