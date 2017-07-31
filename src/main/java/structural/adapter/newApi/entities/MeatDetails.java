package structural.adapter.newApi.entities;

import structural.adapter.oldApi.MeatDatabase;
import structural.adapter.oldApi.TemperatureType;

public class MeatDetails extends Meat {
    private MeatDatabase meatDatabase;

    public MeatDetails(String meat) {
        super(meat);
    }

    @Override
    public void loadData() {
        meatDatabase = new MeatDatabase();
        safeCookTempFahrenheit = meatDatabase.getSafeCookTemp(meatName, TemperatureType.Fahrenheit);
        safeCookTempCelsius = meatDatabase.getSafeCookTemp(meatName, TemperatureType.Celsius);
        caloriesPerOunce = meatDatabase.getCaloriesPerOunce(meatName);
        proteinPerOunce = meatDatabase.getProteinPerOunce(meatName);
        super.loadData();
        System.out.println(String.format(" Safe Cook Temp (F): %s", safeCookTempFahrenheit));
        System.out.println(String.format(" Safe Cook Temp (C): %s", safeCookTempCelsius));
        System.out.println(String.format(" Calories per Ounce: %s", caloriesPerOunce));
        System.out.println(String.format(" Protein per Ounce: %s", proteinPerOunce));
    }
}
