package codigos.InstanciandoObjTemporaisEmFusoEspecifico;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Principal2 {

    public static void main(String[] args) {

        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");
        ZoneId fusoLosAngeles = ZoneId.of("America/Los_Angeles");
        ZoneId fusoJapao = ZoneId.of("Japan");

        LocalDateTime dataSaoPaulo = LocalDateTime.now(fusoSaoPaulo);
        LocalDateTime dataLosAngeles = LocalDateTime.now(fusoLosAngeles);
        LocalDateTime dataJapao = LocalDateTime.now(fusoJapao);

        System.out.println(dataSaoPaulo);
        System.out.println(dataLosAngeles);
        System.out.println(dataJapao);

    }

}
