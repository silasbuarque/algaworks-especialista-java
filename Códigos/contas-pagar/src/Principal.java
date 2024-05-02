import com.algaworks.contaspagar.modelo.Holerite;
import com.algaworks.contaspagar.modelo.OrdemServico;
import com.algaworks.contaspagar.servico.ServicoContasPagar;
import com.algaworks.pagamento.Beneficiario;
import com.algaworks.pagamento.MetodoPagamento;
import com.algaworks.pagamento.Pix;
import com.algaworks.pagamento.Transferencia;

public class Principal {

    public static void main(String[] args) {

        ServicoContasPagar servicoContasPagar = new ServicoContasPagar(new Pix());

        Beneficiario funcionario = new Beneficiario("João da Silva", "123123123", "123123123");
        Holerite holerite = new Holerite(funcionario, 100, 168);

        Beneficiario fornecedor = new Beneficiario("Consultoria xyz", "123123123", "123123123");
        OrdemServico os = new OrdemServico(fornecedor, 65_500);

        servicoContasPagar.pagar(holerite);
        servicoContasPagar.pagar(os);

    }

}
