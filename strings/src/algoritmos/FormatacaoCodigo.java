package algoritmos;

public class FormatacaoCodigo {

    public static void main(String[] args) {
        // 000000123 - 10 caracteres
        int codigo = 123;

        String codigoFormatado = formatandoInt(String.valueOf(codigo), '0',10);
        System.out.println(codigoFormatado);
    }

    private static String formatandoInt(String texto, char caracter, int tamanhoTotal) {
        if (texto.length() >= tamanhoTotal) {
            return texto;
        }

        return String.valueOf(caracter).repeat(tamanhoTotal - texto.length()) + texto;
    }

}
