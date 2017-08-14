package behavioral.state.donenesses.impl;

import behavioral.state.donenesses.Doneness;

/**
 * A Concrete State class
 */
public class WellDone extends Doneness {
    public WellDone(Doneness state) {
        super(state);
    }

    @Override
    protected void initialize() {
        lowerTemp = 170;
        upperTemp = 230;
        canBeEaten = true;
    }

    @Override
    public void donenessCheck() {
        if (currentTemp < lowerTemp) {
            steak.setState(new Medium(this));
        }
    }
}
