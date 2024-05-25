package codigos.ZoneDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Principal1 {

    public static void main(String[] args) {

        ZonedDateTime dataHoraFusoHorario = ZonedDateTime.now();
        ZonedDateTime dataHoraLosAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println(dataHoraFusoHorario);
        System.out.println(dataHoraLosAngeles);

        System.out.println(dataHoraFusoHorario.getOffset());
        System.out.println(dataHoraFusoHorario.getZone());

    }

}
