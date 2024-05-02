import com.algaworks.banco.ContaCorrente;
import com.algaworks.excecoes.BancoException;

public class Principal3 {

    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente("123");
        ContaCorrente conta2 = new ContaCorrente("987");

        try {
            conta1.ativar();
            conta2.ativar();

            conta1.depositar(1_000);
            conta1.transferir(conta2, 1_200);

            System.out.printf("Saldo da conta 1: %.2f%n", conta1.getSaldo());
            System.out.printf("Saldo da conta 2: %.2f%n", conta2.getSaldo());
        } catch (BancoException e) {
            throw new BancoException("Erro: ", e);
        }

    }

}
