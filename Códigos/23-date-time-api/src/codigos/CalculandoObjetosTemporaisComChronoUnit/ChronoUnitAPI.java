package codigos.CalculandoObjetosTemporaisComChronoUnit;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ChronoUnitAPI {

    public static void main(String[] args) {

        LocalDate agora = LocalDate.now();
        LocalDate proximaData = agora.plus(30, ChronoUnit.DAYS);
        LocalDate decadaPassada = agora.minus(3, ChronoUnit.DECADES);

        System.out.println(agora);
        System.out.println(proximaData);
        System.out.println(decadaPassada);

    }

}
