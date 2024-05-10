package anotacoes.instant;

import java.time.Instant;
import java.util.Date;

public class ConversaoInstantDate {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        Date data = Date.from(instant);

        System.out.println(instant);
        System.out.println(data);

    }

}
