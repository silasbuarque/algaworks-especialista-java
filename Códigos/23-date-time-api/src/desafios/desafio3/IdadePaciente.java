package desafios.desafio3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class IdadePaciente {

    public static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        LocalDate dataNascimento = getDataNascimento();
        Period periodoNascimento = Period.between(dataNascimento, LocalDate.now());

        imprimirTempoVidaPaciente(periodoNascimento);

    }

    private static LocalDate getDataNascimento() {
        while (true) {
            try {
                System.out.print("Informa a data de nascimento: ");
                String data = SCANNER.nextLine();

                return LocalDate.parse(data, FORMATADOR_DATA);
            } catch (Exception e) {
                System.out.println("Data errada. Por favor, digite novamente.");
            }
        }
    }

    private static void imprimirTempoVidaPaciente(Period periodoNascimento) {

        long ano = periodoNascimento.getYears();
        long mes = periodoNascimento.getMonths();
        long dia = periodoNascimento.getDays();

        String formatandoAno = ano + " " + (ano > 1L ? "anos" : "anos");
        String formatandoMes = mes + " " + (mes > 1L ? "meses" : "mes");
        String formatandoDia = dia + " " + (dia > 1L ? "dias" : "dias");

        System.out.printf("Paciente tem %s, %s e %s%n", formatandoAno, formatandoMes, formatandoDia);
    }

}
