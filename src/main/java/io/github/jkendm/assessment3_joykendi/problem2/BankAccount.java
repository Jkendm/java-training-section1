package io.github.jkendm.assessment3_joykendi.problem2;

import java.util.HashMap;
import java.util.Map;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Static registry of accounts for transfer validation
    private static Map<String, BankAccount> accounts = new HashMap<>();

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        accounts.put(accountNumber, this); // register account
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new InvalidTransactionException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println(accountHolder + " deposited " + amount + ". New balance: " + balance);
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
        }
        balance -= amount;
        System.out.println(accountHolder + " withdrew " + amount + ". New balance: " + balance);
    }

    // Transfer method
    public void transfer(String toAccountNumber, double amount) 
            throws InsufficientFundsException, AccountNotFoundException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Transfer amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for transfer. Current balance: " + balance);
        }
        BankAccount toAccount = accounts.get(toAccountNumber);
        if (toAccount == null) {
            throw new AccountNotFoundException("Account " + toAccountNumber + " not found");
        }
        this.balance -= amount;
        toAccount.balance += amount;
        System.out.println("Transferred " + amount + " from " + accountHolder + " to " + toAccount.accountHolder);
    }
}

    

