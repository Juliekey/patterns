package creational.abstract_factory.factories;

import creational.abstract_factory.products.Dessert;
import creational.abstract_factory.products.Sandwich;

/**
 * The AbstractFactory class, which defines methods for creating abstract
 * objects.
 */
public abstract class RecipeFactory {
    public abstract Sandwich createSandwich();

    public abstract Dessert createDessert();
}
