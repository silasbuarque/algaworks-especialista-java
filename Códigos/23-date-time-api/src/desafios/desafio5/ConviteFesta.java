package desafios.desafio5;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class ConviteFesta {

    private static final Scanner SC = new Scanner(System.in);
    public static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DateTimeFormatter FORMATADOR_HORA = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FORMATADOR = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.FULL)
            .withLocale(new Locale("pt", "BR"));

    public static void main(String[] args) {

        ZonedDateTime dataHoraLocalSaoPaulo = getZonedDateTime();
        ZonedDateTime dataHoraLosAngeles = dataHoraLocalSaoPaulo.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime dataHoraJapao = dataHoraLocalSaoPaulo.withZoneSameInstant(ZoneId.of("Japan"));

        System.out.println(FORMATADOR.format(dataHoraLocalSaoPaulo));
        System.out.println(FORMATADOR.format(dataHoraLosAngeles));
        System.out.println(FORMATADOR.format(dataHoraJapao));

    }

    private static ZonedDateTime getZonedDateTime() {
        LocalDate dataLocal = getLocalDate();
        LocalTime horaLocal = getLocalTime();
        return dataLocal.atTime(horaLocal).atZone(ZoneId.systemDefault());
    }

    private static LocalTime getLocalTime() {
        while (true) {
            try {
                System.out.print("Horário local da festa: ");
                String horaString = SC.nextLine();
                LocalTime horarioLocal = LocalTime.parse(horaString, FORMATADOR_HORA);
                return horarioLocal;
            } catch (Exception ex) {
                System.out.println("Horário inválido! Por favor, digite novamente: ");
                getLocalDate();
            }

        }
    }

    private static LocalDate getLocalDate() {
        while (true) {
            try {
                System.out.print("Data local da festa: ");
                String dataString = SC.nextLine();
                LocalDate dataLocal = LocalDate.parse(dataString, FORMATADOR_DATA);
                return dataLocal;
            } catch (Exception ex) {
                System.out.println("Data inválida! Por favor, digite novamente: ");
                getLocalDate();
            }

        }

    }

}
