package structural.bridge.orderSenders.impl;

import structural.bridge.orderSenders.OrderSender;
import structural.bridge.utils.OrderType;

/**
 * RefinedAbstraction for a dairy-free order
 */
public class DairyFreeOrderSender extends OrderSender {
    @Override
    public void send() {
        restaurant.place(OrderType.DairyFree);
    }
}
