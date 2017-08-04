package observer.subjects;

import observer.observers.Restaurant;

import java.util.HashSet;
import java.util.Set;

/**
 * Abstract class for Subject, whose price needs to be observed
 */
public class Vegetable {
    private double pricePerKilo;
    private Set<Restaurant> restaurants;
    private final String name;

    public Vegetable(String name, double pricePerKilo) {
        this.name = name;
        this.pricePerKilo = pricePerKilo;
        restaurants = new HashSet<>();
    }

    /**
     * Method for attaching a new observer. If this restaurant
     * already observes this vegetable it will not be attached again.
     *
     * @param restaurant - observer
     */
    public void attach(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    /**
     * Method for detaching an observer.
     *
     * @param restaurant an observer
     */
    public void detach(Restaurant restaurant) {
        restaurants.remove(restaurant);
    }

    /**
     * Notifying all observers about the change of state.
     */
    public void notifyObservers() {
        for (Restaurant restaurant :
                restaurants) {
            restaurant.update(this);
        }
    }

    public String getName() {
        return name;
    }

    public double getPricePerKilo() {
        return pricePerKilo;
    }

    public void setPricePerKilo(double pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
        notifyAll();
    }

}
