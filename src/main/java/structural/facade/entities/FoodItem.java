package structural.facade.entities;

/**
 * All items sold in the restaurant must inherit from this.
 */
public class FoodItem {
    private int dishID;

    public FoodItem(int dishID) {
        this.dishID = dishID;
    }
}
