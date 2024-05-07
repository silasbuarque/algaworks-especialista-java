package desafio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculadoraParcelas {

    public void calcularVencimentos(String data, int quantidadeParcelas) throws ParseException {

        DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        Date dataPrimeiraParcela = formatador.parse(data);
        Date dataVencimento;

        for (int i = 0; i < quantidadeParcelas; i++) {

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dataPrimeiraParcela);
            calendar.add(Calendar.MONTH, i);
            dataVencimento = calendar.getTime();

            System.out.printf("Parcela #%d - %s%n", i+1, formatador.format(dataVencimento));

        }

    }

}
