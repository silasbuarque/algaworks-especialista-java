public class Principal {

    public static void main(String[] args) {
//        System.out.println(StatusPedido.EMITIDO.ordinal());
//        System.out.println(StatusPedido.EMITIDO.name());

//        for (StatusPedido value : StatusPedido.values()) {
//            System.out.println(value.name());
//            System.out.printf("%d - %s%n ", value.ordinal(), value.name());
//        }

//        String textoStatus = "EMITIDO";
//        StatusPedido status = StatusPedido.valueOf(textoStatus);
//        System.out.printf("%d - %s%n", status.ordinal(), status.name());

        int numero = 7;
        StatusPedido status = StatusPedido.values()[numero];
        System.out.printf("%d - %s%n", status.ordinal(), status.name());


    }

}