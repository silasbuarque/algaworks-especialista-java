import com.algaworks.agencia.CadastroHotel;
import com.algaworks.agencia.Hotel;

import java.util.List;
import java.util.Vector;

public class Principal {

    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivoli Eco Resort", "Praia do forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlandia/MG", 400);

//        cadastro.removerPorCidade("Fortim/CE");

        List<Hotel> hoteis = cadastro.obterTodos();

        imprimirHoteis(hoteis);

    }

    private static void imprimirHoteis(List<Hotel> hoteis) {

        for (Hotel hotel : hoteis) {
            System.out.printf("%s (%s) -> R$ %.2f%n", hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
        
    }

}