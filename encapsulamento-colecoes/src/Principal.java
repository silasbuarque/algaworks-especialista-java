import com.algaworks.comercial.Cliente;
import com.algaworks.comercial.ItemVenda;
import com.algaworks.comercial.Venda;

public class Principal {

    public static void main(String[] args) {

        ItemVenda mouse = new ItemVenda("Magic Mouse", 700);
        ItemVenda adaptadorUsb = new ItemVenda("Adaptador USB", 400);
        ItemVenda macbook = new ItemVenda("Macbook Pro", 15_000);
        ItemVenda limpaTela = new ItemVenda("Limpa tela", 70);

        Cliente cliente = new Cliente("João da Silva", 2_000);

        Venda venda = new Venda(cliente);
        venda.adicionarItem(mouse);
        venda.adicionarItem(adaptadorUsb);

        System.out.println(venda.getValorTotal());
        System.out.println(venda.getItens());

    }

}