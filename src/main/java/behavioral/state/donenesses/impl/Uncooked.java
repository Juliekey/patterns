package behavioral.state.donenesses.impl;

import behavioral.state.Steak;
import behavioral.state.donenesses.Doneness;

/**
 * A Concrete State class
 */
public final class Uncooked extends Doneness {
    public Uncooked(double currentTemp, Steak steak) {
        super(currentTemp, steak);
    }

    public Uncooked(Doneness state) {
        super(state);
    }

    @Override
    protected void initialize() {
        lowerTemp = 0;
        upperTemp = 130;
        canBeEaten = false;
    }


    @Override
    public void donenessCheck() {
        if (currentTemp > upperTemp) {
            steak.setState(new Rare(this));
        }
    }
}
