package codigos.RepresentandoMesDoAno;

import java.time.Period;
import java.time.YearMonth;

public class Principal2 {

    public static void main(String[] args) {

        YearMonth anoMes = YearMonth.parse("2022-09");
        YearMonth anoMesFuturo = anoMes.plus(Period.parse("P2Y5M"));

        System.out.println(anoMesFuturo);

    }

}
