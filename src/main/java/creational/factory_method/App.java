package creational.factory_method;

import creational.factory_method.sandwiches.Sandwich;
import creational.factory_method.sandwiches.implementations.Dagwood;
import creational.factory_method.sandwiches.implementations.TurkeySandwich;

/**
 * Any time you need to create groups of related objects, Factory Method is one of the
 * cleanest ways to do so. The Factory Method pattern provides a manner in which we can instantiate objects, but the
 * details of the creation of those instance are left to be defined by the instance classes
 * themselves.(from daily design patterns book)
 */
public class App {
    public static void main(String[] args) {
        Sandwich turkeySandwich = new TurkeySandwich();
        Sandwich dagwood = new Dagwood();
    }

}
