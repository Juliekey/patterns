package behavioral.strategy.java8;

import java.math.BigDecimal;

public class App {
    public static final double VALENTINE_DAY_DISCOUNT = 0.4;

    /**
     * Demo of using strategy pattern.
     **/
    public static void main(String[] args) {
        Discounter christmasDiscounter = Discounter.christmasDiscounter();
        BigDecimal discountValue = christmasDiscounter.applyDiscount(BigDecimal.valueOf(5000));
        System.out.println(discountValue);

    }

}
