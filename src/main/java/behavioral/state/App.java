package behavioral.state;

public class App {
    /**
     * Demo of using state design pattern
     */
    public static void main(String[] args) {
        //Let's cook a steak!
        Steak steak = new Steak("T-Bone");
        // Apply temperature changes
        steak.addTemp(120);
        steak.addTemp(15);
        steak.addTemp(15);
        steak.addTemp(10); //Yes I know cooking doesn't work this way
        steak.addTemp(15);
        steak.addTemp(20);
        steak.addTemp(20);
        steak.addTemp(20);
    }
}
