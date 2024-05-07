package datas;

import java.util.Calendar;

public class OperacoesDeDataComCalendar {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.DAY_OF_MONTH, 20);
//        calendar.set(Calendar.MONTH, Calendar.DECEMBER);

        calendar.add(Calendar.DAY_OF_YEAR, 20);

//        int ulitmoDiaDoMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println(calendar.getTime());


    }

}
