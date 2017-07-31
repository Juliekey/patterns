package structural.adapter.newApi.entities;

/**
 * The new Meat class, which represents details about a specific kind of meat.
 */
public class Meat {
    protected String meatName;
    protected float safeCookTempFahrenheit;
    protected float safeCookTempCelsius;
    protected double caloriesPerOunce;
    protected double proteinPerOunce;

    // Constructor
    public Meat(String meat) {
        this.meatName = meat;
    }

    public void loadData() {
        System.out.println(String.format("Meat: %s ------ ", meatName));
    }
}
