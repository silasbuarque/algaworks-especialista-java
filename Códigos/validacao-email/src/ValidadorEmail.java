public class ValidadorEmail {

    public static boolean validar(String email) {

        if (email.isEmpty() || email.isBlank() || !email.contains("@")) {
            return false;
        }

        return validaNomeUsuario(email) && validaDominio(email) && validaSufixo(email);
    }

    private static boolean validaNomeUsuario(String email) {
        String usuarioFormatado = getNomeUsuario(email);

        if (usuarioFormatado.isEmpty()) {
            return false;
        }

        for (int i = 0; i < usuarioFormatado.length(); i++) {
            char c = usuarioFormatado.charAt(i);
            if (!validaLetra(c) && !validaDigito(c) && validaCaracteresEspeciaisNomeUsuario(c)) {
                return false;
            }
        }

        return true;
    }

    private static boolean validaDominio(String emailFormatado) {
        String dominioFormatado = getDominioFormatado(emailFormatado);

        if (dominioFormatado.isEmpty()) {
            return false;
        }

        for (int i = 0; i < dominioFormatado.length(); i++) {
            char c = dominioFormatado.charAt(i);

            if (isUpperCase(c)) {
                return false;
            }

            if (!validaLetra(c) && !validaDigito(c) &&
                    validaIfen(c) && validaPonto(c)) {
                return false;
            }
        }

        return true;
    }

    private static boolean validaSufixo(String emailFormatado) {
        String sufixoFormatado = getSufixoFormatado(emailFormatado);

        if ((sufixoFormatado.isBlank() || sufixoFormatado.isEmpty())
                || (sufixoFormatado.length() < 2 || sufixoFormatado.length() > 3)) {
            return false;
        }

        for (int i = 0; i < sufixoFormatado.length(); i++) {
            char c = sufixoFormatado.charAt(i);

            if (!Character.isLowerCase(c) || !validaLetra(c)) {
                return false;
            }
        }

        return true;

    }
    private static String getNomeUsuario(String email) {
        return email.substring(0, email.indexOf("@"));
    }

    private static String getDominioFormatado(String emailFormatado) {
        int dominioPrimeiroIndex = emailFormatado.indexOf("@");
        int dominioUltimoIndex = emailFormatado.lastIndexOf(".");

        if (dominioUltimoIndex <= 0 || (dominioPrimeiroIndex > dominioUltimoIndex)) {
            return "";
        }

        String dominio = emailFormatado.substring(dominioPrimeiroIndex + 1, dominioUltimoIndex);
        return dominio;
    }

    private static String getSufixoFormatado(String emailFormatado) {
        return emailFormatado.substring(emailFormatado.lastIndexOf(".") + 1);
    }

    private static boolean validaCaracteresEspeciaisNomeUsuario(char c) {
        return validaIfen(c) && validaUndescore(c) && validaPonto(c);
    }

    private static boolean validaDigito(char c) {
        return Character.isDigit(c);
    }

    private static boolean validaLetra(char c) {
        return Character.isLetter(c);
    }

    private static boolean isUpperCase(char c) {
        return Character.isUpperCase(c);
    }

    private static boolean validaPonto(char c) {
        return c != '.';
    }

    private static boolean validaUndescore(char c) {
        return c != '_';
    }

    private static boolean validaIfen(char c) {
        return c != '-';
    }


}
