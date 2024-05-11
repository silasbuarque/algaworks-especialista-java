package codigos.RepresentandoDuration;

import java.time.Duration;

public class DurationClass {

    public static void main(String[] args) {

//        Duration duration = Duration.ofHours(2);
//        Duration duration = Duration.ofDays(2);
//        Duration duration = Duration.parse("PT5H");
        Duration duration = Duration.parse("P1DT5H");
        System.out.println(duration);

//        Duration duracao1 = Duration.ofDays(2);
//        Duration duracao2 = Duration.ofDays(1);

//        Duration resultado = duracao1.minus(duracao2);

//        System.out.println(duracao1);
//        System.out.println(duracao2);
//        System.out.println(resultado);

//        Duration calcualrDuration = duration.plus(Duration.parse("P2T3H"));
//        System.out.println(calcualrDuration);

        Duration duracaoCalculada = duration.dividedBy(2);
        System.out.println(duracaoCalculada.toHoursPart());
        System.out.println(duracaoCalculada.toMinutesPart());

    }

}
