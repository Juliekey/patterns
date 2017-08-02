package behavioral.templateMethod.entities.impl;

import behavioral.templateMethod.entities.Bread;

/**
 * ConcreteClass object for {@link Bread} class
 */
public class WholeWheat extends Bread {
    public void mixIngredients() {
        System.out.println("Gathering Ingredients for Whole Wheat Bread.");
    }

    public void bake() {
        System.out.println("Baking the Whole Wheat Bread. (15 minutes)");
    }
}
