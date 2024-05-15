package codigos.RepresentandoMes;

import java.time.LocalDate;
import java.time.Month;

public class Principal2 {

    public static void main(String[] args) {

        Month mes = LocalDate.now().getMonth();
        Month mesCalculado = mes.plus(14);

        System.out.println(mes);
        System.out.println(mesCalculado);


    }

}
