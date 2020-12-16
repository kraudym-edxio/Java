public class BankAccount {

    private double balance;
    private double transactionFee = 0.50;
    private int transactionCount = 0;

    /**
     * This is the default constructor
     */
    public BankAccount() {

        balance = 0;
        transactionCount = 0;

    }

    /**
     * This is the second constructor
     * @param initialBalance the initial balance of the bank account
     */
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    /**
     * Deposits a cash amount to the account
     * @param amount is the cash amount to be deposited
     */
    public void deposit(double amount) {
        this.balance += amount;
        transactionCount++;
        //transactionFee(); Charges fee for every deposit
    }

    /**
     * Withdraws a cash amount from thr account
     * @param amount is the cash amount to be withdrawn
     */
    public void withdraw(double amount) {
        this.balance -= amount;
        transactionCount++;
        //transactionFee(); Charges fee for every withdraw
    }

    public void transactionFee() {
        this.balance-= transactionFee;
    }

    /**
     * Accessor for the balance of the bank account
     * @return the account balance
     */
    public double getBalance() {
        return this.balance;
    }

    public void deductMonthlyCharge() {

        if (transactionCount > 10) {
            this.balance -= ((transactionCount - 10) * transactionFee);
            transactionCount = 0;
        }

    }

}