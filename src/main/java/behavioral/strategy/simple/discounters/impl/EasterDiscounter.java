package behavioral.strategy.simple.discounters.impl;

import behavioral.strategy.simple.discounters.Discounter;

import java.math.BigDecimal;

/**
 * Class represents discount strategy fo easter holidays
 */
public class EasterDiscounter implements Discounter {
    public static final double EASTER_DISCOUNT = 0.5;

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply((BigDecimal.valueOf(EASTER_DISCOUNT)));
    }
}
