package structural.bridge.orders.impl;

import structural.bridge.orders.Restaurant;
import structural.bridge.utils.OrderType;

/**
 * ConcreteImplementer fcr dinner
 */
public class Dinner implements Restaurant {
    @Override
    public void place(OrderType orderType) {
        System.out.println("Placing order for " + orderType + " at the Diner.");
    }
}
