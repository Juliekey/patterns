package structural.memento.entities;

/**
 * The Memento class.
 */
public final class FoodSupplierMemento {
    private final String name;
    private final String phoneNumber;
    private final String address;

    public FoodSupplierMemento(String name, String phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
