package io.github.jkendm.assessment2_se010_joykendi;

import java.util.LinkedList;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    protected double balance;
    private String password;
    private LinkedList<String> transactions = new LinkedList<>();

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance, String password)
            throws InvalidAmountException {

        setAccountNumber(accountNumber);
        setAccountHolder(accountHolder);

        if (balance < 0) {
            throw new InvalidAmountException("Initial balance cannot be negative");
        }

        this.balance = balance;
        this.password = password;
        addTransaction("Account created with balance $" + balance);
    }

    // Add transaction (max 10)
    protected void addTransaction(String detail) {
        if (transactions.size() == 10) {
            transactions.removeFirst();
        }
        transactions.add(detail);
    }

    // Show transactions
    public void showTransactions() {
        System.out.println("Transaction history for account " + accountNumber + ":");
        for (String t : transactions) {
            System.out.println("- " + t);
        }
    }

    // Authentication
    public boolean authenticate(String inputPassword) {
        return password.equals(inputPassword);
    }

    // Getters & setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new RuntimeException("Account number cannot be null or empty");
        }
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new RuntimeException("Account holder cannot be null or empty");
        }
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive");
        }

        balance += amount;
        addTransaction("Deposited $" + amount);
    }

    // Withdraw
    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsExceptions {

        if (amount <= 0) {
            throw new InvalidAmountException("Withdraw amount must be positive");
        }

        if (amount > balance) {
            throw new InsufficientFundsExceptions("Insufficient funds");
        }

        balance -= amount;
        addTransaction("Withdrew $" + amount);
    }

    // toString
    @Override
    public String toString() {
        return "Account[" + accountNumber + "] Holder: " + accountHolder + " Balance: $" + balance;
    }
}
