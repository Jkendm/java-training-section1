package io.github.jkendm.assessment_joykendi;

public class BankAccount{
    private String accountNumber;
    private  String accountHolder;
    private  double balance;
    
    //defining the constructor with validation
    public BankAccount(String accountNumber, String accountHolder, double balance){
        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);
        setBalance(balance);

    }

    //setting getters and setter
    //validation

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


   

