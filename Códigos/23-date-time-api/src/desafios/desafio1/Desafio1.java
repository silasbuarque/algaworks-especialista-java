package desafios.desafio1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class Desafio1 {

    public static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final DateTimeFormatter FORMATADOR_HORA = DateTimeFormatter.ofPattern("HH:mm");
    public static final DateTimeFormatter FORMATADOR_DATA_HORA = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
            .withLocale(new Locale("pt", "BR"));

    public static void main(String[] args) {

        LocalDate dataEvendo = getDataEventoFormatado();
        LocalTime horaEvento = getHoraEvento();

        LocalDateTime dataHoraEvento = dataEvendo.atTime(horaEvento);

        exibirDataHoraEvento(dataHoraEvento);

    }

    private static LocalDate getDataEventoFormatado() {
        while (true) {
            try {
                System.out.print("Informe uma data: ");
                String dataString = SCANNER.nextLine();

                return LocalDate.parse(dataString, FORMATADOR_DATA);
            } catch (DateTimeParseException ex) {
                System.out.println("Data informada inválida");
            }
        }
    }

    private static LocalTime getHoraEvento() {
        while (true) {
            try {
                System.out.print("Informe a hora do evento: ");
                String horaEvento = SCANNER.nextLine();

                return LocalTime.parse(horaEvento, FORMATADOR_HORA);
            } catch (DateTimeParseException ex) {
                System.out.println("Informe a hora corretamente");
            }

        }
    }

    private static void exibirDataHoraEvento(LocalDateTime dataHoraEvento) {
        System.out.printf("Evento agendado para %s%n", FORMATADOR_DATA_HORA.format(dataHoraEvento));
    }

}
