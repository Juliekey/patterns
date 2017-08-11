package creational.builder;

/**
 * Bank Account is an entity that has many parameters, some of them optional.
 * Builder class is used to solve this problem
 */
public class BankAccount {

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    /**
     * Nested static builder class
     */
    public static class Builder {

        //duplicate parameters as in original entitiy
        private final long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder setOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder setBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder setBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder setInterestRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        /**
         * This method creates and returns {@link BankAccount} instance
         * with parameters passed to {@link Builder} setter methods.
         *
         * @return bankAccount
         */
        public BankAccount build() {
            BankAccount bankAccount = new BankAccount();
            bankAccount.accountNumber = this.accountNumber;
            bankAccount.owner = this.owner;
            bankAccount.branch = this.branch;
            bankAccount.balance = this.balance;
            bankAccount.interestRate = this.interestRate;
            return bankAccount;
        }
    }

    private BankAccount() {

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
