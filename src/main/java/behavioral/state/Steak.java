package behavioral.state;

import behavioral.state.donenesses.Doneness;
import behavioral.state.donenesses.impl.Uncooked;

/**
 * The Context class
 */
public class Steak {
    private Doneness state;
    private String beefCut;

    public Steak(String beefCut) {
        this.beefCut = beefCut;
        state = new Uncooked(0.0, this);
    }

    public void setState(Doneness state) {
        this.state = state;
    }

    public void addTemp(double temp) {
        state.addTemp(temp);
        System.out.println("Increased temperature by " + temp + " degrees.");
        printStateInfo();
    }

    public void removeTemp(double temp) {
        state.removeTemp(temp);
        System.out.println("Decreased temperature by " + temp + " degrees.");
        printStateInfo();
    }

    private void printStateInfo() {
        System.out.println(" Current temp is " + state.getCurrentTemp());
        System.out.println(" Status is " + state.getClass().getSimpleName());
        System.out.println();
    }
}
