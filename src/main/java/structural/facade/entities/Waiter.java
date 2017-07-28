package structural.facade.entities;

import structural.facade.entities.sections.Bar;
import structural.facade.entities.sections.ColdPrep;
import structural.facade.entities.sections.HotPrep;

public class Waiter {
    private ColdPrep coldPrep = new ColdPrep();
    private Bar bar = new Bar();
    private HotPrep hotPrep = new HotPrep();

    public Order placeOrder(Customer customer,
                            int coldAppId,
                            int hotEntreeId,
                            int drinkId) {
        System.out.println(customer.getName() + " places order for cold app #"
                + coldAppId
                + ", hot entree #" + hotEntreeId
                + ", and drink #" + drinkId + ".");
        Order order = new Order();
        order.setAppetizer(coldPrep.prepDish(coldAppId));
        order.setEntree(hotPrep.prepDish(hotEntreeId));
        order.setDrink(bar.prepDish(drinkId));
        return order;
    }
}
