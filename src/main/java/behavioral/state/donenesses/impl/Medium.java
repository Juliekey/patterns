package behavioral.state.donenesses.impl;

import behavioral.state.donenesses.Doneness;

/**
 * A Concrete State class
 */
public class Medium extends Doneness {
    public Medium(Doneness state) {
        super(state);
    }

    @Override
    protected void initialize() {
        canBeEaten = true;
        lowerTemp = 155;
        upperTemp = 169.9999999999;
    }


    @Override
    public void donenessCheck() {
        if (currentTemp < lowerTemp) {
            steak.setState(new MediumRare(this));
        } else if (currentTemp > upperTemp) {
            steak.setState(new WellDone(this));
        }
    }
}
