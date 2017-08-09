package structural.memento.entities;

/**
 * The Originator class, which is the
 * class for which we want to save
 * Mementos for its state.
 */
public class FoodSupplier {
    private String name;
    private String phone;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        System.out.println("Phone: " + phone);

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        System.out.println("Address: " + address);
    }

    public FoodSupplierMemento saveMemento() {
        System.out.println("Saving current state.");
        return new FoodSupplierMemento(name, phone, address);
    }

    public void restoreMemento(FoodSupplierMemento memento) {
        System.out.println("Restoring previous memento");
        this.name = memento.getName();
        this.phone = memento.getPhoneNumber();
        this.address = memento.getAddress();
    }
}
