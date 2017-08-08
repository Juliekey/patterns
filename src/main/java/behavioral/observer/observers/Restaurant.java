package behavioral.observer.observers;

import behavioral.observer.subjects.Vegetable;

/**
 * Interface for observers of {@link Vegetable}
 */
public interface Restaurant {
    void update(Vegetable vegetable);
}
