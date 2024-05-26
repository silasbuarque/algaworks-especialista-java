package aula_24_4;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("João", 43);
        cliente.setStatus(Cliente.Status.BLOQUEADO);

    }

}
