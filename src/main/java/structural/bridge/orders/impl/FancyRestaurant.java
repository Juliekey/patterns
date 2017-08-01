package structural.bridge.orders.impl;

import structural.bridge.orders.Restaurant;
import structural.bridge.utils.OrderType;

/**
 * ConcreteImplementer fcr fancy restaurant
 */
public class FancyRestaurant implements Restaurant {
    @Override
    public void place(OrderType orderType) {
        System.out.println("Placing order for " + orderType
                + " at the Fancy Restaurant.");
    }
}
