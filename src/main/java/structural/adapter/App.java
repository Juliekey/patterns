package structural.adapter;

import structural.adapter.newApi.entities.Meat;
import structural.adapter.newApi.entities.MeatDetails;

/**
 * The Adapter pattern attempts to reconcile two incompatible interfaces, especially if one of
 * them cannot be refactored. Useful when adapting old legacy systems.
 */
public class App {
    public static void main(String[] args) {
        //Non-adapted
        Meat unknown = new Meat("Beef");
        unknown.loadData();
        //Adapted
        MeatDetails beef = new MeatDetails("Beef");
        beef.loadData();
        MeatDetails turkey = new MeatDetails("Turkey");
        turkey.loadData();
        MeatDetails chicken = new MeatDetails("Chicken");
        chicken.loadData();

    }
}
