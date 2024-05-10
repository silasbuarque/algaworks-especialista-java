package anotacoes.AlterandoObjetosTemporaisComWith;

import java.time.LocalDateTime;

public class AlterandoObjTemporalComWith {

    public static void main(String[] args) {

        LocalDateTime dataHoraAgora = LocalDateTime.now();
//        LocalDateTime dataNova = dataHoraAgora.with(ChronoField.DAY_OF_MONTH, 15);
        LocalDateTime dataNova = dataHoraAgora.withDayOfMonth(12)
                .withHour(23)
                .withSecond(0)
                .withMinute(0);

        System.out.println(dataHoraAgora);
        System.out.println(dataNova);

    }

}
