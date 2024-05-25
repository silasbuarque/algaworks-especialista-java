package codigos.InstanciandoObjTemporaisEmFusoEspecifico;

import java.time.LocalDate;
import java.time.ZoneId;

public class Principal1 {

    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        LocalDate dataLosAngeles = LocalDate.now(ZoneId.of("America/Los_Angeles"));
        LocalDate dataJapao = LocalDate.now(ZoneId.of("Japan"));

        System.out.println(data);
        System.out.println(dataLosAngeles);
        System.out.println(dataJapao);
    }

}
