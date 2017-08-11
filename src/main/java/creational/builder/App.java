package creational.builder;

public class App {
    /**
     * Showcase of using builder pattern
     */
    public static void main(String[] args) {
        BankAccount account = new BankAccount.Builder(1234L)
                .setOwner("Marge")
                .setBalance(54)
                .setBalance(100)
                .setInterestRate(2.5)
                .build();
        BankAccount anotherAccount = new BankAccount.Builder(4567L)
                .setOwner("Homer")
                .setBranch("Springfield")
                .setBalance(2.5)
                .setInterestRate(8)
                .build();
        System.out.println(account);
        System.out.println(anotherAccount);
    }

}
