package aula_25_6;

import java.util.Comparator;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        var cadastroCliente = new CadastroCliente();
        cadastroCliente.adicionar(new Cliente("João", 30));
        cadastroCliente.adicionar(new Cliente("Maria", 90));
        cadastroCliente.adicionar(new Cliente("Sebastião", 50));
        cadastroCliente.adicionar(new Cliente("Joaquina", 45));
        cadastroCliente.adicionar(new Cliente("Josefina", 25));

        List<Cliente> clientes = cadastroCliente.getClientes();

//        clientes.sort(new Comparator<Cliente>() {
//            @Override
//            public int compare(Cliente o1, Cliente o2) {
//                return Integer.compare(o1.getIdade(), o2.getIdade());
//            }
//        });

        clientes.sort((o1, o2) -> Integer.compare(o1.getIdade(), o2.getIdade()));

        for (Cliente cliente : clientes) {
            System.out.printf("%s - %d%n", cliente.getNome(), cliente.getIdade());
        }

    }

}
