package io.github.jkendm.encapsulation;
//bundling of data is grouping of  related class together into one class
public class BankAccount {
    //encapsulation- data is hidden using private
    private double balance;
    private String accountNumber;
    private boolean active; //default 

    //defining a constructor- doesn't have a static keyword
    public BankAccount(double balance, String accountNumber){
        //this refers to current object instance
        this.accountNumber = accountNumber;
        this.setBalance(balance); // having the setter function in the constructor
    }

    public void displayInfo(){
        System.out.println("Account Number: " + accountNumber + " balance: " + balance + " state " + active);
    }
    
//read only function- doesn't have parameters
    public double getBalance(){
        return this.balance;
    }

// controlled access- doing data validation -  therefore protecting data integrity
    public void setBalance (double balance){
        if (balance >= 0){
            this.balance=balance;
        } else{
            throw new RuntimeException("Balance cannot be negative");
        }
    }

    public void setActive(boolean active){

        this.active=active;
    }

    // boolean accessor - start with is
    public boolean isActive(){
        return this.active;
    }


    
}
