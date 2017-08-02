package behavioral.templateMethod;

import behavioral.templateMethod.entities.Bread;
import behavioral.templateMethod.entities.impl.Sourdough;
import behavioral.templateMethod.entities.impl.TwelveGrain;
import behavioral.templateMethod.entities.impl.WholeWheat;

public class App {
    public static void main(String[] args) {
        Bread sourdough = new Sourdough();
        sourdough.make();
        Bread twelveGrain = new TwelveGrain();
        twelveGrain.make();
        Bread wholeWheat = new WholeWheat();
        wholeWheat.make();
    }
}
