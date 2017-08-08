package creational.prototype.entities;

/**
 * Implementation of prototype
 */
public class Sandwich implements SandwichPrototype, Cloneable {
    private final String bread;
    private final String meet;
    private final String cheese;
    private final String veggies;

    public Sandwich(String bread, String meet, String cheese, String veggies) {
        this.bread = bread;
        this.meet = meet;
        this.cheese = cheese;
        this.veggies = veggies;
    }


    @Override
    public Sandwich clone() {
        Sandwich sandwich;
        try {
            String ingredientList = getIngredientList();
            System.out.println("Cloning sandwich with ingredients: " + ingredientList);
            return (Sandwich) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String getIngredientList() {
        return String.format("%s, %s, %s, %s", bread, meet, cheese, veggies);
    }

    public String getBread() {
        return bread;
    }

    public String getMeet() {
        return meet;
    }

    public String getCheese() {
        return cheese;
    }

    public String getVeggies() {
        return veggies;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", meet='" + meet + '\'' +
                ", cheese='" + cheese + '\'' +
                ", veggies='" + veggies + '\'' +
                '}';
    }
}
