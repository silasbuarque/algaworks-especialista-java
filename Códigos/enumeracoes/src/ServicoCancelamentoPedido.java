public class ServicoCancelamentoPedido {

    public void cancelar(Pedido pedido, TipoCliente tipoCliente) {

        pedido.cancelar();

        if (TipoCliente.CLIENTE.equals(tipoCliente)) {
            System.out.println("Notificando gerente sobre cancelamento do pedido");
        }

    }

}
