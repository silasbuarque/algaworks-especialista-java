package date.time.api.ConversaoStringParaObjTemporais;

import java.time.Instant;

public class ConversaoInstant {

    public static void main(String[] args) {

//        Instant instant = Instant.parse("2010-08-20T19:45:20-00:00");
//        Instant instant = Instant.parse("2010-08-20T19:45:20Z");
        Instant instant = Instant.parse("2010-08-20T19:45:20-03:00");

        System.out.println(instant);

    }

}
