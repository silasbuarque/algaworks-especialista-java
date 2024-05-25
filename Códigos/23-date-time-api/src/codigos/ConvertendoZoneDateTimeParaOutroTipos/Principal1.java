package codigos.ConvertendoZoneDateTimeParaOutroTipos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Principal1 {

    public static void main(String[] args) {

        ZonedDateTime dataHoraFusoHorarioPadrao = ZonedDateTime.now();

        LocalDateTime dataHora = dataHoraFusoHorarioPadrao.toLocalDateTime();
        LocalDate data = dataHoraFusoHorarioPadrao.toLocalDate();

        System.out.println(dataHoraFusoHorarioPadrao);
        System.out.println(dataHora);
        System.out.println(data);

    }

}
