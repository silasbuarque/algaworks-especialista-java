package desafios.desafio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CalculadoraParcelas {

    public static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public List<LocalDate> calcular(String data, int quantidadeParcelas) {

        LocalDate dataPrimeiraParcela = LocalDate.parse(data, FORMATADOR_DATA);

        List<LocalDate> parcelas = new ArrayList<>();

        for (int i = 0; i < quantidadeParcelas; i++) {
            LocalDate parcelaDoMes = dataPrimeiraParcela.plusMonths(i);
            parcelas.add(parcelaDoMes);
        }

        return parcelas;
    }

}
