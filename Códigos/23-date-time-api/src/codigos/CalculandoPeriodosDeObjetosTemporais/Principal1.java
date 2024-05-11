package codigos.CalculandoPeriodosDeObjetosTemporais;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Principal1 {

    public static void main(String[] args) {

        LocalDate dataCompra = LocalDate.parse("2022-09-15");
        LocalDate dataEntrega = LocalDate.parse("2022-11-12");

//        Period tempoEntrega = Period.between(dataCompra, dataEntrega);
        Period tempoEntrega = dataCompra.until(dataEntrega);
        System.out.println(tempoEntrega);

        long days = dataCompra.until(dataEntrega, ChronoUnit.DAYS);
        long week = dataCompra.until(dataEntrega, ChronoUnit.WEEKS);

        System.out.println(days);
        System.out.println(week);

    }

}
