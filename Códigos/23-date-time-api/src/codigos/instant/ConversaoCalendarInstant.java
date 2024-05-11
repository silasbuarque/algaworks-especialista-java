package codigos.instant;

import java.time.Instant;
import java.util.Calendar;

public class ConversaoCalendarInstant {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Instant instant = calendar.toInstant();

        System.out.println(instant);

    }

}
