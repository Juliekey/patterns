package creational.abstract_factory.factories.implementations;

import creational.abstract_factory.factories.RecipeFactory;
import creational.abstract_factory.products.Dessert;
import creational.abstract_factory.products.Sandwich;
import creational.abstract_factory.products.implementations.GrilledCheese;
import creational.abstract_factory.products.implementations.IceCreamSundae;

/**
 * A concrete factory which creates concrete objects by implementing the
 * abstract factory's methods.
 */
public class KidCuisineFactory extends RecipeFactory {
    public Sandwich createSandwich() {
        return new GrilledCheese();
    }

    public Dessert createDessert() {
        return new IceCreamSundae();
    }
}
