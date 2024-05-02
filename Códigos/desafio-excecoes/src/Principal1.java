import com.algaworks.banco.ContaCorrente;
import com.algaworks.excecoes.BancoException;

public class Principal1 {

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente("123");

        try {
            conta1.depositar(1000);

            System.out.printf("Saldo da conta 1: %.2f\n", conta1.getSaldo());
        } catch (BancoException e) {
            throw new BancoException("Erro: ", e);
        }

    }

}
