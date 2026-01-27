/*
Basic Bank Account System
Name:Joy Kendi
Date:25/01/2026

*
*
* Features Implemented:
* - Complete encapsulation with validation
* - Inheritance hierarchy (Savings/Checking accounts)
* - Polymorphic account management
* - Custom exception handling
*
* Bonus Features: 
1. Transaction History
2. Account Transfers
3. Password protection
 */
package io.github.jkendm.assessment2_se010_joykendi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Bank Account System ===");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Check Balance");
            System.out.println("6. Apply Interest (Savings)");
            System.out.println("7. Display All Accounts");
            System.out.println("8. Show Transactions");
            System.out.println("9. Transfer Funds");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: // Create Savings Account
                    System.out.print("Enter account number: ");
                    String sAccNum = scanner.nextLine();
                    System.out.print("Enter account holder: ");
                    String sHolder = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double sBalance = scanner.nextDouble();
                    System.out.print("Enter interest rate (%): ");
                    double rate = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Set password: ");
                    String sPass = scanner.nextLine();

                    SavingAccount savings = new SavingAccount(sAccNum, sHolder, sBalance, sPass, rate);
                    bank.addAccount(savings);
                    System.out.println("Savings account created successfully!");
                    break;

                case 2: // Create Checking Account
                    System.out.print("Enter account number: ");
                    String cAccNum = scanner.nextLine();
                    System.out.print("Enter account holder: ");
                    String cHolder = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double cBalance = scanner.nextDouble();
                    System.out.print("Enter overdraft limit: ");
                    double limit = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Set password: ");
                    String cPass = scanner.nextLine();

                    CheckingAccount checking = new CheckingAccount(cAccNum, cHolder, cBalance, cPass, limit);
                    bank.addAccount(checking);
                    System.out.println("Checking account created successfully!");
                    break;

                case 3: // Deposit
                    System.out.print("Enter account number: ");
                    String dAccNum = scanner.nextLine();
                    BankAccount dAcc = bank.findAccount(dAccNum);
                    if (dAcc != null) {
                        System.out.print("Enter password: ");
                        String pass = scanner.nextLine();
                        if (dAcc.authenticate(pass)) {
                            System.out.print("Enter deposit amount: ");
                            double amount = scanner.nextDouble();
                            try {
                                dAcc.deposit(amount);
                                System.out.println("Deposit successful!");
                            } catch (InvalidAmountException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        } else {
                            System.out.println("Authentication failed!");
                        }
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4: // Withdraw
                    System.out.print("Enter account number: ");
                    String wAccNum = scanner.nextLine();
                    BankAccount wAcc = bank.findAccount(wAccNum);
                    if (wAcc != null) {
                        System.out.print("Enter password: ");
                        String pass = scanner.nextLine();
                        if (wAcc.authenticate(pass)) {
                            System.out.print("Enter withdrawal amount: ");
                            double amount = scanner.nextDouble();
                            try {
                                wAcc.withdraw(amount);
                                System.out.println("Withdrawal successful!");
                            } catch (InsufficientFundsExceptions e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        } else {
                            System.out.println("Authentication failed!");
                        }
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 5: // Check Balance
                    System.out.print("Enter account number: ");
                    String bAccNum = scanner.nextLine();
                    BankAccount bAcc = bank.findAccount(bAccNum);
                    if (bAcc != null) {
                        System.out.println("Balance: $" + bAcc.getBalance());
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 6: // Apply Interest
                    bank.applyInterestToSavingAccounts();
                    System.out.println("Interest applied to all savings accounts!");
                    break;

                case 7: // Display All Accounts
                    bank.displayAllAccounts();
                    break;

                case 8: // Show Transactions
                    System.out.print("Enter account number: ");
                    String tAccNum = scanner.nextLine();
                    BankAccount tAcc = bank.findAccount(tAccNum);
                    if (tAcc != null) {
                        tAcc.showTransactions();
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 9: // Transfer Funds
                    System.out.print("Enter FROM account number: ");
                    String fromAcc = scanner.nextLine();
                    BankAccount fAcc = bank.findAccount(fromAcc);
                    if (fAcc != null) {
                        System.out.print("Enter password: ");
                        String pass = scanner.nextLine();
                        if (fAcc.authenticate(pass)) {
                            System.out.print("Enter To account number: ");
                            String toAcc = scanner.nextLine();
                            System.out.print("Enter amount: ");
                            double amount = scanner.nextDouble();
                            try {
                                bank.transfer(fromAcc, toAcc, amount);
                            } catch (InsufficientFundsExceptions e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        } else {
                            System.out.println("Authentication failed!");
                        }
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 10: // Exit
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
