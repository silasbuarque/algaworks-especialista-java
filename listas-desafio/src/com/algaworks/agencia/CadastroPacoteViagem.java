package com.algaworks.agencia;

import java.util.*;

public class CadastroPacoteViagem {

    List<PacoteViagem> pacoteViagemList = new ArrayList<>();

    public void adicionar(String descricao, double precoDiaria) {

        PacoteViagem pacoteViagem = new PacoteViagem(descricao, precoDiaria);

        if (pacoteViagemList.contains(pacoteViagem)) {
            throw new PacoteViagemExisteException("O pacote de viagem informado já existe.");
        }

        pacoteViagemList.add(pacoteViagem);

    }

    public List<PacoteViagem> obterTodos() {
        return pacoteViagemList;
    }

    public void ordenar() {
        Collections.sort(pacoteViagemList);
    }

    public void ordenarPorPrecoDecrescente() {
        pacoteViagemList.sort(new PrecoPacoteComparator().reversed());
    }

    public void removerPorDescricao(String descricao) {

        boolean removido = false;
        Iterator<PacoteViagem> pacotesIterator = pacoteViagemList.iterator();

        while (pacotesIterator.hasNext()) {

            PacoteViagem pacote = pacotesIterator.next();

            if (pacote.getDescricao().equals(descricao)) {
                pacotesIterator.remove();
                removido = true;
            }

        }

        if (!removido) {
            throw new PacoteViagemNaoEncontradoException("Pacote de viagem não encontrado com descrição");
        }


    }

    public PacoteViagem buscarPorDescricao(String descricao) {

        for (PacoteViagem pacoteViagem : pacoteViagemList) {
            if (pacoteViagem.getDescricao().equals(descricao)) {
                return pacoteViagem;
            }
        }

        throw new PacoteNaoEncontradoException("Pacote do hotel não encontrado");

    }

}
