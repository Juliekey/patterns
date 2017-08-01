package structural.bridge.orderSenders;

import structural.bridge.orders.Restaurant;

/**
 * Abstraction which represents the sent order and maintains a reference to the
 * {@link #restaurant} where the order is going.
 */
public abstract class OrderSender {
    protected Restaurant restaurant;

    public abstract void send();


    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
