package behavioral.state.donenesses.impl;

import behavioral.state.donenesses.Doneness;

/**
 * A Concrete State class
 */
public final class Rare extends Doneness {
    public Rare(Doneness state) {
        super(state);
    }


    @Override
    protected void initialize() {
        canBeEaten = true;
        lowerTemp = 130;
        upperTemp = 139.999999999999;
    }


    @Override
    public void donenessCheck() {
        if (currentTemp < lowerTemp) {
            steak.setState(new Uncooked(this));
        } else if (currentTemp > upperTemp) {
            steak.setState(new MediumRare(this));
        }
    }


}
