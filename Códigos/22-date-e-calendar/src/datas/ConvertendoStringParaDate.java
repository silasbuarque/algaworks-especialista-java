package datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ConvertendoStringParaDate {

    public static void main(String[] args) throws ParseException {

        String dataTexto = "30/12/2023";

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        Date data = formatador.parse(dataTexto);

        DateFormat format =  DateFormat.getDateInstance(DateFormat.SHORT, new Locale("pt", "BR"));

        System.out.println(format.format(data));

    }

}
