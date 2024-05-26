package Aula_24_2;

public class ServicoEmail {

    public void enviar(Mensagem mensagem) {
        System.out.printf("Enviando de %s para %s: %s%n",
                mensagem.getRemetente(), mensagem.getDestinatario(), mensagem.getTexto());
    }

    public static class Mensagem {

        private final String remetente;
        private final String destinatario;
        private final String texto;

        public Mensagem(String remetente, String destinatario, String texto) {
            this.remetente = remetente;
            this.destinatario = destinatario;
            this.texto = texto;
        }

        public String getRemetente() {
            return remetente;
        }

        public String getDestinatario() {
            return destinatario;
        }

        public String getTexto() {
            return texto;
        }
    }

}
