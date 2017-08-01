package structural.bridge.orders;

import structural.bridge.utils.OrderType;

/**
 * Implementer which defines an interface for placing an order
 */
public interface Restaurant {
    void place(OrderType orderType);
}
