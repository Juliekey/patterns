package structural.facade.entities.sections;

import structural.facade.entities.FoodItem;

public class Bar implements KitchenSection {
    @Override
    public FoodItem prepDish(int dishID) {
        return new FoodItem(dishID);
    }
}
