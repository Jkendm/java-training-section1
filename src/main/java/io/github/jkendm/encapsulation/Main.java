package io.github.jkendm.encapsulation;

public class Main {
    public static void main(String[] args) {
         BankAccount bankAccount = new BankAccount(1000, "001");
        // bankAccount.balance=-1000; // private- can't modify- result into an error, protecting direct access

        bankAccount.setBalance(5000);
        bankAccount.setActive(true);

         bankAccount.displayInfo();
         System.out.println(bankAccount.getBalance());

        
    }
   
}
