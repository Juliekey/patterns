package behavioral.strategy.simple;

import behavioral.strategy.simple.discounters.Discounter;
import behavioral.strategy.simple.discounters.impl.EasterDiscounter;

import java.math.BigDecimal;

public class App {
    public static final double VALENTINE_DAY_DISCOUNT = 0.4;

    /**
     * Demo of using strategy before java 8 release and after using lambdas.
     **/
    public static void main(String[] args) {
        Discounter easterDiscounter = new EasterDiscounter();

        BigDecimal discountedValue = easterDiscounter
                .applyDiscount(BigDecimal.valueOf(100));
        System.out.println(discountedValue);
        assert discountedValue.equals(BigDecimal.valueOf(50.0)) : "fail";

        //*************Using lambdas
        Discounter valentineDayDiscount = amount ->
                amount.multiply(BigDecimal.valueOf(VALENTINE_DAY_DISCOUNT));
    }
}
