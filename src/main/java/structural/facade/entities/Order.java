package structural.facade.entities;

/**
 * Orders placed by Customers.
 */
public class Order {
    private FoodItem appetizer;
    private FoodItem entree;
    private FoodItem drink;

    public void setAppetizer(FoodItem appetizer) {
        this.appetizer = appetizer;
    }

    public void setEntree(FoodItem entree) {
        this.entree = entree;
    }

    public void setDrink(FoodItem drink) {
        this.drink = drink;
    }


}
