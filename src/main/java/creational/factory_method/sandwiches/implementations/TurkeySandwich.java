package creational.factory_method.sandwiches.implementations;

import creational.factory_method.ingredients.implementations.Bread;
import creational.factory_method.ingredients.implementations.Lettuce;
import creational.factory_method.ingredients.implementations.Mayonnaise;
import creational.factory_method.ingredients.implementations.Turkey;
import creational.factory_method.sandwiches.Sandwich;

public class TurkeySandwich extends Sandwich {
    @Override
    public void createIngredients() {
        ingredients.add(new Bread());
        ingredients.add(new Mayonnaise());
        ingredients.add(new Lettuce());
        ingredients.add(new Turkey());
        ingredients.add(new Turkey());
        ingredients.add(new Bread());
    }
}
