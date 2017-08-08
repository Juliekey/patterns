package creational.prototype.entities;

import java.util.HashMap;
import java.util.Map;

public class SandwichMenu {
    private Map<String, SandwichPrototype> sandwiches = new HashMap<>();

    public SandwichPrototype getSandwich(String name) {
        return sandwiches.get(name);
    }

    public void addSandwich(String name, SandwichPrototype sandwich) {
        sandwiches.put(name, sandwich);
    }
}
