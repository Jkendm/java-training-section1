package io.github.jkendm.practice_exercise.javase007;

public class Main {
    public static void main(String[] args) {
        BankAccountClass account = new BankAccountClass("Saving Account", "Joy", 100000 );
        BankAccountClass account2 = new BankAccountClass ("Ziidi", "Karimi");
        BankAccountClass account3 = new BankAccountClass();

        account.deposit(100000);
        account.withdraw(1000);
        account.displayInfo();
        
        account2.deposit(1000);
        account2.withdraw(500);
        account2.displayInfo();

         account3.deposit(10000);
        account3.withdraw(10000);
        account3.displayInfo();

    }
}
