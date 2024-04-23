import com.algaworks.crm.Contato;

import java.util.HashSet;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {

        Set<Contato> contatos = new HashSet<>();

        System.out.println("---");
        contatos.add(new Contato("Maria", "maria@algaworks.com", 40));
        contatos.add(new Contato("Ana", "ana@algaworks.com", 30));
        contatos.add(new Contato("José", "jose@algaworks.com", 25));
        contatos.add(new Contato("Rosa", "rosa@algaworks.com", 50));
        contatos.add(new Contato("João", "joao@algaworks.com", 70));
        contatos.add(new Contato("Josefina", "josefina@algaworks.com", 70));
        contatos.add(new Contato("Siberia", "siberia@algaworks.com", 30));


        System.out.println("");
        System.out.println("");
        System.out.println("");

        boolean resultado = contatos.contains(new Contato("Silas", "silas@algaworks.com", 27));
        System.out.println(resultado);
    }

}