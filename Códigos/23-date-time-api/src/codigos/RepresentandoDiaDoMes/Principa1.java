package codigos.RepresentandoDiaDoMes;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class Principa1 {

    public static void main(String[] args) {

//        MonthDay diaMes = MonthDay.now();
//        MonthDay diaMes = MonthDay.of(Month.AUGUST, 18);
//        MonthDay diaMes = MonthDay.from(LocalDate.now());
        MonthDay diaMes = MonthDay.parse("--08-18");

        System.out.println(diaMes);

//        LocalDate dataAniversario = diaMes.atYear(2021);
        LocalDate dataAniversario = Year.now().atMonthDay(diaMes);

        System.out.println(dataAniversario);

    }

}
