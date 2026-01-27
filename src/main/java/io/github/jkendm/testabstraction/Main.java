package io.github.jkendm.testabstraction;

import io.github.jkendm.polyabstract.BankManager;

public class Main {
    public static void main(String[] args) {
        BankManager bankManager = new BankManager();
        System.out.println(bankManager.processLoan(100000, "000002"));

        
    }
    
}
