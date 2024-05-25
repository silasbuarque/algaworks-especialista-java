package desafios.desafio4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class AgendarReuniao {

    private static final DateTimeFormatter formatador = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
            .withLocale(new Locale("pt", "BR"));
    public static final TemporalAdjuster PRIMEIRA_SEGUNDA_MES = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ano: ");
        int ano = sc.nextInt();

        System.out.print("Mês: ");
        int mes = sc.nextInt();

        YearMonth mesAno = YearMonth.of(ano, mes);

        LocalDate dataReuniao = montaData(mesAno);

        imprimirDataReuniao(dataReuniao);

        for (int i = mes; i <= 12; i++) {

            LocalDate dataReuniaoFor = montaDataReunião(dataReuniao);

            imprimirDataReuniao(dataReuniaoFor);

            if (validacaoMesDezembro(dataReuniaoFor)) return;
        }


    }

    private static LocalDate montaDataReunião(LocalDate dataReuniao) {
        LocalDate dataReuniaoFor = dataReuniao
                .plusMonths(1)
                .with(PRIMEIRA_SEGUNDA_MES);
        return dataReuniaoFor;
    }

    private static LocalDate montaData(YearMonth mesAno) {
        LocalDate dataReuniao = mesAno
                .atDay(1)
                .with(PRIMEIRA_SEGUNDA_MES);
        return dataReuniao;
    }

    private static void imprimirDataReuniao(LocalDate dataReuniaoFor) {
        System.out.println(dataReuniaoFor.format(formatador));
    }

    private static boolean validacaoMesDezembro(LocalDate dataReuniaoFor) {
        return dataReuniaoFor.getMonth().equals(Month.DECEMBER);
    }

}
