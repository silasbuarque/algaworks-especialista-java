package anotacoes.instant;

import java.time.Instant;
import java.util.Date;

public class ConversaoDateInstant {

    public static void main(String[] args) {

        Date data = new Date();
        Instant instant = data.toInstant();

        System.out.println(instant);

    }

}
