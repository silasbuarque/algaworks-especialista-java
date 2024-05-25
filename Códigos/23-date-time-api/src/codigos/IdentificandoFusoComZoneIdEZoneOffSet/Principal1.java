package codigos.IdentificandoFusoComZoneIdEZoneOffSet;

import java.time.ZoneId;

public class Principal1 {

    public static void main(String[] args) {

        ZoneId zona1 = ZoneId.systemDefault();
        System.out.println(zona1);
        System.out.println(zona1.getClass());

        ZoneId zona2 = ZoneId.of("America/Sao_Paulo");
        System.out.println(zona2);
        System.out.println(zona2.getClass());

        for (String zona : ZoneId.getAvailableZoneIds()) {
            System.out.println(zona);
        }

    }

}
