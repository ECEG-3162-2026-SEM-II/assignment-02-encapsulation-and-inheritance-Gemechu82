public class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.50;

    public CheckingAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        double total = amount + TRANSACTION_FEE;

        if (amount > 0 && balance >= total) {
            super.withdraw(total); // reuse parent logic
        }
    }
}

