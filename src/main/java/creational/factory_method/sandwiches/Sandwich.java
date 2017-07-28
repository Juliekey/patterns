package creational.factory_method.sandwiches;

import creational.factory_method.ingredients.Ingredient;

import java.util.ArrayList;
import java.util.List;

/**
 * Creator class
 */
public abstract class Sandwich {
    protected List<Ingredient> ingredients = new ArrayList<>();

    public Sandwich() {
        createIngredients();
    }

    protected abstract void createIngredients();

    public List<Ingredient> getIngredients() {
        //defensive copying
        return new ArrayList<>(ingredients);
    }
}
