package io.github.jkendm.assessment2_se010_joykendi;

public class CheckingAccount extends BankAccount{
    
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit){
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit=overdraftLimit;
    }
//override withdraw to provide overdraft
    @Override
    public void withdraw(double amount) {
         if (amount > 0 && (getBalance() - amount) >= -overdraftLimit) {
             setBalance(getBalance() - amount);
             } 
             else { 
                System.out.println("Withdrawal denied! Overdraft limit exceeded.");
              }
             }

//toString method
@Override 
    public String toString() { 
        return "SavingsAccount[" + getAccountNumber() + "] Balance: $" + getBalance();
     }

    
    
}
