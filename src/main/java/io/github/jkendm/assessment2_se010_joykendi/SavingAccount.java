package io.github.jkendm.assessment2_se010_joykendi;

public class SavingAccount extends BankAccount {
    // Specialized account type: Savings
    private double interestRate;                 // interest rate for savings
    private static final double MIN_BALANCE = 100.0; // minimum balance requirement

    public SavingAccount(String AccountNumber, String accountHolder,double balance, double interestRate){
        super(AccountNumber, accountHolder, balance);
        this.interestRate=interestRate;
    }

@Override
//override withdraw to enforce minimum balance
 public void withdraw (double amount){
        if (amount > 0 && (getBalance()-amount)>=MIN_BALANCE){
           setBalance(getBalance()-amount);
            System.out.println("The withdraw is " + amount);

        } else {
            System.out.println("Balance is insufficient");
        }
    }
    // apply interest to balance
        public void applyInterest(){
        double interest = getBalance() * interestRate/100;
        interest += getBalance();
        System.out.println("Interest applied is $: " + interest);
        }

    @Override 
    public String toString() { 
        return "SavingsAccount[" + getAccountNumber() + "] Balance: $" + getBalance();
     }

}

    

