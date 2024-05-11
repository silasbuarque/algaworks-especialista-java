package codigos.ConversaoStringParaObjTemporais;

import java.time.LocalTime;

public class ConversaoLocalTime {

    public static void main(String[] args) {

        LocalTime hora = LocalTime.parse("10:55:26");

        System.out.println(hora);

    }

}
