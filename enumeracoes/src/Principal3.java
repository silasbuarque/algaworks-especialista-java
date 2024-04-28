public class Principal3 {

    public static void main(String[] args) {

        ServicoCancelamentoPedido servico = new ServicoCancelamentoPedido();

        Pedido pedido = new Pedido();
        pedido.setNomeCliente("João da Silva");
        pedido.setValorTotalPedido(90);

        servico.cancelar(pedido, TipoCliente.CLIENTE);

    }

}
