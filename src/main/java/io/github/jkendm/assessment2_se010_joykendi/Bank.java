package io.github.jkendm.assessment2_se010_joykendi;

import java.util.*;

public class Bank {
    //bank Management
    //Maintain collection of accounts
    // Methods: addAccount(), findAccount(), displayAllAccounts()calculateTotalBalance()
    // applyInterestToSavingsAccounts()

    private List<BankAccount> accounts = new ArrayList<>();

    // addAccount() with duplicate check
    public void addAccount (BankAccount account){
        for (BankAccount acc: accounts){
            if (acc.getAccountNumber().equals(account.getAccountNumber())){
                System.out.println("Duplicate account number!");
                return;
             }
        }
        accounts.add(account);
    }
    //search and return an account
    public BankAccount findAccount(String accountNumber){
        for (BankAccount acc : accounts){
            if (acc.getAccountNumber().equals(accountNumber)) return acc;
        }
        return null;
    }

    //Transfer between Accounts

    public void transfer(String fromAccNum, String toAccNum, double amount) throws Exception{
        BankAccount fromAcc = findAccount(fromAccNum);
        BankAccount toAcc = findAccount(toAccNum);

        if (fromAcc == null || toAcc == null){
            throw new Exception ("one or both accounts not found");
        }

        fromAcc.withdraw(amount);
        toAcc.deposit(amount);

        fromAcc.addTransaction("Transferred $" + amount + "to" + toAcc.getAccountNumber());
        toAcc.addTransaction("Received $ "+amount+ "from " + fromAcc.getAccountNumber());

        System.out.println("Transfer successful!");

    }

    //display all accounts
    public void displayAllAccounts(){
        for (BankAccount acc:accounts){
            System.out.println(acc.toString());
        }
    }

    //Apply interest to all Savings Accounts
    public void applyInterestToSavingAccounts(){
        for (BankAccount acc:accounts){
            if (acc instanceof SavingAccount){
                ((SavingAccount)acc).applyInterest();
            }
        }
    }
    
}
