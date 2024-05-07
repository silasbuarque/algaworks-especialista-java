package datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TipoCalendar {

    public static void main(String[] args) {

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

//        Calendar calendar = Calendar.getInstance();
        Calendar calendar = new GregorianCalendar(2024, Calendar.AUGUST, 18);
        Date data = calendar.getTime();

        System.out.println(formatador.format(data));

    }

}
