import com.algaworks.financeira.model.Fazenda;
import com.algaworks.financeira.model.Funcionario;
import com.algaworks.financeira.model.Industria;
import com.algaworks.financeira.model.ParceiroFinanceiro;
import com.algaworks.financeira.servicos.ServicoFinanceiro;

public class Principal1 {

    public static void main(String[] args) {

        var servicoFinanciamento = new ServicoFinanceiro();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 900_000, true);
        var parceiro = new ParceiroFinanceiro("Capital ABC", 2_000_000);
        var funcionario = new Funcionario("João da Silva", 18_000);



//        servicoFinanciamento.solicitarFinanciamento(funcionario, 90_000);
//        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
//        servicoFinanciamento.solicitarFinanciamento(industria, 500_000);

    }

}
