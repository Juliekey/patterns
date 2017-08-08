package creational.prototype;

import creational.prototype.entities.Sandwich;
import creational.prototype.entities.SandwichMenu;
import creational.prototype.entities.SandwichPrototype;

public class App {
    public static void main(String[] args) {
        SandwichMenu sandwichMenu = new SandwichMenu();
        sandwichMenu.addSandwich("BLT", new Sandwich("Wheat", "Bacon", "", "Lettuce, Tomato"));
        sandwichMenu.addSandwich("PB&J", new Sandwich("White", "", "", "Peanut Butter, Jelly"));
        sandwichMenu.addSandwich("Turkey", new Sandwich("Rye", "Turkey", "Swiss", "Lettuce, Onion, Tomato"));
        SandwichPrototype sandwich1 = sandwichMenu.getSandwich("BLT").clone();
        SandwichPrototype sandwich2 = sandwichMenu.getSandwich("Turkey").clone();
        SandwichPrototype sandwich3 = sandwichMenu.getSandwich("PB&J").clone();
        System.out.println();
        System.out.println(sandwich1);
        System.out.println(sandwich2);
        System.out.println(sandwich3);

    }
}
