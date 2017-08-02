package behavioral.templateMethod.entities.impl;

import behavioral.templateMethod.entities.Bread;

/**
 * ConcreteClass object for {@link Bread} class
 */
public class Sourdough extends Bread {
    @Override
    public void mixIngredients() {
        System.out.println("Gathering Ingredients for Sourdough Bread.");
    }

    @Override
    public void bake() {
        System.out.println("Baking the Sourdough Bread. (20 minutes)");
    }
}
