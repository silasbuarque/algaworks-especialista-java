public class Principal2 {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da silva");
        pedido.setStatus(StatusPedido.RASCUNHO);

        System.out.println(pedido.getTempoEntregaEmHoras());
    }

}
