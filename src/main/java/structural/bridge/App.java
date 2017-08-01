package structural.bridge;

import structural.bridge.orderSenders.OrderSender;
import structural.bridge.orderSenders.impl.DairyFreeOrderSender;
import structural.bridge.orderSenders.impl.GlutenFreeOrderSender;
import structural.bridge.orders.Restaurant;
import structural.bridge.orders.impl.Dinner;
import structural.bridge.orders.impl.FancyRestaurant;

public class App {
    public static void main(String[] args) {
        OrderSender orderSender = new DairyFreeOrderSender();
        Restaurant dinner = new Dinner();
        orderSender.setRestaurant(dinner);
        orderSender.send();

        orderSender = new GlutenFreeOrderSender();
        Restaurant fancyRestaurant = new FancyRestaurant();
        orderSender.setRestaurant(fancyRestaurant);
        orderSender.send();
    }
}
