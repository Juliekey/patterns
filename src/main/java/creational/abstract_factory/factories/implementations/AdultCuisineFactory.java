package creational.abstract_factory.factories.implementations;

import creational.abstract_factory.factories.RecipeFactory;
import creational.abstract_factory.products.Dessert;
import creational.abstract_factory.products.Sandwich;
import creational.abstract_factory.products.implementations.Blt;
import creational.abstract_factory.products.implementations.CremeBrulee;

/**
 * A concrete factory which creates concrete objects by implementing the
 * abstract factory's methods.
 */
public class AdultCuisineFactory extends RecipeFactory {
    public Sandwich createSandwich() {
        return new Blt();
    }

    public Dessert createDessert() {
        return new CremeBrulee();
    }
}
