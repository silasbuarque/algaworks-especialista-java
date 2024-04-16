import com.algaworks.loja.Carrinho;
import com.algaworks.loja.ItemCarrinho;
import com.algaworks.loja.pagamento.CartaoCredito;
import com.algaworks.loja.pagamento.MetodoPagamento;
import com.algaworks.loja.pagamento.Transferencia;

public class Principal {

    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new ItemCarrinho("AirPods", 2_000.00));
        carrinho.adicionarItem(new ItemCarrinho("Apple Watch", 5_100.00));
        carrinho.adicionarItem(new ItemCarrinho("MagicMouse", 600.00));

//        MetodoPagamento metodoPagamento = new CartaoCredito("123123123");
        MetodoPagamento metodoPagamento = new Transferencia("9999", "1231231231");

        carrinho.finalizar(metodoPagamento);

    }

}