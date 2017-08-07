package structural.Memento.entities;

/**
 * The Caretaker class. This class never examines the contents of any Memento
 * and is responsible for keeping that memento.
 */
public class MementoKeeper {
    private FoodSupplierMemento memento;

    public FoodSupplierMemento getMemento() {
        return memento;
    }

    public void setMemento(FoodSupplierMemento memento) {
        this.memento = memento;
    }
}
