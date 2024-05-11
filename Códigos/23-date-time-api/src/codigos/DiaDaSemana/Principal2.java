package codigos.DiaDaSemana;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Principal2 {

    public static void main(String[] args) {

        DayOfWeek diasDaSemana = LocalDate.now().getDayOfWeek();
        DayOfWeek diasDaSemanaSomando = diasDaSemana.plus(15);

        System.out.println(diasDaSemanaSomando);

    }

}
