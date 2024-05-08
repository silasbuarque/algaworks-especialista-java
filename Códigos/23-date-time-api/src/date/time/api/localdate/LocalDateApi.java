package date.time.api.localdate;

import java.time.LocalDate;

public class LocalDateApi {

    public static void main(String[] args) {

//        LocalDate dataHoje = LocalDate.now();
//        System.out.println(dataHoje);

//        LocalDate dataNascimento = LocalDate.of(1981, 9, 13);
//        System.out.println(dataNascimento);

        LocalDate diaDoProgramador = LocalDate.ofYearDay(2024, 256);
        System.out.println(diaDoProgramador);

    }

}
