package io.github.jkendm.assessment3_joykendi.problem2;
/**
* Assessment 3: Mid-Term Practical Test
* Student: Joy Kendi
* Date: 02-01-2026
* Problem: Problem 2
* 
* Key Features:
* - Encapsulation
* - Checked and unchecked exception: 
1. InsufficientFundsException (checked)
2. InvalidTransactionException (unchecked)
3. AccountNotFoundException (checked)
*/

public class BankTest {

    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount("ACC001", "Joy", 1000);
           // BankAccount account2 = new BankAccount("ACC002", "Murii", 500);

            account1.deposit(100);   // Should throw InvalidTransactionException
            account1.withdraw(2000);  // Should throw InsufficientFundsException
            account1.transfer("INVALID", 100); // Should throw AccountNotFoundException

        } catch (InsufficientFundsException e) {
            System.out.println("Funds error: " + e.getMessage());
        } catch (InvalidTransactionException e) {
            System.out.println("Transaction error: " + e.getMessage());
        } catch (AccountNotFoundException e) {
            System.out.println("Account error: " + e.getMessage());
        } finally {
            System.out.println("Transaction processing completed");
        }
    }
}

