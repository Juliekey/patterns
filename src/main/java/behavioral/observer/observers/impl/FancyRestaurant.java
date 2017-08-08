package behavioral.observer.observers.impl;

import behavioral.observer.observers.Restaurant;
import behavioral.observer.subjects.Vegetable;

/**
 * Implementation of Observer
 */
public class FancyRestaurant implements Restaurant {
    private String name;
    private Vegetable vegetable;
    private double purchaseThreshold;

    public FancyRestaurant(String name, double purchaseThreshold) {
        this.name = name;
        this.purchaseThreshold = purchaseThreshold;
    }

    @Override
    public void update(Vegetable vegetable) {
        String vegetableName = vegetable.getName();
        System.out.println(String.format(
                "Notified %s of %s's " + " price change to %s per pound.",
                name, vegetableName, vegetable.getPricePerKilo()));
        if (vegetable.getPricePerKilo() < purchaseThreshold) {
            System.out.println(name + " wants to buy some "
                    + vegetableName + "!");
        }
    }
}
