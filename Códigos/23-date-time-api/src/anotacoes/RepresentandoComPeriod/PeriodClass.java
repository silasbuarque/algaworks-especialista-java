package anotacoes.RepresentandoComPeriod;

import java.time.Period;

public class PeriodClass {

    public static void main(String[] args) {

//        Period period = Period.ofDays(45);
//        Period period = Period.ofMonths(1);
//        Period period = Period.of(3, 2, 25);

        Period period = Period.parse("P2Y5M10D");
        System.out.println(period);

//        Period periodoCalculado = period.plus(Period.ofYears(10));
//        Period periodoCalculado = period.plusYears(10);
        Period periodoCalculado = period.multipliedBy(3).normalized();

        System.out.println(periodoCalculado);

        String periodoFormatado = String.format("%d anos, %d meses, %d dias",
                periodoCalculado.getYears(), periodoCalculado.getMonths(), periodoCalculado.getDays());

        System.out.println(periodoFormatado);
    }

}
