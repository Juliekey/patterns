package behavioral.strategy.simple.discounters;

import java.math.BigDecimal;

/**
 * Strategy interface
 */
public interface Discounter {
    BigDecimal applyDiscount(BigDecimal amount);
}
