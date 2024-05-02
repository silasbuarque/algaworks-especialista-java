import com.silasbuarque.desafiointerface.model.Caminhao;
import com.silasbuarque.desafiointerface.model.CarroParticular;
import com.silasbuarque.desafiointerface.model.ImovelResidencial;
import com.silasbuarque.desafiointerface.servico.ServicoPropostaSeguro;

public class Principal {

    public static void main(String[] args) {

        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        CarroParticular carro = new CarroParticular("HR-V", 150_000, 2022);
        Caminhao caminhao = new Caminhao("Actros", 780_000, 2021, 4);
        ImovelResidencial imovel = new ImovelResidencial(2_300_000, 320);

        servicoPropostaSeguro.emitir(carro);
        servicoPropostaSeguro.emitir(caminhao);
        servicoPropostaSeguro.emitir(imovel);

    }

}