package codigos.IdentificandoFusoComZoneIdEZoneOffSet;

import java.time.ZoneId;
import java.time.ZoneOffset;

public class Principal2 {

    public static void main(String[] args) {

        ZoneId offSet1 = ZoneId.of("-03:00");
        System.out.println(offSet1);
        System.out.println(offSet1.getClass());

        ZoneId offSet2 = ZoneOffset.UTC;
        System.out.println(offSet2);

        ZoneId offSet3 = ZoneOffset.of("-03:00");
        System.out.println(offSet3);

        ZoneId offSet4 = ZoneOffset.ofHours(-3);
        System.out.println(offSet4);


    }

}
