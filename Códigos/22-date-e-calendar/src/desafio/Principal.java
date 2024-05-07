package desafio;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a data da primeira parcela? ");
        String dataPrimeiraParcela = sc.nextLine();

        System.out.print("Quantas parcelas? ");
        int quantidadeParcelas = sc.nextInt();

        CalculadoraParcelas calculadoraParcelas = new CalculadoraParcelas();

        try {
            calculadoraParcelas.calcularVencimentos(dataPrimeiraParcela, quantidadeParcelas);
        } catch (ParseException e) {
            throw new RuntimeException("Data informada inválida.");
        }

    }

}
