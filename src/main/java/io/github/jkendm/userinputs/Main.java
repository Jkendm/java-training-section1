package io.github.jkendm.userinputs;

import java.util.Scanner; // Import the Scanner class to read input

public class Main {
    public static void main(String[] args) {

        double balance = 0.0;

        //deposit
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input  

        System.out.println("Enter amount to deposit");
        double amountToDeposit = scanner.nextDouble(); // Read user input

        System.out.println("Amount to deposit = " + amountToDeposit);

         System.out.println("Enter withdrawal charges: ");
        double charges= scanner.nextDouble();
        System.out.println("Withdrawal charges = " + charges);

        scanner.nextLine(); // This is to clear the buffer

        System.out.println("Enter your name:");
        String name = scanner.nextLine(); // To read the string input
        System.out.println("Name: " +name);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); // To read integer input
        System.out.println("Age: " +age);

        //close the scanner
        scanner.close();
        
    
    }
    
}
