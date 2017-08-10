package structural.flyweight.sliders;

import java.math.BigDecimal;

/**
 * The Flyweight class. A template for creating many objects.
 */
public abstract class Slider {
    protected String name;
    protected String cheese;
    protected String toppings;
    protected BigDecimal price;

    public abstract void display(int orderTotal);
}
