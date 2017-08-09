package structural.memento;

import structural.memento.entities.FoodSupplier;
import structural.memento.entities.MementoKeeper;

public class App {
    public static void main(String[] args) {
        //Here's a new supplier for our restaurant
        FoodSupplier supplier = new FoodSupplier();
        supplier.setName("Harold Karstark");
        supplier.setPhone("(482) 555-1172");
        // Let's store that entry in our database.
        MementoKeeper mementoKeeper = new MementoKeeper();
        mementoKeeper.setMemento(supplier.saveMemento());
        // Continue changing originator
        supplier.setAddress("548 S Main St. Nowhere, KS");
        // gotta undo that entry, I entered the wrong address
        supplier.restoreMemento(mementoKeeper.getMemento());
    }
}
