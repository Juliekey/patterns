package structural.facade.entities.sections;

import structural.facade.entities.FoodItem;

/**
 * A division of the kitchen.
 */
public class HotPrep implements KitchenSection {
    @Override
    public FoodItem prepDish(int dishID) {
        return new FoodItem(dishID);
    }
}
