package codigos.ObterCamposTemporaisEEnumChronoField;

import java.time.LocalDateTime;

public class ObterCamposTemporais {

    public static void main(String[] args) {

//        LocalDate dataVencimento = LocalDate.parse("2023-10-04");
//        System.out.println(ChronoField.DAY_OF_MONTH.getFrom(dataVencimento));
//        System.out.println(dataVencimento.getLong(ChronoField.DAY_OF_MONTH));

//        System.out.println(dataVencimento.getDayOfMonth());
//        System.out.println(dataVencimento.getYear());
//        System.out.println(dataVencimento.getMonthValue());

//        LocalTime hora = LocalTime.parse("08:10:15");
//        System.out.println(hora.getHour());
//        System.out.println(hora.getMinute());
//        System.out.println(hora.getSecond());

        LocalDateTime horaData = LocalDateTime.parse("2024-10-04T08:45:13");
        System.out.println(horaData.getHour());
        System.out.println(horaData.getDayOfMonth());

    }

}
