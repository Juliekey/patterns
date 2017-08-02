package behavioral.templateMethod.entities.impl;


import behavioral.templateMethod.entities.Bread;

/**
 * ConcreteClass object for {@link Bread} class
 */
public class TwelveGrain extends Bread {
    @Override
    public void mixIngredients() {
        System.out.println("Gathering Ingredients for 12-Grain Bread.");
    }

    @Override
    public void bake() {
        System.out.println("Baking the 12-Grain Bread. (25 minutes)");
    }
}
