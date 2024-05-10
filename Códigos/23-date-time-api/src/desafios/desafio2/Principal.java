package desafios.desafio2;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {

        CalculadoraParcelas calculadoraParcelas = new CalculadoraParcelas();

        System.out.print("Informe a data do primeiro vencimento: ");
        String primeiroVencimento = SC.nextLine();

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = SC.nextInt();

        List<LocalDate> parcelas = calculadoraParcelas.calcular(primeiroVencimento, quantidadeParcelas);

        imprimirParcelas(parcelas);

    }

    public static void imprimirParcelas(List<LocalDate> parcelas) {

        for (int i = 0; i < parcelas.size(); i++) {
            System.out.printf("Parcela #%d - %s%n", i+1, CalculadoraParcelas.FORMATADOR_DATA.format(parcelas.get(i)));
        }

    }

}
