package structural.flyweight.sliders.impl;


import structural.flyweight.sliders.Slider;

import java.math.BigDecimal;

/**
 * A ConcreteFlyweight class
 */
public class VeggieSlider extends Slider {
    public VeggieSlider() {
        name = "Veggie Slider";
        cheese = "Swiss";
        toppings = "lettuce, onion, tomato, and pickles";
        price = new BigDecimal("1.99");
    }

    @Override
    public void display(int orderTotal) {
        System.out.println("Slider #" + orderTotal + ": "
                + name + " - topped with "
                + cheese + " cheese and "
                + toppings + "! $"
                + price);
    }
}
