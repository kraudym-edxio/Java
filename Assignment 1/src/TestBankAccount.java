public class TestBankAccount {

    public static void main (String[] args) {

        BankAccount account1 = new BankAccount(1000);

        account1.withdraw(110.45);

        System.out.printf("Actual account balance: %.2f\n", account1.getBalance());
        //Balance expected if fee was charged for EVERY deposit and withdraw
        System.out.println("Expected account balance: 889.05");

        //Nine account transactions (the maximum number of free transactions)
        account1.withdraw(100);
        account1.deposit(570);
        account1.deposit(300);
        account1.withdraw(60);
        account1.deposit(1000);
        account1.deposit(700);
        account1.withdraw(12);
        account1.withdraw(872);
        account1.deposit(123);

        //Five additional transactions (five over the maximum, thus 0.50 * 5 in fees)
        account1.deposit(700);
        account1.withdraw(12);
        account1.withdraw(872);
        account1.deposit(123);
        account1.withdraw(99);

        account1.deductMonthlyCharge(); //Method call to apply the monthly charge

        System.out.printf("Actual account balance: %.2f\n", account1.getBalance());
        System.out.println("Expected account balance: 2376.05"); //Charged for five transactions since first ten are free

    }

}