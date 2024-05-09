package date.time.api.CalculandoObjetosTemporais;

import java.time.LocalDateTime;

public class CalculandoObjetosTemporais {

    public static void main(String[] args) {

        LocalDateTime dataHora = LocalDateTime.now();
        LocalDateTime semanaPassada = dataHora.minusWeeks(1);
        LocalDateTime semanaQueVem = dataHora.plusWeeks(1);

        System.out.println(dataHora);
        System.out.println(semanaPassada);
        System.out.println(semanaQueVem);

    }

}
