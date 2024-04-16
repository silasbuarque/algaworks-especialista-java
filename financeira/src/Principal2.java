import com.algaworks.financeira.model.ClienteFinanciavel;
import com.algaworks.financeira.model.Funcionario;

public class Principal2 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João da Silva", 18_000);
        funcionario.calcularBonus(10);

    }

}
