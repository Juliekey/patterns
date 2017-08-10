package structural.flyweight.sliders.impl;

import structural.flyweight.sliders.Slider;

import java.math.BigDecimal;

/**
 * A ConcreteFlyweight class
 */
public class BaconMaster extends Slider {
    public BaconMaster() {
        name = "Bacon Master";
        cheese = "American";
        toppings = "lots of bacon";
        price = new BigDecimal("2.39");
    }

    @Override
    public void display(int orderTotal) {
        System.out.println("Slider #" + orderTotal + ": "
                + name + " - topped with "
                + cheese + " cheese and "
                + toppings + "! $" + price);
    }
}
