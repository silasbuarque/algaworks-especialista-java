import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws ParseException {


        String valorEmDolar = "1,300.10";
        String valorEmReais = "5,34";

        DecimalFormatSymbols symbolsAmericano = new DecimalFormatSymbols(Locale.US);
        DecimalFormat formatadorDolar = new DecimalFormat("#,##0.00", symbolsAmericano);
        formatadorDolar.setParseBigDecimal(true);

        BigDecimal valorAmericano = (BigDecimal) formatadorDolar.parse(valorEmDolar);

        DecimalFormatSymbols symbolsBrasileiro = new DecimalFormatSymbols(new Locale("pt", "BR"));
        DecimalFormat formatadorReal = new DecimalFormat("#,##0.00", symbolsBrasileiro);
        formatadorReal.setParseBigDecimal(true);

        BigDecimal valorBrasileiro = (BigDecimal) formatadorReal.parse(valorEmReais);

        BigDecimal conversao = valorBrasileiro.multiply(valorAmericano);

        DecimalFormat formatador = new DecimalFormat("\u00A4 #,##0.00", symbolsBrasileiro);

        System.out.println(formatador.format(conversao));

    }
}