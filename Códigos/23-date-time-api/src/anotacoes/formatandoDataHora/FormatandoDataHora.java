package anotacoes.formatandoDataHora;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatandoDataHora {

    public static void main(String[] args) {

        LocalDateTime dataHora = LocalDateTime.now();
//        DateTimeFormatter formatador = DateTimeFormatter.ISO_DATE_TIME;
//        DateTimeFormatter formatador = DateTimeFormatter
//                .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
//                .withLocale(new Locale("pt", "BR"));

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm:ss");


//        System.out.println(dataHora);
//        System.out.println(formatador.format(dataHora));
        System.out.println(dataHora.format(formatador));

    }

}
