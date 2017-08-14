package behavioral.state.donenesses.impl;

import behavioral.state.donenesses.Doneness;

/**
 * A Concrete State class
 */
public class MediumRare extends Doneness {
    public MediumRare(Doneness state) {
        super(state);
    }

    @Override
    protected void initialize() {
        canBeEaten = true;
        lowerTemp = 140;
        upperTemp = 154.9999999999;
    }

    @Override
    public void addTemp(double temp) {
        currentTemp += temp;
        donenessCheck();
    }

    @Override
    public void removeTemp(double temp) {
        currentTemp -= temp;
        donenessCheck();
    }

    @Override
    public void donenessCheck() {
        if (currentTemp < lowerTemp) {
            steak.setState(new Rare(this));
        } else if (currentTemp > upperTemp) {
            steak.setState(new Medium(this));
        }
    }


}
