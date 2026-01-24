package io.github.jkendm.assessment2_se010_joykendi;

public class BankAccount {
    private String accountNumber;
    private  String accountHolder;
    private  double balance;
    private String password; //adding for bonus - password authentication
    
    
    //defining the constructor with validation
    public BankAccount(String accountNumber, String accountHolder, double balance){
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        setBalance(balance);

    }

    //setting getters and setter

      public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        if(accountNumber != null && !accountNumber.trim().isEmpty()){
             this.accountNumber=accountNumber;

        }else{
        throw new RuntimeException("Account number cannot be null or empty");
    }
    }

       public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder){
        if(accountHolder!= null && !accountHolder.trim().isEmpty()){
             this.accountHolder=accountHolder;

        }else{
        throw new RuntimeException("Account number cannot be null or empty");
    }
    }
  //getBalance
      public double getBalance(){
        return balance;
    }

      public void setBalance(double balance){
        this.balance=balance;
    }

//defining the method deposit and withdraw

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

    //defining to toString - returns string representation of an object
@Override
public String toString() { 
    return "Account[" + accountNumber + "] Holder: " + accountHolder + " Balance: $" + balance; 
}
}
