package anotacoes.CalculandoPeriodosDeObjetosTemporais;

import java.time.LocalDate;
import java.time.Period;

public class Principal2 {

    public static void main(String[] args) {

        Period period = Period.parse("P1M5D");
        LocalDate hoje = LocalDate.now();

        LocalDate dataPrevistaEntrega = hoje.plus(period);

        System.out.println(dataPrevistaEntrega);


    }

}
