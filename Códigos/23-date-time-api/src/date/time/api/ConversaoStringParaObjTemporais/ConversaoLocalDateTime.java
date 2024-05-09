package date.time.api.ConversaoStringParaObjTemporais;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConversaoLocalDateTime {

    public static void main(String[] args) {

//        LocalDateTime dataHora = LocalDateTime.parse("2023-10-20T10:53:32");
        LocalDateTime dataHora = LocalDateTime.parse("18/08/1996 21:53:00",
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        System.out.println(dataHora);

    }

}
