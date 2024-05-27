package desafios.desafio4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.Scanner;

public class AgendarReuniao {

    private static final DateTimeFormatter formatador = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
            .withLocale(new Locale("pt", "BR"));

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ano: ");
        int ano = sc.nextInt();

        System.out.print("Mês: ");
        int mes = sc.nextInt();

        YearMonth mesAno = YearMonth.of(ano, mes);

        for (int mesfor = mesAno.getMonthValue(); mesfor <= Month.DECEMBER.getValue(); mesfor++) {

            LocalDate dataReuniao = mesAno.withMonth(mesfor).atDay(1)
                    .with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));

            imprimirDataReuniao(dataReuniao);
        }


    }

    private static void imprimirDataReuniao(LocalDate dataReuniaoFor) {
        System.out.println(dataReuniaoFor.format(formatador));
    }

}
