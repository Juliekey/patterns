package structural.adapter.oldApi;

/**
 * The legacy API which must be converted to the new structure
 */
public class MeatDatabase {
    public float getSafeCookTemp(String meat, TemperatureType tempType) {
        if (tempType == TemperatureType.Fahrenheit) {
            switch (meat.toLowerCase()) {
                case "beef":
                case "pork":
                    return 145f;
                case "chicken":
                case "turkey":
                    return 165f;
                default:
                    return 165f;
            }
        } else {
            switch (meat) {
                case "beef":
                case "veal":
                case "pork":
                    return 63f;
                case "chicken":
                case "turkey":
                    return 74f;
                default:
                    return 74f;
            }
        }
    }

    public int getCaloriesPerOunce(String meat) {
        switch (meat.toLowerCase()) {
            case "beef":
                return 71;
            case "pork":
                return 69;
            case "chicken":
                return 66;
            case "turkey":
                return 38; //Wow, turkey is lean!
            default:
                return 0;
        }
    }

    public double getProteinPerOunce(String meat) {
        switch (meat.toLowerCase()) {
            case "beef":
                return 7.33f;
            case "pork":
                return 7.67f;
            case "chicken":
                return 8.57f;
            case "turkey":
                return 8.5f;
            default:
                return 0d;
        }
    }
}
