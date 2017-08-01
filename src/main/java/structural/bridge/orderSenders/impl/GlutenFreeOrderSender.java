package structural.bridge.orderSenders.impl;

import structural.bridge.orderSenders.OrderSender;
import structural.bridge.utils.OrderType;

/**
 * RefinedAbstraction for a gluten free order
 */
public class GlutenFreeOrderSender extends OrderSender {
    @Override
    public void send() {
        restaurant.place(OrderType.GlutenFree);
    }
}
