import com.algaworks.crm.Cliente;
import com.algaworks.crm.ServicoCadastroCliente;

public class Principal {

    public static void main(String[] args) {

        ServicoCadastroCliente servico = new ServicoCadastroCliente();
        Cliente cliente = servico.cadastrar("João", 17);

        System.out.printf("Cliente cadastrado: %s%n", cliente.getNome());

    }

}