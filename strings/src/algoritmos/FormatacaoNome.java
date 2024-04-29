package algoritmos;

public class FormatacaoNome {

    public static void main(String[] args) {

        String nome = "   Pedro da Silva da Costa de Oliveira     ";
        System.out.println(formatarNome(nome, "da", "de", "do"));

    }

    public static String formatarNome(String nome, String... preposicoesParaExclisao) {

        String novoNome = nome.strip().toUpperCase();

        for (String preposicao : preposicoesParaExclisao) {
            novoNome = novoNome.replace(" " + preposicao.toUpperCase() + " ", " ");
        }

        return novoNome;
    }

}
