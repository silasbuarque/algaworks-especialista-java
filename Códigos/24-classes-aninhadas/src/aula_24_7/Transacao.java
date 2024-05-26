package aula_24_7;

import java.math.BigDecimal;

public interface Transacao {

    BigDecimal getValorTotal();

    void reembolsar();

}
