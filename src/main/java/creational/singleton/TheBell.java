package creational.singleton;

/**
 * This class represents a bell and it guaranties that there is
 * only one instance of the bell in program.
 * This singleton entity is presented as enum.
 */
public enum TheBell {
    INSTANCE;
    private String name = "theBell";


    public void ring() {
        System.out.println("Ding! Order up!");
    }

    @Override
    public String toString() {
        return "TheBell{" +
                "name='" + name + '\'' +
                '}';
    }
}
