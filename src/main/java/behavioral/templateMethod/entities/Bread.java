package behavioral.templateMethod.entities;

/**
 * The AbstractClass participant which contains the template method.
 */
public abstract class Bread {
    public abstract void mixIngredients();

    public abstract void bake();

    public void slice() {
        System.out.println("Slicing the " + this.getClass().getSimpleName() + " bread!");
    }

    /**
     * The template method
     */
    public void make() {
        mixIngredients();
        bake();
        slice();
    }
}
