package io.github.jkendm.assessment2_se010_joykendi;

public class CheckingAccount extends BankAccount {

    private double overdraftLimit;

    public CheckingAccount(String accountNumber,String accountHolder, double balance, String password, double overdraftLimit)
            throws InvalidAmountException {

        super(accountNumber, accountHolder, balance, password);
        this.overdraftLimit = overdraftLimit;
    }

    // Override withdraw to allow overdraft
    @Override
    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsExceptions {

        if (amount <= 0) {
            throw new InvalidAmountException("Withdraw amount must be positive");
        }

        // Check overdraft limit
        if (getBalance() - amount < -overdraftLimit) {
            throw new InsufficientFundsExceptions("Overdraft limit exceeded");
        }

        // Allow withdrawal
        balance-=amount;
        addTransaction("Withdrew $" + amount + " (checking with overdraft)");
    }

    // toString
    @Override
    public String toString() {
        return "CheckingAccount[" + getAccountNumber() +
               "] Balance: $" + getBalance() +
               " Overdraft Limit: $" + overdraftLimit;
    }
}
