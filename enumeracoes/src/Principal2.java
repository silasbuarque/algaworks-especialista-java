public class Principal2 {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da silva");
        pedido.setValorTotalPedido(90);
        pedido.emitir();
        pedido.cancelar();


//        System.out.println(pedido.);

    }

}
