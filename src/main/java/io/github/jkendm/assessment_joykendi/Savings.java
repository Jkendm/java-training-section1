package io.github.jkendm.assessment_joykendi;

public class Savings extends BankAccount {
    private double interestRate;

    //defining constructors
    public Savings(String accountNumber, String accountHolder, double balance, double interestRate){
        super(accountNumber,accountHolder,balance);
        this.interestRate=interestRate;

    }
@Override
 public void withdraw (double amount){
        if (amount > 0 && (getBalance()-amount)>=100){
           setBalance(getBalance()-amount);
            System.out.println("The withdraw is " + amount);

        } else {
            System.out.println("Balance is insufficient");
        }
    }

    public void applyInterest(){
        double interest = getBalance() * interestRate/100;
        interest += getBalance();
        System.out.println("Interest applied is $: " + interest);
        }
    
}
