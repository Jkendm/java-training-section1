package io.github.jkendm.practice_exercise.javase007;

public class BankAccountClass {
    public String accountNumber;
    public String accountHolder;
    public double balance;
    
    //defining the constructor
    //with all  the properties
    public BankAccountClass (String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;

    }
    //with 2 properties
    public BankAccountClass (String accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder=accountHolder;

    }
    //default constructor

    public BankAccountClass(){

    }
    public void deposit( double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("The deposit is " + amount);

        }
        
    }

    public void withdraw (double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("The withdraw is " + amount);

        } else {
            System.out.println("Balance is insufficient");
        }
    }

    public void displayInfo(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("AccountNumber:" + accountNumber);
        System.out.println("Balance: " + balance);

        System.out.println("============================");

    }


}
