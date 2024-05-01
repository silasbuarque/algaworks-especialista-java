package precisao;

public class ContaCorrente {

    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valorSaque) {
        if (valorSaque > this.saldo) {
            throw new RuntimeException(String.format("Saque: %s, Saldo: %s", valorSaque, saldo));
        }

        this.saldo -= valorSaque;
    }

    public double getSaldo() {
        return saldo;
    }

}
