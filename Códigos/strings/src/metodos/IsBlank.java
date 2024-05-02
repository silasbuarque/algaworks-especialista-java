package metodos;

public class IsBlank {

    public static void main(String[] args) {

        String nome1 = "      ";

//        System.out.println(nome1.isEmpty()); //Valida a quantidade de caracteres
        System.out.println(nome1.isBlank()); // Valida caractres + espaços em branco

    }

}
