package io.github.jkendm.assessment_joykendi;
//defining terms - assessment 1- question 5

public class Question5 {
//method overloading - It is same method but different parameters and happens in the same class
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    } // add - same method name but parameters we have int and double
}

//Overriding -same method and same parameters. Happens in a parent- child relationship, but the child class has its own implementation
class Account {
    //parent class
    public void withdraw(double amount) {
        System.out.println("Withdrawing amount");
    }
}
// the child class has its own implementation
class CheckingAccount extends Account {
    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing with overdraft");
    }
}

// When use super word when calling a parent class constructor this ensures proper parent class data initialization
class AccountB {
    //parent class
    protected double balance;

    public AccountB(double balance) {
        this.balance = balance; //parent constructor 
    }
}

class SavingsAccount extends AccountB {

    public SavingsAccount(double balance) {
        super(balance);  // calls parent constructor
    }
}

//@Override notation improves code readability and ensure the method actually overrides the parent class

/*Encapsulation - helps in:
1. Allows changes without breaking other code
2. Centralizes validation logic
3. Makes debugging easier
4. Hides internal implementation */

class User {

    private String password;

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        }
    }

    public String getPassword() {
        return "********";
    }
}
}
