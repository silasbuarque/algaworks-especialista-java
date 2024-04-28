public enum StatusNotaFiscal {

    NAO_EMITIDA("Não emitida") {
        @Override
        public boolean podeEmitirNotaFiscal(double valor) {
            return true;
        }

        @Override
        public boolean podeCancelarNota(double valor) {
            return true;
        }
    },
    EMITIDA("Emitida") {
        @Override
        public boolean podeEmitirNotaFiscal(double valor) {
            return false;
        }

        @Override
        public boolean podeCancelarNota(double valor) {
            return EMITIDA.equals(this) && valor >= 1_000;
        }
    },
    CANCELADA("Cancelada") {
        @Override
        public boolean podeEmitirNotaFiscal(double valor) {
            return false;
        }

        @Override
        public boolean podeCancelarNota(double valor) {
            return false;
        }
    };

    private String descricao;

    StatusNotaFiscal(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public abstract boolean podeEmitirNotaFiscal(double valor);
    public abstract boolean podeCancelarNota(double valor);

}
