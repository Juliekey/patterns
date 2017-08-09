package creational.singleton;

public class App {
    public static void main(String[] arts) {
        TheBell theBell = TheBell.INSTANCE;
        System.out.println(theBell);
        theBell.ring();
    }
}
