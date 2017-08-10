package structural.flyweight.sliders.impl;

import structural.flyweight.sliders.Slider;

import java.math.BigDecimal;

/**
 * A ConcreteFlyweight class
 */
public class BBQKing extends Slider {
    public BBQKing() {
        name = "BBQ King";
        cheese = "American";
        toppings = "Onion rings, lettuce, and BBQ sauce";
        price = new BigDecimal("2.49");
    }

    @Override
    public void display(int orderTotal) {
        System.out.println("Slider #" + orderTotal
                + ": " + name + " - topped with "
                + cheese + " cheese and "
                + toppings + "! $"
                + price);
    }
}
