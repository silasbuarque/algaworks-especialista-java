package usando.locale;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Principal {

    public static void main(String[] args) {

//        Locale.setDefault(Locale.US);
//        Locale.setDefault(new Locale("pt","BR"));

        double a = 4_124_298.4238;
        float b = 0.3f;
        int c = -1;
        BigDecimal d = new BigDecimal("45.362");

//        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
//        NumberFormat formatador = new DecimalFormat("\u00A4 #,##0.00;(\u00A4 #,##0.00)", symbols);

        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println(formatador.format(a));
        System.out.println(formatador.format(b));
        System.out.println(formatador.format(c));
        System.out.println(formatador.format(d));

    }

}
