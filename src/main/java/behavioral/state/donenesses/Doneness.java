package behavioral.state.donenesses;

import behavioral.state.Steak;

/**
 * The state abstract class
 */
public abstract class Doneness {
    protected Steak steak;
    protected double currentTemp;
    protected double lowerTemp;
    protected double upperTemp;
    protected boolean canBeEaten;

    public Doneness(Doneness state) {
        currentTemp = state.getCurrentTemp();
        this.steak = state.getSteak();
        initialize();
        donenessCheck();
    }

    public Doneness(double currentTemp, Steak steak) {
        this.currentTemp = currentTemp;
        this.steak = steak;
        initialize();
        donenessCheck();
    }

    public void setSteak(Steak steak) {
        this.steak = steak;
    }

    public void setCurrentTemp(double currentTemp) {
        this.currentTemp = currentTemp;
    }

    protected abstract void initialize();

    public void addTemp(double temp) {
        currentTemp += temp;
        donenessCheck();
    }

    public void removeTemp(double temp) {
        currentTemp -= temp;
        donenessCheck();
    }

    public abstract void donenessCheck();


    public Steak getSteak() {
        return steak;
    }

    public double getCurrentTemp() {
        return currentTemp;
    }
}
