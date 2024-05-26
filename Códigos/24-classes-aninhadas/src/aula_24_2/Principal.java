package aula_24_2;

public class Principal {

    public static void main(String[] args) {

        ServicoEmail servicoEmail = new ServicoEmail();
        ServicoEmail.Mensagem mensagem = new ServicoEmail.Mensagem("joão@algaworks.com", "maria@algaworks.com",
                "Olá Mundo.");

        servicoEmail.enviar(mensagem);

    }

}
