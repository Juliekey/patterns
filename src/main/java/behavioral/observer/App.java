package behavioral.observer;

import behavioral.observer.observers.impl.FancyRestaurant;
import behavioral.observer.subjects.impl.Carrot;

public class App {
    public static void main(String[] args) {

        Carrot carrots = new Carrot("carrot", 0.82);
        carrots.attach(new FancyRestaurant("Mackay's", 0.77));
        carrots.attach(new FancyRestaurant("Johnny's Sports Bar", 0.74));
        carrots.attach(new FancyRestaurant("Salad Kingdom", 0.75));
        carrots.setPricePerKilo(0.79);
        carrots.setPricePerKilo(0.76);
        carrots.setPricePerKilo(0.74);
        carrots.setPricePerKilo(0.81);
    }
}
