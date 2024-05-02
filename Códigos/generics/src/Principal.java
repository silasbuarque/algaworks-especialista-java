import com.algaworks.crm.estruturadedados.Colecao;
import com.algaworks.crm.estruturadedados.ColecaoVaziaException;
import com.algaworks.crm.estruturadedados.Fila;
import com.algaworks.crm.estruturadedados.Pilha;
import com.algaworks.crm.loja.Produto;

public class Principal {

    public static void main(String[] args) {
        Colecao<Produto> produtos = new Pilha<>();
        produtos.colocar(new Produto("Arroz"));
        produtos.colocar(new Produto("Feijão"));
        produtos.colocar(new Produto("Água de coco"));

        retirarTodos(produtos);
    }

    private static void retirarTodos(Colecao<Produto> produtos) {
        try {
            int i = 1;
            while (true) {
                Produto produto = produtos.retirar();
                System.out.printf("%d. %s%n", i, produto.getDescricao());
                i++;
            }
        } catch (ColecaoVaziaException e) {
            System.out.println("Coleção de produtos esgotada");
        }
    }

}