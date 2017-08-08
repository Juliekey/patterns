package creational.prototype.entities;

/**
 * Prototype that represents a sandwich and contains {@link #clone()}
 * method, so Sandwich can clone itself.
 */
public interface SandwichPrototype {
    SandwichPrototype clone();
}
