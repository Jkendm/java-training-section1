    /**
* Simple Console Calculator
* Student Name: Joy Kendi
* Date: 20th January 2026
* 
* Features:
* - Basic arithmetic operations
* - Continuous operation
* - Error handling for division by zero
* - Input validation
* 
* Bonus Features: [List any bonus features implemented]
*/
package io.github.jkendm.assignment;

import java.util.Scanner;

public class SimpleCalculator_JoyKendi {
    public static void main(String[] args) {
        // Implementation of the calculator goes here
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========Welcome to Simple Calculator===========");
       
        int choice;
        // Process choice here
        while (true) {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Thanks for visiting our Simple Calculator!");
                break;
            }
            
            // Prompt user for input , The two numbers and the operator
            System.out.println("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            int num2 = scanner.nextInt();
            
            double result;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = (double) num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid choice.");
            }
            System.out.println();
            
            // Ask if user wants to continue
            System.out.print("Do you want to continue? (y/n): ");
            char continueChoice = scanner.next().charAt(0);
            if (continueChoice == 'n' || continueChoice == 'N') {
                System.out.println("Thanks for visiting our Simple Calculator!");
                break;
            }
        }
        scanner.close();
    }

}
