package behavioral.strategy.simple.discounters.impl;

import behavioral.strategy.simple.discounters.Discounter;

import java.math.BigDecimal;

public class ChristmasDiscounter implements Discounter {
    public static final double CHRISTMAS_DISCOUNT = 0.8;

    @Override
    public BigDecimal applyDiscount(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(CHRISTMAS_DISCOUNT));
    }
}
