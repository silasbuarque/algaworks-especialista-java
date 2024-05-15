package codigos.RepresentandoMes;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Principal1 {

    public static void main(String[] args) {
//        LocalDate dataNascimento = LocalDate.parse("1996-08-18");
        LocalDate dataNascimento = LocalDate.of(1995, Month.AUGUST, 18);

//        Month mes = Month.AUGUST;
//        Month mes = Month.of(8);
//        Month mes = Month.from(dataNascimento);
        Month mes = dataNascimento.getMonth();
        System.out.println(mes);

//        System.out.println(mes.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));

        System.out.println(DateTimeFormatter.ofPattern("MMMM")
                .withLocale(new Locale("pt", "BR"))
                .format(mes));
    }

}
