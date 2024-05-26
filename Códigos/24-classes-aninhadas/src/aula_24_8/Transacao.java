package aula_24_8;

import java.math.BigDecimal;

public interface Transacao {

    BigDecimal getValorTotal();

    void reembolsar();

}
