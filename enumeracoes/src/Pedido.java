public class Pedido {

    private String nomeCliente;
    private double valorTotalPedido;
    private StatusPedido status = StatusPedido.RASCUNHO;
    private OrigemPedido origem = OrigemPedido.BALCAO;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

//    public void setStatus(StatusPedido status) {
//        this.status = status;
//    }

    public OrigemPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemPedido origem) {
        this.origem = origem;
    }

    public int getTempoEntregaEmHoras() {
        return status.getTempoEntregaEmHoras();
    }

    public double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void marcarComoEntregue() {
        this.status = StatusPedido.ENTREGUE;
    }

    public void emitir() {
        this.status = StatusPedido.EMITIDO;
    }

    public void cancelar() {
        if (getStatus().podeMudarParaCancelado(getValorTotalPedido())) {
            status = StatusPedido.CANCELADO;
        } else {
            throw new IllegalStateException("O Pedido não pode ser cancelado");
        }
    }

}
