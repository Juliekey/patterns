package observer.observers;

import observer.subjects.Vegetable;

/**
 * Interface for observers of {@link Vegetable}
 */
public interface Restaurant {
    void update(Vegetable vegetable);
}
