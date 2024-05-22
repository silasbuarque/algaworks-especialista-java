package codigos.TemporalAdjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Principal1 {

    public static void main(String[] args) {

        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);

        LocalDate primeiraSegundaFeiraProximoMes = dataAtual
                .plusMonths(1)
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(primeiraSegundaFeiraProximoMes);

        LocalDate dataUltimoDiaDoMes = dataAtual.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(dataUltimoDiaDoMes);

        LocalDate proximaSextaFeira = dataAtual.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(proximaSextaFeira);
    }

}
