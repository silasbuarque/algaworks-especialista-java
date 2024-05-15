package codigos.DiaDaSemana;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Principal1 {

    public static void main(String[] args) {

//        DayOfWeek diaDaSemana = DayOfWeek.MONDAY;
//        DayOfWeek diaDaSemana = DayOfWeek.of(1);
//        DayOfWeek diaDaSemana = DayOfWeek.from(LocalDate.now());
        DayOfWeek diaDaSemana = LocalDate.now().getDayOfWeek();

        System.out.println(diaDaSemana);

        System.out.println(diaDaSemana.getDisplayName(TextStyle.NARROW, new Locale("pt", "BR")));

//        System.out.println(DateTimeFormatter.ofPattern("E")
//                .withLocale(new Locale("pt", "BR"))
//                .format(diaDaSemana));
    }

}
